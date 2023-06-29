---
title: IMatrix Interface
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Drawing.IMatrix interface. Represents a matrix used for transformations
type: docs
weight: 1630
url: /net/aspose.svg.drawing/imatrix/
---
## IMatrix interface

Represents a matrix used for transformations.

```csharp
public interface IMatrix
```

## Properties

| Name | Description |
| --- | --- |
| [IsIdentity](../../aspose.svg.drawing/imatrix/isidentity/) { get; } | Gets a value indicating whether this matrix is the identity matrix. |
| [IsInvertible](../../aspose.svg.drawing/imatrix/isinvertible/) { get; } | Gets a value indicating whether this matrix is invertible. |
| [M11](../../aspose.svg.drawing/imatrix/m11/) { get; set; } | Gets or sets the value in the first row and first column of the matrix. |
| [M12](../../aspose.svg.drawing/imatrix/m12/) { get; set; } | Gets or sets the value in the first row and second column of the matrix. |
| [M21](../../aspose.svg.drawing/imatrix/m21/) { get; set; } | Gets or sets the value in the second row and first column of the matrix. |
| [M22](../../aspose.svg.drawing/imatrix/m22/) { get; set; } | Gets or sets the value in the second row and second column of the matrix. |
| [M31](../../aspose.svg.drawing/imatrix/m31/) { get; set; } | Gets or sets the value in the third row and first column of the matrix. |
| [M32](../../aspose.svg.drawing/imatrix/m32/) { get; set; } | Gets or sets the value in the third row and second column of the matrix. |

## Methods

| Name | Description |
| --- | --- |
| [Clone](../../aspose.svg.drawing/imatrix/clone/)() | Creates a copy of this matrix. |
| [GetElements](../../aspose.svg.drawing/imatrix/getelements/)() | Gets the elements of the matrix as an array. |
| [Invert](../../aspose.svg.drawing/imatrix/invert/)() | Inverts this matrix. |
| [Multiply](../../aspose.svg.drawing/imatrix/multiply/#multiply)(IMatrix) | Multiplies this matrix by another matrix. |
| [Multiply](../../aspose.svg.drawing/imatrix/multiply/#multiply_1)(IMatrix, SvgMatrixOrder) | Multiplies this matrix by another matrix in the specified order. |
| [Reset](../../aspose.svg.drawing/imatrix/reset/)() | Resets the matrix to the identity matrix. |
| [Rotate](../../aspose.svg.drawing/imatrix/rotate/#rotate)(float) | Rotates the matrix by the specified angle. |
| [Rotate](../../aspose.svg.drawing/imatrix/rotate/#rotate_1)(float, SvgMatrixOrder) | Rotates the matrix by the specified angle in the specified order. |
| [RotateAt](../../aspose.svg.drawing/imatrix/rotateat/#rotateat)(float, PointF) | Rotates the matrix by the specified angle around the specified point. |
| [RotateAt](../../aspose.svg.drawing/imatrix/rotateat/#rotateat_1)(float, PointF, SvgMatrixOrder) | Rotates the matrix by the specified angle around the specified point in the specified order. |
| [Scale](../../aspose.svg.drawing/imatrix/scale/#scale)(float, float) | Scales the matrix by the specified scale factors uniformly. |
| [Scale](../../aspose.svg.drawing/imatrix/scale/#scale_1)(float, float, SvgMatrixOrder) | Scales the matrix by the specified scale factors in the specified order. |
| [Skew](../../aspose.svg.drawing/imatrix/skew/)(float, float) | Applies a skew transformation to the matrix. |
| [ToNative](../../aspose.svg.drawing/imatrix/tonative/)() | Converts the matrix to a native representation. |
| [Transform](../../aspose.svg.drawing/imatrix/transform/)(RectangleF) | Transforms the specified rectangle using this matrix. |
| [TransformPoint](../../aspose.svg.drawing/imatrix/transformpoint/)(PointF) | Transforms the specified point using this matrix. |
| [TransformPoints](../../aspose.svg.drawing/imatrix/transformpoints/)(PointF[]) | Transforms an array of points using this matrix. |
| [Translate](../../aspose.svg.drawing/imatrix/translate/#translate)(float, float) | Translates the matrix by the specified offset values. |
| [Translate](../../aspose.svg.drawing/imatrix/translate/#translate_1)(float, float, SvgMatrixOrder) | Translates the matrix by the specified offset values in the specified order. |

### See Also

* namespace [Aspose.Svg.Drawing](../../aspose.svg.drawing/)
* assembly [Aspose.SVG](../../)
