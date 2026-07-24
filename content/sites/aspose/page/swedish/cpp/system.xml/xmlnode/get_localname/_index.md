---
title: "System::Xml::XmlNode::get_LocalName metod"
linktitle: "get_LocalName"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlNode::get_LocalName metod. Returnerar det lokala namnet på noden, när det åsidosätts i en avledd klass i C++."
type: docs
weight: 1400
url: /sv/cpp/system.xml/xmlnode/get_localname/
---
## XmlNode::get_LocalName method


Returnerar det lokala namnet på noden, när det åsidosätts i en avledd klass.

```cpp
virtual String System::Xml::XmlNode::get_LocalName()=0
```


### ReturnValue

Namnet på noden utan prefixet. Till exempel är **LocalName** **book** för elementet **<bk:book>**.
## Anmärkningar



Det returnerade namnet beror på [XmlNode::get_NodeType](../get_nodetype/) för noden: |||
|-|-|
| Type | Namn |
| Attribute | Det lokala namnet på attributet. |
| CDATA | #cdata-section |
| Comment | #comment |
| Document | #document |
| DocumentFragment | #document-fragment |
| DocumentType | Namnet på dokumenttypen. |
| Element | Det lokala namnet på elementet. |
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
