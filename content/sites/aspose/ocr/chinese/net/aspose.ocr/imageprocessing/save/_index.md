---
title: 保存
second_title: Aspose.OCR 适用于 .NET API 参考
description: 使用图像处理来提高 OCR 的准确性。创建一个将在输入图像上按您指定顺序应用的过滤器列表。示例创建过滤器 PreprocessingFilter filters  new PreprocessingFilter  PreprocessingFilter.Invert PreprocessingFilter.Threshold150 PreprocessingFilter.Binarize PreprocessingFilter.Rotate180 PreprocessingFilter.Resize30003000 Aspose.OCR.Filters.InterpolationFilterType.Box PreprocessingFilter.Scale6f PreprocessingFilter.Dilate  您不需要全部。仅设置您需要的。
type: docs
weight: 20
url: /zh/net/aspose.ocr/imageprocessing/save/
---
## ImageProcessing.Save method

使用图像处理来提高 OCR 的准确性。创建一个过滤器列表，这些过滤器将按照您指定的顺序应用于输入图像。创建过滤器的示例： PreprocessingFilter filters = new PreprocessingFilter { PreprocessingFilter.Invert(), PreprocessingFilter.Threshold(150), PreprocessingFilter.Binarize(), PreprocessingFilter.Rotate(180), PreprocessingFilter.Resize(3000,3000, Aspose.OCR.Filters.InterpolationFilterType.Box), PreprocessingFilter.Scale(6f), PreprocessingFilter.Dilate() }; 您不需要全部过滤器。仅设置您需要的即可。

```csharp
public static OcrInput Save(OcrInput images, string folderPath)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| images | OcrInput | 包含不同图像的 OcrInput 对象 [`OcrInput`](../../ocrinput)。 |
| folderPath | String | 用于保存处理后图像的路径，不包含图像文件名。 |

### 返回值

包含处理后图像结果的 OcrInput 对象 [`OcrInput`](../../ocrinput)。

### 另请参见

* class [OcrInput](../../ocrinput)
* class [ImageProcessing](../../imageprocessing)
* namespace [Aspose.OCR](../../imageprocessing)
* assembly [Aspose.OCR](../../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
