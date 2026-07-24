---
title: "System::Xml::Schema::XmlSchemaSimpleTypeUnion kelas"
linktitle: "XmlSchemaSimpleTypeUnion"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeUnion kelas. Mewakili elemen union untuk tipe sederhana dari XML Schema sebagaimana ditentukan oleh World Wide Web Consortium (W3C). Sebuah datatype union dapat digunakan untuk menentukan konten dari sebuah simpleType. Nilai elemen simpleType harus berupa salah satu dari sekumpulan datatype alternatif yang ditentukan dalam union. Tipe union selalu merupakan tipe turunan dan harus terdiri dari setidaknya dua datatype alternatif di C++."
type: docs
weight: 6600
url: /id/cpp/system.xml.schema/xmlschemasimpletypeunion/
---
## XmlSchemaSimpleTypeUnion class


Mewakili elemen **union** untuk tipe sederhana dari XML [Schema](../) sebagaimana ditentukan oleh World Wide [Web](../../system.web/) Consortium (W3C). Sebuah datatype **union** dapat digunakan untuk menentukan konten dari **simpleType**. Nilai elemen **simpleType** harus berupa salah satu dari sekumpulan datatype alternatif yang ditentukan dalam union. Tipe union selalu merupakan tipe turunan dan harus terdiri dari setidaknya dua datatype alternatif.

```cpp
class XmlSchemaSimpleTypeUnion : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_BaseMemberTypes](./get_basemembertypes/)() | Mengembalikan sebuah array dari objek [XmlSchemaSimpleType](../xmlschemasimpletype/) yang mewakili tipe elemen **simpleType** berdasarkan nilai [XmlSchemaSimpleTypeUnion::get_BaseTypes](./get_basetypes/) dan [XmlSchemaSimpleTypeUnion::get_MemberTypes](./get_membertypes/) dari tipe sederhana. |
| [get_BaseTypes](./get_basetypes/)() | Mengembalikan koleksi tipe dasar. |
| [get_MemberTypes](./get_membertypes/)() | Mengembalikan array nama anggota yang memenuhi syarat dari tipe data bawaan atau elemen **simpleType** yang didefinisikan dalam skema ini (atau skema lain yang ditunjukkan oleh namespace yang ditentukan). |
| [set_MemberTypes](./set_membertypes/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | Mengatur array nama anggota yang memenuhi syarat dari tipe data bawaan atau elemen **simpleType** yang didefinisikan dalam skema ini (atau skema lain yang ditunjukkan oleh namespace yang ditentukan). |
| [XmlSchemaSimpleTypeUnion](./xmlschemasimpletypeunion/)() | Menginisialisasi instance baru dari kelas [XmlSchemaSimpleTypeUnion](./). |
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
