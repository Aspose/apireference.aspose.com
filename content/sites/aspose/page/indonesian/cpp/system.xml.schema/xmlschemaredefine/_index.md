---
title: "Kelas System::Xml::Schema::XmlSchemaRedefine"
linktitle: "XmlSchemaRedefine"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::Schema::XmlSchemaRedefine. Mewakili elemen redefine dari XML Schema sebagaimana ditentukan oleh World Wide Web Consortium (W3C). Kelas ini dapat digunakan untuk mengizinkan tipe sederhana dan kompleks, grup, serta grup atribut dari file skema eksternal untuk didefinisikan ulang dalam skema saat ini. Kelas ini juga dapat digunakan untuk menyediakan versi pada elemen skema dalam C++."
type: docs
weight: 5600
url: /id/cpp/system.xml.schema/xmlschemaredefine/
---
## XmlSchemaRedefine class


Mewakili elemen **redefine** dari XML [Schema](../) sebagaimana ditentukan oleh Konsorsium World Wide [Web](../../system.web/) (W3C). Kelas ini dapat digunakan untuk mengizinkan tipe sederhana dan kompleks, grup, serta grup atribut dari file skema eksternal untuk didefinisikan ulang dalam skema saat ini. Kelas ini juga dapat digunakan untuk menyediakan versi untuk elemen skema.

```cpp
class XmlSchemaRedefine : public System::Xml::Schema::XmlSchemaExternal
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_AttributeGroups](./get_attributegroups/)() | Mengembalikan [XmlSchemaObjectTable](../xmlschemaobjecttable/) , untuk semua atribut dalam skema, yang menyimpan interpretasi pasca-kompilasi dari nilai **AttributeGroups**. |
| [get_Groups](./get_groups/)() | Mengembalikan [XmlSchemaObjectTable](../xmlschemaobjecttable/), untuk semua grup dalam skema, yang menyimpan interpretasi pasca-kompilasi dari nilai **Groups**. |
| [get_Items](./get_items/)() | Mengembalikan koleksi kelas berikut: [XmlSchemaAnnotation](../xmlschemaannotation/), [XmlSchemaAttributeGroup](../xmlschemaattributegroup/), [XmlSchemaComplexType](../xmlschemacomplextype/), [XmlSchemaSimpleType](../xmlschemasimpletype/), dan [XmlSchemaGroup](../xmlschemagroup/). |
| [get_SchemaTypes](./get_schematypes/)() | Mengembalikan [XmlSchemaObjectTable](../xmlschemaobjecttable/), untuk semua tipe sederhana dan kompleks dalam skema, yang menyimpan interpretasi pasca-kompilasi dari nilai **SchemaTypes**. |
| [XmlSchemaRedefine](./xmlschemaredefine/)() | Menginisialisasi instance baru dari kelas [XmlSchemaRedefine](./). |
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
