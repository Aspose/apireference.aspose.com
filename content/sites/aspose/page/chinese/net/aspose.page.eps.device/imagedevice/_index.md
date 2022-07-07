---
title: ImageDevice
second_title: Aspose.Page for .NET API 参考
description: 这个类封装了文档到图像的渲染
type: docs
weight: 40
url: /zh/net/aspose.page.eps.device/imagedevice/
---
## ImageDevice class

这个类封装了文档到图像的渲染。

```csharp
public class ImageDevice : Device, IMultiPageDevice
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [ImageDevice](imagedevice#constructor)() | 初始化[`ImageDevice`](../imagedevice)的新实例。 |
| [ImageDevice](imagedevice#constructor_1)(ImageFormat) | 用指定的图像格式初始化[`ImageDevice`](../imagedevice)的新实例。 |
| [ImageDevice](imagedevice#constructor_2)(Size) | 用指定的页面大小初始化[`ImageDevice`](../imagedevice)的新实例。 |
| [ImageDevice](imagedevice#constructor_3)(Size, ImageFormat) | 使用指定的页面大小和图像格式初始化[`ImageDevice`](../imagedevice)的新实例。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| override [Background](../../aspose.page.eps.device/imagedevice/background) { get; set; } | 表示设备是否使用直接RGB模式，即RGB。 |
| override [CharTM](../../aspose.page.eps.device/imagedevice/chartm) { get; set; } | 返回或指定当前字符变换。 |
| [Creator](../../aspose.page.eps.device/imagedevice/creator) { get; set; } | 返回或指定结果设备输出的创建者。 |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/imagedevice/currentpagenumber) { get; } | 当前页码。 |
| override [Font](../../aspose.page.eps.device/imagedevice/font) { get; set; } | 返回或指定当前字体。 |
| [Format](../../aspose.page.eps.device/imagedevice/format) { get; } | 图像格式。 |
| [ImagesBytes](../../aspose.page.eps.device/imagedevice/imagesbytes) { get; } | 以字节为单位返回结果图像，一页一字节数组。 |
| override [IsDirectRGB](../../aspose.page.eps.device/imagedevice/isdirectrgb) { get; } | 表示设备是否使用直接RGB模式，即RGB。 |
| [IsLicensed](../../aspose.page/device/islicensed) { get; } | 指示此 Aspose.Page 库实例是否已获得许可。 |
| override [Opacity](../../aspose.page.eps.device/imagedevice/opacity) { get; set; } | 返回或指定页面的当前背景。 |
| virtual [OpacityMask](../../aspose.page/device/opacitymask) { get; set; } | 返回或指定当前的不透明蒙版。 |
| override [Paint](../../aspose.page.eps.device/imagedevice/paint) { get; set; } | 返回或指定当前绘制。 |
| [Properties](../../aspose.page.eps.device/imagedevice/properties) { get; set; } | 设备属性，包括元数据。 |
| override [SaveOptions](../../aspose.page.eps.device/imagedevice/saveoptions) { set; } | 用于管理渲染过程的选项。 |
| override [Size](../../aspose.page.eps.device/imagedevice/size) { get; set; } | 返回或指定页面大小。 |
| override [Stroke](../../aspose.page.eps.device/imagedevice/stroke) { get; set; } | 返回或指定当前笔画。 |
| override [TextRenderingMode](../../aspose.page.eps.device/imagedevice/textrenderingmode) { get; set; } | 返回或指定当前文本渲染模式。 |
| override [TextStrokeWidth](../../aspose.page.eps.device/imagedevice/textstrokewidth) { get; set; } | 返回或指定当前文本笔划宽度。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/imagedevice/closepage)() | 在页面呈现后对设备进行必要的准备。 |
| override [Create](../../aspose.page.eps.device/imagedevice/create)() | 创建此设备的副本。 |
| override [Dispose](../../aspose.page.eps.device/imagedevice/dispose)() | 处置设备。 |
| override [Draw](../../aspose.page.eps.device/imagedevice/draw)(GraphicsPath) | 绘制路径。 |
| virtual [DrawArc](../../aspose.page/device/drawarc)(double, double, double, double, double, double) | 绘制圆弧。 |
| override [DrawImage](../../aspose.page.eps.device/imagedevice/drawimage)(Bitmap, Matrix, Color) | 绘制具有指定变换和背景的图像。 |
| virtual [DrawLine](../../aspose.page/device/drawline)(double, double, double, double) | 绘制线段。 |
| virtual [DrawOval](../../aspose.page/device/drawoval)(double, double, double, double) | 绘制一个椭圆。 |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(double[], double[], int) | 绘制一个多边形。 |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(int[], int[], int) | 绘制多边形。 |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(double[], double[], int) | 绘制多段线。 |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(int[], int[], int) | 绘制多段线。 |
| virtual [DrawRect](../../aspose.page/device/drawrect)(double, double, double, double) | 绘制一个矩形。 |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect)(double, double, double, double, double, double) | 绘制一个圆角矩形。 |
| override [DrawString](../../aspose.page.eps.device/imagedevice/drawstring)(string, double, double) | 在给定点绘制字符串。 |
| override [EndDocument](../../aspose.page.eps.device/imagedevice/enddocument)() | 在文档呈现后对设备进行必要的准备。 |
| override [Fill](../../aspose.page.eps.device/imagedevice/fill)(GraphicsPath) | 填充路径。 |
| virtual [FillArc](../../aspose.page/device/fillarc)(double, double, double, double, double, double) | 填充圆弧。 |
| virtual [FillOval](../../aspose.page/device/filloval)(double, double, double, double) | 填充椭圆。 |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(double[], double[], int) | 填充一个poligone。 |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(int[], int[], int) | 填充一个poligone。 |
| virtual [FillRect](../../aspose.page/device/fillrect)(double, double, double, double) | 填充一个矩形。 |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect)(double, double, double, double, double, double) | 填充圆角矩形。 |
| [GetProperty](../../aspose.page.eps.device/imagedevice/getproperty#getproperty)(string) | 获取字符串属性的值。 (2 methods) |
| [GetPropertyColor](../../aspose.page.eps.device/imagedevice/getpropertycolor#getpropertycolor)(string) | 获取颜色属性的值。 (2 methods) |
| [GetPropertyDouble](../../aspose.page.eps.device/imagedevice/getpropertydouble#getpropertydouble)(string) | 获取 double 属性的值。 (2 methods) |
| [GetPropertyInt](../../aspose.page.eps.device/imagedevice/getpropertyint#getpropertyint)(string) | 获取整数属性的值。 (2 methods) |
| [GetPropertyMargins](../../aspose.page.eps.device/imagedevice/getpropertymargins#getpropertymargins)(string) | 获取边距属性的值。 (2 methods) |
| [GetPropertyRectangle](../../aspose.page.eps.device/imagedevice/getpropertyrectangle#getpropertyrectangle)(string) | 获取矩形属性的值。 (2 methods) |
| [GetPropertySize](../../aspose.page.eps.device/imagedevice/getpropertysize#getpropertysize)(string) | 获取 size 属性的值。 (2 methods) |
| override [GetTransform](../../aspose.page.eps.device/imagedevice/gettransform)() | 获取当前变换。 |
| override [InitClip](../../aspose.page.eps.device/imagedevice/initclip)() | 初始化设备的剪辑。 |
| virtual [InitPageNumbers](../../aspose.page.eps.device/imagedevice/initpagenumbers)() | 初始化要输出的页数。 |
| [IsProperty](../../aspose.page.eps.device/imagedevice/isproperty#isproperty)(string) | 获取布尔属性的值。 (2 methods) |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage#openpage_1)(string) | 在页面渲染之前对设备进行必要的准备。 |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage#openpage)(float, float) | 在每次页面渲染之前对设备进行必要的准备。 |
| override [ReNew](../../aspose.page.eps.device/imagedevice/renew)() | 将设备重置为整个文档的初始状态。 |
| override [Reset](../../aspose.page.eps.device/imagedevice/reset)() | 将设备重置为页面的初始状态。 |
| override [Rotate](../../aspose.page.eps.device/imagedevice/rotate#rotate)(double) | 在 Z 轴上旋转当前变换矩阵。调用 writeTransform(Transform)。 以正角度 theta 旋转将正 x 轴 上的点向正 y 轴旋转。 |
| virtual [Rotate](../../aspose.page/device/rotate)(double, double, double) | 围绕一个点旋转当前变换矩阵。 |
| override [Scale](../../aspose.page.eps.device/imagedevice/scale)(double, double) | 缩放当前变换矩阵。调用 writeTransform(Transform)。 |
| override [SetClip](../../aspose.page.eps.device/imagedevice/setclip)(GraphicsPath) | 剪辑形状。 |
| override [SetTransform](../../aspose.page.eps.device/imagedevice/settransform)(Matrix) | 指定当前变换。 |
| override [Shear](../../aspose.page.eps.device/imagedevice/shear)(double, double) | 剪切当前变换矩阵。调用 writeTransform(Transform)。 |
| override [StartDocument](../../aspose.page.eps.device/imagedevice/startdocument)() | 在开始渲染文档之前对设备进行必要的准备。 |
| override [ToString](../../aspose.page.eps.device/imagedevice/tostring)() | 返回设备类型的名称。 |
| override [Transform](../../aspose.page.eps.device/imagedevice/transform)(Matrix) | 变换当前变换矩阵。调用 writeTransform(Transform)。 |
| override [Translate](../../aspose.page.eps.device/imagedevice/translate)(double, double) | 转换当前变换矩阵。调用 writeTransform(Transform)。 |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/imagedevice/updatepageparameters)(IMultiPageDevice) | 从其他多页设备更新页面参数。 |
| override [WriteComment](../../aspose.page.eps.device/imagedevice/writecomment)(string) | 写评论。 |

## 字段

| 姓名 | 描述 |
| --- | --- |
| static readonly [BACKGROUND](../../aspose.page.eps.device/imagedevice/background) | “背景”属性键。 |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/imagedevice/background_color) | “背景颜色”属性键。 |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/imagedevice/embed_fonts) | “在文档中嵌入字体”属性键。 |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/imagedevice/emit_errors) | “发出错误”属性值。 |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/imagedevice/emit_warnings) | “发出警告”属性值。 |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/imagedevice/fit_to_page) | “使内容适合页面”属性键。 |
| static readonly [ORIENTATION](../../aspose.page.eps.device/imagedevice/orientation) | “方向”属性键。 |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/imagedevice/page_margins) | “页边距”属性键。 |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/imagedevice/page_size) | “页面大小”属性键。 |
| static readonly [PRODUCER](../../aspose.page.eps.device/imagedevice/producer) | “生产者”属性值。 |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/imagedevice/transparent) | “透明”属性键。 |

### 也可以看看

* class [Device](../../aspose.page/device)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice)
* 命名空间 [Aspose.Page.EPS.Device](../../aspose.page.eps.device)
* 部件 [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
