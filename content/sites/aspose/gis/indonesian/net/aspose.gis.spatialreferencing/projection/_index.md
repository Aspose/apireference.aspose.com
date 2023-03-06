---
title: Class Projection
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.SpatialReferencing.Projection kelas. Merupakan metode proyeksi dengan parameter yang mengubah bujur lintang menjadi x y.
type: docs
weight: 2240
url: /id/net/aspose.gis.spatialreferencing/projection/
---
## Projection class

Merupakan metode proyeksi dengan parameter, yang mengubah (bujur, lintang) menjadi (x, y).

```csharp
public class Projection : IdentifiableObject
```

## Properti

| Nama | Keterangan |
| --- | --- |
| [AngularParametersUnit](../../aspose.gis.spatialreferencing/projection/angularparametersunit/) { get; } | Satuan yang digunakan untuk parameter sudut. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Jika pengenal objek ini adalah pengenal EPSG - kembalikan kodenya. Jika tidak - kembalikan -1. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Pengidentifikasi objek yang dapat diidentifikasi ini. |
| [LinearParametersUnit](../../aspose.gis.spatialreferencing/projection/linearparametersunit/) { get; } | Satuan yang digunakan untuk parameter linear. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Nama objek ini. |
| [ParametersNames](../../aspose.gis.spatialreferencing/projection/parametersnames/) { get; } | Mendapat kumpulan nama parameter yang dapat dihitung yang diberikan untuk proyeksi ini |

## Metode

| Nama | Keterangan |
| --- | --- |
| [GetParameterValue](../../aspose.gis.spatialreferencing/projection/getparametervalue/)(string, ParameterType) | Mendapat parameter dengan nama tertentu dari proyeksi ini. |
| [IsEquivalent](../../aspose.gis.spatialreferencing/projection/isequivalent/)(Projection) | Menentukan apakah dua proyeksi setara. Peta proyeksi setara (bujur, lintang) ke (x, y) dengan cara yang sama. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Mengembalikan string yang mewakili objek saat ini. |
| [TryGetParameterValue](../../aspose.gis.spatialreferencing/projection/trygetparametervalue/)(string, ParameterType) | Mendapat parameter dengan nama yang ditentukan dari proyeksi ini. Jika tidak ada parameter seperti itu - kembali`null` . |

### Lihat juga

* class [IdentifiableObject](../identifiableobject/)
* ruang nama [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* perakitan [Aspose.GIS](../../)


