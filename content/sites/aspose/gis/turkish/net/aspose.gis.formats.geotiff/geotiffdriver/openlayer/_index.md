---
title: GeoTiffDriver.OpenLayer
second_title: Aspose.GIS for .NET API Referansı
description: GeoTiffDriver yöntem. Okumak için katmanı açar.
type: docs
weight: 20
url: /tr/net/aspose.gis.formats.geotiff/geotiffdriver/openlayer/
---
## OpenLayer(AbstractPath, RasterDriverOptions) {#openlayer_2}

Okumak için katmanı açar.

```csharp
public override RasterLayer OpenLayer(AbstractPath path, RasterDriverOptions options)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | AbstractPath | Dosyanın yolu. |
| options | RasterDriverOptions | Sürücüye özel seçenekler. |

### Geri dönüş değeri

bir örneği[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentException | Seçenekler nesnesi bu sürücü için yanlış bir türe sahip. |
| ArgumentNullException | yol`null`. |
| IOException | Bir G/Ç hatası oluştu. |
| NotSupportedException | Sürücü tarama katmanlarını açamıyor (bkz.[`CanOpenLayers`](../canopenlayers/)). |

### Ayrıca bakınız

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [RasterDriverOptions](../../../aspose.gis/rasterdriveroptions/)
* class [GeoTiffDriver](../)
* ad alanı [Aspose.Gis.Formats.GeoTiff](../../geotiffdriver/)
* toplantı [Aspose.GIS](../../../)

---

## OpenLayer(string, GeoTiffOptions) {#openlayer_4}

Okumak için bir katman açar.

```csharp
public RasterLayer OpenLayer(string path, GeoTiffOptions options)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | String | Dosyanın yolu. |
| options | GeoTiffOptions | Sürücüye özel seçenekler. |

### Geri dönüş değeri

bir örneği[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### Ayrıca bakınız

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [GeoTiffOptions](../../geotiffoptions/)
* class [GeoTiffDriver](../)
* ad alanı [Aspose.Gis.Formats.GeoTiff](../../geotiffdriver/)
* toplantı [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath, GeoTiffOptions) {#openlayer_1}

Okumak için bir katman açar.

```csharp
public RasterLayer OpenLayer(AbstractPath path, GeoTiffOptions options)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | AbstractPath | Dosyanın yolu. |
| options | GeoTiffOptions | Sürücüye özel seçenekler. |

### Geri dönüş değeri

bir örneği[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### Ayrıca bakınız

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [GeoTiffOptions](../../geotiffoptions/)
* class [GeoTiffDriver](../)
* ad alanı [Aspose.Gis.Formats.GeoTiff](../../geotiffdriver/)
* toplantı [Aspose.GIS](../../../)


