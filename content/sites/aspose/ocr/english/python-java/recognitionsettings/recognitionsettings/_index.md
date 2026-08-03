---
title: "RecognitionSettings Class"
linktitle: "RecognitionSettings"
articleTitle: "RecognitionSettings"
second_title: "Aspose.OCR for Python via Java"
description: "Settings for the image recognition. Contains elements that allow customizing the recognition process."
type: docs
weight: 10
url: /python-java/recognitionsettings/recognitionsettings/
---

## RecognitionSettings class

**Module:** `recognitionsettings`


Settings for the image recognition. Contains elements that allow customizing the recognition process.


## Constructors

| Name | Description |
| --- | --- |
| [__init__](./recognitionsettings/) | Default constructor: set recognitionAreas null, linesFiltration false, autoSkew false, recognizeSingleLine false. |

## Methods

| Name | Return Type | Static | Description |
| --- | --- | --- | --- |
| [set_allowed_characters](./set_allowed_characters/) |  | No | Allowed characters set. Determines the array of characters allowed for recognition result. |
| [set_automatic_color_inversion](./set_automatic_color_inversion/) |  | No | Detect images with white text on dark/black background and automatically choose a special OCR algorithm for them. |
| [set_detect_areas_mode](./set_detect_areas_mode/) |  | No | Determines the type of neural network used for areas detection. |
| [set_ignored_characters](./set_ignored_characters/) |  | No | Sets blacklist for recognition symbols. |
| [set_language](./set_language/) |  | No | Sets the language used for OCR. Multi-language (none) by default. |
| [set_recognize_single_line](./set_recognize_single_line/) |  | No | Sets single-line image recognition. Disabled (false) by default. Disable all the processing steps associated with splitting into lines. Set this parameter to true if your image contains only one line. Disables set_recognition_areas settings, so all areas settings will be ignored. |
| [set_threads_count](./set_threads_count/) |  | No | Gets or sets the number of threads for processing. By default, 0 means that the image will be processed with the number of threads equal to your number of processors. ThreadsCount = 1 means that the image will be processed in the main thread. |
| [set_upscale_small_font](./set_upscale_small_font/) |  | No | Allows you to use additional algorithms specifically for small font recognition. Useful for images with small size characters. |

## Fields

| Name | Value | Description |
| --- | --- | --- |
| [JAVA_CLASS_NAME](./java_class_name/) | `"com.aspose.ocr.RecognitionSettings"` |  |
