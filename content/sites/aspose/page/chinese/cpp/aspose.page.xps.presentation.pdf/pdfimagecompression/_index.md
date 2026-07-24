---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression 枚举"
linktitle: "PdfImageCompression"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression 枚举。指定在 C++ 中对 PDF 文件中的图像应用的压缩类型。"
type: docs
weight: 700
url: /zh/cpp/aspose.page.xps.presentation.pdf/pdfimagecompression/
---
## PdfImageCompression enum


指定 PDF 文件中图像使用的压缩类型。

```cpp
enum class PdfImageCompression
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| 自动 | 0 | 自动为每个图像选择最合适的压缩方式。 |
| None | 1 | 保存原始图像字节，会导致 PDF 文件体积增大。 |
| Rle | 2 | 行程长度压缩。 |
| Flate | 3 | Flate 压缩。 |
| LzwBaselinePredictor | 4 | 预测器选择被限制为 PNG Paeth 预测器，以加快处理速度。实际效果出奇地好。优于 [LzwOptimizedPredictor](./)。 |
| LzwOptimizedPredictor | 5 | 预测器选择更为复杂，应该会产生更小的图像尺寸，但需要更多时间。 |
| Jpeg | 6 | JPEG 压缩。不支持透明度。 |

## 另见

* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
