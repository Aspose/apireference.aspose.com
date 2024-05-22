---
title: convert_to_specified_units method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.svg.datatypes/svgangle/convert_to_specified_units/
is_root: false
---

## convert_to_specified_units {#int}

Preserve the same underlying stored value, but reset the stored unit identifier to the given unitType. Object attributes unitType, valueInSpecifiedUnits and valueAsString might be modified as a result of this method.



```python
def convert_to_specified_units(self, unit_type):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| unit_type | int | The unit type to switch to (e.g., SVG_ANGLETYPE_DEG). |
### Exceptions
| Exception | Description |
| :- | :- |
| [`DOMException`](/svg/python-net/aspose.svg.dom/domexception) | Code [`DOMException.NOT_SUPPORTED_ERR`](/svg/python-net/aspose.svg.dom/domexception)<br/>Raised if unitType is SVG_ANGLETYPE_UNKNOWN or not a valid unit type constant (one of the other SVG_ANGLETYPE_* constants defined on this interface). |
| [`DOMException`](/svg/python-net/aspose.svg.dom/domexception) | Code [`DOMException.NO_MODIFICATION_ALLOWED_ERR`](/svg/python-net/aspose.svg.dom/domexception)<br/>Raised when the angle corresponds to a read only attribute or when the object itself is read only. |





### See Also
* module [`aspose.svg.datatypes`](../../)
* class [`DOMException`](/svg/python-net/aspose.svg.dom/domexception)
* class [`SVGAngle`](/svg/python-net/aspose.svg.datatypes/svgangle)
