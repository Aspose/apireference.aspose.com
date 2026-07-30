---
title: "System::Xml::ReadState enum"
linktitle: "ReadState"
second_title: "Aspose.Font für C++"
description: "System::Xml::ReadState enum. Gibt den Zustand des Readers in C++ an."
type: docs
weight: 5300
url: /de/cpp/system.xml/readstate/
---
## ReadState enum


Gibt den Zustand des Readers an.

```cpp
enum class ReadState
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Initial | 0 | Die Methode [XmlReader::Read](../xmlreader/read/) wurde nicht aufgerufen. |
| Interactive | 1 | Die Methode [XmlReader::Read](../xmlreader/read/) wurde aufgerufen. Zusätzliche Methoden können am Reader aufgerufen werden. |
| Fehler | 2 | Ein Fehler ist aufgetreten, der das Fortsetzen des Lesevorgangs verhindert. |
| EndOfFile | 3 | Das Dateiende wurde erfolgreich erreicht. |
| Closed | 4 | Die Methode [XmlReader::Close](../xmlreader/close/) wurde aufgerufen. |

## Siehe auch

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
