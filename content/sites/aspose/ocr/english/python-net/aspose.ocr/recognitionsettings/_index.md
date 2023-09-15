---
title: RecognitionSettings
second_title: Aspose.OCR for Python via .NET API Reference
description: 
type: docs
weight: 190
url: /python-net/aspose.ocr/recognitionsettings/
---

## RecognitionSettings class

Settings for the image recognition.<br/>            Contains elements that allow customizing the recognition process.

The RecognitionSettings type exposes the following members:
## Constructors
| Name | Description |
| :- | :- |
|RecognitionSettings()|Initializes a new instance of the|
|RecognitionSettings(auto_skew)|Initializes a new instance of the RecognitionSettings class|
## Properties
| Name | Description |
| :- | :- |
|threads_count|Gets or sets the number fo threads for processing. By default, 0 means that the image will be processed with the number of threads equal to your number of processors. ThreadsCount = 1 means that the image will be processed in the main thread.|
|auto_skew|Gets or sets a flag indicating whether automatic image skew correction should be enabled. Enabled (true) by default.|
|skew_angle|Gets or sets angle in degrees for image rotation.|
|language|Gets or sets the language used for OCR. Determines the alphabet used during recognition. Multi-language by default.|
|threshold_value|Gets or sets custom threshold value for image binarization. Range from 1 to 255.|
|ignored_symbols|Sets blacklist for recognition symbols.|
|ignored_characters|Sets blacklist for recognition symbols.|
|allowed_symbols|Set the allowed characters with alphabet property.|
|lines_filtration|Allows to recognize text in the tables (regions surrounded lines).|
|preprocessing_filters|Allows to prepare the image for OCR by adjusting pre-processing methods.|
|auto_contrast|Allows using an additional contrast correction algorithm for the image before recognition.|
|allowed_characters|Allowed characters set. Determines the type of characters allowed for recognition result.|
|detect_areas_mode|Allows to select the optimal mode for document type areas: document, photo, plain text, column, image.|
|auto_denoising|Enables the use of an additional neural network to improve the image - reduce noise.<br/>            Useful for images with scan artifacts, distortion, spots, flares, gradients, foreign elements.|
|automatic_color_inversion|Detect images with white text on dark/black background and automatically choose a special OCR algorithm for them.|
|upscale_small_font|Allows you to use additional algorithms specifically for small font recognition.<br/>            Useful for images with small size characters.|

### See Also

* namespace [aspose.ocr](/ocr/python-net/aspose.ocr/)
* assembly [Aspose.ocr](/ocr/python-net/)

