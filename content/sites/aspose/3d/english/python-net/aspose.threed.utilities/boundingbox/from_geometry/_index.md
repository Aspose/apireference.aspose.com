---
title: from_geometry method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.threed.utilities/boundingbox/from_geometry/
is_root: false
---

## from_geometry(, geometry) {#aspose.threed.entities.Geometry}

Construct a bounding box from given geometry


### Returns 


The bounding box of given geometry


```python

@staticmethod
def from_geometry(geometry):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| geometry | aspose.threed.entities.Geometry | The geometry to calculate bounding box |

### Example 


The following code shows how to construct a bounding box from a geometry instance.

```python
from aspose.threed.entities import Sphere
from aspose.threed.utilities import BoundingBox

sphere = Sphere().to_mesh()
boundingBox = BoundingBox.from_geometry(sphere)
print("Bounding box = "  + str(boundingBox))

```



### See Also
* module [`aspose.threed.utilities`](../../)
* class [`BoundingBox`](/3d/python-net/aspose.threed.utilities/boundingbox)
