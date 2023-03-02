---
title: Geometry.SymDifference
second_title: Aspose.GIS untuk Referensi .NET API
description: Geometry metode. Membuat perbedaan simetris antara geometri ini dan geometri tertentu.
type: docs
weight: 380
url: /id/net/aspose.gis.geometries/geometry/symdifference/
---
## Geometry.SymDifference method

Membuat perbedaan simetris antara geometri ini dan geometri tertentu.

```csharp
public IGeometry SymDifference(IGeometry other)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| other | IGeometry | Sebuah geometri untuk menghitung perbedaan simetris dengan. |

### Nilai Pengembalian

Sebuah geometri yang merepresentasikan perbedaan simetris dari geometri ini dan sebuah argumen. Hasil geometri berisi kumpulan titik yang ada di salah satu geometri tetapi tidak ada di keduanya.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | *other* adalah`null`. |
| ArgumentException | Salah satu geometri tidak valid sehingga operasi tidak dapat diselesaikan. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) geometri tidak setara. Anda dapat menggunakan[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) untuk mengonversi geometri ke sistem referensi spasial yang sama. |

### Lihat juga

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* ruang nama [Aspose.Gis.Geometries](../../geometry/)
* perakitan [Aspose.GIS](../../../)


