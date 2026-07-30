---
title: "System::IO::Directory::GetFiles metodo"
linktitle: "GetFiles"
second_title: "Aspose.Font per C++"
description: "System::IO::Directory::GetFiles metodo. Cerca i file che soddisfano i criteri di ricerca specificati, sia nella directory specificata sia nell'intero albero di directory radicato nella directory specificata, in C++."
type: docs
weight: 1200
url: /it/cpp/system.io/directory/getfiles/
---
## Directory::GetFiles method


Cerca i file che soddisfano i criteri di ricerca specificati, sia nella directory specificata sia nell'intero albero di directory radicato nella directory specificata.

```cpp
static ArrayPtr<String> System::IO::Directory::GetFiles(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| percorso | const String\& | Percorso completo o relativo della directory in cui cercare |
| searchPattern | const String\& | Il modello di nome dei file da cercare |
| searchOption | SearchOption | Specifica se la ricerca deve essere eseguita solo nella directory specificata o nell'intero albero di directory radicato nella directory specificata |

### ReturnValue

Un array di percorsi completi dei file trovati i cui nomi corrispondono a **searchPattern**

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
