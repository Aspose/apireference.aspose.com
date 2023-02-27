---
title: Class PreprocessingFilter
second_title: Aspose.OCR for .NET API 参考
description: Aspose.OCR.Models.PreprocessingFilters.PreprocessingFilter 班级. 图像处理命令的基类
type: docs
weight: 170
url: /zh/net/aspose.ocr.models.preprocessingfilters/preprocessingfilter/
---
## PreprocessingFilter class

图像处理命令的基类。

图像处理命令的基类。

```csharp
public class PreprocessingFilter : IEnumerable
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [PreprocessingFilter](preprocessingfilter/)() | 默认构造函数。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising)() | 允许使用额外的神经网络来改善图像 - 减少噪声。 适用于具有扫描伪影、失真、斑点、光斑、渐变、外来元素的图像。 |
| static [AutoDenoising](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodenoising/#autodenoising_1)(Rectangle) | 允许使用额外的神经网络来改善图像部分 - 减少噪声。 适用于具有扫描伪影、失真、斑点、光斑、渐变、外来元素的图像。 |
| static [AutoDewarping](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autodewarping/)() | 自动校正图像中的几何失真。 极其耗费资源！ |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew)() | 启用自动图像倾斜校正。 |
| static [AutoSkew](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/autoskew/#autoskew_1)(Rectangle) | 启用自动图像部分倾斜校正。 |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize)() | 将图像转换为黑白图像。 二值图像是其像素只有两个可能的强度值的图像。 它们通常显示为黑色和白色。在数字上，这两个值通常为黑色为 0，白色为 255。 二进制图像是通过对图像进行自动阈值处理而生成的。 |
| static [Binarize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/binarize/#binarize_1)(Rectangle) | 将图像的一部分转换为黑白图像。 二值图像是其像素只有两个可能的强度值的图像。 它们通常显示为黑色和白色。在数字上，这两个值通常为黑色为 0，白色为 255。 二进制图像是通过对图像进行自动阈值处理而生成的。 |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter)() | 对比度校正滤镜. |
| static [ContrastCorrectionFilter](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/contrastcorrectionfilter/#contrastcorrectionfilter_1)(Rectangle) | 图像部分的对比度校正滤镜。 |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate)() | 膨胀将像素添加到图像中对象的边界。 |
| static [Dilate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/dilate/#dilate_1)(Rectangle) | 膨胀将像素添加到图像的一部分中的对象边界。 |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert)() | 自动反转文档图像中的颜色。 |
| static [Invert](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/invert/#invert_1)(Rectangle) | 自动反转图像一部分的颜色。 |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median)() | 中值滤波器遍历图像的每个元素，并用其相邻像素的中值替换每个像素。 |
| static [Median](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/median/#median_1)(Rectangle) | 中值滤波器遍历图像部分的每个元素，并用其相邻像素的中值替换每个像素。 |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize)(int, int) | Rescale image - 放大或缩小图像分辨率。 InterpolationFilterType = Lanczos8 |
| static [Resize](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/resize/#resize_1)(int, int, InterpolationFilterType) | Rescale image - 放大或缩小图像分辨率。 |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate)(float) | 旋转原始图像. |
| static [Rotate](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/rotate/#rotate_1)(float, Rectangle) | 旋转图像的一部分。 |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale)(float) | Rescale image - 放大或缩小图像分辨率。 InterpolationFilterType = Lanczos8 |
| static [Scale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/scale/#scale_1)(float, InterpolationFilterType) | Rescale image - 放大或缩小图像分辨率。 |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold)(int) | 根据对原始图像的像素强度设置阈值来创建二值图像。 |
| static [Threshold](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/threshold/#threshold_1)(int, Rectangle) | 根据对原始图像部分的像素强度设置阈值来创建图像的二进制部分。 |
| static [ToGrayscale](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/tograyscale/)() | 将图像转换为灰度图像。 灰度图像在图像中有 256 级光（0 到 255）。 |
| [Add](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/add/)(PreprocessingFilter) | 将新过滤器添加到集合中以进一步运行所有操作。 集合中的一致性很重要。 |
| [GetEnumerator](../../aspose.ocr.models.preprocessingfilters/preprocessingfilter/getenumerator/)() | 用于IEnumarable接口实现。 |

### 也可以看看

* 命名空间 [Aspose.OCR.Models.PreprocessingFilters](../../aspose.ocr.models.preprocessingfilters/)
* 部件 [Aspose.OCR](../../)


