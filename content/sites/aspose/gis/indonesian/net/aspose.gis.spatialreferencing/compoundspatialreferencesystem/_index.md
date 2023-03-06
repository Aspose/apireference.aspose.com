---
title: Class CompoundSpatialReferenceSystem
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.SpatialReferencing.CompoundSpatialReferenceSystem kelas. SRS majemuk menyatukan dua SRS yang mendasarinya tidak ada yang bisa menjadi majemuk.
type: docs
weight: 2060
url: /id/net/aspose.gis.spatialreferencing/compoundspatialreferencesystem/
---
## CompoundSpatialReferenceSystem class

SRS majemuk menyatukan dua SRS yang mendasarinya, tidak ada yang bisa menjadi majemuk.

```csharp
public class CompoundSpatialReferenceSystem : SpatialReferenceSystem
```

## Properti

| Nama | Keterangan |
| --- | --- |
| override [AsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/ascompound/) { get; } | Kembalikan ini. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Mengembalikan SRS ini dikonversi ke[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . Gunakan[`Type`](../spatialreferencesystem/type/) untuk mengetahui apakah konversi dimungkinkan. |
| override [AsGeographic](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asgeographic/) { get; } | Mengembalikan representasi geografis dari SRS ini. Jika SRS majemuk ini benar-benar mewakili SRS geografis, hasilnya akan menjadi SRS geografis tiga dimensi (dengan dimensi bujur, lintang, tinggi). Kalau tidak, pengecualian akan dilemparkan. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Mengembalikan SRS ini dikonversi ke[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . Gunakan[`Type`](../spatialreferencesystem/type/) untuk mengetahui apakah konversi dimungkinkan. |
| override [AsProjected](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asprojected/) { get; } | Kembalikan representasi yang diproyeksikan dari SRS ini. Jika SRS majemuk ini benar-benar mewakili SRS yang diproyeksikan, hasilnya akan menjadi SRS yang diproyeksikan tiga dimensi (dengan X, Y, dimensi tinggi). Kalau tidak, pengecualian akan dilemparkan. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Mengembalikan SRS ini dikonversi ke[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . Gunakan[`Type`](../spatialreferencesystem/type/) untuk mengetahui apakah konversi dimungkinkan. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/dimensionscount/) { get; } | Jumlah dimensi. Untuk SRS majemuk ini adalah jumlah dari jumlah dimensi SRS yang mendasarinya. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Jika pengenal objek ini adalah pengenal EPSG - kembalikan kodenya. Jika tidak - kembalikan -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/geographicdatum/) { get; } | Mengembalikan datum geografis dari SRS ini. Jika keduanya[`Head`](./head/) Dan[`Tail`](./tail/) memiliki datum geografis - mengembalikan datum geografis head. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasgeographicdatum/) { get; } | SRS majemuk memiliki datum geografis jika salah satu SRS yang mendasarinya memiliki datum geografis. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasprimemeridian/) { get; } | SRS majemuk memiliki meridian prima jika salah satu SRS di bawahnya memiliki meridian prima. |
| [Head](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/head/) { get; } | SRS pertama yang mendasari. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Pengidentifikasi objek yang dapat diidentifikasi ini. |
| override [IsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/iscompound/) { get; } | Pengembalian`true` . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Mengembalikan apakah SRS ini tunggal (bukan gabungan dari dua SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Sama seperti[`Validate`](../spatialreferencesystem/validate/) , tapi jangan kembalikan pesan kesalahan. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Nama objek ini. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/primemeridian/) { get; } | Mengembalikan meridian utama dari SRS ini. Jika keduanya[`Head`](./head/) Dan[`Tail`](./tail/) memiliki meridian utama - mengembalikan meridian utama kepala. |
| [Tail](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/tail/) { get; } | SRS dasar kedua. |
| override [Type](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/type/) { get; } | Jenis SRS Senyawa ini. DapatGeographicif SRS Majemuk ini adalah kombinasi dari SRS geografis dan vertikal, atauProjected if Compound SRS ini adalah kombinasi dari SRS proyeksi dan vertikal. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Membuat transformasi dari ini`Sistem Referensi Spasial` ke yang lain`Sistem Referensi Spasial` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Mengembalikan representasi SRS ini sebagai string WKT. Hasil string WKT akan cocok dengan spesifikasi OGC 01-009, biasanya bernama "WKT1". |
| override [GetAxis](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getaxis/)(int) | Dapatkan[`Axis`](../axis/) yang menjelaskan dimensi. |
| override [GetUnit](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getunit/)(int) | Dapatkan[`Unit`](../unit/)dari dimensi. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Mendeteksi apakah SRS ini setara dengan SRS lainnya. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Mengembalikan string yang mewakili objek saat ini. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Membuat transformasi dari ini`Sistem Referensi Spasial` ke yang lain`Sistem Referensi Spasial` . |
| override [Validate](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/validate/)(out string) | Tentukan apakah SRS ini valid. Melihat[`Validate`](../spatialreferencesystem/validate/) untuk keterangan validitas. |

### Lihat juga

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* ruang nama [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* perakitan [Aspose.GIS](../../)


