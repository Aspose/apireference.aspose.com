---
title: "Kelas System::Xml::Schema::XmlSchemaInfo"
linktitle: "XmlSchemaInfo"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::Schema::XmlSchemaInfo. Mewakili infoset pasca-validasi-skema dari node XML yang telah divalidasi dalam C++."
type: docs
weight: 3800
url: /id/cpp/system.xml.schema/xmlschemainfo/
---
## XmlSchemaInfo class


Mewakili infoset pasca-validasi-skema dari node XML yang telah divalidasi.

```cpp
class XmlSchemaInfo : public System::Xml::Schema::IXmlSchemaInfo
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_ContentType](./get_contenttype/)() | Mengembalikan objek [XmlSchemaContentType](../xmlschemacontenttype/) yang sesuai dengan tipe konten dari node XML yang telah divalidasi ini. |
| [get_IsDefault](./get_isdefault/)() override | Mengembalikan nilai yang menunjukkan apakah node XML yang telah divalidasi ini diatur sebagai hasil dari nilai default yang diterapkan selama validasi skema XML [Schema](../) Definition Language (XSD). |
| [get_IsNil](./get_isnil/)() override | Mengembalikan nilai yang menunjukkan apakah nilai untuk node XML yang telah divalidasi ini adalah **nil**. |
| [get_MemberType](./get_membertype/)() override | Mengembalikan tipe skema dinamis untuk node XML yang telah divalidasi ini. |
| [get_SchemaAttribute](./get_schemaattribute/)() override | Mengembalikan objek [XmlSchemaAttribute](../xmlschemaattribute/) yang telah dikompilasi yang sesuai dengan node XML yang telah divalidasi ini. |
| [get_SchemaElement](./get_schemaelement/)() override | Mengembalikan objek [XmlSchemaElement](../xmlschemaelement/) yang telah dikompilasi yang sesuai dengan node XML yang telah divalidasi ini. |
| [get_SchemaType](./get_schematype/)() override | Mengembalikan tipe skema XML [Schema](../) Definition Language (XSD) statis dari node XML yang telah divalidasi ini. |
| [get_Validity](./get_validity/)() override | Mengembalikan nilai [XmlSchemaValidity](../xmlschemavalidity/) dari node XML yang divalidasi ini. |
| [set_ContentType](./set_contenttype/)(XmlSchemaContentType) | Mengatur objek [XmlSchemaContentType](../xmlschemacontenttype/) yang sesuai dengan tipe konten node XML yang divalidasi ini. |
| [set_IsDefault](./set_isdefault/)(bool) | Mengatur nilai yang menunjukkan apakah node XML yang divalidasi ini diatur sebagai hasil dari penerapan nilai default selama validasi skema XML [Schema](../) Definition Language (XSD). |
| [set_IsNil](./set_isnil/)(bool) | Mengatur nilai yang menunjukkan apakah nilai untuk node XML yang divalidasi ini adalah **nil**. |
| [set_MemberType](./set_membertype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Mengatur tipe skema dinamis untuk node XML yang divalidasi ini. |
| [set_SchemaAttribute](./set_schemaattribute/)(const SharedPtr\<XmlSchemaAttribute\>\&) | Mengatur objek [XmlSchemaAttribute](../xmlschemaattribute/) yang telah dikompilasi yang sesuai dengan node XML yang divalidasi ini. |
| [set_SchemaElement](./set_schemaelement/)(const SharedPtr\<XmlSchemaElement\>\&) | Mengatur objek [XmlSchemaElement](../xmlschemaelement/) yang telah dikompilasi yang sesuai dengan node XML yang divalidasi ini. |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaType\>\&) | Mengatur tipe skema XML [Schema](../) Definition Language (XSD) statis untuk node XML yang divalidasi ini. |
| [set_Validity](./set_validity/)(XmlSchemaValidity) | Mengatur nilai [XmlSchemaValidity](../xmlschemavalidity/) dari node XML yang divalidasi ini. |
| [XmlSchemaInfo](./xmlschemainfo/)() | Menginisialisasi instance baru dari kelas [XmlSchemaInfo](./). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [IXmlSchemaInfo](../ixmlschemainfo/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
