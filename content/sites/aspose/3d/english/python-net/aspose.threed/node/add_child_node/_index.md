---
title: add_child_node method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.threed/node/add_child_node/
is_root: false
---

## add_child_node(self, node) {#aspose.threed.Node}

Add a child node to this node



```python

def add_child_node(self, node):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| node | aspose.threed.Node | The child node to be attached |

### Example 


The following code shows how to get all meshes from a scene

```python
from aspose.threed import Node, Scene

scene = Scene.from_file("input.fbx")
newNode = Node()
# add a new node manually
scene.root_node.add_child_node(newNode)

```



### See Also
* module [`aspose.threed`](../../)
* class [`Node`](/3d/python-net/aspose.threed/node)
