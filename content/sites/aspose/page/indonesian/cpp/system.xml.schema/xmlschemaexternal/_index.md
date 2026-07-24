---
title: "kelas System::Xml::Schema::XmlSchemaExternal"
linktitle: "XmlSchemaExternal"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Xml::Schema::XmlSchemaExternal. Menyediakan informasi tentang skema yang disertakan dalam C++."
type: docs
weight: 2800
url: /id/cpp/system.xml.schema/xmlschemaexternal/
---
## XmlSchemaExternal class


Menyediakan informasi tentang skema yang disertakan.

```cpp
class XmlSchemaExternal : public System::Xml::Schema::XmlSchemaObject
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Id](./get_id/)() | Mengembalikan id string. |
| [get_Schema](./get_schema/)() | Mengembalikan [XmlSchema](../xmlschema/) untuk skema yang direferensikan. |
| [get_SchemaLocation](./get_schemalocation/)() | Mengembalikan lokasi Uniform Resource Identifier (URI) untuk skema, yang memberi tahu pemroses skema di mana skema tersebut berada secara fisik. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Mengembalikan atribut yang memenuhi syarat, yang tidak termasuk dalam namespace target skema. |
| [set_Id](./set_id/)(const String\&) | Mengatur id string. |
| [set_Schema](./set_schema/)(const SharedPtr\<XmlSchema\>\&) | Mengatur [XmlSchema](../xmlschema/) untuk skema yang dirujuk. |
| [set_SchemaLocation](./set_schemalocation/)(const String\&) | Mengatur lokasi Uniform Resource Identifier (URI) untuk skema, yang memberi tahu pemroses skema di mana skema tersebut berada secara fisik. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Mengatur atribut yang memenuhi syarat, yang tidak termasuk dalam namespace target skema. |
| [XmlSchemaExternal](./xmlschemaexternal/)() | Menginisialisasi instance baru dari kelas [XmlSchemaExternal](./). |
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
