---
title: GeoConvert.TryParsePointText
second_title: Aspose.GIS untuk Referensi .NET API
description: GeoConvert metode. Mengonversi string yang berisi koordinat ke objek IPoint. Nilai hasil menunjukkan apakah konversi berhasil atau gagal.
type: docs
weight: 30
url: /id/net/aspose.gis/geoconvert/tryparsepointtext/
---
## GeoConvert.TryParsePointText method

Mengonversi string yang berisi koordinat ke objek IPoint. Nilai hasil menunjukkan apakah konversi berhasil atau gagal.

```csharp
public static bool TryParsePointText(string text, out IPoint point)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| text | String | String yang berisi koordinat untuk dikonversi. String harus berisi koordinat lintang dan bujur. Koordinat harus dipisahkan dengan spasi putih, koma, atau titik koma. |
| point | IPoint& | Saat metode ini kembali, berisi objek IPoint dengan koordinat yang diuraikan, jika konversi berhasil, atau null jika konversi gagal. |

### Nilai Pengembalian

Benar jika teks berhasil diuraikan, jika tidak, Salah.

### Perkataan

Contoh: "80° 151°", "74°50,82', 172°08,21'", "80°;151°", "2CMB", "2CMB6682893142", "2C MB 66828 93142", "WMAQ12405535".

### Lihat juga

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [GeoConvert](../)
* ruang nama [Aspose.Gis](../../geoconvert/)
* perakitan [Aspose.GIS](../../../)


