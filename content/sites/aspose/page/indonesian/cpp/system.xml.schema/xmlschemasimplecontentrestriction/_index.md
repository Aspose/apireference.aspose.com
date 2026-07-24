---
title: "Kelas System::Xml::Schema::XmlSchemaSimpleContentRestriction"
linktitle: "XmlSchemaSimpleContentRestriction"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::Schema::XmlSchemaSimpleContentRestriction. Mewakili elemen pembatasan untuk konten sederhana dari XML Schema sebagaimana ditentukan oleh World Wide Web Consortium (W3C). Kelas ini dapat digunakan untuk menghasilkan tipe sederhana melalui pembatasan. Derivasi semacam itu dapat digunakan untuk membatasi rentang nilai elemen ke subset nilai yang ditentukan dalam tipe sederhana yang diwarisi dalam C++."
type: docs
weight: 6100
url: /id/cpp/system.xml.schema/xmlschemasimplecontentrestriction/
---
## XmlSchemaSimpleContentRestriction class


Mewakili elemen **restriction** untuk konten sederhana dari XML [Schema](../) sebagaimana ditentukan oleh World Wide [Web](../../system.web/) Consortium (W3C). Kelas ini dapat digunakan untuk menghasilkan tipe sederhana melalui restriction. Derivasi semacam itu dapat digunakan untuk membatasi rentang nilai elemen ke subset nilai yang ditentukan dalam tipe sederhana yang diwarisi.

```cpp
class XmlSchemaSimpleContentRestriction : public System::Xml::Schema::XmlSchemaContent
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Mengembalikan sebuah [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) yang akan digunakan untuk nilai atribut. |
| [get_Attributes](./get_attributes/)() | Mengembalikan koleksi [XmlSchemaAttribute](../xmlschemaattribute/) dan [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) dari atribut untuk tipe sederhana. |
| [get_BaseType](./get_basetype/)() | Mengembalikan nilai dasar tipe sederhana. |
| [get_BaseTypeName](./get_basetypename/)() | Mengembalikan nama tipe data bawaan atau tipe sederhana dari mana tipe ini diturunkan. |
| [get_Facets](./get_facets/)() | Mengembalikan sebuah [Xml](../../system.xml/)[Schema](../) faset. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Mengatur sebuah [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) untuk digunakan pada nilai atribut. |
| [set_BaseType](./set_basetype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Menetapkan nilai dasar tipe sederhana. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Menetapkan nama tipe data bawaan atau tipe sederhana dari mana tipe ini diturunkan. |
| [XmlSchemaSimpleContentRestriction](./xmlschemasimplecontentrestriction/)() | Menginisialisasi sebuah instance baru dari kelas [XmlSchemaSimpleContentRestriction](./). |
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
