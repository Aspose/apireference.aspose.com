---
title: PdfDevice
second_title: Aspose.Page for .NET API 参考
description: 封装图像合成设备的类
type: docs
weight: 320
url: /zh/net/aspose.page.xps.presentation.pdf/pdfdevice/
---
## PdfDevice class

封装图像合成设备的类。

```csharp
public class PdfDevice : Device, IMultiPageDevice
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [PdfDevice](pdfdevice#constructor)(Stream) | 创建新实例。 |
| [PdfDevice](pdfdevice#constructor_1)(Stream, Size) | 创建具有指定媒体大小的新实例。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| override [Background](../../aspose.page.xps.presentation.pdf/pdfdevice/background) { get; set; } | 获取/设置背景颜色。 |
| virtual [CharTM](../../aspose.page/device/chartm) { get; set; } | 返回或指定当前字符变换。 |
| [Creator](../../aspose.page/device/creator) { get; set; } | 返回或指定结果设备输出的创建者。 |
| virtual [CurrentPageNumber](../../aspose.page.xps.presentation.pdf/pdfdevice/currentpagenumber) { get; } | 返回文档中当前页面的绝对编号。 |
| virtual [CurrentRelativePageNumber](../../aspose.page.xps.presentation.pdf/pdfdevice/currentrelativepagenumber) { get; } | 返回当前分区内的当前页数。 |
| override [Font](../../aspose.page.xps.presentation.pdf/pdfdevice/font) { get; set; } | 获取/设置当前字体。 |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb) { get; } | 表示设备是否使用直接RGB模式，即RGB。 |
| [IsLicensed](../../aspose.page/device/islicensed) { get; } | 指示此 Aspose.Page 库实例是否已获得许可。 |
| override [Opacity](../../aspose.page.xps.presentation.pdf/pdfdevice/opacity) { get; set; } | 获取/设置不透明度。 |
| override [OpacityMask](../../aspose.page.xps.presentation.pdf/pdfdevice/opacitymask) { get; set; } | 获取/设置不透明蒙版的画笔。遮罩适用于 Paint 或 Strike。 |
| override [Paint](../../aspose.page.xps.presentation.pdf/pdfdevice/paint) { get; set; } | 获取/设置用于填充路径的画笔。 |
| [Properties](../../aspose.page/device/properties) { get; set; } | 设备属性，包括元数据。 |
| override [SaveOptions](../../aspose.page.xps.presentation.pdf/pdfdevice/saveoptions) { set; } | 初始化保存选项。 |
| override [Size](../../aspose.page.xps.presentation.pdf/pdfdevice/size) { get; set; } | 获取/设置设备媒体大小。 |
| override [Stroke](../../aspose.page.xps.presentation.pdf/pdfdevice/stroke) { get; set; } | 获取/设置绘制路径的描边。 |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode) { get; set; } | 返回或指定当前文本渲染模式。 |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth) { get; set; } | 返回或指定当前文本笔划宽度。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| virtual [AddOutline](../../aspose.page.xps.presentation.pdf/pdfdevice/addoutline#addoutline)(int, string) | 添加以最后一个对象为目标的大纲项。 |
| virtual [AddOutline](../../aspose.page.xps.presentation.pdf/pdfdevice/addoutline#addoutline_1)(PointF, int, string) | 添加以原点为目标的大纲项。 |
| virtual [ClosePage](../../aspose.page.xps.presentation.pdf/pdfdevice/closepage)() | 完成页面。 |
| virtual [ClosePartition](../../aspose.page.xps.presentation.pdf/pdfdevice/closepartition)() | 完成文档分区。 |
| override [Create](../../aspose.page.xps.presentation.pdf/pdfdevice/create)() | 基于此设备实例创建一个新的设备实例。 写入此设备图形状态，即创建ApsCanvas实例 具有相应的 RenderTransform 和 Clip 属性。 |
| override [Dispose](../../aspose.page.xps.presentation.pdf/pdfdevice/dispose)() | 释放此设备实例。最终确定此设备实例图形状态， 即将 APS 组合上下文切换到比此 设备更高级别的ApsCanvas图形状态ApsCanvas。 |
| override [Draw](../../aspose.page.xps.presentation.pdf/pdfdevice/draw)(GraphicsPath) | 绘制指定路径。 |
| virtual [DrawArc](../../aspose.page/device/drawarc)(double, double, double, double, double, double) | 绘制圆弧。 |
| virtual [DrawImage](../../aspose.page/device/drawimage)(Bitmap, Matrix, Color) | 绘制具有指定变换和背景的图像。 |
| virtual [DrawLine](../../aspose.page/device/drawline)(double, double, double, double) | 绘制线段。 |
| virtual [DrawOval](../../aspose.page/device/drawoval)(double, double, double, double) | 绘制一个椭圆。 |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(double[], double[], int) | 绘制一个多边形。 |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(int[], int[], int) | 绘制多边形。 |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(double[], double[], int) | 绘制多段线。 |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(int[], int[], int) | 绘制多段线。 |
| virtual [DrawRect](../../aspose.page/device/drawrect)(double, double, double, double) | 绘制一个矩形。 |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect)(double, double, double, double, double, double) | 绘制一个圆角矩形。 |
| override [DrawString](../../aspose.page.xps.presentation.pdf/pdfdevice/drawstring)(string, double, double) | 在指定位置绘制字符串。 |
| override [EndDocument](../../aspose.page.xps.presentation.pdf/pdfdevice/enddocument)() | 完成文档。 |
| override [Fill](../../aspose.page.xps.presentation.pdf/pdfdevice/fill)(GraphicsPath) | 填充指定路径。 |
| virtual [FillArc](../../aspose.page/device/fillarc)(double, double, double, double, double, double) | 填充圆弧。 |
| virtual [FillOval](../../aspose.page/device/filloval)(double, double, double, double) | 填充椭圆。 |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(double[], double[], int) | 填充一个poligone。 |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(int[], int[], int) | 填充一个poligone。 |
| virtual [FillRect](../../aspose.page/device/fillrect)(double, double, double, double) | 填充一个矩形。 |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect)(double, double, double, double, double, double) | 填充圆角矩形。 |
| [GetProperty](../../aspose.page/device/getproperty)(string) | 获取字符串属性的值。 |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor)(string) | 获取颜色属性的值。 |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble)(string) | 获取 double 属性的值。 |
| [GetPropertyInt](../../aspose.page/device/getpropertyint)(string) | 获取整数属性的值。 |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins)(string) | 获取 margin 属性的值。 |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle)(string) | 获取矩形属性的值。 |
| [GetPropertySize](../../aspose.page/device/getpropertysize)(string) | 获取 size 属性的值。 |
| override [GetTransform](../../aspose.page.xps.presentation.pdf/pdfdevice/gettransform)() | 返回当前变换矩阵。 |
| virtual [InitClip](../../aspose.page/device/initclip)() | 初始化设备的剪辑。 |
| [InitPageNumbers](../../aspose.page.xps.presentation.pdf/pdfdevice/initpagenumbers)() | 初始化要输出的页数。 |
| [IsProperty](../../aspose.page/device/isproperty)(string) | 获取布尔属性的值。 |
| virtual [OpenPage](../../aspose.page.xps.presentation.pdf/pdfdevice/openpage#openpage_1)(string) | 用指定的标题开始一个新页面。 |
| virtual [OpenPage](../../aspose.page.xps.presentation.pdf/pdfdevice/openpage#openpage)(float, float) | 以指定的宽度和高度开始一个新页面。 |
| virtual [OpenPartition](../../aspose.page.xps.presentation.pdf/pdfdevice/openpartition)() | 开始一个新的文档分区。 |
| override [ReNew](../../aspose.page.xps.presentation.pdf/pdfdevice/renew)() | 将设备设置为初始状态。 |
| override [Reset](../../aspose.page.xps.presentation.pdf/pdfdevice/reset)() | 重置设备。 |
| override [Rotate](../../aspose.page.xps.presentation.pdf/pdfdevice/rotate#rotate)(double) | 将围绕原点的顺时针旋转应用于当前变换矩阵。 |
| virtual [Rotate](../../aspose.page/device/rotate)(double, double, double) | 围绕一个点旋转当前变换矩阵。 |
| override [Scale](../../aspose.page.xps.presentation.pdf/pdfdevice/scale)(double, double) | 将指定的比例向量应用于当前变换矩阵。 |
| override [SetClip](../../aspose.page.xps.presentation.pdf/pdfdevice/setclip)(GraphicsPath) | 将指定路径添加到当前剪辑路径。 |
| virtual [SetHyperlinkTarget](../../aspose.page.xps.presentation.pdf/pdfdevice/sethyperlinktarget#sethyperlinktarget)(int) | 设置以页码为目标的超链接。 |
| virtual [SetHyperlinkTarget](../../aspose.page.xps.presentation.pdf/pdfdevice/sethyperlinktarget#sethyperlinktarget_1)(string) | 设置以外部 URI 为目标的超链接。 |
| override [SetTransform](../../aspose.page.xps.presentation.pdf/pdfdevice/settransform)(Matrix) | 设置当前变换矩阵。 |
| override [Shear](../../aspose.page.xps.presentation.pdf/pdfdevice/shear)(double, double) | 将指定的剪切向量应用于当前变换矩阵。 |
| override [StartDocument](../../aspose.page.xps.presentation.pdf/pdfdevice/startdocument)() | 启动文档。 |
| override [ToString](../../aspose.page/device/tostring)() | 返回设备类型的名称。 |
| override [Transform](../../aspose.page.xps.presentation.pdf/pdfdevice/transform)(Matrix) | 将当前变换矩阵乘以指定的Matrix。 |
| override [Translate](../../aspose.page.xps.presentation.pdf/pdfdevice/translate)(double, double) | 将指定的平移向量应用于当前变换矩阵。 |
| virtual [UpdatePageParameters](../../aspose.page.xps.presentation.pdf/pdfdevice/updatepageparameters)(IMultiPageDevice) | 更新当前页面参数。 |
| virtual [WriteComment](../../aspose.page/device/writecomment)(string) | 写评论。 |

### 也可以看看

* class [Device](../../aspose.page/device)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice)
* 命名空间 [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf)
* 部件 [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
