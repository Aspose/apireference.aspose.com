---
title: IGeometry.SymDifference
second_title: Aspose.GIS untuk Referensi .NET API
description: IGeometry metode. Membuat perbedaan simetris antara geometri ini dan geometri tertentu.
type: docs
weight: 330
url: /id/net/aspose.gis.geometries/igeometry/symdifference/
---
## IGeometry.SymDifference method

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
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) geometri tidak setara. Anda dapat menggunakan[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) untuk mengonversi geometri ke sistem referensi spasial yang sama. |

### Lihat juga

* interface [IGeometry](../)
* ruang nama [Aspose.Gis.Geometries](../../igeometry/)
* perakitan [Aspose.GIS](../../../)


