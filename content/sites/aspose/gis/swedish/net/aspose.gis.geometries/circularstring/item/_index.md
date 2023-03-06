---
title: CircularString.Item
second_title: Aspose.GIS för .NET API Referens
description: CircularString fast egendom. Hämtar eller ställer inIPoint vid angivet index.
type: docs
weight: 90
url: /sv/net/aspose.gis.geometries/circularstring/item/
---
## CircularString indexer

Hämtar eller ställer in[`IPoint`](../../ipoint/) vid angivet index.

```csharp
public IPoint this[int index] { get; set; }
```

| Parameter | Beskrivning |
| --- | --- |
| index | Indexet. |

### Fastighetsvärde

Den[`IPoint`](../../ipoint/) .

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentOutOfRangeException | Index är utanför intervallet. |
| ArgumentNullException | Värdet är`null`. |
| ArgumentException | Punkten är tom. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) av denna geometri och[`SpatialReferenceSystem`](../spatialreferencesystem/) av argument är båda inte`null` och är inte lika med varandra. |

### Se även

* interface [IPoint](../../ipoint/)
* class [CircularString](../)
* namnutrymme [Aspose.Gis.Geometries](../../circularstring/)
* hopsättning [Aspose.GIS](../../../)


