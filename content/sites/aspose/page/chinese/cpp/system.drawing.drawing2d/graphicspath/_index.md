---
title: "System::Drawing::Drawing2D::GraphicsPath 类"
linktitle: "GraphicsPath"
second_title: "Aspose.Page 适用于 C++"
description: "System::Drawing::Drawing2D::GraphicsPath 类。表示一组相连的直线和曲线。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 600
url: /zh/cpp/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class


表示一组相连的直线和曲线。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class GraphicsPath : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AddArc](./addarc/)(float, float, float, float, float, float) | 将指定的椭圆弧添加到当前对象表示的路径中。 |
| [AddArc](./addarc/)(int, int, int, int, float, float) | 将指定的椭圆弧添加到当前对象表示的路径中。 |
| [AddArc](./addarc/)(const RectangleF\&, float, float) | 将指定的椭圆弧添加到当前对象表示的路径中。 |
| [AddArc](./addarc/)(const Rectangle\&, float, float) | 将指定的椭圆弧添加到当前对象表示的路径中。 |
| [AddBezier](./addbezier/)(const Point\&, const Point\&, const Point\&, const Point\&) | 将指定的三次贝塞尔曲线添加到当前对象表示的路径中。 |
| [AddBezier](./addbezier/)(const PointF\&, const PointF\&, const PointF\&, const PointF\&) | 将指定的三次贝塞尔曲线添加到当前对象表示的路径中。 |
| [AddBezier](./addbezier/)(int, int, int, int, int, int, int, int) | 将指定的三次贝塞尔曲线添加到当前对象表示的路径中。 |
| [AddBezier](./addbezier/)(float, float, float, float, float, float, float, float) | 将指定的三次贝塞尔曲线添加到当前对象表示的路径中。 |
| [AddBeziers](./addbeziers/)(const ArrayPtr\<Point\>\&) | 将一系列相连的三次贝塞尔曲线添加到当前图形中。 |
| [AddBeziers](./addbeziers/)(const ArrayPtr\<PointF\>\&) | 将一系列相连的三次贝塞尔曲线添加到当前图形中。 |
| [AddClosedCurve](./addclosedcurve/)(const ArrayPtr\<PointF\>\&, float) | 将指定的闭合曲线添加到当前对象表示的路径中。 |
| [AddClosedCurve](./addclosedcurve/)(const ArrayPtr\<Point\>\&, float) | 将指定的闭合曲线添加到当前对象表示的路径中。 |
| [AddCurve](./addcurve/)(const ArrayPtr\<PointF\>\&, float) | 将指定的曲线添加到当前对象表示的路径中。 |
| [AddCurve](./addcurve/)(const ArrayPtr\<Point\>\&, float) | 将指定的曲线添加到当前对象表示的路径中。 |
| [AddCurve](./addcurve/)(const ArrayPtr\<PointF\>\&, int, int, float) | 将指定的曲线添加到当前对象表示的路径中。 |
| [AddCurve](./addcurve/)(const ArrayPtr\<Point\>\&, int, int, float) | 将指定的曲线添加到当前对象表示的路径中。 |
| [AddEllipse](./addellipse/)(float, float, float, float) | 将指定的椭圆添加到当前对象表示的路径中。 |
| [AddEllipse](./addellipse/)(int, int, int, int) | 将指定的椭圆添加到当前对象表示的路径中。 |
| [AddEllipse](./addellipse/)(const RectangleF\&) | 将指定的椭圆添加到当前对象表示的路径中。 |
| [AddEllipse](./addellipse/)(const Rectangle\&) | 将指定的椭圆添加到当前对象表示的路径中。 |
| [AddLine](./addline/)(const Point\&, const Point\&) | 将指定的直线添加到当前对象表示的路径中。 |
| [AddLine](./addline/)(const PointF\&, const PointF\&) | 将指定的直线添加到当前对象表示的路径中。 |
| [AddLine](./addline/)(int, int, int, int) | 将指定的直线添加到当前对象表示的路径中。 |
| [AddLine](./addline/)(float, float, float, float) | 将指定的直线添加到当前对象表示的路径中。 |
| [AddLines](./addlines/)(const ArrayPtr\<PointF\>\&) | 将指定的一系列相连的线段添加到当前对象表示的路径中。 |
| [AddLines](./addlines/)(const ArrayPtr\<Point\>\&) | 将指定的一系列相连的线段添加到当前对象表示的路径中。 |
| [AddPath](./addpath/)(const SharedPtr\<GraphicsPath\>\&, bool) | 将指定的路径添加到当前对象表示的路径中。 |
| [AddPie](./addpie/)(float, float, float, float, float, float) | 将指定的饼形轮廓添加到当前对象表示的路径中。 |
| [AddPie](./addpie/)(int, int, int, int, float, float) | 将指定的饼形轮廓添加到当前对象表示的路径中。 |
| [AddPie](./addpie/)(const Rectangle\&, float, float) | 将指定的饼形轮廓添加到当前对象表示的路径中。 |
| [AddPolygon](./addpolygon/)(const ArrayPtr\<PointF\>\&) | 将指定的多边形添加到当前对象表示的路径中。 |
| [AddPolygon](./addpolygon/)(const ArrayPtr\<Point\>\&) | 将指定的多边形添加到当前对象表示的路径中。 |
| [AddRectangle](./addrectangle/)(const Rectangle\&) | 将指定的矩形添加到当前对象表示的路径中。 |
| [AddRectangle](./addrectangle/)(const RectangleF\&) | 将指定的矩形添加到当前对象表示的路径中。 |
| [AddRectangles](./addrectangles/)(const ArrayPtr\<Rectangle\>\&) | 将指定的一系列矩形添加到当前对象表示的路径中。 |
| [AddRectangles](./addrectangles/)(const ArrayPtr\<RectangleF\>\&) | 将指定的一系列矩形添加到当前对象表示的路径中。 |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, Point, const SharedPtr\<StringFormat\>\&) | 将一串文本添加到当前对象表示的路径中。 |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, PointF, const SharedPtr\<StringFormat\>\&) | 将一串文本添加到当前对象表示的路径中。 |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, Rectangle, const SharedPtr\<StringFormat\>\&) | 将一串文本添加到当前对象表示的路径中。 |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, RectangleF, const SharedPtr\<StringFormat\>\&) | 将一串文本添加到当前对象表示的路径中。 |
| virtual [Clone](./clone/)() | 创建当前对象的副本。 |
| [CloseAllFigures](./closeallfigures/)() | 关闭所有打开的图形并开始一个新图形。 |
| [CloseFigure](./closefigure/)() | 关闭当前图形并开始一个新图形。 |
| [Dispose](./dispose/)() | 释放当前对象获取的所有操作系统资源。 |
| [Flatten](./flatten/)() | 通过将路径中的每条曲线转换为一系列相连的直线来将其展平。使用的平整度值为 0.25。 |
| [Flatten](./flatten/)(const MatrixPtr\&) | 通过将路径中的每条曲线转换为一系列相连的直线来将其展平。使用的平整度值为 0.25。 |
| [Flatten](./flatten/)(const MatrixPtr\&, float) | 通过将路径中的每条曲线转换为一系列相连的直线来将其展平。 |
| [get_FillMode](./get_fillmode/)() | 返回当前对象的填充模式。 |
| [get_PathData](./get_pathdata/)() | 返回一个包含构成当前对象表示的路径的点及其类型的 [PathData](../pathdata/) 对象。 |
| [get_PathPoints](./get_pathpoints/)() const | 返回一个包含构成当前对象表示的路径的点的数组。 |
| [get_PathTypes](./get_pathtypes/)() const | 返回一个包含指示构成当前对象表示的路径的点类型的值的数组。 |
| [get_PointCount](./get_pointcount/)() const | 返回当前对象表示的路径中的点数。 |
| [GetBounds](./getbounds/)(const MatrixPtr\&, const SharedPtr\<Pen\>\&) const | 返回一个 [RectangleF](../../system.drawing/rectanglef/) 对象，该对象表示在使用指定矩阵变换后，包围当前对象表示的路径的矩形。 |
| [GetFigureFlags](./getfigureflags/)() | 返回一个值，该值是 Detail::FigureType 值的按位组合，用于指示当前对象所表示路径中包含的图形类型。 |
| [GetLastPoint](./getlastpoint/)() const | 返回一个表示路径中最后一点的 [PointF](../../system.drawing/pointf/) 对象。 |
| [GraphicsPath](./graphicspath/)(FillMode) | 使用指定的填充模式构造一个新的 [GraphicsPath](./) 类实例。 |
| [GraphicsPath](./graphicspath/)(const ArrayPtr\<Point\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) | 构造一个表示指定路径的新的 [GraphicsPath](./) 对象实例。 |
| [GraphicsPath](./graphicspath/)(const ArrayPtr\<PointF\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) | 构造一个表示指定路径的新的 [GraphicsPath](./) 对象实例。 |
| [GraphicsPath](./graphicspath/)(const SkPath\&) |  |
| [IsOutlineVisible](./isoutlinevisible/)(const PointF\&, const SharedPtr\<Pen\>\&) | 指示在使用指定的 [Pen](../../system.drawing/pen/) 绘制时，指定点是否位于此 [GraphicsPath](./) 的轮廓内部（下方）。未实现。 |
| [IsVisible](./isvisible/)(const PointF\&) | 确定指定点是否位于当前对象所表示的路径内部。 |
| [IsVisible](./isvisible/)(float, float) | 确定指定点是否位于当前对象所表示的路径内部。 |
| [Reset](./reset/)() | 通过移除所有点来清空路径。 |
| [Reverse](./reverse/)() | 反转此 [GraphicsPath](./) 的 PathPoints 数组中的点顺序。 |
| [set_FillMode](./set_fillmode/)(FillMode) | 设置当前对象的填充模式。 |
| [SetMarkers](./setmarkers/)() | 未实现。 |
| [StartFigure](./startfigure/)() | 开始一个新图形。 |
| [Transform](./transform/)(const MatrixPtr\&) | 通过对当前对象所表示的路径应用指定的变换矩阵来转换该路径。 |
| [Transform](./transform/)(const SkMatrix\&) |  |
| [Widen](./widen/)(const SharedPtr\<Pen\>\&) | 用原始路径的轮廓替换此路径。 |
| [~GraphicsPath](./~graphicspath/)() | 析构函数。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
