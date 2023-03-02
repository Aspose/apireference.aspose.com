---
title: IGeometry.Difference
second_title: Aspose.GIS untuk Referensi .NET API
description: IGeometry metode. Mengurangi geometri tertentu dari geometri ini.
type: docs
weight: 170
url: /id/net/aspose.gis.geometries/igeometry/difference/
---
## IGeometry.Difference method

Mengurangi geometri tertentu dari geometri ini.

```csharp
public IGeometry Difference(IGeometry other)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| other | IGeometry | Sebuah geometri untuk dikurangi. |

### Nilai Pengembalian

Geometri yang mewakili perbedaan geometri ini dan argumen. Geometri hasil berisi set titik yang ada dalam geometri ini tetapi tidak ada dalam argumen.

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


