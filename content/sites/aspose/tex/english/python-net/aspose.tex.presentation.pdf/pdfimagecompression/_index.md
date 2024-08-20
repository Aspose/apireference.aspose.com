---
title: PdfImageCompression enumeration
second_title: Aspose.TeX for Python via .NET API Reference
description: 
type: docs
weight: 50
url: /tex/python-net/aspose.tex.presentation.pdf/pdfimagecompression/
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
| `LZW_BASELINE_PREDICTOR` | Predictor selection is restricted to PNG Paeth predictor to speed-up the process. In practice<br/>            performs surprisingly good. Better than [LZW_OPTIMIZED_PREDICTOR](/tex/python-net/aspose.tex.presentation.pdf/pdfimagecompression/). |
| `LZW_OPTIMIZED_PREDICTOR` | Predictor selection is more complicated and should result in smaller image sizes but<br/>            taking more time. |
| `JPEG` | JPEG compression.<br/>            Does not support transparency. |

### See Also

* module [`aspose.tex.presentation.pdf`](/tex/python-net/aspose.tex.presentation.pdf/)
* package [`aspose.tex`](/tex/python-net/)

