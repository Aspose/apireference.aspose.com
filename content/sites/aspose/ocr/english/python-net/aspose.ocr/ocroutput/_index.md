---
title: OcrOutput
second_title: Aspose.OCR for Python via .NET API Reference
description: 
type: docs
weight: 260
url: /python-net/aspose.ocr/ocroutput/
---

## OcrOutput class

A container class to store and manage the results of OCR operations.

The OcrOutput type exposes the following members:
## Constructors
| Name | Description |
| :- | :- |
|OcrOutput()|Initializes a new instance of the [OcrOutput](/ocr/python-net/aspose.ocr/ocroutput/) class with an empty collection.<br/>            This constructor calls the base class constructor to initialize an empty list of [RecognitionResult](/ocr/python-net/aspose.ocr/recognitionresult/).|
|OcrOutput(collection, input)|Initializes a new instance of the OcrOutput class|
|OcrOutput(capacity)|Initializes a new instance of the OcrOutput class|
## Methods
| Name | Description |
| :- | :- |
|save_pdf(full_file_name, embedded_font_path, optimize_pdf)|Save all recognition results into a searchable PDF file, with the original images set as the background.|
|save_pdf(full_file_name)|Save all recognition results into a searchable PDF file, with the original images set as the background.|
|save_pdf(stream)|Save all recognition results into an in-memory searchable PDF document, embedding the original images as the background.|
|save_pdf(stream, embedded_font_path, optimize_pdf)|Save all recognition results into an in-memory searchable PDF document, embedding the original images as the background.|
|save(full_file_name, save_format, embedded_font_path, optimize_pdf)|Save all recognition result to a file.|
|save(full_file_name, save_format)|Save all recognition result to a file.|
|save(stream, save_format)|Save all recognition results to a memory stream in the specified format.|
|save(stream, save_format, embedded_font_path, optimize_pdf)|Save all recognition results to a memory stream in the specified format.|
|add_range(collection)|Adds the elements of the specified collection to the end of the [OcrOutput](/ocr/python-net/aspose.ocr/ocroutput/) list.<br/>            This method overrides the default AddRange behavior to perform additional operations, if needed.|
|get_table_data()|Returns structured table data extracted from all recognized pages.<br/>            Useful if the entire page is one table.|

### See Also

* namespace [aspose.ocr](/ocr/python-net/aspose.ocr/)
* assembly [Aspose.ocr](/ocr/python-net/)

