---
title: Class SVGLength
second_title: Aspose.SVG voor .NET API-referentie
description: Aspose.Svg.DataTypes.SVGLength klas. De SVGLengthinterface komt overeen met het lengte basisgegevenstype. Een SVGLengthobject kan worden aangeduid als alleenlezen wat betekent dat pogingen om het object te wijzigen zullen resulteren in een uitzondering zoals hieronder wordt beschreven.
type: docs
weight: 220
url: /nl/net/aspose.svg.datatypes/svglength/
---
## SVGLength class

De SVGLength-interface komt overeen met het lengte basisgegevenstype. Een SVGLength-object kan worden aangeduid als alleen-lezen, wat betekent dat pogingen om het object te wijzigen zullen resulteren in een uitzondering, zoals hieronder wordt beschreven.

```csharp
public class SVGLength : SVGValueType
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [UnitType](../../aspose.svg.datatypes/svglength/unittype/) { get; } | Het type waarde zoals gespecificeerd door een van de SVG_LENGTHTYPE_*-constanten die op deze interface zijn gedefinieerd. |
| [Value](../../aspose.svg.datatypes/svglength/value/) { get; set; } | De waarde als drijvende-kommawaarde, in gebruikerseenheden. Als u dit kenmerk instelt, worden valueInSpecifiedUnits en valueAsString automatisch bijgewerkt om deze instelling weer te geven. |
| [ValueAsString](../../aspose.svg.datatypes/svglength/valueasstring/) { get; set; } | De waarde als tekenreekswaarde, in de eenheden uitgedrukt door unitType. Als u dit kenmerk instelt, worden value, valueInSpecifiedUnits en unitType automatisch bijgewerkt om deze instelling weer te geven. |
| [ValueInSpecifiedUnits](../../aspose.svg.datatypes/svglength/valueinspecifiedunits/) { get; set; } | De waarde als drijvende-kommawaarde, in de eenheden uitgedrukt door unitType. Als u dit kenmerk instelt, worden value en valueAsString automatisch bijgewerkt om deze instelling weer te geven. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [ConvertToSpecifiedUnits](../../aspose.svg.datatypes/svglength/converttospecifiedunits/)(ushort) | Behoud dezelfde onderliggende opgeslagen waarde, maar reset de opgeslagen eenheid-ID naar het gegeven unitType. Objectkenmerken unitType, valueInSpecifiedUnits en valueAsString kunnen als gevolg van deze methode worden gewijzigd. Als de oorspronkelijke waarde bijvoorbeeld "0,5 cm" was en de methode werd aangeroepen om te converteren naar millimeters, dan zou unitType worden gewijzigd in SVG_LENGTHTYPE_MM, valueInSpecifiedUnits zou worden gewijzigd in de numerieke waarde 5 en valueAsString zou worden gewijzigd in "5 mm". |
| [Dispose](../../aspose.svg.datatypes/svgvaluetype/dispose/)() | Geeft onbeheerde en - optioneel - beheerde bronnen vrij. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Deze methode wordt gebruikt om het ECMAScript-object op te halenType . |
| [NewValueSpecifiedUnits](../../aspose.svg.datatypes/svglength/newvaluespecifiedunits/)(ushort, float) | Reset de waarde als een getal met een geassocieerd unitType, waarbij de waarden voor alle kenmerken van het object worden vervangen. |
| override [ToString](../../aspose.svg.datatypes/svglength/tostring/)() | Geeft als resultaat eenString die deze instantie vertegenwoordigt. |

## Velden

| Naam | Beschrijving |
| --- | --- |
| const [SVG_LENGTHTYPE_CM](../../aspose.svg.datatypes/svglength/svg_lengthtype_cm/) | Er is een waarde opgegeven met behulp van de cm-eenheden die zijn gedefinieerd in CSS2. |
| const [SVG_LENGTHTYPE_EMS](../../aspose.svg.datatypes/svglength/svg_lengthtype_ems/) | Er is een waarde opgegeven met behulp van de em-eenheden die zijn gedefinieerd in CSS2. |
| const [SVG_LENGTHTYPE_EXS](../../aspose.svg.datatypes/svglength/svg_lengthtype_exs/) | Er is een waarde opgegeven met behulp van de ex-eenheden die zijn gedefinieerd in CSS2. |
| const [SVG_LENGTHTYPE_IN](../../aspose.svg.datatypes/svglength/svg_lengthtype_in/) | Er is een waarde opgegeven met behulp van de eenheden in CSS2. |
| const [SVG_LENGTHTYPE_MM](../../aspose.svg.datatypes/svglength/svg_lengthtype_mm/) | Er is een waarde opgegeven met de mm-eenheden die zijn gedefinieerd in CSS2. |
| const [SVG_LENGTHTYPE_NUMBER](../../aspose.svg.datatypes/svglength/svg_lengthtype_number/) | Er is geen eenheidstype opgegeven (d.w.z. er is een eenheidsloze waarde opgegeven), wat een waarde aangeeft in gebruikerseenheden. |
| const [SVG_LENGTHTYPE_PC](../../aspose.svg.datatypes/svglength/svg_lengthtype_pc/) | Er is een waarde opgegeven met behulp van de pc-eenheden die zijn gedefinieerd in CSS2. |
| const [SVG_LENGTHTYPE_PERCENTAGE](../../aspose.svg.datatypes/svglength/svg_lengthtype_percentage/) | Er is een procentuele waarde opgegeven. |
| const [SVG_LENGTHTYPE_PT](../../aspose.svg.datatypes/svglength/svg_lengthtype_pt/) | Er is een waarde opgegeven met behulp van de pt-eenheden die zijn gedefinieerd in CSS2. |
| const [SVG_LENGTHTYPE_PX](../../aspose.svg.datatypes/svglength/svg_lengthtype_px/) | Er is een waarde opgegeven met behulp van de px-eenheden die zijn gedefinieerd in CSS2. |
| const [SVG_LENGTHTYPE_UNKNOWN](../../aspose.svg.datatypes/svglength/svg_lengthtype_unknown/) | Het eenheidstype is niet een van de vooraf gedefinieerde eenheidstypen. Het is ongeldig om te proberen een nieuwe waarde van dit type te definiëren of om een bestaande waarde naar dit type om te schakelen. |

### Zie ook

* class [SVGValueType](../svgvaluetype/)
* naamruimte [Aspose.Svg.DataTypes](../../aspose.svg.datatypes/)
* montage [Aspose.SVG](../../)


