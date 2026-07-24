---
title: "System::Xml::Schema::XmlSchemaSimpleTypeRestriction class"
linktitle: "XmlSchemaSimpleTypeRestriction"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeRestriction class. Mewakili elemen restriction untuk tipe sederhana dari XML Schema sebagaimana ditentukan oleh World Wide Web Consortium (W3C). Kelas ini dapat digunakan untuk membatasi elemen simpleType dalam C++."
type: docs
weight: 6500
url: /id/cpp/system.xml.schema/xmlschemasimpletyperestriction/
---
## XmlSchemaSimpleTypeRestriction class


Mewakili elemen **restriction** untuk tipe sederhana dari XML [Schema](../) sebagaimana ditentukan oleh World Wide [Web](../../system.web/) Consortium (W3C). Kelas ini dapat digunakan untuk membatasi elemen **simpleType**.

```cpp
class XmlSchemaSimpleTypeRestriction : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_BaseType](./get_basetype/)() | Mengembalikan informasi tentang tipe dasar. |
| [get_BaseTypeName](./get_basetypename/)() | Mengembalikan nama dari tipe dasar yang memenuhi syarat. |
| [get_Facets](./get_facets/)() | Mengembalikan sebuah [Xml](../../system.xml/)[Schema](../) faset. |
| [set_BaseType](./set_basetype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Mengatur informasi tentang tipe dasar. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Mengatur nama dari tipe dasar yang memenuhi syarat. |
| [XmlSchemaSimpleTypeRestriction](./xmlschemasimpletyperestriction/)() | Menginisialisasi sebuah instance baru dari kelas [XmlSchemaSimpleTypeRestriction](./). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
