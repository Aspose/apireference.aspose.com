---
title: Class PsDocument
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.EPS.PsDocument 班级. 这个类封装了PS/EPS文档
type: docs
weight: 140
url: /zh/net/aspose.page.eps/psdocument/
---
## PsDocument class

这个类封装了PS/EPS文档。

```csharp
public sealed class PsDocument : Document
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [PsDocument](psdocument/#constructor)(Stream) | 初始化`PsDocument`带有 PS/EPS 文件流. |
| [PsDocument](psdocument/#constructor_1)(Stream, PsSaveOptions) | 初始化为空`PsDocument`初始化页面. |
| [PsDocument](psdocument/#constructor_2)(Stream, PsSaveOptions, bool) | 初始化为空`PsDocument`. |
| [PsDocument](psdocument/#constructor_3)(Stream, PsSaveOptions, int) | 初始化为空`PsDocument`当预先知道 Postscript 文档页数时。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [NumberOfPages](../../aspose.page.eps/psdocument/numberofpages/) { get; } | 返回生成的 PDF 文档中的页数。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Clip](../../aspose.page.eps/psdocument/clip/)(GraphicsPath) | 将剪辑添加到当前图形状态。 |
| [ClipAndNewPath](../../aspose.page.eps/psdocument/clipandnewpath/)(GraphicsPath) | 将剪辑添加到当前图形状态，然后写入“newpath”运算符。有必要对这个剪切路径和一些后续路径（例如用“字符路径”运算符勾勒出的字形）的汇合处进行 escape 操作。 |
| [ClipRectangle](../../aspose.page.eps/psdocument/cliprectangle/)(RectangleF) | 将剪切矩形添加到当前图形状态。 |
| [ClipText](../../aspose.page.eps/psdocument/cliptext/)(string, Font, float, float) |  |
| [ClosePage](../../aspose.page.eps/psdocument/closepage/)() | 完成当前页面。 |
| [Draw](../../aspose.page.eps/psdocument/draw/)(GraphicsPath) | 绘制任意路径. |
| [DrawExplicitImageMask](../../aspose.page.eps/psdocument/drawexplicitimagemask/)(Bitmap, Bitmap, Matrix) | 绘制蒙版图像. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage)(Bitmap) | 绘制图像. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage_1)(Bitmap, Matrix, Color) | 绘制带背景的变换图像. |
| [DrawTransparentImage](../../aspose.page.eps/psdocument/drawtransparentimage/)(Bitmap, Matrix, int) | 绘制变换后的透明图像。如果图像没有 Alpha 通道，它将被绘制为不透明 image |
| [Fill](../../aspose.page.eps/psdocument/fill/)(GraphicsPath) | 填充任意路径. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext)(string, DrFont, float, float, Brush, Pen) | 通过填充字形内部和绘制字形轮廓来添加文本字符串。 |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_3)(string, Font, float, float, Brush, Pen) | 通过填充字形内部和绘制字形轮廓来添加文本字符串。 |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_1)(string, float[], DrFont, float, float, Brush, Pen) | 通过填充字形内部和绘制字形轮廓来添加文本字符串。 |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_2)(string, float[], Font, float, float, Brush, Pen) | 通过填充字形内部和绘制字形轮廓来添加文本字符串。 |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext)(string, DrFont, float, float) | 通过填充字形的内部来添加文本字符串。 |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_6)(string, Font, float, float) | 通过填充字形的内部来添加文本字符串。 |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_1)(string, DrFont, float, float, Brush) | 通过填充字形的内部来添加文本字符串。 |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_2)(string, float[], DrFont, float, float) | 通过填充字形的内部来添加文本字符串。 |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_4)(string, float[], Font, float, float) | 通过填充字形的内部来添加文本字符串。 |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_7)(string, Font, float, float, Brush) | 通过填充字形的内部来添加文本字符串。 |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_3)(string, float[], DrFont, float, float, Brush) | 通过填充字形的内部来添加文本字符串。 |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_5)(string, float[], Font, float, float, Brush) | 通过填充字形的内部来添加文本字符串。 |
| [GetPaint](../../aspose.page.eps/psdocument/getpaint/)() | 获取当前图形状态的绘制。 |
| [GetStroke](../../aspose.page.eps/psdocument/getstroke/)() | 获取当前图形状态的笔划。 |
| [GetXmpMetadata](../../aspose.page.eps/psdocument/getxmpmetadata/)() | 读取 PS/EPS 文件并提取 XmpMetdata（如果已存在）或添加新文件（如果不存在）。 |
| [Merge](../../aspose.page.eps/psdocument/merge/)(string[], Device, SaveOptions) | 将 PS/EPS 文件合并到设备中。 |
| [OpenPage](../../aspose.page.eps/psdocument/openpage/#openpage_1)(string) | 创建具有文档大小的新页面并使其成为当前页面。 |
| [OpenPage](../../aspose.page.eps/psdocument/openpage/#openpage)(float, float) | 创建新页面并使其成为当前页面。 |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext)(string, DrFont, float, float) | 通过绘制字形轮廓添加文本字符串。 |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_6)(string, Font, float, float) | 通过绘制字形轮廓添加文本字符串。 |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_1)(string, DrFont, float, float, Pen) | 通过绘制字形轮廓添加文本字符串。 |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_2)(string, float[], DrFont, float, float) | 通过绘制字形轮廓添加文本字符串。 |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_4)(string, float[], Font, float, float) | 通过绘制字形轮廓添加文本字符串。 |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_7)(string, Font, float, float, Pen) | 通过绘制字形轮廓添加文本字符串。 |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_3)(string, float[], DrFont, float, float, Pen) | 通过绘制字形轮廓添加文本字符串。 |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_5)(string, float[], Font, float, float, Pen) | 通过绘制字形轮廓添加文本字符串。 |
| [Rotate](../../aspose.page.eps/psdocument/rotate/#rotate_1)(float) | 将原点逆时针旋转添加到当前图形状态（旋转当前矩阵）。 |
| [Rotate](../../aspose.page.eps/psdocument/rotate/#rotate)(int) | 将原点逆时针旋转添加到当前图形状态（旋转当前矩阵）。 |
| [Save](../../aspose.page.eps/psdocument/save/#save)() | 保存给定`PsDocument`作为 EPS 文件。只有从头开始创建 PsDocument 时才使用此方法。 |
| [Save](../../aspose.page.eps/psdocument/save/#save_2)(Stream) | 保存给定`PsDocument`作为 EPS 文件。此方法仅在更新 XMP 元数据后使用。 它使用更新的现有元数据或调用 GetMetadata 方法时创建的新元数据保存初始 EPS 文件。 在最后一种情况下，添加了所有必要的 PostScript 代码和 EPS 注释。 |
| override [Save](../../aspose.page.eps/psdocument/save/#save_1)(Device, SaveOptions) | 将 PS/EPS 文件保存到设备。 |
| [Scale](../../aspose.page.eps/psdocument/scale/)(float, float) | 将比例添加到当前图形状态（缩放当前矩阵）。 |
| [SetPageDevice](../../aspose.page.eps/psdocument/setpagedevice/)(Dictionary&lt;string, object&gt;) | 设置页面设备参数（参见操作符“setpagedevice”PostScript 规范）。 其中可以是页面大小和颜色等。 |
| [SetPageSize](../../aspose.page.eps/psdocument/setpagesize/)(float, float) | 设置页面大小。要在一个文档中创建不同大小的页面，请使用[`SetPageDevice`](./setpagedevice/) 方法就在这个方法之后。 |
| [SetPaint](../../aspose.page.eps/psdocument/setpaint/)(Brush) | 在当前图形状态下设置绘画。 |
| [SetStroke](../../aspose.page.eps/psdocument/setstroke/)(Pen) | 在当前图形状态下设置笔划。 |
| [SetTransform](../../aspose.page.eps/psdocument/settransform/)(Matrix) | 将当前转换设置为此。 |
| [Shear](../../aspose.page.eps/psdocument/shear/)(float, float) | 将剪切变换添加到当前图形状态（剪切电流矩阵）。 |
| [Transform](../../aspose.page.eps/psdocument/transform/)(Matrix) | 将转换添加到当前图形状态（将此矩阵与当前矩阵连接）。 |
| [Translate](../../aspose.page.eps/psdocument/translate/)(float, float) | 将翻译添加到当前图形状态（翻译当前矩阵）。 |
| [WriteGraphicsRestore](../../aspose.page.eps/psdocument/writegraphicsrestore/)() | 写入当前图形状态的恢复（请参阅关于运算符“grestore”的 PostScript 规范）。 |
| [WriteGraphicsSave](../../aspose.page.eps/psdocument/writegraphicssave/)() | 写入当前图形状态的保存（请参阅运算符“gsave”的 PostScript 规范）。 |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps)(Bitmap, Stream, PsSaveOptions) | 将位图对象保存到 EPS 输出流。 |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_1)(Bitmap, string, PsSaveOptions) | 将位图对象保存到 EPS 文件。 |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_2)(Stream, Stream, PsSaveOptions) | 将 PNG/JPEG/TIFF/BMP/GIF/EMF 图像从输入流保存到 EPS 输出流。 |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_3)(string, string, PsSaveOptions) | 将 PNG/JPEG/TIFF/BMP/GIF/EMF 图像从文件保存到 EPS 文件。 |

### 也可以看看

* class [Document](../../aspose.page/document/)
* 命名空间 [Aspose.Page.EPS](../../aspose.page.eps/)
* 部件 [Aspose.Page](../../)


