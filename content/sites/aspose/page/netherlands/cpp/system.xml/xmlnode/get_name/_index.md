---
title: "System::Xml::XmlNode::get_Name methode"
linktitle: "get_Name"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNode::get_Name methode. Retourneert de gekwalificeerde naam van het knooppunt, wanneer overschreven in een afgeleide klasse in C++."
type: docs
weight: 1500
url: /nl/cpp/system.xml/xmlnode/get_name/
---
## XmlNode::get_Name method


Retourneert de gekwalificeerde naam van het knooppunt, wanneer overschreven in een afgeleide klasse.

```cpp
virtual String System::Xml::XmlNode::get_Name()=0
```


### ReturnValue

De gekwalificeerde naam van het knooppunt.
## Opmerkingen



De geretourneerde naam is afhankelijk van de [XmlNode::get_NodeType](../get_nodetype/) van het knooppunt: |||
|-|-|
| Type | Naam |
| Attribute | De gekwalificeerde naam van het attribuut. |
| CDATA | #cdata-section |
| Comment | #comment |
| Document | #document |
| DocumentFragment | #document-fragment |
| DocumentType | De documenttype-naam. |
| Element | De gekwalificeerde naam van het element. |
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
