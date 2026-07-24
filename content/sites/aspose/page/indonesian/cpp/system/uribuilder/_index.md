---
title: "Kelas System::UriBuilder"
linktitle: "UriBuilder"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::UriBuilder. Menyediakan metode untuk membuat dan memodifikasi universal resource identifier (URI). Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam penunjuk System::SmartPtr dan gunakan penunjuk tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 6800
url: /id/cpp/system/uribuilder/
---
## UriBuilder class


Menyediakan metode untuk membuat dan memodifikasi universal resource identifier (URI). Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam penunjuk [System::SmartPtr](../smartptr/) dan gunakan penunjuk tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class UriBuilder : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Scheme](./get_scheme/)() const | Mengembalikan skema URI yang dibangun oleh objek saat ini. |
| [get_Uri](./get_uri/)() const | Mengembalikan objek [Uri](../uri/) yang dibangun oleh objek saat ini. |
| [set_Port](./set_port/)(int) | Mengatur nomor port URI. |
| [set_Scheme](./set_scheme/)(const String\&) | Mengatur skema URI yang dibangun oleh objek saat ini ke nilai yang ditentukan. |
| [ToString](./tostring/)() const override | Mengembalikan representasi string dari URI yang dibangun oleh objek saat ini. |
| [UriBuilder](./uribuilder/)(const String\&) | Membuat objek [UriBuilder](./) yang mewakili URI yang ditentukan. |
| [UriBuilder](./uribuilder/)(const SharedPtr\<Uri\>\&) | Membuat objek [UriBuilder](./) yang mewakili URI yang ditentukan. |
## Lihat Juga

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
