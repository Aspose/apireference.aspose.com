---
title: "System::IO::DirectoryInfo::GetFileSystemInfos-Methode"
linktitle: "GetFileSystemInfos"
second_title: "Aspose.Font für C++"
description: "System::IO::DirectoryInfo::GetFileSystemInfos-Methode. Gibt ein Array zurück, das Shared-Pointer zu FileSystemInfo-Objekten enthält, die alle Dateien und Verzeichnisse darstellen, die sich im durch das aktuelle Objekt dargestellten Verzeichnis in C++ befinden."
type: docs
weight: 1400
url: /de/cpp/system.io/directoryinfo/getfilesysteminfos/
---
## DirectoryInfo::GetFileSystemInfos() method


Gibt ein Array zurück, das Shared-Pointer zu [FileSystemInfo](../../filesysteminfo/)-Objekten enthält, die alle Dateien und Verzeichnisse darstellen, die sich im durch das aktuelle Objekt dargestellten Verzeichnis befinden.

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos()
```

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetFileSystemInfos(const String\&) method


Durchsucht die Dateien und Verzeichnisse, die die angegebenen Suchkriterien im vom aktuellen Objekt repräsentierten Verzeichnis erfüllen.

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos(const String &searchPattern)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| searchPattern | const String\& | Das Namensmuster der zu suchenden Dateien und Verzeichnisse |

### ReturnValue

Ein Array von Shared-Pointern zu [FileSystemInfo](../../filesysteminfo/)-Objekten, die die gefundenen Dateien und Verzeichnisse darstellen, deren Namen mit **searchPattern** übereinstimmen.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetFileSystemInfos(const String\&, SearchOption) method


Durchsucht die Dateien und Verzeichnisse, die die angegebenen Suchkriterien entweder im vom aktuellen Objekt repräsentierten Verzeichnis oder im gesamten Verzeichnisbaum, der im vom aktuellen Objekt repräsentierten Verzeichnis verwurzelt ist, erfüllen.

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| searchPattern | const String\& | Das Namensmuster der zu suchenden Dateien und Verzeichnisse |
| searchOption | SearchOption | Gibt an, ob die Suche nur im Verzeichnis, das vom aktuellen Objekt repräsentiert wird, oder im gesamten Verzeichnisbaum, der im Verzeichnis des aktuellen Objekts verwurzelt ist, durchgeführt werden muss. |

### ReturnValue

Ein Array von Shared-Pointern zu [FileSystemInfo](../../filesysteminfo/)-Objekten, die die gefundenen Dateien und Verzeichnisse darstellen, deren Namen mit **searchPattern** übereinstimmen.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
