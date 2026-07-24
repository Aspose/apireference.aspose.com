---
title: "System::Xml::Schema::XmlSchemaComplexContentExtension kelas"
linktitle: "XmlSchemaComplexContentExtension"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlSchemaComplexContentExtension kelas. Mewakili elemen extension dari XML Schema sebagaimana ditentukan oleh Konsorsium World Wide Web (W3C). Kelas ini untuk tipe kompleks dengan model konten kompleks yang diturunkan melalui ekstensi. Kelas ini memperluas tipe kompleks dengan menambahkan atribut atau elemen dalam C++."
type: docs
weight: 1900
url: /id/cpp/system.xml.schema/xmlschemacomplexcontentextension/
---
## XmlSchemaComplexContentExtension class


Mewakili elemen **extension** dari XML [Schema](../) sebagaimana ditentukan oleh Konsorsium World Wide [Web](../../system.web/) (W3C). Kelas ini untuk tipe kompleks dengan model konten kompleks yang diturunkan melalui ekstensi. Kelas ini memperluas tipe kompleks dengan menambahkan atribut atau elemen.

```cpp
class XmlSchemaComplexContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Mengembalikan komponen [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) dari model konten kompleks. |
| [get_Attributes](./get_attributes/)() | Mengembalikan koleksi atribut untuk konten kompleks. Berisi elemen [XmlSchemaAttribute](../xmlschemaattribute/) dan [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_BaseTypeName](./get_basetypename/)() | Mengembalikan nama tipe kompleks dari mana tipe ini diturunkan melalui ekstensi. |
| [get_Particle](./get_particle/)() | Mengembalikan salah satu kelas [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), atau [XmlSchemaSequence](../xmlschemasequence/). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Mengatur komponen [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) dari model konten kompleks. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Mengatur nama tipe kompleks dari mana tipe ini diturunkan melalui ekstensi. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | Mengatur salah satu kelas [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), atau [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaComplexContentExtension](./xmlschemacomplexcontentextension/)() | Menginisialisasi instance baru dari kelas [XmlSchemaComplexContentExtension](./). |
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
