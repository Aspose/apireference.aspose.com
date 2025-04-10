---
title: RecognitionSettings
second_title: Aspose.OCR for Python via .NET API Reference
description: 
type: docs
weight: 270
url: /python-net/aspose.ocr/recognitionsettings/
---

## RecognitionSettings class

Settings for the image recognition.<br/>            Contains elements that allow customizing the recognition process.

The RecognitionSettings type exposes the following members:
## Constructors
| Name | Description |
| :- | :- |
|RecognitionSettings()|Initializes a new instance of the|
|RecognitionSettings(language, recognition_areas, recognize_single_line)|Initializes a new instance of the RecognitionSettings class|
## Properties
| Name | Description |
| :- | :- |
|threads_count|Gets or sets the number fo threads for processing.|
|language|Gets or sets the language used for OCR.|
|language_detection_level|  |
|ignored_symbols|Sets blacklist for recognition symbols.|
|allowed_symbols|Set the allowed characters with alphabet property.|
|lines_filtration|Allows to recognize text in the tables (regions surrounded lines).|
|allowed_characters|Allowed characters set. Determines the type of characters allowed for recognition result.|
|detect_areas_mode|Allows to select the optimal mode for document type areas: document, photo, plain text, column, image.|
|automatic_color_inversion|Detect images with white text on dark/black background and automatically choose a special OCR algorithm for them.|
|upscale_small_font|Allows you to use additional algorithms specifically for small font recognition.<br/>            Useful for images with small size characters.|
|recognition_areas|Gets or sets the list of text areas for processing.|
|recognize_single_line|Sets single-line image recognition. <br/>            Disabled (false) by default. <br/>            Disable all the processing steps associated with splitting into lines. <br/>            Set this parameter to true if your image contains only one line. Disables RecognitionAreas settings, so all areas settings will be ignored.|

### See Also

* namespace [aspose.ocr](/ocr/python-net/aspose.ocr/)
* assembly [Aspose.ocr](/ocr/python-net/)

