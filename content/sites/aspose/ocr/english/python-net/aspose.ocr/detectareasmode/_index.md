---
title: DetectAreasMode
second_title: Aspose.OCR for Python via .NET API Reference
description: 
type: docs
weight: 290
url: /ocr/python-net/aspose.ocr/detectareasmode/
---

## DetectAreasMode enumeration

Determines the type of neural network used for areas detection.

## Members
| Member name | Description |
| :- | :- |
|NONE|Doesn't detect paragraphs.<br/>            Better for a simple one-column document without pictures.|
|DOCUMENT|Detects paragraphs uses NN model for documents. <br/>            Better for multicolumn document, document with pictures or with other not text objects.|
|PHOTO|Detects paragraphs uses NN model for photos. <br/>            Better for image with a lot of pictures and other not text objects.|
|COMBINE|Detects paragraphs with text and then uses other NN model to detect areas inside of paragraphs.<br/>            Better for images with complex structure.|
|TABLE|Detects cells with text.<br/>            Preferable mode for images with table structure.|
|CURVED_TEXT|Detects lines and recognizes text on curved images.<br/>            Preferred mode for photos of book and magazine pages.|

### See Also

* namespace [aspose.ocr](/ocr/python-net/aspose.ocr/)
* assembly [Aspose.OCR](/ocr/python-net/)

