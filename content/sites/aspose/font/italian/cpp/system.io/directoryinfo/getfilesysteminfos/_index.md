---
title: "Metodo System::IO::DirectoryInfo::GetFileSystemInfos"
linktitle: "GetFileSystemInfos"
second_title: "Aspose.Font per C++"
description: "Metodo System::IO::DirectoryInfo::GetFileSystemInfos. Restituisce un array contenente puntatori condivisi a oggetti FileSystemInfo che rappresentano tutti i file e le directory situati nella directory rappresentata dall'oggetto corrente in C++."
type: docs
weight: 1400
url: /it/cpp/system.io/directoryinfo/getfilesysteminfos/
---
## DirectoryInfo::GetFileSystemInfos() method


Restituisce un array contenente puntatori condivisi a oggetti [FileSystemInfo](../../filesysteminfo/) che rappresentano tutti i file e le directory situati nella directory rappresentata dall'oggetto corrente.

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos()
```

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetFileSystemInfos(const String\&) method


Cerca i file e le directory che soddisfano i criteri di ricerca specificati nella directory rappresentata dall'oggetto corrente.

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos(const String &searchPattern)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| searchPattern | const String\& | Il modello di nome dei file e delle directory da cercare |

### ReturnValue

Un array di puntatori condivisi a oggetti [FileSystemInfo](../../filesysteminfo/) che rappresentano i file e le directory trovati i cui nomi corrispondono a **searchPattern**

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetFileSystemInfos(const String\&, SearchOption) method


Cerca i file e le directory che soddisfano i criteri di ricerca specificati sia nella directory rappresentata dall'oggetto corrente sia nell'intero albero di directory radicato nella directory rappresentata dall'oggetto corrente.

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos(const String &searchPattern, SearchOption searchOption)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| searchPattern | const String\& | Il modello di nome dei file e delle directory da cercare |
| searchOption | SearchOption | Specifica se la ricerca deve essere eseguita solo nella directory rappresentata dall'oggetto corrente o nell'intero albero di directory radicato nella directory rappresentata dall'oggetto corrente |

### ReturnValue

Un array di puntatori condivisi a oggetti [FileSystemInfo](../../filesysteminfo/) che rappresentano i file e le directory trovati i cui nomi corrispondono a **searchPattern**

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
