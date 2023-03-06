---
title: Dataset.OpenLayerAt
second_title: Aspose.GIS för .NET API Referens
description: Dataset metod. Öppnar lagret vid angivet index för läsning.
type: docs
weight: 120
url: /sv/net/aspose.gis/dataset/openlayerat/
---
## Dataset.OpenLayerAt method

Öppnar lagret vid angivet index för läsning.

```csharp
public abstract VectorLayer OpenLayerAt(int index, DriverOptions options = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | Int32 | Index för lagret som ska öppnas. |
| options | DriverOptions | Öppna alternativ. |

### Returvärde

Lagret öppnades för läsning.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentException | Options-objektet har en felaktig typ för denna datauppsättning. |
| ArgumentOutOfRangeException | Index är utanför intervallet |
| ArgumentException | Options-objektet har en felaktig typ för denna datauppsättning. |
| [GisException](../../gisexception/) | Det gick inte att läsa funktionen från lagret. |
| IOException | Ett I/O-fel uppstod. |

### Se även

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* namnutrymme [Aspose.Gis](../../dataset/)
* hopsättning [Aspose.GIS](../../../)


