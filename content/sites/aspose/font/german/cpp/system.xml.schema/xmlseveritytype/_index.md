---
title: "System::Xml::Schema::XmlSeverityType Enum"
linktitle: "XmlSeverityType"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSeverityType Enum. Stellt die Schwere des Validierungsereignisses in C++ dar."
type: docs
weight: 8100
url: /de/cpp/system.xml.schema/xmlseveritytype/
---
## XmlSeverityType enum


Stellt die Schwere des Validierungsereignisses dar.

```cpp
enum class XmlSeverityType
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Error | 0 | Gibt an, dass ein Validierungsfehler beim Validieren des Instanzdokuments aufgetreten ist. Dies gilt für Dokumenttypdefinitionen (DTDs) und XML [Schema](../)-Definitionssprachen (XSD)-Schemata. Die Gültigkeitsbeschränkungen des World Wide [Web](../../system.web/) Consortium (W3C) werden als Fehler betrachtet. Wenn kein Validierungsereignis-Handler erstellt wurde, werfen Fehler eine Ausnahme. |
| Warning | 1 | Gibt an, dass ein Validierungsereignis aufgetreten ist, das kein Fehler ist. Eine Warnung wird typischerweise ausgegeben, wenn kein DTD oder kein XML [Schema](../) vorhanden ist, um ein bestimmtes Element oder Attribut zu validieren. Im Gegensatz zu Fehlern werfen Warnungen keine Ausnahme, wenn kein Validierungsereignis-Handler vorhanden ist. |

## Siehe auch

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
