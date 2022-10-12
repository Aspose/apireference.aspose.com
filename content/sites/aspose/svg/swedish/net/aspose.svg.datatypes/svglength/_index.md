---
title: SVGLength
second_title: Aspose.SVG för .NET API Referens
description: SVGLengthgränssnittet motsvarar längden grundläggande datatyp. Ett SVGLengthobjekt kan betecknas som skrivskyddat vilket innebär att försök att modifiera objektet kommer att resultera i ett undantag som beskrivs nedan.
type: docs
weight: 220
url: /sv/net/aspose.svg.datatypes/svglength/
---
## SVGLength class

SVGLength-gränssnittet motsvarar längden grundläggande datatyp. Ett SVGLength-objekt kan betecknas som skrivskyddat, vilket innebär att försök att modifiera objektet kommer att resultera i ett undantag, som beskrivs nedan.

```csharp
public class SVGLength : SVGValueType
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [UnitType](../../aspose.svg.datatypes/svglength/unittype) { get; } | Typen av värdet som specificeras av en av SVG_LENGTHTYPE_*-konstanterna som definieras i detta gränssnitt. |
| [Value](../../aspose.svg.datatypes/svglength/value) { get; set; } | Värdet som flyttalsvärde, i användarenheter. Om du ställer in det här attributet kommer valueInSpecifiedUnits och valueAsString att uppdateras automatiskt för att återspegla denna inställning. |
| [ValueAsString](../../aspose.svg.datatypes/svglength/valueasstring) { get; set; } | Värdet som ett strängvärde, i enheterna uttryckta av unitType. Om du ställer in detta attribut kommer värde, valueInSpecifiedUnits och unitType att uppdateras automatiskt för att återspegla denna inställning. |
| [ValueInSpecifiedUnits](../../aspose.svg.datatypes/svglength/valueinspecifiedunits) { get; set; } | Värdet som ett flyttalsvärde, i enheterna uttryckta av unitType. Om du ställer in detta attribut kommer värde och valueAsString att uppdateras automatiskt för att återspegla denna inställning. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [ConvertToSpecifiedUnits](../../aspose.svg.datatypes/svglength/converttospecifiedunits)(ushort) | Bevara samma underliggande lagrade värde, men återställ den lagrade enhetsidentifieraren till den givna unitType. Objektattributen unitType, valueInSpecifiedUnits och valueAsString kan ändras som ett resultat av den här metoden. Till exempel, om det ursprungliga värdet var "0,5 cm" och metoden anropades för att konvertera till millimeter, skulle unitType ändras till SVG_LENGTHTYPE_MM, valueInSpecifiedUnits skulle ändras till det numeriska värdet 5 och valueAsString skulle ändras till "5mm". |
| [Dispose](../../aspose.svg.datatypes/svgvaluetype/dispose)() | Frigör ohanterade och - valfritt - hanterade resurser. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Denna metod används för att hämta ECMAScript-objektType . |
| [NewValueSpecifiedUnits](../../aspose.svg.datatypes/svglength/newvaluespecifiedunits)(ushort, float) | Återställ värdet som ett tal med en associerad unitType, och ersätt därmed värdena för alla attribut på objektet. |
| override [ToString](../../aspose.svg.datatypes/svglength/tostring)() | Returnerar enString som representerar denna instans. |

## Fält

| namn | Beskrivning |
| --- | --- |
| const [SVG_LENGTHTYPE_CM](../../aspose.svg.datatypes/svglength/svg_lengthtype_cm) | Ett värde specificerades med cm-enheterna definierade i CSS2. |
| const [SVG_LENGTHTYPE_EMS](../../aspose.svg.datatypes/svglength/svg_lengthtype_ems) | Ett värde specificerades med hjälp av em-enheterna definierade i CSS2. |
| const [SVG_LENGTHTYPE_EXS](../../aspose.svg.datatypes/svglength/svg_lengthtype_exs) | Ett värde specificerades med ex-enheterna definierade i CSS2. |
| const [SVG_LENGTHTYPE_IN](../../aspose.svg.datatypes/svglength/svg_lengthtype_in) | Ett värde specificerades med hjälp av in-enheter som definierats i CSS2. |
| const [SVG_LENGTHTYPE_MM](../../aspose.svg.datatypes/svglength/svg_lengthtype_mm) | Ett värde specificerades med hjälp av mm-enheterna definierade i CSS2. |
| const [SVG_LENGTHTYPE_NUMBER](../../aspose.svg.datatypes/svglength/svg_lengthtype_number) | Ingen enhetstyp angavs (dvs. ett värde utan enhet angavs), vilket indikerar ett värde i användarenheter. |
| const [SVG_LENGTHTYPE_PC](../../aspose.svg.datatypes/svglength/svg_lengthtype_pc) | Ett värde specificerades med hjälp av pc-enheterna definierade i CSS2. |
| const [SVG_LENGTHTYPE_PERCENTAGE](../../aspose.svg.datatypes/svglength/svg_lengthtype_percentage) | Ett procentuellt värde har angetts. |
| const [SVG_LENGTHTYPE_PT](../../aspose.svg.datatypes/svglength/svg_lengthtype_pt) | Ett värde specificerades med pt-enheterna definierade i CSS2. |
| const [SVG_LENGTHTYPE_PX](../../aspose.svg.datatypes/svglength/svg_lengthtype_px) | Ett värde specificerades med px-enheterna definierade i CSS2. |
| const [SVG_LENGTHTYPE_UNKNOWN](../../aspose.svg.datatypes/svglength/svg_lengthtype_unknown) | Enhetstypen är inte en av fördefinierade enhetstyper. Det är ogiltigt att försöka definiera ett nytt värde av denna typ eller att försöka ändra ett befintligt värde till denna typ. |

### Se även

* class [SVGValueType](../svgvaluetype)
* namnutrymme [Aspose.Svg.DataTypes](../../aspose.svg.datatypes)
* hopsättning [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
