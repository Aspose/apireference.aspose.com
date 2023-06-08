---
title: Struct Matrix4x4Double
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Transforms.Matrix4x4Double struct. 
type: docs
weight: 11320
url: /net/aspose.cad.fileformats.glb.transforms/matrix4x4double/
---
## Matrix4x4Double structure

```csharp
public struct Matrix4x4Double : IEquatable<Matrix4x4Double>
```

## Constructors

| Name | Description |
| --- | --- |
| [Matrix4x4Double](matrix4x4double/#constructor_1)(Matrix4x4) |  |
| [Matrix4x4Double](matrix4x4double/#constructor)(double, double, double, double, double, double, double, double, double, double, double, double, double, double, double, double) | Constructs a Matrix4x4 from the given components. |

## Properties

| Name | Description |
| --- | --- |
| static [Identity](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/identity/) { get; } | Returns the multiplicative identity matrix. |
| [Translation](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/translation/) { get; set; } | Gets or sets the translation component of this matrix. |

## Methods

| Name | Description |
| --- | --- |
| static [CreateFromQuaternion](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/createfromquaternion/)(Quaternion) | Creates a rotation matrix from the given Quaternion rotation value. |
| static [CreateScale](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/createscale/)(double, double, double) | Creates a scaling matrix. |
| static [CreateTranslation](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/createtranslation/)(double, double, double) | Creates a translation matrix. |
| static [Multiply](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/multiply/)(Matrix4x4Double, Matrix4x4Double) | Multiplies a matrix by another matrix. |
| [Equals](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/equals/#equals)(Matrix4x4Double) | Returns a boolean indicating whether this matrix instance is equal to the other given matrix. |
| override [Equals](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/equals/#equals_1)(object) | Returns a boolean indicating whether the given Object is equal to this matrix instance. |
| override [GetHashCode](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/gethashcode/)() | Returns the hash code for this instance. |
| static [Invert](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/invert/)(Matrix4x4Double, out Matrix4x4Double) | Attempts to calculate the inverse of the given matrix. If successful, result will contain the inverted matrix. |
| [operator ==](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/op_equality/) | Returns a boolean indicating whether the given two matrices are equal. |
| [explicit operator](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/op_explicit/) | Converts a `Matrix4x4Double` to a Matrix4x4 |
| [implicit operator](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/op_implicit/) | converts from Matrix4x4 to `Matrix4x4Double` |
| [operator !=](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/op_inequality/) | Returns a boolean indicating whether the given two matrices are not equal. |
| [operator *](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/op_multiply/) | Multiplies a matrix by another matrix. |

## Fields

| Name | Description |
| --- | --- |
| [M11](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/m11/) | Value at row 1, column 1 of the matrix. |
| [M12](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/m12/) | Value at row 1, column 2 of the matrix. |
| [M13](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/m13/) | Value at row 1, column 3 of the matrix. |
| [M14](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/m14/) | Value at row 1, column 4 of the matrix. |
| [M21](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/m21/) | Value at row 2, column 1 of the matrix. |
| [M22](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/m22/) | Value at row 2, column 2 of the matrix. |
| [M23](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/m23/) | Value at row 2, column 3 of the matrix. |
| [M24](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/m24/) | Value at row 2, column 4 of the matrix. |
| [M31](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/m31/) | Value at row 3, column 1 of the matrix. |
| [M32](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/m32/) | Value at row 3, column 2 of the matrix. |
| [M33](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/m33/) | Value at row 3, column 3 of the matrix. |
| [M34](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/m34/) | Value at row 3, column 4 of the matrix. |
| [M41](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/m41/) | Value at row 4, column 1 of the matrix. |
| [M42](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/m42/) | Value at row 4, column 2 of the matrix. |
| [M43](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/m43/) | Value at row 4, column 3 of the matrix. |
| [M44](../../aspose.cad.fileformats.glb.transforms/matrix4x4double/m44/) | Value at row 4, column 4 of the matrix. |

### See Also

* namespace [Aspose.CAD.FileFormats.GLB.Transforms](../../aspose.cad.fileformats.glb.transforms/)
* assembly [Aspose.CAD](../../)


