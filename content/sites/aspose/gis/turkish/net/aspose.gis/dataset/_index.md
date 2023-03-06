---
title: Class Dataset
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.Dataset sınıf. Bir veri kümesiVectorLayer örnekler.
type: docs
weight: 80
url: /tr/net/aspose.gis/dataset/
---
## Dataset class

Bir veri kümesi,[`VectorLayer`](../vectorlayer/) örnekler.

```csharp
public abstract class Dataset : IDisposable
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| virtual [CanCreateLayers](../../aspose.gis/dataset/cancreatelayers/) { get; } | Bu veri kümesinin vektör katmanları oluşturup oluşturamayacağını gösteren bir değer alır. |
| virtual [CanRemoveLayers](../../aspose.gis/dataset/canremovelayers/) { get; } | Bu veri kümesinin vektör katmanlarını kaldırıp kaldıramayacağını gösteren bir değer alır. |
| abstract [Driver](../../aspose.gis/dataset/driver/) { get; } | Şunu alır:[`Driver`](./driver/) bu veri kümesini başlatan. |
| abstract [LayersCount](../../aspose.gis/dataset/layerscount/) { get; } | Bu veri kümesindeki katman sayısını alır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| static [Create](../../aspose.gis/dataset/create/#create)(AbstractPath, FileDriver) | Bir veri kümesi oluşturur. |
| static [Create](../../aspose.gis/dataset/create/#create_2)(string, FileDriver) | Bir veri kümesi oluşturur. |
| static [Create](../../aspose.gis/dataset/create/#create_1)(AbstractPath, FileDriver, DriverOptions) | Bir veri kümesi oluşturur. |
| static [Create](../../aspose.gis/dataset/create/#create_3)(string, FileDriver, DriverOptions) | Bir veri kümesi oluşturur. |
| static [Open](../../aspose.gis/dataset/open/#open)(AbstractPath, FileDriver) | Veri kümesini açar. |
| static [Open](../../aspose.gis/dataset/open/#open_2)(IDbConnection, DatabaseDriver) | Veri kümesini açar. |
| static [Open](../../aspose.gis/dataset/open/#open_3)(string, FileDriver) | Veri kümesini açar. |
| static [Open](../../aspose.gis/dataset/open/#open_1)(AbstractPath, FileDriver, DriverOptions) | Veri kümesini açar. |
| static [Open](../../aspose.gis/dataset/open/#open_4)(string, FileDriver, DriverOptions) | Veri kümesini açar. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer)() | Yeni bir vektör katmanı oluşturur ve onu ekleme için açar. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_2)(SpatialReferenceSystem) | Yeni bir vektör katmanı oluşturur ve onu ekleme için açar. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_1)(DriverOptions, SpatialReferenceSystem) | Yeni bir vektör katmanı oluşturur ve onu ekleme için açar. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_4)(string, SpatialReferenceSystem) | Belirtilen ada sahip yeni bir vektör katmanı oluşturur ve onu ekleme için açar. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_3)(string, DriverOptions, SpatialReferenceSystem) | Belirtilen ada sahip yeni bir vektör katmanı oluşturur ve onu ekleme için açar. |
| [Dispose](../../aspose.gis/dataset/dispose/)() | tarafından kullanılan kaynakları serbest bırakır.`Dataset` . |
| abstract [EditLayer](../../aspose.gis/dataset/editlayer/)(string, DriverOptions, SpatialReferenceSystem) | Belirtilen ada sahip katmanı düzenleme için açar. |
| abstract [GetLayerName](../../aspose.gis/dataset/getlayername/)(int) | Belirtilen dizindeki katmanın adını alır. |
| abstract [OpenLayer](../../aspose.gis/dataset/openlayer/)(string, DriverOptions) | Belirtilen ada sahip katmanı okumak için açar. |
| abstract [OpenLayerAt](../../aspose.gis/dataset/openlayerat/)(int, DriverOptions) | Belirtilen dizindeki katmanı okuma için açar. |
| virtual [RemoveLayer](../../aspose.gis/dataset/removelayer/)(string) | Belirtilen ada sahip vektör katmanını kaldırır. |
| virtual [RemoveLayerAt](../../aspose.gis/dataset/removelayerat/)(int) | Belirtilen dizinde vektör katmanını kaldırır. |

### Ayrıca bakınız

* ad alanı [Aspose.Gis](../../aspose.gis/)
* toplantı [Aspose.GIS](../../)


