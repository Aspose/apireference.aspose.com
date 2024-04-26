---
title: Class Matrix
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.Drawing.Drawing2D.Matrix class. Encapsulates a 3by3 affine matrix that represents a geometric transform. This class cannot be inherited
type: docs
weight: 220
url: /net/aspose.page.drawing.drawing2d/matrix/
---
## Matrix class

Encapsulates a 3-by-3 affine matrix that represents a geometric transform. This class cannot be inherited.

```csharp
public sealed class Matrix : MarshalByRefObject, IDisposable
```

## Constructors

| Name | Description |
| --- | --- |
| [Matrix](matrix/#constructor)() | Initializes a new instance of the `Matrix` class as the identity matrix. |
| [Matrix](matrix/#constructor_1)(float, float, float, float, float, float) | Initializes a new instance of the `Matrix` class with the specified elements. |

## Properties

| Name | Description |
| --- | --- |
| [Elements](../../aspose.page.drawing.drawing2d/matrix/elements/) { get; } | Gets an array of floating-point values that represents the elements of this `Matrix`. |
| [IsIdentity](../../aspose.page.drawing.drawing2d/matrix/isidentity/) { get; } | Gets a value indicating whether this `Matrix` is the identity matrix. |
| [IsInvertible](../../aspose.page.drawing.drawing2d/matrix/isinvertible/) { get; } | Gets a value indicating whether this `Matrix` is invertible. |
| [OffsetX](../../aspose.page.drawing.drawing2d/matrix/offsetx/) { get; } | Gets the x translation value (the dx value, or the element in the third row and first column) of this `Matrix`. |
| [OffsetY](../../aspose.page.drawing.drawing2d/matrix/offsety/) { get; } | Gets the y translation value (the dy value, or the element in the third row and second column) of this `Matrix`. |

## Methods

| Name | Description |
| --- | --- |
| [Clone](../../aspose.page.drawing.drawing2d/matrix/clone/)() | Creates an exact copy of this `Matrix`. |
| [Dispose](../../aspose.page.drawing.drawing2d/matrix/dispose/)() | Releases all resources used by this `Matrix`. |
| override [Equals](../../aspose.page.drawing.drawing2d/matrix/equals/)(object) | Tests whether the specified object is a `Matrix` and is identical to this `Matrix`. |
| override [GetHashCode](../../aspose.page.drawing.drawing2d/matrix/gethashcode/)() | Returns a hash code. |
| [Invert](../../aspose.page.drawing.drawing2d/matrix/invert/)() | Inverts this `Matrix`, if it is invertible. |
| [Multiply](../../aspose.page.drawing.drawing2d/matrix/multiply/#multiply)(Matrix) | Multiplies this `Matrix` by the matrix specified in the *matrix* parameter, by prepending the specified `Matrix`. |
| [Multiply](../../aspose.page.drawing.drawing2d/matrix/multiply/#multiply_1)(Matrix, MatrixOrder) | Multiplies this `Matrix` by the matrix specified in the *matrix* parameter, and in the order specified in the *order* parameter. |
| [Reset](../../aspose.page.drawing.drawing2d/matrix/reset/)() | Resets this `Matrix` to have the elements of the identity matrix. |
| [Rotate](../../aspose.page.drawing.drawing2d/matrix/rotate/#rotate)(float) | Prepend to this `Matrix` a clockwise rotation, around the origin and by the specified angle. |
| [Rotate](../../aspose.page.drawing.drawing2d/matrix/rotate/#rotate_1)(float, MatrixOrder) | Applies a clockwise rotation of an amount specified in the *angle* parameter, around the origin (zero x and y coordinates) for this `Matrix`. |
| [RotateAt](../../aspose.page.drawing.drawing2d/matrix/rotateat/#rotateat)(float, PointF) | Applies a clockwise rotation to this `Matrix` around the point specified in the *point* parameter, and by prepending the rotation. |
| [RotateAt](../../aspose.page.drawing.drawing2d/matrix/rotateat/#rotateat_1)(float, PointF, MatrixOrder) | Applies a clockwise rotation about the specified point to this `Matrix` in the specified order. |
| [Scale](../../aspose.page.drawing.drawing2d/matrix/scale/#scale)(float, float) | Applies the specified scale vector to this `Matrix` by prepending the scale vector. |
| [Scale](../../aspose.page.drawing.drawing2d/matrix/scale/#scale_1)(float, float, MatrixOrder) | Applies the specified scale vector (*scaleX* and *scaleY*) to this `Matrix` using the specified order. |
| [Shear](../../aspose.page.drawing.drawing2d/matrix/shear/#shear)(float, float) | Applies the specified shear vector to this `Matrix` by prepending the shear transformation. |
| [Shear](../../aspose.page.drawing.drawing2d/matrix/shear/#shear_1)(float, float, MatrixOrder) | Applies the specified shear vector to this `Matrix` in the specified order. |
| [TransformPoints](../../aspose.page.drawing.drawing2d/matrix/transformpoints/)(PointF[]) | Applies the geometric transform represented by this `Matrix` to a specified array of points. |
| [TransformVectors](../../aspose.page.drawing.drawing2d/matrix/transformvectors/)(PointF[]) | Multiplies each vector in an array by the matrix. The translation elements of this matrix (third row) are ignored. |
| [Translate](../../aspose.page.drawing.drawing2d/matrix/translate/#translate)(float, float) | Applies the specified translation vector (*offsetX* and *offsetY*) to this `Matrix` by prepending the translation vector. |
| [Translate](../../aspose.page.drawing.drawing2d/matrix/translate/#translate_1)(float, float, MatrixOrder) | Applies the specified translation vector to this `Matrix` in the specified order. |

### See Also

* namespace [Aspose.Page.Drawing.Drawing2D](../../aspose.page.drawing.drawing2d/)
* assembly [Aspose.Page](../../)


