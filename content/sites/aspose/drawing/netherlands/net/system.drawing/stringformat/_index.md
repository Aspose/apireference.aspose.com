---
title: Class StringFormat
second_title: Aspose.Drawing voor .NET API-referentie
description: System.Drawing.StringFormat klas. Bevat tekstlayoutinformatie zoals uitlijning oriëntatie en tabstops weergavemanipulaties zoals invoeging van weglatingstekens en vervanging van nationale cijfers en OpenTypefuncties. Deze klasse kan niet worden geërfd.
type: docs
weight: 1130
url: /nl/net/system.drawing/stringformat/
---
## StringFormat class

Bevat tekstlay-outinformatie (zoals uitlijning, oriëntatie en tabstops) weergavemanipulaties (zoals invoeging van weglatingstekens en vervanging van nationale cijfers) en OpenType-functies. Deze klasse kan niet worden geërfd.

```csharp
public sealed class StringFormat : IDisposable
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [StringFormat](stringformat/#constructor)() | Initialiseert een nieuw exemplaar van het`StringFormat` klasse. |
| [StringFormat](stringformat/#constructor_1)(StringFormat) | Initialiseert een nieuw exemplaar van het`StringFormat` class van de opgegeven bestaandeStringFormat object. |
| [StringFormat](stringformat/#constructor_2)(StringFormatFlags) | Initialiseert een nieuw exemplaar van het`StringFormat`klasse met de opgegeven StringFormatFlags opsomming. |
| [StringFormat](stringformat/#constructor_3)(StringFormatFlags, int) | Initialiseert een nieuw exemplaar van het`StringFormat` klasse met de gespecificeerde[`StringFormatFlags`](../stringformatflags/) opsomming en taal. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| static [GenericDefault](../../system.drawing/stringformat/genericdefault/) { get; } | Krijgt een algemene standaardwaardeStringFormat object. |
| static [GenericTypographic](../../system.drawing/stringformat/generictypographic/) { get; } | Krijgt een algemene typografieStringFormat object. |
| [Alignment](../../system.drawing/stringformat/alignment/) { get; set; } | Haalt tekstuitlijningsinformatie op of stelt deze in op het verticale vlak. |
| [DigitSubstitutionLanguage](../../system.drawing/stringformat/digitsubstitutionlanguage/) { get; } | Krijgt de taal die wordt gebruikt wanneer lokale cijfers worden vervangen door westerse cijfers. |
| [DigitSubstitutionMethod](../../system.drawing/stringformat/digitsubstitutionmethod/) { get; } | Haalt de methode op die moet worden gebruikt voor cijfervervanging. |
| [FormatFlags](../../system.drawing/stringformat/formatflags/) { get; set; } | Haalt of zet aStringFormatFlags opsomming die opmaakinformatie bevat. |
| [HotkeyPrefix](../../system.drawing/stringformat/hotkeyprefix/) { get; set; } | Haalt of stelt deHotkeyPrefixbezwaar maken hiervoorStringFormat object. |
| [LineAlignment](../../system.drawing/stringformat/linealignment/) { get; set; } | Haalt of stelt de lijnuitlijning op het horizontale vlak in. |
| [Trimming](../../system.drawing/stringformat/trimming/) { get; set; } | Haalt of stelt deStringTrimming opsomming hiervoorStringFormat object. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Clone](../../system.drawing/stringformat/clone/)() | Maakt hiervan een exacte kopie`StringFormat` voorwerp. |
| [Dispose](../../system.drawing/stringformat/dispose/)() | Geeft alle bronnen vrij die hierdoor worden gebruiktStringFormat object. |
| [GetTabStops](../../system.drawing/stringformat/gettabstops/)(out float) | Haalt hiervoor de tabstops opStringFormat object. |
| [SetDigitSubstitution](../../system.drawing/stringformat/setdigitsubstitution/)(int, StringDigitSubstitute) | Specificeert de taal en methode die moeten worden gebruikt wanneer lokale cijfers worden vervangen door westerse cijfers. |
| [SetMeasurableCharacterRanges](../../system.drawing/stringformat/setmeasurablecharacterranges/)(CharacterRange[]) | Specificeert een array vanCharacterRange structuren die de reeksen karakters vertegenwoordigen die worden gemeten door een aanroep naar deMeasureCharacterRanges methode. |
| [SetTabStops](../../system.drawing/stringformat/settabstops/)(float, float[]) | Stelt hiervoor tabstops inStringFormat object. |

### Zie ook

* naamruimte [System.Drawing](../../system.drawing/)
* montage [Aspose.Drawing](../../)


