---
title: Device
second_title: Aspose.Page for .NET API 参考
description: 这个类封装了文档到抽象设备的渲染 文档的呈现是逐页执行的
type: docs
weight: 20
url: /zh/net/aspose.page/device/
---
## Device class

这个类封装了文档到抽象设备的渲染。 文档的呈现是逐页执行的。

```csharp
public abstract class Device
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [Device](device)(Size) | 使用页面大小初始化[`Device`](../device)。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| virtual [Background](../../aspose.page/device/background) { get; set; } | 返回或指定页面的当前背景。 |
| virtual [CharTM](../../aspose.page/device/chartm) { get; set; } | 返回或指定当前字符变换。 |
| [Creator](../../aspose.page/device/creator) { get; set; } | 返回或指定结果设备输出的创建者。 |
| virtual [Font](../../aspose.page/device/font) { get; set; } | 返回或指定当前字体。 |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb) { get; } | 表示设备是否使用直接RGB模式，即RGB。 |
| [IsLicensed](../../aspose.page/device/islicensed) { get; } | 指示此 Aspose.Page 库实例是否已获得许可。 |
| virtual [Opacity](../../aspose.page/device/opacity) { get; set; } | 返回或指定当前不透明度。 |
| virtual [OpacityMask](../../aspose.page/device/opacitymask) { get; set; } | 返回或指定当前的不透明蒙版。 |
| virtual [Paint](../../aspose.page/device/paint) { get; set; } | 返回或指定当前绘制。 |
| [Properties](../../aspose.page/device/properties) { get; set; } | 设备属性，包括元数据。 |
| virtual [SaveOptions](../../aspose.page/device/saveoptions) { set; } | 用于管理渲染过程的选项。 |
| virtual [Size](../../aspose.page/device/size) { get; set; } | 返回或指定页面大小。 |
| virtual [Stroke](../../aspose.page/device/stroke) { get; set; } | 返回或指定当前笔画。 |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode) { get; set; } | 返回或指定当前文本渲染模式。 |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth) { get; set; } | 返回或指定当前文本笔划宽度。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| virtual [Create](../../aspose.page/device/create)() | 创建此设备的副本。 |
| virtual [Dispose](../../aspose.page/device/dispose)() | 处置设备。 |
| virtual [Draw](../../aspose.page/device/draw)(GraphicsPath) | 绘制路径。 |
| virtual [DrawArc](../../aspose.page/device/drawarc)(double, double, double, double, double, double) | 绘制圆弧。 |
| virtual [DrawImage](../../aspose.page/device/drawimage)(Bitmap, Matrix, Color) | 绘制具有指定变换和背景的图像。 |
| virtual [DrawLine](../../aspose.page/device/drawline)(double, double, double, double) | 绘制线段。 |
| virtual [DrawOval](../../aspose.page/device/drawoval)(double, double, double, double) | 绘制一个椭圆。 |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon#drawpolygon)(double[], double[], int) | 绘制一个多边形。 |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon#drawpolygon_1)(int[], int[], int) | 绘制多边形。 |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline#drawpolyline)(double[], double[], int) | 绘制多段线。 |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline#drawpolyline_1)(int[], int[], int) | 绘制多段线。 |
| virtual [DrawRect](../../aspose.page/device/drawrect)(double, double, double, double) | 绘制一个矩形。 |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect)(double, double, double, double, double, double) | 绘制一个圆角矩形。 |
| virtual [DrawString](../../aspose.page/device/drawstring)(string, double, double) | 在给定点绘制字符串。 |
| virtual [EndDocument](../../aspose.page/device/enddocument)() | 在文档呈现后对设备进行必要的准备。 |
| virtual [Fill](../../aspose.page/device/fill)(GraphicsPath) | 填充路径。 |
| virtual [FillArc](../../aspose.page/device/fillarc)(double, double, double, double, double, double) | 填充圆弧。 |
| virtual [FillOval](../../aspose.page/device/filloval)(double, double, double, double) | 填充椭圆。 |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon#fillpolygon)(double[], double[], int) | 填充一个poligone。 |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon#fillpolygon_1)(int[], int[], int) | 填充一个poligone。 |
| virtual [FillRect](../../aspose.page/device/fillrect)(double, double, double, double) | 填充一个矩形。 |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect)(double, double, double, double, double, double) | 填充圆角矩形。 |
| [GetProperty](../../aspose.page/device/getproperty)(string) | 获取字符串属性的值。 |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor)(string) | 获取颜色属性的值。 |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble)(string) | 获取 double 属性的值。 |
| [GetPropertyInt](../../aspose.page/device/getpropertyint)(string) | 获取整数属性的值。 |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins)(string) | 获取 margin 属性的值。 |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle)(string) | 获取矩形属性的值。 |
| [GetPropertySize](../../aspose.page/device/getpropertysize)(string) | 获取 size 属性的值。 |
| virtual [GetTransform](../../aspose.page/device/gettransform)() | 获取当前变换。 |
| virtual [InitClip](../../aspose.page/device/initclip)() | 初始化设备的剪辑。 |
| [IsProperty](../../aspose.page/device/isproperty)(string) | 获取布尔属性的值。 |
| virtual [ReNew](../../aspose.page/device/renew)() | 将设备重置为整个文档的初始状态。用于重置输出流。 |
| virtual [Reset](../../aspose.page/device/reset)() | 将设备重置为页面的初始状态。 |
| virtual [Rotate](../../aspose.page/device/rotate#rotate)(double) | 旋转当前变换矩阵。调用 writeTransform(Transform)。 以正角度 theta 旋转将正 x 轴 上的点向正 y 轴旋转。 |
| virtual [Rotate](../../aspose.page/device/rotate#rotate_1)(double, double, double) | 围绕一个点旋转当前变换矩阵。 |
| virtual [Scale](../../aspose.page/device/scale)(double, double) | 缩放当前变换矩阵。调用 writeTransform(Transform)。 |
| virtual [SetClip](../../aspose.page/device/setclip)(GraphicsPath) | 指定设备的剪辑。 |
| virtual [SetTransform](../../aspose.page/device/settransform)(Matrix) | 指定当前变换。 |
| virtual [Shear](../../aspose.page/device/shear)(double, double) | 剪切当前变换矩阵。调用 writeTransform(Transform)。 |
| virtual [StartDocument](../../aspose.page/device/startdocument)() | 在开始渲染文档之前对设备进行必要的准备。 |
| override [ToString](../../aspose.page/device/tostring)() | 返回设备类型的名称。 |
| virtual [Transform](../../aspose.page/device/transform)(Matrix) | 变换当前变换矩阵。调用 writeTransform(Transform) |
| virtual [Translate](../../aspose.page/device/translate)(double, double) | 转换当前变换矩阵。调用 writeTransform(Transform)。 |
| virtual [WriteComment](../../aspose.page/device/writecomment)(string) | 写评论。 |

## 字段

| 姓名 | 描述 |
| --- | --- |
| static [VERSION](../../aspose.page/device/version) | 当前设备版本。 |

### 也可以看看

* 命名空间 [Aspose.Page](../../aspose.page)
* 部件 [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
