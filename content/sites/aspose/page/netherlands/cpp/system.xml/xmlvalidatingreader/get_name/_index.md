---
title: "System::Xml::XmlValidatingReader::get_Name methode"
linktitle: "get_Name"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlValidatingReader::get_Name methode. Geeft de gekwalificeerde naam van het huidige knooppunt terug in C++."
type: docs
weight: 1700
url: /nl/cpp/system.xml/xmlvalidatingreader/get_name/
---
## XmlValidatingReader::get_Name method


Geeft de gekwalificeerde naam van het huidige knooppunt terug.

```cpp
String System::Xml::XmlValidatingReader::get_Name() override
```


### ReturnValue

De gekwalificeerde naam van de huidige knoop. Bijvoorbeeld, **Name** is **bk:book** voor het element **<bk:book>**.
## Opmerkingen



De geretourneerde naam is afhankelijk van de XmlValidatingReader::NodeType van het knooppunt. De volgende knooppunttypen geven de vermelde waarden terug. Alle andere knooppunttypen geven een lege tekenreeks terug. |||
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
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
