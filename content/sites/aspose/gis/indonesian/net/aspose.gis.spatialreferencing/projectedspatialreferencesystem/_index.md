---
title: Class ProjectedSpatialReferenceSystem
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.SpatialReferencing.ProjectedSpatialReferenceSystem kelas. SRS yang diproyeksikan merupakan hasil penerapan proyeksi terhadap SRS geografis. SRS yang diproyeksikan dapat berupa SRS dua dimensi atau tiga dimensi. Jika SRS yang diproyeksikan adalah tiga dimensi maka sebenarnya SRS tersebut merupakan gabungan SRS dari SRS yang diproyeksikan dua dimensi dan vertikal satu dimensi SRS.
type: docs
weight: 2220
url: /id/net/aspose.gis.spatialreferencing/projectedspatialreferencesystem/
---
## ProjectedSpatialReferenceSystem class

SRS yang diproyeksikan merupakan hasil penerapan proyeksi terhadap SRS geografis. SRS yang diproyeksikan dapat berupa SRS dua dimensi atau tiga dimensi. Jika SRS yang diproyeksikan adalah tiga dimensi, maka sebenarnya SRS tersebut merupakan gabungan SRS dari SRS yang diproyeksikan dua dimensi dan vertikal satu dimensi SRS.

```csharp
public abstract class ProjectedSpatialReferenceSystem : SpatialReferenceSystem
```

## Properti

| Nama | Keterangan |
| --- | --- |
| abstract [AngularUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/angularunit/) { get; } | Satuan, yang digunakan untuk nilai sudut dalam SRS ini dan untuk parameter sudut[`Projection`](./projection/) . Cocok dengan satuan sudut dari[`Base`](./base/) . |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | Mengembalikan SRS ini dikonversi ke[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . Gunakan[`IsCompound`](../spatialreferencesystem/iscompound/) untuk mengetahui apakah konversi dimungkinkan. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Mengembalikan SRS ini dikonversi ke[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . Gunakan[`Type`](../spatialreferencesystem/type/) untuk mengetahui apakah konversi dimungkinkan. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | Mengembalikan SRS ini dikonversi ke[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . Gunakan[`Type`](../spatialreferencesystem/type/) untuk mengetahui apakah konversi dimungkinkan. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Mengembalikan SRS ini dikonversi ke[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . Gunakan[`Type`](../spatialreferencesystem/type/) untuk mengetahui apakah konversi dimungkinkan. |
| [AsProjected](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/asprojected/) { get; } | Kembalikan ini. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Mengembalikan SRS ini dikonversi ke[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . Gunakan[`Type`](../spatialreferencesystem/type/) untuk mengetahui apakah konversi dimungkinkan. |
| abstract [AxisesOrder](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/axisesorder/) { get; } | Urutan sumbu pada SRS ini. Jika SRS ini tidak valid dan arah sumbunya salah,Invalid dikembalikan. |
| abstract [Base](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/base/) { get; } | SRS Geografis yang mana[`Projection`](./projection/) diterapkan untuk mendapatkan SRS. ini |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/dimensionscount/) { get; } | Mengembalikan hitungan dimensi dalam SRS ini. Untuk SRS yang diproyeksikan ini dapat berupa: dua - jika ini adalah SRS yang diproyeksikan tunggal. tiga - jika ini adalah SRS majemuk, yang terdiri dari SRS tunggal, dua dimensi, yang diproyeksikan dan SRS vertikal, yang menambahkan dimensi ketiga. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Jika pengenal objek ini adalah pengenal EPSG - kembalikan kodenya. Jika tidak - kembalikan -1. |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum/) { get; } | Mengembalikan datum geografis dari SRS ini. |
| [HasGeographicDatum](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/hasgeographicdatum/) { get; } | Mengembalikan nilai true, karena SRS yang diproyeksikan selalu memiliki meridian prima. |
| [HasPrimeMeridian](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/hasprimemeridian/) { get; } | Mengembalikan nilai true, karena SRS yang diproyeksikan selalu memiliki meridian prima. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Pengidentifikasi objek yang dapat diidentifikasi ini. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | Mengembalikan apakah SRS ini majemuk (gabungan dari dua SRS). Kombinasi SRS berikut dalam SRS majemuk dianggap valid: SRS Geografis + SRS Vertikal, dalam hal ini jenis SRS majemuk akan menjadiGeographic . SRS Proyeksi + SRS Vertikal, dalam hal ini jenis SRS majemuk adalahProjected . Jika kombinasi SRS berbeda, jenis SRS majemuk akan menjadiUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Mengembalikan apakah SRS ini tunggal (bukan gabungan dari dua SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Sama seperti[`Validate`](../spatialreferencesystem/validate/) , tapi jangan kembalikan pesan kesalahan. |
| abstract [LinearUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/linearunit/) { get; } | Satuan, yang digunakan untuk dimensi linier di SRS ini dan untuk parameter linier dari[`Projection`](./projection/) . |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Nama objek ini. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian/) { get; } | Mengembalikan meridian utama dari SRS ini. |
| abstract [Projection](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/projection/) { get; } | Proyeksi, yang diterapkan[`Base`](./base/) untuk mendapatkan SRS. ini |
| [Type](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/type/) { get; } | PengembalianProjected . |

## Metode

| Nama | Keterangan |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Membuat transformasi dari ini`Sistem Referensi Spasial` ke yang lain`Sistem Referensi Spasial` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Mengembalikan representasi SRS ini sebagai string WKT. Hasil string WKT akan cocok dengan spesifikasi OGC 01-009, biasanya bernama "WKT1". |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis/)(int) | Dapatkan[`Axis`](../axis/) yang menjelaskan dimensi. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit/)(int) | Dapatkan[`Unit`](../unit/)dari dimensi. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Mendeteksi apakah SRS ini setara dengan SRS lainnya. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Mengembalikan string yang mewakili objek saat ini. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Membuat transformasi dari ini`Sistem Referensi Spasial` ke yang lain`Sistem Referensi Spasial` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate/)(out string) | Tentukan apakah SRS ini valid. |

### Lihat juga

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* ruang nama [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* perakitan [Aspose.GIS](../../)


