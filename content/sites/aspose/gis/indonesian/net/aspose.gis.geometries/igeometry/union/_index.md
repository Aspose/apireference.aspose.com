---
title: IGeometry.Union
second_title: Aspose.GIS untuk Referensi .NET API
description: IGeometry metode. Menyatukan geometri ini dan geometri tertentu.
type: docs
weight: 370
url: /id/net/aspose.gis.geometries/igeometry/union/
---
## IGeometry.Union method

Menyatukan geometri ini dan geometri tertentu.

```csharp
public IGeometry Union(IGeometry other)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| other | IGeometry | Sebuah geometri untuk disatukan. |

### Nilai Pengembalian

Sebuah geometri yang mewakili kesatuan geometri ini dan sebuah argumen. Geometri hasil berisi kumpulan titik yang ada dalam geometri ini atau dalam argumen.

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


