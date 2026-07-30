---
title: "System::Xml::XmlNode::get_Name metodo"
linktitle: "get_Name"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlNode::get_Name metodo. Restituisce il nome qualificato del nodo, quando sovrascritto in una classe derivata in C++."
type: docs
weight: 1500
url: /it/cpp/system.xml/xmlnode/get_name/
---
## XmlNode::get_Name method


Restituisce il nome qualificato del nodo, quando sovrascritto in una classe derivata.

```cpp
virtual String System::Xml::XmlNode::get_Name()=0
```


### ReturnValue

Il nome qualificato del nodo.
## Osservazioni



Il nome restituito dipende dal [XmlNode::get_NodeType](../get_nodetype/) del nodo: |||
|-|-|
| Tipo | Nome |
| Attribute | Il nome qualificato dell'attributo. |
| CDATA | #cdata-section |
| Comment | #comment |
| Document | #document |
| DocumentFragment | #document-fragment |
| DocumentType | Il nome del tipo di documento. |
| Element | Il nome qualificato dell'elemento. |
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
