---
title: "System::Xml::XmlNode::get_Name method"
linktitle: "get_Name"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlNode::get_Name‑metoden. Returnerar det kvalificerade namnet på noden när den åsidosätts i en avledd klass i C++."
type: docs
weight: 1500
url: /sv/cpp/system.xml/xmlnode/get_name/
---
## XmlNode::get_Name method


Returnerar det kvalificerade namnet på noden, när det åsidosätts i en avledd klass.

```cpp
virtual String System::Xml::XmlNode::get_Name()=0
```


### ReturnValue

Det kvalificerade namnet på noden.
## Anmärkningar



Det returnerade namnet beror på [XmlNode::get_NodeType](../get_nodetype/) för noden: |||
|-|-|
| Type | Namn |
| Attribute | Det kvalificerade namnet på attributet. |
| CDATA | #cdata-section |
| Comment | #comment |
| Document | #document |
| DocumentFragment | #document-fragment |
| DocumentType | Namnet på dokumenttypen. |
| Element | Det kvalificerade namnet på elementet. |
| Entity | Namnet på entiteten. |
| EntityReference | Namnet på den refererade enheten. |
| Notation | Notationens namn. |
| ProcessingInstruction | Målet för processinstruktionen. |
| Text | #text |
| Blanksteg | #whitespace |
| SignificantWhitespace | #significant-whitespace |
| XmlDeclaration | #xml-declaration |

## Se även

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
