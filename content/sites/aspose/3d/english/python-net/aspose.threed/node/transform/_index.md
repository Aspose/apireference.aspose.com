---
title: transform property
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 290
url: /python-net/aspose.threed/node/transform/
is_root: false
---

## transform property


Gets the local transform.

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
* module [aspose.threed](../../)
* class [Node](/3d/python-net/aspose.threed/node)
