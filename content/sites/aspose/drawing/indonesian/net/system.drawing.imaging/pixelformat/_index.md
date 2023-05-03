---
title: Enum PixelFormat
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.Imaging.PixelFormat enum. Menentukan format data warna untuk setiap piksel pada gambar.
type: docs
weight: 850
url: /id/net/system.drawing.imaging/pixelformat/
---
## PixelFormat enumeration

Menentukan format data warna untuk setiap piksel pada gambar.

```csharp
public enum PixelFormat
```

### Nilai

| Nama | Nilai | Keterangan |
| --- | --- | --- |
| Indexed | `65536` | Data piksel berisi nilai indeks warna, yang berarti nilai tersebut adalah indeks warna dalam tabel warna sistem , bukan nilai warna individual. |
| Gdi | `131072` | Data piksel berisi warna GDI. |
| Alpha | `262144` | Data piksel berisi nilai alfa yang tidak dikalikan sebelumnya. |
| PAlpha | `524288` | Format piksel berisi nilai alfa yang telah dikalikan sebelumnya. |
| Extended | `1048576` | Nilai cadangan. |
| Canonical | `2097152` | Format piksel default 32 bit per piksel. Format menentukan kedalaman warna 24-bit dan saluran alfa 8-bit. |
| Undefined | `0` | Format piksel tidak ditentukan. |
| DontCare | `0` | Tidak ada format piksel yang ditentukan. |
| Format1bppIndexed | `196865` | Menentukan bahwa format piksel adalah 1 bit per piksel dan menggunakan warna yang diindeks. Oleh karena itu tabel warna memiliki dua warna di dalamnya. |
| Format4bppIndexed | `197634` | Menentukan bahwa formatnya adalah 4 bit per piksel, diindeks. |
| Format8bppIndexed | `198659` | Menentukan bahwa formatnya adalah 8 bit per piksel, diindeks. Oleh karena itu tabel warna memiliki 256 warna di dalamnya. |
| Format16bppGrayScale | `1052676` | Format piksel adalah 16 bit per piksel. Informasi warna menentukan 65536 nuansa abu-abu. |
| Format16bppRgb555 | `135173` | Menentukan bahwa formatnya adalah 16 bit per piksel; masing-masing 5 bit digunakan untuk komponen merah, hijau, dan biru. Sisa bit tidak digunakan. |
| Format16bppRgb565 | `135174` | Menentukan bahwa formatnya adalah 16 bit per piksel; 5 bit digunakan untuk komponen merah, 6 bit digunakan untuk komponen hijau, dan 5 bit digunakan untuk komponen biru. |
| Format16bppArgb1555 | `397319` | Format piksel adalah 16 bit per piksel. Informasi warna menentukan 32.768 corak warna, di antaranya 5 bit merah, 5 bit hijau, 5 bit biru, dan 1 bit alfa. |
| Format24bppRgb | `137224` | Menentukan bahwa formatnya adalah 24 bit per piksel; 8 bit masing-masing digunakan untuk komponen merah, hijau, dan biru. |
| Format32bppRgb | `139273` | Menentukan bahwa formatnya adalah 32 bit per piksel; Masing-masing 8 bit digunakan untuk komponen merah, hijau, dan biru. Sisa 8 bit tidak digunakan. |
| Format32bppArgb | `2498570` | Menentukan bahwa formatnya adalah 32 bit per piksel; 8 bit masing-masing digunakan untuk komponen alfa, merah, hijau, dan biru. |
| Format32bppPArgb | `925707` | Menentukan bahwa formatnya adalah 32 bit per piksel; Masing-masing 8 bit digunakan untuk komponen alfa, merah, hijau, dan biru. Komponen merah, hijau, dan biru dikalikan sebelumnya, sesuai dengan komponen alfa. |
| Format48bppRgb | `1060876` | Menentukan bahwa formatnya adalah 48 bit per piksel; Masing-masing 16 bit digunakan untuk komponen merah, hijau, dan biru. |
| Format64bppArgb | `3424269` | Menentukan bahwa formatnya adalah 64 bit per piksel; Masing-masing 16 bit digunakan untuk komponen alfa, merah, hijau, dan biru. |
| Format64bppPArgb | `1851406` | Menentukan bahwa formatnya adalah 64 bit per piksel; Masing-masing 16 bit digunakan untuk komponen alfa, merah, hijau, dan biru. Komponen merah, hijau, dan biru dikalikan sebelumnya sesuai dengan komponen alfa. |
| Max | `15` | Nilai maksimum untuk pencacahan ini. |

### Lihat juga

* ruang nama [System.Drawing.Imaging](../../system.drawing.imaging/)
* perakitan [Aspose.Drawing](../../)


