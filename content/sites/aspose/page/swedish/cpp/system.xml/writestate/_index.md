---
title: "System::Xml::WriteState enum"
linktitle: "WriteState"
second_title: "Aspose.Page för C++"
description: "System::Xml::WriteState enum. Anger tillståndet för XmlWriter i C++."
type: docs
weight: 5700
url: /sv/cpp/system.xml/writestate/
---
## WriteState enum


Anger tillståndet för [XmlWriter](../xmlwriter/).

```cpp
enum class WriteState
```

### Värden

| Namn | Värde | Beskrivning |
| --- | --- | --- |
| Starta | 0 | Indikerar att XmlWriter::Write‑metoden ännu inte har anropats. |
| Prolog | 1 | Indikerar att prologen skrivs. |
| Element | 2 | Indikerar att en starttagg för ett element skrivs. |
| Attribute | 3 | Indikerar att ett attributvärde skrivs. |
| Content | 4 | Indikerar att elementets innehåll skrivs. |
| Closed | 5 | Indikerar att [XmlWriter::Close](../xmlwriter/close/)‑metoden har anropats. |
| Error | 6 | Ett undantag har kastats, vilket har lämnat [XmlWriter](../xmlwriter/) i ett ogiltigt tillstånd. Du kan anropa [XmlWriter::Close](../xmlwriter/close/)‑metoden för att sätta [XmlWriter](../xmlwriter/) i [WriteState::Closed](./)-tillståndet. Alla andra anrop till [XmlWriter](../xmlwriter/)‑metoder resulterar i ett InvalidOperationException. |

## Se även

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
