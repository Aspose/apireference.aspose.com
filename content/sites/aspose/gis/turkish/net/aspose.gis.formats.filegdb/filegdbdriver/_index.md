---
title: FileGdbDriver
second_title: Aspose.GIS for .NET API Referansı
description: ESRI Dosyası Geodatabase formatı için bir sürücü.
type: docs
weight: 230
url: /tr/net/aspose.gis.formats.filegdb/filegdbdriver/
---
## FileGdbDriver class

ESRI Dosyası Geodatabase formatı için bir sürücü.

```csharp
public sealed class FileGdbDriver : FileDriver
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.filegdb/filegdbdriver/cancreatedatasets) { get; } | Bu sürücünün veri kümeleri oluşturup oluşturamayacağını gösteren bir değer alır. |
| override [CanCreateLayers](../../aspose.gis.formats.filegdb/filegdbdriver/cancreatelayers) { get; } | Bu sürücünün vektör katmanları oluşturup oluşturamayacağını gösteren bir değer alır. |
| override [CanOpenDatasets](../../aspose.gis.formats.filegdb/filegdbdriver/canopendatasets) { get; } | Bu sürücünün veri kümelerini açıp açamayacağını gösteren bir değer alır. |
| override [CanOpenLayers](../../aspose.gis.formats.filegdb/filegdbdriver/canopenlayers) { get; } | Bu sürücünün vektör katmanlarını açıp açamayacağını gösteren bir değer alır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(AbstractPath) | Bir veri kümesi oluşturur. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(string) | Bir veri kümesi oluşturur. |
| override [CreateDataset](../../aspose.gis.formats.filegdb/filegdbdriver/createdataset#createdataset_1)(AbstractPath, DriverOptions) | Bir veri kümesi oluşturur. |
| [CreateDataset](../../aspose.gis.formats.filegdb/filegdbdriver/createdataset#createdataset_2)(AbstractPath, FileGdbOptions) | Bir veri kümesi oluşturur. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(string, DriverOptions) | Bir veri kümesi oluşturur. |
| [CreateDataset](../../aspose.gis.formats.filegdb/filegdbdriver/createdataset#createdataset_5)(string, FileGdbOptions) | Bir veri kümesi oluşturur. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath) | Katmanı oluşturur ve ekleme için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string) | Katmanı oluşturur ve ekleme için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, DriverOptions) | Katmanı oluşturur ve ekleme için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, SpatialReferenceSystem) | Katmanı oluşturur ve ekleme için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions) | Katmanı oluşturur ve ekleme için açar. |
| [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer#createlayer_8)(string, FileGdbOptions) | Bir katman oluşturur ve onu yeni özellikler eklemek için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, SpatialReferenceSystem) | Katmanı oluşturur ve ekleme için açar. |
| override [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Bir katman oluşturur ve onu eklemek için açar. |
| [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer#createlayer_3)(AbstractPath, FileGdbOptions, SpatialReferenceSystem) | Bir katman oluşturur ve onu eklemek için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions, SpatialReferenceSystem) | Katmanı oluşturur ve ekleme için açar. |
| [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer#createlayer_9)(string, FileGdbOptions, SpatialReferenceSystem) | Bir katman oluşturur ve onu eklemek için açar. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer)(AbstractPath, DriverOptions) | Düzenlemek için bir katman açar. |
| [EditLayer](../../aspose.gis/filedriver/editlayer)(string, DriverOptions) | Düzenlemek için bir katman açar. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath) | Veri kümesini açar. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string) | Veri kümesini açar. |
| override [OpenDataset](../../aspose.gis.formats.filegdb/filegdbdriver/opendataset#opendataset_1)(AbstractPath, DriverOptions) | Veri kümesini açar. |
| [OpenDataset](../../aspose.gis.formats.filegdb/filegdbdriver/opendataset#opendataset_2)(AbstractPath, FileGdbOptions) | Veri kümesini açar. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string, DriverOptions) | Veri kümesini açar. |
| [OpenDataset](../../aspose.gis.formats.filegdb/filegdbdriver/opendataset#opendataset_5)(string, FileGdbOptions) | Veri kümesini açar. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(AbstractPath) | Okuma için katmanı açar. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string) | Okuma için katmanı açar. |
| override [OpenLayer](../../aspose.gis.formats.filegdb/filegdbdriver/openlayer#openlayer_1)(AbstractPath, DriverOptions) | Okuma için bir katman açar. |
| [OpenLayer](../../aspose.gis.formats.filegdb/filegdbdriver/openlayer#openlayer_2)(AbstractPath, FileGdbOptions) | Okuma için bir katman açar. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string, DriverOptions) | Okuma için katmanı açar. |
| [OpenLayer](../../aspose.gis.formats.filegdb/filegdbdriver/openlayer#openlayer_5)(string, FileGdbOptions) | Okuma için bir katman açar. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.filegdb/filegdbdriver/supportsspatialreferencesystem)(SpatialReferenceSystem) | Belirtilen uzamsal referans sisteminin sürücü tarafından desteklenip desteklenmediğini belirler. |

### Ayrıca bakınız

* class [FileDriver](../../aspose.gis/filedriver)
* ad alanı [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb)
* toplantı [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
