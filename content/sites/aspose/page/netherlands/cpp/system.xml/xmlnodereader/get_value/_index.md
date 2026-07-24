---
title: "System::Xml::XmlNodeReader::get_Value methode"
linktitle: "get_Value"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNodeReader::get_Value methode. Retourneert de tekstwaarde van het huidige knooppunt in C++."
type: docs
weight: 2100
url: /nl/cpp/system.xml/xmlnodereader/get_value/
---
## XmlNodeReader::get_Value method


Geeft de tekstwaarde van het huidige knooppunt terug.

```cpp
String System::Xml::XmlNodeReader::get_Value() override
```


### ReturnValue

De geretourneerde waarde hangt af van de [XmlNodeReader::get_NodeType](../get_nodetype/) van het knooppunt.
## Opmerkingen



De volgende tabel geeft een lijst weer van knooptypen die een waarde hebben om terug te geven. Alle andere knooptypen retourneren [String::Empty](../../../system/string/empty/). |||
|-|-|
| Knooptype | Waarde |
| Attribute | De waarde van het attribuut. |
| CDATA | De inhoud van de CDATA-sectie. |
| Comment | De inhoud van het commentaar. |
| DocumentType | De interne subset. |
| ProcessingInstruction | De volledige inhoud, exclusief het doel. |
| SignificantWhitespace | De witruimte tussen markup in een gemengd inhoudsmodel. |
| Text | De inhoud van de tekstknoop. |
| Witruimte | De witruimte tussen markup. |
| XmlDeclaration | De inhoud van de declaratie. |

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
