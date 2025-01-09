---
title: merge method
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 40
url: /aspose.threed.utilities/boundingbox/merge/
is_root: false
---

## merge {#aspose.threed.utilities.Vector4}

Merge current bounding box with given point



```python
def merge(self, pt):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| pt | [`Vector4`](/3d/python-net/aspose.threed.utilities/vector4) | The point to be merged into the bounding box |

### Example 


The following code shows how to merge a point to bounding box.

```python
from aspose.threed.utilities import BoundingBox, Vector4

boundingBox = BoundingBox.null
boundingBox.merge(Vector4(1, 10, -1))
print("Bounding box = "  + str(boundingBox))

```


## merge {#aspose.threed.utilities.Vector3}

Merge current bounding box with given point



```python
def merge(self, pt):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| pt | [`Vector3`](/3d/python-net/aspose.threed.utilities/vector3) | The point to be merged into the bounding box |

### Example 


The following code shows how to merge a point to bounding box.

```python
from aspose.threed.utilities import BoundingBox, Vector3

boundingBox = BoundingBox.null
boundingBox.merge(Vector3(1, 10, -1))
print("Bounding box = "  + str(boundingBox))

```


## merge {#aspose.threed.utilities.BoundingBox}

Merges the new box into the current bounding box.



```python
def merge(self, bb):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| bb | [`BoundingBox`](/3d/python-net/aspose.threed.utilities/boundingbox) | The bounding box to merge |


## merge {#float-float-float}

Merge current bounding box with given point



```python
def merge(self, x, y, z):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| x | float | The point to be merged into the bounding box |
| y | float | The point to be merged into the bounding box |
| z | float | The point to be merged into the bounding box |

### Example 


The following code shows how to merge a point to bounding box.

```python
from aspose.threed.utilities import BoundingBox

boundingBox = BoundingBox.null
boundingBox.merge(1, 10, -1)
print("Bounding box = "  + str(boundingBox))

```



### See Also
* module [`aspose.threed.utilities`](../../)
* class [`BoundingBox`](/3d/python-net/aspose.threed.utilities/boundingbox)
