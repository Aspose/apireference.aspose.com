---
title: "System::Drawing::Drawing2D::GraphicsPath 类"
linktitle: "GraphicsPath"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Drawing2D::GraphicsPath 类。表示一组相连的直线和曲线。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 600
url: /zh/cpp/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class


表示一组相连的直线和曲线。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class GraphicsPath : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AddArc](./addarc/)(float, float, float, float, float, float) | 向当前对象表示的路径添加指定的椭圆弧。 |
| [AddArc](./addarc/)(int, int, int, int, float, float) | 向当前对象表示的路径添加指定的椭圆弧。 |
| [AddArc](./addarc/)(const RectangleF\&, float, float) | 向当前对象表示的路径添加指定的椭圆弧。 |
| [AddArc](./addarc/)(const Rectangle\&, float, float) | 向当前对象表示的路径添加指定的椭圆弧。 |
| [AddBezier](./addbezier/)(const Point\&, const Point\&, const Point\&, const Point\&) | 向当前对象表示的路径添加指定的三次贝塞尔曲线。 |
| [AddBezier](./addbezier/)(const PointF\&, const PointF\&, const PointF\&, const PointF\&) | 向当前对象表示的路径添加指定的三次贝塞尔曲线。 |
| [AddBezier](./addbezier/)(int, int, int, int, int, int, int, int) | 向当前对象表示的路径添加指定的三次贝塞尔曲线。 |
| [AddBezier](./addbezier/)(float, float, float, float, float, float, float, float) | 向当前对象表示的路径添加指定的三次贝塞尔曲线。 |
| [AddBeziers](./addbeziers/)(const ArrayPtr\<Point\>\&) | 向当前图形添加一系列相连的三次贝塞尔曲线。 |
| [AddBeziers](./addbeziers/)(const ArrayPtr\<PointF\>\&) | 向当前图形添加一系列相连的三次贝塞尔曲线。 |
| [AddClosedCurve](./addclosedcurve/)(const ArrayPtr\<PointF\>\&, float) | 向当前对象表示的路径添加指定的闭合曲线。 |
| [AddClosedCurve](./addclosedcurve/)(const ArrayPtr\<Point\>\&, float) | 向当前对象表示的路径添加指定的闭合曲线。 |
| [AddCurve](./addcurve/)(const ArrayPtr\<PointF\>\&, float) | 向当前对象表示的路径添加指定的曲线。 |
| [AddCurve](./addcurve/)(const ArrayPtr\<Point\>\&, float) | 向当前对象表示的路径添加指定的曲线。 |
| [AddCurve](./addcurve/)(const ArrayPtr\<PointF\>\&, int, int, float) | 向当前对象表示的路径添加指定的曲线。 |
| [AddCurve](./addcurve/)(const ArrayPtr\<Point\>\&, int, int, float) | 向当前对象表示的路径添加指定的曲线。 |
| [AddEllipse](./addellipse/)(float, float, float, float) | 向当前对象表示的路径添加指定的椭圆。 |
| [AddEllipse](./addellipse/)(int, int, int, int) | 向当前对象表示的路径添加指定的椭圆。 |
| [AddEllipse](./addellipse/)(const RectangleF\&) | 向当前对象表示的路径添加指定的椭圆。 |
| [AddEllipse](./addellipse/)(const Rectangle\&) | 向当前对象表示的路径添加指定的椭圆。 |
| [AddLine](./addline/)(const Point\&, const Point\&) | 向当前对象表示的路径添加指定的直线。 |
| [AddLine](./addline/)(const PointF\&, const PointF\&) | 向当前对象表示的路径添加指定的直线。 |
| [AddLine](./addline/)(int, int, int, int) | 向当前对象表示的路径添加指定的直线。 |
| [AddLine](./addline/)(float, float, float, float) | 向当前对象表示的路径添加指定的直线。 |
| [AddLines](./addlines/)(const ArrayPtr\<PointF\>\&) | 向当前对象表示的路径添加指定的一系列相连的线段。 |
| [AddLines](./addlines/)(const ArrayPtr\<Point\>\&) | 向当前对象表示的路径添加指定的一系列相连的线段。 |
| [AddPath](./addpath/)(const SharedPtr\<GraphicsPath\>\&, bool) | 向当前对象表示的路径添加指定的路径。 |
| [AddPie](./addpie/)(float, float, float, float, float, float) | 向当前对象表示的路径添加指定的饼形轮廓。 |
| [AddPie](./addpie/)(int, int, int, int, float, float) | 向当前对象表示的路径添加指定的饼形轮廓。 |
| [AddPie](./addpie/)(const Rectangle\&, float, float) | 向当前对象表示的路径添加指定的饼形轮廓。 |
| [AddPolygon](./addpolygon/)(const ArrayPtr\<PointF\>\&) | 向当前对象表示的路径添加指定的多边形。 |
| [AddPolygon](./addpolygon/)(const ArrayPtr\<Point\>\&) | 向当前对象表示的路径添加指定的多边形。 |
| [AddRectangle](./addrectangle/)(const Rectangle\&) | 向当前对象表示的路径添加指定的矩形。 |
| [AddRectangle](./addrectangle/)(const RectangleF\&) | 向当前对象表示的路径添加指定的矩形。 |
| [AddRectangles](./addrectangles/)(const ArrayPtr\<Rectangle\>\&) | 向当前对象表示的路径添加指定的一系列矩形。 |
| [AddRectangles](./addrectangles/)(const ArrayPtr\<RectangleF\>\&) | 向当前对象表示的路径添加指定的一系列矩形。 |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, Point, const SharedPtr\<StringFormat\>\&) | 向当前对象表示的路径添加一串文本。 |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, PointF, const SharedPtr\<StringFormat\>\&) | 向当前对象表示的路径添加一串文本。 |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, Rectangle, const SharedPtr\<StringFormat\>\&) | 向当前对象表示的路径添加一串文本。 |
| [AddString](./addstring/)(const String\&, const SharedPtr\<FontFamily\>\&, int, float, RectangleF, const SharedPtr\<StringFormat\>\&) | 向当前对象表示的路径添加一串文本。 |
| virtual [Clone](./clone/)() | 创建当前对象的副本。 |
| [CloseAllFigures](./closeallfigures/)() | 关闭所有未闭合的图形并开始一个新图形。 |
| [CloseFigure](./closefigure/)() | 关闭当前图形并开始一个新图形。 |
| [Dispose](./dispose/)() | 释放当前对象获取的所有操作系统资源。 |
| [Flatten](./flatten/)() | 通过将路径中的每条曲线转换为一系列相连的直线来将其扁平化。使用的平整度值为 0.25。 |
| [Flatten](./flatten/)(const MatrixPtr\&) | 通过将路径中的每条曲线转换为一系列相连的直线来将其扁平化。使用的平整度值为 0.25。 |
| [Flatten](./flatten/)(const MatrixPtr\&, float) | 通过将路径中的每条曲线转换为一系列相连的直线来将其扁平化。 |
| [get_FillMode](./get_fillmode/)() | 返回当前对象的填充模式。 |
| [get_PathData](./get_pathdata/)() | 返回一个 [PathData](../pathdata/) 对象，其中包含构成当前对象表示的路径的点及其类型。 |
| [get_PathPoints](./get_pathpoints/)() const | 返回一个数组，包含构成当前对象表示的路径的点。 |
| [get_PathTypes](./get_pathtypes/)() const | 返回一个数组，其中包含指示由当前对象表示的路径所组成的点的类型的值。 |
| [get_PointCount](./get_pointcount/)() const | 返回由当前对象表示的路径中的点数。 |
| [GetBounds](./getbounds/)(const MatrixPtr\&, const SharedPtr\<Pen\>\&) const | 返回一个 [RectangleF](../../system.drawing/rectanglef/) 对象，该对象表示在使用指定矩阵变换后，包围由当前对象表示的路径的矩形。 |
| [GetFigureFlags](./getfigureflags/)() | 返回一个值，该值是 Detail::FigureType 值的按位组合，用于指示由当前对象表示的路径中包含的图形类型。 |
| [GetLastPoint](./getlastpoint/)() const | 返回一个 [PointF](../../system.drawing/pointf/) 对象，表示路径中的最后一个点。 |
| [GraphicsPath](./graphicspath/)(FillMode) | 使用指定的填充模式构造一个新的 [GraphicsPath](./) 类实例。 |
| [GraphicsPath](./graphicspath/)(const ArrayPtr\<Point\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) | 构造一个新的 [GraphicsPath](./) 对象实例，该对象表示指定的路径。 |
| [GraphicsPath](./graphicspath/)(const ArrayPtr\<PointF\>\&, const ArrayPtr\<uint8_t\>\&, FillMode) | 构造一个新的 [GraphicsPath](./) 对象实例，该对象表示指定的路径。 |
| [GraphicsPath](./graphicspath/)(const SkPath\&) |  |
| [IsOutlineVisible](./isoutlinevisible/)(const PointF\&, const SharedPtr\<Pen\>\&) | 指示在使用指定的 [Pen](../../system.drawing/pen/) 绘制时，指定的点是否位于此 [GraphicsPath](./) 的轮廓内部（下方）。未实现。 |
| [IsVisible](./isvisible/)(const PointF\&) | 确定指定的点是否位于由当前对象表示的路径内部。 |
| [IsVisible](./isvisible/)(float, float) | 确定指定的点是否位于由当前对象表示的路径内部。 |
| [Reset](./reset/)() | 通过移除所有点来清空路径。 |
| [Reverse](./reverse/)() | 反转此 [GraphicsPath](./) 的 PathPoints 数组中的点顺序。 |
| [set_FillMode](./set_fillmode/)(FillMode) | 设置当前对象的填充模式。 |
| [SetMarkers](./setmarkers/)() | 未实现。 |
| [StartFigure](./startfigure/)() | 开始一个新图形。 |
| [Transform](./transform/)(const MatrixPtr\&) | 通过对其应用指定的变换矩阵来转换由当前对象表示的路径。 |
| [Transform](./transform/)(const SkMatrix\&) |  |
| [Widen](./widen/)(const SharedPtr\<Pen\>\&) | 用原始路径的轮廓替换此路径。 |
| [~GraphicsPath](./~graphicspath/)() | 析构函数。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
