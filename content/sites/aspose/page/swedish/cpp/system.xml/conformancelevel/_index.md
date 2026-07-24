---
title: "System::Xml::ConformanceLevel enum"
linktitle: "ConformanceLevel"
second_title: "Aspose.Page för C++"
description: "System::Xml::ConformanceLevel enum. Anger mängden in- eller utdata‑kontroll som XmlReader‑ och XmlWriter‑objekt utför i C++."
type: docs
weight: 4600
url: /sv/cpp/system.xml/conformancelevel/
---
## ConformanceLevel enum


Anger mängden in- eller utdata‑kontroll som [XmlReader](../xmlreader/) och [XmlWriter](../xmlwriter/) objekt utför.

```cpp
enum class ConformanceLevel
```

### Värden

| Namn | Värde | Beskrivning |
| --- | --- | --- |
| Auto | 0 | Objektet [XmlReader](../xmlreader/) eller [XmlWriter](../xmlwriter/) upptäcker automatiskt om kontroll på dokumentnivå eller fragmentnivå ska utföras, och utför den lämpliga kontrollen. Om du omsluter ett annat [XmlReader](../xmlreader/) eller [XmlWriter](../xmlwriter/) objekt, gör det yttre objektet ingen ytterligare konformitetskontroll. Konformitetskontrollen lämnas åt det underliggande objektet. |
| Fragment | 1 | XML‑data är ett [välformat XML‑fragment](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities), enligt W3C:s definition. Denna konformitetsnivå representerar ett XML‑dokument som kanske inte har ett rootelement men annars är välformat. Denna kontrollnivå säkerställer att strömmen som läses eller skrivs kan konsumeras av vilken processor som helst som ett [XML 1.0 externt parsat entity](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities). |
| Document | 2 | XML‑data följer reglerna för ett välformat [XML 1.0‑dokument](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed), enligt W3C:s definition. Denna kontrollnivå säkerställer att strömmen som läses eller skrivs kan konsumeras av vilken processor som helst som ett [XML 1.0‑dokument](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed). |

## Se även

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
