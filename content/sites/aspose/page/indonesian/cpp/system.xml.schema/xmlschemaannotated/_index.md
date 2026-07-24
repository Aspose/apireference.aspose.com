---
title: "Kelas System::Xml::Schema::XmlSchemaAnnotated"
linktitle: "XmlSchemaAnnotated"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::Schema::XmlSchemaAnnotated. Kelas dasar untuk elemen apa pun yang dapat berisi elemen anotasi dalam C++."
type: docs
weight: 600
url: /id/cpp/system.xml.schema/xmlschemaannotated/
---
## XmlSchemaAnnotated class


Kelas dasar untuk setiap elemen yang dapat berisi elemen anotasi.

```cpp
class XmlSchemaAnnotated : public System::Xml::Schema::XmlSchemaObject
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Annotation](./get_annotation/)() | Mengembalikan properti **annotation**. |
| [get_Id](./get_id/)() | Mengembalikan id string. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Mengembalikan atribut yang memenuhi syarat yang tidak termasuk dalam namespace target skema saat ini. |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | Mengatur properti **annotation**. |
| [set_Id](./set_id/)(const String\&) | Mengatur id string. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Mengatur atribut yang memenuhi syarat yang tidak termasuk dalam namespace target skema saat ini. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
