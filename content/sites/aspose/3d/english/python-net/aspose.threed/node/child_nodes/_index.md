---
title: child_nodes property
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 170
url: /aspose.threed/node/child_nodes/
is_root: false
---

## child_nodes property


Gets the children nodes.

### Example 


The following code shows how to enumerate child node of root node

```python
from aspose.threed import Scene

scene = Scene.from_file("test.fbx")
for child in scene.root_node.child_nodes:
    pass

```
### Definition:
```python
@property
def child_nodes(self):
    ...
```

### See Also
* module [`aspose.threed`](../../)
* class [`Node`](/3d/python-net/aspose.threed/node)
