---
title: "System::Xml::Schema::XmlSchemaFacet kelas"
linktitle: "XmlSchemaFacet"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlSchemaFacet kelas. Kelas dasar untuk semua facet yang digunakan ketika tipe sederhana diturunkan dengan pembatasan di C++."
type: docs
weight: 2900
url: /id/cpp/system.xml.schema/xmlschemafacet/
---
## XmlSchemaFacet class


Kelas dasar untuk semua facet yang digunakan ketika tipe sederhana diturunkan dengan pembatasan.

```cpp
class XmlSchemaFacet : public System::Xml::Schema::XmlSchemaAnnotated
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [get_IsFixed](./get_isfixed/)() | Mengembalikan informasi yang menunjukkan bahwa facet ini bersifat tetap. |
| [get_Value](./get_value/)() | Mengembalikan atribut **value** dari facet. |
| virtual [set_IsFixed](./set_isfixed/)(bool) | Mengatur informasi yang menunjukkan bahwa facet ini bersifat tetap. |
| [set_Value](./set_value/)(const String\&) | Mengatur atribut **value** dari facet. |
| [XmlSchemaFacet](./xmlschemafacet/)() | Menginisialisasi instance baru dari kelas [XmlSchemaFacet](./). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
