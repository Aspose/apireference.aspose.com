---
title: "System::Xml::XmlNode::get_Name metode"
linktitle: "get_Name"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlNode::get_Name metode. Mengembalikan nama yang memenuhi syarat dari node, ketika di-override dalam kelas turunan dalam C++."
type: docs
weight: 1500
url: /id/cpp/system.xml/xmlnode/get_name/
---
## XmlNode::get_Name method


Mengembalikan nama lengkap (qualified) node, ketika ditimpa dalam kelas turunan.

```cpp
virtual String System::Xml::XmlNode::get_Name()=0
```


### ReturnValue

Nama yang memenuhi syarat dari node.
## Catatan



Nama yang dikembalikan bergantung pada [XmlNode::get_NodeType](../get_nodetype/) dari node: |||
|-|-|
| Tipe | Nama |
| Attribute | Nama lengkap atribut. |
| CDATA | #cdata-section |
| Comment | #comment |
| Document | #document |
| DocumentFragment | #document-fragment |
| DocumentType | Nama tipe dokumen. |
| Element | Nama yang memenuhi syarat dari elemen. |
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
