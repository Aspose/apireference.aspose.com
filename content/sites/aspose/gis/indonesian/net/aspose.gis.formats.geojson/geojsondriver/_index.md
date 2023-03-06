---
title: Class GeoJsonDriver
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.Formats.GeoJson.GeoJsonDriver kelas. Driver untuk format GeoJSON.
type: docs
weight: 300
url: /id/net/aspose.gis.formats.geojson/geojsondriver/
---
## GeoJsonDriver class

Driver untuk format GeoJSON.

```csharp
public sealed class GeoJsonDriver : FileDriver
```

## Properti

| Nama | Keterangan |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.geojson/geojsondriver/cancreatedatasets/) { get; } | Mendapat nilai yang menunjukkan apakah driver ini dapat membuat kumpulan data. |
| override [CanCreateLayers](../../aspose.gis.formats.geojson/geojsondriver/cancreatelayers/) { get; } | Mendapat nilai yang menunjukkan apakah driver ini dapat membuat lapisan vektor. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets/) { get; } | Mendapat nilai yang menunjukkan apakah driver ini dapat membuka kumpulan data. |
| override [CanOpenLayers](../../aspose.gis.formats.geojson/geojsondriver/canopenlayers/) { get; } | Mendapat nilai yang menunjukkan apakah driver ini dapat membuka lapisan vektor. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath) | Membuat kumpulan data. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string) | Membuat kumpulan data. |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath, DriverOptions) | Membuat kumpulan data. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string, DriverOptions) | Membuat kumpulan data. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath) | Membuat layer dan membukanya untuk ditambahkan. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string) | Membuat layer dan membukanya untuk ditambahkan. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, DriverOptions) | Membuat layer dan membukanya untuk ditambahkan. |
| [CreateLayer](../../aspose.gis.formats.geojson/geojsondriver/createlayer/#createlayer_3)(AbstractPath, GeoJsonOptions) | Membuat layer dan membukanya untuk menambahkan fitur baru. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, SpatialReferenceSystem) | Membuat layer dan membukanya untuk ditambahkan. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions) | Membuat layer dan membukanya untuk ditambahkan. |
| [CreateLayer](../../aspose.gis.formats.geojson/geojsondriver/createlayer/#createlayer_9)(string, GeoJsonOptions) | Membuat layer dan membukanya untuk menambahkan fitur baru. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, SpatialReferenceSystem) | Membuat layer dan membukanya untuk ditambahkan. |
| override [CreateLayer](../../aspose.gis.formats.geojson/geojsondriver/createlayer/#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Membuat layer dan membukanya untuk menambahkan fitur baru. |
| [CreateLayer](../../aspose.gis.formats.geojson/geojsondriver/createlayer/#createlayer_4)(AbstractPath, GeoJsonOptions, SpatialReferenceSystem) | Membuat layer dan membukanya untuk menambahkan fitur baru. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions, SpatialReferenceSystem) | Membuat layer dan membukanya untuk ditambahkan. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/)(AbstractPath, DriverOptions) | Membuka lapisan untuk diedit. |
| [EditLayer](../../aspose.gis/filedriver/editlayer/)(string, DriverOptions) | Membuka lapisan untuk diedit. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath) | Membuka kumpulan data. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string) | Membuka kumpulan data. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath, DriverOptions) | Membuka kumpulan data. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string, DriverOptions) | Membuka kumpulan data. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(AbstractPath) | Membuka lapisan untuk dibaca. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string) | Membuka lapisan untuk dibaca. |
| override [OpenLayer](../../aspose.gis.formats.geojson/geojsondriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | Membuka lapisan untuk dibaca. |
| [OpenLayer](../../aspose.gis.formats.geojson/geojsondriver/openlayer/#openlayer_2)(AbstractPath, GeoJsonOptions) | Membuka lapisan untuk dibaca. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string, DriverOptions) | Membuka lapisan untuk dibaca. |
| [OpenLayer](../../aspose.gis.formats.geojson/geojsondriver/openlayer/#openlayer_5)(string, GeoJsonOptions) | Membuka lapisan untuk dibaca. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.geojson/geojsondriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | Menentukan, apakah sistem referensi spasial yang ditentukan didukung oleh driver. |

### Lihat juga

* class [FileDriver](../../aspose.gis/filedriver/)
* ruang nama [Aspose.Gis.Formats.GeoJson](../../aspose.gis.formats.geojson/)
* perakitan [Aspose.GIS](../../)


