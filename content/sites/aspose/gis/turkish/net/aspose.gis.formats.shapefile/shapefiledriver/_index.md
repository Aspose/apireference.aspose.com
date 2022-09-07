---
title: ShapefileDriver
second_title: Aspose.GIS for .NET API Referansı
description: Shapefile formatı için bir sürücü.
type: docs
weight: 590
url: /tr/net/aspose.gis.formats.shapefile/shapefiledriver/
---
## ShapefileDriver class

Shapefile formatı için bir sürücü.

```csharp
public class ShapefileDriver : FileDriver
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.shapefile/shapefiledriver/cancreatedatasets) { get; } | Bu sürücünün veri kümeleri oluşturup oluşturamayacağını gösteren bir değer alır. |
| override [CanCreateLayers](../../aspose.gis.formats.shapefile/shapefiledriver/cancreatelayers) { get; } | Bu sürücünün vektör katmanları oluşturup oluşturamayacağını gösteren bir değer alır. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets) { get; } | Bu sürücünün veri kümelerini açıp açamayacağını gösteren bir değer alır. |
| override [CanOpenLayers](../../aspose.gis.formats.shapefile/shapefiledriver/canopenlayers) { get; } | Bu sürücünün vektör katmanlarını açıp açamayacağını gösteren bir değer alır. |

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
| [CreateLayer](../../aspose.gis.formats.shapefile/shapefiledriver/createlayer#createlayer_3)(AbstractPath, ShapefileOptions) | Bir katman oluşturur ve onu yeni özellikler eklemek için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(AbstractPath, SpatialReferenceSystem) | Katmanı oluşturur ve ekleme için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions) | Katmanı oluşturur ve ekleme için açar. |
| [CreateLayer](../../aspose.gis.formats.shapefile/shapefiledriver/createlayer#createlayer_9)(string, ShapefileOptions) | Bir katman oluşturur ve onu yeni özellikler eklemek için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, SpatialReferenceSystem) | Katmanı oluşturur ve ekleme için açar. |
| override [CreateLayer](../../aspose.gis.formats.shapefile/shapefiledriver/createlayer#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Bir katman oluşturur ve onu yeni özellikler eklemek için açar. |
| [CreateLayer](../../aspose.gis.formats.shapefile/shapefiledriver/createlayer#createlayer_4)(AbstractPath, ShapefileOptions, SpatialReferenceSystem) | Bir katman oluşturur ve onu yeni özellikler eklemek için açar. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer)(string, DriverOptions, SpatialReferenceSystem) | Katmanı oluşturur ve ekleme için açar. |
| override [EditLayer](../../aspose.gis.formats.shapefile/shapefiledriver/editlayer#editlayer)(AbstractPath, DriverOptions) | Düzenlemek için bir katman açar. |
| [EditLayer](../../aspose.gis.formats.shapefile/shapefiledriver/editlayer#editlayer_1)(AbstractPath, ShapefileOptions) | Düzenlemek için bir katman açar. |
| [EditLayer](../../aspose.gis/filedriver/editlayer)(string, DriverOptions) | Düzenlemek için bir katman açar. |
| [EditLayer](../../aspose.gis.formats.shapefile/shapefiledriver/editlayer#editlayer_3)(string, ShapefileOptions) | Düzenlemek için bir katman açar. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath) | Veri kümesini açar. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string) | Veri kümesini açar. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset)(AbstractPath, DriverOptions) | Veri kümesini açar. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset)(string, DriverOptions) | Veri kümesini açar. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(AbstractPath) | Okuma için katmanı açar. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string) | Okuma için katmanı açar. |
| override [OpenLayer](../../aspose.gis.formats.shapefile/shapefiledriver/openlayer#openlayer_1)(AbstractPath, DriverOptions) | Okuma için bir katman açar. |
| [OpenLayer](../../aspose.gis.formats.shapefile/shapefiledriver/openlayer#openlayer_2)(AbstractPath, ShapefileOptions) | Okuma için bir katman açar. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer)(string, DriverOptions) | Okuma için katmanı açar. |
| [OpenLayer](../../aspose.gis.formats.shapefile/shapefiledriver/openlayer#openlayer_5)(string, ShapefileOptions) | Okuma için bir katman açar. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.shapefile/shapefiledriver/supportsspatialreferencesystem)(SpatialReferenceSystem) | Belirtilen uzamsal referans sisteminin sürücü tarafından desteklenip desteklenmediğini belirler. |

### Ayrıca bakınız

* class [FileDriver](../../aspose.gis/filedriver)
* ad alanı [Aspose.Gis.Formats.Shapefile](../../aspose.gis.formats.shapefile)
* toplantı [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
