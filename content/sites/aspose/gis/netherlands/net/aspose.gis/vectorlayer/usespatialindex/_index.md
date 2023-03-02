---
title: VectorLayer.UseSpatialIndex
second_title: Aspose.GIS voor .NET API-referentie
description: VectorLayer methode. Laadt ruimtelijke index om het filteren op attribuutwaarde te versnellen in filtermethodes zoalsWhereIntersects enNearestTo. Als de index niet bestaat wordt deze eerst gemaakt. GebruikforceRebuild indexrecreatie afdwingen.
type: docs
weight: 190
url: /nl/net/aspose.gis/vectorlayer/usespatialindex/
---
## UseSpatialIndex(string, bool) {#usespatialindex_1}

Laadt ruimtelijke index om het filteren op attribuutwaarde te versnellen in filtermethodes zoals[`WhereIntersects`](../../featuressequence/whereintersects/) en[`NearestTo`](../nearestto/). Als de index niet bestaat, wordt deze eerst gemaakt. Gebruik*forceRebuild* indexrecreatie afdwingen.

```csharp
public void UseSpatialIndex(string indexPath, bool forceRebuild = false)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| indexPath | String | Pad naar het indexbestand. |
| forceRebuild | Boolean | Of de index opnieuw moet worden gemaakt, zelfs als deze al bestaat. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Pad is`null`. |
| IOException | Er is een I/O-fout opgetreden. |
| InvalidOperationException | Ruimtelijke index is al geladen voor deze laag. |
| [GisException](../../gisexception/) | Het bestand bestaat en het is geen ruimtelijk indexbestand gemaakt door Aspose.GIS. |

### Zie ook

* class [VectorLayer](../)
* naamruimte [Aspose.Gis](../../vectorlayer/)
* montage [Aspose.GIS](../../../)

---

## UseSpatialIndex(AbstractPath, bool) {#usespatialindex}

Laadt ruimtelijke index om het filteren op attribuutwaarde te versnellen in filtermethodes zoals[`WhereIntersects`](../../featuressequence/whereintersects/) en[`NearestTo`](../nearestto/). Als de index niet bestaat, wordt deze eerst gemaakt. Gebruik*forceRebuild* indexrecreatie afdwingen.

```csharp
public virtual void UseSpatialIndex(AbstractPath indexPath, bool forceRebuild = false)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| indexPath | AbstractPath | Pad naar het indexbestand. |
| forceRebuild | Boolean | Of de index opnieuw moet worden gemaakt, zelfs als deze al bestaat. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Pad is`null`. |
| IOException | Er is een I/O-fout opgetreden. |
| InvalidOperationException | Ruimtelijke index is al geladen voor deze laag. |
| [GisException](../../gisexception/) | Het bestand bestaat en het is geen ruimtelijk indexbestand gemaakt door Aspose.GIS. |

### Zie ook

* class [AbstractPath](../../abstractpath/)
* class [VectorLayer](../)
* naamruimte [Aspose.Gis](../../vectorlayer/)
* montage [Aspose.GIS](../../../)


