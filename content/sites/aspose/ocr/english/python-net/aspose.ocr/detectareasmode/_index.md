---
title: DetectAreasMode
second_title: Aspose.OCR for Python via .NET API Reference
description: 
type: docs
weight: 340
url: /python-net/aspose.ocr/detectareasmode/
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
|TABLE|Detects tabular structures in the image and extracts text from individual cells. Recommended for scanned spreadsheets, reports, and other table-based documents.|
|CURVED_TEXT|Automatically straightens curved lines of text in the image, improving recognition accuracy and allowing more text to be recovered and extracted. Requires significant processing power and RAM.|
|TEXT_IN_WILD|A super-powerful neural network specialized in extracting words from low-quality images such as street photos, license plates, passport photos, meter photos, and photos with noisy backgrounds.|
|LEAN|Prioritizes speed and reduces resource consumption by omitting support for complex layouts. Suitable only for simple images with a few lines of text without illustrations or formatting.|
|MULTICOLUMN|Detects large blocks of text formatted in columns. The best choice for multi-column layouts such as book pages, articles, or contracts.|
|UNIVERSAL|Detects all blocks of text in the image, including sparse and irregular text on photos. A versatile option for most images, except for tables and multi-column layouts.|

### See Also

* namespace [aspose.ocr](/ocr/python-net/aspose.ocr/)
* assembly [Aspose.OCR](/ocr/python-net/)

