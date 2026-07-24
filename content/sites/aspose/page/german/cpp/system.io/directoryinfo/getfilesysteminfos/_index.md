---
title: "System::IO::DirectoryInfo::GetFileSystemInfos-Methode"
linktitle: "GetFileSystemInfos"
second_title: "Aspose.Page für C++"
description: "System::IO::DirectoryInfo::GetFileSystemInfos-Methode. Gibt ein Array zurück, das Shared-Pointer auf FileSystemInfo-Objekte enthält, die alle Dateien und Verzeichnisse darstellen, die sich im Verzeichnis befinden, das durch das aktuelle Objekt repräsentiert wird, in C++."
type: docs
weight: 1400
url: /de/cpp/system.io/directoryinfo/getfilesysteminfos/
---
## DirectoryInfo::GetFileSystemInfos() method


Gibt ein Array zurück, das Shared-Pointer auf [FileSystemInfo](../../filesysteminfo/)-Objekte enthält, die alle Dateien und Verzeichnisse darstellen, die sich im Verzeichnis befinden, das durch das aktuelle Objekt repräsentiert wird.

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos()
```

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetFileSystemInfos(const String\&) method


Durchsucht das vom aktuellen Objekt repräsentierte Verzeichnis nach Dateien und Verzeichnissen, die die angegebenen Suchkriterien erfüllen.

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos(const String &searchPattern)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| searchPattern | const String\& | Das Namensmuster der zu suchenden Dateien und Verzeichnisse |

### ReturnValue

Ein Array von Shared-Pointern auf [FileSystemInfo](../../filesysteminfo/)-Objekte, die die gefundenen Dateien und Verzeichnisse darstellen, deren Namen mit **searchPattern** übereinstimmen.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetFileSystemInfos(const String\&, SearchOption) method


Durchsucht entweder das vom aktuellen Objekt repräsentierte Verzeichnis oder den gesamten Verzeichnisbaum, der im Verzeichnis des aktuellen Objekts verwurzelt ist, nach Dateien und Verzeichnissen, die die angegebenen Suchkriterien erfüllen.

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| searchPattern | const String\& | Das Namensmuster der zu suchenden Dateien und Verzeichnisse |
| searchOption | SearchOption | Gibt an, ob die Suche nur im vom aktuellen Objekt repräsentierten Verzeichnis oder im gesamten Verzeichnisbaum, der im vom aktuellen Objekt repräsentierten Verzeichnis verwurzelt ist, durchgeführt werden muss |

### ReturnValue

Ein Array von Shared-Pointern auf [FileSystemInfo](../../filesysteminfo/)-Objekte, die die gefundenen Dateien und Verzeichnisse darstellen, deren Namen mit **searchPattern** übereinstimmen.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
