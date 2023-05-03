---
title: Class ImageAttributes
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.Imaging.ImageAttributes kelas. Berisi informasi tentang bagaimana warna bitmap dan metafile dimanipulasi selama rendering.
type: docs
weight: 740
url: /id/net/system.drawing.imaging/imageattributes/
---
## ImageAttributes class

Berisi informasi tentang bagaimana warna bitmap dan metafile dimanipulasi selama rendering.

```csharp
public sealed class ImageAttributes : ICloneable, IDisposable
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [ImageAttributes](imageattributes/)() | Menginisialisasi instance baru dari`ImageAttributes` kelas. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [ClearBrushRemapTable](../../system.drawing.imaging/imageattributes/clearbrushremaptable/)() | Menghapus tabel remap warna kuas iniImageAttributes objek. |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey/#clearcolorkey)() | Menghapus kunci warna (rentang transparansi) untuk kategori default. |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey/#clearcolorkey_1)(ColorAdjustType) | Menghapus kunci warna (rentang transparansi) untuk kategori tertentu. |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix/#clearcolormatrix)() | Menghapus matriks penyesuaian warna untuk kategori default. |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix/#clearcolormatrix_1)(ColorAdjustType) | Menghapus matriks penyesuaian warna untuk kategori tertentu. |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma/#cleargamma)() | Menonaktifkan koreksi gamma untuk kategori default. |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma/#cleargamma_1)(ColorAdjustType) | Menonaktifkan koreksi gamma untuk kategori tertentu. |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop/#clearnoop)() | Menghapus pengaturan NoOp untuk kategori default. |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop/#clearnoop_1)(ColorAdjustType) | Menghapus pengaturan NoOp untuk kategori tertentu. |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel/#clearoutputchannel)() | Menghapus pengaturan saluran output CMYK (cyan-magenta-kuning-hitam) untuk kategori default. |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel/#clearoutputchannel_1)(ColorAdjustType) | Menghapus pengaturan saluran keluaran (cyan-magenta-kuning-hitam) untuk kategori tertentu. |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile/#clearoutputchannelcolorprofile)() | Menghapus pengaturan profil warna saluran keluaran untuk kategori default. |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile/#clearoutputchannelcolorprofile_1)(ColorAdjustType) | Menghapus pengaturan profil warna saluran keluaran untuk kategori tertentu. |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable/#clearremaptable)() | Menghapus tabel remap warna untuk kategori default. |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable/#clearremaptable_1)(ColorAdjustType) | Menghapus tabel remap warna untuk kategori tertentu. |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold/#clearthreshold)() | Menghapus nilai ambang untuk kategori default. |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold/#clearthreshold_1)(ColorAdjustType) | Menghapus nilai ambang untuk kategori tertentu. |
| [Clone](../../system.drawing.imaging/imageattributes/clone/)() | Membuat salinan persis dari iniImageAttributes objek. |
| [Dispose](../../system.drawing.imaging/imageattributes/dispose/)() | Merilis semua sumber daya yang digunakan oleh iniImageAttributes objek. |
| [GetAdjustedPalette](../../system.drawing.imaging/imageattributes/getadjustedpalette/)(ColorPalette, ColorAdjustType) | Menyesuaikan warna dalam palet menurut pengaturan penyesuaian kategori tertentu. |
| [SetBrushRemapTable](../../system.drawing.imaging/imageattributes/setbrushremaptable/)(ColorMap[]) | Mengatur tabel remap warna untuk kategori kuas. |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey/#setcolorkey)(Color, Color) | Mengatur kunci warna untuk kategori default. |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey/#setcolorkey_1)(Color, Color, ColorAdjustType) | Mengatur kunci warna (rentang transparansi) untuk kategori tertentu. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices/#setcolormatrices)(ColorMatrix, ColorMatrix) | Menetapkan matriks penyesuaian warna dan matriks penyesuaian skala abu-abu untuk kategori default. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices/#setcolormatrices_1)(ColorMatrix, ColorMatrix, ColorMatrixFlag) | Menetapkan matriks penyesuaian warna dan matriks penyesuaian skala abu-abu untuk kategori default. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices/#setcolormatrices_2)(ColorMatrix, ColorMatrix, ColorMatrixFlag, ColorAdjustType) | Menetapkan matriks penyesuaian warna dan matriks penyesuaian skala abu-abu untuk kategori tertentu. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix/#setcolormatrix)(ColorMatrix) | Mengatur matriks penyesuaian warna untuk kategori default. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix/#setcolormatrix_1)(ColorMatrix, ColorMatrixFlag) | Mengatur matriks penyesuaian warna untuk kategori default. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix/#setcolormatrix_2)(ColorMatrix, ColorMatrixFlag, ColorAdjustType) | Mengatur matriks penyesuaian warna untuk kategori tertentu. |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma/#setgamma)(float) | Mengatur nilai gamma untuk kategori default. |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma/#setgamma_1)(float, ColorAdjustType) | Mengatur nilai gamma untuk kategori tertentu. |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop/#setnoop)() | Mematikan penyesuaian warna untuk kategori default. Anda dapat memanggil[`ClearNoOp`](./clearnoop/) metode untuk mengembalikan pengaturan penyesuaian warna yang ada sebelum call ke[`SetNoOp`](./setnoop/) metode. |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop/#setnoop_1)(ColorAdjustType) | Mematikan penyesuaian warna untuk kategori tertentu. Anda dapat menghubungi[`ClearNoOp`](./clearnoop/) untuk mengembalikan pengaturan penyesuaian warna yang ada sebelum call ke[`SetNoOp`](./setnoop/) metode. |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel/#setoutputchannel)(ColorChannelFlag) | Mengatur saluran keluaran CMYK (cyan-magenta-kuning-hitam) untuk kategori default. |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel/#setoutputchannel_1)(ColorChannelFlag, ColorAdjustType) | Mengatur saluran keluaran CMYK (cyan-magenta-kuning-hitam) untuk kategori tertentu. |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile/#setoutputchannelcolorprofile)(string) | Mengatur file profil warna saluran keluaran untuk kategori default. |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile/#setoutputchannelcolorprofile_1)(string, ColorAdjustType) | Mengatur file profil warna saluran keluaran untuk kategori tertentu. |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable/#setremaptable)(ColorMap[]) | Mengatur tabel remap warna untuk kategori default. |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable/#setremaptable_1)(ColorMap[], ColorAdjustType) | Mengatur tabel remap warna untuk kategori tertentu. |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold/#setthreshold)(float) | Menetapkan ambang batas (rentang transparansi) untuk kategori default. |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold/#setthreshold_1)(float, ColorAdjustType) | Menetapkan ambang batas (rentang transparansi) untuk kategori tertentu. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode/#setwrapmode)(WrapMode) | Mengatur mode bungkus yang digunakan untuk memutuskan cara menyusun tekstur melintasi bentuk, atau pada batas bentuk. Tekstur disusun melintasi bentuk untuk mengisinya saat tekstur lebih kecil dari bentuk yang diisi. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode/#setwrapmode_1)(WrapMode, Color) | Mengatur mode pembungkusan dan warna yang digunakan untuk menentukan cara menyusun tekstur di seluruh bentuk, atau pada batas bentuk. Sebuah tekstur disusun di atas bentuk untuk diisi ketika tekstur lebih kecil dari bentuk yang diisi. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode/#setwrapmode_2)(WrapMode, Color, bool) | Mengatur mode pembungkusan dan warna yang digunakan untuk menentukan cara menyusun tekstur di seluruh bentuk, atau pada batas bentuk. Sebuah tekstur disusun di atas bentuk untuk diisi ketika tekstur lebih kecil dari bentuk yang diisi. |

### Lihat juga

* ruang nama [System.Drawing.Imaging](../../system.drawing.imaging/)
* perakitan [Aspose.Drawing](../../)


