---
title: "System::IO::DirectoryInfo::GetFileSystemInfos methode"
linktitle: "GetFileSystemInfos"
second_title: "Aspose.Page voor C++"
description: "System::IO::DirectoryInfo::GetFileSystemInfos methode. Retourneert een array met gedeelde pointers naar FileSystemInfo-objecten die alle bestanden en mappen vertegenwoordigen die zich bevinden in de map die wordt weergegeven door het huidige object in C++."
type: docs
weight: 1400
url: /nl/cpp/system.io/directoryinfo/getfilesysteminfos/
---
## DirectoryInfo::GetFileSystemInfos() method


Retourneert een array met gedeelde pointers naar [FileSystemInfo](../../filesysteminfo/) objecten die alle bestanden en mappen vertegenwoordigen die zich bevinden in de map die wordt weergegeven door het huidige object.

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos()
```

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetFileSystemInfos(const String\&) method


Zoekt naar de bestanden en mappen die voldoen aan de opgegeven zoekcriteria in de map die door het huidige object wordt vertegenwoordigd.

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos(const String &searchPattern)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| searchPattern | const String\& | Het naampatroon van de bestanden en mappen waarnaar gezocht moet worden |

### ReturnValue

Een array met gedeelde pointers naar [FileSystemInfo](../../filesysteminfo/) objecten die de gevonden bestanden en mappen vertegenwoordigen waarvan de namen overeenkomen met **searchPattern**

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetFileSystemInfos(const String\&, SearchOption) method


Zoekt naar de bestanden en mappen die voldoen aan de opgegeven zoekcriteria, hetzij in de map die door het huidige object wordt vertegenwoordigd, hetzij in de volledige mappenboom die is geworteld in de map die door het huidige object wordt vertegenwoordigd.

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| searchPattern | const String\& | Het naampatroon van de bestanden en mappen waarnaar gezocht moet worden |
| searchOption | SearchOption | Specificeert of de zoekopdracht alleen moet worden uitgevoerd in de map die wordt vertegenwoordigd door het huidige object, of in de volledige mappenboom die is geworteld in de map die wordt vertegenwoordigd door het huidige object. |

### ReturnValue

Een array met gedeelde pointers naar [FileSystemInfo](../../filesysteminfo/) objecten die de gevonden bestanden en mappen vertegenwoordigen waarvan de namen overeenkomen met **searchPattern**

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
