---
title: "System::Xml::ConformanceLevel enum"
linktitle: "ConformanceLevel"
second_title: "Aspose.Font für C++"
description: "System::Xml::ConformanceLevel enum. Gibt an, wie viel Eingabe- oder Ausgabeüberprüfung die Objekte XmlReader und XmlWriter in C++ durchführen."
type: docs
weight: 4600
url: /de/cpp/system.xml/conformancelevel/
---
## ConformanceLevel enum


Gibt an, wie viel Eingabe- oder Ausgabeüberprüfung die Objekte [XmlReader](../xmlreader/) und [XmlWriter](../xmlwriter/) durchführen.

```cpp
enum class ConformanceLevel
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Auto | 0 | Das [XmlReader](../xmlreader/) oder [XmlWriter](../xmlwriter/) Objekt erkennt automatisch, ob eine Dokument‑ oder Fragment‑Überprüfung durchgeführt werden soll, und führt die entsprechende Prüfung durch. Wenn Sie ein anderes [XmlReader](../xmlreader/) oder [XmlWriter](../xmlwriter/) Objekt einbetten, führt das äußere Objekt keine zusätzliche Konformitätsprüfung durch. Die Konformitätsprüfung wird dem zugrunde liegenden Objekt überlassen. |
| Fragment | 1 | Die XML‑Daten sind ein [well-formed XML fragment](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities), wie von der W3C definiert. Diese Konformitätsebene stellt ein XML‑Dokument dar, das möglicherweise kein Root‑Element hat, aber ansonsten wohlgeformt ist. Diese Prüfungsstufe stellt sicher, dass der gelesene oder geschriebene Stream von jedem Prozessor als [XML 1.0 external parsed entity](https://www.w3.org/TR/2006/REC-xml-20060816/#wf-entities) konsumiert werden kann. |
| Document | 2 | Die XML‑Daten entsprechen den Regeln für ein wohlgeformtes [XML 1.0 document](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed), wie von der W3C definiert. Diese Prüfungsstufe stellt sicher, dass der gelesene oder geschriebene Stream von jedem Prozessor als [XML 1.0 document](https://www.w3.org/TR/2006/REC-xml-20060816/#sec-well-formed) konsumiert werden kann. |

## Siehe auch

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
