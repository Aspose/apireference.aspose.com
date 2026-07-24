---
title: "Kelas System::Xml::Schema::XmlSchemaSimpleTypeList"
linktitle: "XmlSchemaSimpleTypeList"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::Schema::XmlSchemaSimpleTypeList. Mewakili elemen list dari XML Schema sebagaimana ditentukan oleh World Wide Web Consortium (W3C). Kelas ini dapat digunakan untuk mendefinisikan elemen simpleType sebagai daftar nilai dari tipe data tertentu dalam C++."
type: docs
weight: 6400
url: /id/cpp/system.xml.schema/xmlschemasimpletypelist/
---
## XmlSchemaSimpleTypeList class


Mewakili elemen **list** dari XML [Schema](../) sebagaimana ditentukan oleh World Wide [Web](../../system.web/) Consortium (W3C). Kelas ini dapat digunakan untuk mendefinisikan elemen **simpleType** sebagai daftar nilai dari tipe data tertentu.

```cpp
class XmlSchemaSimpleTypeList : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_BaseItemType](./get_baseitemtype/)() | Mengembalikan [XmlSchemaSimpleType](../xmlschemasimpletype/) yang mewakili tipe elemen **simpleType** berdasarkan nilai [XmlSchemaSimpleTypeList::get_ItemType](./get_itemtype/) dan [XmlSchemaSimpleTypeList::get_ItemTypeName](./get_itemtypename/) dari tipe sederhana. |
| [get_ItemType](./get_itemtype/)() | Mengembalikan elemen **simpleType** yang diturunkan dari tipe yang ditentukan oleh nilai dasar. |
| [get_ItemTypeName](./get_itemtypename/)() | Mengembalikan nama tipe data bawaan atau elemen **simpleType** yang didefinisikan dalam skema ini (atau skema lain yang ditunjukkan oleh ruang nama yang ditentukan). |
| [set_BaseItemType](./set_baseitemtype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Mengatur [XmlSchemaSimpleType](../xmlschemasimpletype/) yang mewakili tipe elemen **simpleType** berdasarkan nilai [XmlSchemaSimpleTypeList::get_ItemType](./get_itemtype/) dan [XmlSchemaSimpleTypeList::get_ItemTypeName](./get_itemtypename/) dari tipe sederhana. |
| [set_ItemType](./set_itemtype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Mengatur elemen **simpleType** yang diturunkan dari tipe yang ditentukan oleh nilai dasar. |
| [set_ItemTypeName](./set_itemtypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Mengatur nama tipe data bawaan atau elemen **simpleType** yang didefinisikan dalam skema ini (atau skema lain yang ditunjukkan oleh ruang nama yang ditentukan). |
| [XmlSchemaSimpleTypeList](./xmlschemasimpletypelist/)() | Menginisialisasi instance baru dari kelas [XmlSchemaSimpleTypeList](./). |
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
