---
title: merge method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 100
url: /aspose.threed/node/merge/
is_root: false
---

## merge {#aspose.threed.Node}

Detach everything under the node and attach them to current node.



```python
def merge(self, node):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| node | [`Node`](/3d/python-net/aspose.threed/node) |  |

### Example 


The following code shows how to merge two 3D files into one file

```python
from aspose.threed import Scene

scene1 = Scene.from_file("scene1.fbx")
scene2 = Scene.from_file("scene2.fbx")
scene1.root_node.merge(scene2.root_node)
scene1.save("merged.fbx")

```



### See Also
* module [`aspose.threed`](../../)
* class [`Node`](/3d/python-net/aspose.threed/node)
