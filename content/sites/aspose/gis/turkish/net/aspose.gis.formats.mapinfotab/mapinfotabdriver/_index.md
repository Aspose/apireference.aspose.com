---
title: Class MapInfoTabDriver
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.Formats.MapInfoTab.MapInfoTabDriver sınıf. MapInfo Sekmesi formatı için bir sürücü.
type: docs
weight: 600
url: /tr/net/aspose.gis.formats.mapinfotab/mapinfotabdriver/
---
## MapInfoTabDriver class

MapInfo Sekmesi formatı için bir sürücü.

```csharp
public sealed class MapInfoTabDriver : FileDriver
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.mapinfotab/mapinfotabdriver/cancreatedatasets/) { get; } | Bu sürücünün veri kümeleri oluşturup oluşturamayacağını gösteren bir değer alır. |
| override [CanCreateLayers](../../aspose.gis.formats.mapinfotab/mapinfotabdriver/cancreatelayers/) { get; } | Bu sürücünün vektör katmanları oluşturup oluşturamayacağını gösteren bir değer alır. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets/) { get; } | Bu sürücünün veri kümelerini açıp açamayacağını gösteren bir değer alır. |
| override [CanOpenLayers](../../aspose.gis.formats.mapinfotab/mapinfotabdriver/canopenlayers/) { get; } | Bu sürücünün vektör katmanlarını açıp açamayacağını gösteren bir değer alır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath) | Bir veri kümesi oluşturur. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string) | Bir veri kümesi oluşturur. |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath, DriverOptions) | Bir veri kümesi oluşturur. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string, DriverOptions) | Bir veri kümesi oluşturur. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath) | Katmanı oluşturur ve eklemek için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string) | Katmanı oluşturur ve eklemek için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, DriverOptions) | Katmanı oluşturur ve eklemek için açar. |
| [CreateLayer](../../aspose.gis.formats.mapinfotab/mapinfotabdriver/createlayer/#createlayer_3)(AbstractPath, MapInfoTabOptions) | Bir katman oluşturur ve yeni özellikler eklemek için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, SpatialReferenceSystem) | Katmanı oluşturur ve eklemek için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions) | Katmanı oluşturur ve eklemek için açar. |
| [CreateLayer](../../aspose.gis.formats.mapinfotab/mapinfotabdriver/createlayer/#createlayer_9)(string, MapInfoTabOptions) | Bir katman oluşturur ve yeni özellikler eklemek için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, SpatialReferenceSystem) | Katmanı oluşturur ve eklemek için açar. |
| override [CreateLayer](../../aspose.gis.formats.mapinfotab/mapinfotabdriver/createlayer/#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Bir katman oluşturur ve yeni özellikler eklemek için açar. |
| [CreateLayer](../../aspose.gis.formats.mapinfotab/mapinfotabdriver/createlayer/#createlayer_4)(AbstractPath, MapInfoTabOptions, SpatialReferenceSystem) | Bir katman oluşturur ve yeni özellikler eklemek için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions, SpatialReferenceSystem) | Katmanı oluşturur ve eklemek için açar. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/)(AbstractPath, DriverOptions) | Düzenleme için bir katman açar. |
| [EditLayer](../../aspose.gis/filedriver/editlayer/)(string, DriverOptions) | Düzenleme için bir katman açar. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath) | Veri kümesini açar. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string) | Veri kümesini açar. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath, DriverOptions) | Veri kümesini açar. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string, DriverOptions) | Veri kümesini açar. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(AbstractPath) | Okumak için katmanı açar. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string) | Okumak için katmanı açar. |
| override [OpenLayer](../../aspose.gis.formats.mapinfotab/mapinfotabdriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | Okumak için bir katman açar. |
| [OpenLayer](../../aspose.gis.formats.mapinfotab/mapinfotabdriver/openlayer/#openlayer_2)(AbstractPath, MapInfoTabOptions) | Okumak için bir katman açar. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string, DriverOptions) | Okumak için katmanı açar. |
| [OpenLayer](../../aspose.gis.formats.mapinfotab/mapinfotabdriver/openlayer/#openlayer_5)(string, MapInfoTabOptions) | Okumak için bir katman açar. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.mapinfotab/mapinfotabdriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | Belirtilen uzamsal referans sisteminin sürücü tarafından desteklenip desteklenmediğini belirler. |

### Ayrıca bakınız

* class [FileDriver](../../aspose.gis/filedriver/)
* ad alanı [Aspose.Gis.Formats.MapInfoTab](../../aspose.gis.formats.mapinfotab/)
* toplantı [Aspose.GIS](../../)


