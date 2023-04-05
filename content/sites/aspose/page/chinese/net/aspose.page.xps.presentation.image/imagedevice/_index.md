---
title: Class ImageDevice
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.XPS.Presentation.Image.ImageDevice 班级. 类封装图像合成器.
type: docs
weight: 350
url: /zh/net/aspose.page.xps.presentation.image/imagedevice/
---
## ImageDevice class

类封装图像合成器.

```csharp
public class ImageDevice : Device, IMultiPageDevice
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [ImageDevice](imagedevice/#constructor)() | 创建新实例。 |
| [ImageDevice](imagedevice/#constructor_1)(Size) | 创建具有指定媒体大小的新实例。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| override [Background](../../aspose.page.xps.presentation.image/imagedevice/background/) { get; set; } | 获取/设置背景色。 |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | 返回或指定当前字符 transform. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | 返回或指定结果设备输出的创建者。 |
| virtual [CurrentPageNumber](../../aspose.page.xps.presentation.image/imagedevice/currentpagenumber/) { get; } | 返回文档中当前页的绝对编号。 |
| virtual [CurrentRelativePageNumber](../../aspose.page.xps.presentation.image/imagedevice/currentrelativepagenumber/) { get; } | 返回当前分区内当前页的相对编号。 |
| override [Font](../../aspose.page.xps.presentation.image/imagedevice/font/) { get; set; } | 获取/设置当前字体。 |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | 表示设备是否使用直接RGB模式，即RGB。 |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | 表示这个 Aspose.Page 库实例是否被许可。 |
| override [Opacity](../../aspose.page.xps.presentation.image/imagedevice/opacity/) { get; set; } | 获取/设置不透明度。 |
| override [OpacityMask](../../aspose.page.xps.presentation.image/imagedevice/opacitymask/) { get; set; } | 获取/设置不透明蒙版的画笔。蒙版适用于 Paint 或 Strike. |
| override [Paint](../../aspose.page.xps.presentation.image/imagedevice/paint/) { get; set; } | 获取/设置填充路径的画笔。 |
| [Properties](../../aspose.page/device/properties/) { get; set; } | 包括元数据的设备属性。 |
| [Result](../../aspose.page.xps.presentation.image/imagedevice/result/) { get; } | 返回生成的图像字节数组。 第一个维度用于内部文档 ，第二个维度用于内部文档中的页面。 |
| override [SaveOptions](../../aspose.page.xps.presentation.image/imagedevice/saveoptions/) { set; } | 初始化保存选项。 |
| override [Size](../../aspose.page.xps.presentation.image/imagedevice/size/) { get; set; } | 获取/设置设备媒体大小。 |
| override [Stroke](../../aspose.page.xps.presentation.image/imagedevice/stroke/) { get; set; } | 获取/设置绘制路径的笔划。 |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | 返回或指定当前文本呈现模式。 |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | 返回或指定当前文本笔划宽度。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| virtual [ClosePage](../../aspose.page.xps.presentation.image/imagedevice/closepage/)() | 完成页面. |
| virtual [ClosePartition](../../aspose.page.xps.presentation.image/imagedevice/closepartition/)() | 完成文件分区。 |
| override [Create](../../aspose.page.xps.presentation.image/imagedevice/create/)() | Creates a new instance of the device based on this device instance. 写入此设备图形状态，即创建ApsCanvas具有相应 RenderTransform 和 Clip 属性的实例 . |
| override [Dispose](../../aspose.page.xps.presentation.image/imagedevice/dispose/)() | 处理这个设备实例。完成此设备实例图形状态， 即将 APS 组合上下文切换到ApsCanvas级别高于 this 设备的图形状态ApsCanvas. |
| override [Draw](../../aspose.page.xps.presentation.image/imagedevice/draw/)(GraphicsPath) | 绘制指定路径。 |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | 绘制圆弧。 |
| virtual [DrawImage](../../aspose.page/device/drawimage/)(Bitmap, Matrix, Color) | 绘制具有指定变换和背景的图像。 |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | 绘制线段。 |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | 画一个椭圆。 |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | 画了一个 poligone. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | 绘制多边形。 |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | 绘制折线。 |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | 绘制折线。 |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | 绘制一个矩形。 |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | 绘制一个圆角矩形。 |
| override [DrawString](../../aspose.page.xps.presentation.image/imagedevice/drawstring/)(string, double, double) | 在指定位置绘制字符串。 |
| override [EndDocument](../../aspose.page.xps.presentation.image/imagedevice/enddocument/)() | 完成文件. |
| override [Fill](../../aspose.page.xps.presentation.image/imagedevice/fill/)(GraphicsPath) | 填充指定路径。 |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | 填充圆弧。 |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | 填充椭圆形。 |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(double[], double[], int) | 填充 poligone. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(int[], int[], int) | 填充 poligone. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | 填充一个矩形。 |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | 填充一个圆角矩形。 |
| [GetProperty](../../aspose.page/device/getproperty/)(string) | 获取字符串属性的值。 |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor/)(string) | 获取颜色属性的值。 |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble/)(string) | 获取 double 属性的值。 |
| [GetPropertyInt](../../aspose.page/device/getpropertyint/)(string) | 获取整数属性的值。 |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins/)(string) | 获取保证金属性的值。 |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle/)(string) | 获取矩形属性的值。 |
| [GetPropertySize](../../aspose.page/device/getpropertysize/)(string) | 获取大小属性的值。 |
| override [GetTransform](../../aspose.page.xps.presentation.image/imagedevice/gettransform/)() | 返回当前变换矩阵。 |
| virtual [InitClip](../../aspose.page/device/initclip/)() | 初始化设备的剪辑。 |
| [InitPageNumbers](../../aspose.page.xps.presentation.image/imagedevice/initpagenumbers/)() | 初始化要输出的页数。 |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | 获取布尔属性的值。 |
| virtual [OpenPage](../../aspose.page.xps.presentation.image/imagedevice/openpage/#openpage_1)(string) | 以指定标题开始一个新页面。 |
| virtual [OpenPage](../../aspose.page.xps.presentation.image/imagedevice/openpage/#openpage)(float, float) | 以指定的宽度和高度开始一个新页面。 |
| virtual [OpenPartition](../../aspose.page.xps.presentation.image/imagedevice/openpartition/)() | 开始一个新的文档分区。 |
| override [ReNew](../../aspose.page.xps.presentation.image/imagedevice/renew/)() | 将设备设置为初始状态。 |
| override [Reset](../../aspose.page.xps.presentation.image/imagedevice/reset/)() | 重置设备。 |
| override [Rotate](../../aspose.page.xps.presentation.image/imagedevice/rotate/#rotate)(double) | 对当前变换矩阵应用绕原点的顺时针旋转。 |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | 围绕一个点旋转当前变换矩阵。 |
| override [Scale](../../aspose.page.xps.presentation.image/imagedevice/scale/)(double, double) | 将指定的比例向量应用于当前变换矩阵。 |
| override [SetClip](../../aspose.page.xps.presentation.image/imagedevice/setclip/)(GraphicsPath) | 将指定路径添加到当前剪辑路径。 |
| override [SetTransform](../../aspose.page.xps.presentation.image/imagedevice/settransform/)(Matrix) | 设置当前变换矩阵。 |
| override [Shear](../../aspose.page.xps.presentation.image/imagedevice/shear/)(double, double) | 将指定的剪切向量应用于当前变换矩阵。 |
| override [StartDocument](../../aspose.page.xps.presentation.image/imagedevice/startdocument/)() | 启动文档。 |
| override [ToString](../../aspose.page/device/tostring/)() | 返回设备类型的名称。 |
| override [Transform](../../aspose.page.xps.presentation.image/imagedevice/transform/)(Matrix) | 将当前变换矩阵乘以指定的Matrix. |
| override [Translate](../../aspose.page.xps.presentation.image/imagedevice/translate/)(double, double) | 将指定的平移向量应用于当前变换矩阵。 |
| virtual [UpdatePageParameters](../../aspose.page.xps.presentation.image/imagedevice/updatepageparameters/)(IMultiPageDevice) | 更新当前页面参数。 |
| virtual [WriteComment](../../aspose.page/device/writecomment/)(string) | 写评论. |

### 也可以看看

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* 命名空间 [Aspose.Page.XPS.Presentation.Image](../../aspose.page.xps.presentation.image/)
* 部件 [Aspose.Page](../../)


