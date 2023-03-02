---
title: IGeometry.Intersection
second_title: Aspose.GIS untuk Referensi .NET API
description: IGeometry metode. Membangun persimpangan antara geometri ini dan geometri tertentu.
type: docs
weight: 260
url: /id/net/aspose.gis.geometries/igeometry/intersection/
---
## IGeometry.Intersection method

Membangun persimpangan antara geometri ini dan geometri tertentu.

```csharp
public IGeometry Intersection(IGeometry other)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| other | IGeometry | Sebuah geometri untuk menghitung persimpangan dengan. |

### Nilai Pengembalian

Geometri yang mewakili perpotongan geometri ini dan argumen. Geometri hasil berisi set titik yang ada di geometri ini dan argumen.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | *other* adalah`null`. |
| ArgumentException | Salah satu geometri tidak valid sehingga operasi tidak dapat diselesaikan. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) geometri tidak setara. Anda dapat menggunakan[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) untuk mengonversi geometri ke sistem referensi spasial yang sama. |

### Lihat juga

* interface [IGeometry](../)
* ruang nama [Aspose.Gis.Geometries](../../igeometry/)
* perakitan [Aspose.GIS](../../../)


