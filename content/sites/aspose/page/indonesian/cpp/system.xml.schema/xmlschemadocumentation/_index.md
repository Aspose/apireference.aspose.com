---
title: "System::Xml::Schema::XmlSchemaDocumentation kelas"
linktitle: "XmlSchemaDocumentation"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlSchemaDocumentation kelas. Mewakili elemen documentation dari XML Schema sebagaimana ditentukan oleh World Wide Web Consortium (W3C). Kelas ini menentukan informasi yang harus dibaca atau digunakan oleh manusia dalam sebuah anotasi di C++."
type: docs
weight: 2500
url: /id/cpp/system.xml.schema/xmlschemadocumentation/
---
## XmlSchemaDocumentation class


Mewakili elemen **documentation** dari XML [Schema](../) sebagaimana ditentukan oleh World Wide [Web](../../system.web/) Consortium (W3C). Kelas ini menentukan informasi yang harus dibaca atau digunakan oleh manusia dalam sebuah **annotation**.

```cpp
class XmlSchemaDocumentation : public System::Xml::Schema::XmlSchemaObject
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Language](./get_language/)() | Mengembalikan atribut **xml:lang**. Ini berfungsi sebagai indikator bahasa yang digunakan dalam konten. |
| [get_Markup](./get_markup/)() | Mengembalikan sebuah array dari objek [XmlNode](../../system.xml/xmlnode/) yang mewakili node anak documentation. |
| [get_Source](./get_source/)() | Mengembalikan sumber Uniform Resource Identifier (URI) dari informasi. |
| [set_Language](./set_language/)(const String\&) | Menetapkan atribut **xml:lang**. Ini berfungsi sebagai indikator bahasa yang digunakan dalam konten. |
| [set_Markup](./set_markup/)(const ArrayPtr\<SharedPtr\<XmlNode\>\>\&) | Menetapkan sebuah array dari objek [XmlNode](../../system.xml/xmlnode/) yang mewakili node anak documentation. |
| [set_Source](./set_source/)(const String\&) | Menetapkan sumber Uniform Resource Identifier (URI) dari informasi. |
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
