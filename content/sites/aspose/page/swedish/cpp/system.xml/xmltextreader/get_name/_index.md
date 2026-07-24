---
title: "System::Xml::XmlTextReader::get_Name metod"
linktitle: "get_Name"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlTextReader::get_Name metod. Returnerar det kvalificerade namnet på den aktuella noden i C++."
type: docs
weight: 1900
url: /sv/cpp/system.xml/xmltextreader/get_name/
---
## XmlTextReader::get_Name method


Returnerar det kvalificerade namnet på den aktuella noden.

```cpp
String System::Xml::XmlTextReader::get_Name() override
```


### ReturnValue

Det kvalificerade namnet på den aktuella noden. Till exempel är **Name** **bk:book** för elementet **<bk:book>**.
## Anmärkningar



Det returnerade namnet beror på värdet för [XmlTextReader::get_NodeType](../get_nodetype/) för noden. Följande nodtyper returnerar de angivna värdena. Alla andra nodtyper returnerar en tom sträng. |||
|-|-|
| Nodtyp | Namn |
| Attribute | Namnet på attributet. |
| DocumentType | Namnet på dokumenttypen. |
| Element | Taggnamnet. |
| EntityReference | Namnet på den refererade enheten. |
| ProcessingInstruction | Målet för processinstruktionen. |
| XmlDeclaration | Den bokstavliga strängen xml. |

## Se även

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
