---
title: RasterLayer.GetSpatialPoint
second_title: Aspose.GIS för .NET API Referens
description: RasterLayer metod. Konverterar den angivna kolumnen och raden till den rumsliga koordinaten.
type: docs
weight: 150
url: /sv/net/aspose.gis.raster/rasterlayer/getspatialpoint/
---
## RasterLayer.GetSpatialPoint method

Konverterar den angivna kolumnen och raden till den rumsliga koordinaten.

```csharp
public IPoint GetSpatialPoint(int cellX, int cellY)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| cellX | Int32 | Värdet för kolumn (x-koordinat). Numreringen börjar på 0. |
| cellY | Int32 | Värdet för rad (y-koordinat). Numreringen börjar på 0. |

### Returvärde

Returnerar x-koordinaten för det övre vänstra hörnet givet en kolumn och rad.

### Anmärkningar

Om någon av parametrarna skickas utanför intervallet för respektive dimension av rastret, kommer den att returnera koordinater utanför rastret förutsatt att rastrets rutnät är tillämpligt utanför rastrets gränser.

### Se även

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [RasterLayer](../)
* namnutrymme [Aspose.Gis.Raster](../../rasterlayer/)
* hopsättning [Aspose.GIS](../../../)


