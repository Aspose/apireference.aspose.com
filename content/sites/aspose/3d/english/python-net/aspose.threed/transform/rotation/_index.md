---
title: rotation property
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 240
url: /python-net/aspose.threed/transform/rotation/
is_root: false
---

## rotation property


Gets or sets the rotation represented in quaternion.

### Example 


```python
from aspose.threed import Node
from aspose.threed.utilities import Quaternion

node = Node()
node.transform.rotation = Quaternion(1, 0, 0, 0)

```
### Definition:
```python
@property
def rotation(self):
    ...
@rotation.setter
def rotation(self, value):
    ...
```

### See Also
* module [`aspose.threed`](../../)
* class [`Quaternion`](/3d/python-net/aspose.threed.utilities/quaternion)
* class [`Transform`](/3d/python-net/aspose.threed/transform)
