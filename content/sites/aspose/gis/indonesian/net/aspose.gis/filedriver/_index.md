---
title: Class FileDriver
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.FileDriver kelas. Driver untuk format berbasis file tertentu.
type: docs
weight: 180
url: /id/net/aspose.gis/filedriver/
---
## FileDriver class

Driver untuk format berbasis file tertentu.

```csharp
public abstract class FileDriver : Driver
```

## Properti

| Nama | Keterangan |
| --- | --- |
| abstract [CanCreateDatasets](../../aspose.gis/filedriver/cancreatedatasets/) { get; } | Mendapat nilai yang menunjukkan apakah driver ini dapat membuat kumpulan data. |
| abstract [CanCreateLayers](../../aspose.gis/filedriver/cancreatelayers/) { get; } | Mendapat nilai yang menunjukkan apakah driver ini dapat membuat lapisan vektor. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets/) { get; } | Mendapat nilai yang menunjukkan apakah driver ini dapat membuka kumpulan data. |
| abstract [CanOpenLayers](../../aspose.gis/filedriver/canopenlayers/) { get; } | Mendapat nilai yang menunjukkan apakah driver ini dapat membuka lapisan vektor. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset)(AbstractPath) | Membuat kumpulan data. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset_2)(string) | Membuat kumpulan data. |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset_1)(AbstractPath, DriverOptions) | Membuat kumpulan data. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset_3)(string, DriverOptions) | Membuat kumpulan data. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer)(AbstractPath) | Membuat layer dan membukanya untuk ditambahkan. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_4)(string) | Membuat layer dan membukanya untuk ditambahkan. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_1)(AbstractPath, DriverOptions) | Membuat layer dan membukanya untuk ditambahkan. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_3)(AbstractPath, SpatialReferenceSystem) | Membuat layer dan membukanya untuk ditambahkan. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_5)(string, DriverOptions) | Membuat layer dan membukanya untuk ditambahkan. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_7)(string, SpatialReferenceSystem) | Membuat layer dan membukanya untuk ditambahkan. |
| abstract [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Membuat layer dan membukanya untuk ditambahkan. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_6)(string, DriverOptions, SpatialReferenceSystem) | Membuat layer dan membukanya untuk ditambahkan. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/#editlayer)(AbstractPath, DriverOptions) | Membuka lapisan untuk diedit. |
| [EditLayer](../../aspose.gis/filedriver/editlayer/#editlayer_1)(string, DriverOptions) | Membuka lapisan untuk diedit. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset)(AbstractPath) | Membuka kumpulan data. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset_2)(string) | Membuka kumpulan data. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset_1)(AbstractPath, DriverOptions) | Membuka kumpulan data. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset_3)(string, DriverOptions) | Membuka kumpulan data. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer)(AbstractPath) | Membuka lapisan untuk dibaca. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer_2)(string) | Membuka lapisan untuk dibaca. |
| abstract [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | Membuka lapisan untuk dibaca. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer_3)(string, DriverOptions) | Membuka lapisan untuk dibaca. |
| abstract [SupportsSpatialReferenceSystem](../../aspose.gis/filedriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | Menentukan, apakah sistem referensi spasial yang ditentukan didukung oleh driver. |

### Lihat juga

* class [Driver](../driver/)
* ruang nama [Aspose.Gis](../../aspose.gis/)
* perakitan [Aspose.GIS](../../)


