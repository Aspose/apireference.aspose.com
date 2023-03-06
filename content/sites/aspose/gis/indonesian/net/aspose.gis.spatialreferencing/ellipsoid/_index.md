---
title: Class Ellipsoid
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.SpatialReferencing.Ellipsoid kelas. Ellipsoid mewakili ellipsoid yang mendekati bumi.
type: docs
weight: 2070
url: /id/net/aspose.gis.spatialreferencing/ellipsoid/
---
## Ellipsoid class

Ellipsoid mewakili ellipsoid, yang mendekati bumi.

```csharp
public class Ellipsoid : IdentifiableObject
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Ellipsoid](ellipsoid/)(string, double, double, Identifier) | Membuat Ellipsoid baru. |

## Properti

| Nama | Keterangan |
| --- | --- |
| static [Airy](../../aspose.gis.spatialreferencing/ellipsoid/airy/) { get; } | Ellipsoid lapang. |
| static [Grs80](../../aspose.gis.spatialreferencing/ellipsoid/grs80/) { get; } | GRS 1980 Elipsoid. |
| static [Wgs72](../../aspose.gis.spatialreferencing/ellipsoid/wgs72/) { get; } | WGS 72 Elipsoid. |
| static [Wgs84](../../aspose.gis.spatialreferencing/ellipsoid/wgs84/) { get; } | WGS 84 Elipsoid. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Jika pengenal objek ini adalah pengenal EPSG - kembalikan kodenya. Jika tidak - kembalikan -1. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Pengidentifikasi objek yang dapat diidentifikasi ini. |
| [InverseFlattening](../../aspose.gis.spatialreferencing/ellipsoid/inverseflattening/) { get; } | Pembalikan perataan ellipsoid. 0 jika ini adalah sebuah bola. |
| [IsSphere](../../aspose.gis.spatialreferencing/ellipsoid/issphere/) { get; } | Mendeteksi apakah ellipsoid ini berbentuk bola. |
| [IsValid](../../aspose.gis.spatialreferencing/ellipsoid/isvalid/) { get; } | Mendeteksi apakah ellipsoid valid: sumbu semi mayornya lebih dari 0 dan perataan terbaliknya positif atau sama dengan 0. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Nama objek ini. |
| [SemiMajorAxis](../../aspose.gis.spatialreferencing/ellipsoid/semimajoraxis/) { get; } | Sumbu semi mayor elipsoid. |
| [SemiMinorAxis](../../aspose.gis.spatialreferencing/ellipsoid/semiminoraxis/) { get; } | Sumbu semi minor elipsoid. Sama dengan sumbu semi mayor jika berbentuk bola. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [IsEquivalent](../../aspose.gis.spatialreferencing/ellipsoid/isequivalent/)(Ellipsoid) | Menentukan apakah dua ellipsoid setara. Jika ellipsoid A setara dengan ellipsoid B, maka keduanya memiliki sumbu semi mayor dan perataan terbalik yang sama. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Mengembalikan string yang mewakili objek saat ini. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/ellipsoid/isequivalent/)(Ellipsoid, Ellipsoid) | Menentukan apakah dua ellipsoid setara. Jika ellipsoid A setara dengan ellipsoid B, maka keduanya memiliki sumbu semi mayor dan perataan terbalik yang sama. |

### Lihat juga

* class [IdentifiableObject](../identifiableobject/)
* ruang nama [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* perakitan [Aspose.GIS](../../)


