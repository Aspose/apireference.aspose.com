---
title: "System::IO::DirectoryInfo::EnumerateFileSystemInfos metodo"
linktitle: "EnumerateFileSystemInfos"
second_title: "Aspose.Font per C++"
description: "System::IO::DirectoryInfo::EnumerateFileSystemInfos metodo. Restituisce una collezione enumerabile contenente tutti i file e le directory situati nella directory rappresentata dall'oggetto corrente in C++."
type: docs
weight: 700
url: /it/cpp/system.io/directoryinfo/enumeratefilesysteminfos/
---
## DirectoryInfo::EnumerateFileSystemInfos() method


Restituisce una collezione enumerabile contenente tutti i file e le directory situati nella directory rappresentata dall'oggetto corrente.

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos()
```

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::EnumerateFileSystemInfos(const String\&) method


Cerca i file e le directory che soddisfano i criteri di ricerca specificati nella directory rappresentata dall'oggetto corrente.

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos(const String &searchPattern)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| searchPattern | const String\& | Il modello di nome dei file e delle directory da cercare |

### ReturnValue

La collezione enumerabile di puntatori condivisi a oggetti [FileSystemInfo](../../filesysteminfo/) che rappresentano i file e le directory trovati i cui nomi corrispondono a **searchPattern**

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::EnumerateFileSystemInfos(const String\&, SearchOption) method


Cerca i file e le directory che soddisfano i criteri di ricerca specificati sia nella directory rappresentata dall'oggetto corrente sia nell'intero albero di directory radicato nella directory rappresentata dall'oggetto corrente.

```cpp
SharedPtr<IEnumerable<FileSystemInfoPtr>> System::IO::DirectoryInfo::EnumerateFileSystemInfos(const String &searchPattern, SearchOption searchOption)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| searchPattern | const String\& | Il modello di nome dei file e delle directory da cercare |
| searchOption | SearchOption | Specifica se la ricerca deve essere eseguita solo nella directory rappresentata dall'oggetto corrente o nell'intero albero di directory radicato nella directory rappresentata dall'oggetto corrente |

### ReturnValue

La collezione enumerabile di puntatori condivisi a oggetti [FileSystemInfo](../../filesysteminfo/) che rappresentano i file e le directory trovati i cui nomi corrispondono a **searchPattern**

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
