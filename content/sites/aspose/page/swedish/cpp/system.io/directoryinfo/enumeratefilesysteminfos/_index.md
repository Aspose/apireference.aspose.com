---
title: "System::IO::DirectoryInfo::EnumerateFileSystemInfos metod"
linktitle: "EnumerateFileSystemInfos"
second_title: "Aspose.Page för C++"
description: "System::IO::DirectoryInfo::EnumerateFileSystemInfos metod. Returnerar en enumererbar samling som innehåller alla filer och kataloger som finns i den katalog som representeras av det aktuella objektet i C++."
type: docs
weight: 700
url: /sv/cpp/system.io/directoryinfo/enumeratefilesysteminfos/
---
## DirectoryInfo::EnumerateFileSystemInfos() method


Returnerar en uppräkningsbar samling som innehåller alla filer och kataloger som finns i katalogen som representeras av det aktuella objektet.

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos()
```

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateFileSystemInfos(const String\&) method


Söker efter filer och kataloger som uppfyller de angivna sökkriterierna i katalogen som representeras av det aktuella objektet.

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos(const String &searchPattern)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| searchPattern | const String\& | Namnmönstret för de filer och kataloger som ska sökas efter |

### ReturnValue

Den enumererbara samlingen av delade pekare till [FileSystemInfo](../../filesysteminfo/) -objekt som representerar de hittade filerna och katalogerna vars namn matchar **searchPattern**

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateFileSystemInfos(const String\&, SearchOption) method


Söker efter filer och kataloger som uppfyller de angivna sökkriterierna antingen i katalogen som representeras av det aktuella objektet eller i hela katalogträdet som har rot i katalogen som representeras av det aktuella objektet.

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| searchPattern | const String\& | Namnmönstret för de filer och kataloger som ska sökas efter |
| searchOption | SearchOption | Anger om sökningen ska utföras endast i katalogen som representeras av det aktuella objektet eller i hela katalogträdet som har den katalogen som rot. |

### ReturnValue

Den enumererbara samlingen av delade pekare till [FileSystemInfo](../../filesysteminfo/) -objekt som representerar de hittade filerna och katalogerna vars namn matchar **searchPattern**

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
