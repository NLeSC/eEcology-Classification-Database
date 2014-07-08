
/* Drop Tables */

DROP TABLE IF EXISTS classification.feature_value;
DROP TABLE IF EXISTS classification.feature_classifier;
DROP TABLE IF EXISTS classification.feature;
DROP TABLE IF EXISTS classification.classification_collection;
DROP TABLE IF EXISTS classification.job_selection;
DROP TABLE IF EXISTS classification.classification;
DROP TABLE IF EXISTS classification.job;
DROP TABLE IF EXISTS classification.classifier;
DROP TABLE IF EXISTS classification.collection;
DROP TABLE IF EXISTS classification.collection_group;
DROP TABLE IF EXISTS classification.label_remap;
DROP TABLE IF EXISTS classification.label;
DROP TABLE IF EXISTS classification.label_schema;
DROP TABLE IF EXISTS classification.acceleration;
DROP TABLE IF EXISTS classification.recording;
DROP TABLE IF EXISTS classification.segment;
DROP TABLE IF EXISTS classification.segmenter;
DROP TABLE IF EXISTS classification.classifier_type;



/* Create Tables */

CREATE TABLE classification.feature
(
	feature_id serial NOT NULL,
	name varchar(255) NOT NULL,
	version int DEFAULT 1 NOT NULL,
	-- Implemented in Java or as expression
	source varchar(100) NOT NULL,
	-- Filled when source = expression 
	expression text,
	created_by varchar(100) NOT NULL,
	created_on timestamp NOT NULL,
	PRIMARY KEY (feature_id)
) WITHOUT OIDS;


CREATE TABLE classification.collection_group
(
	collection_group_id serial NOT NULL,
	name varchar(255) NOT NULL,
	-- Description how training, test, validation sets where build
	description text,
	created_by varchar(100) NOT NULL,
	created_on timestamp NOT NULL,
	PRIMARY KEY (collection_group_id)
) WITHOUT OIDS;


CREATE TABLE classification.feature_classifier
(
	feature_id int NOT NULL,
	classifier_id int NOT NULL,
	PRIMARY KEY (feature_id, classifier_id)
) WITHOUT OIDS;


CREATE TABLE classification.label_schema
(
	label_schema_id serial NOT NULL,
	name varchar(255) NOT NULL,
	created_by varchar(100) NOT NULL,
	created_on timestamp NOT NULL,
	PRIMARY KEY (label_schema_id)
) WITHOUT OIDS;


CREATE TABLE classification.segment
(
	segment_id serial NOT NULL,
	segmenter_id int NOT NULL,
	PRIMARY KEY (segment_id)
) WITHOUT OIDS;


CREATE TABLE classification.classification_collection
(
	collection_id int NOT NULL,
	job_id int NOT NULL,
	segment_id int NOT NULL,
	PRIMARY KEY (collection_id, segment_id)
) WITHOUT OIDS;


CREATE TABLE classification.collection
(
	collection_id serial NOT NULL,
	-- Training, Test or Validation 
	type varchar(100) DEFAULT 'Training' NOT NULL,
	collection_group_id int NOT NULL,
	PRIMARY KEY (collection_id),
	CONSTRAINT set_u UNIQUE (type, collection_group_id)
) WITHOUT OIDS;


CREATE TABLE classification.acceleration
(
	segment_id int NOT NULL,
	date_time timestamp NOT NULL,
	device_info_serial int NOT NULL,
	index smallint NOT NULL,
	PRIMARY KEY (segment_id, date_time, device_info_serial, index)
) WITHOUT OIDS;


CREATE TABLE classification.classification
(
	job_id int NOT NULL,
	segment_id int NOT NULL,
	label_id int NOT NULL,
	label_schema_id int NOT NULL,
	PRIMARY KEY (job_id, segment_id)
) WITHOUT OIDS;


CREATE TABLE classification.feature_value
(
	feature_id int NOT NULL,
	segment_id int NOT NULL,
	attribute_value double precision NOT NULL,
	PRIMARY KEY (feature_id, segment_id)
) WITHOUT OIDS;


CREATE TABLE classification.label_remap
(
	source_label_id int NOT NULL,
	source_label_schema_id int NOT NULL,
	target_label_id int NOT NULL,
	target_label_schema_id int NOT NULL,
	PRIMARY KEY (target_label_id, target_label_schema_id)
) WITHOUT OIDS;


CREATE TABLE classification.label
(
	label_id int NOT NULL,
	label_schema_id int NOT NULL,
	name varchar(100) NOT NULL,
	red smallint NOT NULL,
	green smallint NOT NULL,
	blue smallint NOT NULL,
	description text,
	PRIMARY KEY (label_id, label_schema_id)
) WITHOUT OIDS;


CREATE TABLE classification.segmenter
(
	segmenter_id serial NOT NULL,
	name varchar(255) NOT NULL UNIQUE,
	configuration text,
	PRIMARY KEY (segmenter_id)
) WITHOUT OIDS;


CREATE TABLE classification.job
(
	job_id serial NOT NULL,
	classifier_id int NOT NULL,
	parent_job_id int,
	is_public boolean,
	created_on timestamp NOT NULL,
	created_by varchar(100) NOT NULL,
	id bigint NOT NULL,
	PRIMARY KEY (job_id)
) WITHOUT OIDS;


-- Classifier is manual or automated aka implemented in weka or a resegmentation or label remapping.
CREATE TABLE classification.classifier_type
(
	class_type_id serial NOT NULL,
	name varchar(100) NOT NULL UNIQUE,
	PRIMARY KEY (class_type_id)
) WITHOUT OIDS;


CREATE TABLE classification.classifier
(
	classifier_id serial NOT NULL,
	name varchar(255) NOT NULL,
	class_type_id int NOT NULL,
	label_schema_id int NOT NULL,
	segmenter_id int NOT NULL,
	training_set_id int,
	parent_classifier_id int,
	weka_object bytea,
	description text,
	created_on timestamp NOT NULL,
	created_by varchar(100) NOT NULL,
	PRIMARY KEY (classifier_id)
) WITHOUT OIDS;


CREATE TABLE classification.job_selection
(
	job_id int NOT NULL,
	device_info_serial int NOT NULL,
	start_date_time timestamp NOT NULL,
	end_date_time timestamp NOT NULL,
	PRIMARY KEY (job_id, device_info_serial, start_date_time, end_date_time)
) WITHOUT OIDS;


CREATE TABLE classification.recording
(
	segment_id int NOT NULL,
	date_time timestamp NOT NULL,
	device_info_serial int NOT NULL,
	PRIMARY KEY (segment_id, date_time, device_info_serial)
) WITHOUT OIDS;

/* Create Foreign Keys */

ALTER TABLE classification.feature_value
	ADD FOREIGN KEY (feature_id)
	REFERENCES classification.feature (feature_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE classification.feature_classifier
	ADD FOREIGN KEY (feature_id)
	REFERENCES classification.feature (feature_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE classification.collection
	ADD FOREIGN KEY (collection_group_id)
	REFERENCES classification.collection_group (collection_group_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE classification.classifier
	ADD FOREIGN KEY (label_schema_id)
	REFERENCES classification.label_schema (label_schema_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE classification.label
	ADD CONSTRAINT belongs FOREIGN KEY (label_schema_id)
	REFERENCES classification.label_schema (label_schema_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE classification.feature_value
	ADD FOREIGN KEY (segment_id)
	REFERENCES classification.segment (segment_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE classification.classification
	ADD FOREIGN KEY (segment_id)
	REFERENCES classification.segment (segment_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE classification.recording
	ADD FOREIGN KEY (segment_id)
	REFERENCES classification.segment (segment_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE classification.classification_collection
	ADD FOREIGN KEY (collection_id)
	REFERENCES classification.collection (collection_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE classification.classifier
	ADD FOREIGN KEY (training_set_id)
	REFERENCES classification.collection (collection_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE classification.classification_collection
	ADD FOREIGN KEY (job_id, segment_id)
	REFERENCES classification.classification (job_id, segment_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE classification.classification
	ADD FOREIGN KEY (label_id, label_schema_id)
	REFERENCES classification.label (label_id, label_schema_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE classification.label_remap
	ADD FOREIGN KEY (target_label_id, target_label_schema_id)
	REFERENCES classification.label (label_id, label_schema_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE classification.label_remap
	ADD FOREIGN KEY (source_label_id, source_label_schema_id)
	REFERENCES classification.label (label_id, label_schema_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE classification.classifier
	ADD FOREIGN KEY (segmenter_id)
	REFERENCES classification.segmenter (segmenter_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE classification.segment
	ADD FOREIGN KEY (segmenter_id)
	REFERENCES classification.segmenter (segmenter_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE classification.job_selection
	ADD FOREIGN KEY (job_id)
	REFERENCES classification.job (job_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE classification.job
	ADD FOREIGN KEY (parent_job_id)
	REFERENCES classification.job (job_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE classification.classification
	ADD FOREIGN KEY (job_id)
	REFERENCES classification.job (job_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE classification.classifier
	ADD FOREIGN KEY (class_type_id)
	REFERENCES classification.classifier_type (class_type_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE classification.job
	ADD FOREIGN KEY (classifier_id)
	REFERENCES classification.classifier (classifier_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE classification.feature_classifier
	ADD FOREIGN KEY (classifier_id)
	REFERENCES classification.classifier (classifier_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE classification.classifier
	ADD FOREIGN KEY (parent_classifier_id)
	REFERENCES classification.classifier (classifier_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE classification.acceleration
	ADD FOREIGN KEY (segment_id, date_time, device_info_serial)
	REFERENCES classification.recording (segment_id, date_time, device_info_serial)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;

/* Enable when migration is complete
ALTER TABLE classification.job
	ADD FOREIGN KEY (id)
	REFERENCES admin.ee_project (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;
*/

ALTER TABLE classification.recording
	ADD FOREIGN KEY (date_time, device_info_serial)
	REFERENCES gps.uva_tracking_data101 (date_time, device_info_serial)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;

/* Added foreign key manually, as ermaster doesnt allow it */
ALTER TABLE classification.acceleration
	ADD FOREIGN KEY (date_time, device_info_serial, index)
	REFERENCES gps.uva_acceleration101 (date_time, device_info_serial, index)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


/* Comments */

COMMENT ON COLUMN classification.feature.source IS 'Implemented in Java or as expression';
COMMENT ON COLUMN classification.feature.expression IS 'Filled when source = expression ';
COMMENT ON COLUMN classification.collection_group.description IS 'Description how training, test, validation sets where build';
COMMENT ON COLUMN classification.collection.type IS 'Training, Test or Validation ';
COMMENT ON TABLE classification.classifier_type IS 'Classifier is manual or automated aka implemented in weka or a resegmentation or label remapping.';



