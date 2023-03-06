---
title: PrecisionModel.Rounding
second_title: Aspose.GIS för .NET API Referens
description: PrecisionModel metod. Returnerar en avrundningsprecisionsmodell. Enligt avrundningsprecisionsmodellen är endast ett begränsat antal siffror signifikanta.
type: docs
weight: 20
url: /sv/net/aspose.gis/precisionmodel/rounding/
---
## PrecisionModel.Rounding method

Returnerar en avrundningsprecisionsmodell. Enligt avrundningsprecisionsmodellen är endast ett begränsat antal siffror signifikanta.

```csharp
public static PrecisionModel Rounding(int significantDigits)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| significantDigits | Int32 | Antal signifikanta siffror. |

### Returvärde

Rundande precisionsmodell.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentOutOfRangeException | Antal signifikanta siffror är mindre än 0 eller fler än 15. |

### Anmärkningar

När den tillämpas på en koordinat används följande kod för att minska precisionen:

```csharp
double rounded = Math.Round(value, significantDigits);
```

### Se även

* class [PrecisionModel](../)
* namnutrymme [Aspose.Gis](../../precisionmodel/)
* hopsättning [Aspose.GIS](../../../)


