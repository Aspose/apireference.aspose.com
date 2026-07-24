---
title: "System::Xml::XmlReader::LookupNamespace method"
linktitle: "LookupNamespace"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlReader::LookupNamespace method. Wanneer deze wordt overschreven in een afgeleide klasse, lost hij een namespace‑prefix op in de scope van het huidige element in C++."
type: docs
weight: 3100
url: /nl/cpp/system.xml/xmlreader/lookupnamespace/
---
## XmlReader::LookupNamespace method


Wanneer overschreven in een afgeleide klasse, lost een namespace‑voorvoegsel op in de scope van het huidige element.

```cpp
virtual String System::Xml::XmlReader::LookupNamespace(const String &prefix)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| prefix | const String\& | De prefix waarvan u de namespace‑URI wilt oplossen. Om overeen te komen met de standaardnamespace, geeft u een lege tekenreeks door. |

### ReturnValue

De namespace-URI waar de prefix naar verwijst of **nullptr** als er geen overeenkomende prefix wordt gevonden.

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
