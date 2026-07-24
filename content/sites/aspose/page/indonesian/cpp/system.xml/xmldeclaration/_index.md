---
title: "System::Xml::XmlDeclaration kelas"
linktitle: "XmlDeclaration"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlDeclaration kelas. Mewakili node deklarasi XML <?xml version=''1.0''...?> dalam C++."
type: docs
weight: 1300
url: /id/cpp/system.xml/xmldeclaration/
---
## XmlDeclaration class


Mewakili node deklarasi XML **<?xml version='1.0'...?>**.

```cpp
class XmlDeclaration : public System::Xml::XmlLinkedNode
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Membuat duplikat dari node ini. |
| [get_Encoding](./get_encoding/)() | Mengembalikan tingkat enkoding dokumen XML. |
| [get_InnerText](./get_innertext/)() override | Mengembalikan nilai yang digabungkan dari [XmlDeclaration](./). |
| [get_LocalName](./get_localname/)() override | Mengembalikan nama lokal dari node. |
| [get_Name](./get_name/)() override | Mengembalikan nama lengkap dari node. |
| [get_NodeType](./get_nodetype/)() override | Mengembalikan tipe dari node saat ini. |
| [get_Standalone](./get_standalone/)() | Mengembalikan nilai atribut standalone. |
| [get_Value](./get_value/)() override | Mengembalikan nilai dari [XmlDeclaration](./). |
| [get_Version](./get_version/)() | Mengembalikan versi XML dari dokumen. |
| [set_Encoding](./set_encoding/)(const String\&) | Mengatur tingkat enkoding dokumen XML. |
| [set_InnerText](./set_innertext/)(String) override | Mengatur nilai yang digabungkan dari [XmlDeclaration](./). |
| [set_Standalone](./set_standalone/)(const String\&) | Mengatur nilai atribut standalone. |
| [set_Value](./set_value/)(String) override | Mengatur nilai dari [XmlDeclaration](./). |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Menyimpan anak node ke [XmlWriter](../xmlwriter/) yang ditentukan. Karena node [XmlDeclaration](./) tidak memiliki anak, metode ini tidak berpengaruh. |
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
