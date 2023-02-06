---
title: geometric_translation property
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 190
url: /python-net/aspose.threed/transform/geometric_translation/
is_root: false
---

## geometric_translation property


Gets or sets the geometric translation. 
Geometric transformation only affects the entities attached and leave the child nodes unaffected.
It will be merged as local transformation when you export the geometric transformation to file types that does not support it.

### Example 


```python
from aspose.threed import Node
from aspose.threed.utilities import Vector3

node = Node()
node.transform.geometric_translation = Vector3(10, 0, 0)

```
### Definition:
```python
@property
def geometric_translation(self):
    ...
@geometric_translation.setter
def geometric_translation(self, value):
    ...
```

### See Also
* module [aspose.threed](../../)
* class [Transform](/3d/python-net/aspose.threed/transform)
* class [Vector3](/3d/python-net/aspose.threed.utilities/vector3)
