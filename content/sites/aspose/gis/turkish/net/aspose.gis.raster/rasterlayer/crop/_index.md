---
title: RasterLayer.Crop
second_title: Aspose.GIS for .NET API Referansı
description: RasterLayer yöntem. Bir şekil formu ve bant maskesi kullanarak tarama katmanını kırpar.
type: docs
weight: 110
url: /tr/net/aspose.gis.raster/rasterlayer/crop/
---
## Crop(IGeometry, double[]) {#crop}

Bir şekil formu (ve bant maskesi) kullanarak tarama katmanını kırpar.

```csharp
public RasterLayer Crop(IGeometry geometry, double[] masks = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| geometry | IGeometry | Geometri şekil formunu temsil ediyordu. |
| masks | Double[] | Kırpma katmanı için maske |

### Geri dönüş değeri

Kırpılmış tarama katmanı. Hiçbir kavşak bulunamazsa geri döner`null`.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | Argüman boş olamaz. Parametre adı: geometri. |
| NotSupportedException | Argüman poligon veya yüzeyden farklı olamaz. Parametre adı: geometri. |
| InvalidOperationException | Orijinal katman başka bir CropRasterLayer olamaz. |
| [GisException](../../../aspose.gis/gisexception/) | Katman kırpılırken hata oluştu. |

### Ayrıca bakınız

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [RasterLayer](../)
* ad alanı [Aspose.Gis.Raster](../../rasterlayer/)
* toplantı [Aspose.GIS](../../../)

---

## Crop(double[]) {#crop_1}

Bir bant maskesi kullanarak tarama katmanını kırpar).

```csharp
public RasterLayer Crop(double[] masks)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| masks | Double[] | Kırpma katmanı için maske |

### Geri dönüş değeri

Kırpılmış tarama katmanı. Hiçbir kavşak bulunamazsa geri döner`null`.

### istisnalar

| istisna | şart |
| --- | --- |
| InvalidOperationException |  |

### Ayrıca bakınız

* class [RasterLayer](../)
* ad alanı [Aspose.Gis.Raster](../../rasterlayer/)
* toplantı [Aspose.GIS](../../../)


