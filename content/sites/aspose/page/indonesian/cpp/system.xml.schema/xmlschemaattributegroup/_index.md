---
title: "System::Xml::Schema::XmlSchemaAttributeGroup kelas"
linktitle: "XmlSchemaAttributeGroup"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlSchemaAttributeGroup kelas. Mewakili elemen attributeGroup dari XML Schema sebagaimana ditentukan oleh World Wide Web Consortium (W3C). AttributesGroups menyediakan mekanisme untuk mengelompokkan sekumpulan deklarasi atribut sehingga dapat dimasukkan sebagai grup ke dalam definisi tipe kompleks dalam C++."
type: docs
weight: 1200
url: /id/cpp/system.xml.schema/xmlschemaattributegroup/
---
## XmlSchemaAttributeGroup class


Mewakili elemen **attributeGroup** dari XML [Schema](../) sebagaimana ditentukan oleh Konsorsium World Wide [Web](../../system.web/) (W3C). AttributesGroups menyediakan mekanisme untuk mengelompokkan sekumpulan deklarasi atribut sehingga dapat dimasukkan sebagai grup ke dalam definisi tipe kompleks.

```cpp
class XmlSchemaAttributeGroup : public System::Xml::Schema::XmlSchemaAnnotated
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Mengembalikan komponen [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) dari grup atribut. |
| [get_Attributes](./get_attributes/)() | Mengembalikan koleksi atribut untuk grup atribut. Berisi elemen [XmlSchemaAttribute](../xmlschemaattribute/) dan [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_Name](./get_name/)() | Mengembalikan nama grup atribut. |
| [get_QualifiedName](./get_qualifiedname/)() | Mengembalikan nama lengkap grup atribut. |
| [get_RedefinedAttributeGroup](./get_redefinedattributegroup/)() | Mengembalikan properti grup atribut yang didefinisikan ulang dari XML [Schema](../). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Mengatur komponen [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) dari grup atribut. |
| [set_Name](./set_name/)(const String\&) | Mengatur nama grup atribut. |
| [XmlSchemaAttributeGroup](./xmlschemaattributegroup/)() | Menginisialisasi instance baru dari kelas [XmlSchemaAttributeGroup](./). |
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
