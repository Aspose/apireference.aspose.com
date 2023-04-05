---
title: Enum PdfImageCompression
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.XPS.Presentation.Pdf.PdfImageCompression 枚举. 指定应用于 PDF 文件中图像的压缩类型
type: docs
weight: 430
url: /zh/net/aspose.page.xps.presentation.pdf/pdfimagecompression/
---
## PdfImageCompression enumeration

指定应用于 PDF 文件中图像的压缩类型。

```csharp
public enum PdfImageCompression
```

### 价值观

| 姓名 | 价值 | 描述 |
| --- | --- | --- |
| Auto | `0` | 自动为每个图像选择最合适的压缩。 |
| None | `1` | 保存原始图像字节导致更大的 PDF 文件大小。 |
| Rle | `2` | 运行长度压缩。 |
| Flate | `3` | 平面压缩. |
| LzwBaselinePredictor | `4` | 预测器选择仅限于 PNG Paeth 预测器以加速该过程。在实践中 表现出奇的好。优于LzwOptimizedPredictor. |
| LzwOptimizedPredictor | `5` | 预测器选择更复杂，应该会导致图像尺寸更小，但 需要更多时间。 |
| Jpeg | `6` | JPEG 压缩。 不支持透明度。 |

### 也可以看看

* 命名空间 [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf/)
* 部件 [Aspose.Page](../../)


