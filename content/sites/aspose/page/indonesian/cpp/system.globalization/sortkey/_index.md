---
title: "System::Globalization::SortKey kelas"
linktitle: "SortKey"
second_title: "Aspose.Page untuk C++"
description: "System::Globalization::SortKey kelas. Pemetaan string ke kunci urutan-nya. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2200
url: /id/cpp/system.globalization/sortkey/
---
## SortKey class


Pemetaan string ke kunci urutan-nya. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class SortKey : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [Compare](./compare/)(const SortKeyPtr\&, const SortKeyPtr\&) | Membandingkan dua kunci urutan. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Memeriksa apakah objek yang ditentukan sama dengan objek [SortKey](./) saat ini. |
| virtual [get_KeyData](./get_keydata/)() | Mendapatkan array byte yang mewakili objek saat ini. |
| virtual [get_OriginalString](./get_originalstring/)() | Mendapatkan string asli yang digunakan untuk membuat objek ini. |
| [GetHashCode](./gethashcode/)() const override | Mendapatkan kode hash untuk objek [SortKey](./) saat ini. |
| [operator=](./operator=/)(const SortKey\&) |  |
| [SortKey](./sortkey/)(const SortKey\&) |  |
| [ToString](./tostring/)() const override | Mengonversi objek saat ini ke representasi string-nya. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
