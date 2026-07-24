---
title: "System::IO::DirectoryInfo::GetFiles methode"
linktitle: "GetFiles"
second_title: "Aspose.Page voor C++"
description: "System::IO::DirectoryInfo::GetFiles methode. Retourneert een array die gedeelde pointers naar FileInfo-objecten bevat die alle mappen vertegenwoordigen die zich bevinden in de map die wordt vertegenwoordigd door het huidige object in C++."
type: docs
weight: 1300
url: /nl/cpp/system.io/directoryinfo/getfiles/
---
## DirectoryInfo::GetFiles() method


Retourneert een array die gedeelde pointers naar [FileInfo](../../fileinfo/) objecten bevat die alle mappen vertegenwoordigen die zich bevinden in de map die wordt vertegenwoordigd door het huidige object.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles()
```

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetFiles(const String\&) method


Zoekt naar de bestanden die voldoen aan de opgegeven zoekcriteria in de map die door het huidige object wordt vertegenwoordigd.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles(const String &searchPattern)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| searchPattern | const String\& | Het naampatroon van de bestanden om naar te zoeken |

### ReturnValue

Een array van gedeelde pointers naar [FileInfo](../../fileinfo/) objecten die de gevonden bestanden vertegenwoordigen waarvan de namen overeenkomen met **searchPattern**

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetFiles(const String\&, SearchOption) method


Zoekt naar de bestanden die voldoen aan de opgegeven zoekcriteria, hetzij in de map die door het huidige object wordt vertegenwoordigd, hetzij in de volledige mappenboom die is geworteld in de map die door het huidige object wordt vertegenwoordigd.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| searchPattern | const String\& | Het naampatroon van de bestanden om naar te zoeken |
| searchOption | SearchOption | Specificeert of de zoekopdracht alleen moet worden uitgevoerd in de map die wordt vertegenwoordigd door het huidige object, of in de volledige mappenboom die is geworteld in de map die wordt vertegenwoordigd door het huidige object. |

### ReturnValue

Een array van gedeelde pointers naar [FileInfo](../../fileinfo/) objecten die de gevonden bestanden vertegenwoordigen waarvan de namen overeenkomen met **searchPattern**

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
