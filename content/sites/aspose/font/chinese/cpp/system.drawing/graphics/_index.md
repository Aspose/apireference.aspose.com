---
title: "System::Drawing::Graphics 类"
linktitle: "Graphics"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Graphics 类。表示绘图表面。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 1000
url: /zh/cpp/system.drawing/graphics/
---
## Graphics class


表示绘图表面。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class Graphics : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AddMetafileComment](./addmetafilecomment/)(const System::ArrayPtr\<uint8_t\>\&) | 未实现。 |
| [BeginContainer](./begincontainer/)() | 保存一个包含此对象当前状态的容器，打开并使用一个新容器，然后返回已保存的容器。 |
| [BeginContainer](./begincontainer/)(Rectangle, Rectangle, GraphicsUnit) | 保存一个包含此对象当前状态的容器，打开并使用一个新容器，然后返回已保存的容器。 |
| [BeginContainer](./begincontainer/)(RectangleF, RectangleF, GraphicsUnit) | 保存一个包含此对象当前状态的容器，打开并使用一个新容器，然后返回已保存的容器。 |
| [Clear](./clear/)(Color) | 清除当前对象所表示的绘图表面并用指定的颜色填充。 |
| [CopyFromScreen](./copyfromscreen/)(Point, Point, Size, CopyPixelOperation) | 未实现。 |
| [CopyFromScreen](./copyfromscreen/)(int32_t, int32_t, int32_t, int32_t, Size, CopyPixelOperation) | 未实现。 |
| [Dispose](./dispose/)() | 释放当前对象获取的所有操作系统资源。 |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t) | 在当前对象所表示的表面上使用指定的笔绘制指定的弧。 |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float) | 在当前对象所表示的表面上使用指定的笔绘制指定的弧。 |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, Rectangle, float, float) | 在当前对象所表示的表面上使用指定的笔绘制指定的弧。 |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, RectangleF, float, float) | 在当前对象所表示的表面上使用指定的笔绘制指定的弧。 |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, const Point\&, const Point\&, const Point\&, const Point\&) | 未实现。 |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, const PointF\&, const PointF\&, const PointF\&, const PointF\&) | 未实现。 |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float, float, float) | 未实现。 |
| [DrawBeziers](./drawbeziers/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&) | 使用指定的笔绘制一系列贝塞尔样条。 |
| [DrawBeziers](./drawbeziers/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&) | 使用指定的笔绘制一系列贝塞尔样条。 |
| [DrawClosedCurve](./drawclosedcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float, Drawing2D::FillMode) | 使用指定的笔绘制闭合样条。 |
| [DrawClosedCurve](./drawclosedcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float, Drawing2D::FillMode) | 使用指定的笔绘制闭合样条。 |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float) | 使用指定的笔绘制样条。 |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float) | 使用指定的笔绘制样条。 |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, int32_t, int32_t, float) | 使用指定的笔绘制样条。 |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, int32_t, int32_t, float) | 使用指定的笔绘制样条。 |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, Rectangle) | 在当前对象所表示的表面上使用指定的笔绘制指定的椭圆。 |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, RectangleF) | 在当前对象所表示的表面上使用指定的笔绘制指定的椭圆。 |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, int, int, int, int) | 在当前对象所表示的表面上使用指定的笔绘制指定的椭圆。 |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, float, float, float, float) | 在当前对象所表示的表面上使用指定的笔绘制指定的椭圆。 |
| [DrawIcon](./drawicon/)(const SharedPtr\<Icon\>\&, Rectangle) | 未实现。 |
| [DrawIcon](./drawicon/)(const SharedPtr\<Icon\>\&, int32_t, int32_t) | 未实现。 |
| [DrawIconUnstretched](./drawiconunstretched/)(const SharedPtr\<Icon\>\&, Rectangle) | 未实现。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::ArrayPtr\<Point\>\&) | 未实现。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::ArrayPtr\<PointF\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | 在指定位置绘制指定图像的指定区域。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::Details::ArrayView\<PointF\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | 在指定位置绘制指定图像的指定区域。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::Details::StackArray\<PointF, N\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | 在指定位置绘制指定图像的指定区域。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int) | 在指定位置绘制指定的图像。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float) | 在指定位置绘制指定的图像。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Point) | 在指定位置绘制指定的图像。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, PointF) | 在指定位置绘制指定的图像。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int, int, int) | 将指定的图像绘制到指定的矩形内。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float, float, float) | 将指定的图像绘制到指定的矩形内。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, RectangleF, RectangleF, GraphicsUnit) | 在指定位置绘制指定图像的指定区域。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, Rectangle, GraphicsUnit) | 在指定位置绘制指定图像的指定区域。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int, Rectangle, GraphicsUnit) | 在指定位置绘制指定图像的指定区域。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const Rectangle\&) | 在指定位置绘制指定的图像。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const RectangleF\&) | 在指定位置绘制指定的图像。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | 将指定图像的指定区域绘制到指定的矩形内。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | 将指定图像的指定区域绘制到指定的矩形内。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit) | 将指定图像的指定区域绘制到指定的矩形内。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit) | 将指定图像的指定区域绘制到指定的矩形内。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort) | 未实现。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort) | 未实现。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort, IntPtr) | 未实现。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort, IntPtr) | 未实现。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<PointF\>\&, RectangleF, GraphicsUnit) | 未实现。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<PointF\>\&) | 未实现。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit) | 未实现。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit, const SharedPtr\<Imaging::ImageAttributes\>\&) | 在指定位置绘制指定图像的指定区域。 |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float, RectangleF, GraphicsUnit) | 在指定位置绘制指定图像的指定区域。 |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, int, int) | 在指定位置以原始物理尺寸绘制指定的图像。 |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, int, int, int, int) | 在指定位置以原始物理尺寸绘制指定的图像。 |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, const Rectangle\&) | 在指定位置以原始物理尺寸绘制指定的图像。 |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, const Point\&) | 在指定位置以原始物理尺寸绘制指定的图像。 |
| [DrawImageUnscaledAndClipped](./drawimageunscaledandclipped/)(const SharedPtr\<Image\>\&, Rectangle) | 未实现。 |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, Point, Point) | 使用指定的笔绘制指定的直线。 |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, PointF, PointF) | 使用指定的笔绘制指定的直线。 |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, int, int, int, int) | 使用指定的笔绘制指定的直线。 |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, float, float, float, float) | 使用指定的笔绘制指定的直线。 |
| [DrawLines](./drawlines/)(const SharedPtr\<Pen\>\&, const System::ArrayPtr\<System::Drawing::Point\>\&) | 使用指定的笔绘制一系列线段。 |
| [DrawLines](./drawlines/)(const SharedPtr\<Pen\>\&, const System::ArrayPtr\<System::Drawing::PointF\>\&) | 使用指定的笔绘制一系列线段。 |
| [DrawPath](./drawpath/)(const SharedPtr\<Pen\>\&, const SharedPtr\<Drawing2D::GraphicsPath\>\&) | 使用指定的笔绘制指定的路径。 |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t) | 在当前对象所表示的表面上使用指定的笔绘制指定的饼形。 |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float) | 在当前对象所表示的表面上使用指定的笔绘制指定的饼形。 |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, Rectangle, float, float) | 在当前对象所表示的表面上使用指定的笔绘制指定的饼形。 |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, RectangleF, float, float) | 在当前对象所表示的表面上使用指定的笔绘制指定的饼形。 |
| [DrawPolygon](./drawpolygon/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&) | 使用指定的笔绘制多边形。 |
| [DrawPolygon](./drawpolygon/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&) | 使用指定的笔绘制多边形。 |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, int, int, int, int) | 在当前对象所表示的表面上使用指定的笔绘制指定的矩形。 |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, float, float, float, float) | 在当前对象所表示的表面上使用指定的笔绘制指定的矩形。 |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, Rectangle) | 在当前对象所表示的表面上使用指定的笔绘制指定的矩形。 |
| [DrawRectangles](./drawrectangles/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Rectangle\>\&) | 使用指定的笔绘制一系列矩形。 |
| [DrawRectangles](./drawrectangles/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<RectangleF\>\&) | 使用指定的笔绘制一系列矩形。 |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, PointF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | 使用指定的字体和画刷在指定位置绘制指定的字符串。 |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, RectangleF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | 使用指定的字体和画刷在指定的矩形内绘制指定的字符串。 |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, float, float, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | 使用指定的字体和画刷在指定位置绘制指定的字符串。 |
| [EndContainer](./endcontainer/)(const SharedPtr\<Drawing2D::GraphicsContainer\>\&) | 关闭当前容器并从已保存容器的状态恢复此对象的状态。 |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<PointF\>\&, Graphics::EnumerateMetafileProc) | 未实现。 |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<Point\>\&, Graphics::EnumerateMetafileProc) | 未实现。 |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Point, Graphics::EnumerateMetafileProc) | 未实现。 |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, PointF, Graphics::EnumerateMetafileProc) | 未实现。 |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Rectangle, Graphics::EnumerateMetafileProc) | 未实现。 |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, RectangleF, Graphics::EnumerateMetafileProc) | 未实现。 |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Point, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | 未实现。 |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, PointF, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | 未实现。 |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | 未实现。 |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<PointF\>\&, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | 未实现。 |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Rectangle, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | 未实现。 |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, RectangleF, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | 未实现。 |
| [ExcludeClip](./excludeclip/)(Rectangle) | 未实现。 |
| [ExcludeClip](./excludeclip/)(const SharedPtr\<Region\>\&) | 未实现。 |
| [FillClosedCurve](./fillclosedcurve/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<PointF\>\&, Drawing2D::FillMode, float) | 使用指定的画刷绘制闭合样条。 |
| [FillClosedCurve](./fillclosedcurve/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Point\>\&, Drawing2D::FillMode, float) | 使用指定的画刷绘制闭合样条。 |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, Rectangle) | 使用指定的画刷填充由边界矩形指定的椭圆内部。 |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, RectangleF) | 使用指定的画刷填充由边界矩形指定的椭圆内部。 |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, int, int, int, int) | 使用指定的画刷填充由边界矩形指定的椭圆内部。 |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, float, float, float, float) | 使用指定的画刷填充由边界矩形指定的椭圆内部。 |
| [FillPath](./fillpath/)(const SharedPtr\<Brush\>\&, const SharedPtr\<Drawing2D::GraphicsPath\>\&) | 使用指定的画笔填充指定路径的内部。 |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, int, int, int, int, int, int) | 在当前对象表示的表面上，使用指定的画笔填充指定的饼形。 |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, float, float, float, float, float, float) | 在当前对象表示的表面上，使用指定的画笔填充指定的饼形。 |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, Rectangle, float, float) | 在当前对象表示的表面上，使用指定的画笔填充指定的饼形。 |
| [FillPolygon](./fillpolygon/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Point\>\&, Drawing2D::FillMode) | 使用指定的画笔填充指定多边形的内部。 |
| [FillPolygon](./fillpolygon/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<PointF\>\&, Drawing2D::FillMode) | 使用指定的画笔填充指定多边形的内部。 |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, float, float, float, float) | 使用指定的画笔填充指定的矩形。 |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, int, int, int, int) | 使用指定的画笔填充指定的矩形。 |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, Rectangle) | 使用指定的画笔填充指定的矩形。 |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, RectangleF) | 使用指定的画笔填充指定的矩形。 |
| [FillRectangles](./fillrectangles/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Rectangle\>\&) | 使用指定的画笔填充一系列矩形。 |
| [FillRectangles](./fillrectangles/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<RectangleF\>\&) | 使用指定的画笔填充一系列矩形。 |
| [FillRegion](./fillregion/)(const SharedPtr\<Brush\>\&, const SharedPtr\<Region\>\&) | 使用指定的画笔填充指定区域的内部。 |
| [Flush](./flush/)(Drawing2D::FlushIntention) | 触发立即执行所有挂起的绘图操作。 |
| static [FromHwnd](./fromhwnd/)(IntPtr) | 未实现。 |
| static [FromHwndInternal](./fromhwndinternal/)(IntPtr) | 未实现。 |
| static [FromImage](./fromimage/)(const SharedPtr\<Image\>\&) | 从指定的图像创建一个新的 [Graphics](./) 对象。 |
| [get_Clip](./get_clip/)() | 返回一个 [Region](../region/) 对象，表示限制当前 [Graphics](./) 对象所表示的绘图表面绘制区域的区域。 |
| [get_ClipBounds](./get_clipbounds/)() const | 返回一个矩形，界定当前对象所表示表面的裁剪区域。 |
| [get_CompositingMode](./get_compositingmode/)() | 返回一个值，指示复合图像在当前对象所表示的表面上的绘制方式。 |
| [get_CompositingQuality](./get_compositingquality/)() | 返回一个值，指示在复合图像时使用的质量级别。 |
| [get_DpiX](./get_dpix/)() | 返回水平分辨率。 |
| [get_DpiY](./get_dpiy/)() | 返回垂直分辨率。 |
| [get_InterpolationMode](./get_interpolationmode/)() | 返回一个值，指示与当前对象关联的插值模式。 |
| [get_IsClipEmpty](./get_isclipempty/)() const | 未实现。 |
| [get_IsVisibleClipEmpty](./get_isvisibleclipempty/)() const | 未实现。 |
| [get_PageScale](./get_pagescale/)() const | 返回当前 [Graphics](./) 对象的世界单位与页面单位之间的缩放比例。 |
| [get_PageUnit](./get_pageunit/)() const | 返回用于当前对象所表示表面上页面坐标的测量单位。 |
| [get_PixelOffsetMode](./get_pixeloffsetmode/)() | 返回一个值，指示在当前对象所表示的表面上渲染时像素的偏移方式。 |
| [get_RenderingOrigin](./get_renderingorigin/)() const | 返回一个 [Point](../point/) 对象，表示当前 [Graphics](./) 对象用于抖动和填充画笔的渲染原点。 |
| [get_SmoothingMode](./get_smoothingmode/)() | 返回一个值，指示在当前对象所表示的表面上渲染时使用的平滑模式。 |
| [get_TextContrast](./get_textcontrast/)() const | 未实现。 |
| [get_TextRenderingHint](./get_textrenderinghint/)() | 返回一个值，指示文本渲染的质量。 |
| [get_Transform](./get_transform/)() | 返回当前 [Graphics](./) 对象的几何世界变换。 |
| [get_VisibleClipBounds](./get_visibleclipbounds/)() const | 返回一个 [RectangleF](../rectanglef/) 对象，表示当前 [Graphics](./) 对象可见裁剪区域的边界矩形。 |
| [GetHdc](./gethdc/)() | 未实现。 |
| [GetNearestColor](./getnearestcolor/)(Color) | 未实现。 |
| [GetSkCanvas](./getskcanvas/)() const |  |
| [IntersectClip](./intersectclip/)(const System::SharedPtr\<Region\>\&) | 将此对象的裁剪区域更新为当前裁剪区域与指定裁剪区域的交集。 |
| [IntersectClip](./intersectclip/)(System::Drawing::RectangleF) | 将此对象的裁剪区域更新为当前裁剪区域与指定裁剪区域的交集。 |
| [IntersectClip](./intersectclip/)(System::Drawing::Rectangle) | 将此对象的裁剪区域更新为当前裁剪区域与指定裁剪区域的交集。 |
| [IsVisible](./isvisible/)(Point) | 确定指定点是否位于当前 [Graphics](./) 对象的可见裁剪区域内。 |
| [IsVisible](./isvisible/)(PointF) | 未实现。 |
| [IsVisible](./isvisible/)(Rectangle) | 未实现。 |
| [IsVisible](./isvisible/)(RectangleF) | 未实现。 |
| [IsVisible](./isvisible/)(int32_t, int32_t) | 未实现。 |
| [IsVisible](./isvisible/)(float, float) | 未实现。 |
| [IsVisible](./isvisible/)(float, float, float, float) | 未实现。 |
| [IsVisible](./isvisible/)(int32_t, int32_t, int32_t, int32_t) | 未实现。 |
| [MeasureCharacterRanges](./measurecharacterranges/)(const System::String\&, const SharedPtr\<Font\>\&, RectangleF, const SharedPtr\<StringFormat\>\&) | 返回一个区域数组，每个区域限定指定字符串中的字符位置。 |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, PointF const\&, System::SharedPtr\<StringFormat\> const\&) const | 返回在指定字体和指定格式下绘制的指定字符串的大小。 |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, int, System::SharedPtr\<StringFormat\> const\&) const | 返回在指定字体和指定格式下绘制的指定字符串的大小。 |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&, int\&, int\&) const | 未实现。 |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&) const | 返回在指定字体和指定格式下绘制的指定字符串的大小。 |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | 将当前 [Graphics](./) 对象的世界变换矩阵乘以指定的矩阵。 |
| [ReleaseHdc](./releasehdc/)() | 未实现。 |
| [ReleaseHdc](./releasehdc/)(IntPtr) | 未实现。 |
| [ResetClip](./resetclip/)() | 将此图形的裁剪区域重置为无限区域。 |
| [ResetTransform](./resettransform/)() | 将当前对象的世界变换矩阵重置为单位矩阵。 |
| [Restore](./restore/)(const SharedPtr\<Drawing2D::GraphicsState\>\&) | 从已保存的状态恢复此对象的状态。 |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | 按指定顺序将指定的旋转应用于当前 [Graphics](./) 对象的世界变换矩阵。 |
| [Save](./save/)() | 保存此对象的当前状态并返回已保存的状态。 |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | 将指定的缩放向量应用于当前对象的世界变换矩阵。 |
| [set_Clip](./set_clip/)(const SharedPtr\<Region\>\&) | 设置一个区域，以限制当前所表示的绘图表面的绘制区域。 |
| [set_CompositingMode](./set_compositingmode/)(Drawing2D::CompositingMode) | 设置一个值，指定复合图像在当前对象所表示的表面上的绘制方式。 |
| [set_CompositingQuality](./set_compositingquality/)(Drawing2D::CompositingQuality) | 设置一个值，指定在复合图像时使用的质量级别。 |
| [set_InterpolationMode](./set_interpolationmode/)(Drawing2D::InterpolationMode) | 设置一个值，指示与当前对象关联的插值模式。 |
| [set_PageScale](./set_pagescale/)(float) | 为当前 [Graphics](./) 对象设置世界单位与页面单位之间的缩放比例。 |
| [set_PageUnit](./set_pageunit/)(GraphicsUnit) | 设置用于当前对象所表示表面上页面坐标的测量单位。 |
| [set_PixelOffsetMode](./set_pixeloffsetmode/)(Drawing2D::PixelOffsetMode) | 设置一个值，指定在当前对象所表示的表面上渲染时像素的偏移方式。 |
| [set_RenderingOrigin](./set_renderingorigin/)(Point) | 设置一个 [Point](../point/) 对象，指定当前 [Graphics](./) 对象用于抖动和填充刷的渲染原点。 |
| [set_SmoothingMode](./set_smoothingmode/)(Drawing2D::SmoothingMode) | 设置一个值，指定在当前对象所表示的表面上渲染时使用的平滑模式。 |
| [set_TextContrast](./set_textcontrast/)(int32_t) | 未实现。 |
| [set_TextRenderingHint](./set_textrenderinghint/)(Text::TextRenderingHint) | 设置一个值，指定文本渲染的质量。 |
| [set_Transform](./set_transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | 为当前 [Graphics](./) 对象设置几何世界变换。 |
| [SetClip](./setclip/)(const SharedPtr\<Region\>\&, Drawing2D::CombineMode) | 将当前 [Graphics](./) 对象所表示的绘图表面的裁剪区域设置为将当前裁剪区域与指定区域组合的指定操作的结果。 |
| [SetClip](./setclip/)(Rectangle, Drawing2D::CombineMode) | 将当前 [Graphics](./) 对象所表示的绘图表面的裁剪区域设置为将当前裁剪区域与指定区域组合的指定操作的结果。 |
| [SetClip](./setclip/)(RectangleF, Drawing2D::CombineMode) | 将当前 [Graphics](./) 对象所表示的绘图表面的裁剪区域设置为将当前裁剪区域与指定区域组合的指定操作的结果。 |
| [SetClip](./setclip/)(const SharedPtr\<Graphics\>\&, Drawing2D::CombineMode) | 未实现。 |
| [SetClip](./setclip/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&, Drawing2D::CombineMode) | 将当前 [Graphics](./) 对象所表示的绘图表面的裁剪区域设置为将当前裁剪区域与由图形路径指定的区域组合的指定操作的结果。 |
| [TransformPoints](./transformpoints/)(Drawing2D::CoordinateSpace, Drawing2D::CoordinateSpace, const ArrayPtr\<System::Drawing::Point\>\&) | 未实现。 |
| [TransformPoints](./transformpoints/)(Drawing2D::CoordinateSpace, Drawing2D::CoordinateSpace, const ArrayPtr\<System::Drawing::PointF\>\&) | 未实现。 |
| [TranslateClip](./translateclip/)(int, int) | 未实现。 |
| [TranslateClip](./translateclip/)(float, float) | 未实现。 |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | 将指定的平移向量应用于当前 [Graphics](./) 对象的世界变换矩阵。 |
| [~Graphics](./~graphics/)() |  |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [DrawImageAbort](./drawimageabort/) | 用于 DrawImage 方法参数的回调函数对象的类型。 |
| [EnumerateMetafileProc](./enumeratemetafileproc/) | 用于 EnumerateMetafile 方法参数的回调函数对象的类型。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
