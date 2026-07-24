---
title: "Metode System::Xml::XmlNode::get_LocalName"
linktitle: "get_LocalName"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Xml::XmlNode::get_LocalName. Mengembalikan nama lokal dari node, ketika dioverride dalam kelas turunan dalam C++."
type: docs
weight: 1400
url: /id/cpp/system.xml/xmlnode/get_localname/
---
## XmlNode::get_LocalName method


Mengembalikan nama lokal node, ketika ditimpa dalam kelas turunan.

```cpp
virtual String System::Xml::XmlNode::get_LocalName()=0
```


### ReturnValue

Nama node dengan awalan dihapus. Misalnya, **LocalName** adalah **book** untuk elemen **<bk:book>**.
## Catatan



Nama yang dikembalikan bergantung pada [XmlNode::get_NodeType](../get_nodetype/) dari node: |||
|-|-|
| Tipe | Nama |
| Attribute | Nama lokal atribut. |
| CDATA | #cdata-section |
| Comment | #comment |
| Document | #document |
| DocumentFragment | #document-fragment |
| DocumentType | Nama tipe dokumen. |
| Element | Nama lokal elemen. |
| Entity | Nama entitas. |
| EntityReference | Nama entitas yang dirujuk. |
| Notasi | Nama notasi. |
| ProcessingInstruction | Target instruksi pemrosesan. |
| Text | #text |
| Spasi | #whitespace |
| SignificantWhitespace | #significant-whitespace |
| XmlDeclaration | #xml-declaration |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
