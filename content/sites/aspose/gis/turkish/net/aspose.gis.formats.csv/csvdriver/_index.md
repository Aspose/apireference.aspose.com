---
title: CsvDriver
second_title: Aspose.GIS for .NET API Referansı
description: CSV biçimi için bir sürücü.
type: docs
weight: 180
url: /tr/net/aspose.gis.formats.csv/csvdriver/
---
## CsvDriver class

CSV biçimi için bir sürücü.

```csharp
public class CsvDriver : FileDriver
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [CsvDriver](csvdriver)() | Default_Constructor |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.csv/csvdriver/cancreatedatasets) { get; } | Bu sürücünün veri kümeleri oluşturup oluşturamayacağını gösteren bir değer alır. |
| override [CanCreateLayers](../../aspose.gis.formats.csv/csvdriver/cancreatelayers) { get; } | Bu sürücünün vektör katmanları oluşturup oluşturamayacağını gösteren bir değer alır. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets) { get; } | Bu sürücünün veri kümelerini açıp açamayacağını gösteren bir değer alır. |
| override [CanOpenLayers](../../aspose.gis.formats.csv/csvdriver/canopenlayers) { get; } | Bu sürücünün vektör katmanlarını açıp açamayacağını gösteren bir değer alır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(AbstractPath) | Bir veri kümesi oluşturur. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(string) | Bir veri kümesi oluşturur. |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset)(AbstractPath, DriverOptions) | Bir veri kümesi oluşturur. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset)(string, DriverOptions) | Bir veri kümesi oluşturur. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath) | Katmanı oluşturur ve ekleme için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string) | Katmanı oluşturur ve ekleme için açar. |
| [CreateLayer](../../aspose.gis.formats.csv/csvdriver/createlayer#createlayer_3)(AbstractPath, CsvOptions) | Bir katman oluşturur ve onu yeni özellikler eklemek için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, DriverOptions) | Katmanı oluşturur ve ekleme için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, SpatialReferenceSystem) | Katmanı oluşturur ve ekleme için açar. |
| [CreateLayer](../../aspose.gis.formats.csv/csvdriver/createlayer#createlayer_9)(string, CsvOptions) | Bir katman oluşturur ve onu yeni özellikler eklemek için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions) | Katmanı oluşturur ve ekleme için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, SpatialReferenceSystem) | Katmanı oluşturur ve ekleme için açar. |
| [CreateLayer](../../aspose.gis.formats.csv/csvdriver/createlayer#createlayer_4)(AbstractPath, CsvOptions, SpatialReferenceSystem) | Bir katman oluşturur ve onu yeni özellikler eklemek için açar. |
| override [CreateLayer](../../aspose.gis.formats.csv/csvdriver/createlayer#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Bir katman oluşturur ve onu yeni özellikler eklemek için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions, SpatialReferenceSystem) | Katmanı oluşturur ve ekleme için açar. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer)(AbstractPath, DriverOptions) | Düzenlemek için bir katman açar. |
| [EditLayer](../../aspose.gis/filedriver/editlayer)(string, DriverOptions) | Düzenlemek için bir katman açar. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath) | Veri kümesini açar. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string) | Veri kümesini açar. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath, DriverOptions) | Veri kümesini açar. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string, DriverOptions) | Veri kümesini açar. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(AbstractPath) | Okuma için katmanı açar. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string) | Okuma için katmanı açar. |
| [OpenLayer](../../aspose.gis.formats.csv/csvdriver/openlayer#openlayer_2)(AbstractPath, CsvOptions) | Okuma için bir katman açar. |
| override [OpenLayer](../../aspose.gis.formats.csv/csvdriver/openlayer#openlayer_1)(AbstractPath, DriverOptions) | Okuma için bir katman açar. |
| [OpenLayer](../../aspose.gis.formats.csv/csvdriver/openlayer#openlayer_5)(string, CsvOptions) | Okuma için bir katman açar. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string, DriverOptions) | Okuma için katmanı açar. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.csv/csvdriver/supportsspatialreferencesystem)(SpatialReferenceSystem) | Belirtilen uzamsal referans sisteminin sürücü tarafından desteklenip desteklenmediğini belirler. |

### Ayrıca bakınız

* class [FileDriver](../../aspose.gis/filedriver)
* ad alanı [Aspose.Gis.Formats.Csv](../../aspose.gis.formats.csv)
* toplantı [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
