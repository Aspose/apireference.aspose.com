---
title: new_value_specified_units method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.svg.datatypes/svglength/new_value_specified_units/
is_root: false
---

## new_value_specified_units {#int-float}

Reset the value as a number with an associated unitType, thereby replacing the values for all of the attributes on the object.



```python
def new_value_specified_units(self, unit_type, value_in_specified_units):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| unit_type | int | The unit type for the value. |
| value_in_specified_units | float | The new value.. |
### Exceptions
| Exception | Description |
| :- | :- |
| [`DOMException`](/svg/python-net/aspose.svg.dom/domexception) | Code [`DOMException.NOT_SUPPORTED_ERR`](/svg/python-net/aspose.svg.dom/domexception)<br/>Raised if unitType is SVG_LENGTHTYPE_UNKNOWN or not a valid unit type constant (one of the other SVG_LENGTHTYPE_* constants defined on this interface). |
| [`DOMException`](/svg/python-net/aspose.svg.dom/domexception) | Code [`DOMException.NO_MODIFICATION_ALLOWED_ERR`](/svg/python-net/aspose.svg.dom/domexception)<br/>Raised when the length corresponds to a read only attribute or when the object itself is read only. |





### See Also
* module [`aspose.svg.datatypes`](../../)
* class [`DOMException`](/svg/python-net/aspose.svg.dom/domexception)
* class [`SVGLength`](/svg/python-net/aspose.svg.datatypes/svglength)
