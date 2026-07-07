---
title: DocTypeOutput
second_title: Aspose.OCR for Python via .NET API Reference
description: 
type: docs
weight: 100
url: /python-net/aspose.ocr/doctypeoutput/
---

## DocTypeOutput class

Represents the document type detection result for a single input item.

The DocTypeOutput type exposes the following members:
## Constructors
| Name | Description |
| :- | :- |
|DocTypeOutput()|Initializes a new instance of the DocTypeOutput class|
## Properties
| Name | Description |
| :- | :- |
|source|Input source identifier (file path or URL when available).<br/>            Empty for in-memory inputs (stream, byte array, or Base64).|
|page|Zero-based page index for multi-page inputs.<br/>            For single-page inputs, the value is usually 0.|
|doc_type|Detected document category.|
|confidence|Confidence score of the detected document type in the range from 0.0 to 1.0.<br/>            Higher values indicate greater confidence.|

### See Also

* namespace [aspose.ocr](/ocr/python-net/aspose.ocr/)
* assembly [Aspose.ocr](/ocr/python-net/)

