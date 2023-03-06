---
title: IGeometry.CoveredBy
second_title: Aspose.GIS untuk Referensi .NET API
description: IGeometry metode. Menentukan apakah geometri ini tercakup oleh geometri tertentu.
type: docs
weight: 140
url: /id/net/aspose.gis.geometries/igeometry/coveredby/
---
## IGeometry.CoveredBy method

Menentukan apakah geometri ini tercakup oleh geometri tertentu.

```csharp
public bool CoveredBy(IGeometry other)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| other | IGeometry | Sebuah geometri. |

### Nilai Pengembalian

`true`jika geometri ini "ditutupi secara spasial oleh" geometri lain.`false` sebaliknya.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen adalah`null`. |
| ArgumentException | Salah satu geometri tidak valid sehingga operasi tidak dapat diselesaikan. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) geometri tidak setara. Anda dapat menggunakan[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) untuk mengonversi geometri ke sistem referensi spasial yang sama. |

### Perkataan

Metode ini menguji apakah satu geometri tercakup oleh yang lain dalam hal matriks persimpangan DE-9IM. Metode ini setara dengan:

```csharp
other.Covers(this);
```

### Lihat juga

* method [SpatiallyContains](../spatiallycontains/)
* method [Covers](../covers/)
* interface [IGeometry](../)
* ruang nama [Aspose.Gis.Geometries](../../igeometry/)
* perakitan [Aspose.GIS](../../../)


