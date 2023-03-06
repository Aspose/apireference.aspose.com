---
title: RasterLayer.GetSpatialPoint
second_title: Aspose.GIS für .NET-API-Referenz
description: RasterLayer methode. Konvertiert die angegebene Spalte und Zeile in die räumliche Koordinate.
type: docs
weight: 150
url: /de/net/aspose.gis.raster/rasterlayer/getspatialpoint/
---
## RasterLayer.GetSpatialPoint method

Konvertiert die angegebene Spalte und Zeile in die räumliche Koordinate.

```csharp
public IPoint GetSpatialPoint(int cellX, int cellY)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| cellX | Int32 | Der Wert für die Spalte (x-Koordinate). Die Nummerierung beginnt bei 0. |
| cellY | Int32 | Der Wert für Zeile (y-Koordinate). Die Nummerierung beginnt bei 0. |

### Rückgabewert

Gibt die x-Koordinate der oberen linken Ecke einer gegebenen Spalte und Zeile zurück.

### Bemerkungen

Wenn einer der Parameter außerhalb des Bereichs der jeweiligen Dimension des Rasters übergeben wird, werden Koordinaten außerhalb des Rasters zurückgegeben, vorausgesetzt, das Raster des Rasters gilt außerhalb der Grenzen des Rasters.

### Siehe auch

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [RasterLayer](../)
* namensraum [Aspose.Gis.Raster](../../rasterlayer/)
* Montage [Aspose.GIS](../../../)


