---
title: "Kelas System::Xml::XmlDocumentType"
linktitle: "XmlDocumentType"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::XmlDocumentType. Mewakili deklarasi tipe dokumen dalam C++."
type: docs
weight: 1600
url: /id/cpp/system.xml/xmldocumenttype/
---
## XmlDocumentType class


Mewakili deklarasi tipe dokumen.

```cpp
class XmlDocumentType : public System::Xml::XmlLinkedNode
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Membuat duplikat dari node ini. |
| [get_Entities](./get_entities/)() | Mengembalikan koleksi node [XmlEntity](../xmlentity/) yang dideklarasikan dalam deklarasi tipe dokumen. |
| [get_InternalSubset](./get_internalsubset/)() | Mengembalikan nilai subset internal definisi tipe dokumen (DTD) pada deklarasi DOCTYPE. |
| [get_IsReadOnly](./get_isreadonly/)() override | Mengembalikan nilai yang menunjukkan apakah node bersifat read-only. |
| [get_LocalName](./get_localname/)() override | Mengembalikan nama lokal dari node. |
| [get_Name](./get_name/)() override | Mengembalikan nama lengkap dari node. |
| [get_NodeType](./get_nodetype/)() override | Mengembalikan tipe dari node saat ini. |
| [get_Notations](./get_notations/)() | Mengembalikan koleksi node [XmlNotation](../xmlnotation/) yang ada dalam deklarasi tipe dokumen. |
| [get_PublicId](./get_publicid/)() | Mengembalikan nilai pengenal publik pada deklarasi DOCTYPE. |
| [get_SystemId](./get_systemid/)() | Mengembalikan nilai pengenal sistem pada deklarasi DOCTYPE. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Menyimpan semua anak node ke [XmlWriter](../xmlwriter/) yang ditentukan. Untuk node [XmlDocumentType](./), metode ini tidak berpengaruh. |
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
