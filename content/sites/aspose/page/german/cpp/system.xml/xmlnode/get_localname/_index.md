---
title: "System::Xml::XmlNode::get_LocalName-Methode"
linktitle: "get_LocalName"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlNode::get_LocalName-Methode. Gibt den lokalen Namen des Knotens zurück, wenn er in einer abgeleiteten Klasse in C++ überschrieben wird."
type: docs
weight: 1400
url: /de/cpp/system.xml/xmlnode/get_localname/
---
## XmlNode::get_LocalName method


Gibt den lokalen Namen des Knotens zurück, wenn er in einer abgeleiteten Klasse überschrieben wird.

```cpp
virtual String System::Xml::XmlNode::get_LocalName()=0
```


### ReturnValue

Der Name des Knotens ohne das Präfix. Zum Beispiel ist **LocalName** **book** für das Element **<bk:book>**.
## Hinweise



Der zurückgegebene Name hängt vom [XmlNode::get_NodeType](../get_nodetype/) des Knotens ab: |||
|-|-|
| Typ | Name |
| Attribute | Der lokale Name des Attributs. |
| CDATA | #cdata-section |
| Comment | #comment |
| Document | #document |
| DocumentFragment | #document-fragment |
| DocumentType | Der Dokumenttyp-Name. |
| Element | Der lokale Name des Elements. |
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
