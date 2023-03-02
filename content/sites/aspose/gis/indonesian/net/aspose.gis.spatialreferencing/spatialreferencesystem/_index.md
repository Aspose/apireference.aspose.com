---
title: Class SpatialReferenceSystem
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.SpatialReferencing.SpatialReferenceSystem kelas. Koordinat peta sistem referensi spasial ke tempattempat di Bumi. Ada berbagai jenis SRS lihatType . Apalagi kalau tipe SRSnyaGeographic or Projected SRS bisa majemuk atau tunggal lihatIsCompound .
type: docs
weight: 2250
url: /id/net/aspose.gis.spatialreferencing/spatialreferencesystem/
---
## SpatialReferenceSystem class

Koordinat peta sistem referensi spasial ke tempat-tempat di Bumi. Ada berbagai jenis SRS, lihat[`Type`](./type/) . Apalagi kalau tipe SRS-nyaGeographic or Projected SRS bisa majemuk atau tunggal, lihat[`IsCompound`](./iscompound/) .

```csharp
public abstract class SpatialReferenceSystem : IdentifiableObject
```

## Properti

| Nama | Keterangan |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | Mengembalikan SRS ini dikonversi ke[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . Gunakan[`IsCompound`](./iscompound/) untuk mengetahui apakah konversi dimungkinkan. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Mengembalikan SRS ini dikonversi ke[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . Gunakan[`Type`](./type/) untuk mengetahui apakah konversi dimungkinkan. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | Mengembalikan SRS ini dikonversi ke[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . Gunakan[`Type`](./type/) untuk mengetahui apakah konversi dimungkinkan. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Mengembalikan SRS ini dikonversi ke[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . Gunakan[`Type`](./type/) untuk mengetahui apakah konversi dimungkinkan. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | Mengembalikan SRS ini dikonversi ke[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) . Gunakan[`Type`](./type/) untuk mengetahui apakah konversi dimungkinkan. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Mengembalikan SRS ini dikonversi ke[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . Gunakan[`Type`](./type/) untuk mengetahui apakah konversi dimungkinkan. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/spatialreferencesystem/dimensionscount/) { get; } | Mengembalikan jumlah dimensi dalam SRS ini. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Jika pengenal objek ini adalah pengenal EPSG - kembalikan kodenya. Jika tidak - kembalikan -1. |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum/) { get; } | Mengembalikan datum geografis dari SRS ini. |
| abstract [HasGeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/hasgeographicdatum/) { get; } | Menentukan apakah SRS ini memiliki datum geografis. Hal ini berlaku untuk setiap SRS geografis, terproyeksi, dan geosentris. |
| abstract [HasPrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/hasprimemeridian/) { get; } | Mengembalikan apakah SRS ini memiliki meridian utama. Hal ini berlaku untuk setiap SRS geografis, terproyeksi, dan geosentris. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Pengidentifikasi objek yang dapat diidentifikasi ini. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | Mengembalikan apakah SRS ini majemuk (gabungan dari dua SRS). Kombinasi SRS berikut dalam SRS majemuk dianggap valid: SRS Geografis + SRS Vertikal, dalam hal ini jenis SRS majemuk akan menjadiGeographic . SRS Proyeksi + SRS Vertikal, dalam hal ini jenis SRS majemuk adalahProjected . Jika kombinasi SRS berbeda, jenis SRS majemuk akan menjadiUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Mengembalikan apakah SRS ini tunggal (bukan gabungan dari dua SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Sama seperti[`Validate`](./validate/) , tapi jangan kembalikan pesan kesalahan. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Nama objek ini. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian/) { get; } | Mengembalikan meridian utama dari SRS ini. |
| abstract [Type](../../aspose.gis.spatialreferencing/spatialreferencesystem/type/) { get; } | Mendapat jenis SRS ini, lihat[`SpatialReferenceSystemType`](../spatialreferencesystemtype/) . |
| static [Etrs89](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89/) { get; } | ETRS 89 (EPSG:4258) sistem referensi spasial. |
| static [Etrs89LambertAzimuthalEqualArea](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89lambertazimuthalequalarea/) { get; } | ETRS 89 / ETRS Lambert Azimuthal Equal Area (EPSG:3035) sistem referensi spasial. |
| static [Etrs89LambertConformalConic](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89lambertconformalconic/) { get; } | ETRS 89 / Lambert Conformal Conic (EPSG:3034) sistem referensi spasial. |
| static [Nad83](../../aspose.gis.spatialreferencing/spatialreferencesystem/nad83/) { get; } | NAD 83 (EPSG:4269) sistem referensi spasial. |
| static [Osgb36](../../aspose.gis.spatialreferencing/spatialreferencesystem/osgb36/) { get; } | OSGB 36 (EPSG:4277) sistem referensi spasial. |
| static [Osgb36BritishNationalGrid](../../aspose.gis.spatialreferencing/spatialreferencesystem/osgb36britishnationalgrid/) { get; } | Sistem referensi spasial OSGB 36 / British National Grid (EPSG:27700). |
| static [WebMercator](../../aspose.gis.spatialreferencing/spatialreferencesystem/webmercator/) { get; } | Web Mercator (EPSG:3857) sistem referensi spasial. |
| static [Wgs72](../../aspose.gis.spatialreferencing/spatialreferencesystem/wgs72/) { get; } | WGS 72 (EPSG:4322) sistem referensi spasial. |
| static [Wgs84](../../aspose.gis.spatialreferencing/spatialreferencesystem/wgs84/) { get; } | WGS 84 (EPSG:4326) sistem referensi spasial. |

## Metode

| Nama | Keterangan |
| --- | --- |
| static [CreateFromEpsg](../../aspose.gis.spatialreferencing/spatialreferencesystem/createfromepsg/)(int) | Buat sistem referensi spasial berdasarkan kode EPSG yang ditentukan. |
| static [CreateFromWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/createfromwkt/)(string) | Membuat yang baru`Sistem Referensi Spasial` berdasarkan string WKT (Teks Terkenal). |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Membuat transformasi dari ini`Sistem Referensi Spasial` ke yang lain`Sistem Referensi Spasial` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Mengembalikan representasi SRS ini sebagai string WKT. Hasil string WKT akan cocok dengan spesifikasi OGC 01-009, biasanya bernama "WKT1". |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis/)(int) | Dapatkan[`Axis`](../axis/) yang menjelaskan dimensi. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit/)(int) | Dapatkan[`Unit`](../unit/)dari dimensi. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Mendeteksi apakah SRS ini setara dengan SRS lainnya. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Mengembalikan string yang mewakili objek saat ini. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Membuat transformasi dari ini`Sistem Referensi Spasial` ke yang lain`Sistem Referensi Spasial` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate/)(out string) | Tentukan apakah SRS ini valid. |
| static [CreateCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/createcompound/)(string, SpatialReferenceSystem, SpatialReferenceSystem, Identifier) | Buat gabungan SRS. |
| static [CreateGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/creategeocentric/)(GeocentricSpatialReferenceSystemParameters, Identifier) | Buat SRS geosentris dari parameter khusus. |
| static [CreateGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/creategeographic/)(GeographicSpatialReferenceSystemParameters, Identifier) | Membuat SRS geografis dari parameter khusus. |
| static [CreateLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/createlocal/)(string, LocalDatum, Unit, ICollection&lt;Axis&gt;, Identifier) | Buat SRS. lokal |
| static [CreateProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/createprojected/)(ProjectedSpatialReferenceSystemParameters, Identifier) | Membuat proyeksi SRS dari parameter khusus. |
| static [CreateVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/createvertical/)(string, VerticalDatum, Unit, Axis, Identifier) | Buat SRS vertikal. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem, SpatialReferenceSystem) | Menentukan apakah dua SRS setara. Koordinat yang sama dari SRS yang setara cocok dengan tempat yang sama di Bumi. Beberapa parameter SRS yang setara dapat berbeda, misalnya[`Name`](../identifiableobject/name/) . |
| static [TryCreateFromEpsg](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromepsg/)(int, out SpatialReferenceSystem) | Buat sistem referensi spasial berdasarkan kode EPSG yang ditentukan. |
| static [TryCreateFromWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromwkt/)(string, out SpatialReferenceSystem) | Membuat yang baru`Sistem Referensi Spasial` berdasarkan string WKT (Teks Terkenal). |

### Lihat juga

* class [IdentifiableObject](../identifiableobject/)
* ruang nama [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* perakitan [Aspose.GIS](../../)


