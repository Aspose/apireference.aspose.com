---
title: inflate method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 60
url: /aspose.cad/rectangle/inflate/
is_root: false
---

## inflate {#aspose.cad.Size}

Inflates this [`Rectangle`](/cad/python-net/aspose.cad/rectangle) by the specified amount.



```python
def inflate(self, size):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| size | [`Size`](/cad/python-net/aspose.cad/size) | The amount to inflate this rectangle. |


## inflate {#int-int}

Inflates this [`Rectangle`](/cad/python-net/aspose.cad/rectangle) by the specified amount.



```python
def inflate(self, width, height):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| width | int | The amount to inflate this [`Rectangle`](/cad/python-net/aspose.cad/rectangle) horizontally. |
| height | int | The amount to inflate this [`Rectangle`](/cad/python-net/aspose.cad/rectangle) vertically. |


## inflate {#aspose.cad.Rectangle-int-int}

Creates and returns an inflated copy of the specified [`Rectangle`](/cad/python-net/aspose.cad/rectangle) structure. The copy is inflated by the specified amount. The original [`Rectangle`](/cad/python-net/aspose.cad/rectangle) structure remains unmodified.


### Returns 


The inflated [`Rectangle`](/cad/python-net/aspose.cad/rectangle).


```python
def inflate(self, rect, x, y):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| rect | [`Rectangle`](/cad/python-net/aspose.cad/rectangle) | The [`Rectangle`](/cad/python-net/aspose.cad/rectangle) with which to start. This rectangle is not modified. |
| x | int | The amount to inflate this [`Rectangle`](/cad/python-net/aspose.cad/rectangle) horizontally. |
| y | int | The amount to inflate this [`Rectangle`](/cad/python-net/aspose.cad/rectangle) vertically. |



### See Also
* module [`aspose.cad`](../../)
* class [`Rectangle`](/cad/python-net/aspose.cad/rectangle)
