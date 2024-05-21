---
title: position method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 80
url: /python-net/aspose.svg.builder/maskbuilder/position/
is_root: false
---

## position {#float-aspose.svg.builder.LengthType}

Sets the position of the mask.


### Returns 


The current instance of MaskBuilder.


```python
def position(self, position, type):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| position | float | The position value. |
| type | [`LengthType`](/svg/python-net/aspose.svg.builder/lengthtype) | The type of length measurement. |


## position {#aspose.svg.builder.HorizontalPosition-aspose.svg.builder.VerticalPosition}

Sets the position of the mask using predefined horizontal and vertical positions.


### Returns 


The current instance of MaskBuilder.


```python
def position(self, horizontal, vertical):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| horizontal | [`HorizontalPosition`](/svg/python-net/aspose.svg.builder/horizontalposition) | The predefined horizontal position. |
| vertical | [`VerticalPosition`](/svg/python-net/aspose.svg.builder/verticalposition) | The predefined vertical position. |


## position {#float-float-aspose.svg.builder.LengthType}

Sets the position of the mask using horizontal and vertical values.


### Returns 


The current instance of MaskBuilder.


```python
def position(self, horizontal, vertical, type):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| horizontal | float | The horizontal position value. |
| vertical | float | The vertical position value. |
| type | [`LengthType`](/svg/python-net/aspose.svg.builder/lengthtype) | The type of length measurement. |


## position {#aspose.svg.builder.HorizontalPosition-float-aspose.svg.builder.LengthType}

Sets the position of the mask using a predefined horizontal position and a vertical value.


### Returns 


The current instance of MaskBuilder.


```python
def position(self, horizontal, vertical, type):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| horizontal | [`HorizontalPosition`](/svg/python-net/aspose.svg.builder/horizontalposition) | The predefined horizontal position. |
| vertical | float | The vertical position value. |
| type | [`LengthType`](/svg/python-net/aspose.svg.builder/lengthtype) | The type of length measurement. |


## position {#aspose.svg.builder.VerticalPosition-float-aspose.svg.builder.LengthType}

Sets the position of the mask using a predefined vertical position and a horizontal value.


### Returns 


The current instance of MaskBuilder.


```python
def position(self, vertical, horizontal, type):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| vertical | [`VerticalPosition`](/svg/python-net/aspose.svg.builder/verticalposition) | The predefined vertical position. |
| horizontal | float | The horizontal position value. |
| type | [`LengthType`](/svg/python-net/aspose.svg.builder/lengthtype) | The type of length measurement. |


## position {#aspose.svg.builder.HorizontalEdge-float-aspose.svg.builder.VerticalEdge-float-aspose.svg.builder.LengthType}

Sets the position of the mask using edges and values.


### Returns 


The current instance of MaskBuilder.


```python
def position(self, horizontal_edge, horizontal_value, vertical_edge, vertical_value, type):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| horizontal_edge | [`HorizontalEdge`](/svg/python-net/aspose.svg.builder/horizontaledge) | The horizontal edge position. |
| horizontal_value | float | The horizontal position value. |
| vertical_edge | [`VerticalEdge`](/svg/python-net/aspose.svg.builder/verticaledge) | The vertical edge position. |
| vertical_value | float | The vertical position value. |
| type | [`LengthType`](/svg/python-net/aspose.svg.builder/lengthtype) | The type of length measurement. |



### See Also
* module [`aspose.svg.builder`](../../)
* class [`MaskBuilder`](/svg/python-net/aspose.svg.builder/maskbuilder)
