---
title: "System::IO::DirectoryInfo::EnumerateDirectories methode"
linktitle: "EnumerateDirectories"
second_title: "Aspose.Page voor C++"
description: "System::IO::DirectoryInfo::EnumerateDirectories methode. Retourneert een enumerabele collectie die alle mappen bevat die zich bevinden in de map die wordt vertegenwoordigd door het huidige object in C++."
type: docs
weight: 500
url: /nl/cpp/system.io/directoryinfo/enumeratedirectories/
---
## DirectoryInfo::EnumerateDirectories() method


Retourneert een doorzoekbare collectie met alle mappen die zich bevinden in de map die door het huidige object wordt vertegenwoordigd.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories()
```

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateDirectories(const String\&) method


Zoekt naar de mappen die voldoen aan de opgegeven zoekcriteria in de map die door het huidige object wordt vertegenwoordigd.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories(const String &searchPattern)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| searchPattern | const String\& | Het naampatroon van de mappen waarnaar gezocht moet worden. |

### ReturnValue

De enumerabele collectie van gedeelde pointers naar [DirectoryInfo](../) objecten die de gevonden mappen vertegenwoordigen waarvan de namen overeenkomen met **searchPattern**

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateDirectories(const String\&, SearchOption) method


Zoekt naar de mappen die voldoen aan de opgegeven zoekcriteria, hetzij in de map die door het huidige object wordt vertegenwoordigd, hetzij in de volledige mappenboom die is geworteld in de map die door het huidige object wordt vertegenwoordigd.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| searchPattern | const String\& | Het naampatroon van de mappen waarnaar gezocht moet worden. |
| searchOption | SearchOption | Specificeert of de zoekopdracht alleen moet worden uitgevoerd in de map die wordt vertegenwoordigd door het huidige object, of in de volledige mappenboom die is geworteld in de map die wordt vertegenwoordigd door het huidige object. |

### ReturnValue

De enumerabele collectie van gedeelde pointers naar [DirectoryInfo](../) objecten die de gevonden mappen vertegenwoordigen waarvan de namen overeenkomen met **searchPattern**

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
