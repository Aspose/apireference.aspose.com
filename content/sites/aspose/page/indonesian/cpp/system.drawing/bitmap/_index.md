---
title: "System::Drawing::Bitmap class"
linktitle: "Bitmap"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Drawing::Bitmap. Mewakili gambar bitmap GDI+. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 100
url: /id/cpp/system.drawing/bitmap/
---
## Bitmap class


Mewakili gambar bitmap GDI+. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class Bitmap : public System::Drawing::Image
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [BeginPixelProcessing](./beginpixelprocessing/)(bool) | Mengaktifkan mode pemrosesan piksel. |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&) | Membuat objek [Bitmap](./) baru dari gambar yang ada yang ditentukan. |
| [Bitmap](./bitmap/)(const SharedPtr\<System::IO::Stream\>\&, bool) | Membuat objek [Bitmap](./) baru dari aliran yang ditentukan. |
| [Bitmap](./bitmap/)(const String\&) | Membuat objek [Bitmap](./) baru dari file yang ditentukan. |
| [Bitmap](./bitmap/)(const String\&, bool) | Membuat objek [Bitmap](./) baru dari file yang ditentukan. |
| [Bitmap](./bitmap/)(int, int, Imaging::PixelFormat) | Membuat objek [Bitmap](./) baru yang mewakili gambar bitmap dengan lebar, tinggi, format piksel, dan data piksel yang ditentukan. |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&, const Size\&) | Membuat objek [Bitmap](./) baru dari gambar yang ada yang ditentukan, diubah ukurannya ke ukuran yang ditentukan. |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&, int, int) | Membuat objek [Bitmap](./) baru dari gambar yang ada yang ditentukan dengan lebar dan tinggi yang diubah skalanya ke nilai yang ditentukan. |
| [Clone](./clone/)() override | Membuat salinan dari objek saat ini. |
| [Clone](./clone/)(Rectangle, Imaging::PixelFormat) | Membuat objek [Bitmap](./) yang mewakili salinan wilayah gambar bitmap yang diwakili oleh objek saat ini. |
| [Clone](./clone/)(RectangleF, Imaging::PixelFormat) | Membuat objek [Bitmap](./) yang mewakili salinan wilayah gambar bitmap yang diwakili oleh objek saat ini. |
| [ComputeHash](./computehash/)() | Menghitung nilai hash SHA1. |
| static [ConvertToARGBImage](./converttoargbimage/)(const SharedPtr\<Bitmap\>\&) | Membuat salinan gambar bitmap yang ditentukan dengan format piksel diubah menjadi Format32bppArgb. |
| [EndPixelProcessing](./endpixelprocessing/)(bool) | Menonaktifkan mode pemrosesan piksel. |
| [get_Height](./get_height/)() const override | Mengembalikan tinggi gambar dalam piksel. |
| [get_Palette](./get_palette/)() const override | Mengembalikan palet warna yang digunakan oleh gambar yang diwakili oleh objek saat ini. |
| [get_PixelFormat](./get_pixelformat/)() const override | Mengembalikan format piksel gambar yang diwakili oleh objek saat ini. |
| [get_RawFormat](./get_rawformat/)() const override | Mengembalikan format file gambar yang diwakili oleh objek saat ini. |
| [get_Width](./get_width/)() const override | Mengembalikan lebar gambar dalam piksel. |
| [GetHbitmap](./gethbitmap/)() | Membuat objek bitmap GDI dari bitmap yang diwakili oleh objek saat ini. |
| [GetPixel](./getpixel/)(int, int) | Mengembalikan warna piksel yang ditentukan. |
| [GetSkBitmap](./getskbitmap/)() const override | Mengembalikan pointer mentah ke objek SkBitmap yang mendasarinya. |
| [IsMultiImage](./ismultiimage/)() const override | Mengembalikan apakah format asli adalah multi-gambar. |
| [LockBits](./lockbits/)(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat) | Mengunci sebuah [Bitmap](./) ke dalam memori sistem. |
| [LockBits](./lockbits/)(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat, const Imaging::BitmapDataPtr\&) | Mengunci sebuah [Bitmap](./) ke dalam memori sistem. |
| [MakeTransparent](./maketransparent/)(Color) | Mengubah warna semua piksel dengan warna yang ditentukan menjadi transparan. |
| [MEMBER_FUNCTION_MAKE_OBJECT](./member_function_make_object/)(Bitmap, CODEPORTING_ARGS(const SharedPtr\<Image\>\&original, int width, int height), CODEPORTING_ARGS(original, width, height)) |  |
| [PremultipleColors](./premultiplecolors/)() | Melakukan premultiplikasi warna piksel gambar yang diwakili oleh objek saat ini. |
| [RotateFlip](./rotateflip/)(RotateFlipType) override | Memutar gambar ke kelipatan 90 derajat dan membaliknya. |
| [set_Palette](./set_palette/)(Imaging::ColorPalettePtr) override | Mengatur palet warna yang digunakan oleh gambar yang direpresentasikan oleh objek saat ini. |
| [SetPixel](./setpixel/)(int, int, Color) | Menetapkan warna piksel yang ditentukan dalam gambar bitmap yang diwakili oleh objek saat ini. |
| [SetResolution](./setresolution/)(float, float) | Menetapkan resolusi gambar. |
| [UnlockBits](./unlockbits/)(const Imaging::BitmapDataPtr\&) | Membuka kunci bitmap yang ditentukan dari memori sistem. |
## Lihat Juga

* Class [Image](../image/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
