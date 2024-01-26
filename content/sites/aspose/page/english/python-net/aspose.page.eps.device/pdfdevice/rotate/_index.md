---
title: rotate method
second_title: Aspose.Page for Python via .NET API References
description: 
type: docs
weight: 360
url: /python-net/aspose.page.eps.device/pdfdevice/rotate/
is_root: false
---

## rotate {#float}

Rotate the current transform over the Z-axis. Calls writeTransform(Transform).
Rotating with a positive angle theta rotates points on the positive x axis
toward the positive y axis.



```python
def rotate(self, theta):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| theta | float | radians over which to rotate |


## rotate {#float-float-float}

Rotate the current transformation matrix around a point.



```python
def rotate(self, theta, x, y):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| theta | float | An angle of rotation in radians. |
| x | float | X coordinate of point. |
| y | float | Y coordinate of point. |



### See Also
* module [`aspose.page.eps.device`](../../)
* class [`PdfDevice`](/page/python-net/aspose.page.eps.device/pdfdevice)
