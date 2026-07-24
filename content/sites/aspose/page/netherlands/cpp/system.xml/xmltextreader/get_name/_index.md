---
title: "System::Xml::XmlTextReader::get_Name methode"
linktitle: "get_Name"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlTextReader::get_Name methode. Retourneert de gekwalificeerde naam van het huidige knooppunt in C++."
type: docs
weight: 1900
url: /nl/cpp/system.xml/xmltextreader/get_name/
---
## XmlTextReader::get_Name method


Geeft de gekwalificeerde naam van het huidige knooppunt terug.

```cpp
String System::Xml::XmlTextReader::get_Name() override
```


### ReturnValue

De gekwalificeerde naam van de huidige knoop. Bijvoorbeeld, **Name** is **bk:book** voor het element **<bk:book>**.
## Opmerkingen



De geretourneerde naam is afhankelijk van de [XmlTextReader::get_NodeType](../get_nodetype/) waarde van het knooppunt. De volgende knooptypen retourneren de vermelde waarden. Alle andere knooptypen retourneren een lege tekenreeks. |||
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
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
