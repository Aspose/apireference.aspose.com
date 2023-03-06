---
title: Class GeocentricSpatialReferenceSystem
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.SpatialReferencing.GeocentricSpatialReferenceSystem kelas. SRS geosentris adalah SRS kartesian 3 dimensi yang berasal dari pusat bumi.
type: docs
weight: 2090
url: /id/net/aspose.gis.spatialreferencing/geocentricspatialreferencesystem/
---
## GeocentricSpatialReferenceSystem class

SRS geosentris adalah SRS kartesian 3 dimensi yang berasal dari pusat bumi.

```csharp
public class GeocentricSpatialReferenceSystem : SpatialReferenceSystem
```

## Properti

| Nama | Keterangan |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | Mengembalikan SRS ini dikonversi ke[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . Gunakan[`IsCompound`](../spatialreferencesystem/iscompound/) untuk mengetahui apakah konversi dimungkinkan. |
| override [AsGeocentric](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/asgeocentric/) { get; } | Kembalikan ini. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | Mengembalikan SRS ini dikonversi ke[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . Gunakan[`Type`](../spatialreferencesystem/type/) untuk mengetahui apakah konversi dimungkinkan. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Mengembalikan SRS ini dikonversi ke[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . Gunakan[`Type`](../spatialreferencesystem/type/) untuk mengetahui apakah konversi dimungkinkan. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | Mengembalikan SRS ini dikonversi ke[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) . Gunakan[`Type`](../spatialreferencesystem/type/) untuk mengetahui apakah konversi dimungkinkan. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Mengembalikan SRS ini dikonversi ke[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . Gunakan[`Type`](../spatialreferencesystem/type/) untuk mengetahui apakah konversi dimungkinkan. |
| [AxisesOrder](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/axisesorder/) { get; } | Urutan sumbu pada SRS ini. Jika SRS ini tidak valid dan arah sumbunya salah,Invalid dikembalikan. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/dimensionscount/) { get; } | Mengembalikan 3, karena SRS geosentris selalu tiga dimensi. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Jika pengenal objek ini adalah pengenal EPSG - kembalikan kodenya. Jika tidak - kembalikan -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/geographicdatum/) { get; } | Mengembalikan datum geografis SRS ini. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/hasgeographicdatum/) { get; } | Kembali`true` , karena SRS geosentris selalu memiliki datum geografis. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/hasprimemeridian/) { get; } | Kembali`true` , karena SRS geosentris selalu memiliki meridian utama. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Pengidentifikasi objek yang dapat diidentifikasi ini. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | Mengembalikan apakah SRS ini majemuk (gabungan dari dua SRS). Kombinasi SRS berikut dalam SRS majemuk dianggap valid: SRS Geografis + SRS Vertikal, dalam hal ini jenis SRS majemuk akan menjadiGeographic . SRS Proyeksi + SRS Vertikal, dalam hal ini jenis SRS majemuk adalahProjected . Jika kombinasi SRS berbeda, jenis SRS majemuk akan menjadiUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Mengembalikan apakah SRS ini tunggal (bukan gabungan dari dua SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Sama seperti[`Validate`](../spatialreferencesystem/validate/) , tapi jangan kembalikan pesan kesalahan. |
| [LinearUnit](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/linearunit/) { get; } | Satuan, digunakan dalam SRS ini. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Nama objek ini. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/primemeridian/) { get; } | Mengembalikan meridian utama SRS ini. |
| override [Type](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/type/) { get; } | KembaliGeocentric . |

## Metode

| Nama | Keterangan |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Membuat transformasi dari ini`Sistem Referensi Spasial` ke yang lain`Sistem Referensi Spasial` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Mengembalikan representasi SRS ini sebagai string WKT. Hasil string WKT akan cocok dengan spesifikasi OGC 01-009, biasanya bernama "WKT1". |
| override [GetAxis](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/getaxis/)(int) | Dapatkan[`Axis`](../axis/) yang menjelaskan dimensi. |
| override [GetUnit](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/getunit/)(int) | Dapatkan[`Unit`](../unit/)dari dimensi. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Mendeteksi apakah SRS ini setara dengan SRS lainnya. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Mengembalikan string yang mewakili objek saat ini. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Membuat transformasi dari ini`Sistem Referensi Spasial` ke yang lain`Sistem Referensi Spasial` . |
| override [Validate](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/validate/)(out string) | Tentukan apakah SRS ini valid. Melihat[`Validate`](../spatialreferencesystem/validate/) untuk keterangan validitas. |

### Lihat juga

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* ruang nama [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* perakitan [Aspose.GIS](../../)


