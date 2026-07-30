---
title: "System::IO::DirectoryInfo::GetDirectories metodo"
linktitle: "GetDirectories"
second_title: "Aspose.Font per C++"
description: "System::IO::DirectoryInfo::GetDirectories metodo. Restituisce un array contenente puntatori condivisi a oggetti DirectoryInfo che rappresentano tutte le directory situate nella directory rappresentata dall'oggetto corrente in C++."
type: docs
weight: 1200
url: /it/cpp/system.io/directoryinfo/getdirectories/
---
## DirectoryInfo::GetDirectories() method


Restituisce un array contenente puntatori condivisi a oggetti [DirectoryInfo](../) che rappresentano tutte le directory situate nella directory rappresentata dall'oggetto corrente.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories()
```

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&) method


Cerca le directory che soddisfano i criteri di ricerca specificati nella directory rappresentata dall'oggetto corrente.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| searchPattern | const String\& | Il modello di nome delle directory da cercare |

### ReturnValue

Un array di puntatori condivisi a oggetti [DirectoryInfo](../) che rappresentano le directory trovate i cui nomi corrispondono a **searchPattern**

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&, SearchOption) method


Cerca le directory che soddisfano i criteri di ricerca specificati sia nella directory rappresentata dall'oggetto corrente sia nell'intero albero delle directory radicato nella directory rappresentata dall'oggetto corrente.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern, SearchOption searchOption)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| searchPattern | const String\& | Il modello di nome delle directory da cercare |
| searchOption | SearchOption | Specifica se la ricerca deve essere eseguita solo nella directory rappresentata dall'oggetto corrente o nell'intero albero di directory radicato nella directory rappresentata dall'oggetto corrente |

### ReturnValue

Un array di puntatori condivisi a oggetti [DirectoryInfo](../) che rappresentano le directory trovate i cui nomi corrispondono a **searchPattern**

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
