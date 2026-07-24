---
title: "Kelas System::IO::StringWriter"
linktitle: "StringWriter"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::IO::StringWriter. Mengimplementasikan TextWriter yang menulis informasi ke sebuah string. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini dengan pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2500
url: /id/cpp/system.io/stringwriter/
---
## StringWriter class


Mengimplementasikan sebuah [TextWriter](../textwriter/) yang menulis informasi ke sebuah string. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini dengan pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class StringWriter : public System::IO::TextWriter
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | Mengembalikan enkoding yang sedang digunakan. |
| virtual [GetStringBuilder](./getstringbuilder/)() | Mengembalikan StringBuilder yang sedang digunakan. |
| [StringWriter](./stringwriter/)(const System::SharedPtr\<Text::StringBuilder\>\&, const IFormatProviderPtr\&) | Membuat instance baru dari [StringWriter](./) menggunakan StringBuilder yang ditentukan dan [IFormatProvider](../../system/iformatprovider/). |
| [StringWriter](./stringwriter/)(const System::SharedPtr\<Text::StringBuilder\>\&) | Membuat instance baru dari [StringWriter](./) menggunakan StringBuilder yang ditentukan dan [IFormatProvider](../../system/iformatprovider/) dari budaya saat ini. |
| [StringWriter](./stringwriter/)(const IFormatProviderPtr\&) | Membuat instance baru dari [StringWriter](./) menggunakan [IFormatProvider](../../system/iformatprovider/) yang ditentukan. |
| [StringWriter](./stringwriter/)() | Membuat instance baru dari [StringWriter](./) menggunakan [IFormatProvider](../../system/iformatprovider/) dari budaya saat ini. |
| [ToString](./tostring/)() const override | Mengembalikan string yang mendasari. |
| [Write](./write/)(char_t) override | Menulis karakter yang ditentukan ke aliran. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Menulis subrentang karakter yang ditentukan dari array karakter yang ditentukan ke aliran. |
| [Write](./write/)(const String\&) override | Menulis string yang ditentukan ke aliran. |
## Lihat Juga

* Class [TextWriter](../textwriter/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
