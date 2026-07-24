---
title: "System::Xml::XmlNode::get_LocalName methode"
linktitle: "get_LocalName"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNode::get_LocalName methode. Retourneert de lokale naam van het knooppunt, wanneer deze wordt overschreven in een afgeleide klasse in C++."
type: docs
weight: 1400
url: /nl/cpp/system.xml/xmlnode/get_localname/
---
## XmlNode::get_LocalName method


Retourneert de lokale naam van het knooppunt, wanneer overschreven in een afgeleide klasse.

```cpp
virtual String System::Xml::XmlNode::get_LocalName()=0
```


### ReturnValue

De naam van het knooppunt zonder het prefix. Bijvoorbeeld, **LocalName** is **book** voor het element **<bk:book>**.
## Opmerkingen



De geretourneerde naam is afhankelijk van de [XmlNode::get_NodeType](../get_nodetype/) van het knooppunt: |||
|-|-|
| Type | Naam |
| Attribute | De lokale naam van het attribuut. |
| CDATA | #cdata-section |
| Comment | #comment |
| Document | #document |
| DocumentFragment | #document-fragment |
| DocumentType | De documenttype-naam. |
| Element | De lokale naam van het element. |
| Entity | De naam van de entiteit. |
| EntityReference | De naam van de gerefereerde entiteit. |
| Notatie | De notatienaam. |
| ProcessingInstruction | Het doel van de verwerkingsinstructie. |
| Text | #text |
| Witruimte | #whitespace |
| SignificantWhitespace | #significant-whitespace |
| XmlDeclaration | #xml-declaration |

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
