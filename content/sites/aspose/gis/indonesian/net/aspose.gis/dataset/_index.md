---
title: Class Dataset
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.Dataset kelas. Kumpulan data adalah kumpulan dariVectorLayer contoh.
type: docs
weight: 80
url: /id/net/aspose.gis/dataset/
---
## Dataset class

Kumpulan data adalah kumpulan dari[`VectorLayer`](../vectorlayer/) contoh.

```csharp
public abstract class Dataset : IDisposable
```

## Properti

| Nama | Keterangan |
| --- | --- |
| virtual [CanCreateLayers](../../aspose.gis/dataset/cancreatelayers/) { get; } | Mendapat nilai yang menunjukkan apakah kumpulan data ini dapat membuat lapisan vektor. |
| virtual [CanRemoveLayers](../../aspose.gis/dataset/canremovelayers/) { get; } | Mendapat nilai yang menunjukkan apakah kumpulan data ini dapat menghapus lapisan vektor. |
| abstract [Driver](../../aspose.gis/dataset/driver/) { get; } | Mendapatkan[`Driver`](./driver/) yang membuat contoh set data ini. |
| abstract [LayersCount](../../aspose.gis/dataset/layerscount/) { get; } | Mendapat jumlah lapisan dalam kumpulan data ini. |

## Metode

| Nama | Keterangan |
| --- | --- |
| static [Create](../../aspose.gis/dataset/create/#create)(AbstractPath, FileDriver) | Membuat kumpulan data. |
| static [Create](../../aspose.gis/dataset/create/#create_2)(string, FileDriver) | Membuat kumpulan data. |
| static [Create](../../aspose.gis/dataset/create/#create_1)(AbstractPath, FileDriver, DriverOptions) | Membuat kumpulan data. |
| static [Create](../../aspose.gis/dataset/create/#create_3)(string, FileDriver, DriverOptions) | Membuat kumpulan data. |
| static [Open](../../aspose.gis/dataset/open/#open)(AbstractPath, FileDriver) | Membuka kumpulan data. |
| static [Open](../../aspose.gis/dataset/open/#open_2)(IDbConnection, DatabaseDriver) | Membuka kumpulan data. |
| static [Open](../../aspose.gis/dataset/open/#open_3)(string, FileDriver) | Membuka kumpulan data. |
| static [Open](../../aspose.gis/dataset/open/#open_1)(AbstractPath, FileDriver, DriverOptions) | Membuka kumpulan data. |
| static [Open](../../aspose.gis/dataset/open/#open_4)(string, FileDriver, DriverOptions) | Membuka kumpulan data. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer)() | Membuat layer vektor baru dan membukanya untuk ditambahkan. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_2)(SpatialReferenceSystem) | Membuat layer vektor baru dan membukanya untuk ditambahkan. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_1)(DriverOptions, SpatialReferenceSystem) | Membuat layer vektor baru dan membukanya untuk ditambahkan. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_4)(string, SpatialReferenceSystem) | Membuat layer vektor baru dengan nama tertentu dan membukanya untuk ditambahkan. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_3)(string, DriverOptions, SpatialReferenceSystem) | Membuat layer vektor baru dengan nama tertentu dan membukanya untuk ditambahkan. |
| [Dispose](../../aspose.gis/dataset/dispose/)() | Merilis sumber daya yang digunakan oleh`Dataset` . |
| abstract [EditLayer](../../aspose.gis/dataset/editlayer/)(string, DriverOptions, SpatialReferenceSystem) | Membuka layer dengan nama tertentu untuk diedit. |
| abstract [GetLayerName](../../aspose.gis/dataset/getlayername/)(int) | Mendapatkan nama layer pada indeks yang ditentukan. |
| abstract [OpenLayer](../../aspose.gis/dataset/openlayer/)(string, DriverOptions) | Membuka layer dengan nama tertentu untuk dibaca. |
| abstract [OpenLayerAt](../../aspose.gis/dataset/openlayerat/)(int, DriverOptions) | Membuka layer pada indeks tertentu untuk dibaca. |
| virtual [RemoveLayer](../../aspose.gis/dataset/removelayer/)(string) | Menghapus lapisan vektor dengan nama tertentu. |
| virtual [RemoveLayerAt](../../aspose.gis/dataset/removelayerat/)(int) | Menghapus lapisan vektor pada indeks tertentu. |

### Lihat juga

* ruang nama [Aspose.Gis](../../aspose.gis/)
* perakitan [Aspose.GIS](../../)


