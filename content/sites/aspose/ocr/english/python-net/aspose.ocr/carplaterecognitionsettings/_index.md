---
title: CarPlateRecognitionSettings
second_title: Aspose.OCR for Python via .NET API Reference
description: 
type: docs
weight: 30
url: /python-net/aspose.ocr/carplaterecognitionsettings/
---

## CarPlateRecognitionSettings class

Settings for the car number recognition.<br/>            Contains elements that allow customizing the recognition process.

The CarPlateRecognitionSettings type exposes the following members:
## Constructors
| Name | Description |
| :- | :- |
|CarPlateRecognitionSettings(language)|Initializes a new instance of the CarPlateRecognitionSettings class|
|CarPlateRecognitionSettings()|Initializes a new instance of the|
## Properties
| Name | Description |
| :- | :- |
|threads_count|Gets or sets the number fo threads for processing. By default, 0 means that the image will be processed with the number of threads equal to your number of processors. ThreadsCount = 1 means that the image will be processed in the main thread.|
|language|Gets or sets the language used for OCR. Determines the alphabet used during recognition. Multi-language by default.|
|automatic_color_inversion|Detect images with white text on dark/black background and automatically choose a special OCR algorithm for them.|
|ignored_symbols|Sets blacklist for recognition symbols.|
|allowed_symbols|Set the allowed characters with alphabet property.|
|ignored_characters|Sets blacklist for recognition symbols.|
|preprocessing_filters|Allows to prepare the image for OCR by adjusting pre-processing methods.|
|allowed_characters|Allowed characters set. Determines the type of characters allowed for recognition result.|

### See Also

* namespace [aspose.ocr](/ocr/python-net/aspose.ocr/)
* assembly [Aspose.ocr](/ocr/python-net/)

