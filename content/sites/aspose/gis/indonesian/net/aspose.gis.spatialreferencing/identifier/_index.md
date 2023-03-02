---
title: Class Identifier
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.SpatialReferencing.Identifier kelas. Mewakili pengenal  referensi untuk deskripsi eksternal suatu objek. Jika Anda membuat SRS dari WKTIdentifier sesuai dengan kata kunci AUTHORITY.
type: docs
weight: 2160
url: /id/net/aspose.gis.spatialreferencing/identifier/
---
## Identifier class

Mewakili pengenal - referensi untuk deskripsi eksternal suatu objek. Jika Anda membuat SRS dari WKT,`Identifier` sesuai dengan kata kunci "AUTHORITY".

```csharp
public class Identifier : IEquatable<Identifier>
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Identifier](identifier/)(string, string) | Buat instance baru. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [AuthorityName](../../aspose.gis.spatialreferencing/identifier/authorityname/) { get; } | Nama otoritas, yang memberikan[`AuthorityUniqueIdentifier`](./authorityuniqueidentifier/) . |
| [AuthorityUniqueIdentifier](../../aspose.gis.spatialreferencing/identifier/authorityuniqueidentifier/) { get; } | Cara unik untuk merepresentasikan objek dalam a[`AuthorityName`](./authorityname/) . |

## Metode

| Nama | Keterangan |
| --- | --- |
| static [Epsg](../../aspose.gis.spatialreferencing/identifier/epsg/)(int) | Membuat Pengenal baru yang mewakili pengenal EPSG dengan kode*epsgCode* . |
| [Equals](../../aspose.gis.spatialreferencing/identifier/equals/#equals)(Identifier) | Menunjukkan apakah objek saat ini sama dengan objek lain dari tipe yang sama. |
| override [Equals](../../aspose.gis.spatialreferencing/identifier/equals/#equals_1)(object) | Menentukan apakah objek yang ditentukan sama dengan objek saat ini. |
| [GetEpsgCode](../../aspose.gis.spatialreferencing/identifier/getepsgcode/)() | Jika objek ini mewakili pengidentifikasi EPSG yang valid (misalnya - nama otoritas adalah "EPSG" dan pengidentifikasi unik otoritas adalah bilangan bulat) - mengembalikannya. Jika tidak - kembalikan -1. |
| override [GetHashCode](../../aspose.gis.spatialreferencing/identifier/gethashcode/)() | Berfungsi sebagai fungsi hash default. |
| [operator ==](../../aspose.gis.spatialreferencing/identifier/op_equality/) | Menerapkan operator ==. |
| [operator !=](../../aspose.gis.spatialreferencing/identifier/op_inequality/) | Menerapkan operator !=. |

### Contoh

WGS 84 Sistem referensi spasial memiliki kode EPSG 4326, sehingga mungkin berisi pengenal: WGS 84 Ellipsoid memiliki kode EPSG 7030, dan mungkin berisi pengenal:

```csharp
new  {  = "EPSG",  = 4326 };
```

```csharp
new  {  = "EPSG",  = 7030 };
```

### Lihat juga

* ruang nama [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* perakitan [Aspose.GIS](../../)


