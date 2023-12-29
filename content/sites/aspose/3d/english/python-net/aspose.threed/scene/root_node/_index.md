---
title: root_node property
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 210
url: /aspose.threed/scene/root_node/
is_root: false
---

## root_node property


Gets the root node of the scene.

### Example 


The following code shows how to create a node with Box entity attached to the root node.

```python
from aspose.threed import Scene
from aspose.threed.entities import Box

scene = Scene()
scene.root_node.create_child_node(Box())
scene.save("box.stl")

```
### Definition:
```python
@property
def root_node(self):
    ...
```

### See Also
* module [`aspose.threed`](../../)
* class [`Node`](/3d/python-net/aspose.threed/node)
* class [`Scene`](/3d/python-net/aspose.threed/scene)
