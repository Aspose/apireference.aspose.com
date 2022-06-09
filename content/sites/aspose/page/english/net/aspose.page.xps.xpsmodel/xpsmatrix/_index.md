---
title: XpsMatrix
second_title: Aspose.Page for .NET API Reference
description: 
type: docs
weight: 1110
url: /net/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class

Class incapsulating MatrixTransform property element features. This element defines an arbitrary affine matrix transformation used to manipulate the coordinate systems of elements.

```csharp
public sealed class XpsMatrix : XpsObject
```

## Properties

| Name | Description |
| --- | --- |
| [IsIdentity](../../aspose.page.xps.xpsmodel/xpsmatrix/isidentity) { get; } | Gets a value indicating whether this instance is identity matrix. |
| [M11](../../aspose.page.xps.xpsmodel/xpsmatrix/m11) { get; } | Gets the M11 element. |
| [M12](../../aspose.page.xps.xpsmodel/xpsmatrix/m12) { get; } | Gets the M12 element. |
| [M21](../../aspose.page.xps.xpsmodel/xpsmatrix/m21) { get; } | Gets the M21 element. |
| [M22](../../aspose.page.xps.xpsmodel/xpsmatrix/m22) { get; } | Gets the M22 element. |
| [M31](../../aspose.page.xps.xpsmodel/xpsmatrix/m31) { get; } | Gets the M31 element. |
| [M32](../../aspose.page.xps.xpsmodel/xpsmatrix/m32) { get; } | Gets the M32 element. |

## Methods

| Name | Description |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpsmatrix/clone)() | Clones this transformation matrix. |
| override [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals)(object) | Determines whether the specified Object is equal to this instance. |
| override [GetHashCode](../../aspose.page.xps.xpsmodel/xpsmatrix/gethashcode)() | Returns a hash code for this instance. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply)(Matrix) | Multiplies this matrix by the matrix specified by the *matrix* in default (Prepend) order. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply)(XpsMatrix) | Multiplies this matrix by the matrix specified by the *matrix* in default (Prepend) order. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply)(Matrix, MatrixOrder) | Multiplies this matrix by the matrix specified by the *matrix* in order specified by *matrixOrder*. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply)(XpsMatrix, MatrixOrder) | Multiplies this matrix by the matrix specified by the *matrix* in order specified by *matrixOrder*. |
| [Reset](../../aspose.page.xps.xpsmodel/xpsmatrix/reset)() | Resets this Matrix to identity matrix. |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate)(float) | Applies clockwise rotation by *angle* to this Matrix in default (Prepend) order. |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate)(float, MatrixOrder) | Applies clockwise rotation by *angle* to this Matrix in order specified by *matrixOrder*. |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound)(float, PointF) | Applies clockwise rotation by *angle* around the *pivot* to this Matrix in default (Prepend) order. |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound)(float, PointF, MatrixOrder) | Applies clockwise rotation by *angle* around the *pivot* to this Matrix in order specified by *matrixOrder*. |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale)(float, float) | Applies the specified scale vector (scaleX and scaleY) to this Matrix in default (Prepend) order. |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale)(float, float, MatrixOrder) | Applies the specified scale vector (scaleX and scaleY) to this Matrix in order specified by *matrixOrder*. |
| [Skew](../../aspose.page.xps.xpsmodel/xpsmatrix/skew)(double, double) | Applies specified skew transformation to this Matrix. |
| override [ToString](../../aspose.page.xps.xpsmodel/xpsmatrix/tostring)() | Returns the string representation of this [`XpsMatrix`](../xpsmatrix) instance. |
| [Transform](../../aspose.page.xps.xpsmodel/xpsmatrix/transform)(RectangleF) | Applies the affine transformation represented by this Matrix to a specified rectangle. |
| [TransformPoint](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoint)(PointF) | Applies the affine transformation represented by this Matrix to a specified point. |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints)(PointF[]) | Applies the affine transformation represented by this Matrix to a specified array of points. |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints)(PointF[], int, int) | Applies the affine transformation represented by this Matrix to a specified part of array of points. |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate)(float, float) | Applies the specified translation vector to this Matrix. |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate)(float, float, MatrixOrder) | Applies the specified translation vector to this Matrix in order specified by *matrixOrder*. |
| static [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals)(XpsMatrix, XpsMatrix) | The actual implementation. |
| [operator ==](../../aspose.page.xps.xpsmodel/xpsmatrix/op_equality) | Implements the operator ==. |
| [operator !=](../../aspose.page.xps.xpsmodel/xpsmatrix/op_inequality) | Implements the operator !=. |

### See Also

* class [XpsObject](../xpsobject)
* namespace [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel)
* assembly [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
