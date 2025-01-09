---
title: transform_matrix property
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 300
url: /aspose.threed/transform/transform_matrix/
is_root: false
---

## transform_matrix property


Gets or sets the transform matrix.

### Remarks 


Assign on this will reset the [`Transform.translation`](/3d/python-net/aspose.threed/transform#translation), [`Transform.scaling`](/3d/python-net/aspose.threed/transform#scaling) and [`Transform.rotation`](/3d/python-net/aspose.threed/transform#rotation), the [`Transform.geometric_rotation`](/3d/python-net/aspose.threed/transform#geometric_rotation), [`Transform.geometric_scaling`](/3d/python-net/aspose.threed/transform#geometric_scaling) and [`Transform.geometric_translation`](/3d/python-net/aspose.threed/transform#geometric_translation) will not be affected.

### Example 


```python
from aspose.threed import Node
from aspose.threed.utilities import Matrix4

node = Node()
node.transform.transform_matrix = Matrix4.identity

```
### Definition:
```python
@property
def transform_matrix(self):
    ...
@transform_matrix.setter
def transform_matrix(self, value):
    ...
```

### See Also
* module [`aspose.threed`](../../)
* class [`Matrix4`](/3d/python-net/aspose.threed.utilities/matrix4)
* class [`Transform`](/3d/python-net/aspose.threed/transform)
