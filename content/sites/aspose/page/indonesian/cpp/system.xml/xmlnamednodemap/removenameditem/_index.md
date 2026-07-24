---
title: "System::Xml::XmlNamedNodeMap::RemoveNamedItem method"
linktitle: "RemoveNamedItem"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlNamedNodeMap::RemoveNamedItem method. Menghapus sebuah node dengan nilai XmlNode::get_LocalName dan XmlNode::get_NamespaceURI yang cocok dalam C++."
type: docs
weight: 900
url: /id/cpp/system.xml/xmlnamednodemap/removenameditem/
---
## XmlNamedNodeMap::RemoveNamedItem(String, String) method


Menghapus sebuah node dengan nilai [XmlNode::get_LocalName](../../xmlnode/get_localname/) dan [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) yang cocok.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String localName, String namespaceURI)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| localName | String | Nama lokal node yang akan dihapus. |
| namespaceURI | String | URI namespace dari node yang akan dihapus. |

### ReturnValue

[XmlNode](../../xmlnode/) yang dihapus atau **nullptr** jika node yang cocok tidak ditemukan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNamedNodeMap::RemoveNamedItem(String) method


Menghapus node dari [XmlNamedNodeMap](../).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String name)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Nama lengkap node yang akan dihapus. Nama ini dicocokkan dengan nilai [XmlNode::get_Name](../../xmlnode/get_name/) dari node yang cocok. |

### ReturnValue

[XmlNode](../../xmlnode/) yang dihapus dari [XmlNamedNodeMap](../) ini atau **nullptr** jika node yang cocok tidak ditemukan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
