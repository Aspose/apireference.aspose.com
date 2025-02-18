---
title: SVGLength Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.DataTypes.SVGLength class. The SVGLength interface corresponds to the length basic data type. An SVGLength object can be designated as read only which means that attempts to modify the object will result in an exception being thrown as described below
type: docs
weight: 6020
url: /net/aspose.svg.datatypes/svglength/
---
## SVGLength class

The SVGLength interface corresponds to the length basic data type. An SVGLength object can be designated as read only, which means that attempts to modify the object will result in an exception being thrown, as described below.

```csharp
public class SVGLength : SVGValueType
```

## Properties

| Name | Description |
| --- | --- |
| [UnitType](../../aspose.svg.datatypes/svglength/unittype/) { get; } | The type of the value as specified by one of the SVG_LENGTHTYPE_* constants defined on this interface. |
| [Value](../../aspose.svg.datatypes/svglength/value/) { get; set; } | The value as a floating point value, in user units. Setting this attribute will cause valueInSpecifiedUnits and valueAsString to be updated automatically to reflect this setting. |
| [ValueAsString](../../aspose.svg.datatypes/svglength/valueasstring/) { get; set; } | The value as a string value, in the units expressed by unitType. Setting this attribute will cause value, valueInSpecifiedUnits and unitType to be updated automatically to reflect this setting. |
| [ValueInSpecifiedUnits](../../aspose.svg.datatypes/svglength/valueinspecifiedunits/) { get; set; } | The value as a floating point value, in the units expressed by unitType. Setting this attribute will cause value and valueAsString to be updated automatically to reflect this setting. |

## Methods

| Name | Description |
| --- | --- |
| [ConvertToSpecifiedUnits](../../aspose.svg.datatypes/svglength/converttospecifiedunits/)(ushort) | Preserve the same underlying stored value, but reset the stored unit identifier to the given unitType. Object attributes unitType, valueInSpecifiedUnits and valueAsString might be modified as a result of this method. For example, if the original value were "0.5cm" and the method was invoked to convert to millimeters, then the unitType would be changed to SVG_LENGTHTYPE_MM, valueInSpecifiedUnits would be changed to the numeric value 5 and valueAsString would be changed to "5mm". |
| [Dispose](../../aspose.svg.datatypes/svgvaluetype/dispose/)() | Releases unmanaged and - optionally - managed resources. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | This method is used to retrieve ECMAScript object Type. |
| [NewValueSpecifiedUnits](../../aspose.svg.datatypes/svglength/newvaluespecifiedunits/)(ushort, float) | Reset the value as a number with an associated unitType, thereby replacing the values for all of the attributes on the object. |
| override [ToString](../../aspose.svg.datatypes/svglength/tostring/)() | Returns a String that represents this instance. |

## Fields

| Name | Description |
| --- | --- |
| const [SVG_LENGTHTYPE_CM](../../aspose.svg.datatypes/svglength/svg_lengthtype_cm/) | A value was specified using the cm units defined in CSS2. |
| const [SVG_LENGTHTYPE_EMS](../../aspose.svg.datatypes/svglength/svg_lengthtype_ems/) | A value was specified using the em units defined in CSS2. |
| const [SVG_LENGTHTYPE_EXS](../../aspose.svg.datatypes/svglength/svg_lengthtype_exs/) | A value was specified using the ex units defined in CSS2. |
| const [SVG_LENGTHTYPE_IN](../../aspose.svg.datatypes/svglength/svg_lengthtype_in/) | A value was specified using the in units defined in CSS2. |
| const [SVG_LENGTHTYPE_MM](../../aspose.svg.datatypes/svglength/svg_lengthtype_mm/) | A value was specified using the mm units defined in CSS2. |
| const [SVG_LENGTHTYPE_NUMBER](../../aspose.svg.datatypes/svglength/svg_lengthtype_number/) | No unit type was provided (i.e., a unitless value was specified), which indicates a value in user units. |
| const [SVG_LENGTHTYPE_PC](../../aspose.svg.datatypes/svglength/svg_lengthtype_pc/) | A value was specified using the pc units defined in CSS2. |
| const [SVG_LENGTHTYPE_PERCENTAGE](../../aspose.svg.datatypes/svglength/svg_lengthtype_percentage/) | A percentage value was specified. |
| const [SVG_LENGTHTYPE_PT](../../aspose.svg.datatypes/svglength/svg_lengthtype_pt/) | A value was specified using the pt units defined in CSS2. |
| const [SVG_LENGTHTYPE_PX](../../aspose.svg.datatypes/svglength/svg_lengthtype_px/) | A value was specified using the px units defined in CSS2. |
| const [SVG_LENGTHTYPE_UNKNOWN](../../aspose.svg.datatypes/svglength/svg_lengthtype_unknown/) | The unit type is not one of predefined unit types. It is invalid to attempt to define a new value of this type or to attempt to switch an existing value to this type. |

### See Also

* class [SVGValueType](../svgvaluetype/)
* namespace [Aspose.Svg.DataTypes](../../aspose.svg.datatypes/)
* assembly [Aspose.SVG](../../)
