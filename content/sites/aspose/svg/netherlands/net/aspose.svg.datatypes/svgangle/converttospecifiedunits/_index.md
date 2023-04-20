---
title: SVGAngle.ConvertToSpecifiedUnits
second_title: Aspose.SVG voor .NET API-referentie
description: SVGAngle methode. Behoud dezelfde onderliggende opgeslagen waarde maar reset de opgeslagen eenheidID naar het gegeven unitType. Objectkenmerken unitType valueInSpecifiedUnits en valueAsString kunnen als resultaat van deze methode worden gewijzigd.
type: docs
weight: 50
url: /nl/net/aspose.svg.datatypes/svgangle/converttospecifiedunits/
---
## SVGAngle.ConvertToSpecifiedUnits method

Behoud dezelfde onderliggende opgeslagen waarde, maar reset de opgeslagen eenheid-ID naar het gegeven unitType. Objectkenmerken unitType, valueInSpecifiedUnits en valueAsString kunnen als resultaat van deze methode worden gewijzigd.

```csharp
public void ConvertToSpecifiedUnits(ushort unitType)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| unitType | UInt16 | Het eenheidstype waarnaar moet worden overgeschakeld (bijv. SVG_ANGLETYPE_DEG). |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | -code[`NOT_SUPPORTED_ERR`](../../../aspose.svg.dom/domexception/not_supported_err/) Wordt verhoogd als unitType SVG_ANGLETYPE_UNKNOWN is of geen geldige eenheidstypeconstante is (een van de andere SVG_ANGLETYPE_*-constanten die op deze interface zijn gedefinieerd). |
| [DOMException](../../../aspose.svg.dom/domexception/) | -code[`NO_MODIFICATION_ALLOWED_ERR`](../../../aspose.svg.dom/domexception/no_modification_allowed_err/) Verhoogd wanneer de hoek overeenkomt met een alleen-lezen kenmerk of wanneer het object zelf alleen-lezen is. |

### Zie ook

* class [SVGAngle](../)
* naamruimte [Aspose.Svg.DataTypes](../../svgangle/)
* montage [Aspose.SVG](../../../)


