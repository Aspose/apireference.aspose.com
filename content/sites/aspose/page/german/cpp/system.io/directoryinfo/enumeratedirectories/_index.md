---
title: "System::IO::DirectoryInfo::EnumerateDirectories-Methode"
linktitle: "EnumerateDirectories"
second_title: "Aspose.Page für C++"
description: "System::IO::DirectoryInfo::EnumerateDirectories-Methode. Gibt eine aufzählbare Sammlung zurück, die alle Verzeichnisse enthält, die sich im Verzeichnis befinden, das durch das aktuelle Objekt repräsentiert wird, in C++."
type: docs
weight: 500
url: /de/cpp/system.io/directoryinfo/enumeratedirectories/
---
## DirectoryInfo::EnumerateDirectories() method


Gibt eine aufzählbare Sammlung zurück, die alle im vom aktuellen Objekt repräsentierten Verzeichnis befindlichen Verzeichnisse enthält.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories()
```

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateDirectories(const String\&) method


Durchsucht das vom aktuellen Objekt repräsentierte Verzeichnis nach Verzeichnissen, die die angegebenen Suchkriterien erfüllen.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories(const String &searchPattern)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| searchPattern | const String\& | Das Namensmuster der zu suchenden Verzeichnisse |

### ReturnValue

Die aufzählbare Sammlung von Shared-Pointern auf [DirectoryInfo](../)-Objekte, die die gefundenen Verzeichnisse darstellen, deren Namen mit **searchPattern** übereinstimmen.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateDirectories(const String\&, SearchOption) method


Durchsucht entweder das vom aktuellen Objekt repräsentierte Verzeichnis oder den gesamten Verzeichnisbaum, der im vom aktuellen Objekt repräsentierten Verzeichnis verwurzelt ist, nach Verzeichnissen, die die angegebenen Suchkriterien erfüllen.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| searchPattern | const String\& | Das Namensmuster der zu suchenden Verzeichnisse |
| searchOption | SearchOption | Gibt an, ob die Suche nur im vom aktuellen Objekt repräsentierten Verzeichnis oder im gesamten Verzeichnisbaum, der im vom aktuellen Objekt repräsentierten Verzeichnis verwurzelt ist, durchgeführt werden muss |

### ReturnValue

Die aufzählbare Sammlung von Shared-Pointern auf [DirectoryInfo](../)-Objekte, die die gefundenen Verzeichnisse darstellen, deren Namen mit **searchPattern** übereinstimmen.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
