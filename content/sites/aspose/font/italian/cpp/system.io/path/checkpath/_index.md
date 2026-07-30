---
title: "System::IO::Path::CheckPath metodo"
linktitle: "CheckPath"
second_title: "Aspose.Font per C++"
description: "System::IO::Path::CheckPath metodo. Determina se il percorso specificato è valido controllando se contiene caratteri non validi. Viene sollevata un'eccezione se il percorso contiene caratteri non validi in C++."
type: docs
weight: 200
url: /it/cpp/system.io/path/checkpath/
---
## Path::CheckPath method


Determina se il percorso specificato è valido controllando se contiene caratteri non validi. Viene sollevata un'eccezione se il percorso contiene caratteri non validi.

```cpp
static void System::IO::Path::CheckPath(const String &path, const String &msg=s_msg_path, bool allow_empty=true)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| percorso | const String\& | Il percorso da verificare |
| msg | const String\& | Il messaggio da passare al costruttore dell'oggetto eccezione |
| allow_empty | bool | Specifica se una stringa vuota o null deve essere considerata un percorso corretto (true) o no (false); se questo parametro è false e **path** è vuoto viene sollevata un'ArgumentException; se questo parametro è false e **path** è null viene sollevata un'ArgumentNullException |

## Vedi anche

* Class [String](../../../system/string/)
* Class [Path](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
