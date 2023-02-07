---
title: material property
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 220
url: /python-net/aspose.threed/node/material/
is_root: false
---

## material property


Gets or sets the first material associated with this node, if sets, will clear other materials

### Example 


```python
from aspose.threed import Scene
from aspose.threed.entities import Box
from aspose.threed.shading import LambertMaterial

scene = Scene()
node = scene.root_node.create_child_node(Box())
node.material = LambertMaterial()

```
### Definition:
```python
@property
def material(self):
    ...
@material.setter
def material(self, value):
    ...
```

### See Also
* module [aspose.threed](../../)
* class [Material](/3d/python-net/aspose.threed.shading/material)
* class [Node](/3d/python-net/aspose.threed/node)
