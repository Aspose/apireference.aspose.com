---
title: global_transform property
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 210
url: /python-net/aspose.threed/node/global_transform/
is_root: false
---

## global_transform property


Gets the global transform.

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
* module [aspose.threed](../../)
* class [Node](/3d/python-net/aspose.threed/node)
