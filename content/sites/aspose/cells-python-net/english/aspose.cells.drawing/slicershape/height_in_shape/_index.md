﻿---
title: height_in_shape property
second_title: Aspose.Cells for Python via .NET API References
description: 
type: docs
weight: 440
url: /aspose.cells.drawing/slicershape/height_in_shape/
is_root: false
---

## height_in_shape property


Represents the vertical offset of shape from the top border of the parent shape, in unit of 1/4000 of height of the parent shape..

### Remarks 


Only Applies when this shape in the group or chart.

### Example 


```python

if shape.is_in_group and shape.height_in_shape == 4000:
    shape.height_in_shape = 2000

```
### Definition:
```python
@property
def height_in_shape(self):
    ...
@height_in_shape.setter
def height_in_shape(self, value):
    ...
```

### See Also
* module [`aspose.cells.drawing`](../../)
* class [`SlicerShape`](/cells/python-net/aspose.cells.drawing/slicershape)
