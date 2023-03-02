---
title: Class LocalSpatialReferenceSystem
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.SpatialReferencing.LocalSpatialReferenceSystem kelas. SRS lokal terkait koordinat ke beberapa objek bukan bumi.
type: docs
weight: 2180
url: /id/net/aspose.gis.spatialreferencing/localspatialreferencesystem/
---
## LocalSpatialReferenceSystem class

SRS lokal terkait koordinat ke beberapa objek, bukan bumi.

```csharp
public class LocalSpatialReferenceSystem : SpatialReferenceSystem
```

## Properti

| Nama | Keterangan |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | Mengembalikan SRS ini dikonversi ke[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . Gunakan[`IsCompound`](../spatialreferencesystem/iscompound/) untuk mengetahui apakah konversi dimungkinkan. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Mengembalikan SRS ini dikonversi ke[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . Gunakan[`Type`](../spatialreferencesystem/type/) untuk mengetahui apakah konversi dimungkinkan. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | Mengembalikan SRS ini dikonversi ke[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . Gunakan[`Type`](../spatialreferencesystem/type/) untuk mengetahui apakah konversi dimungkinkan. |
| override [AsLocal](../../aspose.gis.spatialreferencing/localspatialreferencesystem/aslocal/) { get; } | Kembalikan ini. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | Mengembalikan SRS ini dikonversi ke[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) . Gunakan[`Type`](../spatialreferencesystem/type/) untuk mengetahui apakah konversi dimungkinkan. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Mengembalikan SRS ini dikonversi ke[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . Gunakan[`Type`](../spatialreferencesystem/type/) untuk mengetahui apakah konversi dimungkinkan. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/localspatialreferencesystem/dimensionscount/) { get; } | Jumlah dimensi dalam SRS ini. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Jika pengenal objek ini adalah pengenal EPSG - kembalikan kodenya. Jika tidak - kembalikan -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/geographicdatum/) { get; } | MelemparInvalidOperationException karena SRS Lokal tidak memiliki datum geografis. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/hasgeographicdatum/) { get; } | Pengembalian`false` karena SRS Lokal tidak memiliki datum geografis. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/localspatialreferencesystem/hasprimemeridian/) { get; } | Pengembalian`false` , karena SRS Lokal tidak memiliki meridian prima. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Pengidentifikasi objek yang dapat diidentifikasi ini. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | Mengembalikan apakah SRS ini majemuk (gabungan dari dua SRS). Kombinasi SRS berikut dalam SRS majemuk dianggap valid: SRS Geografis + SRS Vertikal, dalam hal ini jenis SRS majemuk akan menjadiGeographic . SRS Proyeksi + SRS Vertikal, dalam hal ini jenis SRS majemuk adalahProjected . Jika kombinasi SRS berbeda, jenis SRS majemuk akan menjadiUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Mengembalikan apakah SRS ini tunggal (bukan gabungan dari dua SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Sama seperti[`Validate`](../spatialreferencesystem/validate/) , tapi jangan kembalikan pesan kesalahan. |
| [LocalDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/localdatum/) { get; } | Datum, yang menjelaskan metode pengukuran. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Nama objek ini. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/localspatialreferencesystem/primemeridian/) { get; } | MelemparInvalidOperationException , karena SRS Lokal tidak memiliki meridian prima. |
| override [Type](../../aspose.gis.spatialreferencing/localspatialreferencesystem/type/) { get; } | KembaliLocal . |
| [Unit](../../aspose.gis.spatialreferencing/localspatialreferencesystem/unit/) { get; } | Satuan dari SRS ini. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Membuat transformasi dari ini`Sistem Referensi Spasial` ke yang lain`Sistem Referensi Spasial` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Mengembalikan representasi SRS ini sebagai string WKT. Hasil string WKT akan cocok dengan spesifikasi OGC 01-009, biasanya bernama "WKT1". |
| override [GetAxis](../../aspose.gis.spatialreferencing/localspatialreferencesystem/getaxis/)(int) | Dapatkan[`Axis`](../axis/) yang menjelaskan dimensi. |
| override [GetUnit](../../aspose.gis.spatialreferencing/localspatialreferencesystem/getunit/)(int) | Dapatkan[`Unit`](./unit/)dari dimensi. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/localspatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Mendeteksi apakah SRS ini setara dengan SRS lainnya. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Mengembalikan string yang mewakili objek saat ini. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Membuat transformasi dari ini`Sistem Referensi Spasial` ke yang lain`Sistem Referensi Spasial` . |
| override [Validate](../../aspose.gis.spatialreferencing/localspatialreferencesystem/validate/)(out string) | Tentukan apakah SRS ini valid. Melihat[`Validate`](../spatialreferencesystem/validate/) untuk keterangan validitas. |

### Lihat juga

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* ruang nama [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* perakitan [Aspose.GIS](../../)


