---
title: intersect method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 60
url: /aspose.cad/rectanglef/intersect/
is_root: false
---

## intersect {#aspose.cad.RectangleF}

Replaces this [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) structure with the intersection of itself and the specified [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) structure.



```python
def intersect(self, rect):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| rect | [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) | The rectangle to intersect. |


## intersect {#aspose.cad.RectangleF-aspose.cad.RectangleF}

Returns a [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) structure that represents the intersection of two rectangles. If there is no intersection, and empty [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) is returned.


### Returns 


A third [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) structure the size of which represents the overlapped area of the two specified rectangles.


```python
def intersect(self, a, b):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| a | [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) | A first rectangle to intersect. |
| b | [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) | A second rectangle to intersect. |



### See Also
* module [`aspose.cad`](../../)
* class [`RectangleF`](/cad/python-net/aspose.cad/rectanglef)
