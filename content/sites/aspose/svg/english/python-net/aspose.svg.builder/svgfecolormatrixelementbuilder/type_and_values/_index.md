---
title: type_and_values method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 50
url: /python-net/aspose.svg.builder/svgfecolormatrixelementbuilder/type_and_values/
is_root: false
---

## type_and_values {#aspose.svg.builder.ColorMatrixOperation-list}

Sets the 'type' and 'values' attributes of the feColorMatrix element, specifying the color matrix operation and its parameters.


### Returns 


The current builder instance.


```python
def type_and_values(self, type, values):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| type | [`ColorMatrixOperation`](/svg/python-net/aspose.svg.builder/colormatrixoperation) | The ColorMatrixOperation enum value representing the type of color matrix operation. |
| values | list | The parameters for the color matrix operation. |
### Exceptions
| Exception | Description |
| :- | :- |
| ArgumentException | Thrown when the provided values do not match the requirements of the specified type. |
| NotSupportedException | Thrown when an unsupported matrix operation type is provided. |





### See Also
* module [`aspose.svg.builder`](../../)
* class [`SVGFEColorMatrixElementBuilder`](/svg/python-net/aspose.svg.builder/svgfecolormatrixelementbuilder)
