---
title: PdfImageCompression enumeration
second_title: Aspose.Page for Python via .NET API References
description: 
type: docs
weight: 50
url: /python-net/aspose.page.xps.presentation.pdf/pdfimagecompression/
is_root: false
---

## PdfImageCompression enumeration

Specifies the type of compression applied to images in the PDF file.



The PdfImageCompression type exposes the following members:

### Fields
| Field | Description |
| :- | :- |
| AUTO | Automatically selects the most appropriate compression for each image. |
| NONE | Saves raw image bytes resulting in bigger PDF file sizes. |
| RLE | Run Length compression. |
| FLATE | Flate compression. |
| LZW_BASELINE_PREDICTOR | Predictor selection is restricted to PNG Paeth predictor to speed-up the process. In practice<br/>performs surprisingly good. Better than [`PdfImageCompression.LZW_OPTIMIZED_PREDICTOR`](/page/python-net/aspose.page.xps.presentation.pdf/pdfimagecompression#LZW_OPTIMIZED_PREDICTOR). |
| LZW_OPTIMIZED_PREDICTOR | Predictor selection is more complicated and should result in smaller image sizes but<br/>taking more time. |
| JPEG | JPEG compression.<br/>Does not support transparency. |



### See Also
* module [`aspose.page.xps.presentation.pdf`](..)
