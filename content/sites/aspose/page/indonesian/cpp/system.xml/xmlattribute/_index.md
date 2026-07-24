---
title: "System::Xml::XmlAttribute kelas"
linktitle: "XmlAttribute"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlAttribute kelas. Mewakili sebuah atribut. Nilai yang valid dan default untuk atribut didefinisikan dalam definisi tipe dokumen (DTD) atau skema dalam C++."
type: docs
weight: 600
url: /id/cpp/system.xml/xmlattribute/
---
## XmlAttribute class


Mewakili sebuah atribut. Nilai yang valid dan default untuk atribut tersebut didefinisikan dalam definisi tipe dokumen (DTD) atau skema.

```cpp
class XmlAttribute : public System::Xml::XmlNode
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [AppendChild](./appendchild/)(SharedPtr\<XmlNode\>) override | Menambahkan node yang ditentukan ke akhir daftar node anak, dari node ini. |
| [CloneNode](./clonenode/)(bool) override | Membuat duplikat dari node ini. |
| [get_BaseURI](./get_baseuri/)() override | Mengembalikan Uniform Resource Identifier (URI) dasar dari node. |
| [get_LocalName](./get_localname/)() override | Mengembalikan nama lokal dari node. |
| [get_Name](./get_name/)() override | Mengembalikan nama lengkap dari node. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Mengembalikan URI namespace dari node ini. |
| [get_NodeType](./get_nodetype/)() override | Mengembalikan tipe dari node saat ini. |
| [get_OwnerDocument](./get_ownerdocument/)() override | Mengembalikan [XmlDocument](../xmldocument/) yang menjadi milik node ini. |
| virtual [get_OwnerElement](./get_ownerelement/)() | Mengembalikan [XmlElement](../xmlelement/) tempat atribut tersebut berada. |
| [get_Prefix](./get_prefix/)() override | Mengembalikan prefiks namespace dari node ini. |
| [get_SchemaInfo](./get_schemainfo/)() override | Mengembalikan post-schema-validation-infoset yang telah diberikan ke node ini sebagai hasil dari validasi skema. |
| virtual [get_Specified](./get_specified/)() | Mengembalikan nilai yang menunjukkan apakah nilai atribut telah diatur secara eksplisit. |
| [get_Value](./get_value/)() override | Mengembalikan nilai dari node. |
| [InsertAfter](./insertafter/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | Menyisipkan node yang ditentukan tepat setelah node referensi yang ditentukan. |
| [InsertBefore](./insertbefore/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | Menyisipkan node yang ditentukan tepat sebelum node referensi yang ditentukan. |
| [PrependChild](./prependchild/)(SharedPtr\<XmlNode\>) override | Menambahkan node yang ditentukan ke awal daftar node anak untuk node ini. |
| [RemoveChild](./removechild/)(SharedPtr\<XmlNode\>) override | Menghapus node anak yang ditentukan. |
| [ReplaceChild](./replacechild/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | Mengganti node anak yang ditentukan dengan node anak baru yang ditentukan. |
| [set_InnerText](./set_innertext/)(String) override | Mengatur nilai yang digabungkan dari node dan semua anaknya. |
| [set_InnerXml](./set_innerxml/)(String) override | Mengatur nilai atribut. |
| [set_Prefix](./set_prefix/)(String) override | Mengatur prefiks namespace node ini. |
| [set_Value](./set_value/)(String) override | Mengatur nilai dari node. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Menyimpan semua anak node ke [XmlWriter](../xmlwriter/) yang ditentukan. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Menyimpan node ke [XmlWriter](../xmlwriter/) yang ditentukan. |
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
