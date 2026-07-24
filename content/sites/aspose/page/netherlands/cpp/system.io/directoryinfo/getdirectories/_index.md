---
title: "System::IO::DirectoryInfo::GetDirectories methode"
linktitle: "GetDirectories"
second_title: "Aspose.Page voor C++"
description: "System::IO::DirectoryInfo::GetDirectories methode. Retourneert een array met gedeelde pointers naar DirectoryInfo-objecten die alle mappen vertegenwoordigen die zich bevinden in de map die wordt vertegenwoordigd door het huidige object in C++."
type: docs
weight: 1200
url: /nl/cpp/system.io/directoryinfo/getdirectories/
---
## DirectoryInfo::GetDirectories() method


Retourneert een array met gedeelde pointers naar [DirectoryInfo](../) objecten die alle mappen vertegenwoordigen die zich bevinden in de map die wordt vertegenwoordigd door het huidige object.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories()
```

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&) method


Zoekt naar de mappen die voldoen aan de opgegeven zoekcriteria in de map die door het huidige object wordt vertegenwoordigd.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| searchPattern | const String\& | Het naampatroon van de mappen waarnaar gezocht moet worden. |

### ReturnValue

Een array van gedeelde pointers naar [DirectoryInfo](../) objecten die de gevonden mappen vertegenwoordigen waarvan de namen overeenkomen met **searchPattern**.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&, SearchOption) method


Zoekt naar de mappen die voldoen aan de opgegeven zoekcriteria, hetzij in de map die door het huidige object wordt vertegenwoordigd, hetzij in de volledige mappenboom die is geworteld in de map die door het huidige object wordt vertegenwoordigd.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| searchPattern | const String\& | Het naampatroon van de mappen waarnaar gezocht moet worden. |
| searchOption | SearchOption | Specificeert of de zoekopdracht alleen moet worden uitgevoerd in de map die wordt vertegenwoordigd door het huidige object, of in de volledige mappenboom die is geworteld in de map die wordt vertegenwoordigd door het huidige object. |

### ReturnValue

Een array van gedeelde pointers naar [DirectoryInfo](../) objecten die de gevonden mappen vertegenwoordigen waarvan de namen overeenkomen met **searchPattern**.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
