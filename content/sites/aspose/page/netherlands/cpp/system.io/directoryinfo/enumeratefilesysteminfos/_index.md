---
title: "System::IO::DirectoryInfo::EnumerateFileSystemInfos methode"
linktitle: "EnumerateFileSystemInfos"
second_title: "Aspose.Page voor C++"
description: "System::IO::DirectoryInfo::EnumerateFileSystemInfos methode. Retourneert een enumerabele collectie met alle bestanden en mappen die zich bevinden in de map die wordt weergegeven door het huidige object in C++."
type: docs
weight: 700
url: /nl/cpp/system.io/directoryinfo/enumeratefilesysteminfos/
---
## DirectoryInfo::EnumerateFileSystemInfos() method


Retourneert een doorzoekbare collectie met alle bestanden en mappen die zich bevinden in de map die door het huidige object wordt vertegenwoordigd.

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos()
```

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateFileSystemInfos(const String\&) method


Zoekt naar de bestanden en mappen die voldoen aan de opgegeven zoekcriteria in de map die door het huidige object wordt vertegenwoordigd.

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos(const String &searchPattern)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| searchPattern | const String\& | Het naampatroon van de bestanden en mappen waarnaar gezocht moet worden |

### ReturnValue

De enumerabele collectie van gedeelde pointers naar [FileSystemInfo](../../filesysteminfo/) objecten die de gevonden bestanden en mappen vertegenwoordigen waarvan de namen overeenkomen met **searchPattern**

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateFileSystemInfos(const String\&, SearchOption) method


Zoekt naar de bestanden en mappen die voldoen aan de opgegeven zoekcriteria, hetzij in de map die door het huidige object wordt vertegenwoordigd, hetzij in de volledige mappenboom die is geworteld in de map die door het huidige object wordt vertegenwoordigd.

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| searchPattern | const String\& | Het naampatroon van de bestanden en mappen waarnaar gezocht moet worden |
| searchOption | SearchOption | Specificeert of de zoekopdracht alleen moet worden uitgevoerd in de map die wordt vertegenwoordigd door het huidige object, of in de volledige mappenboom die is geworteld in de map die wordt vertegenwoordigd door het huidige object. |

### ReturnValue

De enumerabele collectie van gedeelde pointers naar [FileSystemInfo](../../filesysteminfo/) objecten die de gevonden bestanden en mappen vertegenwoordigen waarvan de namen overeenkomen met **searchPattern**

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
