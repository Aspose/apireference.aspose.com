---
title: from_argb method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 20
url: /aspose.cad/color/from_argb/
is_root: false
---

## from_argb {#int}

Creates a [`Color`](/cad/python-net/aspose.cad/color) structure from a 32-bit ARGB value.


### Returns 


The [`Color`](/cad/python-net/aspose.cad/color) structure that this method creates.


```python
def from_argb(self, argb):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| argb | int | A value specifying the 32-bit ARGB value. |


## from_argb {#int-aspose.cad.Color}

Creates a [`Color`](/cad/python-net/aspose.cad/color) structure from the specified [`Color`](/cad/python-net/aspose.cad/color) structure, but with the new specified alpha value. Although this method allows a 32-bit value to be passed for the alpha value, the value is limited to 8 bits.


### Returns 


The [`Color`](/cad/python-net/aspose.cad/color) that this method creates.


```python
def from_argb(self, alpha, base_color):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| alpha | int | The alpha value for the new [`Color`](/cad/python-net/aspose.cad/color). Valid values are 0 through 255. |
| base_color | [`Color`](/cad/python-net/aspose.cad/color) | The [`Color`](/cad/python-net/aspose.cad/color) from which to create the new [`Color`](/cad/python-net/aspose.cad/color). |
### Exceptions
| Exception | Description |
| :- | :- |
| ArgumentOutOfRangeException | `alpha` is less than 0 or greater than 255. |




## from_argb {#int-int-int}

Creates a [`Color`](/cad/python-net/aspose.cad/color) structure from the specified 8-bit color values (red, green, and blue). The alpha value is implicitly 255 (fully opaque). Although this method allows a 32-bit value to be passed for each color component, the value of each component is limited to 8 bits.


### Returns 


The [`Color`](/cad/python-net/aspose.cad/color) that this method creates.


```python
def from_argb(self, red, green, blue):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| red | int | The red component value for the new [`Color`](/cad/python-net/aspose.cad/color). Valid values are 0 through 255. |
| green | int | The green component value for the new [`Color`](/cad/python-net/aspose.cad/color). Valid values are 0 through 255. |
| blue | int | The blue component value for the new [`Color`](/cad/python-net/aspose.cad/color). Valid values are 0 through 255. |
### Exceptions
| Exception | Description |
| :- | :- |
| ArgumentOutOfRangeException | `red`, `green`, or `blue` is less than 0 or greater than 255. |




## from_argb {#int-int-int-int}

Creates a [`Color`](/cad/python-net/aspose.cad/color) structure from the four ARGB component (alpha, red, green, and blue) values. Although this method allows a 32-bit value to be passed for each component, the value of each component is limited to 8 bits.


### Returns 


The [`Color`](/cad/python-net/aspose.cad/color) that this method creates.


```python
def from_argb(self, alpha, red, green, blue):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| alpha | int | The alpha component. Valid values are 0 through 255. |
| red | int | The red component. Valid values are 0 through 255. |
| green | int | The green component. Valid values are 0 through 255. |
| blue | int | The blue component. Valid values are 0 through 255. |
### Exceptions
| Exception | Description |
| :- | :- |
| ArgumentOutOfRangeException | `alpha`, `red`, `green`, or `blue` is less than 0 or greater than 255. |





### See Also
* module [`aspose.cad`](../../)
* class [`Color`](/cad/python-net/aspose.cad/color)
