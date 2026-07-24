---
title: "System::Drawing::Imaging::ImageFormat class"
linktitle: "ImageFormat"
second_title: "Aspose.Page untuk C++"
description: "System::Drawing::Imaging::ImageFormat class. Mewakili format file dari sebuah gambar. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1100
url: /id/cpp/system.drawing.imaging/imageformat/
---
## ImageFormat class


Mewakili format file dari sebuah gambar. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class ImageFormat : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Equals](./equals/)(ImageFormatPtr) const | Menentukan apakah format gambar yang diwakili oleh objek saat ini dan objek yang ditentukan sama. |
| static [get_Bmp](./get_bmp/)() | Mengembalikan shared pointer ke objek [ImageFormat](./) yang mewakili format gambar bitmap. |
| static [get_Emf](./get_emf/)() | Mengembalikan shared pointer ke objek [ImageFormat](./) yang mewakili format metafile yang ditingkatkan. |
| static [get_Exif](./get_exif/)() | Mengembalikan shared pointer ke objek [ImageFormat](./) yang mewakili format Exchangeable [Image](../../system.drawing/image/) File (Exif). |
| static [get_Gif](./get_gif/)() | Mengembalikan shared pointer ke objek [ImageFormat](./) yang mewakili format gambar [Graphics](../../system.drawing/graphics/) Interchange Format (GIF). |
| [get_Guid](./get_guid/)() const | Mengembalikan GUID yang terkait dengan format gambar yang diwakili oleh objek saat ini. |
| static [get_Icon](./get_icon/)() | Mengembalikan shared pointer ke objek [ImageFormat](./) yang mewakili format gambar ikon [Windows](../../system.windows/). |
| static [get_Jpeg](./get_jpeg/)() | Mengembalikan shared pointer ke objek [ImageFormat](./) yang mewakili format gambar Joint Photographic Experts Group (JPEG). |
| static [get_MemoryBmp](./get_memorybmp/)() | Mengembalikan shared pointer ke objek [ImageFormat](./) yang mewakili format bitmap dalam memori. |
| static [get_Png](./get_png/)() | Mengembalikan shared pointer ke objek [ImageFormat](./) yang mewakili format gambar W3C Portable Network [Graphics](../../system.drawing/graphics/) (PNG). |
| static [get_Tiff](./get_tiff/)() | Mengembalikan shared pointer ke objek [ImageFormat](./) yang mewakili format gambar Tagged [Image](../../system.drawing/image/) File Format (TIFF). |
| static [get_Wmf](./get_wmf/)() | Mengembalikan shared pointer ke objek [ImageFormat](./) yang mewakili format gambar metafile [Windows](../../system.windows/) (WMF). |
| [ImageFormat](./imageformat/)(const System::Guid\&) | Mengonstruksi sebuah instance dari kelas [ImageFormat](./) yang mewakili format gambar yang terkait dengan GUID yang ditentukan. |
| virtual [ToString](./tostring/)() const | Mengonversi objek [ImageFormat](./) ini menjadi string yang dapat dibaca manusia. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
