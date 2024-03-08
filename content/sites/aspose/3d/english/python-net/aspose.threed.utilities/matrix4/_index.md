---
title: Matrix4 class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 120
url: /aspose.threed.utilities/matrix4/
is_root: false
---

## Matrix4 class

4x4 matrix implementation.



The Matrix4 type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/3d/python-net/aspose.threed.utilities/matrix4/__init__/#aspose.threed.utilities.Vector4-aspose.threed.utilities.Vector4-aspose.threed.utilities.Vector4-aspose.threed.utilities.Vector4) | Constructs matrix from 4 rows. |
| [__init__](/3d/python-net/aspose.threed.utilities/matrix4/__init__/#float-float-float-float-float-float-float-float-float-float-float-float-float-float-float-float) | Initializes a new instance of the [`Matrix4`](/3d/python-net/aspose.threed.utilities/matrix4) struct. |
| [__init__](/3d/python-net/aspose.threed.utilities/matrix4/__init__/#aspose.threed.utilities.FMatrix4) | Construct [`Matrix4`](/3d/python-net/aspose.threed.utilities/matrix4) from an [`FMatrix4`](/3d/python-net/aspose.threed.utilities/fmatrix4) instance |
| [__init__](/3d/python-net/aspose.threed.utilities/matrix4/__init__/#list) | Initializes a new instance of the [`Matrix4`](/3d/python-net/aspose.threed.utilities/matrix4) struct. |
| [__init__](/3d/python-net/aspose.threed.utilities/matrix4/__init__/#) | Constructs a new instance of Matrix4 |


### Properties
| Property | Description |
| :- | :- |
| [identity](/3d/python-net/aspose.threed.utilities/matrix4/identity) | Gets the identity matrix. |
| [determinant](/3d/python-net/aspose.threed.utilities/matrix4/determinant) | Gets the determinant of the matrix. |
| [m00](/3d/python-net/aspose.threed.utilities/matrix4/m00) | The m00. |
| [m01](/3d/python-net/aspose.threed.utilities/matrix4/m01) | The m01. |
| [m02](/3d/python-net/aspose.threed.utilities/matrix4/m02) | The m02. |
| [m03](/3d/python-net/aspose.threed.utilities/matrix4/m03) | The m03. |
| [m10](/3d/python-net/aspose.threed.utilities/matrix4/m10) | The m10. |
| [m11](/3d/python-net/aspose.threed.utilities/matrix4/m11) | The m11. |
| [m12](/3d/python-net/aspose.threed.utilities/matrix4/m12) | The m12. |
| [m13](/3d/python-net/aspose.threed.utilities/matrix4/m13) | The m13. |
| [m20](/3d/python-net/aspose.threed.utilities/matrix4/m20) | The m20. |
| [m21](/3d/python-net/aspose.threed.utilities/matrix4/m21) | The m21. |
| [m22](/3d/python-net/aspose.threed.utilities/matrix4/m22) | The m22. |
| [m23](/3d/python-net/aspose.threed.utilities/matrix4/m23) | The m23. |
| [m30](/3d/python-net/aspose.threed.utilities/matrix4/m30) | The m30. |
| [m31](/3d/python-net/aspose.threed.utilities/matrix4/m31) | The m31. |
| [m32](/3d/python-net/aspose.threed.utilities/matrix4/m32) | The m32. |
| [m33](/3d/python-net/aspose.threed.utilities/matrix4/m33) | The m33. |


### Methods
| Method | Description |
| :- | :- |
| [translate](/3d/python-net/aspose.threed.utilities/matrix4/translate/#aspose.threed.utilities.Vector3) | Creates a matrix that translates along the x-axis, the y-axis and the z-axis |
| [translate](/3d/python-net/aspose.threed.utilities/matrix4/translate/#float-float-float) | Creates a matrix that translates along the x-axis, the y-axis and the z-axis |
| [scale](/3d/python-net/aspose.threed.utilities/matrix4/scale/#aspose.threed.utilities.Vector3) | Creates a matrix that scales along the x-axis, the y-axis and the z-axis. |
| [scale](/3d/python-net/aspose.threed.utilities/matrix4/scale/#float) | Creates a matrix that scales along the x-axis, the y-axis and the z-axis. |
| [scale](/3d/python-net/aspose.threed.utilities/matrix4/scale/#float-float-float) | Creates a matrix that scales along the x-axis, the y-axis and the z-axis. |
| [rotate_from_euler](/3d/python-net/aspose.threed.utilities/matrix4/rotate_from_euler/#aspose.threed.utilities.Vector3) | Create a rotation matrix from Euler angle |
| [rotate_from_euler](/3d/python-net/aspose.threed.utilities/matrix4/rotate_from_euler/#float-float-float) | Create a rotation matrix from Euler angle |
| [rotate](/3d/python-net/aspose.threed.utilities/matrix4/rotate/#float-aspose.threed.utilities.Vector3) | Create a rotation matrix by rotation angle and axis |
| [rotate](/3d/python-net/aspose.threed.utilities/matrix4/rotate/#aspose.threed.utilities.Quaternion) | Create a rotation matrix from a quaternion |
| [concatenate](/3d/python-net/aspose.threed.utilities/matrix4/concatenate/#aspose.threed.utilities.Matrix4) | Concatenates the two matrices |
| [transpose](/3d/python-net/aspose.threed.utilities/matrix4/transpose/#) | Transposes this instance. |
| [normalize](/3d/python-net/aspose.threed.utilities/matrix4/normalize/#) | Normalizes this instance. |
| [inverse](/3d/python-net/aspose.threed.utilities/matrix4/inverse/#) | Inverses this instance. |
| [set_trs](/3d/python-net/aspose.threed.utilities/matrix4/set_trs/#aspose.threed.utilities.Vector3-aspose.threed.utilities.Vector3-aspose.threed.utilities.Vector3) | Initializes the matrix with translation/rotation/scale |
| [to_array](/3d/python-net/aspose.threed.utilities/matrix4/to_array/#) | Converts matrix to array. |
| [decompose](/3d/python-net/aspose.threed.utilities/matrix4/decompose/#any-any-any) |  |



### Example 


```python
from aspose.threed.utilities import Matrix4, Vector4

mat = Matrix4.rotate_from_euler(90, 0, 0)
mat2 = Matrix4.translate(0, 10, -50)
transform = mat2 * mat
pos = Vector4(10, 9, 0, 1)
transformed = transform * pos

```

### See Also
* module [`aspose.threed.utilities`](..)
* class [`FMatrix4`](/3d/python-net/aspose.threed.utilities/fmatrix4)
* class [`Matrix4`](/3d/python-net/aspose.threed.utilities/matrix4)
