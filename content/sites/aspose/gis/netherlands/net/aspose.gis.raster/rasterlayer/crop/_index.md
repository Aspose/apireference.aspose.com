---
title: RasterLayer.Crop
second_title: Aspose.GIS voor .NET API-referentie
description: RasterLayer methode. Snijdt de rasterlaag bij met behulp van een vormvorm en bandmasker.
type: docs
weight: 110
url: /nl/net/aspose.gis.raster/rasterlayer/crop/
---
## Crop(IGeometry, double[]) {#crop}

Snijdt de rasterlaag bij met behulp van een vormvorm (en bandmasker).

```csharp
public RasterLayer Crop(IGeometry geometry, double[] masks = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| geometry | IGeometry | Geometrie vertegenwoordigde de vormvorm. |
| masks | Double[] | Masker voor gewaslaag |

### Winstwaarde

De bijgesneden rasterlaag. Als er geen kruispunten gevonden zijn, keert terug`null`.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument kan niet nul zijn. Parameternaam: geometrie. |
| NotSupportedException | Argument kan niet verschillen van polygoon of oppervlak. Parameternaam: geometrie. |
| InvalidOperationException | Oorspronkelijke laag kan geen andere CropRasterLayer zijn. |
| [GisException](../../../aspose.gis/gisexception/) | Fout bij het bijsnijden van de laag. |

### Zie ook

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [RasterLayer](../)
* naamruimte [Aspose.Gis.Raster](../../rasterlayer/)
* montage [Aspose.GIS](../../../)

---

## Crop(double[]) {#crop_1}

Snijdt de rasterlaag bij met behulp van een bandmasker).

```csharp
public RasterLayer Crop(double[] masks)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| masks | Double[] | Masker voor gewaslaag |

### Winstwaarde

De bijgesneden rasterlaag. Als er geen kruispunten gevonden zijn, keert terug`null`.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| InvalidOperationException |  |

### Zie ook

* class [RasterLayer](../)
* naamruimte [Aspose.Gis.Raster](../../rasterlayer/)
* montage [Aspose.GIS](../../../)


