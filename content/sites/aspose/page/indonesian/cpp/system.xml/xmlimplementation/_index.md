---
title: "kelas System::Xml::XmlImplementation"
linktitle: "XmlImplementation"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Xml::XmlImplementation. Mendefinisikan konteks untuk sekumpulan objek XmlDocument dalam C++."
type: docs
weight: 2000
url: /id/cpp/system.xml/xmlimplementation/
---
## XmlImplementation class


Mendefinisikan konteks untuk sekumpulan objek [XmlDocument](../xmldocument/).

```cpp
class XmlImplementation : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [CreateDocument](./createdocument/)() | Membuat [XmlDocument](../xmldocument/) baru. |
| [HasFeature](./hasfeature/)(const String\&, const String\&) | Menguji apakah implementasi Document [Object](../../system/object/) Model (DOM) mendukung fitur tertentu. |
| [XmlImplementation](./xmlimplementation/)() | Menginisialisasi instance baru dari kelas [XmlImplementation](./). |
| [XmlImplementation](./xmlimplementation/)(const SharedPtr\<XmlNameTable\>\&) | Menginisialisasi instance baru dari kelas [XmlImplementation](./) dengan [XmlNameTable](../xmlnametable/) yang ditentukan. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
