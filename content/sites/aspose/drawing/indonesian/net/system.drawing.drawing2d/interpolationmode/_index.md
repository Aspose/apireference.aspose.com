---
title: Enum InterpolationMode
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.Drawing2D.InterpolationMode enum. Pencacahan InterpolationMode menentukan algoritme yang digunakan saat gambar diskalakan atau diputar.
type: docs
weight: 310
url: /id/net/system.drawing.drawing2d/interpolationmode/
---
## InterpolationMode enumeration

Pencacahan InterpolationMode menentukan algoritme yang digunakan saat gambar diskalakan atau diputar.

```csharp
public enum InterpolationMode
```

### Nilai

| Nama | Nilai | Keterangan |
| --- | --- | --- |
| Invalid | `-1` | Setara dengan elemen Invalid dari pencacahan QualityMode. |
| Default | `0` | Menentukan mode default. |
| Low | `1` | Menentukan interpolasi kualitas rendah. |
| High | `2` | Menentukan interpolasi berkualitas tinggi. |
| Bilinear | `3` | Menentukan interpolasi bilinear. Prefiltering tidak dilakukan. Mode ini tidak cocok untuk mengecilkan gambar di bawah 50 persen dari ukuran aslinya. |
| Bicubic | `4` | Menentukan interpolasi bicubic. Prefiltering tidak dilakukan. Mode ini tidak cocok untuk mengecilkan gambar di bawah 25 persen dari ukuran aslinya. |
| NearestNeighbor | `5` | Menentukan interpolasi tetangga terdekat. |
| HighQualityBilinear | `6` | Menentukan interpolasi bilinear berkualitas tinggi. Prefiltering dilakukan untuk memastikan penyusutan berkualitas tinggi. |
| HighQualityBicubic | `7` | Menentukan interpolasi bikubik berkualitas tinggi. Prefiltering dilakukan untuk memastikan penyusutan berkualitas tinggi. Mode ini menghasilkan gambar transformasi dengan kualitas tertinggi. |

### Lihat juga

* ruang nama [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* perakitan [Aspose.Drawing](../../)


