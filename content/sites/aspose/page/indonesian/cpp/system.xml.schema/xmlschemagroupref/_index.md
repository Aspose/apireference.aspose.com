---
title: "System::Xml::Schema::XmlSchemaGroupRef class"
linktitle: "XmlSchemaGroupRef"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlSchemaGroupRef class. Mewakili elemen group dengan atribut ref dari XML Schema sebagaimana ditentukan oleh World Wide Web Consortium (W3C). Kelas ini digunakan dalam tipe kompleks yang merujuk ke group yang didefinisikan pada tingkat schema dalam C++."
type: docs
weight: 3300
url: /id/cpp/system.xml.schema/xmlschemagroupref/
---
## XmlSchemaGroupRef class


Mewakili elemen **group** dengan atribut **ref** dari XML [Schema](../) sebagaimana ditentukan oleh World Wide [Web](../../system.web/) Consortium (W3C). Kelas ini digunakan dalam tipe kompleks yang merujuk ke **group** yang didefinisikan pada tingkat **schema**.

```cpp
class XmlSchemaGroupRef : public System::Xml::Schema::XmlSchemaParticle
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Particle](./get_particle/)() | Mengembalikan salah satu kelas [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), atau [XmlSchemaSequence](../xmlschemasequence/), yang menyimpan interpretasi pasca-kompilasi nilai **Particle**. |
| [get_RefName](./get_refname/)() | Mengembalikan nama grup yang didefinisikan dalam skema ini (atau skema lain yang ditunjukkan oleh namespace yang ditentukan). |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Mengatur nama grup yang didefinisikan dalam skema ini (atau skema lain yang ditunjukkan oleh namespace yang ditentukan). |
| [XmlSchemaGroupRef](./xmlschemagroupref/)() | Menginisialisasi instance baru dari kelas [XmlSchemaGroupRef](./). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlSchemaParticle](../xmlschemaparticle/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
