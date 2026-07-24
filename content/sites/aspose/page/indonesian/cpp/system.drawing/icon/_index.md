---
title: "Kelas System::Drawing::Icon"
linktitle: "Ikon"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Drawing::Icon. Mewakili sebuah ikon Windows. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1100
url: /id/cpp/system.drawing/icon/
---
## Icon class


Mewakili sebuah ikon [Windows](../../system.windows/). Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class Icon : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Height](./get_height/)() const | Mengembalikan tinggi ikon. |
| [get_Width](./get_width/)() const | Mengembalikan lebar ikon. |
| [Icon](./icon/)(const String\&) | Membuat instance baru dari kelas [Icon](./) yang mewakili sebuah ikon dari file yang ditentukan. |
| [ToBitmap](./tobitmap/)() | Mengonversi objek saat ini menjadi objek [Bitmap](../bitmap/). |
| virtual [~Icon](./~icon/)() | Destruktor. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
