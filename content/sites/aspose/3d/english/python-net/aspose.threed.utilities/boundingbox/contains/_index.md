---
title: contains method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 20
url: /aspose.threed.utilities/boundingbox/contains/
is_root: false
---

## contains {#aspose.threed.utilities.Vector3}

Check if the point p is inside the bounding box


### Returns 


True if the point is inside the bounding box


```python
def contains(self, p):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| p | [`Vector3`](/3d/python-net/aspose.threed.utilities/vector3) | The point to test |

### Example 


The following code shows how to check if a point is inside the bounding box.

```python
from aspose.threed.utilities import BoundingBox, Vector3

boundingBox = BoundingBox(0, 0, 0, 10, 10, 10)
pt = Vector3(4, 4, 4)
print("Bounding box overlaps = "  + str(boundingBox.contains(pt)))

```



### See Also
* module [`aspose.threed.utilities`](../../)
* class [`BoundingBox`](/3d/python-net/aspose.threed.utilities/boundingbox)
