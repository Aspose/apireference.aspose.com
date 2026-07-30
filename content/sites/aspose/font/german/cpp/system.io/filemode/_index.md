---
title: "System::IO::FileMode enum"
linktitle: "FileMode"
second_title: "Aspose.Font für C++"
description: "System::IO::FileMode enum. Gibt an, wie eine Datei in C++ geöffnet werden soll."
type: docs
weight: 3100
url: /de/cpp/system.io/filemode/
---
## FileMode enum


Gibt an, wie eine Datei geöffnet werden soll.

```cpp
enum class FileMode
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| CreateNew | 1 | Erstelle eine neue Datei. Wenn die Datei bereits existiert, wird eine Ausnahme ausgelöst. |
| Create | 2 | Erstelle eine neue Datei. Wenn die Datei bereits existiert, wird sie überschrieben. |
| Open | 3 | Öffne eine vorhandene Datei. Wenn die Datei nicht existiert, wird eine Ausnahme ausgelöst. |
| OpenOrCreate | 4 | Öffne eine vorhandene Datei oder erstelle eine neue, wenn sie nicht existiert. |
| Abrunden | 5 | Öffne eine vorhandene Datei und kürze sie, sodass sie leer ist. Wenn die Datei nicht existiert, wird eine Ausnahme ausgelöst. |
| Anhängen | 6 | Öffne eine vorhandene Datei und springe zum Ende, oder erstelle eine neue, wenn sie nicht existiert. |

## Siehe auch

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
