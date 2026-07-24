---
title: "System::Xml::XmlEntityReference class"
linktitle: "XmlEntityReference"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlEntityReference class. Mewakili node referensi entitas dalam C++."
type: docs
weight: 1900
url: /id/cpp/system.xml/xmlentityreference/
---
## XmlEntityReference class


Mewakili node referensi entitas.

```cpp
class XmlEntityReference : public System::Xml::XmlLinkedNode
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Membuat duplikat dari node ini. |
| [get_BaseURI](./get_baseuri/)() override | Mengembalikan Uniform Resource Identifier (URI) dasar dari node saat ini. |
| [get_IsReadOnly](./get_isreadonly/)() override | Mengembalikan nilai yang menunjukkan apakah node bersifat read-only. |
| [get_LocalName](./get_localname/)() override | Mengembalikan nama lokal dari node. |
| [get_Name](./get_name/)() override | Mengembalikan nama node. |
| [get_NodeType](./get_nodetype/)() override | Mengembalikan tipe dari node. |
| [get_Value](./get_value/)() override | Mengembalikan nilai dari node. |
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

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
