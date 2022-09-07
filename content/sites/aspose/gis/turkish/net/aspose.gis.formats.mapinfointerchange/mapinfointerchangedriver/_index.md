---
title: MapInfoInterchangeDriver
second_title: Aspose.GIS for .NET API Referansı
description: MapInfo Değişim Formatı için bir sürücü.
type: docs
weight: 510
url: /tr/net/aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/
---
## MapInfoInterchangeDriver class

MapInfo Değişim Formatı için bir sürücü.

```csharp
public sealed class MapInfoInterchangeDriver : FileDriver
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/cancreatedatasets) { get; } | Bu sürücünün veri kümeleri oluşturup oluşturamayacağını gösteren bir değer alır. |
| override [CanCreateLayers](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/cancreatelayers) { get; } | Bu sürücünün vektör katmanları oluşturup oluşturamayacağını gösteren bir değer alır. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets) { get; } | Bu sürücünün veri kümelerini açıp açamayacağını gösteren bir değer alır. |
| override [CanOpenLayers](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/canopenlayers) { get; } | Bu sürücünün vektör katmanlarını açıp açamayacağını gösteren bir değer alır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(AbstractPath) | Bir veri kümesi oluşturur. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(string) | Bir veri kümesi oluşturur. |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset)(AbstractPath, DriverOptions) | Bir veri kümesi oluşturur. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(string, DriverOptions) | Bir veri kümesi oluşturur. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath) | Katmanı oluşturur ve ekleme için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string) | Katmanı oluşturur ve ekleme için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, DriverOptions) | Katmanı oluşturur ve ekleme için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, SpatialReferenceSystem) | Katmanı oluşturur ve ekleme için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions) | Katmanı oluşturur ve ekleme için açar. |
| [CreateLayer](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/createlayer#createlayer_7)(string, MapInfoInterchangeOptions) | Bir katman oluşturur ve onu yeni özellikler eklemek için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, SpatialReferenceSystem) | Katmanı oluşturur ve ekleme için açar. |
| override [CreateLayer](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/createlayer#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Bir katman oluşturur ve onu yeni özellikler eklemek için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions, SpatialReferenceSystem) | Katmanı oluşturur ve ekleme için açar. |
| [CreateLayer](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/createlayer#createlayer_8)(string, MapInfoInterchangeOptions, SpatialReferenceSystem) | Bir katman oluşturur ve onu yeni özellikler eklemek için açar. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer)(AbstractPath, DriverOptions) | Düzenlemek için bir katman açar. |
| [EditLayer](../../aspose.gis/filedriver/editlayer)(string, DriverOptions) | Düzenlemek için bir katman açar. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath) | Veri kümesini açar. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string) | Veri kümesini açar. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath, DriverOptions) | Veri kümesini açar. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string, DriverOptions) | Veri kümesini açar. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(AbstractPath) | Okuma için katmanı açar. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string) | Okuma için katmanı açar. |
| override [OpenLayer](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/openlayer#openlayer_1)(AbstractPath, DriverOptions) | Okuma için bir katman açar. |
| [OpenLayer](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/openlayer#openlayer_2)(AbstractPath, MapInfoInterchangeOptions) | Okuma için bir katman açar. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string, DriverOptions) | Okuma için katmanı açar. |
| [OpenLayer](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/openlayer#openlayer_5)(string, MapInfoInterchangeOptions) | Okuma için bir katman açar. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.mapinfointerchange/mapinfointerchangedriver/supportsspatialreferencesystem)(SpatialReferenceSystem) | Belirtilen uzamsal referans sisteminin sürücü tarafından desteklenip desteklenmediğini belirler. |

### Ayrıca bakınız

* class [FileDriver](../../aspose.gis/filedriver)
* ad alanı [Aspose.Gis.Formats.MapInfoInterchange](../../aspose.gis.formats.mapinfointerchange)
* toplantı [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
