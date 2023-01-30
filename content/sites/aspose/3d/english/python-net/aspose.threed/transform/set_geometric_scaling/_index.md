---
title: set_geometric_scaling method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 70
url: /python-net/aspose.threed/transform/set_geometric_scaling/
is_root: false
---

## set_geometric_scaling(sx, sy, sz) {#float-float-float}

Sets the geometric scaling. 
Geometric transformation only affects the entities attached and leave the child nodes unaffected.
It will be merged as local transformation when you export the geometric transformation to file types that does not support it.



```python
def set_geometric_scaling(self, sx, sy, sz):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| sx | float |  |
| sy | float |  |
| sz | float |  |

### Example 


```python
from aspose.threed import Node

node = Node()
node.transform.set_geometric_scaling(2, 2, 2)

```



### See Also
* module [aspose.threed](../../)
* class [Transform](/3d/python-net/aspose.threed/transform)
