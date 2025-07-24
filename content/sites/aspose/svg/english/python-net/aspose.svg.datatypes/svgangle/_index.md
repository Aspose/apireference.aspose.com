---
title: SVGAngle class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.svg.datatypes/svgangle/
is_root: false
---

## SVGAngle class

The SVGAngle interface corresponds to the angle basic data type.



**Inheritance:** [`SVGAngle`](/svg/python-net/aspose.svg.datatypes/svgangle) → 
[`SVGValueType`](/svg/python-net/aspose.svg.datatypes/svgvaluetype) → 
[`DOMObject`](/svg/python-net/aspose.svg.dom/domobject)



The SVGAngle type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [unit_type](/svg/python-net/aspose.svg.datatypes/svgangle/unit_type) | The type of the value as specified by one of the SVG_ANGLETYPE_* constants defined on this interface. |
| [value](/svg/python-net/aspose.svg.datatypes/svgangle/value) | The angle value as a floating point value, in degrees. Setting this attribute will cause valueInSpecifiedUnits and valueAsString to be updated automatically to reflect this setting. |
| [value_in_specified_units](/svg/python-net/aspose.svg.datatypes/svgangle/value_in_specified_units) | The angle value as a floating point value, in the units expressed by unitType. Setting this attribute will cause value and valueAsString to be updated automatically to reflect this setting. |
| [value_as_string](/svg/python-net/aspose.svg.datatypes/svgangle/value_as_string) | The angle value as a string value, in the units expressed by unitType. Setting this attribute will cause value, valueInSpecifiedUnits and unitType to be updated automatically to reflect this setting. |
| [SVG_ANGLETYPE_UNKNOWN](/svg/python-net/aspose.svg.datatypes/svgangle/svg_angletype_unknown) | The unit type is not one of predefined unit types. It is invalid to attempt to define a new value of this type or to attempt to switch an existing value to this type. |
| [SVG_ANGLETYPE_UNSPECIFIED](/svg/python-net/aspose.svg.datatypes/svgangle/svg_angletype_unspecified) | No unit type was provided (i.e., a unitless value was specified). For angles, a unitless value is treated the same as if degrees were specified. |
| [SVG_ANGLETYPE_DEG](/svg/python-net/aspose.svg.datatypes/svgangle/svg_angletype_deg) | The unit type was explicitly set to degrees. |
| [SVG_ANGLETYPE_RAD](/svg/python-net/aspose.svg.datatypes/svgangle/svg_angletype_rad) | The unit type is radians. |
| [SVG_ANGLETYPE_GRAD](/svg/python-net/aspose.svg.datatypes/svgangle/svg_angletype_grad) | The unit type is radians. |


### Methods
| Method | Description |
| :- | :- |
| [get_platform_type](/svg/python-net/aspose.svg.datatypes/svgangle/get_platform_type/#) | This method is used to retrieve the ECMAScript object Type. |
| [new_value_specified_units](/svg/python-net/aspose.svg.datatypes/svgangle/new_value_specified_units/#int-float) | Reset the value as a number with an associated unitType, thereby replacing the values for all of the attributes on the object. |
| [convert_to_specified_units](/svg/python-net/aspose.svg.datatypes/svgangle/convert_to_specified_units/#int) | Preserve the same underlying stored value, but reset the stored unit identifier to the given unitType. Object attributes unitType, valueInSpecifiedUnits and valueAsString might be modified as a result of this method. |



### See Also
* module [`aspose.svg.datatypes`](..)
* class [`DOMObject`](/svg/python-net/aspose.svg.dom/domobject)
* class [`SVGAngle`](/svg/python-net/aspose.svg.datatypes/svgangle)
* class [`SVGValueType`](/svg/python-net/aspose.svg.datatypes/svgvaluetype)
