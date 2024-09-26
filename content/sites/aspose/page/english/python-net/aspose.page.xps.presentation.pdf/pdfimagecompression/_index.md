---
title: PdfImageCompression enumeration
second_title: Aspose.Page for Python via .NET API Reference
description: 
type: docs
weight: 40
url: /python-net/aspose.page.xps.presentation.pdf/pdfimagecompression/
---

## PdfImageCompression enumeration

Specifies the type of compression applied to images in the PDF file.

## Members
| Member name | Description |
| :- | :- |
| `AUTO` | Automatically selects the most appropriate compression for each image. |
| `NONE` | Saves raw image bytes resulting in bigger PDF file sizes. |
| `RLE` | Run Length compression. |
| `FLATE` | Flate compression. |
| `LZW_BASELINE_PREDICTOR` | Predictor selection is restricted to PNG Paeth predictor to speed-up the process. In practice<br/>            performs surprisingly good. Better than [LZW_OPTIMIZED_PREDICTOR](/page/python-net/aspose.page.xps.presentation.pdf/pdfimagecompression/). |
| `LZW_OPTIMIZED_PREDICTOR` | Predictor selection is more complicated and should result in smaller image sizes but<br/>            taking more time. |
| `JPEG` | JPEG compression.<br/>            Does not support transparency. |

### See Also

* module [`aspose.page.xps.presentation.pdf`](/page/python-net/aspose.page.xps.presentation.pdf/)
* package [`aspose.page`](/page/python-net/)

