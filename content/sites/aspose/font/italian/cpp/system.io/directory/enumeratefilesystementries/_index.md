---
title: "System::IO::Directory::EnumerateFileSystemEntries metodo"
linktitle: "EnumerateFileSystemEntries"
second_title: "Aspose.Font per C++"
description: "System::IO::Directory::EnumerateFileSystemEntries metodo. Cerca i file e le directory che soddisfano i criteri di ricerca specificati, sia nella directory specificata sia nell'intero albero di directory radicato nella directory specificata, in C++."
type: docs
weight: 500
url: /it/cpp/system.io/directory/enumeratefilesystementries/
---
## Directory::EnumerateFileSystemEntries method


Cerca i file e le directory che soddisfano i criteri di ricerca specificati, sia nella directory specificata sia nell'intero albero di directory radicato nella directory specificata.

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateFileSystemEntries(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| percorso | const String\& | Percorso completo o relativo della directory in cui cercare |
| searchPattern | const String\& | Il modello di nome dei file e delle directory da cercare |
| searchOption | SearchOption | Specifica se la ricerca deve essere eseguita solo nella directory specificata o nell'intero albero di directory radicato nella directory specificata |

### ReturnValue

La collezione enumerabile di percorsi completi dei file e delle directory trovati i cui nomi corrispondono a **searchPattern**

## Vedi anche

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
