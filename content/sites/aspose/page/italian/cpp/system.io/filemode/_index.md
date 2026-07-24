---
title: "System::IO::FileMode enum"
linktitle: "FileMode"
second_title: "Aspose.Page per C++"
description: "System::IO::FileMode enum. Specifica come un file dovrebbe essere aperto in C++."
type: docs
weight: 3100
url: /it/cpp/system.io/filemode/
---
## FileMode enum


Specifica come dovrebbe essere aperto un file.

```cpp
enum class FileMode
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| CreateNew | 1 | Crea un nuovo file. Se il file esiste già, viene sollevata un'eccezione. |
| Crea | 2 | Crea un nuovo file. Se il file esiste già, viene sovrascritto. |
| Open | 3 | Apri un file esistente. Se il file non esiste, viene sollevata un'eccezione. |
| OpenOrCreate | 4 | Apri un file esistente o creane uno nuovo se non esiste. |
| Tronca | 5 | Apri un file esistente e troncalo in modo che sia vuoto. Se il file non esiste, viene sollevata un'eccezione. |
| Append | 6 | Apri un file esistente e posizionati alla fine, oppure crea un nuovo file se non esiste. |

## Vedi anche

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
