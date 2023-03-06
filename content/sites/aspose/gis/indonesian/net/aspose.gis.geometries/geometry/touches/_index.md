---
title: Geometry.Touches
second_title: Aspose.GIS untuk Referensi .NET API
description: Geometry metode. Menentukan apakah geometri ini dan geometri tertentu bersentuhan.
type: docs
weight: 420
url: /id/net/aspose.gis.geometries/geometry/touches/
---
## Geometry.Touches method

Menentukan apakah geometri ini dan geometri tertentu bersentuhan.

```csharp
public bool Touches(IGeometry other)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| other | IGeometry | Sebuah geometri. |

### Nilai Pengembalian

`true` jika geometri ini "menyentuh spasial" geometri lain.`false` sebaliknya.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen adalah`null`. |
| ArgumentException | Salah satu geometri tidak valid sehingga operasi tidak dapat diselesaikan. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) geometri tidak setara. Anda dapat menggunakan[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) untuk mengonversi geometri ke sistem referensi spasial yang sama. |

### Perkataan

Metode ini menguji apakah geometri saling bersentuhan dalam matriks persimpangan DE-9IM. Dua geometri saling bersentuhan jika setidaknya memiliki satu titik batas yang sama, tetapi tidak memiliki titik interior. Yaitu: dua[`LineString`](../../linestring/)saling bersentuhan jika mereka berbagi titik akhir, tetapi tidak berbagi segmen, dua poligon saling bersentuhan jika mereka berbagi bagian cincin eksterior atau interior, tetapi interiornya tidak tumpang tindih. Metode ini setara dengan: Lihat Spesifikasi Fitur Sederhana OpenGIS untuk detail lebih lanjut tentang DE-9IM dan relasi "sentuhan spasial".

```csharp
this.Relate(other, "FT*******") || this.Relate(other, "F**T*****") || this.Relate(other, "F***T****");
```

### Lihat juga

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* ruang nama [Aspose.Gis.Geometries](../../geometry/)
* perakitan [Aspose.GIS](../../../)


