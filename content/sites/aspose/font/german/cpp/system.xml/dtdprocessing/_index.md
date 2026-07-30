---
title: "System::Xml::DtdProcessing Enum"
linktitle: "DtdProcessing"
second_title: "Aspose.Font für C++"
description: "System::Xml::DtdProcessing Enum. Gibt die Optionen für die Verarbeitung von DTDs an. Die DtdProcessing-Aufzählung wird von der XmlReaderSettings-Klasse in C++ verwendet."
type: docs
weight: 4700
url: /de/cpp/system.xml/dtdprocessing/
---
## DtdProcessing enum


Gibt die Optionen für die Verarbeitung von DTDs an. Die [DtdProcessing](./)-Aufzählung wird von der [XmlReaderSettings](../xmlreadersettings/)-Klasse verwendet.

```cpp
enum class DtdProcessing
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Prohibit | 0 | Gibt an, dass beim Auftreten einer DTD eine [XmlException](../xmlexception/) ausgelöst wird mit einer Meldung, die besagt, dass DTDs verboten sind. Dies ist das Standardverhalten. |
| Ignorieren | 1 | Veranlasst, dass das DOCTYPE-Element ignoriert wird. Es findet keine DTD-Verarbeitung statt, und die DTD/DOCTYPE geht bei der Ausgabe verloren. |
| Parsen | 2 | Wird zum Parsen von DTDs verwendet. |

## Siehe auch

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
