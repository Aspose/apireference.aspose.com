---
title: "System::Xml::XmlDocument::CreateNode metode"
linktitle: "CreateNode"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlDocument::CreateNode metode. Membuat sebuah XmlNode dengan tipe node yang ditentukan, XmlDocument::get_Name, dan XmlNode::get_NamespaceURI dalam C++."
type: docs
weight: 1100
url: /id/cpp/system.xml/xmldocument/createnode/
---
## XmlDocument::CreateNode(const String\&, const String\&, const String\&) method


Membuat sebuah [XmlNode](../../xmlnode/) dengan tipe node yang ditentukan, [XmlDocument::get_Name](../get_name/), dan [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(const String &nodeTypeString, const String &name, const String &namespaceURI)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nodeTypeString | const String\& | Versi [String](../../../system/string/) dari [XmlNodeType](../../xmlnodetype/) node baru. Parameter ini harus salah satu nilai yang tercantum dalam tabel di bawah. |
| name | const String\& | Nama terkualifikasi dari node baru. Jika nama mengandung titik dua, maka akan diurai menjadi komponen [XmlNode::get_Prefix](../../xmlnode/get_prefix/) dan [XmlDocument::get_LocalName](../get_localname/). |
| namespaceURI | const String\& | URI ruang nama dari node baru. |

### ReturnValue

[XmlNode](../../xmlnode/) baru.
## Catatan



Parameter **nodeTypeString** bersifat case sensitive dan harus salah satu nilai dalam tabel berikut: |||
|-|-|
| nodeTypeString | XmlNodeType |
| attribute | Attribute |
| cdatasection | CDATA |
| comment | Comment |
| document | Document |
| documentfragment | DocumentFragment |
| documenttype | DocumentType |
| element | Element |
| referensi entitas | EntityReference |
| instruksi pemrosesan | ProcessingInstruction |
| spasi signifikan | SignificantWhitespace |
| text | Text |
| spasi | Spasi |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&) method


Membuat sebuah [XmlNode](../../xmlnode/) dengan [XmlNodeType](../../xmlnodetype/) yang ditentukan, [XmlDocument::get_Name](../get_name/), dan [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &name, const String &namespaceURI)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| type | XmlNodeType | [XmlNodeType](../../xmlnodetype/) dari node baru. |
| name | const String\& | Nama yang memenuhi syarat dari node baru. Jika nama mengandung titik dua, maka akan diurai menjadi komponen [XmlNode::get_Prefix](../../xmlnode/get_prefix/) dan [XmlDocument::get_LocalName](../get_localname/). |
| namespaceURI | const String\& | URI ruang nama dari node baru. |

### ReturnValue

[XmlNode](../../xmlnode/) baru.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&, const String\&) method


Membuat sebuah [XmlNode](../../xmlnode/) dengan [XmlNodeType](../../xmlnodetype/) yang ditentukan, [XmlNode::get_Prefix](../../xmlnode/get_prefix/), [XmlDocument::get_Name](../get_name/), dan [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &prefix, const String &name, const String &namespaceURI)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| type | XmlNodeType | [XmlNodeType](../../xmlnodetype/) dari node baru. |
| awalan | const String\& | Awalan dari node baru. |
| name | const String\& | Nama lokal dari node baru. |
| namespaceURI | const String\& | URI ruang nama dari node baru. |

### ReturnValue

[XmlNode](../../xmlnode/) baru.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
