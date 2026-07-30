---
title: "System::IO::DirectoryInfo::GetFiles method"
linktitle: "GetFiles"
second_title: "Aspose.Font per C++"
description: "System::IO::DirectoryInfo::GetFiles method. Restituisce un array contenente puntatori condivisi a oggetti FileInfo che rappresentano tutte le directory situate nella directory rappresentata dall'oggetto corrente in C++."
type: docs
weight: 1300
url: /it/cpp/system.io/directoryinfo/getfiles/
---
## DirectoryInfo::GetFiles() method


Restituisce un array contenente puntatori condivisi a oggetti [FileInfo](../../fileinfo/) che rappresentano tutte le directory situate nella directory rappresentata dall'oggetto corrente.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles()
```

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetFiles(const String\&) method


Cerca i file che soddisfano i criteri di ricerca specificati nella directory rappresentata dall'oggetto corrente.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles(const String &searchPattern)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| searchPattern | const String\& | Il modello di nome dei file da cercare |

### ReturnValue

Un array di puntatori condivisi a oggetti [FileInfo](../../fileinfo/) che rappresentano i file trovati i cui nomi corrispondono a **searchPattern**

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetFiles(const String\&, SearchOption) method


Cerca i file che soddisfano i criteri di ricerca specificati sia nella directory rappresentata dall'oggetto corrente sia nell'intero albero delle directory radicato nella directory rappresentata dall'oggetto corrente.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles(const String &searchPattern, SearchOption searchOption)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| searchPattern | const String\& | Il modello di nome dei file da cercare |
| searchOption | SearchOption | Specifica se la ricerca deve essere eseguita solo nella directory rappresentata dall'oggetto corrente o nell'intero albero di directory radicato nella directory rappresentata dall'oggetto corrente |

### ReturnValue

Un array di puntatori condivisi a oggetti [FileInfo](../../fileinfo/) che rappresentano i file trovati i cui nomi corrispondono a **searchPattern**

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
