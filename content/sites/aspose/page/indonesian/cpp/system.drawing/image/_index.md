---
title: "System::Drawing::Image kelas"
linktitle: "Image"
second_title: "Aspose.Page untuk C++"
description: "System::Drawing::Image kelas. Kelas dasar untuk kelas System::Drawing::Bitmap dan System::Drawing::Metafile yang menyediakan fungsionalitas dasar. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini pada stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1200
url: /id/cpp/system.drawing/image/
---
## Image class


Kelas dasar untuk [System::Drawing::Bitmap](../bitmap/) dan kelas System::Drawing::Metafile yang menyediakan fungsionalitas dasar. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini pada stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class Image : public virtual System::IDisposable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Clone](./clone/)() | Membuat salinan dari objek saat ini. |
| [Dispose](./dispose/)() override | Melepaskan semua sumber daya yang diperoleh oleh objek saat ini. |
| static [FromFile](./fromfile/)(const String\&, bool) | Membuat objek [Image](./) dari file yang ditentukan. |
| static [FromHbitmap](./fromhbitmap/)(IntPtr) | Membuat objek [Bitmap](../bitmap/) dari bitmap GDI yang ditentukan. |
| static [FromStream](./fromstream/)(const SharedPtr\<System::IO::Stream\>\&, bool, bool) | Membuat objek [Image](./) dari stream yang ditentukan. |
| virtual [get_Flags](./get_flags/)() const | Mengembalikan kombinasi bitwise dari nilai enum ImageFlags yang mewakili atribut gambar. |
| [get_FrameDimensionsList](./get_framedimensionslist/)() const | Mengembalikan array GUID yang mewakili dimensi frame dalam gambar yang diwakili oleh objek saat ini. |
| virtual [get_Height](./get_height/)() const | Mengembalikan tinggi gambar dalam piksel. |
| [get_HorizontalResolution](./get_horizontalresolution/)() const | Mengembalikan resolusi horizontal gambar yang diwakili oleh objek saat ini dalam piksel per inci. |
| virtual [get_Palette](./get_palette/)() const | Mengembalikan palet warna yang digunakan oleh gambar yang diwakili oleh objek saat ini. |
| virtual [get_PixelFormat](./get_pixelformat/)() const | Mengembalikan format piksel gambar yang diwakili oleh objek saat ini. |
| virtual [get_PropertyIdList](./get_propertyidlist/)() const | Mendapatkan ID item properti yang disimpan dalam gambar ini. |
| virtual [get_PropertyItems](./get_propertyitems/)() const | Mendapatkan semua item properti(potongan metadata) yang disimpan dalam gambar ini. |
| virtual [get_RawFormat](./get_rawformat/)() const | Mengembalikan format file gambar yang diwakili oleh objek saat ini. |
| [get_Size](./get_size/)() const | Mengembalikan objek [Size](../size/) yang mewakili lebar dan tinggi gambar dalam piksel. |
| virtual [get_Tag](./get_tag/)() const | Mendapatkan objek yang menyediakan data tambahan tentang gambar. |
| [get_VerticalResolution](./get_verticalresolution/)() const | Mengembalikan resolusi vertikal gambar yang diwakili oleh objek saat ini dalam piksel per inci. |
| virtual [get_Width](./get_width/)() const | Mengembalikan lebar gambar dalam piksel. |
| [GetBounds](./getbounds/)(GraphicsUnit\&) | Mengembalikan batas gambar dalam satuan ukuran yang ditentukan. |
| [GetFrameCount](./getframecount/)(const Imaging::FrameDimensionPtr\&) | Mengembalikan jumlah frame dari dimensi frame yang ditentukan. |
| static [GetPixelFormatSize](./getpixelformatsize/)(Imaging::PixelFormat) | Mengembalikan jumlah bit yang digunakan untuk mewakili kedalaman warna dalam format piksel yang ditentukan. |
| virtual [GetSkBitmap](./getskbitmap/)() const | Mengembalikan objek SkBitmap yang mendasari. |
| [GetThumbnailImage](./getthumbnailimage/)(int, int, Image::GetThumbnailImageAbort, IntPtr) | Mendapatkan thumbnail untuk objek [System::Drawing::Image](./) ini. |
| static [IsAlphaPixelFormat](./isalphapixelformat/)(Imaging::PixelFormat) | Menentukan apakah format piksel yang ditentukan mengandung informasi alfa. |
| virtual [IsMultiImage](./ismultiimage/)() const | Mengembalikan apakah format asli adalah multi-gambar. |
| virtual [RotateFlip](./rotateflip/)(RotateFlipType) | Memutar gambar ke kelipatan 90 derajat dan membalik. |
| [Save](./save/)(const String\&) | Menyimpan gambar yang diwakili oleh objek saat ini ke file yang ditentukan dalam format PNG. |
| [Save](./save/)(const String\&, const Imaging::ImageFormatPtr\&) | Menyimpan gambar yang diwakili oleh objek saat ini ke file yang ditentukan dalam format yang ditentukan. |
| [Save](./save/)(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageFormatPtr\&) | Menyimpan gambar yang direpresentasikan oleh objek saat ini ke aliran yang ditentukan dalam format yang ditentukan. |
| [Save](./save/)(const String\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) | Menyimpan gambar yang direpresentasikan oleh objek saat ini ke file yang ditentukan menggunakan encoder dan parameter encoder yang ditentukan. |
| [Save](./save/)(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) | Menyimpan gambar yang direpresentasikan oleh objek saat ini ke aliran yang ditentukan menggunakan encoder dan parameter encoder yang ditentukan. |
| [SaveAdd](./saveadd/)(const Imaging::EncoderParametersPtr\&) | Menambahkan sebuah frame ke file atau aliran yang ditentukan dalam panggilan sebelumnya ke metode [Save()](./save/). |
| [SaveAdd](./saveadd/)(const SharedPtr\<Image\>\&, const Imaging::EncoderParametersPtr\&) | Menambahkan sebuah frame ke file atau aliran yang ditentukan dalam panggilan sebelumnya ke metode [Save()](./save/). |
| [SelectActiveFrame](./selectactiveframe/)(const Imaging::FrameDimensionPtr\&, int) | Memilih frame yang ditentukan. |
| virtual [set_Palette](./set_palette/)(Imaging::ColorPalettePtr) | Mengatur palet warna yang digunakan oleh gambar yang direpresentasikan oleh objek saat ini. |
| virtual [set_Tag](./set_tag/)(const System::SharedPtr\<System::Object\>) | Mengatur objek yang menyediakan data tambahan tentang gambar. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [GetThumbnailImageAbort](./getthumbnailimageabort/) | Callback untuk membatalkan eksekusi GetThumbnailImage. |
## Lihat Juga

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
