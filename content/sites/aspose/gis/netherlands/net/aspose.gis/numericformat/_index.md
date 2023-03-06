---
title: Class NumericFormat
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.NumericFormat klas. NumericFormat worden gebruikt om algemene numerieke typen in tekst op te maken.
type: docs
weight: 1290
url: /nl/net/aspose.gis/numericformat/
---
## NumericFormat class

`NumericFormat` worden gebruikt om algemene numerieke typen in tekst op te maken.

```csharp
public abstract class NumericFormat
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| static [RoundTrip](../../aspose.gis/numericformat/roundtrip/) { get; } | Converteert en probeert ervoor te zorgen dat een numerieke waarde die wordt geconverteerd naar een tekenreeks, wordt teruggeparseerd naar dezelfde numerieke waarde. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| static [Flat](../../aspose.gis/numericformat/flat/)(int) | Converteert een getal naar een vaste-kommatekst zonder wetenschappelijke notatie. |
| static [General](../../aspose.gis/numericformat/general/)(int) | Converteert een getal naar de meer compacte notatie met een vast punt of de wetenschappelijke notatie, , afhankelijk van het type getal en of er een precisiespecificatie aanwezig is. Aanbevolen om te gebruiken. |

### Opmerkingen

Er zijn drie soorten`NumericFormat` :  Algemeen - vast punt of wetenschappelijke notatie. Een aantal cijfers is significant. RoundTrip - vast punt of wetenschappelijke notatie. Het maximum aantal cijfers is significant. Flat - notatie met een vast punt. Een aantal cijfers is significant. EEN`NumericFormat` kan worden ingesteld[`IGeometry`](../../aspose.gis.geometries/igeometry/) via[`AsText`](../../aspose.gis.geometries/igeometry/astext/) om het numerieke formaat te specificeren bij het vertalen van geometrie naar zijn Well-Known Text (WKT) representatie.

### Zie ook

* naamruimte [Aspose.Gis](../../aspose.gis/)
* montage [Aspose.GIS](../../)


