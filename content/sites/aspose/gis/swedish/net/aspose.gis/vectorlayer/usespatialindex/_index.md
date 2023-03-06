---
title: VectorLayer.UseSpatialIndex
second_title: Aspose.GIS för .NET API Referens
description: VectorLayer metod. Laddar rumsligt index för att påskynda filtrering efter attributvärde i filtermetoder somWhereIntersects ochNearestTo. Om index inte finns skapas det först. Använda sig avforceRebuild för att tvinga fram indexåtergivning.
type: docs
weight: 190
url: /sv/net/aspose.gis/vectorlayer/usespatialindex/
---
## UseSpatialIndex(string, bool) {#usespatialindex_1}

Laddar rumsligt index för att påskynda filtrering efter attributvärde i filtermetoder som[`WhereIntersects`](../../featuressequence/whereintersects/) och[`NearestTo`](../nearestto/). Om index inte finns skapas det först. Använda sig av*forceRebuild* för att tvinga fram indexåtergivning.

```csharp
public void UseSpatialIndex(string indexPath, bool forceRebuild = false)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| indexPath | String | Sökväg till indexfilen. |
| forceRebuild | Boolean | Om index ska återskapas även om det redan finns. |

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Vägen är`null`. |
| IOException | Ett I/O-fel uppstod. |
| InvalidOperationException | Rumsligt index har redan laddats för detta lager. |
| [GisException](../../gisexception/) | Filen finns och det är inte en rumslig indexfil skapad av Aspose.GIS. |

### Se även

* class [VectorLayer](../)
* namnutrymme [Aspose.Gis](../../vectorlayer/)
* hopsättning [Aspose.GIS](../../../)

---

## UseSpatialIndex(AbstractPath, bool) {#usespatialindex}

Laddar rumsligt index för att påskynda filtrering efter attributvärde i filtermetoder som[`WhereIntersects`](../../featuressequence/whereintersects/) och[`NearestTo`](../nearestto/). Om index inte finns skapas det först. Använda sig av*forceRebuild* för att tvinga fram indexåtergivning.

```csharp
public virtual void UseSpatialIndex(AbstractPath indexPath, bool forceRebuild = false)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| indexPath | AbstractPath | Sökväg till indexfilen. |
| forceRebuild | Boolean | Om index ska återskapas även om det redan finns. |

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Vägen är`null`. |
| IOException | Ett I/O-fel uppstod. |
| InvalidOperationException | Rumsligt index har redan laddats för detta lager. |
| [GisException](../../gisexception/) | Filen finns och det är inte en rumslig indexfil skapad av Aspose.GIS. |

### Se även

* class [AbstractPath](../../abstractpath/)
* class [VectorLayer](../)
* namnutrymme [Aspose.Gis](../../vectorlayer/)
* hopsättning [Aspose.GIS](../../../)


