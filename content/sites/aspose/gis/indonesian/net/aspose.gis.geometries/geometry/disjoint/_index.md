---
title: Geometry.Disjoint
second_title: Aspose.GIS untuk Referensi .NET API
description: Geometry metode. Menentukan apakah geometri ini terpisah dari geometri tertentu.
type: docs
weight: 190
url: /id/net/aspose.gis.geometries/geometry/disjoint/
---
## Geometry.Disjoint method

Menentukan apakah geometri ini terpisah dari geometri tertentu.

```csharp
public bool Disjoint(IGeometry other)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| other | IGeometry | Sebuah geometri. |

### Nilai Pengembalian

`true` jika geometri ini "terpisah secara spasial" dari geometri lain.`false` sebaliknya.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen adalah`null`. |
| ArgumentException | Salah satu geometri tidak valid sehingga operasi tidak dapat diselesaikan. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) geometri tidak setara. Anda dapat menggunakan[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) untuk mengonversi geometri ke sistem referensi spasial yang sama. |

### Perkataan

Metode ini menguji apakah geometri terlepas dalam matriks persimpangan DE-9IM. Pada dasarnya, ini menguji bahwa dua geometri tidak memiliki titik persekutuan. Metode ini setara dengan: Lihat Spesifikasi Fitur Sederhana OpenGIS untuk detail lebih lanjut tentang DE-9IM.

```csharp
this.Relate(other, "FF*FF****");
```

### Lihat juga

* method [Intersects](../../igeometry/intersects/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* ruang nama [Aspose.Gis.Geometries](../../geometry/)
* perakitan [Aspose.GIS](../../../)


