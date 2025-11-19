---
title: DetectAreasMode
second_title: Aspose.OCR for Python via .NET API Reference
description: 
type: docs
weight: 520
url: /python-net/aspose.ocr/detectareasmode/
---

## DetectAreasMode enumeration

Determines the type of neural network used for areas detection.

## Members
| Member name | Description |
| :- | :- |
|LEAN|Prioritizes speed and reduces resource consumption by omitting support for complex layouts. Suitable only for simple images with a few lines of text without illustrations or formatting.|
|MULTICOLUMN|Detects large blocks of text formatted in columns. The best choice for multi-column layouts such as book pages, articles, or contracts.|
|UNIVERSAL|Detects all blocks of text in the image, including sparse and irregular text on photos. A versatile option for most images, except for tables and multi-column layouts.|
|TABLE|Detects tabular structures in the image and extracts text from individual cells. Recommended for scanned spreadsheets, reports, and other table-based documents.|
|CURVED_TEXT|Automatically straightens curved lines of text in the image, improving recognition accuracy and allowing more text to be recovered and extracted. Requires significant processing power and RAM.|
|FORMULA||

### See Also

* namespace [aspose.ocr](/ocr/python-net/aspose.ocr/)
* assembly [Aspose.OCR](/ocr/python-net/)

