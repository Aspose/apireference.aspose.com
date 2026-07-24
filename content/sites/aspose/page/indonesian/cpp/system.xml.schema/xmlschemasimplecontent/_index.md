---
title: "System::Xml::Schema::XmlSchemaSimpleContent kelas"
linktitle: "XmlSchemaSimpleContent"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlSchemaSimpleContent kelas. Mewakili elemen simpleContent dari XML Schema sebagaimana ditentukan oleh World Wide Web Consortium (W3C). Kelas ini untuk tipe sederhana dan kompleks dengan model konten sederhana di C++."
type: docs
weight: 5900
url: /id/cpp/system.xml.schema/xmlschemasimplecontent/
---
## XmlSchemaSimpleContent class


Mewakili elemen **simpleContent** dari XML [Schema](../) sebagaimana ditentukan oleh World Wide [Web](../../system.web/) Consortium (W3C). Kelas ini untuk tipe sederhana dan kompleks dengan model konten sederhana.

```cpp
class XmlSchemaSimpleContent : public System::Xml::Schema::XmlSchemaContentModel
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Content](./get_content/)() override | Mengembalikan salah satu dari [XmlSchemaSimpleContentRestriction](../xmlschemasimplecontentrestriction/) atau [XmlSchemaSimpleContentExtension](../xmlschemasimplecontentextension/). |
| [set_Content](./set_content/)(SharedPtr\<XmlSchemaContent\>) override | Mengembalikan salah satu dari [XmlSchemaSimpleContentRestriction](../xmlschemasimplecontentrestriction/) atau [XmlSchemaSimpleContentExtension](../xmlschemasimplecontentextension/). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlSchemaContentModel](../xmlschemacontentmodel/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
