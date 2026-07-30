---
title: "System::Xml::WriteState enum"
linktitle: "WriteState"
second_title: "Aspose.Font für C++"
description: "System::Xml::WriteState enum. Gibt den Zustand des XmlWriter in C++ an."
type: docs
weight: 5700
url: /de/cpp/system.xml/writestate/
---
## WriteState enum


Gibt den Zustand des [XmlWriter](../xmlwriter/) an.

```cpp
enum class WriteState
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Starten | 0 | Zeigt an, dass die Methode XmlWriter::Write noch nicht aufgerufen wurde. |
| Prolog | 1 | Zeigt an, dass das Prolog geschrieben wird. |
| Element | 2 | Zeigt an, dass ein Element‑Start‑Tag geschrieben wird. |
| Attribute | 3 | Zeigt an, dass ein Attributwert geschrieben wird. |
| Content | 4 | Zeigt an, dass Elementinhalt geschrieben wird. |
| Closed | 5 | Gibt an, dass die Methode [XmlWriter::Close](../xmlwriter/close/) aufgerufen wurde. |
| Error | 6 | Eine Ausnahme wurde ausgelöst, die den [XmlWriter](../xmlwriter/) in einen ungültigen Zustand versetzt hat. Sie können die Methode [XmlWriter::Close](../xmlwriter/close/) aufrufen, um den [XmlWriter](../xmlwriter/) in den Zustand [WriteState::Closed](./) zu versetzen. Alle anderen Aufrufe von [XmlWriter](../xmlwriter/)-Methoden führen zu einer InvalidOperationException. |

## Siehe auch

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
