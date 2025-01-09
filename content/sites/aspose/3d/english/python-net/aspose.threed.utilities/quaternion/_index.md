---
title: Quaternion class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 120
url: /aspose.threed.utilities/quaternion/
is_root: false
---

## Quaternion class

Quaternion is usually used to perform rotation in computer graphics.



The Quaternion type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/3d/python-net/aspose.threed.utilities/quaternion/__init__/#float-float-float-float) | Initializes a new instance of the [`Quaternion`](/3d/python-net/aspose.threed.utilities/quaternion) class. |
| [__init__](/3d/python-net/aspose.threed.utilities/quaternion/__init__/#) | Constructs a new instance of Quaternion |


### Properties
| Property | Description |
| :- | :- |
| [length](/3d/python-net/aspose.threed.utilities/quaternion/length) | Gets the length of the quaternion |
| [IDENTITY](/3d/python-net/aspose.threed.utilities/quaternion/identity) | The Identity quaternion. |
| [w](/3d/python-net/aspose.threed.utilities/quaternion/w) | The w component. |
| [x](/3d/python-net/aspose.threed.utilities/quaternion/x) | The x component. |
| [y](/3d/python-net/aspose.threed.utilities/quaternion/y) | The y component. |
| [z](/3d/python-net/aspose.threed.utilities/quaternion/z) | The z component. |


### Methods
| Method | Description |
| :- | :- |
| [from_euler_angle](/3d/python-net/aspose.threed.utilities/quaternion/from_euler_angle/#float-float-float) | Creates quaternion from given Euler angle |
| [from_euler_angle](/3d/python-net/aspose.threed.utilities/quaternion/from_euler_angle/#aspose.threed.utilities.Vector3) | Creates quaternion from given Euler angle |
| [conjugate](/3d/python-net/aspose.threed.utilities/quaternion/conjugate/#) | Returns a conjugate quaternion of current quaternion |
| [inverse](/3d/python-net/aspose.threed.utilities/quaternion/inverse/#) | Returns a inverse quaternion of current quaternion |
| [dot](/3d/python-net/aspose.threed.utilities/quaternion/dot/#aspose.threed.utilities.Quaternion) | Dots product |
| [euler_angles](/3d/python-net/aspose.threed.utilities/quaternion/euler_angles/#) | Converts quaternion to rotation represented by Euler angles<br/>All components are in radian |
| [normalize](/3d/python-net/aspose.threed.utilities/quaternion/normalize/#) | Normalize the quaternion |
| [to_angle_axis](/3d/python-net/aspose.threed.utilities/quaternion/to_angle_axis/#any-any) |  |
| [concat](/3d/python-net/aspose.threed.utilities/quaternion/concat/#aspose.threed.utilities.Quaternion) | Concatenate two quaternions |
| [from_angle_axis](/3d/python-net/aspose.threed.utilities/quaternion/from_angle_axis/#float-aspose.threed.utilities.Vector3) | Creates a quaternion around given axis and rotate in clockwise |
| [from_rotation](/3d/python-net/aspose.threed.utilities/quaternion/from_rotation/#aspose.threed.utilities.Vector3-aspose.threed.utilities.Vector3) | Creates a quaternion that rotate from original to destination direction |
| [to_matrix](/3d/python-net/aspose.threed.utilities/quaternion/to_matrix/#) | Convert the rotation presented by quaternion to transform matrix. |
| [interpolate](/3d/python-net/aspose.threed.utilities/quaternion/interpolate/#float-aspose.threed.utilities.Quaternion-aspose.threed.utilities.Quaternion) | Populates this quaternion with the interpolated value between the given quaternion arguments for a t between from and to. |
| [slerp](/3d/python-net/aspose.threed.utilities/quaternion/slerp/#float-aspose.threed.utilities.Quaternion-aspose.threed.utilities.Quaternion) | Perform spherical linear interpolation between two values |



### See Also
* module [`aspose.threed.utilities`](..)
* class [`Quaternion`](/3d/python-net/aspose.threed.utilities/quaternion)
