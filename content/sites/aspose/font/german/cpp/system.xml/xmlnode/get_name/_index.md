---
title: "System::Xml::XmlNode::get_Name Methode"
linktitle: "get_Name"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlNode::get_Name Methode. Gibt den qualifizierten Namen des Knotens zurück, wenn sie in einer abgeleiteten Klasse in C++ überschrieben wird."
type: docs
weight: 1500
url: /de/cpp/system.xml/xmlnode/get_name/
---
## XmlNode::get_Name method


Gibt den qualifizierten Namen des Knotens zurück, wenn in einer abgeleiteten Klasse überschrieben.

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
| DocumentType | Der Dokumenttypname. |
| Element | Der qualifizierte Name des Elements. |
| Entity | Der Name der Entität. |
| EntityReference | Der Name der referenzierten Entität. |
| Notation | Der Notationsname. |
| ProcessingInstruction | Das Ziel der Verarbeitungsanweisung. |
| Text | #text |
| Whitespace | #whitespace |
| SignificantWhitespace | #significant-whitespace |
| XmlDeclaration | #xml-declaration |

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
