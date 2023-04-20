---
title: Interface ITrueTypeFont
second_title: Aspose.SVG voor .NET API-referentie
description: Aspose.Svg.Drawing.ITrueTypeFont koppel. Verklaart methoden voor het werken met TrueTypelettertype.
type: docs
weight: 1510
url: /nl/net/aspose.svg.drawing/itruetypefont/
---
## ITrueTypeFont interface

Verklaart methoden voor het werken met TrueType-lettertype.

```csharp
public interface ITrueTypeFont
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [DataSize](../../aspose.svg.drawing/itruetypefont/datasize/) { get; } | Retourneert de grootte van de lettertypegegevens in bytes |
| [FamilyName](../../aspose.svg.drawing/itruetypefont/familyname/) { get; } | Haal de naam van de lettertypefamilie op. |
| [FullFontName](../../aspose.svg.drawing/itruetypefont/fullfontname/) { get; } | Dit moet een combinatie zijn van "FamilyName" en "SubFamilyName". Uitzondering: als het lettertype "Regular" is zoals aangegeven in "SubFamilyName", gebruik dan alleen de familienaam die in "FamilyName" staat. Een uitzondering op de bovenstaande definitie van volledige lettertypenaam is voor Microsoft-platformstrings voor CFF OpenType-lettertypen: in dit geval moet de volledige fontnaamstring identiek zijn aan de PostScript FontName in de CFF Name INDEX. |
| [SubFamilyName](../../aspose.svg.drawing/itruetypefont/subfamilyname/) { get; } | De Font Subfamily-naam onderscheidt het font in een groep met dezelfde Font Family-naam. Aangenomen wordt dat dit betrekking heeft op stijl (cursief, schuin) en gewicht (licht, vet, zwart, enz.). Een lettertype zonder bijzondere verschillen in gewicht of stijl (bijv. gemiddeld gewicht, niet cursief en fsSelection bit 6 ingesteld) moet de tekenreeks "Normaal" op deze positie hebben opgeslagen. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [GetAscent](../../aspose.svg.drawing/itruetypefont/getascent/)(float) | Geeft als resultaat de stijging, in punten. |
| [GetData](../../aspose.svg.drawing/itruetypefont/getdata/)() | Open de stream met lettertypegegevens. De beller is verantwoordelijk voor het verwijderen van de stream. |
| [GetDescent](../../aspose.svg.drawing/itruetypefont/getdescent/)(float) | Geeft als resultaat de daling, in punten. |

### Zie ook

* naamruimte [Aspose.Svg.Drawing](../../aspose.svg.drawing/)
* montage [Aspose.SVG](../../)


