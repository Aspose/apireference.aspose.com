---
title: "System::Xml::XmlNamedNodeMap::GetNamedItem method"
linktitle: "GetNamedItem"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlNamedNodeMap::GetNamedItem method. Mengambil sebuah node dengan nilai XmlNode::get_LocalName dan XmlNode::get_NamespaceURI yang cocok dalam C++."
type: docs
weight: 700
url: /id/cpp/system.xml/xmlnamednodemap/getnameditem/
---
## XmlNamedNodeMap::GetNamedItem(String, String) method


Mengambil sebuah node dengan nilai [XmlNode::get_LocalName](../../xmlnode/get_localname/) dan [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) yang cocok.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String localName, String namespaceURI)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| localName | String | Nama lokal node yang akan diambil. |
| namespaceURI | String | Uniform Resource Identifier (URI) namespace dari node yang akan diambil. |

### ReturnValue

Sebuah [XmlNode](../../xmlnode/) dengan nama lokal dan URI namespace yang cocok atau **nullptr** jika node yang cocok tidak ditemukan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNamedNodeMap::GetNamedItem(String) method


Mengambil sebuah [XmlNode](../../xmlnode/) yang ditentukan oleh nama.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String name)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | String | Nama lengkap node yang akan diambil. Nama ini dicocokkan dengan nilai [XmlNode::get_Name](../../xmlnode/get_name/) dari node yang cocok. |

### ReturnValue

Sebuah [XmlNode](../../xmlnode/) dengan nama yang ditentukan atau **nullptr** jika node yang cocok tidak ditemukan.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
