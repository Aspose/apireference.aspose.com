---
title: "Kelas System::Xml::Schema::XmlSchemaSimpleContentExtension"
linktitle: "XmlSchemaSimpleContentExtension"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::Schema::XmlSchemaSimpleContentExtension. Mewakili elemen extension untuk konten sederhana dari XML Schema sebagaimana ditentukan oleh World Wide Web Consortium (W3C). Kelas ini dapat digunakan untuk menghasilkan tipe sederhana melalui ekstensi. Derivasi semacam itu digunakan untuk memperluas konten tipe sederhana elemen dengan menambahkan atribut dalam C++."
type: docs
weight: 6000
url: /id/cpp/system.xml.schema/xmlschemasimplecontentextension/
---
## XmlSchemaSimpleContentExtension class


Mewakili elemen **extension** untuk konten sederhana dari XML [Schema](../) sebagaimana ditentukan oleh World Wide [Web](../../system.web/) Consortium (W3C). Kelas ini dapat digunakan untuk menghasilkan tipe sederhana melalui ekstensi. Derivasi semacam itu digunakan untuk memperluas konten tipe sederhana elemen dengan menambahkan atribut.

```cpp
class XmlSchemaSimpleContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Mengembalikan [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) yang akan digunakan untuk nilai atribut. |
| [get_Attributes](./get_attributes/)() | Mengembalikan koleksi [XmlSchemaAttribute](../xmlschemaattribute/) dan [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_BaseTypeName](./get_basetypename/)() | Mengembalikan nama tipe data bawaan atau tipe sederhana yang memperluas tipe ini. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Menetapkan [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) yang akan digunakan untuk nilai atribut. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Menetapkan nama tipe data bawaan atau tipe sederhana yang memperluas tipe ini. |
| [XmlSchemaSimpleContentExtension](./xmlschemasimplecontentextension/)() | Menginisialisasi sebuah instance baru dari kelas [XmlSchemaSimpleContentExtension](./). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlSchemaContent](../xmlschemacontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
