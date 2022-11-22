---
title: TransformBuilder class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 180
url: /python-net/aspose.threed.utilities/transformbuilder/
is_root: false
---

## TransformBuilder class

The [TransformBuilder](/3d/python-net/aspose.threed.utilities/transformbuilder) is used to build transform matrix by a chain of transformations.



The TransformBuilder type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [TransformBuilder(initial, order)](/3d/python-net/aspose.threed.utilities/transformbuilder/__init__/#Matrix4-ComposeOrder) | Construct a [TransformBuilder](/3d/python-net/aspose.threed.utilities/transformbuilder) with initial transform matrix and specified compose order |
| [TransformBuilder(order)](/3d/python-net/aspose.threed.utilities/transformbuilder/__init__/#ComposeOrder) | Construct a [TransformBuilder](/3d/python-net/aspose.threed.utilities/transformbuilder) with initial identity transform matrix and specified compose order |


### Properties
| Property | Description |
| :- | :- |
| [matrix](/3d/python-net/aspose.threed.utilities/transformbuilder/matrix) | Gets or sets the current matrix value |
| [compose_order](/3d/python-net/aspose.threed.utilities/transformbuilder/compose_order) | Gets or sets the chain compose order. |


### Methods
| Method | Description |
| :- | :- |
| [scale(s)](/3d/python-net/aspose.threed.utilities/transformbuilder/scale/#float) | Chain a scaling transform matrix with a component scaled by s |
| [scale(x, y, z)](/3d/python-net/aspose.threed.utilities/transformbuilder/scale/#float-float-float) | Chain a scaling transform matrix |
| [scale(s)](/3d/python-net/aspose.threed.utilities/transformbuilder/scale/#Vector3) | Chain a scale transform |
| [rotate_degree(angle, axis)](/3d/python-net/aspose.threed.utilities/transformbuilder/rotate_degree/#float-Vector3) | Chain a rotation transform in degree |
| [rotate_degree(rot, order)](/3d/python-net/aspose.threed.utilities/transformbuilder/rotate_degree/#Vector3-RotationOrder) | Append rotation with specified order |
| [rotate_radian(angle, axis)](/3d/python-net/aspose.threed.utilities/transformbuilder/rotate_radian/#float-Vector3) | Chain a rotation transform in radian |
| [rotate_radian(rot, order)](/3d/python-net/aspose.threed.utilities/transformbuilder/rotate_radian/#Vector3-RotationOrder) | Append rotation with specified order |
| [rotate_euler_radian(x, y, z)](/3d/python-net/aspose.threed.utilities/transformbuilder/rotate_euler_radian/#float-float-float) | Chain a rotation by Euler angles in radian |
| [rotate_euler_radian(r)](/3d/python-net/aspose.threed.utilities/transformbuilder/rotate_euler_radian/#Vector3) | Chain a rotation by Euler angles in radian |
| [translate(tx, ty, tz)](/3d/python-net/aspose.threed.utilities/transformbuilder/translate/#float-float-float) | Chain a translation transform |
| [translate(v)](/3d/python-net/aspose.threed.utilities/transformbuilder/translate/#Vector3) | Chain a translation transform |
| [compose(m)](/3d/python-net/aspose.threed.utilities/transformbuilder/compose/#Matrix4) | Append or prepend the argument to internal matrix. |
| [append(m)](/3d/python-net/aspose.threed.utilities/transformbuilder/append/#Matrix4) | Append the new transform matrix to the transform chain. |
| [prepend(m)](/3d/python-net/aspose.threed.utilities/transformbuilder/prepend/#Matrix4) | Prepend the new transform matrix to the transform chain. |
| [rearrange(new_x, new_y, new_z)](/3d/python-net/aspose.threed.utilities/transformbuilder/rearrange/#Axis-Axis-Axis) | Rearrange the layout of the axis. |
| [rotate(q)](/3d/python-net/aspose.threed.utilities/transformbuilder/rotate/#Quaternion) | Chain a rotation by a quaternion |
| [rotate_euler_degree(deg_x, deg_y, deg_z)](/3d/python-net/aspose.threed.utilities/transformbuilder/rotate_euler_degree/#float-float-float) | Chain a rotation by Euler angles in degree |
| [reset()](/3d/python-net/aspose.threed.utilities/transformbuilder/reset/#) | Reset the transform to identity matrix |


### See Also

* module [aspose.threed.utilities](../)
