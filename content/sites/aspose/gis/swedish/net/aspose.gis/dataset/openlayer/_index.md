---
title: Dataset.OpenLayer
second_title: Aspose.GIS för .NET API Referens
description: Dataset metod. Öppnar lagret med angivet namn för läsning.
type: docs
weight: 110
url: /sv/net/aspose.gis/dataset/openlayer/
---
## Dataset.OpenLayer method

Öppnar lagret med angivet namn för läsning.

```csharp
public abstract VectorLayer OpenLayer(string name, DriverOptions options = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| name | String | Namn på lagret som ska öppnas. |
| options | DriverOptions | Öppna alternativ. |

### Returvärde

Lagret öppnades för läsning.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentException | Lager med angivet namn finns inte; Options-objektet har en felaktig typ för denna datauppsättning. |
| ArgumentException | Options-objektet har en felaktig typ för denna datauppsättning. |
| ArgumentNullException | Namnet är`null`. |
| [GisException](../../gisexception/) | Det gick inte att läsa funktionen från lagret. |
| IOException | Ett I/O-fel uppstod. |

### Se även

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* namnutrymme [Aspose.Gis](../../dataset/)
* hopsättning [Aspose.GIS](../../../)


