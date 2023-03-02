---
title: MapInfoInterchangeDriver.CreateLayer
second_title: Aspose.GIS for .NET API Referansı
description: MapInfoInterchangeDriver yöntem. Bir katman oluşturur ve yeni özellikler eklemek için açar.
type: docs
weight: 40
url: /tr/net/aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/createlayer/
---
## CreateLayer(string, MapInfoInterchangeOptions) {#createlayer_7}

Bir katman oluşturur ve yeni özellikler eklemek için açar.

```csharp
public VectorLayer CreateLayer(string path, MapInfoInterchangeOptions options)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | String | Dosyanın yolu. |
| options | MapInfoInterchangeOptions | Sürücüye özel seçenekler. |

### Geri dönüş değeri

bir örneği[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### istisnalar

| istisna | şart |
| --- | --- |
| InvalidOperationException | Katman zaten var. |

### Ayrıca bakınız

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [MapInfoInterchangeOptions](../../mapinfointerchangeoptions/)
* class [MapInfoInterchangeDriver](../)
* ad alanı [Aspose.Gis.Formats.MapInfoInterchange](../../mapinfointerchangedriver/)
* toplantı [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_2}

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

### Ayrıca bakınız

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [MapInfoInterchangeDriver](../)
* ad alanı [Aspose.Gis.Formats.MapInfoInterchange](../../mapinfointerchangedriver/)
* toplantı [Aspose.GIS](../../../)

---

## CreateLayer(string, MapInfoInterchangeOptions, SpatialReferenceSystem) {#createlayer_8}

Bir katman oluşturur ve yeni özellikler eklemek için açar.

```csharp
public VectorLayer CreateLayer(string path, MapInfoInterchangeOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | String | Dosyanın yolu. |
| options | MapInfoInterchangeOptions | Sürücüye özel seçenekler. |
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
* class [MapInfoInterchangeOptions](../../mapinfointerchangeoptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [MapInfoInterchangeDriver](../)
* ad alanı [Aspose.Gis.Formats.MapInfoInterchange](../../mapinfointerchangedriver/)
* toplantı [Aspose.GIS](../../../)


