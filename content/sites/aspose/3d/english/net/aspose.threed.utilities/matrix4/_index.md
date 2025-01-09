---
title: Struct Matrix4
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Utilities.Matrix4 struct. 4x4 matrix implementation
type: docs
weight: 2690
url: /net/aspose.threed.utilities/matrix4/
---
## Matrix4 structure

4x4 matrix implementation.

```csharp
public struct Matrix4
```

## Constructors

| Name | Description |
| --- | --- |
| [Matrix4](matrix4/#constructor_3)(double[]) | Initializes a new instance of the `Matrix4` struct. |
| [Matrix4](matrix4/#constructor)(FMatrix4) | Construct `Matrix4` from an [`FMatrix4`](../fmatrix4/) instance |
| [Matrix4](matrix4/#constructor_1)(Vector4, Vector4, Vector4, Vector4) | Constructs matrix from 4 rows. |
| [Matrix4](matrix4/#constructor_2)(double, double, double, double, double, double, double, double, double, double, double, double, double, double, double, double) | Initializes a new instance of the `Matrix4` struct. |

## Properties

| Name | Description |
| --- | --- |
| static [Identity](../../aspose.threed.utilities/matrix4/identity/) { get; } | Gets the identity matrix. |
| [Determinant](../../aspose.threed.utilities/matrix4/determinant/) { get; } | Gets the determinant of the matrix. |

## Methods

| Name | Description |
| --- | --- |
| static [Rotate](../../aspose.threed.utilities/matrix4/rotate/#rotate)(Quaternion) | Create a rotation matrix from a quaternion |
| static [Rotate](../../aspose.threed.utilities/matrix4/rotate/#rotate_1)(double, Vector3) | Create a rotation matrix by rotation angle and axis |
| static [RotateFromEuler](../../aspose.threed.utilities/matrix4/rotatefromeuler/#rotatefromeuler)(Vector3) | Create a rotation matrix from Euler angle |
| static [RotateFromEuler](../../aspose.threed.utilities/matrix4/rotatefromeuler/#rotatefromeuler_1)(double, double, double) | Create a rotation matrix from Euler angle |
| static [Scale](../../aspose.threed.utilities/matrix4/scale/#scale_1)(double) | Creates a matrix that scales along the x-axis, the y-axis and the z-axis. |
| static [Scale](../../aspose.threed.utilities/matrix4/scale/#scale)(Vector3) | Creates a matrix that scales along the x-axis, the y-axis and the z-axis. |
| static [Scale](../../aspose.threed.utilities/matrix4/scale/#scale_2)(double, double, double) | Creates a matrix that scales along the x-axis, the y-axis and the z-axis. |
| static [Translate](../../aspose.threed.utilities/matrix4/translate/#translate)(Vector3) | Creates a matrix that translates along the x-axis, the y-axis and the z-axis |
| static [Translate](../../aspose.threed.utilities/matrix4/translate/#translate_1)(double, double, double) | Creates a matrix that translates along the x-axis, the y-axis and the z-axis |
| [Concatenate](../../aspose.threed.utilities/matrix4/concatenate/)(Matrix4) | Concatenates the two matrices |
| [Decompose](../../aspose.threed.utilities/matrix4/decompose/)(out Vector3, out Vector3, out Quaternion) |  |
| [Inverse](../../aspose.threed.utilities/matrix4/inverse/)() | Inverses this instance. |
| [Normalize](../../aspose.threed.utilities/matrix4/normalize/)() | Normalizes this instance. |
| [SetTRS](../../aspose.threed.utilities/matrix4/settrs/)(Vector3, Vector3, Vector3) | Initializes the matrix with translation/rotation/scale |
| [ToArray](../../aspose.threed.utilities/matrix4/toarray/)() | Converts matrix to array. |
| override [ToString](../../aspose.threed.utilities/matrix4/tostring/)() | Returns a String that represents the current `Matrix4`. |
| [Transpose](../../aspose.threed.utilities/matrix4/transpose/)() | Transposes this instance. |
| [operator *](../../aspose.threed.utilities/matrix4/op_multiply/#op_multiply) | Multiply the two matrices (4 operators) |

## Fields

| Name | Description |
| --- | --- |
| [m00](../../aspose.threed.utilities/matrix4/m00/) | The m00. |
| [m01](../../aspose.threed.utilities/matrix4/m01/) | The m01. |
| [m02](../../aspose.threed.utilities/matrix4/m02/) | The m02. |
| [m03](../../aspose.threed.utilities/matrix4/m03/) | The m03. |
| [m10](../../aspose.threed.utilities/matrix4/m10/) | The m10. |
| [m11](../../aspose.threed.utilities/matrix4/m11/) | The m11. |
| [m12](../../aspose.threed.utilities/matrix4/m12/) | The m12. |
| [m13](../../aspose.threed.utilities/matrix4/m13/) | The m13. |
| [m20](../../aspose.threed.utilities/matrix4/m20/) | The m20. |
| [m21](../../aspose.threed.utilities/matrix4/m21/) | The m21. |
| [m22](../../aspose.threed.utilities/matrix4/m22/) | The m22. |
| [m23](../../aspose.threed.utilities/matrix4/m23/) | The m23. |
| [m30](../../aspose.threed.utilities/matrix4/m30/) | The m30. |
| [m31](../../aspose.threed.utilities/matrix4/m31/) | The m31. |
| [m32](../../aspose.threed.utilities/matrix4/m32/) | The m32. |
| [m33](../../aspose.threed.utilities/matrix4/m33/) | The m33. |

### Examples

```csharp
Matrix4 mat = Matrix4.RotateFromEuler(90, 0, 0);
Matrix4 mat2 = Matrix4.Translate(0, 10, -50);
Matrix4 transform = mat2 * mat;
Vector4 pos = new Vector4(10, 9, 0, 1);
Vector4 transformed = transform * pos;

```

### See Also

* namespace [Aspose.ThreeD.Utilities](../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../)


