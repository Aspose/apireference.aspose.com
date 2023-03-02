---
title: GdalDriver.CreateLayer
second_title: Aspose.GIS for .NET API Referansı
description: GdalDriver yöntem. Bir katman oluşturur ve yeni özellikler eklemek için açar.
type: docs
weight: 40
url: /tr/net/aspose.gis.formats.gdal/gdaldriver/createlayer/
---
## GdalDriver.CreateLayer method

Bir katman oluşturur ve yeni özellikler eklemek için açar.

```csharp
public override VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | AbstractPath | Dosyanın yolu. |
| options | DriverOptions | Sürücüye özel seçenekler. |
| spatialReferenceSystem | SpatialReferenceSystem | Mekansal referans sistemi. |

### Geri dönüş değeri

bir örneği[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### istisnalar

| istisna | şart |
| --- | --- |
| InvalidOperationException | Katman zaten var. |
| NotSupportedException | Uzamsal referans sistemi sürücü tarafından desteklenmiyor. |

### Ayrıca bakınız

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [GdalDriver](../)
* ad alanı [Aspose.Gis.Formats.GDAL](../../gdaldriver/)
* toplantı [Aspose.GIS](../../../)


