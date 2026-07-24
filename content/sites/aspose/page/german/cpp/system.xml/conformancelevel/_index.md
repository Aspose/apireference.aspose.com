---
title: "System::Xml::ConformanceLevel enum"
linktitle: "ConformanceLevel"
second_title: "Aspose.Page für C++"
description: "System::Xml::ConformanceLevel enum. Gibt an, wie viel Eingabe- oder Ausgabeprüfung von XmlReader- und XmlWriter-Objekten in C++ durchgeführt wird."
type: docs
weight: 4600
url: /de/cpp/system.xml/conformancelevel/
---
## ConformanceLevel enum


Gibt an, wie viel Eingabe- oder Ausgabeprüfung von [XmlReader](../xmlreader/)- und [XmlWriter](../xmlwriter/)-Objekten durchgeführt wird.

```cpp
enum class ConformanceLevel
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Auto | 0 | Das [XmlReader](../xmlreader/)- oder [XmlWriter](../xmlwriter/)-Objekt erkennt automatisch, ob eine Dokument‑ oder Fragment‑Überprüfung durchgeführt werden soll, und führt die entsprechende Prüfung durch. Wenn Sie ein anderes [XmlReader](../xmlreader/)- oder [XmlWriter](../xmlwriter/)-Objekt einhüllen, führt das äußere Objekt keine zusätzliche Konformitätsprüfung durch. Die Konformitätsprüfung wird dem zugrunde liegenden Objekt überlassen. |
| Fragment | 1 | Die XML‑Daten sind ein [wohlgeformtes XML‑Fragment](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities), wie vom W3C definiert. Diese Konformitätsstufe stellt ein XML‑Dokument dar, das möglicherweise kein Wurzelelement hat, aber ansonsten wohlgeformt ist. Diese Prüfungsstufe stellt sicher, dass der gelesene oder geschriebene Strom von jedem Prozessor als [XML 1.0‑externes geparstes Entity](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities) verarbeitet werden kann. |
| Document | 2 | Die XML‑Daten entsprechen den Regeln für ein wohlgeformtes [XML 1.0‑Dokument](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed), wie vom W3C definiert. Diese Prüfungsstufe stellt sicher, dass der gelesene oder geschriebene Strom von jedem Prozessor als [XML 1.0‑Dokument](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed) verarbeitet werden kann. |

## Siehe auch

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
