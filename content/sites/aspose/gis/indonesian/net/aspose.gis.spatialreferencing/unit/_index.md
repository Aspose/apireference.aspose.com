---
title: Class Unit
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.SpatialReferencing.Unit kelas. Mewakili satuan pengukuran.
type: docs
weight: 2290
url: /id/net/aspose.gis.spatialreferencing/unit/
---
## Unit class

Mewakili satuan pengukuran.

```csharp
public class Unit : IdentifiableObject
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Unit](unit/)(string, double, Identifier) | Buat instance baru. |

## Properti

| Nama | Keterangan |
| --- | --- |
| static [Degree](../../aspose.gis.spatialreferencing/unit/degree/) { get; } | Dapatkan Unit yang mewakili derajat. |
| static [Meter](../../aspose.gis.spatialreferencing/unit/meter/) { get; } | Dapatkan Satuan yang mewakili meter. |
| static [Radian](../../aspose.gis.spatialreferencing/unit/radian/) { get; } | Dapatkan Unit yang mewakili radian. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Jika pengenal objek ini adalah pengenal EPSG - kembalikan kodenya. Jika tidak - kembalikan -1. |
| [Factor](../../aspose.gis.spatialreferencing/unit/factor/) { get; } | Faktor ke meter, jika ini adalah satuan panjang, faktorkan ke radian, jika ini adalah satuan sudut. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Pengidentifikasi objek yang dapat diidentifikasi ini. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Nama objek ini. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [Apply](../../aspose.gis.spatialreferencing/unit/apply/)(double) | Mengonversi argumen menjadi unit, dijelaskan oleh instance ini. |
| [Deapply](../../aspose.gis.spatialreferencing/unit/deapply/)(double) | Mengonversi argumen dari unit, yang dijelaskan oleh instance ini, menjadi radian atau meter. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Mengembalikan string yang mewakili objek saat ini. |

### Lihat juga

* class [IdentifiableObject](../identifiableobject/)
* ruang nama [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* perakitan [Aspose.GIS](../../)


