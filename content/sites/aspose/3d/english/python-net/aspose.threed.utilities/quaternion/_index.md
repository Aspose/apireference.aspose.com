---
title: Quaternion class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 150
url: /python-net/aspose.threed.utilities/quaternion/
is_root: false
---

## Quaternion class

Quaternion is usually used to perform rotation in computer graphics.



The Quaternion type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [Quaternion(w, x, y, z)](/3d/python-net/aspose.threed.utilities/quaternion/__init__/#float-float-float-float) | Initializes a new instance of the [Quaternion](/3d/python-net/aspose.threed.utilities/quaternion) class. |
| [Quaternion()](/3d/python-net/aspose.threed.utilities/quaternion/__init__/#) | Constructs a new instance of Quaternion |


### Properties
| Property | Description |
| :- | :- |
| [length](/3d/python-net/aspose.threed.utilities/quaternion/length) | Gets the length of the quaternion |
| [IDENTITY](/3d/python-net/aspose.threed.utilities/quaternion/IDENTITY) | The Identity quaternion. |
| [w](/3d/python-net/aspose.threed.utilities/quaternion/w) | The w component. |
| [x](/3d/python-net/aspose.threed.utilities/quaternion/x) | The x component. |
| [y](/3d/python-net/aspose.threed.utilities/quaternion/y) | The y component. |
| [z](/3d/python-net/aspose.threed.utilities/quaternion/z) | The z component. |


### Methods
| Method | Description |
| :- | :- |
| [from_euler_angle(pitch, yaw, roll)](/3d/python-net/aspose.threed.utilities/quaternion/from_euler_angle/#float-float-float) | Creates quaternion from given Euler angle |
| [from_euler_angle(euler_angle)](/3d/python-net/aspose.threed.utilities/quaternion/from_euler_angle/#Vector3) | Creates quaternion from given Euler angle |
| [conjugate()](/3d/python-net/aspose.threed.utilities/quaternion/conjugate/#) | Returns a conjugate quaternion of current quaternion |
| [inverse()](/3d/python-net/aspose.threed.utilities/quaternion/inverse/#) | Returns a inverse quaternion of current quaternion |
| [dot(q)](/3d/python-net/aspose.threed.utilities/quaternion/dot/#Quaternion) | Dots product |
| [euler_angles()](/3d/python-net/aspose.threed.utilities/quaternion/euler_angles/#) | Converts quaternion to rotation represented by Euler angles<br/>All components are in radian |
| [normalize()](/3d/python-net/aspose.threed.utilities/quaternion/normalize/#) | Normalize the quaternion |
| [to_angle_axis(angle, axis)](/3d/python-net/aspose.threed.utilities/quaternion/to_angle_axis/#any-any) |  |
| [concat(rhs)](/3d/python-net/aspose.threed.utilities/quaternion/concat/#Quaternion) | Concatenate two quaternions |
| [from_angle_axis(a, axis)](/3d/python-net/aspose.threed.utilities/quaternion/from_angle_axis/#float-Vector3) | Creates a quaternion around given axis and rotate in clockwise |
| [from_rotation(orig, dest)](/3d/python-net/aspose.threed.utilities/quaternion/from_rotation/#Vector3-Vector3) | Creates a quaternion that rotate from original to destination direction |
| [to_matrix()](/3d/python-net/aspose.threed.utilities/quaternion/to_matrix/#) | Convert the rotation presented by quaternion to transform matrix. |
| [interpolate(t, from_address, to)](/3d/python-net/aspose.threed.utilities/quaternion/interpolate/#float-Quaternion-Quaternion) | Populates this quaternion with the interpolated value between the given quaternion arguments for a t between from and to. |


### See Also

* module [aspose.threed.utilities](../)
