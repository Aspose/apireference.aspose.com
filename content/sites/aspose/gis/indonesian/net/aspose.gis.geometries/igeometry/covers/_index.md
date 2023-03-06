---
title: IGeometry.Covers
second_title: Aspose.GIS untuk Referensi .NET API
description: IGeometry metode. Menentukan apakah geometri ini mencakup geometri tertentu.
type: docs
weight: 150
url: /id/net/aspose.gis.geometries/igeometry/covers/
---
## IGeometry.Covers method

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
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) geometri tidak setara. Anda dapat menggunakan[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) untuk mengonversi geometri ke sistem referensi spasial yang sama. |

### Perkataan

Metode ini menguji apakah satu geometri mencakup geometri lainnya dalam bentuk matriks persimpangan DE-9IM. Satu geometri mencakup geometri lainnya, jika geometri berisi setiap titik dari geometri lain. Metode ini mirip dengan[`SpatiallyContains`](../spatiallycontains/) , tetapi kembali`true` lebih sering, karena tidak membedakan antara titik interior dan batas. Jadi, jika geometri A terletak pada batas geometri B,[`SpatiallyContains`](../spatiallycontains/) pengembalian`false` , saat metode ini kembali`true`. Metode ini setara dengan:

```csharp
this.Relate(other, "T*****FF*") || this.Relate(other, "*T****FF*") || this.Relate(other, "***T**FF*) || this.Relate(other, "***T*FF*");
```

### Lihat juga

* method [SpatiallyContains](../spatiallycontains/)
* method [CoveredBy](../coveredby/)
* interface [IGeometry](../)
* ruang nama [Aspose.Gis.Geometries](../../igeometry/)
* perakitan [Aspose.GIS](../../../)


