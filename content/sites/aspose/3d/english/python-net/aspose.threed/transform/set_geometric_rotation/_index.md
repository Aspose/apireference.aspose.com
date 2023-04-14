---
title: set_geometric_rotation method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 60
url: /python-net/aspose.threed/transform/set_geometric_rotation/
is_root: false
---

## set_geometric_rotation {#float-float-float}

Sets the geometric Euler rotation(measured in degree). 
Geometric transformation only affects the entities attached and leave the child nodes unaffected.
It will be merged as local transformation when you export the geometric transformation to file types that does not support it.



```python
def set_geometric_rotation(self, rx, ry, rz):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| rx | float |  |
| ry | float |  |
| rz | float |  |

### Example 


```python
from aspose.threed import Node

node = Node()
node.transform.set_geometric_rotation(90, 0, 0)

```



### See Also
* module [`aspose.threed`](../../)
* class [`Transform`](/3d/python-net/aspose.threed/transform)
