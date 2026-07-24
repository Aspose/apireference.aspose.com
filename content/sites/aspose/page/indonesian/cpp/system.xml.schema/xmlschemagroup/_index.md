---
title: "kelas System::Xml::Schema::XmlSchemaGroup"
linktitle: "XmlSchemaGroup"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Xml::Schema::XmlSchemaGroup. Mewakili elemen group dari XML Schema sebagaimana ditentukan oleh World Wide Web Consortium (W3C). Kelas ini mendefinisikan grup pada tingkat skema yang direferensikan dari tipe kompleks. Ia mengelompokkan sekumpulan deklarasi elemen sehingga dapat dimasukkan sebagai grup ke dalam definisi tipe kompleks dalam C++."
type: docs
weight: 3100
url: /id/cpp/system.xml.schema/xmlschemagroup/
---
## XmlSchemaGroup class


Mewakili elemen **group** dari XML [Schema](../) sebagaimana ditentukan oleh World Wide [Web](../../system.web/) Consortium (W3C). Kelas ini mendefinisikan grup pada tingkat **schema** yang direferensikan dari tipe kompleks. Ia mengelompokkan sekumpulan deklarasi elemen sehingga dapat dimasukkan sebagai grup ke dalam definisi tipe kompleks.

```cpp
class XmlSchemaGroup : public System::Xml::Schema::XmlSchemaAnnotated
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Name](./get_name/)() | Mengembalikan nama grup skema. |
| [get_Particle](./get_particle/)() | Mengembalikan salah satu kelas [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), atau [XmlSchemaSequence](../xmlschemasequence/). |
| [get_QualifiedName](./get_qualifiedname/)() | Mengembalikan nama terkualifikasi dari grup skema. |
| [set_Name](./set_name/)(const String\&) | Mengatur nama grup skema. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaGroupBase\>\&) | Mengatur salah satu kelas [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), atau [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaGroup](./xmlschemagroup/)() | Menginisialisasi instance baru dari kelas [XmlSchemaGroup](./). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
