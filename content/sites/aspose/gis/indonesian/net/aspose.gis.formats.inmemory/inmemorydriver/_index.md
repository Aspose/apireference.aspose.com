---
title: Class InMemoryDriver
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.Formats.InMemory.InMemoryDriver kelas. Driver untuk bekerja dengan data di memori.
type: docs
weight: 380
url: /id/net/aspose.gis.formats.inmemory/inmemorydriver/
---
## InMemoryDriver class

Driver untuk bekerja dengan data di memori.

```csharp
public sealed class InMemoryDriver : FileDriver
```

## Properti

| Nama | Keterangan |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.inmemory/inmemorydriver/cancreatedatasets/) { get; } | Mendapat nilai yang menunjukkan apakah driver ini dapat membuat kumpulan data. |
| override [CanCreateLayers](../../aspose.gis.formats.inmemory/inmemorydriver/cancreatelayers/) { get; } | Mendapat nilai yang menunjukkan apakah driver ini dapat membuat lapisan vektor. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets/) { get; } | Mendapat nilai yang menunjukkan apakah driver ini dapat membuka kumpulan data. |
| override [CanOpenLayers](../../aspose.gis.formats.inmemory/inmemorydriver/canopenlayers/) { get; } | Mendapat nilai yang menunjukkan apakah driver ini dapat membuka lapisan vektor. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath) | Membuat kumpulan data. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string) | Membuat kumpulan data. |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath, DriverOptions) | Membuat kumpulan data. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string, DriverOptions) | Membuat kumpulan data. |
| [CreateLayer](../../aspose.gis.formats.inmemory/inmemorydriver/createlayer/#createlayer)() | Membuat layer dan membukanya untuk menambahkan fitur baru. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath) | Membuat layer dan membukanya untuk ditambahkan. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string) | Membuat layer dan membukanya untuk ditambahkan. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, DriverOptions) | Membuat layer dan membukanya untuk ditambahkan. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, SpatialReferenceSystem) | Membuat layer dan membukanya untuk ditambahkan. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions) | Membuat layer dan membukanya untuk ditambahkan. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, SpatialReferenceSystem) | Membuat layer dan membukanya untuk ditambahkan. |
| override [CreateLayer](../../aspose.gis.formats.inmemory/inmemorydriver/createlayer/#createlayer_3)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Membuat layer dan membukanya untuk menambahkan fitur baru. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions, SpatialReferenceSystem) | Membuat layer dan membukanya untuk ditambahkan. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/)(AbstractPath, DriverOptions) | Membuka lapisan untuk diedit. |
| [EditLayer](../../aspose.gis/filedriver/editlayer/)(string, DriverOptions) | Membuka lapisan untuk diedit. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath) | Membuka kumpulan data. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string) | Membuka kumpulan data. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath, DriverOptions) | Membuka kumpulan data. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string, DriverOptions) | Membuka kumpulan data. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(AbstractPath) | Membuka lapisan untuk dibaca. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string) | Membuka lapisan untuk dibaca. |
| override [OpenLayer](../../aspose.gis.formats.inmemory/inmemorydriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | Membuka lapisan untuk dibaca. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string, DriverOptions) | Membuka lapisan untuk dibaca. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.inmemory/inmemorydriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | Menentukan, apakah sistem referensi spasial yang ditentukan didukung oleh driver. |

### Lihat juga

* class [FileDriver](../../aspose.gis/filedriver/)
* ruang nama [Aspose.Gis.Formats.InMemory](../../aspose.gis.formats.inmemory/)
* perakitan [Aspose.GIS](../../)


