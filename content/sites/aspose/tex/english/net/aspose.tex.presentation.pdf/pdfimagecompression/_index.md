---
title: Enum PdfImageCompression
second_title: Aspose.TeX for .NET API Reference
description: Aspose.TeX.Presentation.Pdf.PdfImageCompression enum. Specifies the type of compression applied to images in the PDF file
type: docs
weight: 730
url: /net/aspose.tex.presentation.pdf/pdfimagecompression/
---
## PdfImageCompression enumeration

Specifies the type of compression applied to images in the PDF file.

```csharp
public enum PdfImageCompression
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Auto | `0` | Automatically selects the most appropriate compression for each image. |
| None | `1` | Saves raw image bytes resulting in bigger PDF file sizes. |
| Rle | `2` | Run Length compression. |
| Flate | `3` | Flate compression. |
| LzwBaselinePredictor | `4` | Predictor selection is restricted to PNG Paeth predictor to speed-up the process. In practice performs surprisingly good. Better than LzwOptimizedPredictor. |
| LzwOptimizedPredictor | `5` | Predictor selection is more complicated and should result in smaller image sizes but taking more time. |
| Jpeg | `6` | JPEG compression. Does not support transparency. |

### See Also

* namespace [Aspose.TeX.Presentation.Pdf](../../aspose.tex.presentation.pdf/)
* assembly [Aspose.TeX](../../)


