---
title: "System::IO::DirectoryInfo::EnumerateFileSystemInfos Methode"
linktitle: "EnumerateFileSystemInfos"
second_title: "Aspose.Font für C++"
description: "System::IO::DirectoryInfo::EnumerateFileSystemInfos Methode. Gibt eine aufzählbare Sammlung zurück, die alle Dateien und Verzeichnisse enthält, die sich im Verzeichnis befinden, das durch das aktuelle Objekt in C++ repräsentiert wird."
type: docs
weight: 700
url: /de/cpp/system.io/directoryinfo/enumeratefilesysteminfos/
---
## DirectoryInfo::EnumerateFileSystemInfos() method


Gibt eine aufzählbare Sammlung zurück, die alle im vom aktuellen Objekt repräsentierten Verzeichnis befindlichen Dateien und Verzeichnisse enthält.

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos()
```

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::EnumerateFileSystemInfos(const String\&) method


Durchsucht die Dateien und Verzeichnisse, die die angegebenen Suchkriterien im vom aktuellen Objekt repräsentierten Verzeichnis erfüllen.

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos(const String &searchPattern)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| searchPattern | const String\& | Das Namensmuster der zu suchenden Dateien und Verzeichnisse |

### ReturnValue

Die aufzählbare Sammlung von Shared-Pointern zu [FileSystemInfo](../../filesysteminfo/) Objekten, die die gefundenen Dateien und Verzeichnisse darstellen, deren Namen dem **searchPattern** entsprechen.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::EnumerateFileSystemInfos(const String\&, SearchOption) method


Durchsucht die Dateien und Verzeichnisse, die die angegebenen Suchkriterien entweder im vom aktuellen Objekt repräsentierten Verzeichnis oder im gesamten Verzeichnisbaum, der im vom aktuellen Objekt repräsentierten Verzeichnis verwurzelt ist, erfüllen.

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| searchPattern | const String\& | Das Namensmuster der zu suchenden Dateien und Verzeichnisse |
| searchOption | SearchOption | Gibt an, ob die Suche nur im Verzeichnis, das vom aktuellen Objekt repräsentiert wird, oder im gesamten Verzeichnisbaum, der im Verzeichnis des aktuellen Objekts verwurzelt ist, durchgeführt werden muss. |

### ReturnValue

Die aufzählbare Sammlung von Shared-Pointern zu [FileSystemInfo](../../filesysteminfo/) Objekten, die die gefundenen Dateien und Verzeichnisse darstellen, deren Namen dem **searchPattern** entsprechen.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
