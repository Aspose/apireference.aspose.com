---
title: Enum ImageFlags
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.Imaging.ImageFlags enum. Menentukan atribut data piksel yang terdapat dalam sebuahImage obyek. Properti Bendera mengembalikan anggota pencacahan ini. Pencacahan ini memiliki atribut FlagsAttribute yang memungkinkan kombinasi bitwise dari nilai anggotanya.
type: docs
weight: 760
url: /id/net/system.drawing.imaging/imageflags/
---
## ImageFlags enumeration

Menentukan atribut data piksel yang terdapat dalam sebuah[`Image`](../../system.drawing/image/) obyek. Properti Bendera mengembalikan anggota pencacahan ini. Pencacahan ini memiliki atribut FlagsAttribute yang memungkinkan kombinasi bitwise dari nilai anggotanya.

```csharp
[Flags]
public enum ImageFlags
```

### Nilai

| Nama | Nilai | Keterangan |
| --- | --- | --- |
| None | `0` | Tidak ada informasi format |
| Scalable | `1` | Data piksel dapat diskalakan. |
| HasAlpha | `2` | Data piksel berisi informasi alfa. |
| HasTranslucent | `4` | Menentukan bahwa data piksel memiliki nilai alfa selain 0 (transparan) dan 255 (buram) |
| PartiallyScalable | `8` | Data piksel dapat diskalakan sebagian, tetapi ada beberapa batasan. |
| ColorSpaceRgb | `10` | Data piksel menggunakan ruang warna RGB. |
| ColorSpaceCmyk | `20` | Data piksel menggunakan ruang warna CMYK. |
| ColorSpaceGray | `40` | Data piksel berwarna abu-abu. |
| ColorSpaceYcbcr | `80` | Menentukan bahwa gambar disimpan menggunakan ruang warna YCBCR. |
| ColorSpaceYcck | `100` | Menentukan bahwa gambar disimpan menggunakan ruang warna YCCK. |
| HasRealDpi | `1000` | Menentukan bahwa informasi titik per inci disimpan dalam gambar. |
| HasRealPixelSize | `2000` | Menentukan bahwa ukuran piksel disimpan dalam gambar. |
| ReadOnly | `10000` | Data piksel bersifat hanya baca. |
| Caching | `20000` | Data piksel dapat di-cache untuk akses lebih cepat. |

### Lihat juga

* ruang nama [System.Drawing.Imaging](../../system.drawing.imaging/)
* perakitan [Aspose.Drawing](../../)


