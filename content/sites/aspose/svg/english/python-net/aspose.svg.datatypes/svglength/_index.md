---
title: SVGLength class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 140
url: /python-net/aspose.svg.datatypes/svglength/
is_root: false
---

## SVGLength class

The SVGLength interface corresponds to the length basic data type.
An SVGLength object can be designated as read only, which means that attempts to modify the object will result in an exception being thrown, as described below.



**Inheritance:** [`SVGLength`](/svg/python-net/aspose.svg.datatypes/svglength) → 
[`SVGValueType`](/svg/python-net/aspose.svg.datatypes/svgvaluetype) → 
[`DOMObject`](/svg/python-net/aspose.svg.dom/domobject)



The SVGLength type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [unit_type](/svg/python-net/aspose.svg.datatypes/svglength/unit_type) | The type of the value as specified by one of the SVG_LENGTHTYPE_* constants defined on this interface. |
| [value](/svg/python-net/aspose.svg.datatypes/svglength/value) | The value as a floating point value, in user units. Setting this attribute will cause valueInSpecifiedUnits and valueAsString to be updated automatically to reflect this setting. |
| [value_in_specified_units](/svg/python-net/aspose.svg.datatypes/svglength/value_in_specified_units) | The value as a floating point value, in the units expressed by unitType. Setting this attribute will cause value and valueAsString to be updated automatically to reflect this setting. |
| [value_as_string](/svg/python-net/aspose.svg.datatypes/svglength/value_as_string) | The value as a string value, in the units expressed by unitType. Setting this attribute will cause value, valueInSpecifiedUnits and unitType to be updated automatically to reflect this setting. |
| [SVG_LENGTHTYPE_UNKNOWN](/svg/python-net/aspose.svg.datatypes/svglength/svg_lengthtype_unknown) | The unit type is not one of predefined unit types. It is invalid to attempt to define a new value of this type or to attempt to switch an existing value to this type. |
| [SVG_LENGTHTYPE_NUMBER](/svg/python-net/aspose.svg.datatypes/svglength/svg_lengthtype_number) | No unit type was provided (i.e., a unitless value was specified), which indicates a value in user units. |
| [SVG_LENGTHTYPE_PERCENTAGE](/svg/python-net/aspose.svg.datatypes/svglength/svg_lengthtype_percentage) | A percentage value was specified. |
| [SVG_LENGTHTYPE_EMS](/svg/python-net/aspose.svg.datatypes/svglength/svg_lengthtype_ems) | A value was specified using the em units defined in CSS2. |
| [SVG_LENGTHTYPE_EXS](/svg/python-net/aspose.svg.datatypes/svglength/svg_lengthtype_exs) | A value was specified using the ex units defined in CSS2. |
| [SVG_LENGTHTYPE_PX](/svg/python-net/aspose.svg.datatypes/svglength/svg_lengthtype_px) | A value was specified using the px units defined in CSS2. |
| [SVG_LENGTHTYPE_CM](/svg/python-net/aspose.svg.datatypes/svglength/svg_lengthtype_cm) | A value was specified using the cm units defined in CSS2. |
| [SVG_LENGTHTYPE_MM](/svg/python-net/aspose.svg.datatypes/svglength/svg_lengthtype_mm) | A value was specified using the mm units defined in CSS2. |
| [SVG_LENGTHTYPE_IN](/svg/python-net/aspose.svg.datatypes/svglength/svg_lengthtype_in) | A value was specified using the in units defined in CSS2. |
| [SVG_LENGTHTYPE_PT](/svg/python-net/aspose.svg.datatypes/svglength/svg_lengthtype_pt) | A value was specified using the pt units defined in CSS2. |
| [SVG_LENGTHTYPE_PC](/svg/python-net/aspose.svg.datatypes/svglength/svg_lengthtype_pc) | A value was specified using the pc units defined in CSS2. |


### Methods
| Method | Description |
| :- | :- |
| [get_platform_type](/svg/python-net/aspose.svg.datatypes/svglength/get_platform_type/#) | This method is used to retrieve the ECMAScript object Type. |
| [new_value_specified_units](/svg/python-net/aspose.svg.datatypes/svglength/new_value_specified_units/#int-float) | Reset the value as a number with an associated unitType, thereby replacing the values for all of the attributes on the object. |
| [convert_to_specified_units](/svg/python-net/aspose.svg.datatypes/svglength/convert_to_specified_units/#int) | Preserve the same underlying stored value, but reset the stored unit identifier to the given unitType. Object attributes unitType, valueInSpecifiedUnits and valueAsString might be modified as a result of this method. For example, if the original value were "0.5cm" and the method was invoked to convert to millimeters, then the unitType would be changed to SVG_LENGTHTYPE_MM, valueInSpecifiedUnits would be changed to the numeric value 5 and valueAsString would be changed to "5mm". |



### See Also
* module [`aspose.svg.datatypes`](..)
* class [`DOMObject`](/svg/python-net/aspose.svg.dom/domobject)
* class [`SVGLength`](/svg/python-net/aspose.svg.datatypes/svglength)
* class [`SVGValueType`](/svg/python-net/aspose.svg.datatypes/svgvaluetype)
