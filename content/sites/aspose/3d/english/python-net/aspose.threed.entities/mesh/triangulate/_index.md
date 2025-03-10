---
title: triangulate method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 180
url: /python-net/aspose.threed.entities/mesh/triangulate/
is_root: false
---

## triangulate(self) {#}

Return triangulated mesh


### Returns 


Current mesh if current mesh is already triangulated, otherwise a new triangulated mesh will be calculated and returned


```python

def triangulate(self):
    ...
```



### Example 


The following code shows how to triangulate a mesh:

```python
from aspose.threed.entities import Plane

# The plane mesh has only one polygon with 4 control points
mesh = Plane().to_mesh()
# After triangulated, the new mesh's rectangle will become 2 triangles.
triangulated = mesh.triangulate()

```



### See Also
* module [`aspose.threed.entities`](../../)
* class [`Mesh`](/3d/python-net/aspose.threed.entities/mesh)
