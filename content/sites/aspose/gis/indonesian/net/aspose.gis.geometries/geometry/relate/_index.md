---
title: Geometry.Relate
second_title: Aspose.GIS untuk Referensi .NET API
description: Geometry metode. Menentukan apakah matriks persimpangan DE9IM dari geometri ini dan geometri tertentu cocok dengan pola yang diberikan.
type: docs
weight: 300
url: /id/net/aspose.gis.geometries/geometry/relate/
---
## Geometry.Relate method

Menentukan apakah matriks persimpangan DE-9IM dari geometri ini dan geometri tertentu cocok dengan pola yang diberikan.

```csharp
public bool Relate(IGeometry other, string intersectionPatternMatrix)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| other | IGeometry | Sebuah geometri. |
| intersectionPatternMatrix | String | Derai untuk dicocokkan. Ini harus berupa string dengan panjang sama dengan 9. Setiap karakter string mewakili dimensi yang diharapkan dari sebuah persimpangan: karakter 0 - antara interior geometri.karakter 1 - antara interior geometri ini dan batas geometri lain.karakter 2 - antara interior geometri ini dan eksterior geometri lain.karakter 3 - antara batas geometri ini dan bagian dalam geometri lain.karakter 4 - antara batas geometri.karakter 5 - antara batas geometri ini dan bagian luar geometri lain.karakter 6 - antara bagian luar geometri ini dan bagian dalam geometri lain.karakter 7 - antara bagian luar geometri ini dan batas geometri lain.karakter 8 - antara eksterior geometri. Nilai yang mungkin dari setiap karakter adalah: * - nilai apa pun;F - tidak ada persimpangan;T - persimpangan apa pun;0 - persimpangan titik (misalnya titik bersama);1 - persimpangan garis (mis. segmen garis yang dibagi);2 - persimpangan area (misalnya bagian poligon yang dibagi); Misalnya, pola persimpangan "F0******" berarti, tidak boleh ada persimpangan antara interior geometris dan persimpangan antara batas geometri harus berupa titik. Lihat Spesifikasi Fitur Sederhana OpenGIS untuk detail lebih lanjut tentang matriks persimpangan pola. |

### Nilai Pengembalian

`true` jika matriks persimpangan ini cocok dengan derai;`false` sebaliknya.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | *other* adalah`null`. |
| ArgumentException | Salah satu geometri tidak valid sehingga operasi tidak dapat diselesaikan. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) geometri tidak setara. Anda dapat menggunakan[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) untuk mengonversi geometri ke sistem referensi spasial yang sama. |

### Perkataan

Metode ini membangun matriks persimpangan DE-9IM dan mencocokkannya dengan pola Lihat Spesifikasi Fitur Sederhana OpenGIS untuk detail lebih lanjut tentang matriks persimpangan DE-9IM.

### Contoh

Kode berikut:  akan mendeteksi apakah geometri sama secara spasial.

```csharp
geometry.Relate(other, "T*F**FFF*");
```

### Lihat juga

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* ruang nama [Aspose.Gis.Geometries](../../geometry/)
* perakitan [Aspose.GIS](../../../)


