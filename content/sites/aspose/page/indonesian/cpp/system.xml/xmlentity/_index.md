---
title: "System::Xml::XmlEntity class"
linktitle: "XmlEntity"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlEntity class. Mewakili deklarasi entitas, seperti <!ENTITY... > dalam C++."
type: docs
weight: 1800
url: /id/cpp/system.xml/xmlentity/
---
## XmlEntity class


Mewakili deklarasi entitas, seperti **<!ENTITY... >**.

```cpp
class XmlEntity : public System::Xml::XmlNode
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Membuat duplikat dari node ini. Node entitas tidak dapat dikloning. Memanggil metode ini pada objek [XmlEntity](./) akan melemparkan pengecualian. |
| [get_BaseURI](./get_baseuri/)() override | Mengembalikan Uniform Resource Identifier (URI) dasar dari node saat ini. |
| [get_InnerText](./get_innertext/)() override | Mengembalikan nilai yang digabungkan dari node entitas dan semua anaknya. |
| [get_InnerXml](./get_innerxml/)() override | Mengembalikan markup yang mewakili anak-anak node ini. |
| [get_IsReadOnly](./get_isreadonly/)() override | Mengembalikan nilai yang menunjukkan apakah node bersifat read-only. |
| [get_LocalName](./get_localname/)() override | Mengembalikan nama node tanpa prefiks namespace. |
| [get_Name](./get_name/)() override | Mengembalikan nama node. |
| [get_NodeType](./get_nodetype/)() override | Mengembalikan tipe dari node. |
| [get_NotationName](./get_notationname/)() | Mengembalikan nama atribut NDATA opsional pada deklarasi entitas. |
| [get_OuterXml](./get_outerxml/)() override | Mengembalikan markup yang mewakili node ini dan semua anaknya. |
| [get_PublicId](./get_publicid/)() | Mengembalikan nilai pengidentifikasi publik pada deklarasi entitas. |
| [get_SystemId](./get_systemid/)() | Mengembalikan nilai pengidentifikasi sistem pada deklarasi entitas. |
| [set_InnerText](./set_innertext/)(String) override | Mengatur nilai yang digabungkan dari node entitas dan semua anaknya. |
| [set_InnerXml](./set_innerxml/)(String) override | Menetapkan markup yang mewakili anak-anak node ini. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Menyimpan semua anak node ke [XmlWriter](../xmlwriter/) yang ditentukan. Untuk node [XmlEntity](./), metode ini tidak berpengaruh. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Menyimpan node ke [XmlWriter](../xmlwriter/) yang ditentukan. Untuk node [XmlEntity](./), metode ini tidak berpengaruh. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
