---
title: "kelas System::Xml::Schema::XmlSchemaComplexType"
linktitle: "XmlSchemaComplexType"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Xml::Schema::XmlSchemaComplexType. Mewakili elemen complexType dari XML Schema sebagaimana ditentukan oleh World Wide Web Consortium (W3C). Kelas ini mendefinisikan tipe kompleks yang menentukan kumpulan atribut dan konten sebuah elemen dalam C++."
type: docs
weight: 2100
url: /id/cpp/system.xml.schema/xmlschemacomplextype/
---
## XmlSchemaComplexType class


Mewakili elemen **complexType** dari XML [Schema](../) sebagaimana ditentukan oleh World Wide [Web](../../system.web/) Consortium (W3C). Kelas ini mendefinisikan tipe kompleks yang menentukan kumpulan atribut dan konten sebuah elemen.

```cpp
class XmlSchemaComplexType : public System::Xml::Schema::XmlSchemaType
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Mengembalikan nilai untuk komponen [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) dari tipe kompleks. |
| [get_Attributes](./get_attributes/)() | Mengembalikan koleksi atribut untuk tipe kompleks. |
| [get_AttributeUses](./get_attributeuses/)() | Mengembalikan koleksi semua atribut yang telah dikompilasi dari tipe kompleks ini dan tipe dasarnya. |
| [get_AttributeWildcard](./get_attributewildcard/)() | Mengembalikan nilai pasca-kompilasi untuk **anyAttribute** pada tipe kompleks ini dan tipe dasar-nya. |
| [get_Block](./get_block/)() | Mengembalikan atribut **block**. |
| [get_BlockResolved](./get_blockresolved/)() | Mengembalikan nilai setelah tipe dikompilasi menjadi set informasi pasca-validasi skema (infoset). Nilai ini menunjukkan bagaimana tipe ditegakkan ketika **xsi:type** digunakan dalam dokumen instance. |
| [get_ContentModel](./get_contentmodel/)() | Mengembalikan [XmlSchemaContentModel](../xmlschemacontentmodel/) pasca-kompilasi dari tipe kompleks ini. |
| [get_ContentType](./get_contenttype/)() | Mengembalikan model konten dari tipe kompleks yang menyimpan nilai pasca-kompilasi. |
| [get_ContentTypeParticle](./get_contenttypeparticle/)() | Mengembalikan partikel yang menyimpan nilai pasca-kompilasi dari partikel [XmlSchemaComplexType::get_ContentType](./get_contenttype/). |
| [get_IsAbstract](./get_isabstract/)() | Mengembalikan informasi yang menentukan apakah elemen **complexType** dapat digunakan dalam dokumen instance. |
| [get_IsMixed](./get_ismixed/)() override | Mengembalikan informasi yang menentukan apakah tipe kompleks memiliki model konten campuran (markup di dalam konten). |
| [get_Particle](./get_particle/)() | Mengembalikan tipe kompositor sebagai salah satu kelas [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), atau [XmlSchemaSequence](../xmlschemasequence/). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Menetapkan nilai untuk komponen [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) dari tipe kompleks. |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | Menetapkan atribut **block**. |
| [set_ContentModel](./set_contentmodel/)(const SharedPtr\<XmlSchemaContentModel\>\&) | Menetapkan [XmlSchemaContentModel](../xmlschemacontentmodel/) pasca-kompilasi untuk tipe kompleks ini. |
| [set_IsAbstract](./set_isabstract/)(bool) | Menetapkan informasi yang menentukan apakah elemen **complexType** dapat digunakan dalam dokumen instance. |
| [set_IsMixed](./set_ismixed/)(bool) override | Menetapkan informasi yang menentukan apakah tipe kompleks memiliki model konten campuran (markup di dalam konten). |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | Menetapkan tipe kompositor sebagai salah satu kelas [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), atau [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaComplexType](./xmlschemacomplextype/)() | Menginisialisasi sebuah instance baru dari kelas [XmlSchemaComplexType](./). |
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
