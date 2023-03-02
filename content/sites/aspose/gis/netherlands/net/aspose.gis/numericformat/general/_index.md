---
title: NumericFormat.General
second_title: Aspose.GIS voor .NET API-referentie
description: NumericFormat methode. Converteert een getal naar de meer compacte notatie met een vast punt of de wetenschappelijke notatie  afhankelijk van het type getal en of er een precisiespecificatie aanwezig is. Aanbevolen om te gebruiken.
type: docs
weight: 30
url: /nl/net/aspose.gis/numericformat/general/
---
## NumericFormat.General method

Converteert een getal naar de meer compacte notatie met een vast punt of de wetenschappelijke notatie, , afhankelijk van het type getal en of er een precisiespecificatie aanwezig is. Aanbevolen om te gebruiken.

```csharp
public static NumericFormat General(int precision = 0)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| precision | Int32 | De precisie definieert het maximum aantal significante cijfers dat in de resultaattekenreeks kan voorkomen. Als de precisie nul is, wordt de waarde "15" gebruikt. De maximaal beschikbare precisie is "17". |

### Winstwaarde

De algemene formaatspecificatie.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentOutOfRangeException | Aantal significante cijfers is kleiner dan 0 of groter dan 17. |

### Opmerkingen

Interne code genereert nummerstrings voor WKT via: coordinate.ToString("G", CultureInfo.InvariantCulture).

### Zie ook

* class [NumericFormat](../)
* naamruimte [Aspose.Gis](../../numericformat/)
* montage [Aspose.GIS](../../../)


