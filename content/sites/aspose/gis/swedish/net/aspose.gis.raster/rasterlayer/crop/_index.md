---
title: RasterLayer.Crop
second_title: Aspose.GIS för .NET API Referens
description: RasterLayer metod. Beskär rasterlagret med en formform och bandmask.
type: docs
weight: 110
url: /sv/net/aspose.gis.raster/rasterlayer/crop/
---
## Crop(IGeometry, double[]) {#crop}

Beskär rasterlagret med en formform (och bandmask).

```csharp
public RasterLayer Crop(IGeometry geometry, double[] masks = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| geometry | IGeometry | Geometri representerade formen. |
| masks | Double[] | Mask för gröda lager |

### Returvärde

Det beskurna rasterlagret. Om inga korsningar hittas återkommer`null`.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Argument kan inte vara null. Parameternamn: geometri. |
| NotSupportedException | Argument kan inte skilja sig från polygon eller yta. Parameternamn: geometri. |
| InvalidOperationException | Det ursprungliga lagret kan inte vara ett annat CropRasterLayer. |
| [GisException](../../../aspose.gis/gisexception/) | Fel vid beskärning av lagret. |

### Se även

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [RasterLayer](../)
* namnutrymme [Aspose.Gis.Raster](../../rasterlayer/)
* hopsättning [Aspose.GIS](../../../)

---

## Crop(double[]) {#crop_1}

Beskär rasterlagret med en bandmask).

```csharp
public RasterLayer Crop(double[] masks)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| masks | Double[] | Mask för gröda lager |

### Returvärde

Det beskurna rasterlagret. Om inga korsningar hittas återkommer`null`.

### Undantag

| undantag | skick |
| --- | --- |
| InvalidOperationException |  |

### Se även

* class [RasterLayer](../)
* namnutrymme [Aspose.Gis.Raster](../../rasterlayer/)
* hopsättning [Aspose.GIS](../../../)


