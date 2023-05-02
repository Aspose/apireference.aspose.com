---
title: Enum TextRenderingHint
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.Text.TextRenderingHint enum. Menentukan kualitas rendering teks.
type: docs
weight: 1250
url: /id/net/system.drawing.text/textrenderinghint/
---
## TextRenderingHint enumeration

Menentukan kualitas rendering teks.

```csharp
public enum TextRenderingHint
```

### Nilai

| Nama | Nilai | Keterangan |
| --- | --- | --- |
| SystemDefault | `0` | Setiap karakter digambar menggunakan bitmap mesin terbangnya, dengan petunjuk rendering default sistem. Teks akan digambar menggunakan pengaturan penghalusan font apa pun yang telah dipilih pengguna untuk sistem. |
| SingleBitPerPixelGridFit | `1` | Setiap karakter digambar menggunakan glyph bitmap-nya. Hinting digunakan untuk memperbaiki tampilan karakter pada batang dan lekukan. |
| SingleBitPerPixel | `2` | Setiap karakter digambar menggunakan bitmap mesin terbangnya. Petunjuk tidak digunakan. |
| AntiAliasGridFit | `3` | Setiap karakter digambar menggunakan bitmap mesin terbang antialias dengan petunjuk. Kualitas jauh lebih baik karena antialiasing, tetapi dengan biaya kinerja yang lebih tinggi. |
| AntiAlias | `4` | Setiap karakter digambar menggunakan bitmap mesin terbang antialiasnya tanpa petunjuk. Kualitas lebih baik karena antialiasing. Perbedaan lebar batang mungkin terlihat karena petunjuk dimatikan. |
| ClearTypeGridFit | `5` | Setiap karakter digambar menggunakan glyph ClearType bitmap dengan petunjuk. Pengaturan kualitas tertinggi. Digunakan untuk memanfaatkan fitur font ClearType. |

### Lihat juga

* ruang nama [System.Drawing.Text](../../system.drawing.text/)
* perakitan [Aspose.Drawing](../../)


