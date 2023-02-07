---
title: geometric_rotation property
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 170
url: /python-net/aspose.threed/transform/geometric_rotation/
is_root: false
---

## geometric_rotation property


Gets or sets the geometric Euler rotation(measured in degree). 
Geometric transformation only affects the entities attached and leave the child nodes unaffected.
It will be merged as local transformation when you export the geometric transformation to file types that does not support it.

### Example 


```python
from aspose.threed import Node
from aspose.threed.utilities import Vector3

node = Node()
node.transform.geometric_rotation = Vector3(90, 0, 0)

```
### Definition:
```python
@property
def geometric_rotation(self):
    ...
@geometric_rotation.setter
def geometric_rotation(self, value):
    ...
```

### See Also
* module [aspose.threed](../../)
* class [Transform](/3d/python-net/aspose.threed/transform)
* class [Vector3](/3d/python-net/aspose.threed.utilities/vector3)
