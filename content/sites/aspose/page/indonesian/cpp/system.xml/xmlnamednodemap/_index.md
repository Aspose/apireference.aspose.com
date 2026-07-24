---
title: "Kelas System::Xml::XmlNamedNodeMap"
linktitle: "XmlNamedNodeMap"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::XmlNamedNodeMap. Mewakili kumpulan node yang dapat diakses berdasarkan nama atau indeks dalam C++."
type: docs
weight: 2200
url: /id/cpp/system.xml/xmlnamednodemap/
---
## XmlNamedNodeMap class


Mewakili kumpulan node yang dapat diakses berdasarkan nama atau indeks.

```cpp
class XmlNamedNodeMap : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [begin](./begin/)() const | Mendapatkan iterator ke elemen pertama dari koleksi. |
| [cbegin](./cbegin/)() const | Mendapatkan iterator ke elemen pertama dari koleksi. |
| [cend](./cend/)() const | Mendapatkan iterator untuk elemen yang tidak ada di belakang elemen terakhir koleksi. |
| [end](./end/)() const | Mendapatkan iterator untuk elemen yang tidak ada di belakang elemen terakhir koleksi. |
| virtual [get_Count](./get_count/)() | Mengembalikan jumlah node dalam [XmlNamedNodeMap](./). |
| [GetEnumerator](./getenumerator/)() override | Menyediakan dukungan untuk iterasi atas kumpulan node dalam [XmlNamedNodeMap](./). |
| virtual [GetNamedItem](./getnameditem/)(String) | Mengambil sebuah [XmlNode](../xmlnode/) yang ditentukan oleh nama. |
| virtual [GetNamedItem](./getnameditem/)(String, String) | Mengambil sebuah node dengan nilai [XmlNode::get_LocalName](../xmlnode/get_localname/) dan [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) yang cocok. |
| virtual [Item](./item/)(int32_t) | Mengambil node pada indeks yang ditentukan dalam [XmlNamedNodeMap](./). |
| virtual [RemoveNamedItem](./removenameditem/)(String) | Menghapus node dari [XmlNamedNodeMap](./). |
| virtual [RemoveNamedItem](./removenameditem/)(String, String) | Menghapus sebuah node dengan nilai [XmlNode::get_LocalName](../xmlnode/get_localname/) dan [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) yang cocok. |
| virtual [SetNamedItem](./setnameditem/)(SharedPtr\<XmlNode\>) | Menambahkan sebuah [XmlNode](../xmlnode/) menggunakan nilai [XmlNode::get_Name](../xmlnode/get_name/)nya. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [iterator](./iterator/) | Tipe iterator. |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
