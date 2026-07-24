---
title: "System::Xml::XmlTextReader::get_Value methode"
linktitle: "get_Value"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlTextReader::get_Value methode. Retourneert de tekstwaarde van het huidige knooppunt in C++."
type: docs
weight: 2900
url: /nl/cpp/system.xml/xmltextreader/get_value/
---
## XmlTextReader::get_Value method


Geeft de tekstwaarde van het huidige knooppunt terug.

```cpp
String System::Xml::XmlTextReader::get_Value() override
```


### ReturnValue

De geretourneerde waarde hangt af van de [XmlTextReader::get_NodeType](../get_nodetype/) waarde van het knooppunt.
## Opmerkingen



De volgende tabel geeft een lijst weer van knooptypen die een waarde hebben om terug te geven. Alle andere knooptypen retourneren [String::Empty](../../../system/string/empty/). |||
|-|-|
| Knooptype | Waarde |
| Attribute | De waarde van het attribuut. |
| CDATA | De inhoud van de CDATA-sectie. |
| Comment | De inhoud van het commentaar. |
| DocumentType | De interne subset. |
| ProcessingInstruction | De volledige inhoud, exclusief het doel. |
| SignificantWhitespace | De witruimte binnen een xml:space='preserve' bereik. |
| Text | De inhoud van de tekstknoop. |
| Witruimte | De witruimte tussen markup. |
| XmlDeclaration | De inhoud van de declaratie. |

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
