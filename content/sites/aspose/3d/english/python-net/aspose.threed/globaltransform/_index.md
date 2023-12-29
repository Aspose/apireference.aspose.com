---
title: GlobalTransform class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 100
url: /aspose.threed/globaltransform/
is_root: false
---

## GlobalTransform class

Global transform is similar to [`Transform`](/3d/python-net/aspose.threed/transform) but it's immutable while it represents the final evaluated transformation.
Right-hand coordinate system is used while evaluating global transform



The GlobalTransform type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [translation](/3d/python-net/aspose.threed/globaltransform/translation) | Gets the translation |
| [scale](/3d/python-net/aspose.threed/globaltransform/scale) | Gets the scale |
| [euler_angles](/3d/python-net/aspose.threed/globaltransform/euler_angles) | Gets the rotation represented in Euler angles, measured in degree |
| [rotation](/3d/python-net/aspose.threed/globaltransform/rotation) | Gets the rotation represented in quaternion. |
| [transform_matrix](/3d/python-net/aspose.threed/globaltransform/transform_matrix) | Gets the transform matrix. |



### Example 


The following code shows how to read node's global transform

```python
from aspose.threed import Scene
from aspose.threed.entities import Box
from aspose.threed.utilities import Vector3

scene = Scene()
boxNode = scene.root_node.create_child_node(Box())
# place the box at (10, 0, 0)
boxNode.transform.translation = Vector3(10, 0, 0)
global = boxNode.global_transform
print(f"The box's position in world coordinate is {global.translation}")

```

### See Also
* module [`aspose.threed`](..)
* class [`Transform`](/3d/python-net/aspose.threed/transform)
