---
title: BoundingBox constructor
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.threed.utilities/boundingbox/__init__/
is_root: false
---

## __init__(self) {#}

Constructs a new instance of BoundingBox



```python

def __init__(self):
    ...
```




## __init__(self, minimum, maximum) {#aspose.threed.utilities.Vector3-aspose.threed.utilities.Vector3}

Initialize a finite bounding box with given minimum and maximum corner



```python

def __init__(self, minimum, maximum):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| minimum | [`Vector3`](/3d/python-net/aspose.threed.utilities/vector3) | The minimum corner |
| maximum | [`Vector3`](/3d/python-net/aspose.threed.utilities/vector3) | The maximum corner |

### Example 


The following code shows how to construct a bounding box from minimum and maximum corners.

```python
from aspose.threed.utilities import BoundingBox, Vector3

minimum = Vector3(0, 0, 0)
maximum = Vector3(10, 10, 10)
boundingBox = BoundingBox(minimum, maximum)
print("Bounding box = "  + str(boundingBox))

```


## __init__(self, min_x, min_y, min_z, max_x, max_y, max_z) {#float-float-float-float-float-float}

Initialize a finite bounding box with given minimum and maximum corner



```python

def __init__(self, min_x, min_y, min_z, max_x, max_y, max_z):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| min_x | float | The minimum corner's X |
| min_y | float | The minimum corner's Y |
| min_z | float | The minimum corner's Z |
| max_x | float | The maximum corner's X |
| max_y | float | The maximum corner's Y |
| max_z | float | The maximum corner's Z |

### Example 


The following code shows how to construct a bounding box from minimum and maximum corners.

```python
from aspose.threed.utilities import BoundingBox

boundingBox = BoundingBox(0, 0, 0, 10, 10, 10)
print("Bounding box = "  + str(boundingBox))

```



### See Also
* module [`aspose.threed.utilities`](../../)
* class [`BoundingBox`](/3d/python-net/aspose.threed.utilities/boundingbox)
