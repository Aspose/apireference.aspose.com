---
title: Class GmlDriver
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.Formats.Gml.GmlDriver sınıf. GML formatı için bir sürücü.
type: docs
weight: 340
url: /tr/net/aspose.gis.formats.gml/gmldriver/
---
## GmlDriver class

GML formatı için bir sürücü.

```csharp
public sealed class GmlDriver : FileDriver
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.gml/gmldriver/cancreatedatasets/) { get; } | Bu sürücünün veri kümeleri oluşturup oluşturamayacağını gösteren bir değer alır. |
| override [CanCreateLayers](../../aspose.gis.formats.gml/gmldriver/cancreatelayers/) { get; } | Bu sürücünün vektör katmanları oluşturup oluşturamayacağını gösteren bir değer alır. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets/) { get; } | Bu sürücünün veri kümelerini açıp açamayacağını gösteren bir değer alır. |
| override [CanOpenLayers](../../aspose.gis.formats.gml/gmldriver/canopenlayers/) { get; } | Bu sürücünün vektör katmanlarını açıp açamayacağını gösteren bir değer alır. |

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
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, SpatialReferenceSystem) | Katmanı oluşturur ve eklemek için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions) | Katmanı oluşturur ve eklemek için açar. |
| [CreateLayer](../../aspose.gis.formats.gml/gmldriver/createlayer/#createlayer_7)(string, GmlOptions) | Bir katman oluşturur ve yeni özellikler eklemek için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, SpatialReferenceSystem) | Katmanı oluşturur ve eklemek için açar. |
| override [CreateLayer](../../aspose.gis.formats.gml/gmldriver/createlayer/#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Bir katman oluşturur ve yeni özellikler eklemek için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions, SpatialReferenceSystem) | Katmanı oluşturur ve eklemek için açar. |
| [CreateLayer](../../aspose.gis.formats.gml/gmldriver/createlayer/#createlayer_8)(string, GmlOptions, SpatialReferenceSystem) | Bir katman oluşturur ve yeni özellikler eklemek için açar. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/)(AbstractPath, DriverOptions) | Düzenleme için bir katman açar. |
| [EditLayer](../../aspose.gis/filedriver/editlayer/)(string, DriverOptions) | Düzenleme için bir katman açar. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath) | Veri kümesini açar. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string) | Veri kümesini açar. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath, DriverOptions) | Veri kümesini açar. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string, DriverOptions) | Veri kümesini açar. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(AbstractPath) | Okumak için katmanı açar. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string) | Okumak için katmanı açar. |
| override [OpenLayer](../../aspose.gis.formats.gml/gmldriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | Okumak için bir katman açar. |
| [OpenLayer](../../aspose.gis.formats.gml/gmldriver/openlayer/#openlayer_2)(AbstractPath, GmlOptions) | Okumak için bir katman açar. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string, DriverOptions) | Okumak için katmanı açar. |
| [OpenLayer](../../aspose.gis.formats.gml/gmldriver/openlayer/#openlayer_5)(string, GmlOptions) | Okumak için bir katman açar. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.gml/gmldriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | Belirtilen uzamsal referans sisteminin sürücü tarafından desteklenip desteklenmediğini belirler. |

### Ayrıca bakınız

* class [FileDriver](../../aspose.gis/filedriver/)
* ad alanı [Aspose.Gis.Formats.Gml](../../aspose.gis.formats.gml/)
* toplantı [Aspose.GIS](../../)


