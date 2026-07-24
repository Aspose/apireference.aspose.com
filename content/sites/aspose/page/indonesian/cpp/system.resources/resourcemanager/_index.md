---
title: "System::Resources::ResourceManager kelas"
linktitle: "ResourceManager"
second_title: "Aspose.Page untuk C++"
description: "System::Resources::ResourceManager kelas. Menyediakan API untuk mengelola sumber daya. Tidak diimplementasikan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menghasilkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 100
url: /id/cpp/system.resources/resourcemanager/
---
## ResourceManager class


Menawarkan API untuk mengelola sumber daya. Tidak diimplementasikan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menghasilkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class ResourceManager : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [GetObject__](./getobject__/)(String) | Mendapatkan objek dari sumber daya. Nama bukan GetObject() untuk mengatasi masalah definisi GetObjectA. |
| virtual [GetObject__](./getobject__/)(String, SharedPtr\<System::Globalization::CultureInfo\>) | Mendapatkan objek dari sumber daya. Nama bukan GetObject() untuk mengatasi masalah definisi GetObjectA. |
| virtual [GetString](./getstring/)(String) | Mendapatkan sumber daya string. |
| virtual [GetString](./getstring/)(String, SharedPtr\<System::Globalization::CultureInfo\>) | Mendapatkan sumber daya string. |
| [ResourceManager](./resourcemanager/)(const String\&, const SharedPtr\<Reflection::Assembly\>\&) | Informasi RTTI. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Resources](../)
* Library [Aspose.Page for C++](../../)
