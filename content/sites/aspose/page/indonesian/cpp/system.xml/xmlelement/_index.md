---
title: "Kelas System::Xml::XmlElement"
linktitle: "XmlElement"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::XmlElement. Mewakili sebuah elemen dalam C++."
type: docs
weight: 1700
url: /id/cpp/system.xml/xmlelement/
---
## XmlElement class


Mewakili sebuah elemen.

```cpp
class XmlElement : public System::Xml::XmlLinkedNode
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Membuat duplikat dari node ini. |
| virtual [get_HasAttributes](./get_hasattributes/)() | Mengembalikan nilai **bool** yang menunjukkan apakah node saat ini memiliki atribut apa pun. |
| [get_InnerText](./get_innertext/)() override | Mengembalikan nilai yang digabungkan dari node dan semua anaknya. |
| [get_InnerXml](./get_innerxml/)() override | Mengembalikan markup yang mewakili hanya anak-anak node ini. |
| [get_IsEmpty](./get_isempty/)() | Mengembalikan format tag dari elemen. |
| [get_LocalName](./get_localname/)() override | Mengembalikan nama lokal dari node saat ini. |
| [get_Name](./get_name/)() override | Mengembalikan nama lengkap dari node. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Mengembalikan URI namespace dari node ini. |
| [get_NodeType](./get_nodetype/)() override | Mengembalikan tipe dari node saat ini. |
| [get_OwnerDocument](./get_ownerdocument/)() override | Mengembalikan [XmlDocument](../xmldocument/) yang menjadi milik node ini. |
| [get_Prefix](./get_prefix/)() override | Mengembalikan prefiks namespace dari node ini. |
| [get_SchemaInfo](./get_schemainfo/)() override | Mengembalikan infoset validasi skema pasca yang telah diberikan ke node ini sebagai hasil dari validasi skema. |
| virtual [GetAttribute](./getattribute/)(String) | Mengembalikan nilai untuk atribut dengan nama yang ditentukan. |
| virtual [GetAttribute](./getattribute/)(String, String) | Mengembalikan nilai untuk atribut dengan nama lokal dan URI namespace yang ditentukan. |
| virtual [GetAttributeNode](./getattributenode/)(String) | Mengembalikan [XmlAttribute](../xmlattribute/) dengan nama yang ditentukan. |
| virtual [GetAttributeNode](./getattributenode/)(String, String) | Mengembalikan [XmlAttribute](../xmlattribute/) dengan nama lokal dan URI namespace yang ditentukan. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String) | Mengembalikan sebuah [XmlNodeList](../xmlnodelist/) yang berisi daftar semua elemen turunan yang cocok dengan [XmlElement::get_Name](./get_name/) yang ditentukan. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String, String) | Mengembalikan sebuah [XmlNodeList](../xmlnodelist/) yang berisi daftar semua elemen turunan yang cocok dengan nilai [XmlElement::get_LocalName](./get_localname/) dan [XmlElement::get_NamespaceURI](./get_namespaceuri/) yang ditentukan. |
| virtual [HasAttribute](./hasattribute/)(String) | Menentukan apakah node saat ini memiliki atribut dengan nama yang ditentukan. |
| virtual [HasAttribute](./hasattribute/)(String, String) | Menentukan apakah node saat ini memiliki atribut dengan nama lokal dan URI namespace yang ditentukan. |
| [RemoveAll](./removeall/)() override | Menghapus semua atribut dan anak yang ditentukan dari node saat ini. Atribut default tidak dihapus. |
| virtual [RemoveAllAttributes](./removeallattributes/)() | Menghapus semua atribut yang ditentukan dari elemen. Atribut default tidak dihapus. |
| virtual [RemoveAttribute](./removeattribute/)(String) | Menghapus sebuah atribut berdasarkan nama. |
| virtual [RemoveAttribute](./removeattribute/)(String, String) | Menghapus atribut dengan nama lokal dan URI namespace yang ditentukan. (Jika atribut yang dihapus memiliki nilai default, maka akan segera diganti). |
| virtual [RemoveAttributeAt](./removeattributeat/)(int32_t) | Menghapus node atribut dengan indeks yang ditentukan dari elemen. (Jika atribut yang dihapus memiliki nilai default, maka akan segera diganti). |
| virtual [RemoveAttributeNode](./removeattributenode/)(SharedPtr\<XmlAttribute\>) | Menghapus [XmlAttribute](../xmlattribute/) yang ditentukan. |
| virtual [RemoveAttributeNode](./removeattributenode/)(String, String) | Menghapus [XmlAttribute](../xmlattribute/) yang ditentukan oleh nama lokal dan URI namespace. (Jika atribut yang dihapus memiliki nilai default, maka akan segera diganti). |
| [set_InnerText](./set_innertext/)(String) override | Mengatur nilai yang digabungkan dari node dan semua anaknya. |
| [set_InnerXml](./set_innerxml/)(String) override | Mengatur markup yang mewakili hanya anak-anak node ini. |
| [set_IsEmpty](./set_isempty/)(bool) | Mengatur format tag elemen. |
| [set_Prefix](./set_prefix/)(String) override | Mengatur prefiks namespace node ini. |
| virtual [SetAttribute](./setattribute/)(String, String) | Mengatur nilai atribut dengan nama yang ditentukan. |
| virtual [SetAttribute](./setattribute/)(String, String, String) | Mengatur nilai atribut dengan nama lokal dan URI namespace yang ditentukan. |
| virtual [SetAttributeNode](./setattributenode/)(SharedPtr\<XmlAttribute\>) | Menambahkan [XmlAttribute](../xmlattribute/) yang ditentukan. |
| virtual [SetAttributeNode](./setattributenode/)(String, String) | Menambahkan [XmlAttribute](../xmlattribute/) yang ditentukan. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Menyimpan semua anak node ke [XmlWriter](../xmlwriter/) yang ditentukan. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Menyimpan node saat ini ke [XmlWriter](../xmlwriter/) yang ditentukan. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
