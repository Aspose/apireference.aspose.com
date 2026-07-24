---
title: "kelas System::Xml::Schema::XmlSchemaImport"
linktitle: "XmlSchemaImport"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Xml::Schema::XmlSchemaImport. Mewakili elemen import dari XML Schema sebagaimana ditentukan oleh World Wide Web Consortium (W3C). Kelas ini digunakan untuk mengimpor komponen skema dari skema lain dalam C++."
type: docs
weight: 3500
url: /id/cpp/system.xml.schema/xmlschemaimport/
---
## XmlSchemaImport class


Mewakili elemen **import** dari XML [Schema](../) sebagaimana ditentukan oleh World Wide [Web](../../system.web/) Consortium (W3C). Kelas ini digunakan untuk mengimpor komponen skema dari skema lain.

```cpp
class XmlSchemaImport : public System::Xml::Schema::XmlSchemaExternal
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Annotation](./get_annotation/)() | Mengembalikan nilai **annotation**. |
| [get_Namespace](./get_namespace/)() | Mengembalikan namespace target untuk skema yang diimpor sebagai referensi Uniform Resource Identifier (URI). |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | Mengatur nilai **annotation**. |
| [set_Namespace](./set_namespace/)(const String\&) | Mengatur namespace target untuk skema yang diimpor sebagai referensi Uniform Resource Identifier (URI). |
| [XmlSchemaImport](./xmlschemaimport/)() | Menginisialisasi instance baru dari kelas [XmlSchemaImport](./). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
