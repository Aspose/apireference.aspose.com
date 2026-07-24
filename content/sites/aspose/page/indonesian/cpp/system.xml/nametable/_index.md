---
title: "System::Xml::NameTable kelas"
linktitle: "NameTable"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::NameTable kelas. Mengimplementasikan XmlNameTable single-threaded dalam C++."
type: docs
weight: 500
url: /id/cpp/system.xml/nametable/
---
## NameTable class


Mengimplementasikan [XmlNameTable](../xmlnametable/) single-threaded.

```cpp
class NameTable : public System::Xml::XmlNameTable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(const String\&) override | Membuat atom string yang ditentukan dan menambahkannya ke [NameTable](./). |
| [Add](./add/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) override | Membuat atom string yang ditentukan dan menambahkannya ke [NameTable](./). |
| [Get](./get/)(const String\&) override | Mengembalikan string yang diatomkan dengan nilai yang ditentukan. |
| [Get](./get/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) override | Mengembalikan string teratomisasi yang berisi karakter yang sama dengan rentang karakter yang ditentukan dalam array yang diberikan. |
| [NameTable](./nametable/)() | Menginisialisasi sebuah instance baru dari kelas [NameTable](./). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlNameTable](../xmlnametable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
