---
title: "System::Xml::XmlNamedNodeMap::Item metode"
linktitle: "Item"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Xml::XmlNamedNodeMap::Item. Mengambil node pada indeks yang ditentukan dalam XmlNamedNodeMap di C++."
type: docs
weight: 800
url: /id/cpp/system.xml/xmlnamednodemap/item/
---
## XmlNamedNodeMap::Item method


Mengambil node pada indeks yang ditentukan dalam [XmlNamedNodeMap](../).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::Item(int32_t index)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| index | int32_t | Posisi indeks node yang akan diambil dari [XmlNamedNodeMap](../). Indeks bersifat berbasis nol; oleh karena itu, indeks node pertama adalah 0 dan indeks node terakhir adalah [XmlNamedNodeMap::get_Count](../get_count/) - 1. |

### ReturnValue

[XmlNode](../../xmlnode/) pada indeks yang ditentukan. Jika **index** kurang dari 0 atau lebih besar atau sama dengan nilai [XmlNamedNodeMap::get_Count](../get_count/), **nullptr** dikembalikan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
