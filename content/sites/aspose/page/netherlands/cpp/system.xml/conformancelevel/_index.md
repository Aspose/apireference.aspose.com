---
title: "System::Xml::ConformanceLevel enum"
linktitle: "ConformanceLevel"
second_title: "Aspose.Page voor C++"
description: "System::Xml::ConformanceLevel enum. Specificeert de hoeveelheid invoer‑ of uitvoercontroles die XmlReader‑ en XmlWriter‑objecten uitvoeren in C++."
type: docs
weight: 4600
url: /nl/cpp/system.xml/conformancelevel/
---
## ConformanceLevel enum


Specificeert de hoeveelheid invoer‑ of uitvoercontroles die [XmlReader](../xmlreader/) en [XmlWriter](../xmlwriter/) objecten uitvoeren.

```cpp
enum class ConformanceLevel
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| Auto | 0 | Het [XmlReader](../xmlreader/) of [XmlWriter](../xmlwriter/) object detecteert automatisch of controle op documentniveau of fragmentniveau moet worden uitgevoerd, en voert de juiste controle uit. Als u een ander [XmlReader](../xmlreader/) of [XmlWriter](../xmlwriter/) object omsluit, voert het buitenste object geen extra conformiteitscontrole uit. Conformiteitscontrole wordt overgelaten aan het onderliggende object. |
| Fragment | 1 | De XML-gegevens zijn een [well-formed XML fragment](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities), zoals gedefinieerd door de W3C. Dit conformiteitsniveau vertegenwoordigt een XML-document dat mogelijk geen root‑element heeft maar anders wel goed gevormd is. Dit niveau van controle zorgt ervoor dat de stroom die wordt gelezen of geschreven door elke processor kan worden verwerkt als een [XML 1.0 external parsed entity](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities). |
| Document | 2 | De XML-gegevens voldoen aan de regels voor een goed gevormd [XML 1.0 document](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed), zoals gedefinieerd door de W3C. Dit niveau van controle zorgt ervoor dat de stroom die wordt gelezen of geschreven door elke processor kan worden verwerkt als een [XML 1.0 document](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed). |

## Zie ook

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
