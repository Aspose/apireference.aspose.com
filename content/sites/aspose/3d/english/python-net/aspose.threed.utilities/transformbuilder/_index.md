---
title: TransformBuilder class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 190
url: /python-net/aspose.threed.utilities/transformbuilder/
is_root: false
---

## TransformBuilder class

The [`TransformBuilder`](/3d/python-net/aspose.threed.utilities/transformbuilder) is used to build transform matrix by a chain of transformations.



The TransformBuilder type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/3d/python-net/aspose.threed.utilities/transformbuilder/__init__/#aspose.threed.utilities.Matrix4-aspose.threed.utilities.ComposeOrder) | Construct a [`TransformBuilder`](/3d/python-net/aspose.threed.utilities/transformbuilder) with initial transform matrix and specified compose order |
| [__init__](/3d/python-net/aspose.threed.utilities/transformbuilder/__init__/#aspose.threed.utilities.ComposeOrder) | Construct a [`TransformBuilder`](/3d/python-net/aspose.threed.utilities/transformbuilder) with initial identity transform matrix and specified compose order |


### Properties
| Property | Description |
| :- | :- |
| [matrix](/3d/python-net/aspose.threed.utilities/transformbuilder/matrix) | Gets or sets the current matrix value |
| [compose_order](/3d/python-net/aspose.threed.utilities/transformbuilder/compose_order) | Gets or sets the chain compose order. |


### Methods
| Method | Description |
| :- | :- |
| [scale](/3d/python-net/aspose.threed.utilities/transformbuilder/scale/#float) | Chain a scaling transform matrix with a component scaled by s |
| [scale](/3d/python-net/aspose.threed.utilities/transformbuilder/scale/#float-float-float) | Chain a scaling transform matrix |
| [scale](/3d/python-net/aspose.threed.utilities/transformbuilder/scale/#aspose.threed.utilities.Vector3) | Chain a scale transform |
| [rotate_degree](/3d/python-net/aspose.threed.utilities/transformbuilder/rotate_degree/#float-aspose.threed.utilities.Vector3) | Chain a rotation transform in degree |
| [rotate_degree](/3d/python-net/aspose.threed.utilities/transformbuilder/rotate_degree/#aspose.threed.utilities.Vector3-aspose.threed.utilities.RotationOrder) | Append rotation with specified order |
| [rotate_radian](/3d/python-net/aspose.threed.utilities/transformbuilder/rotate_radian/#float-aspose.threed.utilities.Vector3) | Chain a rotation transform in radian |
| [rotate_radian](/3d/python-net/aspose.threed.utilities/transformbuilder/rotate_radian/#aspose.threed.utilities.Vector3-aspose.threed.utilities.RotationOrder) | Append rotation with specified order |
| [rotate_euler_radian](/3d/python-net/aspose.threed.utilities/transformbuilder/rotate_euler_radian/#float-float-float) | Chain a rotation by Euler angles in radian |
| [rotate_euler_radian](/3d/python-net/aspose.threed.utilities/transformbuilder/rotate_euler_radian/#aspose.threed.utilities.Vector3) | Chain a rotation by Euler angles in radian |
| [translate](/3d/python-net/aspose.threed.utilities/transformbuilder/translate/#float-float-float) | Chain a translation transform |
| [translate](/3d/python-net/aspose.threed.utilities/transformbuilder/translate/#aspose.threed.utilities.Vector3) | Chain a translation transform |
| [compose](/3d/python-net/aspose.threed.utilities/transformbuilder/compose/#aspose.threed.utilities.Matrix4) | Append or prepend the argument to internal matrix. |
| [append](/3d/python-net/aspose.threed.utilities/transformbuilder/append/#aspose.threed.utilities.Matrix4) | Append the new transform matrix to the transform chain. |
| [prepend](/3d/python-net/aspose.threed.utilities/transformbuilder/prepend/#aspose.threed.utilities.Matrix4) | Prepend the new transform matrix to the transform chain. |
| [rearrange](/3d/python-net/aspose.threed.utilities/transformbuilder/rearrange/#aspose.threed.Axis-aspose.threed.Axis-aspose.threed.Axis) | Rearrange the layout of the axis. |
| [rotate](/3d/python-net/aspose.threed.utilities/transformbuilder/rotate/#aspose.threed.utilities.Quaternion) | Chain a rotation by a quaternion |
| [rotate_euler_degree](/3d/python-net/aspose.threed.utilities/transformbuilder/rotate_euler_degree/#float-float-float) | Chain a rotation by Euler angles in degree |
| [reset](/3d/python-net/aspose.threed.utilities/transformbuilder/reset/#) | Reset the transform to identity matrix |



### Example 


The following code shows how to create a matrix by a set of operation

```python
from aspose.threed.utilities import TransformBuilder

tb = TransformBuilder()
tb.translate(10, 20, 0)
tb.scale(10, 10, 10)
tb.rotate_euler_degree(90, 0, 0)
print(f"Transform Matrix: {tb.matrix}")

```

### See Also
* module [`aspose.threed.utilities`](..)
* class [`TransformBuilder`](/3d/python-net/aspose.threed.utilities/transformbuilder)
