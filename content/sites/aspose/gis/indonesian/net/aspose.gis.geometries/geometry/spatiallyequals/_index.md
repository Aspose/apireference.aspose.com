---
title: Geometry.SpatiallyEquals
second_title: Aspose.GIS untuk Referensi .NET API
description: Geometry metode. Menentukan apakah geometri ini secara spasial sama dengan geometri yang ditentukan.
type: docs
weight: 370
url: /id/net/aspose.gis.geometries/geometry/spatiallyequals/
---
## Geometry.SpatiallyEquals method

Menentukan apakah geometri ini secara spasial sama dengan geometri yang ditentukan.

```csharp
public bool SpatiallyEquals(IGeometry other)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| other | IGeometry | Sebuah geometri. |

### Nilai Pengembalian

`true` jika geometri ini "spasial sama" dengan geometri yang ditentukan.`false` sebaliknya.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen adalah`null`. |
| ArgumentException | Salah satu geometri tidak valid sehingga operasi tidak dapat diselesaikan. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) geometri tidak setara. Anda dapat menggunakan[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) untuk mengonversi geometri ke sistem referensi spasial yang sama. |

### Perkataan

Metode ini menguji kesetaraan dalam hal matriks persimpangan DE-9IM. Itu tidak tergantung pada urutan komponen (misalnya urutan cincin interior dalam poligon), nilai Z dan M. Pada dasarnya, ini menguji bahwa dua geometri menempati "ruang" yang sama saat diproyeksikan pada ruang dua dimensi. Metode ini setara dengan: Lihat Spesifikasi Fitur Sederhana OpenGIS untuk detail lebih lanjut tentang DE-9IM.

```csharp
this.Relate(other, "T*F**FFF*");
```

### Lihat juga

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* ruang nama [Aspose.Gis.Geometries](../../geometry/)
* perakitan [Aspose.GIS](../../../)


