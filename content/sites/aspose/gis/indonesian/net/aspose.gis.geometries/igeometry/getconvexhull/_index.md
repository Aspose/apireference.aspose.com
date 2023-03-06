---
title: IGeometry.GetConvexHull
second_title: Aspose.GIS untuk Referensi .NET API
description: IGeometry metode. Menghitung convex hull dari geometri ini.
type: docs
weight: 220
url: /id/net/aspose.gis.geometries/igeometry/getconvexhull/
---
## IGeometry.GetConvexHull method

Menghitung convex hull dari geometri ini.

```csharp
public IGeometry GetConvexHull()
```

### Nilai Pengembalian

Geometri yang merepresentasikan lambung cembung dari geometri ini. Jika geometri ini tidak memiliki titik maka hasilnya adalah[`Null`](../../geometry/null/) . Jika geometri ini hanya memiliki satu titik maka hasilnya adalah titik ini. Jika geometri ini hanya memiliki dua titik maka hasilnya adalah[`ILineString`](../../ilinestring/) dengan titik-titik. Jika geometri ini memiliki tiga titik atau lebih maka hasilnya adalah[`ILinearRing`](../../ilinearring/) yang mewakili lambung cembung di sekitar semua titik geometri.

### Lihat juga

* interface [IGeometry](../)
* ruang nama [Aspose.Gis.Geometries](../../igeometry/)
* perakitan [Aspose.GIS](../../../)


