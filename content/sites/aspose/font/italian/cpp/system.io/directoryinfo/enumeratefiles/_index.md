---
title: "System::IO::DirectoryInfo::EnumerateFiles method"
linktitle: "EnumerateFiles"
second_title: "Aspose.Font per C++"
description: "System::IO::DirectoryInfo::EnumerateFiles method. Restituisce una collezione enumerabile contenente tutti i file situati nella directory rappresentata dall'oggetto corrente in C++."
type: docs
weight: 600
url: /it/cpp/system.io/directoryinfo/enumeratefiles/
---
## DirectoryInfo::EnumerateFiles() method


Restituisce una collezione enumerabile contenente tutti i file situati nella directory rappresentata dall'oggetto corrente.

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles()
```

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::EnumerateFiles(const String\&) method


Cerca i file che soddisfano i criteri di ricerca specificati nella directory rappresentata dall'oggetto corrente.

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles(const String &searchPattern)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| searchPattern | const String\& | Il modello di nome dei file da cercare |

### ReturnValue

La collezione enumerabile di puntatori condivisi a oggetti [FileInfo](../../fileinfo/) che rappresentano i file trovati i cui nomi corrispondono a **searchPattern**

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::EnumerateFiles(const String\&, SearchOption) method


Cerca i file che soddisfano i criteri di ricerca specificati sia nella directory rappresentata dall'oggetto corrente sia nell'intero albero delle directory radicato nella directory rappresentata dall'oggetto corrente.

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles(const String &searchPattern, SearchOption searchOption)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| searchPattern | const String\& | Il modello di nome dei file da cercare |
| searchOption | SearchOption | Specifica se la ricerca deve essere eseguita solo nella directory rappresentata dall'oggetto corrente o nell'intero albero di directory radicato nella directory rappresentata dall'oggetto corrente |

### ReturnValue

La collezione enumerabile di puntatori condivisi a oggetti [FileInfo](../../fileinfo/) che rappresentano i file trovati i cui nomi corrispondono a **searchPattern**

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
