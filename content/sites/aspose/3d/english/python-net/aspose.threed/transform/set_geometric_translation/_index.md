---
title: set_geometric_translation method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 80
url: /aspose.threed/transform/set_geometric_translation/
is_root: false
---

## set_geometric_translation {#float-float-float}

Sets the geometric translation. 
Geometric transformation only affects the entities attached and leave the child nodes unaffected.
It will be merged as local transformation when you export the geometric transformation to file types that does not support it.



```python
def set_geometric_translation(self, x, y, z):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| x | float |  |
| y | float |  |
| z | float |  |

### Example 


```python
from aspose.threed import Node

node = Node()
node.transform.set_geometric_translation(10, 0, 0)

```



### See Also
* module [`aspose.threed`](../../)
* class [`Transform`](/3d/python-net/aspose.threed/transform)
