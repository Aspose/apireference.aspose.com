---
title: polygon_count property
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 260
url: /aspose.threed.entities/mesh/polygon_count/
is_root: false
---

## polygon_count property


Gets the count of polygons

### Example 


The following code shows how to get the number of mesh' polygons.

```python
from aspose.threed.entities import Sphere

mesh = Sphere().to_mesh()
print("Mesh's polygon count = "  + str(mesh.polygon_count))

```
### Definition:
```python
@property
def polygon_count(self):
    ...
```

### See Also
* module [`aspose.threed.entities`](../../)
* class [`Mesh`](/3d/python-net/aspose.threed.entities/mesh)
