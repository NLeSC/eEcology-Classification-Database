Actions that can be performed on eEcology classification DB schema
==================================================================

* Create segmenter
* Create manual classifier
  * Select segmenter
  * Create label schema
* Classify
  * Select classifier
  * Segment
  * Label segments
* Re-segment job, eg. per gps fix to acceleration windows
  * Select job (input segments/classifications)
  * Select segmenter
* Re-label job, creates new label schema with remap and new job classifications
* Register all java based features
* Create automatic classifier
  * Select label schema
  * Select segmenter
  * Create training/test/validation collection or set
  * Select features
* Compare classifications
