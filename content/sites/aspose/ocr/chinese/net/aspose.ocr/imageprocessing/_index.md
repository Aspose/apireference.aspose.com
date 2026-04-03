---
title: 图像处理
second_title: Aspose.OCR 适用于 .NET API 参考
description: Aspose OCR 库的辅助类。允许对图像进行预处理并保存。
type: docs
weight: 300
url: /zh/net/aspose.ocr/imageprocessing/
---
## ImageProcessing class

Aspose OCR 库的辅助类。允许对图像进行预处理并保存。

```csharp
public static class ImageProcessing
```

## 方法

| 名称 | 描述 |
| --- | --- |
| static [Render](../../aspose.ocr/imageprocessing/render)(OcrInput) | 使用图像处理来提高 OCR 的准确性。创建一个过滤器列表，这些过滤器将按照您指定的顺序应用于输入图像。示例创建过滤器： PreprocessingFilter filters = new PreprocessingFilter { PreprocessingFilter.Invert(), PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f), PreprocessingFilter.Dilate() }; 您不需要全部。仅设置您需要的即可。 |
| static [Save](../../aspose.ocr/imageprocessing/save)(OcrInput, string) | 使用图像处理来提高 OCR 的准确性。创建一个过滤器列表，这些过滤器将按照您指定的顺序应用于输入图像。创建过滤器的示例： PreprocessingFilter filters = new PreprocessingFilter { PreprocessingFilter.Invert(), PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f), PreprocessingFilter.Dilate() }; 您不需要全部过滤器。仅设置您需要的即可。 |

### 另请参见

* namespace [Aspose.OCR](../../aspose.ocr)
* assembly [Aspose.OCR](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
