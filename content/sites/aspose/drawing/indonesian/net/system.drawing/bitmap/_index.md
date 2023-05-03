---
title: Class Bitmap
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.Bitmap kelas. Merangkum bitmap yang terdiri dari data piksel untuk gambar grafik dan atributnya. ABitmap adalah objek yang digunakan untuk bekerja dengan gambar yang ditentukan oleh data piksel.
type: docs
weight: 40
url: /id/net/system.drawing/bitmap/
---
## Bitmap class

Merangkum bitmap, yang terdiri dari data piksel untuk gambar grafik dan atributnya. A`Bitmap` adalah objek yang digunakan untuk bekerja dengan gambar yang ditentukan oleh data piksel.

```csharp
public class Bitmap : Image
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Bitmap](bitmap/#constructor_3)(Image) | Menginisialisasi instance baru dari`Bitmap` kelas dari gambar yang sudah ditentukan. |
| [Bitmap](bitmap/#constructor_6)(Stream) | Menginisialisasi instance baru dari`Bitmap` kelas dari aliran data yang ditentukan. |
| [Bitmap](bitmap/#constructor_8)(string) | Menginisialisasi instance baru dari`Bitmap` kelas dari file yang ditentukan. |
| [Bitmap](bitmap/#constructor_5)(Image, Size) | Menginisialisasi instance baru dari`Bitmap`kelas dari gambar yang ada yang ditentukan, diskalakan ke ukuran yang ditentukan. |
| [Bitmap](bitmap/#constructor)(int, int) | Menginisialisasi instance baru dari`Bitmap` kelas dengan ukuran yang ditentukan. |
| [Bitmap](bitmap/#constructor_7)(Stream, bool) | Menginisialisasi instance baru dari`Bitmap` kelas dari aliran data yang ditentukan. |
| [Bitmap](bitmap/#constructor_9)(string, bool) | Menginisialisasi instance baru dari`Bitmap` kelas dari file yang ditentukan. |
| [Bitmap](bitmap/#constructor_4)(Image, int, int) | Menginisialisasi instance baru dari`Bitmap` kelas dari gambar yang ada ditentukan, diskalakan ke ukuran yang ditentukan. |
| [Bitmap](bitmap/#constructor_2)(int, int, PixelFormat) | Menginisialisasi instance baru dari`Bitmap` kelas dengan ukuran dan format yang ditentukan. |
| [Bitmap](bitmap/#constructor_1)(int, int, int, PixelFormat, int[]) | Menginisialisasi instance baru dari`Bitmap` kelas dengan data ukuran dan piksel yang ditentukan. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [Flags](../../system.drawing/image/flags/) { get; } | Mendapat bilangan bulat yang mewakili kombinasi bitwise dari[`ImageFlags`](../../system.drawing.imaging/imageflags/) untuk Gambar ini. |
| override [FrameDimensionsList](../../system.drawing/bitmap/framedimensionslist/) { get; } | Mendapat larik GUID yang mewakili dimensi bingkai di dalamnyaImage . |
| override [Height](../../system.drawing/bitmap/height/) { get; } | Mendapatkan tinggi, dalam piksel, dari Bitmap ini. |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution/) { get; } | Mendapat resolusi horizontal, dalam piksel per inci, dari iniImage . |
| override [Palette](../../system.drawing/bitmap/palette/) { get; set; } | Mendapatkan atau menyetel palet warna yang digunakan untuk iniImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension/) { get; } | Mendapatkan lebar dan tinggi gambar ini. |
| override [PixelFormat](../../system.drawing/bitmap/pixelformat/) { get; } | Mendapatkan format piksel untuk iniImage . |
| override [PropertyIdList](../../system.drawing/bitmap/propertyidlist/) { get; } | Mendapat ID dari item properti yang disimpan di siniImage . |
| override [PropertyItems](../../system.drawing/bitmap/propertyitems/) { get; } | Mendapat semua item properti (bagian dari metadata) yang disimpan di siniImage . |
| override [RawFormat](../../system.drawing/bitmap/rawformat/) { get; } | Mendapat format file iniImage . |
| [Size](../../system.drawing/image/size/) { get; } | Mendapatkan lebar dan tinggi, dalam piksel, dari gambar ini. |
| [Tag](../../system.drawing/image/tag/) { get; set; } | Mendapat atau menyetel objek yang menyediakan data tambahan tentang gambar. |
| [VerticalResolution](../../system.drawing/image/verticalresolution/) { get; } | Mendapatkan resolusi vertikal, dalam piksel per inci, dari iniImage . |
| override [Width](../../system.drawing/bitmap/width/) { get; } | Mendapatkan lebar, dalam piksel, dari Bitmap ini. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [Clone](../../system.drawing/image/clone/)() | Membuat salinan persis dari iniImage . |
| [Clone](../../system.drawing/bitmap/clone/#clone)(Rectangle, PixelFormat) | Membuat salinan dari bagian iniBitmap didefinisikan olehRectangle structure dan dengan yang ditentukanPixelFormat pencacahan. |
| [Clone](../../system.drawing/bitmap/clone/#clone_1)(RectangleF, PixelFormat) | Membuat salinan dari bagian iniBitmap ditentukan dengan ditentukanPixelFormat pencacahan. |
| virtual [Dispose](../../system.drawing/image/dispose/)() | Merilis semua sumber daya yang digunakan oleh Gambar ini. |
| [GetBounds](../../system.drawing/image/getbounds/)(ref GraphicsUnit) | Mendapatkan batas gambar dalam unit yang ditentukan. |
| [GetFrameCount](../../system.drawing/image/getframecount/)(FrameDimension) | Mengembalikan jumlah bingkai dari dimensi yang ditentukan. |
| [GetPixel](../../system.drawing/bitmap/getpixel/)(int, int) | Mendapat warna piksel yang ditentukan dalam hal iniBitmap . |
| override [GetPropertyItem](../../system.drawing/bitmap/getpropertyitem/)(int) | Mendapat item properti yang ditentukan dari siniImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage/)(int, int, GetThumbnailImageAbort, IntPtr) | Mengembalikan thumbnail untuk iniImage . |
| [LockBits](../../system.drawing/bitmap/lockbits/)(Rectangle, ImageLockMode, PixelFormat) | Mengunci aBitmap ke dalam memori sistem. |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent/#maketransparent)() | Membuat warna yang ditentukan transparan untuk iniBitmap . |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent/#maketransparent_1)(Color) | Membuat warna yang ditentukan transparan untuk iniBitmap . |
| [ReadArgb32Pixels](../../system.drawing/bitmap/readargb32pixels/)(int[]) | Membaca piksel bitmap dalam format ARGB32 ke dalam larik yang diberikan. |
| override [RemovePropertyItem](../../system.drawing/bitmap/removepropertyitem/)(int) | Menghapus item properti yang ditentukan dari iniImage . |
| override [RotateFlip](../../system.drawing/bitmap/rotateflip/)(RotateFlipType) | Metode ini memutar, membalik, atau memutar dan membalikImage . |
| [Save](../../system.drawing/image/save/)(string) | Simpan iniImageke file atau streaming yang ditentukan. |
| [Save](../../system.drawing/image/save/)(Stream, ImageFormat) | Menyimpan gambar ini ke aliran yang ditentukan dalam format yang ditentukan. |
| [Save](../../system.drawing/image/save/)(string, ImageFormat) | Simpan iniImage ke file yang ditentukan dalam format yang ditentukan. |
| [Save](../../system.drawing/image/save/)(Stream, ImageCodecInfo, EncoderParameters) | Menyimpan gambar ini ke aliran yang ditentukan, dengan parameter encoder dan encoder gambar yang ditentukan. |
| [Save](../../system.drawing/image/save/)(string, ImageCodecInfo, EncoderParameters) | Simpan iniImage ke file yang ditentukan, dengan parameter encoder dan image-encoder yang ditentukan. |
| [SaveAdd](../../system.drawing/image/saveadd/)(EncoderParameters) | Menambahkan bingkai ke file atau aliran yang ditentukan dalam panggilan sebelumnya ke salah satu metode Image.Save(...) . Gunakan metode ini untuk menyimpan bingkai yang dipilih dari gambar multi-bingkai ke gambar multi-bingkai lainnya. |
| [SaveAdd](../../system.drawing/image/saveadd/)(Image, EncoderParameters) | Menambahkan bingkai ke file atau aliran yang ditentukan dalam panggilan sebelumnya ke salah satu metode Image.Save(...) . |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe/)(FrameDimension, int) | Memilih bingkai yang ditentukan oleh dimensi dan indeks. |
| [SetPixel](../../system.drawing/bitmap/setpixel/)(int, int, Color) | Mengatur warna piksel yang ditentukan dalam hal iniBitmap . |
| override [SetPropertyItem](../../system.drawing/bitmap/setpropertyitem/)(PropertyItem) | Menyimpan item properti (bagian dari metadata) di siniImage . |
| [SetResolution](../../system.drawing/bitmap/setresolution/)(float, float) | Menetapkan resolusi untuk iniBitmap . |
| [UnlockBits](../../system.drawing/bitmap/unlockbits/)(BitmapData) | Buka iniBitmap dari memori sistem. |
| [WriteArgb32Pixels](../../system.drawing/bitmap/writeargb32pixels/)(int[]) | Menulis piksel ke bitmap. |

### Lihat juga

* class [Image](../image/)
* ruang nama [System.Drawing](../../system.drawing/)
* perakitan [Aspose.Drawing](../../)


