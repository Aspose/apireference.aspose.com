---
title: Geometry.GetConvexHull
second_title: Aspose.GIS untuk Referensi .NET API
description: Geometry metode. Menghitung convex hull dari geometri ini.
type: docs
weight: 230
url: /id/net/aspose.gis.geometries/geometry/getconvexhull/
---
## Geometry.GetConvexHull method

Menghitung convex hull dari geometri ini.

```csharp
public IGeometry GetConvexHull()
```

### Nilai Pengembalian

Geometri yang merepresentasikan lambung cembung dari geometri ini. Jika geometri ini tidak memiliki titik maka hasilnya adalah[`Null`](../null/) . Jika geometri ini hanya memiliki satu titik maka hasilnya adalah titik ini. Jika geometri ini hanya memiliki dua titik maka hasilnya adalah[`ILineString`](../../ilinestring/) dengan titik-titik. Jika geometri ini memiliki tiga titik atau lebih maka hasilnya adalah[`ILinearRing`](../../ilinearring/) yang mewakili lambung cembung di sekitar semua titik geometri.

### Lihat juga

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* ruang nama [Aspose.Gis.Geometries](../../geometry/)
* perakitan [Aspose.GIS](../../../)


