---
title: RasterLayer.GetSpatialPoint
second_title: Aspose.GIS voor .NET API-referentie
description: RasterLayer methode. Converteert de opgegeven kolom en rij naar de ruimtelijke coördinaat.
type: docs
weight: 150
url: /nl/net/aspose.gis.raster/rasterlayer/getspatialpoint/
---
## RasterLayer.GetSpatialPoint method

Converteert de opgegeven kolom en rij naar de ruimtelijke coördinaat.

```csharp
public IPoint GetSpatialPoint(int cellX, int cellY)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| cellX | Int32 | De waarde voor kolom (x-coördinaat). De nummering begint bij 0. |
| cellY | Int32 | De waarde voor rij (y-coördinaat). De nummering begint bij 0. |

### Winstwaarde

Retourneert de x-coördinaat van de linkerbovenhoek gegeven een kolom en rij.

### Opmerkingen

Als een van de parameters buiten het bereik van de respectievelijke dimensie van het raster wordt doorgegeven, zal coördinaten buiten het raster retourneren, ervan uitgaande dat het raster van het raster van toepassing is buiten de grenzen van het raster.

### Zie ook

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [RasterLayer](../)
* naamruimte [Aspose.Gis.Raster](../../rasterlayer/)
* montage [Aspose.GIS](../../../)


