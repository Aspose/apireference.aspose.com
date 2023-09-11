---
title: GraphicsPath.AddCurve
second_title: Aspose.Drawing for .NET API Reference
description: GraphicsPath method. Adds a spline curve to the current figure. A cardinal spline curve is used because the curve travels through each of the points in the array
type: docs
weight: 110
url: /net/aspose.drawing.drawing2d/graphicspath/addcurve/
---
## AddCurve(Point[]) {#addcurve_3}

Adds a spline curve to the current figure. A cardinal spline curve is used because the curve travels through each of the points in the array.

```csharp
public void AddCurve(Point[] points)
```

| Parameter | Type | Description |
| --- | --- | --- |
| points | Point[] | An array of Point structures that represents the points that define the curve. |

### See Also

* struct [Point](../../../aspose.drawing/point/)
* class [GraphicsPath](../)
* namespace [Aspose.Drawing.Drawing2D](../../graphicspath/)
* assembly [Aspose.Drawing.Common](../../../)

---

## AddCurve(PointF[]) {#addcurve}

Adds a spline curve to the current figure. A cardinal spline curve is used because the curve travels through each of the points in the array.

```csharp
public void AddCurve(PointF[] points)
```

| Parameter | Type | Description |
| --- | --- | --- |
| points | PointF[] | An array of PointF structures that represents the points that define the curve. |

### See Also

* struct [PointF](../../../aspose.drawing/pointf/)
* class [GraphicsPath](../)
* namespace [Aspose.Drawing.Drawing2D](../../graphicspath/)
* assembly [Aspose.Drawing.Common](../../../)

---

## AddCurve(PointF[], float) {#addcurve_2}

Adds a spline curve to the current figure.

```csharp
public void AddCurve(PointF[] points, float tension)
```

| Parameter | Type | Description |
| --- | --- | --- |
| points | PointF[] | An array of PointF structures that represents the points that define the curve. |
| tension | Single | A value that specifies the amount that the curve bends between control points. Values greater than 1 produce unpredictable results. |

### See Also

* struct [PointF](../../../aspose.drawing/pointf/)
* class [GraphicsPath](../)
* namespace [Aspose.Drawing.Drawing2D](../../graphicspath/)
* assembly [Aspose.Drawing.Common](../../../)

---

## AddCurve(PointF[], int, int, float) {#addcurve_1}

Adds a spline curve to the current figure.

```csharp
public void AddCurve(PointF[] points, int offset, int numberOfSegments, float tension)
```

| Parameter | Type | Description |
| --- | --- | --- |
| points | PointF[] | An array of PointF structures that represents the points that define the curve. |
| offset | Int32 | The index of the element in the *points* array that is used as the first point in the curve. |
| numberOfSegments | Int32 | The number of segments used to draw the curve. A segment can be thought of as a line connecting two points. |
| tension | Single | A value that specifies the amount that the curve bends between control points. Values greater than 1 produce unpredictable results. |

### See Also

* struct [PointF](../../../aspose.drawing/pointf/)
* class [GraphicsPath](../)
* namespace [Aspose.Drawing.Drawing2D](../../graphicspath/)
* assembly [Aspose.Drawing.Common](../../../)


