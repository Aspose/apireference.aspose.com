---
title: ComponentTransferType enumeration
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 1330
url: /python-net/aspose.svg.builder/componenttransfertype/
is_root: false
---

## ComponentTransferType enumeration

Specifies the type of component transfer function to be applied in the FeComponentTransfer filter primitive of an SVG.



The ComponentTransferType type exposes the following members:

### Fields
| Field | Description |
| :- | :- |
| IDENTITY | Represents no change in the input graphic. This is the default type. |
| TABLE | Uses a lookup table to define the function within the filter. |
| DISCRETE | Uses a set of discrete values to define the function in the filter. |
| LINEAR | Defines a linear transformation of the component within the filter. |
| GAMMA | Defines a gamma correction transformation in the filter. |



### Remarks 


The FeComponentTransfer filter primitive allows for individual manipulation of color components (RGB and alpha) of graphics elements using different types of transfer functions. Each type defines a distinct method of computation for color component transformation within the filter.

### See Also
* module [`aspose.svg.builder`](..)
