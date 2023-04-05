---
title: Class PdfDevice
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.EPS.Device.PdfDevice 班级. 此类封装了文档到 PDF 的呈现
type: docs
weight: 60
url: /zh/net/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class

此类封装了文档到 PDF 的呈现。

```csharp
public class PdfDevice : Device, IMultiPageDevice, IStreamable
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [PdfDevice](pdfdevice/#constructor)(Stream) | 初始化新实例`PdfDevice`带输出流. |
| [PdfDevice](pdfdevice/#constructor_1)(Stream, Size) | 初始化新实例`PdfDevice`具有输出流和页面的指定大小. |

## 特性

| 姓名 | 描述 |
| --- | --- |
| virtual [Background](../../aspose.page/device/background/) { get; set; } | 返回或指定页面的当前背景。 |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | 返回或指定当前字符 transform. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | 返回或指定结果设备输出的创建者。 |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/pdfdevice/currentpagenumber/) { get; } | 当前页码。 |
| override [Font](../../aspose.page.eps.device/pdfdevice/font/) { set; } | 指定当前字体。 |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | 表示设备是否使用直接RGB模式，即RGB。 |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | 表示这个 Aspose.Page 库实例是否被许可。 |
| virtual [Opacity](../../aspose.page/device/opacity/) { get; set; } | 返回或指定当前不透明度。 |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | 返回或指定当前的不透明蒙版。 |
| [OutputStream](../../aspose.page.eps.device/pdfdevice/outputstream/) { get; set; } | 指定或返回输出流。 |
| override [Paint](../../aspose.page.eps.device/pdfdevice/paint/) { set; } | 返回或指定当前 paint. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | 包括元数据的设备属性。 |
| virtual [SaveOptions](../../aspose.page/device/saveoptions/) { set; } | 管理渲染进程的选项。 |
| virtual [Size](../../aspose.page/device/size/) { get; set; } | 返回或指定页面的大小。 |
| override [Stroke](../../aspose.page.eps.device/pdfdevice/stroke/) { set; } | 返回或指定当前笔划。 |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | 返回或指定当前文本呈现模式。 |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | 返回或指定当前文本笔划宽度。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/pdfdevice/closepage/)() | 在页面呈现后对设备进行必要的准备。 |
| override [Create](../../aspose.page.eps.device/pdfdevice/create/)() | 创建此设备的副本。 |
| override [Dispose](../../aspose.page.eps.device/pdfdevice/dispose/)() | 处理图形上下文。如果在创建时 restoreOnDispose 为真， writeGraphicsRestore() 将被调用。 |
| override [Draw](../../aspose.page.eps.device/pdfdevice/draw/)(GraphicsPath) | 绘制路径。 |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | 绘制圆弧。 |
| override [DrawImage](../../aspose.page.eps.device/pdfdevice/drawimage/)(Bitmap, Matrix, Color) | 绘制具有指定变换和背景的图像。 |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | 绘制线段。 |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | 画一个椭圆。 |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | 画了一个 poligone. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | 绘制多边形。 |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | 绘制折线。 |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | 绘制折线。 |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | 绘制一个矩形。 |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | 绘制一个圆角矩形。 |
| override [DrawString](../../aspose.page.eps.device/pdfdevice/drawstring/)(string, double, double) | 在给定点绘制字符串。 |
| override [EndDocument](../../aspose.page.eps.device/pdfdevice/enddocument/)() | 在文档呈现后对设备进行必要的准备。 |
| override [Fill](../../aspose.page.eps.device/pdfdevice/fill/)(GraphicsPath) | 填充路径。 |
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
| override [GetTransform](../../aspose.page.eps.device/pdfdevice/gettransform/)() | 获取当前变换。 |
| override [InitClip](../../aspose.page.eps.device/pdfdevice/initclip/)() | 初始化设备的剪辑。 |
| virtual [InitPageNumbers](../../aspose.page.eps.device/pdfdevice/initpagenumbers/)() | 初始化要输出的页数。 |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | 获取布尔属性的值。 |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage/#openpage_1)(string) | 在页面渲染之前对设备进行必要的准备。 |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage/#openpage)(float, float) | 在每次页面渲染之前对设备进行必要的准备。 |
| override [ReNew](../../aspose.page.eps.device/pdfdevice/renew/)() | 将设备重置为整个文档的初始状态。用于重置输出流。 |
| override [Reset](../../aspose.page.eps.device/pdfdevice/reset/)() | 如果将设置页面设备参数，则此方法允许将写入流返回到页面的开头。 |
| override [Rotate](../../aspose.page.eps.device/pdfdevice/rotate/#rotate)(double) | 在 Z 轴上旋转当前变换。调用 writeTransform(Transform). 以正角度 theta 旋转将正 x 轴 上的点旋转到正 y 轴. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | 围绕一个点旋转当前变换矩阵。 |
| override [Scale](../../aspose.page.eps.device/pdfdevice/scale/)(double, double) | 缩放当前变换矩阵。调用 writeTransform(Transform). |
| override [SetClip](../../aspose.page.eps.device/pdfdevice/setclip/)(GraphicsPath) | 指定设备的剪辑。 |
| override [SetTransform](../../aspose.page.eps.device/pdfdevice/settransform/)(Matrix) | 指定当前变换。由于大多数输出格式不 实现此功能，因此计算 currentTransform的逆变换并乘以要设置的 变换。然后通过调用 将结果转发给writeTransform(Transform)。 |
| override [Shear](../../aspose.page.eps.device/pdfdevice/shear/)(double, double) | 剪切当前变换矩阵。调用 writeTransform(Transform). |
| override [StartDocument](../../aspose.page.eps.device/pdfdevice/startdocument/)() | 在开始渲染文档之前对设备进行必要的准备。 |
| override [ToString](../../aspose.page.eps.device/pdfdevice/tostring/)() | 返回设备类型的名称。 |
| override [Transform](../../aspose.page.eps.device/pdfdevice/transform/)(Matrix) | 变换当前变换矩阵。调用 writeTransform(Transform) |
| override [Translate](../../aspose.page.eps.device/pdfdevice/translate/)(double, double) | 翻译当前的变换矩阵。调用 writeTransform(Transform). |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/pdfdevice/updatepageparameters/)(IMultiPageDevice) | 从其他多页设备更新页面参数。 |
| override [WriteComment](../../aspose.page.eps.device/pdfdevice/writecomment/)(string) | 写评论. |

## 字段

| 姓名 | 描述 |
| --- | --- |
| static readonly [AUTHOR](../../aspose.page.eps.device/pdfdevice/author/) | “作者”属性值。 |
| static readonly [BACKGROUND](../../aspose.page.eps.device/pdfdevice/background/) | “背景”属性键。 |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/pdfdevice/background_color/) | “背景颜色”属性键。 |
| static readonly [COMPRESS](../../aspose.page.eps.device/pdfdevice/compress/) | “压缩”属性键。 |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/pdfdevice/embed_fonts/) | “在文档中嵌入字体”属性键。 |
| static readonly [EMBED_FONTS_AS](../../aspose.page.eps.device/pdfdevice/embed_fonts_as/) | “用于嵌入的字体类型”属性键。 |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/pdfdevice/emit_errors/) | “发出错误”属性值。 |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/pdfdevice/emit_warnings/) | “发出警告”属性值。 |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/pdfdevice/fit_to_page/) | “使内容适合页面”属性键。 |
| static readonly [KEYWORDS](../../aspose.page.eps.device/pdfdevice/keywords/) | “关键字”属性值。 |
| static readonly [ORIENTATION](../../aspose.page.eps.device/pdfdevice/orientation/) | “方向”属性键。 |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/pdfdevice/page_margins/) | “页边距”属性键。 |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/pdfdevice/page_size/) | “页面大小”属性键。 |
| static readonly [SUBJECT](../../aspose.page.eps.device/pdfdevice/subject/) | “主题”属性值。 |
| static readonly [TITLE](../../aspose.page.eps.device/pdfdevice/title/) | “标题”属性值。 |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/pdfdevice/transparent/) | “透明”属性键。 |
| static readonly [VERSION](../../aspose.page.eps.device/pdfdevice/version/) | “版本”属性键。 |
| const [VERSION5](../../aspose.page.eps.device/pdfdevice/version5/) | “Adobe Acrobat Reader 版本”属性值。 |
| static readonly [WRITE_IMAGES_AS](../../aspose.page.eps.device/pdfdevice/write_images_as/) | “图像格式”属性键。 |

### 也可以看看

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* interface [IStreamable](../../aspose.page/istreamable/)
* 命名空间 [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* 部件 [Aspose.Page](../../)


