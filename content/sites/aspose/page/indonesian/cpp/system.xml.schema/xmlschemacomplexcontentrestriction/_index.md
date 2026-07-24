---
title: "kelas System::Xml::Schema::XmlSchemaComplexContentRestriction"
linktitle: "XmlSchemaComplexContentRestriction"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Xml::Schema::XmlSchemaComplexContentRestriction. Mewakili elemen restriction dari XML Schema sebagaimana ditentukan oleh World Wide Web Consortium (W3C). Kelas ini untuk tipe kompleks dengan model konten kompleks yang diturunkan melalui pembatasan. Ini membatasi isi tipe kompleks ke subset dari tipe kompleks yang diwarisi dalam C++."
type: docs
weight: 2000
url: /id/cpp/system.xml.schema/xmlschemacomplexcontentrestriction/
---
## XmlSchemaComplexContentRestriction class


Mewakili elemen **restriction** dari XML [Schema](../) sebagaimana ditentukan oleh World Wide [Web](../../system.web/) Consortium (W3C). Kelas ini untuk tipe kompleks dengan model konten kompleks yang diturunkan melalui pembatasan. Ini membatasi isi tipe kompleks ke subset dari tipe kompleks yang diwarisi.

```cpp
class XmlSchemaComplexContentRestriction : public System::Xml::Schema::XmlSchemaContent
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Mengembalikan komponen [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) dari model konten kompleks. |
| [get_Attributes](./get_attributes/)() | Mengembalikan koleksi atribut untuk tipe kompleks. Berisi elemen [XmlSchemaAttribute](../xmlschemaattribute/) dan [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_BaseTypeName](./get_basetypename/)() | Mengembalikan nama tipe kompleks yang menjadi asal tipe ini melalui pembatasan. |
| [get_Particle](./get_particle/)() | Mengembalikan salah satu kelas [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), atau [XmlSchemaSequence](../xmlschemasequence/). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Mengatur komponen [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) dari model konten kompleks. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Mengatur nama tipe kompleks yang menjadi asal tipe ini melalui pembatasan. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | Mengatur salah satu kelas [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), atau [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaComplexContentRestriction](./xmlschemacomplexcontentrestriction/)() | Menginisialisasi sebuah instance baru dari kelas [XmlSchemaComplexContentRestriction](./). |
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
