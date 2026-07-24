---
title: "System::Xml::XmlNamedNodeMap::SetNamedItem metode"
linktitle: "SetNamedItem"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Xml::XmlNamedNodeMap::SetNamedItem. Menambahkan sebuah XmlNode menggunakan nilai XmlNode::get_Name-nya di C++."
type: docs
weight: 1000
url: /id/cpp/system.xml/xmlnamednodemap/setnameditem/
---
## XmlNamedNodeMap::SetNamedItem method


Menambahkan sebuah [XmlNode](../../xmlnode/) menggunakan nilai [XmlNode::get_Name](../../xmlnode/get_name/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::SetNamedItem(SharedPtr<XmlNode> node)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| node | SharedPtr\<XmlNode\> | Sebuah [XmlNode](../../xmlnode/) untuk disimpan dalam [XmlNamedNodeMap](../). Jika sebuah node dengan nama itu sudah ada di dalam peta, maka akan digantikan oleh yang baru. |

### ReturnValue

Jika **node** menggantikan node yang ada dengan nama yang sama, node lama akan dikembalikan; jika tidak, **nullptr** akan dikembalikan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
