---
title: Feature.GetValuesList
second_title: Aspose.GIS för .NET API Referens
description: Feature metod. Hämtar värdena för en attributsekvens som en lista.
type: docs
weight: 70
url: /sv/net/aspose.gis/feature/getvalueslist/
---
## Feature.GetValuesList&lt;T&gt; method

Hämtar värdena för en attributsekvens som en lista.

```csharp
public List<T> GetValuesList<T>(string attributeName, string separator)
```

| Parameter | Beskrivning |
| --- | --- |
| T | Önskad typ för värdena. |
| attributeName | Namn på attributet. |
| separator | En sträng som används för att separera attributnamn och indexvärde för sekvensen. |

### Returvärde

Lista över värden för attributen som namnger olika efter sekvensindexvärde.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Attributnamnet är`null`. |
| ArgumentException | Attributet med detta namn finns inte i det här lagret. |
| InvalidOperationException | Attributet är inte låst. |
| InvalidOperationException | Värdet på det här attributet är inte inställt för den här funktionen. |
| InvalidCastException | Den begärda typen implementeras inteIConvertible. |
| InvalidCastException | Värdet på attributet är`null`, men den begärda typen är en värdetyp. |
| FormatException | Konverteringen misslyckades eftersom värdet är i felaktigt format. |
| OverflowException | Konverteringen misslyckades på grund av spill. |

### Anmärkningar

Detta använder[`GetValue`](../getvalue/) för att få ett enda värde. Så den här metoden konverterar värdet automatiskt till den typ som efterfrågas i den generiska typparametern.  Om attribut med index 0 inte hittas kommer det att genererasArgumentException .

### Se även

* class [Feature](../)
* namnutrymme [Aspose.Gis](../../feature/)
* hopsättning [Aspose.GIS](../../../)


