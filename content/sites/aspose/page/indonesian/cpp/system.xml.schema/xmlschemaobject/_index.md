---
title: "System::Xml::Schema::XmlSchemaObject class"
linktitle: "XmlSchemaObject"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlSchemaObject class. Mewakili kelas akar untuk hierarki model objek skema Xml dan berfungsi sebagai kelas dasar untuk kelas-kelas seperti kelas XmlSchema dalam C++."
type: docs
weight: 5000
url: /id/cpp/system.xml.schema/xmlschemaobject/
---
## XmlSchemaObject class


Mewakili kelas akar untuk hierarki model objek skema [Xml](../../system.xml/) dan berfungsi sebagai kelas dasar untuk kelas-kelas seperti kelas [XmlSchema](../xmlschema/).

```cpp
class XmlSchemaObject : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_LineNumber](./get_linenumber/)() | Mengembalikan nomor baris dalam file yang dirujuk oleh elemen **schema**. |
| [get_LinePosition](./get_lineposition/)() | Mengembalikan posisi baris dalam file yang dirujuk oleh elemen **schema**. |
| [get_Namespaces](./get_namespaces/)() | Mengembalikan XmlSerializerNamespaces yang akan digunakan dengan objek skema ini. |
| [get_Parent](./get_parent/)() | Mengembalikan induk dari [XmlSchemaObject](./) ini. |
| [get_SourceUri](./get_sourceuri/)() | Mengembalikan lokasi sumber untuk file yang memuat skema. |
| [set_LineNumber](./set_linenumber/)(int32_t) | Mengatur nomor baris dalam file yang dirujuk oleh elemen **schema**. |
| [set_LinePosition](./set_lineposition/)(int32_t) | Mengatur posisi baris dalam file yang dirujuk oleh elemen **schema**. |
| [set_Namespaces](./set_namespaces/)(const SharedPtr\<System::Xml::Serialization::XmlSerializerNamespaces\>\&) | Mengatur XmlSerializerNamespaces yang akan digunakan dengan objek skema ini. |
| [set_Parent](./set_parent/)(const SharedPtr\<XmlSchemaObject\>\&) | Menetapkan induk dari [XmlSchemaObject](./) ini. |
| [set_SourceUri](./set_sourceuri/)(const String\&) | Mengatur lokasi sumber untuk file yang memuat skema. |
| [XmlSchemaObject](./xmlschemaobject/)() | Menginisialisasi instance baru dari kelas [XmlSchemaObject](./). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
