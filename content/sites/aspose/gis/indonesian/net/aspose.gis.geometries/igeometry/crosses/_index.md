---
title: IGeometry.Crosses
second_title: Aspose.GIS untuk Referensi .NET API
description: IGeometry metode. Menentukan apakah geometri ini dan geometri tertentu bersilangan.
type: docs
weight: 160
url: /id/net/aspose.gis.geometries/igeometry/crosses/
---
## IGeometry.Crosses method

Menentukan apakah geometri ini dan geometri tertentu bersilangan.

```csharp
public bool Crosses(IGeometry other)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| other | IGeometry | Sebuah geometri. |

### Nilai Pengembalian

`true` jika geometri ini "melintasi spasial" geometri lain.`false` sebaliknya.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen adalah`null`. |
| ArgumentException | Salah satu geometri tidak valid sehingga operasi tidak dapat diselesaikan. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) geometri tidak setara. Anda dapat menggunakan[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) untuk mengonversi geometri ke sistem referensi spasial yang sama. |

### Perkataan

Metode ini menguji apakah geometri bersilangan dalam matriks persimpangan DE-9IM. Dua geometri saling bersilangan jika mereka memiliki beberapa tetapi tidak semua titik interior yang sama dan dimensi persimpangan kurang dari dimensi setidaknya satu dari geometries. Yaitu: dua[`LineString`](../../linestring/) s silang, jika mereka membentuk huruf 'X', LineString dan a[`Polygon`](../../polygon/) silang jika LineString melewati bagian dalam Poligon. Lihat Spesifikasi Fitur Sederhana OpenGIS untuk detail lebih lanjut tentang DE-9IM dan relasi "spasial crosses".

### Lihat juga

* interface [IGeometry](../)
* ruang nama [Aspose.Gis.Geometries](../../igeometry/)
* perakitan [Aspose.GIS](../../../)


