---
title: GraphicsPath
second_title: Справочник по API Aspose.Drawing для .NET
description: 
type: docs
weight: 230
url: /ru/net/aspose.drawing.drawing2d/graphicspath/
---
## GraphicsPath class

```csharp
public class GraphicsPath : IDisposable
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [GraphicsPath](graphicspath#constructor)() | Конструктор по умолчанию. |
| [GraphicsPath](graphicspath#constructor_1)(FillMode) |  |
| [GraphicsPath](graphicspath#constructor_2)(PointF[], byte[]) |  |
| [GraphicsPath](graphicspath#constructor_4)(Point[], byte[]) |  |
| [GraphicsPath](graphicspath#constructor_3)(PointF[], byte[], FillMode) |  |
| [GraphicsPath](graphicspath#constructor_5)(Point[], byte[], FillMode) |  |

## Характеристики

| Имя | Описание |
| --- | --- |
| [FillMode](../../aspose.drawing.drawing2d/graphicspath/fillmode) { get; set; } |  |
| [PathData](../../aspose.drawing.drawing2d/graphicspath/pathdata) { get; } |  |
| [PathPoints](../../aspose.drawing.drawing2d/graphicspath/pathpoints) { get; } |  |
| [PathTypes](../../aspose.drawing.drawing2d/graphicspath/pathtypes) { get; } |  |
| [PointCount](../../aspose.drawing.drawing2d/graphicspath/pointcount) { get; } |  |

## Методы

| Имя | Описание |
| --- | --- |
| [AddArc](../../aspose.drawing.drawing2d/graphicspath/addarc#addarc)(RectangleF, float, float) |  |
| [AddArc](../../aspose.drawing.drawing2d/graphicspath/addarc#addarc_1)(float, float, float, float, float, float) |  |
| [AddBezier](../../aspose.drawing.drawing2d/graphicspath/addbezier#addbezier)(PointF, PointF, PointF, PointF) |  |
| [AddBezier](../../aspose.drawing.drawing2d/graphicspath/addbezier#addbezier_1)(float, float, float, float, float, float, float, float) |  |
| [AddBeziers](../../aspose.drawing.drawing2d/graphicspath/addbeziers#addbeziers)(PointF[]) |  |
| [AddBeziers](../../aspose.drawing.drawing2d/graphicspath/addbeziers#addbeziers_1)(Point[]) |  |
| [AddClosedCurve](../../aspose.drawing.drawing2d/graphicspath/addclosedcurve#addclosedcurve)(PointF[]) |  |
| [AddClosedCurve](../../aspose.drawing.drawing2d/graphicspath/addclosedcurve#addclosedcurve_1)(PointF[], float) |  |
| [AddCurve](../../aspose.drawing.drawing2d/graphicspath/addcurve#addcurve)(PointF[]) |  |
| [AddCurve](../../aspose.drawing.drawing2d/graphicspath/addcurve#addcurve_3)(Point[]) |  |
| [AddCurve](../../aspose.drawing.drawing2d/graphicspath/addcurve#addcurve_2)(PointF[], float) |  |
| [AddCurve](../../aspose.drawing.drawing2d/graphicspath/addcurve#addcurve_1)(PointF[], int, int, float) |  |
| [AddEllipse](../../aspose.drawing.drawing2d/graphicspath/addellipse#addellipse)(RectangleF) |  |
| [AddEllipse](../../aspose.drawing.drawing2d/graphicspath/addellipse#addellipse_1)(float, float, float, float) |  |
| [AddLine](../../aspose.drawing.drawing2d/graphicspath/addline#addline)(PointF, PointF) |  |
| [AddLine](../../aspose.drawing.drawing2d/graphicspath/addline#addline_1)(float, float, float, float) |  |
| [AddLines](../../aspose.drawing.drawing2d/graphicspath/addlines#addlines)(PointF[]) |  |
| [AddLines](../../aspose.drawing.drawing2d/graphicspath/addlines#addlines_1)(Point[]) |  |
| [AddPath](../../aspose.drawing.drawing2d/graphicspath/addpath)(GraphicsPath, bool) |  |
| [AddPie](../../aspose.drawing.drawing2d/graphicspath/addpie#addpie)(Rectangle, float, float) |  |
| [AddPie](../../aspose.drawing.drawing2d/graphicspath/addpie#addpie_1)(float, float, float, float, float, float) |  |
| [AddPolygon](../../aspose.drawing.drawing2d/graphicspath/addpolygon#addpolygon)(PointF[]) |  |
| [AddPolygon](../../aspose.drawing.drawing2d/graphicspath/addpolygon#addpolygon_1)(Point[]) |  |
| [AddRectangle](../../aspose.drawing.drawing2d/graphicspath/addrectangle#addrectangle)(Rectangle) |  |
| [AddRectangle](../../aspose.drawing.drawing2d/graphicspath/addrectangle#addrectangle_1)(RectangleF) |  |
| [AddRectangles](../../aspose.drawing.drawing2d/graphicspath/addrectangles#addrectangles)(RectangleF[]) |  |
| [AddRectangles](../../aspose.drawing.drawing2d/graphicspath/addrectangles#addrectangles_1)(Rectangle[]) |  |
| [AddString](../../aspose.drawing.drawing2d/graphicspath/addstring#addstring)(string, FontFamily, int, float, Point, StringFormat) |  |
| [AddString](../../aspose.drawing.drawing2d/graphicspath/addstring#addstring_1)(string, FontFamily, int, float, PointF, StringFormat) |  |
| [AddString](../../aspose.drawing.drawing2d/graphicspath/addstring#addstring_2)(string, FontFamily, int, float, Rectangle, StringFormat) |  |
| [AddString](../../aspose.drawing.drawing2d/graphicspath/addstring#addstring_3)(string, FontFamily, int, float, RectangleF, StringFormat) |  |
| [Clone](../../aspose.drawing.drawing2d/graphicspath/clone)() |  |
| [CloseAllFigures](../../aspose.drawing.drawing2d/graphicspath/closeallfigures)() |  |
| [CloseFigure](../../aspose.drawing.drawing2d/graphicspath/closefigure)() |  |
| [Dispose](../../aspose.drawing.drawing2d/graphicspath/dispose)() |  |
| [Flatten](../../aspose.drawing.drawing2d/graphicspath/flatten)() |  |
| [GetBounds](../../aspose.drawing.drawing2d/graphicspath/getbounds#getbounds)() |  |
| [GetBounds](../../aspose.drawing.drawing2d/graphicspath/getbounds#getbounds_1)(Matrix) |  |
| [GetBounds](../../aspose.drawing.drawing2d/graphicspath/getbounds#getbounds_2)(Matrix, Pen) |  |
| [GetLastPoint](../../aspose.drawing.drawing2d/graphicspath/getlastpoint)() |  |
| [IsOutlineVisible](../../aspose.drawing.drawing2d/graphicspath/isoutlinevisible)(PointF, Pen) |  |
| [IsVisible](../../aspose.drawing.drawing2d/graphicspath/isvisible)(PointF) |  |
| [Reset](../../aspose.drawing.drawing2d/graphicspath/reset)() |  |
| [Reverse](../../aspose.drawing.drawing2d/graphicspath/reverse)() |  |
| [SetMarkers](../../aspose.drawing.drawing2d/graphicspath/setmarkers)() |  |
| [StartFigure](../../aspose.drawing.drawing2d/graphicspath/startfigure)() |  |
| [Transform](../../aspose.drawing.drawing2d/graphicspath/transform)(Matrix) |  |
| [Warp](../../aspose.drawing.drawing2d/graphicspath/warp#warp)(PointF[], RectangleF) |  |
| [Warp](../../aspose.drawing.drawing2d/graphicspath/warp#warp_1)(PointF[], RectangleF, Matrix) |  |
| [Warp](../../aspose.drawing.drawing2d/graphicspath/warp#warp_2)(PointF[], RectangleF, Matrix, WarpMode) |  |
| [Warp](../../aspose.drawing.drawing2d/graphicspath/warp#warp_3)(PointF[], RectangleF, Matrix, WarpMode, float) |  |
| [Widen](../../aspose.drawing.drawing2d/graphicspath/widen#widen)(Pen) |  |
| [Widen](../../aspose.drawing.drawing2d/graphicspath/widen#widen_1)(Pen, Matrix, float) |  |

### Смотрите также

* пространство имен [Aspose.Drawing.Drawing2D](../../aspose.drawing.drawing2d)
* сборка [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
