---
title: "Kelas System::Xml::XmlDocumentFragment"
linktitle: "XmlDocumentFragment"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::XmlDocumentFragment. Mewakili objek ringan yang berguna untuk operasi penyisipan pohon dalam C++."
type: docs
weight: 1500
url: /id/cpp/system.xml/xmldocumentfragment/
---
## XmlDocumentFragment class


Mewakili objek ringan yang berguna untuk operasi penyisipan pohon.

```cpp
class XmlDocumentFragment : public System::Xml::XmlNode
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Membuat duplikat dari node ini. |
| [get_InnerXml](./get_innerxml/)() override | Mengembalikan markup yang mewakili anak-anak node ini. |
| [get_LocalName](./get_localname/)() override | Mengembalikan nama lokal dari node. |
| [get_Name](./get_name/)() override | Mengembalikan nama lengkap dari node. |
| [get_NodeType](./get_nodetype/)() override | Mengembalikan tipe dari node saat ini. |
| [get_OwnerDocument](./get_ownerdocument/)() override | Mengembalikan [XmlDocument](../xmldocument/) yang menjadi milik node ini. |
| [set_InnerXml](./set_innerxml/)(String) override | Menetapkan markup yang mewakili anak-anak node ini. |
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
