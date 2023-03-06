---
title: GeoConvert.ParsePointText
second_title: Aspose.GIS untuk Referensi .NET API
description: GeoConvert metode. Mengonversi string yang berisi koordinat ke objek IPoint.
type: docs
weight: 20
url: /id/net/aspose.gis/geoconvert/parsepointtext/
---
## GeoConvert.ParsePointText method

Mengonversi string yang berisi koordinat ke objek IPoint.

```csharp
public static IPoint ParsePointText(string text)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| text | String | String yang berisi koordinat untuk dikonversi. String harus berisi koordinat lintang dan bujur. Koordinat harus dipisahkan dengan spasi putih, koma, atau titik koma. |

### Nilai Pengembalian

Objek IPoint dengan koordinat yang setara dengan string input.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| [GisException](../../gisexception/) |  |

### Perkataan

Contoh: "80° 151°", "74°50,82', 172°08,21'", "80°;151°", "2CMB", "2CMB6682893142", "2C MB 66828 93142", "WMAQ12405535".

### Lihat juga

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [GeoConvert](../)
* ruang nama [Aspose.Gis](../../geoconvert/)
* perakitan [Aspose.GIS](../../../)


