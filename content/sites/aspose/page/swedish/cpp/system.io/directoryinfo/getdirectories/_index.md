---
title: "System::IO::DirectoryInfo::GetDirectories metod"
linktitle: "GetDirectories"
second_title: "Aspose.Page för C++"
description: "System::IO::DirectoryInfo::GetDirectories metod. Returnerar en array som innehåller delade pekare till DirectoryInfo-objekt som representerar alla kataloger som finns i katalogen som representeras av det aktuella objektet i C++."
type: docs
weight: 1200
url: /sv/cpp/system.io/directoryinfo/getdirectories/
---
## DirectoryInfo::GetDirectories() method


Returnerar en array som innehåller delade pekare till [DirectoryInfo](../)-objekt som representerar alla kataloger som finns i katalogen som representeras av det aktuella objektet.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories()
```

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&) method


Söker efter kataloger som uppfyller de angivna sökkriterierna i katalogen som representeras av det aktuella objektet.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| searchPattern | const String\& | Namnmönstret för de kataloger som ska sökas efter |

### ReturnValue

En array av delade pekare till [DirectoryInfo](../)-objekt som representerar de hittade katalogerna vars namn matchar **searchPattern**

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&, SearchOption) method


Söker efter kataloger som uppfyller de angivna sökkriterierna antingen i katalogen som representeras av det aktuella objektet eller i hela katalogträdet som har sin rot i katalogen som representeras av det aktuella objektet.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| searchPattern | const String\& | Namnmönstret för de kataloger som ska sökas efter |
| searchOption | SearchOption | Anger om sökningen ska utföras endast i katalogen som representeras av det aktuella objektet eller i hela katalogträdet som har den katalogen som rot. |

### ReturnValue

En array av delade pekare till [DirectoryInfo](../)-objekt som representerar de hittade katalogerna vars namn matchar **searchPattern**

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
