---
title: Geometry.Covers
second_title: Aspose.GIS untuk Referensi .NET API
description: Geometry metode. Menentukan apakah geometri ini mencakup geometri tertentu.
type: docs
weight: 160
url: /id/net/aspose.gis.geometries/geometry/covers/
---
## Geometry.Covers method

Menentukan apakah geometri ini mencakup geometri tertentu.

```csharp
public bool Covers(IGeometry other)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| other | IGeometry | Sebuah geometri. |

### Nilai Pengembalian

`true` jika geometri ini "mencakup spasial" geometri lain.`false` sebaliknya.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen adalah`null`. |
| ArgumentException | Salah satu geometri tidak valid sehingga operasi tidak dapat diselesaikan. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) geometri tidak setara. Anda dapat menggunakan[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) untuk mengonversi geometri ke sistem referensi spasial yang sama. |

### Perkataan

Metode ini menguji apakah satu geometri mencakup geometri lainnya dalam bentuk matriks persimpangan DE-9IM. Satu geometri mencakup geometri lainnya, jika geometri berisi setiap titik dari geometri lain. Metode ini mirip dengan[`SpatiallyContains`](../../igeometry/spatiallycontains/) , tetapi kembali`true` lebih sering, karena tidak membedakan antara titik interior dan batas. Jadi, jika geometri A terletak pada batas geometri B,[`SpatiallyContains`](../../igeometry/spatiallycontains/) pengembalian`false` , saat metode ini kembali`true`. Metode ini setara dengan:

```csharp
this.Relate(other, "T*****FF*") || this.Relate(other, "*T****FF*") || this.Relate(other, "***T**FF*) || this.Relate(other, "***T*FF*");
```

### Lihat juga

* method [SpatiallyContains](../../igeometry/spatiallycontains/)
* method [CoveredBy](../../igeometry/coveredby/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* ruang nama [Aspose.Gis.Geometries](../../geometry/)
* perakitan [Aspose.GIS](../../../)


