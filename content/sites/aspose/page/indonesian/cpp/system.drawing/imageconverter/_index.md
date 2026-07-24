---
title: "System::Drawing::ImageConverter kelas"
linktitle: "ImageConverter"
second_title: "Aspose.Page untuk C++"
description: "System::Drawing::ImageConverter kelas. Mengonversi objek Image dari satu tipe data ke tipe lain. Objek kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1300
url: /id/cpp/system.drawing/imageconverter/
---
## ImageConverter class


Mengonversi [Image](../image/) objek dari satu tipe data ke tipe lain. Objek kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class ImageConverter : public System::ComponentModel::TypeConverter
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::ComponentModel::ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) override | Mengonversi objek ke tipe tertentu. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Mengonversi objek ke tipe tertentu. |
| [ImageConverter](./imageconverter/)() | Membuat instance baru dari [ImageConverter](./). |
## Lihat Juga

* Class [TypeConverter](../../system.componentmodel/typeconverter/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
