---
title: "System::IO::DirectoryInfo::EnumerateDirectories method"
linktitle: "EnumerateDirectories"
second_title: "Aspose.Font per C++"
description: "Metodo System::IO::DirectoryInfo::EnumerateDirectories. Restituisce una collezione enumerabile contenente tutte le directory situate nella directory rappresentata dall'oggetto corrente in C++."
type: docs
weight: 500
url: /it/cpp/system.io/directoryinfo/enumeratedirectories/
---
## DirectoryInfo::EnumerateDirectories() method


Restituisce una collezione enumerabile contenente tutte le directory situate nella directory rappresentata dall'oggetto corrente.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories()
```

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::EnumerateDirectories(const String\&) method


Cerca le directory che soddisfano i criteri di ricerca specificati nella directory rappresentata dall'oggetto corrente.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories(const String &searchPattern)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| searchPattern | const String\& | Il modello di nome delle directory da cercare |

### ReturnValue

La collezione enumerabile di puntatori condivisi a oggetti [DirectoryInfo](../) che rappresentano le directory trovate i cui nomi corrispondono a **searchPattern**

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::EnumerateDirectories(const String\&, SearchOption) method


Cerca le directory che soddisfano i criteri di ricerca specificati sia nella directory rappresentata dall'oggetto corrente sia nell'intero albero delle directory radicato nella directory rappresentata dall'oggetto corrente.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories(const String &searchPattern, SearchOption searchOption)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| searchPattern | const String\& | Il modello di nome delle directory da cercare |
| searchOption | SearchOption | Specifica se la ricerca deve essere eseguita solo nella directory rappresentata dall'oggetto corrente o nell'intero albero di directory radicato nella directory rappresentata dall'oggetto corrente |

### ReturnValue

La collezione enumerabile di puntatori condivisi a oggetti [DirectoryInfo](../) che rappresentano le directory trovate i cui nomi corrispondono a **searchPattern**

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
