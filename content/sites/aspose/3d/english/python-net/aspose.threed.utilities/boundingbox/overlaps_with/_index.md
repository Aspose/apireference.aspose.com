---
title: overlaps_with method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 50
url: /aspose.threed.utilities/boundingbox/overlaps_with/
is_root: false
---

## overlaps_with {#aspose.threed.utilities.BoundingBox}

Check if current bounding box overlaps with specified bounding box.


### Returns 


True if the current bounding box overlaps with the given one.


```python
def overlaps_with(self, box):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| box | [`BoundingBox`](/3d/python-net/aspose.threed.utilities/boundingbox) | The other bounding box to test |

### Example 


The following code shows how to check if two bounding boxes overlaps with each other.

```python
from aspose.threed.utilities import BoundingBox

boundingBox = BoundingBox(0, 0, 0, 10, 10, 10)
bbox2 = BoundingBox(1, 1, 1, 11, 11, 11)
print("Bounding box overlaps = "  + str(boundingBox.overlaps_with(bbox2)))

```



### See Also
* module [`aspose.threed.utilities`](../../)
* class [`BoundingBox`](/3d/python-net/aspose.threed.utilities/boundingbox)
