---
title: "System::IO::DirectoryInfo::GetDirectories-Methode"
linktitle: "GetDirectories"
second_title: "Aspose.Font für C++"
description: "System::IO::DirectoryInfo::GetDirectories-Methode. Gibt ein Array zurück, das Shared-Pointer auf DirectoryInfo-Objekte enthält, die alle Verzeichnisse darstellen, die sich im durch das aktuelle Objekt repräsentierten Verzeichnis befinden, in C++."
type: docs
weight: 1200
url: /de/cpp/system.io/directoryinfo/getdirectories/
---
## DirectoryInfo::GetDirectories() method


Gibt ein Array zurück, das Shared-Pointer auf [DirectoryInfo](../)-Objekte enthält, die alle Verzeichnisse darstellen, die sich im durch das aktuelle Objekt repräsentierten Verzeichnis befinden.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories()
```

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&) method


Durchsucht das vom aktuellen Objekt repräsentierte Verzeichnis nach Verzeichnissen, die die angegebenen Suchkriterien erfüllen.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| searchPattern | const String\& | Das Namensmuster der zu suchenden Verzeichnisse |

### ReturnValue

Ein Array von Shared-Pointern auf [DirectoryInfo](../)-Objekte, die die gefundenen Verzeichnisse darstellen, deren Namen **searchPattern** entsprechen.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&, SearchOption) method


Durchsucht entweder das vom aktuellen Objekt repräsentierte Verzeichnis oder den gesamten Verzeichnisbaum, der in diesem Verzeichnis verwurzelt ist, nach Verzeichnissen, die die angegebenen Suchkriterien erfüllen.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| searchPattern | const String\& | Das Namensmuster der zu suchenden Verzeichnisse |
| searchOption | SearchOption | Gibt an, ob die Suche nur im Verzeichnis, das vom aktuellen Objekt repräsentiert wird, oder im gesamten Verzeichnisbaum, der im Verzeichnis des aktuellen Objekts verwurzelt ist, durchgeführt werden muss. |

### ReturnValue

Ein Array von Shared-Pointern auf [DirectoryInfo](../)-Objekte, die die gefundenen Verzeichnisse darstellen, deren Namen **searchPattern** entsprechen.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
