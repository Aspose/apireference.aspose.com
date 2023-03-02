---
title: NumericFormat.Flat
second_title: Aspose.GIS för .NET API Referens
description: NumericFormat metod. Konverterar ett tal till en fast punkttext utan en vetenskaplig notation.
type: docs
weight: 20
url: /sv/net/aspose.gis/numericformat/flat/
---
## NumericFormat.Flat method

Konverterar ett tal till en fast punkttext utan en vetenskaplig notation.

```csharp
public static NumericFormat Flat(int significantDigits)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| significantDigits | Int32 | Antal signifikanta siffror. Den maximala tillgängliga precisionen är "308" |

### Returvärde

Avrundningsprecisionsspecifikationen.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentOutOfRangeException | Antal signifikanta siffror är mindre än 0 eller fler än 308. |

### Anmärkningar

Internt genererar kod nummersträngar för WKT via: coordinate.ToString("0.##..", CultureInfo.InvariantCulture) decision.

### Se även

* class [NumericFormat](../)
* namnutrymme [Aspose.Gis](../../numericformat/)
* hopsättning [Aspose.GIS](../../../)


