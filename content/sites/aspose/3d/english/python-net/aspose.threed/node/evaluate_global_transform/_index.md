---
title: evaluate_global_transform method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 50
url: /python-net/aspose.threed/node/evaluate_global_transform/
is_root: false
---

## evaluate_global_transform(with_geometric_transform) {#bool}

Evaluate the global transform, include the geometric transform or not.


### Returns 


The global transform matrix.


```python
def evaluate_global_transform(self, with_geometric_transform):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| with_geometric_transform | bool | Whether the geometric transform is needed. |

### Example 


The following code shows how to read the node's global transform matrix.

```python
from aspose.threed import Scene
from aspose.threed.entities import Box
from aspose.threed.utilities import Vector3

scene = Scene()
boxNode = scene.root_node.create_child_node(Box())
# place the box at (10, 0, 0)
boxNode.transform.translation = Vector3(10, 0, 0)
mat = boxNode.evaluate_global_transform(True)
print(f"The box's global transform matrix is {mat}")

```



### See Also
* module [aspose.threed](../../)
* class [Matrix4](/3d/python-net/aspose.threed.utilities/matrix4)
* class [Node](/3d/python-net/aspose.threed/node)
