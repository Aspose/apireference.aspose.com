---
title: Class Matrix
second_title: Aspose.Drawing for .NET API Reference
description: Aspose.Drawing.Drawing2D.Matrix class. Encapsulates a 3by3 affine matrix that represents a geometric transform. This class cannot be inherited
type: docs
weight: 330
url: /net/aspose.drawing.drawing2d/matrix/
---
## Matrix class

Encapsulates a 3-by-3 affine matrix that represents a geometric transform. This class cannot be inherited.

```csharp
public sealed class Matrix : IDisposable
```

## Constructors

| Name | Description |
| --- | --- |
| [Matrix](matrix/#constructor)() | Initializes a new instance of the Matrix class as the identity matrix. |
| [Matrix](matrix/#constructor_1)(Rectangle, Point[]) | Initializes a new instance of the `Matrix` class to the geometric transform defined by the specified rectangle and array of points. |
| [Matrix](matrix/#constructor_2)(RectangleF, PointF[]) | Initializes a new instance of the `Matrix` class to the geometric transform defined by the specified rectangle and array of points. |
| [Matrix](matrix/#constructor_3)(float, float, float, float, float, float) | Initializes a new instance of the Matrix class with the specified elements. |

## Properties

| Name | Description |
| --- | --- |
| [Elements](../../aspose.drawing.drawing2d/matrix/elements/) { get; } | Gets an array of floating-point values that represents the elements of this Matrix. |
| [IsIdentity](../../aspose.drawing.drawing2d/matrix/isidentity/) { get; } | Gets a value indicating whether this Matrix is the identity matrix. |
| [IsInvertible](../../aspose.drawing.drawing2d/matrix/isinvertible/) { get; } | Gets a value indicating whether this Matrix is invertible. |
| [OffsetX](../../aspose.drawing.drawing2d/matrix/offsetx/) { get; } | Gets the x translation value (the dx value, or the element in the third row and first column) of this Matrix. |
| [OffsetY](../../aspose.drawing.drawing2d/matrix/offsety/) { get; } | Gets the y translation value (the `dy` value, or the element in the third row and second column) of this Matrix. |

## Methods

| Name | Description |
| --- | --- |
| [Clone](../../aspose.drawing.drawing2d/matrix/clone/)() | Creates an exact copy of this Matrix. |
| [Dispose](../../aspose.drawing.drawing2d/matrix/dispose/)() | Releases all resources used by this Matrix. |
| [Invert](../../aspose.drawing.drawing2d/matrix/invert/)() | Inverts this Matrix, if it is invertible. |
| [Multiply](../../aspose.drawing.drawing2d/matrix/multiply/#multiply)(Matrix) | Multiplies this Matrix by the matrix specified in the *matrix* parameter, by prepending the specified Matrix. |
| [Multiply](../../aspose.drawing.drawing2d/matrix/multiply/#multiply_1)(Matrix, MatrixOrder) | Multiplies this Matrix by the matrix specified in the *matrix* parameter, and in the order specified in the *order* parameter. |
| [Reset](../../aspose.drawing.drawing2d/matrix/reset/)() | Resets this Matrix to have the elements of the identity matrix. |
| [Rotate](../../aspose.drawing.drawing2d/matrix/rotate/#rotate)(float) | Prepend to this Matrix a clockwise rotation, around the origin and by the specified angle. |
| [Rotate](../../aspose.drawing.drawing2d/matrix/rotate/#rotate_1)(float, MatrixOrder) | Applies a clockwise rotation of an amount specified in the angle parameter, around the origin (zero x and y coordinates) for this Matrix. |
| [RotateAt](../../aspose.drawing.drawing2d/matrix/rotateat/#rotateat)(float, PointF) | Applies a clockwise rotation to this Matrix around the point specified in the point parameter, and by prepending the rotation. |
| [RotateAt](../../aspose.drawing.drawing2d/matrix/rotateat/#rotateat_1)(float, PointF, MatrixOrder) | Applies a clockwise rotation about the specified point to this Matrix in the specified order. |
| [Scale](../../aspose.drawing.drawing2d/matrix/scale/#scale)(float, float) | Applies the specified scale vector to this Matrix by prepending the scale vector. |
| [Scale](../../aspose.drawing.drawing2d/matrix/scale/#scale_1)(float, float, MatrixOrder) | Applies the specified scale vector (scaleX and scaleY) to this Matrix using the specified order. |
| [Shear](../../aspose.drawing.drawing2d/matrix/shear/#shear)(float, float) | Applies the specified shear vector to this Matrix by prepending the shear transformation. |
| [Shear](../../aspose.drawing.drawing2d/matrix/shear/#shear_1)(float, float, MatrixOrder) | Applies the specified shear vector to this Matrix in the specified order. |
| [TransformPoints](../../aspose.drawing.drawing2d/matrix/transformpoints/#transformpoints)(PointF[]) | Applies the geometric transform represented by this Matrix to a specified array of points. |
| [TransformPoints](../../aspose.drawing.drawing2d/matrix/transformpoints/#transformpoints_1)(Point[]) | Applies the geometric transform represented by this Matrix to a specified array of points. |
| [TransformVectors](../../aspose.drawing.drawing2d/matrix/transformvectors/)(PointF[]) | Multiplies each vector in an array by the matrix. The translation elements of this matrix (third row) are ignored. |
| [Translate](../../aspose.drawing.drawing2d/matrix/translate/#translate)(float, float) | Applies the specified translation vector (offsetX and offsetY) to this Matrix by prepending the translation vector. |
| [Translate](../../aspose.drawing.drawing2d/matrix/translate/#translate_1)(float, float, MatrixOrder) | Applies the specified translation vector to this Matrix in the specified order. |

### See Also

* namespace [Aspose.Drawing.Drawing2D](../../aspose.drawing.drawing2d/)
* assembly [Aspose.Drawing.Common](../../)


