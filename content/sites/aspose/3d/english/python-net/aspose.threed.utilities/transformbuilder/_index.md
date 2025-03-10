---
title: TransformBuilder class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 160
url: /python-net/aspose.threed.utilities/transformbuilder/
is_root: false
---

## TransformBuilder class

The [`TransformBuilder`](/3d/python-net/aspose.threed.utilities/transformbuilder) is used to build transform matrix by a chain of transformations.



The TransformBuilder type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self, initial, order)`](/3d/python-net/aspose.threed.utilities/transformbuilder/__init__/#aspose.threed.utilities.matrix4-aspose.threed.utilities.composeorder) | Construct a [`TransformBuilder`](/3d/python-net/aspose.threed.utilities/transformbuilder) with initial transform matrix and specified compose order |
| [`__init__(self, order)`](/3d/python-net/aspose.threed.utilities/transformbuilder/__init__/#aspose.threed.utilities.composeorder) | Construct a [`TransformBuilder`](/3d/python-net/aspose.threed.utilities/transformbuilder) with initial identity transform matrix and specified compose order |


### Properties
| Property | Description |
| :- | :- |
| [matrix](/3d/python-net/aspose.threed.utilities/transformbuilder/matrix) | Gets or sets the current matrix value |
| [compose_order](/3d/python-net/aspose.threed.utilities/transformbuilder/compose_order) | Gets or sets the chain compose order. |


### Methods
| Method | Description |
| :- | :- |
| [`scale(self, s)`](/3d/python-net/aspose.threed.utilities/transformbuilder/scale/#float) | Chain a scaling transform matrix with a component scaled by s |
| [`scale(self, x, y, z)`](/3d/python-net/aspose.threed.utilities/transformbuilder/scale/#float-float-float) | Chain a scaling transform matrix |
| [`scale(self, s)`](/3d/python-net/aspose.threed.utilities/transformbuilder/scale/#aspose.threed.utilities.vector3) | Chain a scale transform |
| [`rotate_degree(self, angle, axis)`](/3d/python-net/aspose.threed.utilities/transformbuilder/rotate_degree/#float-aspose.threed.utilities.vector3) | Chain a rotation transform in degree |
| [`rotate_degree(self, rot, order)`](/3d/python-net/aspose.threed.utilities/transformbuilder/rotate_degree/#aspose.threed.utilities.vector3-aspose.threed.utilities.rotationorder) | Append rotation with specified order |
| [`rotate_radian(self, angle, axis)`](/3d/python-net/aspose.threed.utilities/transformbuilder/rotate_radian/#float-aspose.threed.utilities.vector3) | Chain a rotation transform in radian |
| [`rotate_radian(self, rot, order)`](/3d/python-net/aspose.threed.utilities/transformbuilder/rotate_radian/#aspose.threed.utilities.vector3-aspose.threed.utilities.rotationorder) | Append rotation with specified order |
| [`rotate_euler_radian(self, x, y, z)`](/3d/python-net/aspose.threed.utilities/transformbuilder/rotate_euler_radian/#float-float-float) | Chain a rotation by Euler angles in radian |
| [`rotate_euler_radian(self, r)`](/3d/python-net/aspose.threed.utilities/transformbuilder/rotate_euler_radian/#aspose.threed.utilities.vector3) | Chain a rotation by Euler angles in radian |
| [`translate(self, tx, ty, tz)`](/3d/python-net/aspose.threed.utilities/transformbuilder/translate/#float-float-float) | Chain a translation transform |
| [`translate(self, v)`](/3d/python-net/aspose.threed.utilities/transformbuilder/translate/#aspose.threed.utilities.vector3) | Chain a translation transform |
| [`compose(self, m)`](/3d/python-net/aspose.threed.utilities/transformbuilder/compose/#aspose.threed.utilities.matrix4) | Append or prepend the argument to internal matrix. |
| [`append(self, m)`](/3d/python-net/aspose.threed.utilities/transformbuilder/append/#aspose.threed.utilities.matrix4) | Append the new transform matrix to the transform chain. |
| [`prepend(self, m)`](/3d/python-net/aspose.threed.utilities/transformbuilder/prepend/#aspose.threed.utilities.matrix4) | Prepend the new transform matrix to the transform chain. |
| [`rearrange(self, new_x, new_y, new_z)`](/3d/python-net/aspose.threed.utilities/transformbuilder/rearrange/#aspose.threed.axis-aspose.threed.axis-aspose.threed.axis) | Rearrange the layout of the axis. |
| [`rotate(self, q)`](/3d/python-net/aspose.threed.utilities/transformbuilder/rotate/#aspose.threed.utilities.quaternion) | Chain a rotation by a quaternion |
| [`rotate_euler_degree(self, deg_x, deg_y, deg_z)`](/3d/python-net/aspose.threed.utilities/transformbuilder/rotate_euler_degree/#float-float-float) | Chain a rotation by Euler angles in degree |
| [`reset(self)`](/3d/python-net/aspose.threed.utilities/transformbuilder/reset/#) | Reset the transform to identity matrix |



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
