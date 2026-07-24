---
title: "System::Xml::XmlNodeChangedEventArgs class"
linktitle: "XmlNodeChangedEventArgs"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::XmlNodeChangedEventArgs. Menyediakan data untuk peristiwa XmlDocument::NodeChanged, XmlDocument::NodeChanging, XmlDocument::NodeInserted, XmlDocument::NodeInserting, XmlDocument::NodeRemoved, dan XmlDocument::NodeRemoving dalam C++."
type: docs
weight: 2600
url: /id/cpp/system.xml/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs class


Menyediakan data untuk peristiwa **XmlDocument::NodeChanged**, **XmlDocument::NodeChanging**, **XmlDocument::NodeInserted**, **XmlDocument::NodeInserting**, **XmlDocument::NodeRemoved**, dan **XmlDocument::NodeRemoving**.

```cpp
class XmlNodeChangedEventArgs : public System::EventArgs
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Action](./get_action/)() | Mengembalikan nilai yang menunjukkan jenis peristiwa perubahan node yang terjadi. |
| [get_NewParent](./get_newparent/)() | Mengembalikan nilai dari [XmlNode::get_ParentNode](../xmlnode/get_parentnode/) setelah operasi selesai. |
| [get_NewValue](./get_newvalue/)() | Mengembalikan nilai baru dari node. |
| [get_Node](./get_node/)() | Mengembalikan [XmlNode](../xmlnode/) yang sedang ditambahkan, dihapus, atau diubah. |
| [get_OldParent](./get_oldparent/)() | Mengembalikan nilai dari [XmlNode::get_ParentNode](../xmlnode/get_parentnode/) sebelum operasi dimulai. |
| [get_OldValue](./get_oldvalue/)() | Mengembalikan nilai asli node. |
| [XmlNodeChangedEventArgs](./xmlnodechangedeventargs/)(const SharedPtr\<XmlNode\>\&, const SharedPtr\<XmlNode\>\&, const SharedPtr\<XmlNode\>\&, const String\&, const String\&, XmlNodeChangedAction) | Menginisialisasi instance baru dari kelas [XmlNodeChangedEventArgs](./). |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Anggota statis yang mewakili sebuah [EventArgs](../../system/eventargs/) pointer bersama "kosong" (null-pointer). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
