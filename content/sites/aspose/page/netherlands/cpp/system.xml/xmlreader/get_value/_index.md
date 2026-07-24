---
title: "System::Xml::XmlReader::get_Value methode"
linktitle: "get_Value"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlReader::get_Value methode. Wanneer overschreven in een afgeleide klasse, haalt de tekstwaarde van het huidige knooppunt op in C++."
type: docs
weight: 2400
url: /nl/cpp/system.xml/xmlreader/get_value/
---
## XmlReader::get_Value method


Wanneer overschreven in een afgeleide klasse, haalt de tekstwaarde van het huidige knooppunt op.

```cpp
virtual String System::Xml::XmlReader::get_Value()=0
```


### ReturnValue

De geretourneerde waarde hangt af van de [XmlReader::get_NodeType](../get_nodetype/) waarde van het knooppunt.
## Opmerkingen



De volgende tabel geeft een lijst weer van knooptypen die een waarde hebben om terug te geven. Alle andere knooptypen retourneren [String::Empty](../../../system/string/empty/). |||
|-|-|
| Knooppunttype | Waarde |
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
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
