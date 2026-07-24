---
title: "System::Xml::XmlNodeReader::get_Name methode"
linktitle: "get_Name"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNodeReader::get_Name methode. Retourneert de gekwalificeerde naam van de huidige knoop in C++."
type: docs
weight: 1400
url: /nl/cpp/system.xml/xmlnodereader/get_name/
---
## XmlNodeReader::get_Name method


Geeft de gekwalificeerde naam van het huidige knooppunt terug.

```cpp
String System::Xml::XmlNodeReader::get_Name() override
```


### ReturnValue

De gekwalificeerde naam van de huidige knoop. Bijvoorbeeld, **Name** is **bk:book** voor het element **<bk:book>**.
## Opmerkingen



De geretourneerde naam is afhankelijk van de [XmlNodeReader::get_NodeType](../get_nodetype/) waarde van de knoop. De volgende knooptypen retourneren de vermelde waarden. Alle andere knooptypen retourneren een lege string. |||
|-|-|
| Knooptype | Naam |
| Attribute | De naam van het attribuut. |
| DocumentType | De documenttype-naam. |
| Element | De tagnaam. |
| EntityReference | De naam van de gerefereerde entiteit. |
| ProcessingInstruction | Het doel van de verwerkingsinstructie. |
| XmlDeclaration | De letterlijke string xml. |

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
