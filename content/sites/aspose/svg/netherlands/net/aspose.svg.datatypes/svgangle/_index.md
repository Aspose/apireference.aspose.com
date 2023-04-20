---
title: Class SVGAngle
second_title: Aspose.SVG voor .NET API-referentie
description: Aspose.Svg.DataTypes.SVGAngle klas. De SVGAngleinterface komt overeen met het basisgegevenstype hoek.
type: docs
weight: 80
url: /nl/net/aspose.svg.datatypes/svgangle/
---
## SVGAngle class

De SVGAngle-interface komt overeen met het basisgegevenstype hoek.

```csharp
public class SVGAngle : SVGValueType
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [UnitType](../../aspose.svg.datatypes/svgangle/unittype/) { get; } | Het type waarde zoals gespecificeerd door een van de SVG_ANGLETYPE_*-constanten die op deze interface zijn gedefinieerd. |
| [Value](../../aspose.svg.datatypes/svgangle/value/) { get; set; } | De hoekwaarde als drijvende-kommawaarde, in graden. Als u dit kenmerk instelt, worden valueInSpecifiedUnits en valueAsString automatisch bijgewerkt om deze instelling weer te geven. |
| [ValueAsString](../../aspose.svg.datatypes/svgangle/valueasstring/) { get; set; } | De hoekwaarde als tekenreekswaarde, in de eenheden uitgedrukt door unitType. Als u dit kenmerk instelt, worden value, valueInSpecifiedUnits en unitType automatisch bijgewerkt om deze instelling weer te geven. |
| [ValueInSpecifiedUnits](../../aspose.svg.datatypes/svgangle/valueinspecifiedunits/) { get; set; } | De hoekwaarde als drijvende-kommawaarde, in de eenheden uitgedrukt door unitType. Als u dit kenmerk instelt, worden value en valueAsString automatisch bijgewerkt om deze instelling weer te geven. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [ConvertToSpecifiedUnits](../../aspose.svg.datatypes/svgangle/converttospecifiedunits/)(ushort) | Behoud dezelfde onderliggende opgeslagen waarde, maar reset de opgeslagen eenheid-ID naar het gegeven unitType. Objectkenmerken unitType, valueInSpecifiedUnits en valueAsString kunnen als resultaat van deze methode worden gewijzigd. |
| [Dispose](../../aspose.svg.datatypes/svgvaluetype/dispose/)() | Geeft onbeheerde en - optioneel - beheerde bronnen vrij. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Deze methode wordt gebruikt om het ECMAScript-object op te halenType . |
| [NewValueSpecifiedUnits](../../aspose.svg.datatypes/svgangle/newvaluespecifiedunits/)(ushort, float) | Reset de waarde als een getal met een geassocieerd unitType, waarbij de waarden voor alle kenmerken van het object worden vervangen. |
| override [ToString](../../aspose.svg.datatypes/svgangle/tostring/)() | Geeft als resultaat eenString die deze instantie vertegenwoordigt. |

## Velden

| Naam | Beschrijving |
| --- | --- |
| const [SVG_ANGLETYPE_DEG](../../aspose.svg.datatypes/svgangle/svg_angletype_deg/) | Het eenheidstype is expliciet ingesteld op graden. |
| const [SVG_ANGLETYPE_GRAD](../../aspose.svg.datatypes/svgangle/svg_angletype_grad/) | Het eenheidstype is radialen. |
| const [SVG_ANGLETYPE_RAD](../../aspose.svg.datatypes/svgangle/svg_angletype_rad/) | Het eenheidstype is radialen. |
| const [SVG_ANGLETYPE_UNKNOWN](../../aspose.svg.datatypes/svgangle/svg_angletype_unknown/) | Het eenheidstype is niet een van de vooraf gedefinieerde eenheidstypen. Het is ongeldig om te proberen een nieuwe waarde van dit type te definiëren of om een bestaande waarde naar dit type om te schakelen. |
| const [SVG_ANGLETYPE_UNSPECIFIED](../../aspose.svg.datatypes/svgangle/svg_angletype_unspecified/) | Er is geen eenheidstype opgegeven (dwz er is een eenheidsloze waarde opgegeven). Voor hoeken wordt een waarde zonder eenheid op dezelfde manier behandeld alsof er graden zijn opgegeven. |

### Zie ook

* class [SVGValueType](../svgvaluetype/)
* naamruimte [Aspose.Svg.DataTypes](../../aspose.svg.datatypes/)
* montage [Aspose.SVG](../../)


