---
title: "System::Xml::XmlAttributeCollection::SetNamedItem metode"
linktitle: "SetNamedItem"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlAttributeCollection::SetNamedItem metode. Menambahkan sebuah XmlNode menggunakan hasil XmlNode::get_Name dalam C++."
type: docs
weight: 1000
url: /id/cpp/system.xml/xmlattributecollection/setnameditem/
---
## XmlAttributeCollection::SetNamedItem method


Menambahkan sebuah [XmlNode](../../xmlnode/) menggunakan hasil [XmlNode::get_Name](../../xmlnode/get_name/).

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttributeCollection::SetNamedItem(SharedPtr<XmlNode> node) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| node | SharedPtr\<XmlNode\> | Sebuah node atribut untuk disimpan dalam koleksi ini. Node tersebut nantinya dapat diakses menggunakan nama node. Jika sebuah node dengan nama itu sudah ada dalam koleksi, node tersebut akan digantikan oleh yang baru; jika tidak, node akan ditambahkan ke akhir koleksi. |

### ReturnValue

Jika **node** menggantikan node yang ada dengan nama yang sama, node lama akan dikembalikan; jika tidak, node yang ditambahkan akan dikembalikan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
