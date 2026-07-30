---
title: "System::IO::File::OpenText Methode"
linktitle: "OpenText"
second_title: "Aspose.Font für C++"
description: "System::IO::File::OpenText Methode. Öffnet die angegebene vorhandene Datei zum Lesen von Text unter Verwendung der UTF-8-Kodierung ohne Freigabe in C++."
type: docs
weight: 2100
url: /de/cpp/system.io/file/opentext/
---
## File::OpenText method


Öffnet die angegebene vorhandene Datei zum Lesen von Text mit UTF-8-Kodierung ohne Freigabe.

```cpp
static StreamReaderPtr System::IO::File::OpenText(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | const String\& | Der Pfad der zu öffnenden Datei |
| encoding | const EncodingPtr\& | Die zu verwendende Zeichenkodierung |

### ReturnValue

Ein Shared Pointer zu einem [StreamWriter](../../streamwriter/) Objekt, das mit der geöffneten Datei verknüpft ist

## Siehe auch

* Typedef [StreamReaderPtr](../../../system/streamreaderptr/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
