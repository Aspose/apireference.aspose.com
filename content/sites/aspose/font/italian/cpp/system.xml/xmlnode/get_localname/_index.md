---
title: "System::Xml::XmlNode::get_LocalName metodo"
linktitle: "get_LocalName"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlNode::get_LocalName metodo. Restituisce il nome locale del nodo, quando sovrascritto in una classe derivata in C++."
type: docs
weight: 1400
url: /it/cpp/system.xml/xmlnode/get_localname/
---
## XmlNode::get_LocalName method


Restituisce il nome locale del nodo, quando sovrascritto in una classe derivata.

```cpp
virtual String System::Xml::XmlNode::get_LocalName()=0
```


### ReturnValue

Il nome del nodo con il prefisso rimosso. Per esempio, **LocalName** è **book** per l'elemento **<bk:book>**.
## Osservazioni



Il nome restituito dipende dal [XmlNode::get_NodeType](../get_nodetype/) del nodo: |||
|-|-|
| Tipo | Nome |
| Attribute | Il nome locale dell'attributo. |
| CDATA | #cdata-section |
| Comment | #comment |
| Document | #document |
| DocumentFragment | #document-fragment |
| DocumentType | Il nome del tipo di documento. |
| Element | Il nome locale dell'elemento. |
| Entity | Il nome dell'entità. |
| EntityReference | Il nome dell'entità referenziata. |
| Notation | Il nome della notazione. |
| ProcessingInstruction | Il target dell'istruzione di elaborazione. |
| Text | #text |
| Whitespace | #whitespace |
| SignificantWhitespace | #significant-whitespace |
| XmlDeclaration | #xml-declaration |

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
