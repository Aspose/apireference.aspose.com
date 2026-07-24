---
title: "System::Xml::XmlReader::get_Name-methode"
linktitle: "get_Name"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlReader::get_Name-methode. Wanneer overschreven in een afgeleide klasse, haalt het de gekwalificeerde naam van het huidige knooppunt op in C++."
type: docs
weight: 1500
url: /nl/cpp/system.xml/xmlreader/get_name/
---
## XmlReader::get_Name method


Wanneer overschreven in een afgeleide klasse, krijgt de gekwalificeerde naam van het huidige knooppunt.

```cpp
virtual String System::Xml::XmlReader::get_Name()
```


### ReturnValue

De gekwalificeerde naam van de huidige knoop. Bijvoorbeeld, **Name** is **bk:book** voor het element **<bk:book>**.
## Opmerkingen



De geretourneerde naam is afhankelijk van de waarde van [XmlReader::get_NodeType](../get_nodetype/) van het knooppunt. De volgende knooppunttypen retourneren de vermelde waarden. Alle andere knooppunttypen retourneren een lege tekenreeks. |||
|-|-|
| Knooppunttype | Naam |
| Attribute | De naam van het attribuut. |
| DocumentType | De documenttype-naam. |
| Element | De tagnaam. |
| EntityReference | De naam van de gerefereerde entiteit. |
| ProcessingInstruction | Het doel van de verwerkingsinstructie. |
| XmlDeclaration | De letterlijke string xml. |

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
