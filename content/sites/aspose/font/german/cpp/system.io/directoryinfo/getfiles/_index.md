---
title: "System::IO::DirectoryInfo::GetFiles method"
linktitle: "GetFiles"
second_title: "Aspose.Font für C++"
description: "System::IO::DirectoryInfo::GetFiles method. Gibt ein Array zurück, das Shared-Pointer auf FileInfo-Objekte enthält, die alle Verzeichnisse darstellen, die sich im vom aktuellen Objekt repräsentierten Verzeichnis in C++ befinden."
type: docs
weight: 1300
url: /de/cpp/system.io/directoryinfo/getfiles/
---
## DirectoryInfo::GetFiles() method


Gibt ein Array zurück, das Shared-Pointer auf [FileInfo](../../fileinfo/)-Objekte enthält, die alle Verzeichnisse darstellen, die sich im vom aktuellen Objekt repräsentierten Verzeichnis befinden.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles()
```

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetFiles(const String\&) method


Durchsucht das vom aktuellen Objekt repräsentierte Verzeichnis nach Dateien, die die angegebenen Suchkriterien erfüllen.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles(const String &searchPattern)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| searchPattern | const String\& | Das Namensmuster der zu suchenden Dateien |

### ReturnValue

Ein Array von Shared-Pointern auf [FileInfo](../../fileinfo/)-Objekte, die die gefundenen Dateien darstellen, deren Namen **searchPattern** entsprechen.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetFiles(const String\&, SearchOption) method


Durchsucht entweder das vom aktuellen Objekt repräsentierte Verzeichnis oder den gesamten Verzeichnisbaum, der in diesem Verzeichnis verwurzelt ist, nach Dateien, die die angegebenen Suchkriterien erfüllen.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| searchPattern | const String\& | Das Namensmuster der zu suchenden Dateien |
| searchOption | SearchOption | Gibt an, ob die Suche nur im Verzeichnis, das vom aktuellen Objekt repräsentiert wird, oder im gesamten Verzeichnisbaum, der im Verzeichnis des aktuellen Objekts verwurzelt ist, durchgeführt werden muss. |

### ReturnValue

Ein Array von Shared-Pointern auf [FileInfo](../../fileinfo/)-Objekte, die die gefundenen Dateien darstellen, deren Namen **searchPattern** entsprechen.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
