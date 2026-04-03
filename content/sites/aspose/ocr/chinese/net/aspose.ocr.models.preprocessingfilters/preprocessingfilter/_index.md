---
title: PreprocessingFilter
second_title: Aspose.OCR 适用于 .NET API 参考
description: 图像处理命令的基类。
type: docs
weight: 520
url: /zh/net/aspose.ocr.models.preprocessingfilters/preprocessingfilter/
---
## PreprocessingFilter class

图像处理命令的基类。

图像处理命令的基类。

```csharp
public class PreprocessingFilter : IEnumerable
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [PreprocessingFilter](preprocessingfilter)() | 默认构造函数。 |

## 属性

| 名称 | 描述 |
| --- | --- |
| static [Default](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/default) { get; } | 默认过滤器集合包含 AutoSkew 过滤器 |
| static [Empty](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/empty) { get; } | 空过滤器集合 |

## 方法

| 名称 | 描述 |
| --- | --- |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising#autodenoising)() | 启用额外的神经网络以提升图像——降低噪声。适用于带有扫描伪影、失真、斑点、耀光、渐变或异物的图像。 |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising#autodenoising_1)(Rectangle) | 启用额外神经网络以改进图像部分——降低噪声。适用于带有扫描伪影、失真、斑点、耀光、渐变、外来元素的图像。 |
| static [AutoDewarping](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodewarping)() | 自动校正图像中的几何失真。资源消耗极大！ |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew#autoskew)() | 启用自动图像倾斜校正。 |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew#autoskew_1)(Rectangle) | 启用图像部分的自动倾斜校正。 |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize#binarize)() | 将图像转换为黑白图像。二值图像是像素仅具有两种可能强度值的图像。它们通常显示为黑白。数值上，这两个值通常为黑色的 0 和白色的 255。二值图像是通过对图像进行自动阈值处理生成的。 |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize#binarize_1)(Rectangle) | 将图像的一部分转换为黑白图像。二值图像是像素仅具有两种可能强度值的图像。它们通常显示为黑白。数值上，这两个值通常为黑色的 0 和白色的 255。二值图像是通过对图像进行自动阈值处理生成的。 |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter#contrastcorrectionfilter)() | 对比度校正过滤器。 |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter#contrastcorrectionfilter_1)(Rectangle) | 图像部分的对比度校正过滤器。 |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate#dilate)() | 膨胀会向图像中对象的边界添加像素。 |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate#dilate_1)(Rectangle) | 膨胀会向图像部分中对象的边界添加像素。 |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert#invert)() | 自动反转文档图像的颜色。 |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert#invert_1)(Rectangle) | 自动反转图像部分的颜色。 |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median#median)() | 中值滤波器遍历图像的每个元素，并用相邻像素的中值替换每个像素。 |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median#median_1)(Rectangle) | 中值滤波器遍历图像部分的每个元素，并用相邻像素的中值替换每个像素。 |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize#resize)(int, int) | 重新缩放图像——放大或缩小图像分辨率。InterpolationFilterType = Lanczos8 |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize#resize_1)(int, int, InterpolationFilterType) | 重新缩放图像——放大或缩小图像分辨率。 |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate#rotate)(float) | 旋转原始图像。 |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate#rotate_1)(float, Rectangle) | 旋转图像的一部分。 |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale#scale)(float) | 重新缩放图像——放大或缩小图像分辨率。InterpolationFilterType = Lanczos8 |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale#scale_1)(float, InterpolationFilterType) | 重新缩放图像——放大或缩小图像分辨率。 |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold#threshold)(int) | 基于对原始图像像素强度设置阈值来创建二值图像。 |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold#threshold_1)(int, Rectangle) | 基于对原始图像部分像素强度设置阈值，创建图像的二值部分。 |
| static [ToGrayscale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/tograyscale)() | 将图像转换为灰度图像。灰度图像在图像中具有 256 级亮度（0 到 255）。 |
| [Add](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/add)(PreprocessingFilter) | 将新过滤器添加到集合中，以进一步运行所有操作。集合的一致性很重要。 |
| [GetEnumerator](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/getenumerator)() | 用于 IEnumarable 接口的实现。 |

### 另请参见

* namespace [Aspose.OCR.Models.PreprocessingFilters](../../aspose.ocr.models.preprocessingfilters)
* assembly [Aspose.OCR](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
