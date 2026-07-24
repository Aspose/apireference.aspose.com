---
title: "System::Xml::ReadState enum"
linktitle: "ReadState"
second_title: "Aspose.Page für C++"
description: "System::Xml::ReadState enum. Gibt den Zustand des Readers in C++ an."
type: docs
weight: 5300
url: /de/cpp/system.xml/readstate/
---
## ReadState enum


Gibt den Zustand des Lesers an.

```cpp
enum class ReadState
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Initial | 0 | Die [XmlReader::Read](../xmlreader/read/) Methode wurde nicht aufgerufen. |
| Interactive | 1 | Die [XmlReader::Read](../xmlreader/read/) Methode wurde aufgerufen. Weitere Methoden können beim Reader aufgerufen werden. |
| Error | 2 | Ein Fehler ist aufgetreten, der das Fortsetzen des Lesevorgangs verhindert. |
| EndOfFile | 3 | Das Dateiende wurde erfolgreich erreicht. |
| Closed | 4 | Die [XmlReader::Close](../xmlreader/close/) Methode wurde aufgerufen. |

## Siehe auch

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
