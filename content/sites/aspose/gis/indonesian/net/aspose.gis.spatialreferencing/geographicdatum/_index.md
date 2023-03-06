---
title: Class GeographicDatum
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.SpatialReferencing.GeographicDatum kelas. Datum geografis menghubungkan garis bujur dan garis lintang dengan tempat tertentu di bumi.
type: docs
weight: 2120
url: /id/net/aspose.gis.spatialreferencing/geographicdatum/
---
## GeographicDatum class

Datum geografis menghubungkan garis bujur dan garis lintang dengan tempat tertentu di bumi.

```csharp
public class GeographicDatum : IdentifiableObject
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [GeographicDatum](geographicdatum/)(string, Ellipsoid, BursaWolfParameters, Identifier) | Membuat instance baru. |

## Properti

| Nama | Keterangan |
| --- | --- |
| static [Etrs89](../../aspose.gis.spatialreferencing/geographicdatum/etrs89/) { get; } | ETRS 89 datum. |
| static [Nad83](../../aspose.gis.spatialreferencing/geographicdatum/nad83/) { get; } | NAD 83 datum. |
| static [Osgb36](../../aspose.gis.spatialreferencing/geographicdatum/osgb36/) { get; } | OSGB 1936 datum. |
| static [Wgs72](../../aspose.gis.spatialreferencing/geographicdatum/wgs72/) { get; } | WGS 72 datum. |
| static [Wgs84](../../aspose.gis.spatialreferencing/geographicdatum/wgs84/) { get; } | WGS 84 datum. |
| [Ellipsoid](../../aspose.gis.spatialreferencing/geographicdatum/ellipsoid/) { get; } | Ellipsoid, digunakan dalam datum ini untuk mendekati Bumi. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Jika pengenal objek ini adalah pengenal EPSG - kembalikan kodenya. Jika tidak - kembalikan -1. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Pengidentifikasi objek yang dapat diidentifikasi ini. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Nama objek ini. |
| [ToWgs84Parameters](../../aspose.gis.spatialreferencing/geographicdatum/towgs84parameters/) { get; } | BursaWolfParamters yang dapat digunakan untuk mengubah koordinat pada datum ini menjadi koordinat pada datum WGS84. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [IsEquivalent](../../aspose.gis.spatialreferencing/geographicdatum/isequivalent/)(GeographicDatum) | Menentukan apakah dua datum ekuivalen. Koordinat yang sama dari datum ekuivalen cocok dengan tempat yang sama di Bumi. Beberapa parameter datum ekuivalen bisa berbeda, misalnya[`Name`](../identifiableobject/name/) . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Mengembalikan string yang mewakili objek saat ini. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/geographicdatum/isequivalent/)(GeographicDatum, GeographicDatum) | Menentukan apakah dua datum ekuivalen. Koordinat yang sama dari datum ekuivalen cocok dengan tempat yang sama di Bumi. Beberapa parameter datum ekuivalen bisa berbeda, misalnya[`Name`](../identifiableobject/name/) . |

### Lihat juga

* class [IdentifiableObject](../identifiableobject/)
* ruang nama [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* perakitan [Aspose.GIS](../../)


