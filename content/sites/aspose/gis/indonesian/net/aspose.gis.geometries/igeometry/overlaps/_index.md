---
title: IGeometry.Overlaps
second_title: Aspose.GIS untuk Referensi .NET API
description: IGeometry metode. Menentukan apakah geometri ini tumpang tindih dengan geometri tertentu.
type: docs
weight: 280
url: /id/net/aspose.gis.geometries/igeometry/overlaps/
---
## IGeometry.Overlaps method

Menentukan apakah geometri ini tumpang tindih dengan geometri tertentu.

```csharp
public bool Overlaps(IGeometry other)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| other | IGeometry | Sebuah geometri. |

### Nilai Pengembalian

`true` jika geometri ini "tumpang tindih secara spasial" dengan geometri lain.`false` sebaliknya.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen adalah`null`. |
| ArgumentException | Salah satu geometri tidak valid sehingga operasi tidak dapat diselesaikan. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) geometri tidak setara. Anda dapat menggunakan[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) untuk mengonversi geometri ke sistem referensi spasial yang sama. |

### Perkataan

Metode ini menguji apakah geometri tumpang tindih dalam hal matriks persimpangan DE-9IM. Dua geometri tumpang tindih jika mereka memiliki beberapa tetapi tidak semua titik interior yang sama dan persimpangan geometri memiliki dimensi yang sama dengan geometri itu sendiri. Untuk duaPoint geometri atau duaSurface geometri metode ini setara dengan: Untuk duaLine geometri metode ini setara dengan: Untuk dua geometri dengan tidak sama[`Dimension`](../dimension/) metode ini selalu kembali`false`. Lihat Spesifikasi Fitur Sederhana OpenGIS untuk detail lebih lanjut tentang DE-9IM dan relasi "tumpang tindih spasial".

```csharp
this.Relate(other, "T*T***T**");
```

```csharp
this.Relate(other, "1*T***T**");
```

### Lihat juga

* interface [IGeometry](../)
* ruang nama [Aspose.Gis.Geometries](../../igeometry/)
* perakitan [Aspose.GIS](../../../)


