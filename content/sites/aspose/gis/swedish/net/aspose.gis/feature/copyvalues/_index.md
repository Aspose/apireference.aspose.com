---
title: Feature.CopyValues
second_title: Aspose.GIS för .NET API Referens
description: Feature metod. Kopierar värden för attribut från en annan funktion.
type: docs
weight: 20
url: /sv/net/aspose.gis/feature/copyvalues/
---
## Feature.CopyValues method

Kopierar värden för attribut från en annan funktion.

```csharp
public void CopyValues(Feature inputFeature)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| inputFeature | Feature | Funktionen att kopiera värden från. |

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Argumentet är`null`. |
| ArgumentException | Attributet med detta namn finns inte i det här lagret. |
| InvalidOperationException | Attributet är inte låst. |
| InvalidOperationException | Inmatningsvärdet är null och attributet i den här funktionen kan inte vara null. |
| [GisException](../../gisexception/) | Ett attribut har samma namn men olika datatyper i funktionerna. |

### Anmärkningar

Den här metoden kopierar bara attribut med matchande namn.

### Se även

* class [Feature](../)
* namnutrymme [Aspose.Gis](../../feature/)
* hopsättning [Aspose.GIS](../../../)


