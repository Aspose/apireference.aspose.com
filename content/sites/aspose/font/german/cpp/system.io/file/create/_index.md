---
title: "System::IO::File::Create-Methode"
linktitle: "Create"
second_title: "Aspose.Font für C++"
description: "System::IO::File::Create-Methode. Erstellt eine neue Datei (oder überschreibt eine vorhandene) und öffnet sie für Lese- und Schreibzugriff unter Verwendung der angegebenen Puffergröße und Optionen in C++."
type: docs
weight: 500
url: /de/cpp/system.io/file/create/
---
## File::Create method


Erstellt eine neue Datei (oder überschreibt eine vorhandene) und öffnet sie für Lese‑ und Schreibzugriff unter Verwendung der angegebenen Puffergröße und Optionen.

```cpp
static FileStreamPtr System::IO::File::Create(const String &path, int32_t bufferSize=DefaultBufferSize, FileOptions options=FileOptions::None)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | const String\& | Der Pfad der zu erstellenden oder zu überschreibenden Datei |
| bufferSize | int32_t | Die Anzahl der beim Lesen aus und Schreiben in die Datei gepufferten Bytes |
| Optionen | FileOptions | Gibt an, wie die Datei erstellt oder überschrieben werden soll |

### ReturnValue

Ein Shared-Pointer auf das [FileStream](../../filestream/)-Objekt, das mit der angegebenen Datei verknüpft ist

## Siehe auch

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileOptions](../../fileoptions/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
