---
title: "System::IO::File::Open Methode"
linktitle: "Open"
second_title: "Aspose.Font für C++"
description: "System::IO::File::Open Methode. Öffnet die angegebene Datei im angegebenen Modus zum Lesen und Schreiben und ohne Freigabe in C++."
type: docs
weight: 1900
url: /de/cpp/system.io/file/open/
---
## File::Open(const String\&, FileMode) method


Öffnet die angegebene Datei im angegebenen Modus zum Lesen und Schreiben ohne Freigabe.

```cpp
static FileStreamPtr System::IO::File::Open(const String &path, FileMode mode)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | const String\& | Der Pfad der zu öffnenden Datei |
| mode | FileMode | Gibt den Modus an, in dem die Datei geöffnet werden soll |

### ReturnValue

Ein [FileStream](../../filestream/) Objekt, das mit der geöffneten Datei verknüpft ist

## Siehe auch

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## File::Open(const String\&, FileMode, FileAccess, FileShare) method


Öffnet die angegebene Datei im angegebenen Modus, mit dem angegebenen Zugriffstyp und Freigabeoption.

```cpp
static FileStreamPtr System::IO::File::Open(const String &path, FileMode mode, FileAccess access, FileShare share=FileShare::None)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | const String\& | Der Pfad der zu öffnenden Datei |
| mode | FileMode | Gibt den Modus an, in dem die Datei geöffnet werden soll |
| Zugriff | FileAccess | Der angeforderte Zugriffstyp |
| share | FileShare | Der Zugriffstyp, den andere [FileStream](../../filestream/) Objekte auf die geöffnete Datei haben |

### ReturnValue

Ein [FileStream](../../filestream/) Objekt, das mit der geöffneten Datei verknüpft ist

## Siehe auch

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
