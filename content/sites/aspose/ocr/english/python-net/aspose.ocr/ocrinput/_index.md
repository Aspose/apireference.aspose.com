---
title: OcrInput
second_title: Aspose.OCR for Python via .NET API Reference
description: 
type: docs
weight: 240
url: /python-net/aspose.ocr/ocrinput/
---

## OcrInput class

Container to collect all images / documents for preprocessing / recognition.

The OcrInput type exposes the following members:
## Constructors
| Name | Description |
| :- | :- |
|OcrInput(type, filters)|Initializes a new instance of the OcrInput class|
|OcrInput(type)|Initializes a new instance of the OcrInput class|
## Indexer
| Name | Description |
| :- | :- |
|[index]|Returns information about processed / recognized image.|
## Methods
| Name | Description |
| :- | :- |
|add(full_path)|Add the path or URI containing the image for recognition / processing.<br/>            The type of the image must correspond to the type specified in the constructor.|
|add(stream)|Add the memory stream containing the image for recognition / processing.<br/>            The type of the image must correspond to the type specified in the constructor.|
|add(full_path, start_page, pages_count)|Add the multipage images / documents for recognition / processing.<br/>            The type of the image must correspond to the type specified in the constructor.|
|add(stream, start_page, pages_count)|Add the memory stream containing the multipage image for recognition / processing.<br/>            The type of the image must correspond to the type specified in the constructor.|
|add(arr, width, height, pixel_format)|Add the decoded image to the list for recognition / processing.<br/>            The type of the image must correspond to the type specified in the constructor (SingleImage).|
|replace_filters(filters)|Remove old filters and set new.|
|clear_filters()|Remove all filters.|
|add_base64(base64)|Add the base64 string containing the image for recognition / processing.<br/>            The type of the image must correspond to the type specified in the constructor.|
|clear()|Remove all filters.|
|count()|Amount of items for processing / recognition.|
|get_input_type()|Type of allowed images for recognition.|

### See Also

* namespace [aspose.ocr](/ocr/python-net/aspose.ocr/)
* assembly [Aspose.ocr](/ocr/python-net/)

