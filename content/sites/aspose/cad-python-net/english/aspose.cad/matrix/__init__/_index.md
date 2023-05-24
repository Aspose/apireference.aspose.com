---
title: Matrix constructor
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 10
url: /aspose.cad/matrix/__init__/
is_root: false
---

## __init__ {#}

Initializes a new instance of the Matrix class as the identity matrix.



```python
def __init__(self):
    ...
```




## __init__ {#aspose.cad.RectangleF-list}

Initializes a new instance of the [`Matrix`](/cad/python-net/aspose.cad/matrix) class to the geometric transform defined by the specified rectangle and array of points.



```python
def __init__(self, rect, plgpts):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| rect | [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) | A [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) structure that represents the rectangle to be transformed. |
| plgpts | list | An array of three [`PointF`](/cad/python-net/aspose.cad/pointf) structures that represents the points of a parallelogram to which the upper-left, upper-right, and lower-left corners of the rectangle is to be transformed. The lower-right corner of the parallelogram is implied by the first three corners. |


## __init__ {#aspose.cad.Rectangle-list}

Initializes a new instance of the [`Matrix`](/cad/python-net/aspose.cad/matrix) class to the geometric transform defined by the specified rectangle and array of points.



```python
def __init__(self, rect, plgpts):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| rect | [`Rectangle`](/cad/python-net/aspose.cad/rectangle) | A [`Rectangle`](/cad/python-net/aspose.cad/rectangle) structure that represents the rectangle to be transformed. |
| plgpts | list | An array of three [`Point`](/cad/python-net/aspose.cad/point) structures that represents the points of a parallelogram to which the upper-left, upper-right, and lower-left corners of the rectangle is to be transformed. The lower-right corner of the parallelogram is implied by the first three corners. |


## __init__ {#float-float-float-float-float-float}

Initializes a new instance of the [`Matrix`](/cad/python-net/aspose.cad/matrix) class.



```python
def __init__(self, m11, m12, m21, m22, m31, m32):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| m11 | float | m00     M11     Scale X |
| m12 | float | m10     M12     Shear Y |
| m21 | float | m01     M21     Shear X |
| m22 | float | m11     M22     Scale Y |
| m31 | float | m02     M31     Translate X |
| m32 | float | m12     M32     Translate Y |



### See Also
* module [`aspose.cad`](../../)
* class [`Matrix`](/cad/python-net/aspose.cad/matrix)
* class [`Point`](/cad/python-net/aspose.cad/point)
* class [`PointF`](/cad/python-net/aspose.cad/pointf)
* class [`Rectangle`](/cad/python-net/aspose.cad/rectangle)
* class [`RectangleF`](/cad/python-net/aspose.cad/rectanglef)
