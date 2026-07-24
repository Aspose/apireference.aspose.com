---
title: "kelas System::Xml::Schema::XmlSchemaSimpleType"
linktitle: "XmlSchemaSimpleType"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Xml::Schema::XmlSchemaSimpleType. Mewakili elemen simpleType untuk konten sederhana dari XML Schema sebagaimana ditentukan oleh World Wide Web Consortium (W3C). Kelas ini mendefinisikan tipe sederhana. Tipe sederhana dapat menentukan informasi dan batasan untuk nilai atribut atau elemen dengan konten hanya teks dalam C++."
type: docs
weight: 6200
url: /id/cpp/system.xml.schema/xmlschemasimpletype/
---
## XmlSchemaSimpleType class


Mewakili elemen **simpleType** untuk konten sederhana dari XML [Schema](../) sebagaimana ditentukan oleh World Wide [Web](../../system.web/) Consortium (W3C). Kelas ini mendefinisikan tipe sederhana. Tipe sederhana dapat menentukan informasi dan batasan untuk nilai atribut atau elemen dengan konten hanya teks.

```cpp
class XmlSchemaSimpleType : public System::Xml::Schema::XmlSchemaType
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Content](./get_content/)() | Mengembalikan salah satu dari [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/), [XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/), atau [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/). |
| [set_Content](./set_content/)(const SharedPtr\<XmlSchemaSimpleTypeContent\>\&) | Mengatur salah satu dari [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/), [XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/), atau [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/). |
| [XmlSchemaSimpleType](./xmlschemasimpletype/)() | Menginisialisasi instance baru dari kelas [XmlSchemaSimpleType](./). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlSchemaType](../xmlschematype/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
