---
title: "System::Xml::DtdProcessing-Enum"
linktitle: "DtdProcessing"
second_title: "Aspose.Page für C++"
description: "System::Xml::DtdProcessing-Enum. Gibt die Optionen für die Verarbeitung von DTDs an. Die DtdProcessing-Aufzählung wird von der Klasse XmlReaderSettings in C++ verwendet."
type: docs
weight: 4700
url: /de/cpp/system.xml/dtdprocessing/
---
## DtdProcessing enum


Gibt die Optionen für die Verarbeitung von DTDs an. Die [DtdProcessing](./)-Aufzählung wird von der Klasse [XmlReaderSettings](../xmlreadersettings/) verwendet.

```cpp
enum class DtdProcessing
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Prohibit | 0 | Gibt an, dass beim Auftreten eines DTD ein [XmlException](../xmlexception/) mit einer Meldung ausgelöst wird, die besagt, dass DTDs verboten sind. Dies ist das Standardverhalten. |
| Ignore | 1 | Veranlasst, dass das DOCTYPE-Element ignoriert wird. Es findet keine DTD-Verarbeitung statt, und das DTD/DOCTYPE geht bei der Ausgabe verloren. |
| Parse | 2 | Wird zum Parsen von DTDs verwendet. |

## Siehe auch

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
