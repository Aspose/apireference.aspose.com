---
title: Class SVGAngle
second_title: Aspose.SVG för .NET API Referens
description: Aspose.Svg.DataTypes.SVGAngle klass. SVGAnglegränssnittet motsvarar vinkelns grundläggande datatyp.
type: docs
weight: 80
url: /sv/net/aspose.svg.datatypes/svgangle/
---
## SVGAngle class

SVGAngle-gränssnittet motsvarar vinkelns grundläggande datatyp.

```csharp
public class SVGAngle : SVGValueType
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [UnitType](../../aspose.svg.datatypes/svgangle/unittype/) { get; } | Typen av värdet som specificeras av en av SVG_ANGLETYPE_*-konstanterna som definieras i detta gränssnitt. |
| [Value](../../aspose.svg.datatypes/svgangle/value/) { get; set; } | Vinkelvärdet som ett flyttalsvärde, i grader. Om du ställer in det här attributet kommer valueInSpecifiedUnits och valueAsString att uppdateras automatiskt för att återspegla denna inställning. |
| [ValueAsString](../../aspose.svg.datatypes/svgangle/valueasstring/) { get; set; } | Vinkelvärdet som ett strängvärde, i enheterna uttryckta av unitType. Om du ställer in detta attribut kommer värde, valueInSpecifiedUnits och unitType att uppdateras automatiskt för att återspegla denna inställning. |
| [ValueInSpecifiedUnits](../../aspose.svg.datatypes/svgangle/valueinspecifiedunits/) { get; set; } | Vinkelvärdet som ett flyttalsvärde, i enheterna uttryckta av unitType. Om du ställer in detta attribut kommer värde och valueAsString att uppdateras automatiskt för att återspegla denna inställning. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [ConvertToSpecifiedUnits](../../aspose.svg.datatypes/svgangle/converttospecifiedunits/)(ushort) | Bevara samma underliggande lagrade värde, men återställ den lagrade enhetsidentifieraren till den givna unitType. Objektattribut unitType, valueInSpecifiedUnits och valueAsString kan ändras som ett resultat av denna metod. |
| [Dispose](../../aspose.svg.datatypes/svgvaluetype/dispose/)() | Frigör ohanterade och - valfritt - hanterade resurser. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Denna metod används för att hämta ECMAScript-objektType . |
| [NewValueSpecifiedUnits](../../aspose.svg.datatypes/svgangle/newvaluespecifiedunits/)(ushort, float) | Återställ värdet som ett tal med en associerad unitType, och ersätt därmed värdena för alla attribut på objektet. |
| override [ToString](../../aspose.svg.datatypes/svgangle/tostring/)() | Returnerar enString som representerar denna instans. |

## Fält

| namn | Beskrivning |
| --- | --- |
| const [SVG_ANGLETYPE_DEG](../../aspose.svg.datatypes/svgangle/svg_angletype_deg/) | Enhetstypen var uttryckligen inställd på grader. |
| const [SVG_ANGLETYPE_GRAD](../../aspose.svg.datatypes/svgangle/svg_angletype_grad/) | Enhetstypen är radianer. |
| const [SVG_ANGLETYPE_RAD](../../aspose.svg.datatypes/svgangle/svg_angletype_rad/) | Enhetstypen är radianer. |
| const [SVG_ANGLETYPE_UNKNOWN](../../aspose.svg.datatypes/svgangle/svg_angletype_unknown/) | Enhetstypen är inte en av fördefinierade enhetstyper. Det är ogiltigt att försöka definiera ett nytt värde av denna typ eller att försöka ändra ett befintligt värde till denna typ. |
| const [SVG_ANGLETYPE_UNSPECIFIED](../../aspose.svg.datatypes/svgangle/svg_angletype_unspecified/) | Ingen enhetstyp angavs (dvs ett värde utan enhet angavs). För vinklar behandlas ett enhetslöst värde på samma sätt som om grader angavs. |

### Se även

* class [SVGValueType](../svgvaluetype/)
* namnutrymme [Aspose.Svg.DataTypes](../../aspose.svg.datatypes/)
* hopsättning [Aspose.SVG](../../)


