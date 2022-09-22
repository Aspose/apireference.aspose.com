---
title: Graphics
second_title: Aspose.Drawing for .NET API 参考
description: 封装绘图表面
type: docs
weight: 530
url: /zh/net/system.drawing/graphics/
---
## Graphics class

封装绘图表面。

```csharp
public class Graphics : IDisposable
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Clip](../../system.drawing/graphics/clip) { get; set; } | 获取或设置一个Region这限制了这个的绘图区域Graphics. |
| [ClipBounds](../../system.drawing/graphics/clipbounds) { get; } | 得到一个[`RectangleF`](../rectanglef)限制此剪辑区域的结构[`Graphics`](../graphics). |
| [CompositingMode](../../system.drawing/graphics/compositingmode) { get; set; } | 获取或设置一个值，该值指定如何将合成图像绘制到此Graphics. |
| [CompositingQuality](../../system.drawing/graphics/compositingquality) { get; set; } | 获取或设置绘制到此的合成图像的渲染质量Graphics. |
| [DpiX](../../system.drawing/graphics/dpix) { get; } | 获取这个的水平分辨率Graphics. |
| [DpiY](../../system.drawing/graphics/dpiy) { get; } | 获取这个的垂直分辨率Graphics. |
| [InterpolationMode](../../system.drawing/graphics/interpolationmode) { get; set; } | 获取或设置与此 Graphics 关联的插值模式。 |
| [IsClipEmpty](../../system.drawing/graphics/isclipempty) { get; } | 获取一个值，该值指示此剪辑区域是否Graphics是空的。 |
| [IsVisibleClipEmpty](../../system.drawing/graphics/isvisibleclipempty) { get; } | 获取一个值，该值指示此剪辑区域是否可见Graphics是空的。 |
| [PageScale](../../system.drawing/graphics/pagescale) { get; set; } | 获取或设置世界单位和页面单位之间的缩放比例Graphics. |
| [PageUnit](../../system.drawing/graphics/pageunit) { get; set; } | 获取或设置用于此页面坐标的测量单位Graphics. |
| [PixelOffsetMode](../../system.drawing/graphics/pixeloffsetmode) { get; set; } | 获取或设置一个值，指定在此渲染期间像素如何偏移Graphics. |
| [RenderingOrigin](../../system.drawing/graphics/renderingorigin) { get; set; } | 获取或设置 this 的渲染原点Graphics用于抖动和阴影画笔。 |
| [SmoothingMode](../../system.drawing/graphics/smoothingmode) { get; set; } | 获取或设置此 Graphics 的渲染质量。 |
| [TextContrast](../../system.drawing/graphics/textcontrast) { get; set; } | 获取或设置渲染文本的伽马校正值。 |
| [TextRenderingHint](../../system.drawing/graphics/textrenderinghint) { get; set; } | 获取或设置与此关联的文本的呈现模式Graphics. |
| [Transform](../../system.drawing/graphics/transform) { get; set; } | 获取或设置几何世界变换的副本Graphics. |
| [VisibleClipBounds](../../system.drawing/graphics/visibleclipbounds) { get; } | 获取此可视剪切区域的边界矩形Graphics. |

## 方法

| 姓名 | 描述 |
| --- | --- |
| static [FromHwnd](../../system.drawing/graphics/fromhwnd)(IntPtr) | 创建一个新的Graphics从指定句柄到一个窗口。 |
| static [FromImage](../../system.drawing/graphics/fromimage)(Image) | 从指定的 Image 创建一个新的 Graphics。 |
| [AddMetafileComment](../../system.drawing/graphics/addmetafilecomment)(byte[]) | 给当前添加注释Metafile. |
| [BeginContainer](../../system.drawing/graphics/begincontainer#begincontainer)() | 保存一个带有当前状态的图形容器Graphics并打开并使用一个新的图形容器。 |
| [BeginContainer](../../system.drawing/graphics/begincontainer#begincontainer_1)(Rectangle, Rectangle, GraphicsUnit) | 保存一个带有当前状态的图形容器Graphics并打开并使用具有指定比例变换的新图形容器。 |
| [BeginContainer](../../system.drawing/graphics/begincontainer#begincontainer_2)(RectangleF, RectangleF, GraphicsUnit) | 保存一个带有当前状态的图形容器Graphics并打开并使用具有指定比例变换的新图形容器。 |
| [Clear](../../system.drawing/graphics/clear)(Color) | 清除整个绘图表面并用指定的背景颜色填充它。 |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen#copyfromscreen_1)(Point, Point, Size) | 执行颜色数据的位块传输，对应于像素的矩形，从屏幕到绘图表面Graphics. |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen#copyfromscreen_2)(Point, Point, Size, CopyPixelOperation) | 执行颜色数据的位块传输，对应于像素的矩形，从屏幕到绘图表面Graphics. |
| [CopyFromScreen](../../system.drawing/graphics/copyfromscreen#copyfromscreen)(int, int, int, int, Size, CopyPixelOperation) | 执行颜色数据的位块传输，对应于像素的矩形，从屏幕到绘图表面Graphics. |
| [Dispose](../../system.drawing/graphics/dispose)() | 释放此 Graphics 使用的所有资源。 |
| [DrawArc](../../system.drawing/graphics/drawarc#drawarc_1)(Pen, RectangleF, float, float) | 绘制表示由 RectangleF 结构指定的椭圆的一部分的圆弧。 |
| [DrawArc](../../system.drawing/graphics/drawarc#drawarc)(Pen, float, float, float, float, float, float) | 绘制表示由一对坐标、宽度和高度指定的椭圆的一部分的弧。 |
| [DrawBezier](../../system.drawing/graphics/drawbezier#drawbezier_1)(Pen, PointF, PointF, PointF, PointF) | 绘制由四个 PointF 结构定义的贝塞尔样条曲线。 |
| [DrawBezier](../../system.drawing/graphics/drawbezier#drawbezier)(Pen, float, float, float, float, float, float, float, float) | 绘制由四个有序坐标对定义的贝塞尔样条曲线，这些坐标对表示点。 |
| [DrawBeziers](../../system.drawing/graphics/drawbeziers#drawbeziers)(Pen, PointF[]) | 从数组中绘制一系列贝塞尔样条Point结构. |
| [DrawBeziers](../../system.drawing/graphics/drawbeziers#drawbeziers_1)(Pen, Point[]) | 从数组中绘制一系列贝塞尔样条PointF结构. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve#drawclosedcurve)(Pen, PointF[]) | 绘制由数组定义的闭合基数样条PointF结构. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve#drawclosedcurve_2)(Pen, Point[]) | 绘制由数组定义的闭合基数样条Point结构. |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve#drawclosedcurve_1)(Pen, PointF[], float, FillMode) | 使用指定的张力绘制由 PointF 结构数组定义的闭合基数样条曲线。 |
| [DrawClosedCurve](../../system.drawing/graphics/drawclosedcurve#drawclosedcurve_3)(Pen, Point[], float, FillMode) | 绘制由数组定义的闭合基数样条Point使用指定张力的结构。 |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve)(Pen, PointF[]) | 通过指定的数组绘制基数样条PointF结构. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_4)(Pen, Point[]) | 通过指定的数组绘制基数样条Point结构. |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_3)(Pen, PointF[], float) | 通过指定的数组绘制基数样条PointF使用指定张力的结构。 |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_6)(Pen, Point[], float) | 通过指定的数组绘制基数样条Point使用指定张力的结构。 |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_1)(Pen, PointF[], int, int) | 通过指定的数组绘制基数样条PointF使用指定张力的结构。绘图从数组的开头偏移开始。 |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_2)(Pen, PointF[], int, int, float) | 通过指定的数组绘制基数样条PointF使用指定张力的结构。绘图从数组的开头偏移开始。 |
| [DrawCurve](../../system.drawing/graphics/drawcurve#drawcurve_5)(Pen, Point[], int, int, float) | 通过指定的数组绘制基数样条Point使用指定张力的结构。绘图从数组的开头偏移开始。 |
| [DrawEllipse](../../system.drawing/graphics/drawellipse#drawellipse_1)(Pen, RectangleF) | 绘制由边界 RectangleF 定义的椭圆。 |
| [DrawEllipse](../../system.drawing/graphics/drawellipse#drawellipse)(Pen, float, float, float, float) | 绘制由一对坐标、高度和宽度指定的边界矩形定义的椭圆。 |
| [DrawIcon](../../system.drawing/graphics/drawicon#drawicon_1)(Icon, Rectangle) | 绘制指定表示的图像Icon在a指定的区域内Rectangle结构. |
| [DrawIcon](../../system.drawing/graphics/drawicon#drawicon)(Icon, int, int) | 绘制指定表示的图像Icon在指定的坐标。 |
| [DrawIconUnstretched](../../system.drawing/graphics/drawiconunstretched)(Icon, Rectangle) | 绘制指定表示的图像Icon不缩放图像。 |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_6)(Image, Point) | 在指定位置使用其原始物理尺寸绘制指定图像。 |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_7)(Image, PointF) | 绘制指定的Image，在指定位置使用其原始物理尺寸。 |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_8)(Image, PointF[]) | 绘制指定的Image在指定的位置并具有指定的形状和大小。 |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_11)(Image, Point[]) | 绘制指定的Е:Image在指定的位置并具有指定的形状和大小。 |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_14)(Image, Rectangle) | 在指定位置以指定大小绘制指定图像。 |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_20)(Image, RectangleF) | 在指定位置以指定大小绘制指定图像。 |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_3)(Image, float, float) | 绘制指定的Image，在指定位置使用其原始物理尺寸。 |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage)(Image, int, int) | 在坐标对指定的位置使用其原始物理尺寸绘制指定图像。 |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_9)(Image, PointF[], RectangleF, GraphicsUnit) | 在指定位置以指定大小绘制指定图像的指定部分。 |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_12)(Image, Point[], Rectangle, GraphicsUnit) | 绘制指定的指定部分Image在指定的位置和指定的大小。 |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_19)(Image, Rectangle, Rectangle, GraphicsUnit) | 在指定位置以指定大小绘制指定图像的指定部分。 |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_21)(Image, RectangleF, RectangleF, GraphicsUnit) | 在指定位置以指定大小绘制指定图像的指定部分。 |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_4)(Image, float, float, float, float) | 绘制指定的Image ，使用其原始物理大小，在指定位置和指定大小。 |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_5)(Image, float, float, RectangleF, GraphicsUnit) | 在指定位置绘制图像的一部分。 |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_1)(Image, int, int, int, int) | 在指定位置以指定大小绘制指定图像。 |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_2)(Image, int, int, Rectangle, GraphicsUnit) | 在指定位置绘制图像的一部分。 |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_10)(Image, PointF[], RectangleF, GraphicsUnit, ImageAttributes) | 在指定位置以指定大小绘制指定图像的指定部分。 |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_13)(Image, Point[], Rectangle, GraphicsUnit, ImageAttributes) | 绘制指定的指定部分Image在指定的位置和指定的大小。 |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_17)(Image, Rectangle, float, float, float, float, GraphicsUnit) | 绘制指定的指定部分Image在指定的位置和指定的大小。 |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_15)(Image, Rectangle, int, int, int, int, GraphicsUnit) | 绘制指定的指定部分Image在指定的位置和指定的大小。 |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_18)(Image, Rectangle, float, float, float, float, GraphicsUnit, ImageAttributes) | 绘制指定的指定部分Image在指定的位置和指定的大小。 |
| [DrawImage](../../system.drawing/graphics/drawimage#drawimage_16)(Image, Rectangle, int, int, int, int, GraphicsUnit, ImageAttributes) | 在指定位置以指定大小绘制指定图像的指定部分。 |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled#drawimageunscaled_2)(Image, Point) | 在指定位置使用其原始物理尺寸绘制指定图像。 |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled#drawimageunscaled_3)(Image, Rectangle) | 在指定位置使用其原始物理尺寸绘制指定图像。 |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled#drawimageunscaled)(Image, int, int) | 在坐标对指定的位置使用其原始物理尺寸绘制指定图像。 |
| [DrawImageUnscaled](../../system.drawing/graphics/drawimageunscaled#drawimageunscaled_1)(Image, int, int, int, int) | 在坐标对指定的位置使用其原始物理尺寸绘制指定图像。 |
| [DrawImageUnscaledAndClipped](../../system.drawing/graphics/drawimageunscaledandclipped)(Image, Rectangle) | 在不缩放的情况下绘制指定的图像，并在必要时将其裁剪以适合指定的矩形。 |
| [DrawLine](../../system.drawing/graphics/drawline#drawline_2)(Pen, Point, Point) | 画一条线连接两个Point结构. |
| [DrawLine](../../system.drawing/graphics/drawline#drawline_3)(Pen, PointF, PointF) | 绘制一条连接两个 PointF 结构的线。 |
| [DrawLine](../../system.drawing/graphics/drawline#drawline_1)(Pen, float, float, float, float) | 绘制一条连接由坐标对指定的两个点的线。 |
| [DrawLine](../../system.drawing/graphics/drawline#drawline)(Pen, int, int, int, int) | 绘制一条连接由坐标对指定的两个点的线。 |
| [DrawLines](../../system.drawing/graphics/drawlines#drawlines)(Pen, PointF[]) | 绘制一系列连接数组的线段PointF结构. |
| [DrawLines](../../system.drawing/graphics/drawlines#drawlines_1)(Pen, Point[]) | 绘制一系列连接数组的线段Point结构. |
| [DrawPath](../../system.drawing/graphics/drawpath)(Pen, GraphicsPath) | 绘制图形路径。 |
| [DrawPie](../../system.drawing/graphics/drawpie#drawpie_1)(Pen, RectangleF, float, float) | 绘制由 RectangleF 结构指定的椭圆和两条径向线定义的饼形。 |
| [DrawPie](../../system.drawing/graphics/drawpie#drawpie)(Pen, float, float, float, float, float, float) | 绘制由坐标对、宽度、高度和两条径向线指定的椭圆定义的饼形。 |
| [DrawPolygon](../../system.drawing/graphics/drawpolygon#drawpolygon)(Pen, PointF[]) | 绘制由 PointF 结构数组定义的多边形。 |
| [DrawPolygon](../../system.drawing/graphics/drawpolygon#drawpolygon_1)(Pen, Point[]) | 绘制由数组定义的多边形Point结构. |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle#drawrectangle_2)(Pen, Rectangle) | 绘制一个由 Rectangle 结构指定的矩形。 |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle#drawrectangle_1)(Pen, float, float, float, float) | 绘制由坐标对、宽度和高度指定的矩形。 |
| [DrawRectangle](../../system.drawing/graphics/drawrectangle#drawrectangle)(Pen, int, int, int, int) | 绘制由坐标对、宽度和高度指定的矩形。 |
| [DrawRectangles](../../system.drawing/graphics/drawrectangles#drawrectangles)(Pen, RectangleF[]) | 绘制一系列由指定的矩形RectangleF结构. |
| [DrawRectangles](../../system.drawing/graphics/drawrectangles#drawrectangles_1)(Pen, Rectangle[]) | 绘制一系列由指定的矩形Rectangle结构. |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_2)(string, Font, Brush, PointF) | 在指定位置绘制指定文本字符串Brush 和Font对象. |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_4)(string, Font, Brush, RectangleF) | 用指定的矩形在指定的矩形中绘制指定的文本字符串Brush 和Font使用指定格式属性的对象StringFormat. |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring)(string, Font, Brush, float, float) | 在指定位置绘制指定文本字符串Brush和Font对象. |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_3)(string, Font, Brush, PointF, StringFormat) | 在指定位置绘制指定文本字符串Brush和 Font使用指定格式属性的对象StringFormat. |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_5)(string, Font, Brush, RectangleF, StringFormat) | 用指定的矩形在指定的矩形中绘制指定的文本字符串Brush 和Font使用指定格式属性的对象StringFormat. |
| [DrawString](../../system.drawing/graphics/drawstring#drawstring_1)(string, Font, Brush, float, float, StringFormat) | 在指定位置绘制指定文本字符串Brush和 Font使用指定格式属性的对象StringFormat. |
| [EndContainer](../../system.drawing/graphics/endcontainer)(GraphicsContainer) | 关闭当前图形容器并恢复其状态Graphics通过调用保存的状态BeginContainer方法. |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile)(Metafile, Point, EnumerateMetafileProc) | 发送指定的记录[`Metafile`](../../system.drawing.imaging/metafile) ，一次一个，在指定点显示的回调方法。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_6)(Metafile, PointF, EnumerateMetafileProc) | 发送指定的记录[`Metafile`](../../system.drawing.imaging/metafile) ，一次一个，在指定点显示的回调方法。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_12)(Metafile, PointF[], EnumerateMetafileProc) | 发送指定的记录[`Metafile`](../../system.drawing.imaging/metafile) ，一次一个，到一个回调方法，以在指定的平行四边形中显示。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_18)(Metafile, Point[], EnumerateMetafileProc) | 发送指定的记录[`Metafile`](../../system.drawing.imaging/metafile) ，一次一个，到一个回调方法，以在指定的平行四边形中显示。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_24)(Metafile, Rectangle, EnumerateMetafileProc) | 发送指定的记录[`Metafile`](../../system.drawing.imaging/metafile)，一次一个，用于在指定矩形中显示的回调方法。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_30)(Metafile, RectangleF, EnumerateMetafileProc) | 发送指定的记录[`Metafile`](../../system.drawing.imaging/metafile)，一次一个，用于在指定矩形中显示的回调方法。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_1)(Metafile, Point, EnumerateMetafileProc, IntPtr) | 发送指定的记录[`Metafile`](../../system.drawing.imaging/metafile) ，一次一个，在指定点显示的回调方法。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_7)(Metafile, PointF, EnumerateMetafileProc, IntPtr) | 发送指定的记录[`Metafile`](../../system.drawing.imaging/metafile) ，一次一个，在指定点显示的回调方法。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_13)(Metafile, PointF[], EnumerateMetafileProc, IntPtr) | 发送指定的记录[`Metafile`](../../system.drawing.imaging/metafile) ，一次一个，到一个回调方法，以在指定的平行四边形中显示。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_19)(Metafile, Point[], EnumerateMetafileProc, IntPtr) | 发送指定的记录[`Metafile`](../../system.drawing.imaging/metafile) ，一次一个，到一个回调方法，以在指定的平行四边形中显示。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_25)(Metafile, Rectangle, EnumerateMetafileProc, IntPtr) | 发送指定的记录[`Metafile`](../../system.drawing.imaging/metafile)，一次一个，用于在指定矩形中显示的回调方法。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_31)(Metafile, RectangleF, EnumerateMetafileProc, IntPtr) | 发送指定的记录[`Metafile`](../../system.drawing.imaging/metafile)，一次一个，用于在指定矩形中显示的回调方法。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_2)(Metafile, Point, EnumerateMetafileProc, IntPtr, ImageAttributes) | 发送指定的记录[`Metafile`](../../system.drawing.imaging/metafile)，一次一个，使用指定图像属性在指定点显示的回调方法。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_3)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc) | 从一个选定的矩形中发送记录[`Metafile`](../../system.drawing.imaging/metafile) ，一次一个，在指定点显示的回调方法。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_8)(Metafile, PointF, EnumerateMetafileProc, IntPtr, ImageAttributes) | 发送指定的记录[`Metafile`](../../system.drawing.imaging/metafile)，一次一个，到回调方法 ，用于使用指定的图像属性在指定点显示。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_9)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc) | 从一个选定的矩形中发送记录[`Metafile`](../../system.drawing.imaging/metafile) ，一次一个，在指定点显示的回调方法。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_14)(Metafile, PointF[], EnumerateMetafileProc, IntPtr, ImageAttributes) | 发送指定的记录[`Metafile`](../../system.drawing.imaging/metafile)，一次一个，用于使用指定图像属性在指定平行四边形中显示的回调方法。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_15)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc) | 从 S 发送选定矩形中的记录[`Metafile`](../../system.drawing.imaging/metafile) ，一次一个，到一个回调方法，以在指定的平行四边形中显示。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_20)(Metafile, Point[], EnumerateMetafileProc, IntPtr, ImageAttributes) | 发送指定的记录[`Metafile`](../../system.drawing.imaging/metafile)，一次一个，用于使用指定图像属性在指定平行四边形中显示的回调方法。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_21)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc) | 从一个选定的矩形中发送记录[`Metafile`](../../system.drawing.imaging/metafile) ，一次一个，到一个回调方法，以在指定的平行四边形中显示。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_26)(Metafile, Rectangle, EnumerateMetafileProc, IntPtr, ImageAttributes) | 发送指定的记录[`Metafile`](../../system.drawing.imaging/metafile) ，一次一个，到一个回调方法，用于使用指定的图像属性在指定的矩形中显示。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_27)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc) | 从[`Metafile`](../../system.drawing.imaging/metafile)，一次一个，用于在指定矩形中显示的回调方法。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_32)(Metafile, RectangleF, EnumerateMetafileProc, IntPtr, ImageAttributes) | 发送指定的记录[`Metafile`](../../system.drawing.imaging/metafile) ，一次一个，到一个回调方法，用于使用指定的图像属性在指定的矩形中显示。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_33)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc) | 从[`Metafile`](../../system.drawing.imaging/metafile)，一次一个，用于在指定矩形中显示的回调方法。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_4)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | 从一个选定的矩形中发送记录[`Metafile`](../../system.drawing.imaging/metafile) ，一次一个，在指定点显示的回调方法。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_10)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | 从一个选定的矩形中发送记录[`Metafile`](../../system.drawing.imaging/metafile) ，一次一个，在指定点显示的回调方法。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_16)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | 从一个选定的矩形中发送记录[`Metafile`](../../system.drawing.imaging/metafile) ，一次一个，到一个回调方法，以在指定的平行四边形中显示。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_22)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | 从一个选定的矩形中发送记录[`Metafile`](../../system.drawing.imaging/metafile) ，一次一个，到一个回调方法，以在指定的平行四边形中显示。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_28)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr) | 从[`Metafile`](../../system.drawing.imaging/metafile)，一次一个，用于在指定矩形中显示的回调方法。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_34)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr) | 从[`Metafile`](../../system.drawing.imaging/metafile)，一次一个，用于在指定矩形中显示的回调方法。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_5)(Metafile, Point, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | 从一个选定的矩形中发送记录[`Metafile`](../../system.drawing.imaging/metafile)，一次一个，使用指定图像属性在指定点显示的回调方法。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_11)(Metafile, PointF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | 从一个选定的矩形中发送记录[`Metafile`](../../system.drawing.imaging/metafile)，一次一个，使用指定图像属性在指定点显示的回调方法。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_17)(Metafile, PointF[], RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | 从一个选定的矩形中发送记录[`Metafile`](../../system.drawing.imaging/metafile)，一次一个，用于使用指定图像属性在指定平行四边形中显示的回调方法。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_23)(Metafile, Point[], Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | 从一个选定的矩形中发送记录[`Metafile`](../../system.drawing.imaging/metafile)，一次一个，用于使用指定图像属性在指定平行四边形中显示的回调方法。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_29)(Metafile, Rectangle, Rectangle, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | 从[`Metafile`](../../system.drawing.imaging/metafile) ，一次一个，到一个回调方法，用于使用指定的图像属性在指定的矩形中显示。 |
| [EnumerateMetafile](../../system.drawing/graphics/enumeratemetafile#enumeratemetafile_35)(Metafile, RectangleF, RectangleF, GraphicsUnit, EnumerateMetafileProc, IntPtr, ImageAttributes) | 从[`Metafile`](../../system.drawing.imaging/metafile) ，一次一个，到一个回调方法，用于使用指定的图像属性在指定的矩形中显示。 |
| [ExcludeClip](../../system.drawing/graphics/excludeclip#excludeclip)(Rectangle) | 更新此剪辑区域Graphics排除由 a 指定的区域Rectangle |
| [ExcludeClip](../../system.drawing/graphics/excludeclip#excludeclip_1)(Region) | 更新此剪辑区域Graphics排除由 a 指定的区域Region. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve)(Brush, PointF[]) | 填充由数组定义的闭合基数样条曲线的内部PointF结构. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_3)(Brush, Point[]) | 填充由数组定义的闭合基数样条曲线的内部Point结构. |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_1)(Brush, PointF[], FillMode) | 填充由数组定义的闭合基数样条曲线的内部PointF使用指定填充模式的结构。 |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_4)(Brush, Point[], FillMode) | 填充由数组定义的闭合基数样条曲线的内部Point使用指定填充模式的结构。 |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_2)(Brush, PointF[], FillMode, float) | 使用指定的填充模式和张力填充由 PointF 结构 数组定义的闭合基数样条曲线的内部。 |
| [FillClosedCurve](../../system.drawing/graphics/fillclosedcurve#fillclosedcurve_5)(Brush, Point[], FillMode, float) | 填充由数组定义的闭合基数样条曲线的内部Point使用指定填充模式的结构。 |
| [FillEllipse](../../system.drawing/graphics/fillellipse#fillellipse_1)(Brush, RectangleF) | 填充由 RectangleF 结构指定的边界矩形定义的椭圆的内部。 |
| [FillEllipse](../../system.drawing/graphics/fillellipse#fillellipse)(Brush, float, float, float, float) | 填充由一对坐标、宽度和高度指定的边界矩形定义的椭圆的内部。 |
| [FillPath](../../system.drawing/graphics/fillpath)(Brush, GraphicsPath) | 填充 GraphicsPath 的内部。 |
| [FillPie](../../system.drawing/graphics/fillpie#fillpie_2)(Brush, Rectangle, float, float) | 填充由 Rectangle 结构指定的椭圆和两条径向线定义的饼图部分的内部。 |
| [FillPie](../../system.drawing/graphics/fillpie#fillpie_1)(Brush, float, float, float, float, float, float) | 填充由一对坐标、宽度、高度和两条径向线指定的椭圆定义的饼图部分的内部。 |
| [FillPie](../../system.drawing/graphics/fillpie#fillpie)(Brush, int, int, int, int, int, int) | 填充由一对坐标、宽度、高度和两条径向线指定的椭圆定义的饼图部分的内部。 |
| [FillPolygon](../../system.drawing/graphics/fillpolygon#fillpolygon)(Brush, PointF[]) | 填充由指定的点数组定义的多边形内部PointF结构. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon#fillpolygon_2)(Brush, Point[]) | 填充由指定的点数组定义的多边形内部Point结构. |
| [FillPolygon](../../system.drawing/graphics/fillpolygon#fillpolygon_1)(Brush, PointF[], FillMode) | 使用指定的填充模式填充由 PointF 结构指定的点数组定义的多边形内部。 |
| [FillPolygon](../../system.drawing/graphics/fillpolygon#fillpolygon_3)(Brush, Point[], FillMode) | 填充由指定的点数组定义的多边形内部Point使用指定填充模式的结构。 |
| [FillRectangle](../../system.drawing/graphics/fillrectangle#fillrectangle_1)(Brush, RectangleF) | 填充由 RectangleF 结构指定的矩形的内部。 |
| [FillRectangle](../../system.drawing/graphics/fillrectangle#fillrectangle)(Brush, float, float, float, float) | 填充由一对坐标、宽度和高度指定的矩形的内部。 |
| [FillRectangles](../../system.drawing/graphics/fillrectangles#fillrectangles)(Brush, RectangleF[]) | 填充由指定的一系列矩形的内部RectangleF结构. |
| [FillRectangles](../../system.drawing/graphics/fillrectangles#fillrectangles_1)(Brush, Rectangle[]) | 填充由指定的一系列矩形的内部Rectangle结构. |
| [FillRegion](../../system.drawing/graphics/fillregion)(Brush, Region) | 填充区域的内部。 |
| [Flush](../../system.drawing/graphics/flush#flush)() | 强制执行所有挂起的图形操作并立即返回而不等待操作完成。 |
| [Flush](../../system.drawing/graphics/flush#flush_1)(FlushIntention) | 强制执行所有挂起的图形操作，方法是等待或不等待，指定在操作完成之前返回。 |
| [GetHdc](../../system.drawing/graphics/gethdc)() | 获取与此关联的设备上下文的句柄Graphics. |
| [GetNearestColor](../../system.drawing/graphics/getnearestcolor)(Color) | 获取与指定颜色最接近的颜色Color结构. |
| [IntersectClip](../../system.drawing/graphics/intersectclip#intersectclip)(Rectangle) | 更新此剪辑区域Graphics到当前剪辑区域和指定的交点Rectangle结构. |
| [IntersectClip](../../system.drawing/graphics/intersectclip#intersectclip_1)(RectangleF) | 更新此剪辑区域Graphics到当前剪辑区域和指定的交点RectangleF结构. |
| [IntersectClip](../../system.drawing/graphics/intersectclip#intersectclip_2)(Region) | 更新此剪辑区域Graphics到当前剪辑区域和指定的交点Region. |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_4)(Point) | 表示是否指定Point结构包含在此的可见剪辑区域内Graphics. |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_5)(PointF) | 表示是否指定PointF结构包含在此的可见剪辑区域内Graphics. |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_6)(Rectangle) | 表示一个指定的矩形是否Rectangle结构包含在此的可见剪辑区域内Graphics. |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_7)(RectangleF) | 表示一个指定的矩形是否RectangleF结构包含在此的可见剪辑区域内Graphics. |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_2)(float, float) | 表示一对坐标指定的点是否包含在这个可视剪辑区域内Graphics. |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible)(int, int) | 表示一对坐标指定的点是否包含在这个可视剪辑区域内Graphics. |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_3)(float, float, float, float) | 表示由一对坐标、一个宽度和一个高度指定的矩形是否包含在此的可见剪辑区域内Graphics. |
| [IsVisible](../../system.drawing/graphics/isvisible#isvisible_1)(int, int, int, int) | 表示由一对坐标、一个宽度和一个高度指定的矩形是否包含在此的可见剪辑区域内Graphics. |
| [MeasureCharacterRanges](../../system.drawing/graphics/measurecharacterranges)(string, Font, RectangleF, StringFormat) | 获取一个数组Region对象，每个对象都限定了指定字符串内的一系列字符位置。 |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring)(string, Font) | 用指定的值绘制时测量指定的字符串Font. |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_1)(string, Font, int) | 用指定的值绘制时测量指定的字符串Font. |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_4)(string, Font, SizeF) | 用指定的值绘制时测量指定的字符串Font. |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_2)(string, Font, int, StringFormat) | 用指定的值绘制时测量指定的字符串Font并使用指定的 formatted StringFormat. |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_3)(string, Font, PointF, StringFormat) | 用指定的值绘制时测量指定的字符串Font并使用指定的 formatted StringFormat. |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_5)(string, Font, SizeF, StringFormat) | 用指定的值绘制时测量指定的字符串Font并使用指定的 formatted StringFormat. |
| [MeasureString](../../system.drawing/graphics/measurestring#measurestring_6)(string, Font, SizeF, StringFormat, out int, out int) | 用指定的值绘制时测量指定的字符串Font并使用指定的 formatted StringFormat. |
| [MultiplyTransform](../../system.drawing/graphics/multiplytransform#multiplytransform)(Matrix) | 乘以这个的世界变换Graphics并指定Matrix. |
| [MultiplyTransform](../../system.drawing/graphics/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | 乘以这个的世界变换Graphics并指定 Matrix按指定顺序。 |
| [ReleaseHdc](../../system.drawing/graphics/releasehdc#releasehdc)() | 释放先前调用到 获得的设备上下文句柄GetHdc这个方法Graphics. |
| [ReleaseHdc](../../system.drawing/graphics/releasehdc#releasehdc_1)(IntPtr) | 释放由先前调用获得的设备上下文句柄GetHdc这个方法 Graphics. |
| [ResetClip](../../system.drawing/graphics/resetclip)() | 重置此剪辑区域Graphics到无限区域。 |
| [ResetTransform](../../system.drawing/graphics/resettransform)() | 重置这个的世界变换矩阵Graphics到单位矩阵. |
| [Restore](../../system.drawing/graphics/restore)(GraphicsState) | 恢复此状态[`Graphics`](../graphics)到由 a 代表的状态[`GraphicsState`](../../system.drawing.drawing2d/graphicsstate). |
| [RotateTransform](../../system.drawing/graphics/rotatetransform#rotatetransform)(float) | 将指定的旋转应用于此的变换矩阵Graphics. |
| [RotateTransform](../../system.drawing/graphics/rotatetransform#rotatetransform_1)(float, MatrixOrder) | 将指定的旋转应用于此的变换矩阵Graphics按指定顺序。 |
| [Save](../../system.drawing/graphics/save)() | 保存当前状态[`Graphics`](../graphics)并用 a 标识保存的状态[`GraphicsState`](../../system.drawing.drawing2d/graphicsstate). |
| [ScaleTransform](../../system.drawing/graphics/scaletransform#scaletransform)(float, float) | 对这个的变换矩阵应用指定的缩放操作Graphics通过将 it 添加到对象的变换矩阵. |
| [ScaleTransform](../../system.drawing/graphics/scaletransform#scaletransform_1)(float, float, MatrixOrder) | 对这个的变换矩阵应用指定的缩放操作Graphics按指定顺序。 |
| [SetClip](../../system.drawing/graphics/setclip#setclip_2)(Graphics) | 设置此剪辑区域[`Graphics`](../graphics)到指定的 Clip 属性[`Graphics`](../graphics) |
| [SetClip](../../system.drawing/graphics/setclip#setclip)(GraphicsPath) | 设置此剪辑区域[`Graphics`](../graphics)到指定的[`GraphicsPath`](../../system.drawing.drawing2d/graphicspath). |
| [SetClip](../../system.drawing/graphics/setclip#setclip_4)(Rectangle) | 设置此剪辑区域[`Graphics`](../graphics)结合当前剪辑区域和由a指定的矩形的指定操作的结果[`Rectangle`](../rectangle)结构. |
| [SetClip](../../system.drawing/graphics/setclip#setclip_6)(RectangleF) | 设置此剪辑区域[`Graphics`](../graphics)结合当前剪辑区域和由a指定的矩形的指定操作的结果[`RectangleF`](../rectanglef)结构. |
| [SetClip](../../system.drawing/graphics/setclip#setclip_3)(Graphics, CombineMode) | 设置此剪辑区域[`Graphics`](../graphics)到当前剪辑区域的指定组合操作的结果和指定的剪辑属性[`Graphics`](../graphics). |
| [SetClip](../../system.drawing/graphics/setclip#setclip_1)(GraphicsPath, CombineMode) | 设置此剪辑区域[`Graphics`](../graphics)结合当前剪辑区域和指定的指定操作的结果[`GraphicsPath`](../../system.drawing.drawing2d/graphicspath). |
| [SetClip](../../system.drawing/graphics/setclip#setclip_5)(Rectangle, CombineMode) | 设置此剪辑区域[`Graphics`](../graphics)结合当前剪辑区域和由a指定的矩形的指定操作的结果[`Rectangle`](../rectangle)结构. |
| [SetClip](../../system.drawing/graphics/setclip#setclip_7)(RectangleF, CombineMode) | 设置此剪辑区域[`Graphics`](../graphics)结合当前剪辑区域和由a指定的矩形的指定操作的结果[`RectangleF`](../rectanglef)结构. |
| [SetClip](../../system.drawing/graphics/setclip#setclip_8)(Region, CombineMode) | 设置此剪辑区域Graphics到指定操作组合 当前剪辑区域和指定操作的结果Region. |
| [TransformPoints](../../system.drawing/graphics/transformpoints#transformpoints)(CoordinateSpace, CoordinateSpace, PointF[]) | 使用当前世界和页面变换将一组点从一个坐标空间变换到另一个坐标空间Graphics. |
| [TransformPoints](../../system.drawing/graphics/transformpoints#transformpoints_1)(CoordinateSpace, CoordinateSpace, Point[]) | 使用当前世界和页面变换将一组点从一个坐标空间变换到另一个坐标空间Graphics. |
| [TranslateClip](../../system.drawing/graphics/translateclip#translateclip_1)(float, float) | 翻译此剪辑区域Graphics在水平和垂直方向上按指定量。 |
| [TranslateClip](../../system.drawing/graphics/translateclip#translateclip)(int, int) | 翻译此剪辑区域Graphics在水平和垂直方向上按指定量。 |
| [TranslateTransform](../../system.drawing/graphics/translatetransform#translatetransform)(float, float) | 通过将指定的 translate 附加到此变换矩阵的前面来更改坐标系的原点Graphics. |
| [TranslateTransform](../../system.drawing/graphics/translatetransform#translatetransform_1)(float, float, MatrixOrder) | 通过将指定的平移应用于此的变换矩阵 来更改坐标系的原点Graphics按指定顺序。 |

## 其他成员

| 姓名 | 描述 |
| --- | --- |
| delegate [DrawImageAbort](graphics.drawimageabort) | 提供一个回调方法来决定何时[`DrawImage`](./drawimage)方法应该提前取消执行并停止绘制图像。 |
| delegate [EnumerateMetafileProc](graphics.enumeratemetafileproc) | 提供回调方法[`EnumerateMetafile`](./enumeratemetafile)方法。 |

### 也可以看看

* 命名空间 [System.Drawing](../../system.drawing)
* 部件 [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
