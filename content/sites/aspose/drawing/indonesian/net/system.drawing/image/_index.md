---
title: Class Image
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.Image kelas. Kelas dasar abstrak yang menyediakan fungsionalitas untuk kelas turunan Bitmap dan Metafile.
type: docs
weight: 580
url: /id/net/system.drawing/image/
---
## Image class

Kelas dasar abstrak yang menyediakan fungsionalitas untuk kelas turunan Bitmap dan Metafile.

```csharp
public abstract class Image : IDisposable
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Image](image/)() | Menginisialisasi instance baru dari`Image` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [Flags](../../system.drawing/image/flags/) { get; } | Mendapat bilangan bulat yang mewakili kombinasi bitwise dari[`ImageFlags`](../../system.drawing.imaging/imageflags/) untuk Gambar ini. |
| abstract [FrameDimensionsList](../../system.drawing/image/framedimensionslist/) { get; } | Mendapat larik GUID yang mewakili dimensi bingkai di dalamnyaImage . |
| abstract [Height](../../system.drawing/image/height/) { get; } | Mendapat tinggi, dalam piksel, dari iniImage . |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution/) { get; } | Mendapat resolusi horizontal, dalam piksel per inci, dari iniImage . |
| abstract [Palette](../../system.drawing/image/palette/) { get; set; } | Mendapatkan atau menyetel palet warna yang digunakan untuk iniImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension/) { get; } | Mendapatkan lebar dan tinggi gambar ini. |
| abstract [PixelFormat](../../system.drawing/image/pixelformat/) { get; } | Mendapatkan format piksel untuk iniImage . |
| abstract [PropertyIdList](../../system.drawing/image/propertyidlist/) { get; } | Mendapat ID dari item properti yang disimpan di siniImage . |
| abstract [PropertyItems](../../system.drawing/image/propertyitems/) { get; } | Mendapat semua item properti (bagian dari metadata) yang disimpan di siniImage . |
| abstract [RawFormat](../../system.drawing/image/rawformat/) { get; } | Mendapat format file iniImage . |
| [Size](../../system.drawing/image/size/) { get; } | Mendapatkan lebar dan tinggi, dalam piksel, dari gambar ini. |
| [Tag](../../system.drawing/image/tag/) { get; set; } | Mendapat atau menyetel objek yang menyediakan data tambahan tentang gambar. |
| [VerticalResolution](../../system.drawing/image/verticalresolution/) { get; } | Mendapatkan resolusi vertikal, dalam piksel per inci, dari iniImage . |
| abstract [Width](../../system.drawing/image/width/) { get; } | Mendapat lebar, dalam piksel, dari iniImage . |

## Metode

| Nama | Keterangan |
| --- | --- |
| static [FromFile](../../system.drawing/image/fromfile/)(string) | Membuat sebuahImage dari file yang ditentukan. |
| static [FromStream](../../system.drawing/image/fromstream/#fromstream)(Stream) | Membuat sebuahImagedari aliran data yang ditentukan. |
| static [FromStream](../../system.drawing/image/fromstream/#fromstream_1)(Stream, bool) | Membuat sebuahImage dari aliran data yang ditentukan, secara opsional menggunakan informasi manajemen warna tertanam dalam aliran itu. |
| [Clone](../../system.drawing/image/clone/)() | Membuat salinan persis dari iniImage . |
| virtual [Dispose](../../system.drawing/image/dispose/)() | Merilis semua sumber daya yang digunakan oleh Gambar ini. |
| [GetBounds](../../system.drawing/image/getbounds/)(ref GraphicsUnit) | Mendapatkan batas gambar dalam unit yang ditentukan. |
| [GetFrameCount](../../system.drawing/image/getframecount/)(FrameDimension) | Mengembalikan jumlah bingkai dari dimensi yang ditentukan. |
| abstract [GetPropertyItem](../../system.drawing/image/getpropertyitem/)(int) | Mendapat item properti yang ditentukan dari siniImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage/)(int, int, GetThumbnailImageAbort, IntPtr) | Mengembalikan thumbnail untuk iniImage . |
| abstract [RemovePropertyItem](../../system.drawing/image/removepropertyitem/)(int) | Menghapus item properti yang ditentukan dari iniImage . |
| abstract [RotateFlip](../../system.drawing/image/rotateflip/)(RotateFlipType) | Metode ini memutar, membalik, atau memutar dan membalikImage . |
| [Save](../../system.drawing/image/save/#save_2)(string) | Simpan iniImageke file atau streaming yang ditentukan. |
| [Save](../../system.drawing/image/save/#save_1)(Stream, ImageFormat) | Menyimpan gambar ini ke aliran yang ditentukan dalam format yang ditentukan. |
| [Save](../../system.drawing/image/save/#save_4)(string, ImageFormat) | Simpan iniImage ke file yang ditentukan dalam format yang ditentukan. |
| [Save](../../system.drawing/image/save/#save)(Stream, ImageCodecInfo, EncoderParameters) | Menyimpan gambar ini ke aliran yang ditentukan, dengan parameter encoder dan encoder gambar yang ditentukan. |
| [Save](../../system.drawing/image/save/#save_3)(string, ImageCodecInfo, EncoderParameters) | Simpan iniImage ke file yang ditentukan, dengan parameter encoder dan image-encoder yang ditentukan. |
| [SaveAdd](../../system.drawing/image/saveadd/#saveadd_1)(EncoderParameters) | Menambahkan bingkai ke file atau aliran yang ditentukan dalam panggilan sebelumnya ke salah satu metode Image.Save(...) . Gunakan metode ini untuk menyimpan bingkai yang dipilih dari gambar multi-bingkai ke gambar multi-bingkai lainnya. |
| [SaveAdd](../../system.drawing/image/saveadd/#saveadd)(Image, EncoderParameters) | Menambahkan bingkai ke file atau aliran yang ditentukan dalam panggilan sebelumnya ke salah satu metode Image.Save(...) . |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe/)(FrameDimension, int) | Memilih bingkai yang ditentukan oleh dimensi dan indeks. |
| abstract [SetPropertyItem](../../system.drawing/image/setpropertyitem/)(PropertyItem) | Menyimpan item properti (bagian dari metadata) di siniImage . |
| static [FromHbitmap](../../system.drawing/image/fromhbitmap/)(IntPtr) | Membuat aBitmap dari pegangan ke bitmap GDI. |
| static [GetPixelFormatSize](../../system.drawing/image/getpixelformatsize/)(PixelFormat) | Mengembalikan kedalaman warna, dalam jumlah bit per piksel, dari format piksel yang ditentukan. |
| static [IsAlphaPixelFormat](../../system.drawing/image/isalphapixelformat/)(PixelFormat) | Mengembalikan nilai yang menunjukkan apakah format piksel untuk iniImage berisi informasi alfa. |

## Anggota lainnya

| Nama | Keterangan |
| --- | --- |
| delegate [GetThumbnailImageAbort](image.getthumbnailimageabort/) | Menyediakan metode callback untuk menentukan kapan[`GetThumbnailImage`](./getthumbnailimage/) metode harus membatalkan eksekusi sebelum waktunya. |

### Lihat juga

* ruang nama [System.Drawing](../../system.drawing/)
* perakitan [Aspose.Drawing](../../)


