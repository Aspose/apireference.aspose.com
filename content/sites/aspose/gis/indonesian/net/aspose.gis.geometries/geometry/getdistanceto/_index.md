---
title: Geometry.GetDistanceTo
second_title: Aspose.GIS untuk Referensi .NET API
description: Geometry metode. Menghitung jarak minimum antara geometri ini dan geometri tertentu.
type: docs
weight: 240
url: /id/net/aspose.gis.geometries/geometry/getdistanceto/
---
## Geometry.GetDistanceTo method

Menghitung jarak minimum antara geometri ini dan geometri tertentu.

```csharp
public double GetDistanceTo(IGeometry other)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| other | IGeometry | Sebuah geometri untuk menemukan jarak ke. |

### Nilai Pengembalian

Jika kedua geometri tidak[`IsEmpty`](../isempty/) - jarak antara titik terdekat geometri. Jika setidaknya satu geometri kosong -1 dikembalikan.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen adalah`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) geometri tidak setara. Anda dapat menggunakan[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) untuk mengonversi geometri ke sistem referensi spasial yang sama. |

### Lihat juga

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* ruang nama [Aspose.Gis.Geometries](../../geometry/)
* perakitan [Aspose.GIS](../../../)


