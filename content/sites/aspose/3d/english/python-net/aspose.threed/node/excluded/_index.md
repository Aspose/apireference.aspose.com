---
title: excluded property
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 200
url: /python-net/aspose.threed/node/excluded/
is_root: false
---

## excluded property


Gets or sets whether to exclude this node and all child nodes/entities during exporting.

### Example 


The following code shows how to exclude specified node from exporting

```python
from aspose.threed import Scene
from aspose.threed.entities import Box

scene = Scene()
scene.root_node.create_child_node("excluded", Box()).excluded = True
scene.root_node.create_child_node("not excluded", Box())
scene.save("output.usdz")

```
### Definition:
```python
@property
def excluded(self):
    ...
@excluded.setter
def excluded(self, value):
    ...
```

### See Also
* module [`aspose.threed`](../../)
* class [`Node`](/3d/python-net/aspose.threed/node)
