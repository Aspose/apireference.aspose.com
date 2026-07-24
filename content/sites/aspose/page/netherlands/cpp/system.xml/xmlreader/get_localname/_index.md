---
title: "System::Xml::XmlReader::get_LocalName methode"
linktitle: "get_LocalName"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlReader::get_LocalName methode. Wanneer overschreven in een afgeleide klasse, krijgt het de lokale naam van de huidige knoop in C++."
type: docs
weight: 1400
url: /nl/cpp/system.xml/xmlreader/get_localname/
---
## XmlReader::get_LocalName method


Wanneer overschreven in een afgeleide klasse, krijgt de lokale naam van het huidige knooppunt.

```cpp
virtual String System::Xml::XmlReader::get_LocalName()=0
```


### ReturnValue

De naam van de huidige knoop zonder de prefix. Bijvoorbeeld, **LocalName** is **book** voor het element **<bk:book>**. Voor knooptypen die geen naam hebben (zoals **[Text](../../../system.text/)**, **Comment**, enzovoort), retourneert deze methode [String::Empty](../../../system/string/empty/).

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
