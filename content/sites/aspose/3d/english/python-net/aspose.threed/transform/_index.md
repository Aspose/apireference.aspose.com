---
title: Transform class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 230
url: /python-net/aspose.threed/transform/
is_root: false
---

## Transform class

A transform contains information that allow access to object's translate/scale/rotation or transform matrix at minimum cost
This is used by local transform.



**Inheritance:** [`Transform`](/3d/python-net/aspose.threed/transform) → 
[`A3DObject`](/3d/python-net/aspose.threed/a3dobject)



The Transform type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [name](/3d/python-net/aspose.threed/transform/name) | Gets or sets the name. |
| [properties](/3d/python-net/aspose.threed/transform/properties) | Gets the collection of all properties. |
| [geometric_translation](/3d/python-net/aspose.threed/transform/geometric_translation) | Gets or sets the geometric translation. <br/>Geometric transformation only affects the entities attached and leave the child nodes unaffected.<br/>It will be merged as local transformation when you export the geometric transformation to file types that does not support it. |
| [geometric_scaling](/3d/python-net/aspose.threed/transform/geometric_scaling) | Gets or sets the geometric scaling. <br/>Geometric transformation only affects the entities attached and leave the child nodes unaffected.<br/>It will be merged as local transformation when you export the geometric transformation to file types that does not support it. |
| [geometric_rotation](/3d/python-net/aspose.threed/transform/geometric_rotation) | Gets or sets the geometric Euler rotation(measured in degree). <br/>Geometric transformation only affects the entities attached and leave the child nodes unaffected.<br/>It will be merged as local transformation when you export the geometric transformation to file types that does not support it. |
| [translation](/3d/python-net/aspose.threed/transform/translation) | Gets or sets the translation |
| [scaling](/3d/python-net/aspose.threed/transform/scaling) | Gets or sets the scaling |
| [scaling_offset](/3d/python-net/aspose.threed/transform/scaling_offset) | Gets or sets the scaling offset |
| [scaling_pivot](/3d/python-net/aspose.threed/transform/scaling_pivot) | Gets or sets the scaling pivot |
| [pre_rotation](/3d/python-net/aspose.threed/transform/pre_rotation) | Gets or sets the pre-rotation represented in degree |
| [rotation_offset](/3d/python-net/aspose.threed/transform/rotation_offset) | Gets or sets the rotation offset |
| [rotation_pivot](/3d/python-net/aspose.threed/transform/rotation_pivot) | Gets or sets the rotation pivot |
| [post_rotation](/3d/python-net/aspose.threed/transform/post_rotation) | Gets or sets the post-rotation represented in degree |
| [euler_angles](/3d/python-net/aspose.threed/transform/euler_angles) | Gets or sets the rotation represented in Euler angles, measured in degree |
| [rotation](/3d/python-net/aspose.threed/transform/rotation) | Gets or sets the rotation represented in quaternion. |
| [transform_matrix](/3d/python-net/aspose.threed/transform/transform_matrix) | Gets or sets the transform matrix. |


### Methods
| Method | Description |
| :- | :- |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed/transform/remove_property/#aspose.threed.property) | Removes a dynamic property. |
| [`remove_property(self, property)`](/3d/python-net/aspose.threed/transform/remove_property/#system.string) | Remove the specified property identified by name |
| [`get_property(self, property)`](/3d/python-net/aspose.threed/transform/get_property/#system.string) | Get the value of specified property |
| [`set_property(self, property, value)`](/3d/python-net/aspose.threed/transform/set_property/#system.string-system.object) | Sets the value of specified property |
| [`find_property(self, property_name)`](/3d/python-net/aspose.threed/transform/find_property/#system.string) | Finds the property.<br/>It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) <br/>or native property(Identified by its name) |
| [`set_geometric_translation(self, x, y, z)`](/3d/python-net/aspose.threed/transform/set_geometric_translation/#float-float-float) | Sets the geometric translation. <br/>Geometric transformation only affects the entities attached and leave the child nodes unaffected.<br/>It will be merged as local transformation when you export the geometric transformation to file types that does not support it. |
| [`set_geometric_scaling(self, sx, sy, sz)`](/3d/python-net/aspose.threed/transform/set_geometric_scaling/#float-float-float) | Sets the geometric scaling. <br/>Geometric transformation only affects the entities attached and leave the child nodes unaffected.<br/>It will be merged as local transformation when you export the geometric transformation to file types that does not support it. |
| [`set_geometric_rotation(self, rx, ry, rz)`](/3d/python-net/aspose.threed/transform/set_geometric_rotation/#float-float-float) | Sets the geometric Euler rotation(measured in degree). <br/>Geometric transformation only affects the entities attached and leave the child nodes unaffected.<br/>It will be merged as local transformation when you export the geometric transformation to file types that does not support it. |
| [`set_translation(self, tx, ty, tz)`](/3d/python-net/aspose.threed/transform/set_translation/#float-float-float) | Sets the translation of current transform. |
| [`set_scale(self, sx, sy, sz)`](/3d/python-net/aspose.threed/transform/set_scale/#float-float-float) | Sets the scale of current transform. |
| [`set_euler_angles(self, rx, ry, rz)`](/3d/python-net/aspose.threed/transform/set_euler_angles/#float-float-float) | Sets the Euler angles in degrees of current transform. |
| [`set_rotation(self, rw, rx, ry, rz)`](/3d/python-net/aspose.threed/transform/set_rotation/#float-float-float-float) | Sets the rotation(as quaternion components) of current transform. |
| [`set_pre_rotation(self, rx, ry, rz)`](/3d/python-net/aspose.threed/transform/set_pre_rotation/#float-float-float) | Sets the pre-rotation represented in degree |
| [`set_post_rotation(self, rx, ry, rz)`](/3d/python-net/aspose.threed/transform/set_post_rotation/#float-float-float) | Sets the post-rotation represented in degree |



### Example 


The following code shows how to change the transform of the node:

```python
from aspose.threed import Scene
from aspose.threed.entities import Box
from aspose.threed.utilities import Vector3

scene = Scene()
boxNode = scene.root_node.create_child_node(Box())
# place the box at (10, 0, 0)
boxNode.transform.translation = Vector3(10, 0, 0)

```

### See Also
* module [`aspose.threed`](..)
* class [`A3DObject`](/3d/python-net/aspose.threed/a3dobject)
* class [`Transform`](/3d/python-net/aspose.threed/transform)
