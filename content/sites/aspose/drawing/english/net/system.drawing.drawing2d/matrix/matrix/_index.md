---
title: Matrix.Matrix
second_title: Aspose.Drawing for .NET API Reference
description: Matrix constructor. Initializes a new instance of the Matrix class as the identity matrix
type: docs
weight: 10
url: /net/system.drawing.drawing2d/matrix/matrix/
---
## Matrix() {#constructor}

Initializes a new instance of the Matrix class as the identity matrix.

```csharp
public Matrix()
```

### See Also

* class [Matrix](../)
* namespace [System.Drawing.Drawing2D](../../matrix/)
* assembly [Aspose.Drawing](../../../)

---

## Matrix(float, float, float, float, float, float) {#constructor_1}

Initializes a new instance of the Matrix class with the specified elements.

```csharp
public Matrix(float m11, float m12, float m21, float m22, float dx, float dy)
```

| Parameter | Type | Description |
| --- | --- | --- |
| m11 | Single | The value in the first row and first column of the new Matrix. |
| m12 | Single | The value in the first row and second column of the new Matrix. |
| m21 | Single | The value in the second row and first column of the new Matrix. |
| m22 | Single | The value in the second row and second column of the new Matrix. |
| dx | Single | The value in the third row and first column of the new Matrix. |
| dy | Single | The value in the third row and second column of the new Matrix. |

### See Also

* class [Matrix](../)
* namespace [System.Drawing.Drawing2D](../../matrix/)
* assembly [Aspose.Drawing](../../../)

---

## Matrix(Rectangle, Point[]) {#constructor_2}

Initializes a new instance of the [`Matrix`](../) class to the geometric transform defined by the specified rectangle and array of points.

```csharp
public Matrix(Rectangle rect, Point[] plgpts)
```

| Parameter | Type | Description |
| --- | --- | --- |
| rect | Rectangle | A Rectangle structure that represents the rectangle to be transformed. |
| plgpts | Point[] | An array of three Point structures that represents the points of a parallelogram to which the upper-left, upper-right, and lower-left corners of the rectangle is to be transformed. The lower-right corner of the parallelogram is implied by the first three corners. |

### See Also

* struct [Rectangle](../../../system.drawing/rectangle/)
* struct [Point](../../../system.drawing/point/)
* class [Matrix](../)
* namespace [System.Drawing.Drawing2D](../../matrix/)
* assembly [Aspose.Drawing](../../../)

---

## Matrix(RectangleF, PointF[]) {#constructor_3}

Initializes a new instance of the [`Matrix`](../) class to the geometric transform defined by the specified rectangle and array of points.

```csharp
public Matrix(RectangleF rect, PointF[] plgpts)
```

| Parameter | Type | Description |
| --- | --- | --- |
| rect | RectangleF | A RectangleF structure that represents the rectangle to be transformed. |
| plgpts | PointF[] | An array of three PointF structures that represents the points of a parallelogram to which the upper-left, upper-right, and lower-left corners of the rectangle is to be transformed. The lower-right corner of the parallelogram is implied by the first three corners. |

### See Also

* struct [RectangleF](../../../system.drawing/rectanglef/)
* struct [PointF](../../../system.drawing/pointf/)
* class [Matrix](../)
* namespace [System.Drawing.Drawing2D](../../matrix/)
* assembly [Aspose.Drawing](../../../)


