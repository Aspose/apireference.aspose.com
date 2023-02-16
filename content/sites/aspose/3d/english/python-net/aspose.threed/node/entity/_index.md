---
title: entity property
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 190
url: /python-net/aspose.threed/node/entity/
is_root: false
---

## entity property


Gets or sets the first entity attached to this node, if sets, will clear other entities.

### Example 


The following code shows how to create a new child node under root node

```python
from aspose.threed import Scene
from aspose.threed.entities import Box

scene = Scene()
node = scene.root_node.create_child_node("new node")
node.entity = Box()
scene.save("output.fbx")

```
### Definition:
```python
@property
def entity(self):
    ...
@entity.setter
def entity(self, value):
    ...
```

### See Also
* module [`aspose.threed`](../../)
* class [`Entity`](/3d/python-net/aspose.threed/entity)
* class [`Node`](/3d/python-net/aspose.threed/node)
