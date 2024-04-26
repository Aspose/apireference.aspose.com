---
title: Matrix.RotateAt
second_title: Aspose.Page for .NET API Reference
description: Matrix method. Applies a clockwise rotation to this Matrix around the point specified in the point parameter and by prepending the rotation
type: docs
weight: 150
url: /net/aspose.page.drawing.drawing2d/matrix/rotateat/
---
## RotateAt(float, PointF) {#rotateat}

Applies a clockwise rotation to this [`Matrix`](../) around the point specified in the *point* parameter, and by prepending the rotation.

```csharp
public void RotateAt(float angle, PointF point)
```

| Parameter | Type | Description |
| --- | --- | --- |
| angle | Single | The angle (extent) of the rotation, in degrees. |
| point | PointF | A [`PointF`](../../../aspose.page.drawing/pointf/) that represents the center of the rotation. |

### See Also

* struct [PointF](../../../aspose.page.drawing/pointf/)
* class [Matrix](../)
* namespace [Aspose.Page.Drawing.Drawing2D](../../matrix/)
* assembly [Aspose.Page](../../../)

---

## RotateAt(float, PointF, MatrixOrder) {#rotateat_1}

Applies a clockwise rotation about the specified point to this [`Matrix`](../) in the specified order.

```csharp
public void RotateAt(float angle, PointF point, MatrixOrder order)
```

| Parameter | Type | Description |
| --- | --- | --- |
| angle | Single | The angle of the rotation, in degrees. |
| point | PointF | A [`PointF`](../../../aspose.page.drawing/pointf/) that represents the center of the rotation. |
| order | MatrixOrder | A [`MatrixOrder`](../../matrixorder/) that specifies the order (append or prepend) in which the rotation is applied. |

### See Also

* struct [PointF](../../../aspose.page.drawing/pointf/)
* enum [MatrixOrder](../../matrixorder/)
* class [Matrix](../)
* namespace [Aspose.Page.Drawing.Drawing2D](../../matrix/)
* assembly [Aspose.Page](../../../)


