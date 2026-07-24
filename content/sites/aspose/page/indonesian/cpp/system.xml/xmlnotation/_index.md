---
title: "Kelas System::Xml::XmlNotation"
linktitle: "XmlNotation"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::XmlNotation. Mewakili deklarasi notasi, seperti <!NOTATION... > dalam C++."
type: docs
weight: 2900
url: /id/cpp/system.xml/xmlnotation/
---
## XmlNotation class


Mewakili deklarasi notasi, seperti **<!NOTATION... >**.

```cpp
class XmlNotation : public System::Xml::XmlNode
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Membuat duplikat dari node ini. Node notasi tidak dapat digandakan. Memanggil metode ini pada objek [XmlNotation](./) akan melemparkan pengecualian. |
| [get_InnerXml](./get_innerxml/)() override | Mengembalikan markup yang mewakili anak-anak node ini. |
| [get_IsReadOnly](./get_isreadonly/)() override | Mengembalikan nilai yang menunjukkan apakah node bersifat read-only. |
| [get_LocalName](./get_localname/)() override | Mengembalikan nama node saat ini tanpa awalan namespace. |
| [get_Name](./get_name/)() override | Mengembalikan nama node saat ini. |
| [get_NodeType](./get_nodetype/)() override | Mengembalikan tipe dari node saat ini. |
| [get_OuterXml](./get_outerxml/)() override | Mengembalikan markup yang mewakili node ini dan semua anaknya. |
| [get_PublicId](./get_publicid/)() | Mengembalikan nilai pengidentifikasi publik pada deklarasi notasi. |
| [get_SystemId](./get_systemid/)() | Mengembalikan nilai pengidentifikasi sistem pada deklarasi notasi. |
| [set_InnerXml](./set_innerxml/)(String) override | Menetapkan markup yang mewakili anak-anak node ini. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Menyimpan anak-anak node ke [XmlWriter](../xmlwriter/) yang ditentukan. Metode ini tidak berpengaruh pada node [XmlNotation](./). |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Menyimpan node ke [XmlWriter](../xmlwriter/) yang ditentukan. Metode ini tidak berpengaruh pada node [XmlNotation](./). |
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
