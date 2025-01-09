---
title: Pose class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 170
url: /aspose.threed/pose/
is_root: false
---

## Pose class

The pose is used to store transformation matrix when the geometry is skinned.
The pose is a set of [`BonePose`](/3d/python-net/aspose.threed/bonepose), each [`BonePose`](/3d/python-net/aspose.threed/bonepose) saves the concrete transformation information of the bone node.



**Inheritance:** [`Pose`](/3d/python-net/aspose.threed/pose) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The Pose type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/3d/python-net/aspose.threed/pose/__init__/#str) | Initializes a new instance of the [`Pose`](/3d/python-net/aspose.threed/pose) class. |
| [__init__](/3d/python-net/aspose.threed/pose/__init__/#) | Initializes a new instance of the [`Pose`](/3d/python-net/aspose.threed/pose) class. |


### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed/pose/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed/pose/properties) | Gets the collection of all properties. |
| [pose_type](/3d/python-net/aspose.threed/pose/pose_type) | Gets or sets the type of the pose. |
| [bone_poses](/3d/python-net/aspose.threed/pose/bone_poses) | Gets all [`BonePose`](/3d/python-net/aspose.threed/bonepose). |


### Methods
| Method | Description |
| :- | :- |
| [remove_property](/3d/python-net/aspose.threed/pose/remove_property/#aspose.threed.Property) | Removes a dynamic property. |
| [remove_property](/3d/python-net/aspose.threed/pose/remove_property/#str) | Remove the specified property identified by name |
| [add_bone_pose](/3d/python-net/aspose.threed/pose/add_bone_pose/#aspose.threed.Node-aspose.threed.utilities.Matrix4-bool) | Saves pose transformation matrix for the given bone node. |
| [add_bone_pose](/3d/python-net/aspose.threed/pose/add_bone_pose/#aspose.threed.Node-aspose.threed.utilities.Matrix4) | Saves pose transformation matrix for the given bone node. <br/>Global transformation matrix is implied. |
| [get_property](/3d/python-net/aspose.threed/pose/get_property/#str) | Get the value of specified property |
| [set_property](/3d/python-net/aspose.threed/pose/set_property/#str-any) | Sets the value of specified property |
| [find_property](/3d/python-net/aspose.threed/pose/find_property/#str) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |



### See Also
* module [`aspose.threed`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`BonePose`](/3d/python-net/aspose.threed/bonepose)
* class [`Pose`](/3d/python-net/aspose.threed/pose)
