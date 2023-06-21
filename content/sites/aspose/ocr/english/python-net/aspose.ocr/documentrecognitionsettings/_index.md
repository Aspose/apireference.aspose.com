---
title: DocumentRecognitionSettings
second_title: Aspose.OCR for Python via .NET API Reference
description: 
type: docs
weight: 60
url: /python-net/aspose.ocr/documentrecognitionsettings/
---

## DocumentRecognitionSettings class

Settings for the pdf recognition.<br/>            Contains elements that allow customizing the recognition process.

The DocumentRecognitionSettings type exposes the following members:
## Constructors
| Name | Description |
| :- | :- |
|DocumentRecognitionSettings(start_page, pages_number)|Initializes a new instance of the DocumentRecognitionSettings class|
|DocumentRecognitionSettings(start_page, pages_number, language, detect_areas, auto_skew, threshold)|Initializes a new instance of the DocumentRecognitionSettings class|
## Properties
| Name | Description |
| :- | :- |
|ignored_symbols|Sets blacklist for recognition symbols.|
|ignored_characters|Sets blacklist for recognition symbols.|
|allowed_symbols|Set the allowed characters with alphabet property.|
|lines_filtration|Allows to recognize text in the tables (regions surrounded lines).|
|preprocessing_filters|Allows to prepare the image for OCR by adjusting pre-processing methods.|
|auto_contrast|Allows using an additional contrast correction algorithm for the image before recognition.|
|allowed_characters|Allowed characters set. Determines the type of characters allowed for recognition result.|
|detect_areas_mode|Allows to select the optimal mode for document type areas: document, photo, plain text, column, image.|
|auto_denoising|Enables the use of an additional neural network to improve the image - reduce noise.<br/>            Useful for images with scan artifacts, distortion, spots, flares, gradients, foreign elements.|
|upscale_small_font|Allows you to use additional algorithms specifically for small font recognition.<br/>            Useful for images with small size characters.|
|start_page|Set the first page for recognition.|
|pages_number|Set the number of pages for recognition multipage pdf file.|

### See Also

* namespace [aspose.ocr](/ocr/python-net/aspose.ocr/)
* assembly [Aspose.ocr](/ocr/python-net/)

