---
title: OsmXmlDriver.CreateLayer
second_title: Aspose.GIS for .NET API Referansı
description: OsmXmlDriver yöntem. Bir katman oluşturur ve yeni özellikler eklemek için açar.
type: docs
weight: 40
url: /tr/net/aspose.gis.formats.osmxml/osmxmldriver/createlayer/
---
## CreateLayer(string, OsmXmlOptions) {#createlayer_7}

Bir katman oluşturur ve yeni özellikler eklemek için açar.

```csharp
public VectorLayer CreateLayer(string path, OsmXmlOptions options)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | String | Dosyanın yolu. |
| options | OsmXmlOptions | Sürücüye özel seçenekler. |

### Geri dönüş değeri

bir örneği[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### istisnalar

| istisna | şart |
| --- | --- |
| InvalidOperationException | Katman zaten var. |

### Ayrıca bakınız

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [OsmXmlOptions](../../osmxmloptions/)
* class [OsmXmlDriver](../)
* ad alanı [Aspose.Gis.Formats.OsmXml](../../osmxmldriver/)
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
* class [OsmXmlDriver](../)
* ad alanı [Aspose.Gis.Formats.OsmXml](../../osmxmldriver/)
* toplantı [Aspose.GIS](../../../)

---

## CreateLayer(string, OsmXmlOptions, SpatialReferenceSystem) {#createlayer_8}

Bir katman oluşturur ve yeni özellikler eklemek için açar.

```csharp
public VectorLayer CreateLayer(string path, OsmXmlOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| path | String | Dosyanın yolu. |
| options | OsmXmlOptions | Sürücüye özel seçenekler. |
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
* class [OsmXmlOptions](../../osmxmloptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [OsmXmlDriver](../)
* ad alanı [Aspose.Gis.Formats.OsmXml](../../osmxmldriver/)
* toplantı [Aspose.GIS](../../../)


