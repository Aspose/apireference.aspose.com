---
title: BoundingBox class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.threed.utilities/boundingbox/
is_root: false
---

## BoundingBox class

The axis-aligned bounding box



The BoundingBox type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [`__init__(self, minimum, maximum)`](/3d/python-net/aspose.threed.utilities/boundingbox/__init__/#aspose.threed.utilities.vector3-aspose.threed.utilities.vector3) | Initialize a finite bounding box with given minimum and maximum corner |
| [`__init__(self, min_x, min_y, min_z, max_x, max_y, max_z)`](/3d/python-net/aspose.threed.utilities/boundingbox/__init__/#float-float-float-float-float-float) | Initialize a finite bounding box with given minimum and maximum corner |
| [`__init__(self)`](/3d/python-net/aspose.threed.utilities/boundingbox/__init__/#) | Constructs a new instance of BoundingBox |


### Properties
| Property | Description |
| :- | :- |
| [null](/3d/python-net/aspose.threed.utilities/boundingbox/null) | The null bounding box |
| [infinite](/3d/python-net/aspose.threed.utilities/boundingbox/infinite) | The infinite bounding box |
| [extent](/3d/python-net/aspose.threed.utilities/boundingbox/extent) | Gets the extent of the bounding box. |
| [minimum](/3d/python-net/aspose.threed.utilities/boundingbox/minimum) | The minimum corner of the bounding box |
| [maximum](/3d/python-net/aspose.threed.utilities/boundingbox/maximum) | The maximum corner of the bounding box |
| [size](/3d/python-net/aspose.threed.utilities/boundingbox/size) | The size of the bounding box |
| [center](/3d/python-net/aspose.threed.utilities/boundingbox/center) | The center of the bounding box. |


### Methods
| Method | Description |
| :- | :- |
| [`merge(self, pt)`](/3d/python-net/aspose.threed.utilities/boundingbox/merge/#aspose.threed.utilities.vector4) | Merge current bounding box with given point |
| [`merge(self, pt)`](/3d/python-net/aspose.threed.utilities/boundingbox/merge/#aspose.threed.utilities.vector3) | Merge current bounding box with given point |
| [`merge(self, x, y, z)`](/3d/python-net/aspose.threed.utilities/boundingbox/merge/#float-float-float) | Merge current bounding box with given point |
| [`merge(self, bb)`](/3d/python-net/aspose.threed.utilities/boundingbox/merge/#aspose.threed.utilities.boundingbox) | Merges the new box into the current bounding box. |
| [`scale(self)`](/3d/python-net/aspose.threed.utilities/boundingbox/scale/#) | Calculates the absolute largest coordinate value of any contained point. |
| [`from_geometry(, geometry)`](/3d/python-net/aspose.threed.utilities/boundingbox/from_geometry/#aspose.threed.entities.geometry) | Construct a bounding box from given geometry |
| [`overlaps_with(self, box)`](/3d/python-net/aspose.threed.utilities/boundingbox/overlaps_with/#aspose.threed.utilities.boundingbox) | Check if current bounding box overlaps with specified bounding box. |
| [`contains(self, p)`](/3d/python-net/aspose.threed.utilities/boundingbox/contains/#aspose.threed.utilities.vector3) | Check if the point p is inside the bounding box |



### Example 


The following code shows how to get a bounding box from an Entity instance.

```python
from aspose.threed.entities import Sphere

sphere = Sphere()
boundingBox = sphere.get_bounding_box()
print("Bounding box = "  + str(boundingBox))

```

### See Also
* module [`aspose.threed.utilities`](..)
