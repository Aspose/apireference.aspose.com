---
title: "System::Drawing::Imaging::ImageCodecInfo kelas"
linktitle: "ImageCodecInfo"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Drawing::Imaging::ImageCodecInfo. Menyediakan informasi tentang codec gambar. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1000
url: /id/cpp/system.drawing.imaging/imagecodecinfo/
---
## ImageCodecInfo class


Memberikan informasi tentang codec gambar. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class ImageCodecInfo : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_FormatID](./get_formatid/)() const | Mengembalikan GUID yang terkait dengan format codec yang diwakili oleh objek saat ini. |
| [get_MimeType](./get_mimetype/)() | Mengembalikan tipe Multipurpose Internet Mail Extensions (MIME) dari codec yang diwakili oleh objek saat ini. |
| static [GetImageDecoders](./getimagedecoders/)() | Mengembalikan array objek [ImageCodecInfo](./) yang mewakili decoder gambar yang didukung. |
| static [GetImageEncoders](./getimageencoders/)() | Mengembalikan array objek [ImageCodecInfo](./) yang mewakili encoder gambar yang didukung. |
| [set_FormatID](./set_formatid/)(const Guid\&) | Menetapkan GUID yang terkait dengan format codec yang diwakili oleh objek saat ini. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
