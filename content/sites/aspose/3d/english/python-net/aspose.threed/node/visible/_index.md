---
title: visible property
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 300
url: /python-net/aspose.threed/node/visible/
is_root: false
---

## visible property


Gets or sets to show the node

### Example 


The following code shows how to create a invisible node

```python
from aspose.threed import Scene
from aspose.threed.entities import Box

scene = Scene()
node = scene.root_node.create_child_node("test-node", Box())
node.visible = False
scene.save("output.fbx")

```

### See Also
* module [aspose.threed](../../)
* class [Node](/3d/python-net/aspose.threed/node)
