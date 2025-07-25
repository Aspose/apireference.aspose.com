---
title: SVGAngle.NewValueSpecifiedUnits
second_title: Aspose.HTML for .NET API Reference
description: SVGAngle NewValueSpecifiedUnits method. Reset the value as a number with an associated unitType thereby replacing the values for all of the attributes on the object
type: docs
weight: 60
url: /net/aspose.html.dom.svg.datatypes/svgangle/newvaluespecifiedunits/
---
## SVGAngle.NewValueSpecifiedUnits method

Reset the value as a number with an associated unitType, thereby replacing the values for all of the attributes on the object.

```csharp
public void NewValueSpecifiedUnits(ushort newUnitType, float valueInSpecifiedUnits)
```

| Parameter | Type | Description |
| --- | --- | --- |
| newUnitType | UInt16 | The unit type for the value (e.g., SVG_ANGLETYPE_DEG). |
| valueInSpecifiedUnits | Single | The angle value. |

### Exceptions

| exception | condition |
| --- | --- |
| [DOMException](../../../aspose.html.dom/domexception/) | Code [`NOT_SUPPORTED_ERR`](../../../aspose.html.dom/domexception/not_supported_err/) Raised if unitType is SVG_ANGLETYPE_UNKNOWN or not a valid unit type constant (one of the other SVG_ANGLETYPE_* constants defined on this interface). |
| [DOMException](../../../aspose.html.dom/domexception/) | Code [`NO_MODIFICATION_ALLOWED_ERR`](../../../aspose.html.dom/domexception/no_modification_allowed_err/) Raised when the angle corresponds to a read only attribute or when the object itself is read only. |

### See Also

* class [SVGAngle](../)
* namespace [Aspose.Html.Dom.Svg.DataTypes](../../../aspose.html.dom.svg.datatypes/)
* assembly [Aspose.HTML](../../../)
