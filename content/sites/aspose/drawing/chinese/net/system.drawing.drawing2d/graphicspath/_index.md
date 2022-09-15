---
title: GraphicsPath
second_title: Aspose.Drawing for .NET API 参考
description: 表示一系列相连的直线和曲线
type: docs
weight: 260
url: /zh/net/system.drawing.drawing2d/graphicspath/
---
## GraphicsPath class

表示一系列相连的直线和曲线。

```csharp
public class GraphicsPath : IDisposable
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [GraphicsPath](graphicspath#constructor)() | 使用 Alternate 的 FillMode 值初始化 GraphicsPath 类的新实例。 |
| [GraphicsPath](graphicspath#constructor_1)(FillMode) | 初始化[`GraphicsPath`](../graphicspath)具有指定 的类FillMode枚举. |
| [GraphicsPath](graphicspath#constructor_2)(PointF[], byte[]) | 初始化[`GraphicsPath`](../graphicspath)具有指定的类[`PathPointType`](../pathpointtype)和PointF数组. |
| [GraphicsPath](graphicspath#constructor_4)(Point[], byte[]) | 初始化[`GraphicsPath`](../graphicspath)具有指定的类[`PathPointType`](../pathpointtype)和Point数组. |
| [GraphicsPath](graphicspath#constructor_3)(PointF[], byte[], FillMode) | 初始化[`GraphicsPath`](../graphicspath)具有指定的类PathPointType和PointF数组和指定的FillMode枚举元素.. |
| [GraphicsPath](graphicspath#constructor_5)(Point[], byte[], FillMode) | 初始化[`GraphicsPath`](../graphicspath)具有指定的类PathPointType和Point数组和指定的FillMode枚举元素.. |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [FillMode](../../system.drawing.drawing2d/graphicspath/fillmode) { get; set; } | 获取或设置一个 FillMode 枚举，该枚举确定如何填充此 GraphicsPath 中形状的内部。 |
| [PathData](../../system.drawing.drawing2d/graphicspath/pathdata) { get; } | 得到一个PathData为此封装了点和类型的数组GraphicsPath |
| [PathPoints](../../system.drawing.drawing2d/graphicspath/pathpoints) { get; } | 获取路径中的点。 |
| [PathTypes](../../system.drawing.drawing2d/graphicspath/pathtypes) { get; } | 获取对应点的类型PathPoints数组. |
| [PointCount](../../system.drawing.drawing2d/graphicspath/pointcount) { get; } | 获取元素的个数PathPoints或者PathTypes数组. |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc#addarc_1)(RectangleF, float, float) | 将椭圆弧附加到当前图形。 |
| [AddArc](../../system.drawing.drawing2d/graphicspath/addarc#addarc)(float, float, float, float, float, float) | 将椭圆弧附加到当前图形。 |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier#addbezier_1)(PointF, PointF, PointF, PointF) | 将三次贝塞尔曲线添加到当前图形。 |
| [AddBezier](../../system.drawing.drawing2d/graphicspath/addbezier#addbezier)(float, float, float, float, float, float, float, float) | 将三次贝塞尔曲线添加到当前图形。 |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers#addbeziers)(PointF[]) | 将一系列连接的三次贝塞尔曲线添加到当前图形。 |
| [AddBeziers](../../system.drawing.drawing2d/graphicspath/addbeziers#addbeziers_1)(Point[]) | 将一系列连接的三次贝塞尔曲线添加到当前图形。 |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve#addclosedcurve)(PointF[]) | 向该路径添加闭合曲线。使用基数样条曲线是因为曲线穿过数组中的每个点。 |
| [AddClosedCurve](../../system.drawing.drawing2d/graphicspath/addclosedcurve#addclosedcurve_1)(PointF[], float) | 将闭合曲线添加到此路径。 使用基数样条曲线，因为该曲线穿过数组中的每个点。 |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve)(PointF[]) | 将样条曲线添加到当前图形。使用基数样条曲线是因为曲线穿过数组中的每个点。 |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve_3)(Point[]) | 将样条曲线添加到当前图形。使用基数样条曲线是因为曲线穿过数组中的每个点。 |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve_2)(PointF[], float) | 将样条曲线添加到当前图形。 |
| [AddCurve](../../system.drawing.drawing2d/graphicspath/addcurve#addcurve_1)(PointF[], int, int, float) | 将样条曲线添加到当前图形。 |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse#addellipse_1)(RectangleF) | 在当前路径中添加一个椭圆。 |
| [AddEllipse](../../system.drawing.drawing2d/graphicspath/addellipse#addellipse)(float, float, float, float) | 在当前路径中添加一个椭圆。 |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline#addline_1)(PointF, PointF) | 将线段附加到此 GraphicsPath。 |
| [AddLine](../../system.drawing.drawing2d/graphicspath/addline#addline)(float, float, float, float) | 将线段附加到此 GraphicsPath。 |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines#addlines)(PointF[]) | 将一系列连接的线段附加到此末尾GraphicsPath. |
| [AddLines](../../system.drawing.drawing2d/graphicspath/addlines#addlines_1)(Point[]) | 将一系列连接的线段附加到此末尾GraphicsPath. |
| [AddPath](../../system.drawing.drawing2d/graphicspath/addpath)(GraphicsPath, bool) | 将指定的 GraphicsPath 附加到此路径。 |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie#addpie_1)(Rectangle, float, float) | 将饼形的轮廓添加到此路径。 |
| [AddPie](../../system.drawing.drawing2d/graphicspath/addpie#addpie)(float, float, float, float, float, float) | 将饼形的轮廓添加到此路径。 |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon#addpolygon)(PointF[]) | 将多边形添加到此路径。 |
| [AddPolygon](../../system.drawing.drawing2d/graphicspath/addpolygon#addpolygon_1)(Point[]) | 将多边形添加到此路径。 |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle#addrectangle)(Rectangle) | 向此路径添加一个矩形。 |
| [AddRectangle](../../system.drawing.drawing2d/graphicspath/addrectangle#addrectangle_1)(RectangleF) | 向此路径添加一个矩形。 |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles#addrectangles)(RectangleF[]) | 将一系列矩形添加到此路径。 |
| [AddRectangles](../../system.drawing.drawing2d/graphicspath/addrectangles#addrectangles_1)(Rectangle[]) | 将一系列矩形添加到此路径。 |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring)(string, FontFamily, int, float, Point, StringFormat) | 将文本字符串添加到此路径。 |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring_1)(string, FontFamily, int, float, PointF, StringFormat) | 将文本字符串添加到此路径。 |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring_2)(string, FontFamily, int, float, Rectangle, StringFormat) | 将文本字符串添加到此路径。 |
| [AddString](../../system.drawing.drawing2d/graphicspath/addstring#addstring_3)(string, FontFamily, int, float, RectangleF, StringFormat) | 将文本字符串添加到此路径。 |
| [Clone](../../system.drawing.drawing2d/graphicspath/clone)() | 复制当前路径对象。 |
| [CloseAllFigures](../../system.drawing.drawing2d/graphicspath/closeallfigures)() | 关闭此路径中所有打开的图形并开始一个新图形。它通过连接从端点到起点的线来关闭每个打开的图形。 |
| [CloseFigure](../../system.drawing.drawing2d/graphicspath/closefigure)() | 关闭当前图窗并开始一个新图窗。如果当前图形包含 一系列连接的直线和曲线，则该方法通过连接 一条从端点到起点的线来关闭循环。 |
| [Dispose](../../system.drawing.drawing2d/graphicspath/dispose)() | 释放此 GraphicsPath 使用的所有资源。 |
| [Flatten](../../system.drawing.drawing2d/graphicspath/flatten)() | 将此路径中的每条曲线转换为一系列相连的线段。 |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds#getbounds)() | 返回一个以此为边界的矩形GraphicsPath. |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds#getbounds_1)(Matrix) | 返回一个以此为边界的矩形GraphicsPath当这个路径是 被指定的变换Matrix. |
| [GetBounds](../../system.drawing.drawing2d/graphicspath/getbounds#getbounds_2)(Matrix, Pen) | 返回一个以此为边界的矩形GraphicsPath当当前路径被 指定变换时Matrix并用指定的绘制Pen. |
| [GetLastPoint](../../system.drawing.drawing2d/graphicspath/getlastpoint)() | 获取此路径的 PathPoints 数组中的最后一个点[`GraphicsPath`](../graphicspath). |
| [IsOutlineVisible](../../system.drawing.drawing2d/graphicspath/isoutlinevisible)(PointF, Pen) | 表示指定点是否包含在（下）此轮廓的范围内GraphicsPath绘制时指定Pen. |
| [IsVisible](../../system.drawing.drawing2d/graphicspath/isvisible)(PointF) | 表示指定的点是否包含在这个范围内GraphicsPath. |
| [Reset](../../system.drawing.drawing2d/graphicspath/reset)() | 清空[`PathPoints`](./pathpoints)和[`PathTypes`](./pathtypes)arrays 并设置[`FillMode`](../fillmode)至Alternate. |
| [Reverse](../../system.drawing.drawing2d/graphicspath/reverse)() | 反转点的顺序[`PathPoints`](./pathpoints)这个数组[`GraphicsPath`](../graphicspath). |
| [SetMarkers](../../system.drawing.drawing2d/graphicspath/setmarkers)() | 在此设置标记[`GraphicsPath`](../graphicspath). |
| [StartFigure](../../system.drawing.drawing2d/graphicspath/startfigure)() | 在不关闭当前图窗的情况下开始一个新图窗。 添加到路径的所有后续点都将添加到此新图窗中。 |
| [Transform](../../system.drawing.drawing2d/graphicspath/transform)(Matrix) | 将变换矩阵应用于此 GraphicsPath. |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp)(PointF[], RectangleF) | 将由矩形和平行四边形定义的扭曲变换应用于此[`GraphicsPath`](../graphicspath). |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp_1)(PointF[], RectangleF, Matrix) | 将由矩形和平行四边形定义的扭曲变换应用于此[`GraphicsPath`](../graphicspath). |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp_2)(PointF[], RectangleF, Matrix, WarpMode) | 将由矩形和平行四边形定义的扭曲变换应用于此[`GraphicsPath`](../graphicspath). |
| [Warp](../../system.drawing.drawing2d/graphicspath/warp#warp_3)(PointF[], RectangleF, Matrix, WarpMode, float) | 将由矩形和平行四边形定义的扭曲变换应用于此[`GraphicsPath`](../graphicspath). |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen#widen)(Pen) | 为路径添加额外的轮廓。 |
| [Widen](../../system.drawing.drawing2d/graphicspath/widen#widen_1)(Pen, Matrix, float) | 替换这个GraphicsPath当用指定的笔绘制此路径时，带有包围填充区域的曲线。 |

### 也可以看看

* 命名空间 [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* 部件 [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
