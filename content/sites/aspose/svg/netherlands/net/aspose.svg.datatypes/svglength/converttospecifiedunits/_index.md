---
title: SVGLength.ConvertToSpecifiedUnits
second_title: Aspose.SVG voor .NET API-referentie
description: SVGLength methode. Behoud dezelfde onderliggende opgeslagen waarde maar reset de opgeslagen eenheidID naar het gegeven unitType. Objectkenmerken unitType valueInSpecifiedUnits en valueAsString kunnen als gevolg van deze methode worden gewijzigd. Als de oorspronkelijke waarde bijvoorbeeld 05 cm was en de methode werd aangeroepen om te converteren naar millimeters dan zou unitType worden gewijzigd in SVG_LENGTHTYPE_MM valueInSpecifiedUnits zou worden gewijzigd in de numerieke waarde 5 en valueAsString zou worden gewijzigd in 5 mm.
type: docs
weight: 50
url: /nl/net/aspose.svg.datatypes/svglength/converttospecifiedunits/
---
## SVGLength.ConvertToSpecifiedUnits method

Behoud dezelfde onderliggende opgeslagen waarde, maar reset de opgeslagen eenheid-ID naar het gegeven unitType. Objectkenmerken unitType, valueInSpecifiedUnits en valueAsString kunnen als gevolg van deze methode worden gewijzigd. Als de oorspronkelijke waarde bijvoorbeeld "0,5 cm" was en de methode werd aangeroepen om te converteren naar millimeters, dan zou unitType worden gewijzigd in SVG_LENGTHTYPE_MM, valueInSpecifiedUnits zou worden gewijzigd in de numerieke waarde 5 en valueAsString zou worden gewijzigd in "5 mm".

```csharp
public void ConvertToSpecifiedUnits(ushort unitType)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| unitType | UInt16 | Het eenheidstype waarnaar moet worden overgeschakeld (bijv. SVG_LENGTHTYPE_MM). |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | -code[`NOT_SUPPORTED_ERR`](../../../aspose.svg.dom/domexception/not_supported_err/) Wordt verhoogd als unitType SVG_LENGTHTYPE_UNKNOWN is of geen geldige eenheidstypeconstante is (een van de andere SVG_LENGTHTYPE_*-constanten die op deze interface zijn gedefinieerd). |
| [DOMException](../../../aspose.svg.dom/domexception/) | -code[`NO_MODIFICATION_ALLOWED_ERR`](../../../aspose.svg.dom/domexception/no_modification_allowed_err/) Verhoogd wanneer de lengte overeenkomt met een alleen-lezen kenmerk of wanneer het object zelf alleen-lezen is. |

### Zie ook

* class [SVGLength](../)
* naamruimte [Aspose.Svg.DataTypes](../../svglength/)
* montage [Aspose.SVG](../../../)


