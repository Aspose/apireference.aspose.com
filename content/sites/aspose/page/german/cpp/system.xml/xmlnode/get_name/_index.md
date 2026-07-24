---
title: "System::Xml::XmlNode::get_Name method"
linktitle: "get_Name"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlNode::get_Name method. Gibt den qualifizierten Namen des Knotens zurück, wenn er in einer abgeleiteten Klasse in C++ überschrieben wird."
type: docs
weight: 1500
url: /de/cpp/system.xml/xmlnode/get_name/
---
## XmlNode::get_Name method


Gibt den qualifizierten Namen des Knotens zurück, wenn er in einer abgeleiteten Klasse überschrieben wird.

```cpp
virtual String System::Xml::XmlNode::get_Name()=0
```


### ReturnValue

Der qualifizierte Name des Knotens.
## Hinweise



Der zurückgegebene Name hängt vom [XmlNode::get_NodeType](../get_nodetype/) des Knotens ab: |||
|-|-|
| Typ | Name |
| Attribute | Der qualifizierte Name des Attributs. |
| CDATA | #cdata-section |
| Comment | #comment |
| Document | #document |
| DocumentFragment | #document-fragment |
| DocumentType | Der Dokumenttyp-Name. |
| Element | Der qualifizierte Name des Elements. |
| Entity | Der Name der Entität. |
| EntityReference | Der Name der referenzierten Entität. |
| Notation | Der Notationsname. |
| ProcessingInstruction | Das Ziel der Verarbeitungsanweisung. |
| Text | #text |
| Leerraum | #whitespace |
| SignificantWhitespace | #significant-whitespace |
| XmlDeclaration | #xml-declaration |

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
