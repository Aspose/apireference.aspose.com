---
title: get_bounding_box method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.threed.entities/primitive/get_bounding_box/
is_root: false
---

## get_bounding_box() {#}

Gets the bounding box of current entity in its object space coordinate system.



```python
def get_bounding_box(self):
    ...
```



### Example 


The following code shows how to calculate the bounding box of a shape

```python
from aspose.threed.entities import Sphere

entity = Sphere()
bbox = entity.get_bounding_box()
print(f"The bounding box of the entity is {bbox.minimum} ~ {bbox.maximum}")

```



### See Also
* module [aspose.threed.entities](../../)
* class [Primitive](/3d/python-net/aspose.threed.entities/primitive)
