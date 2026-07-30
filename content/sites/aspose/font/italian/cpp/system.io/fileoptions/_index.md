---
title: "System::IO::FileOptions enum"
linktitle: "FileOptions"
second_title: "Aspose.Font per C++"
description: "System::IO::FileOptions enum. Rappresenta le opzioni avanzate per la creazione dell'oggetto FileStream in C++."
type: docs
weight: 3200
url: /it/cpp/system.io/fileoptions/
---
## FileOptions enum


Rappresenta le opzioni avanzate per la creazione dell'oggetto [FileStream](../filestream/).

```cpp
enum class FileOptions
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| None | 0 | Nessuna opzione aggiuntiva. |
| Cifrata | 16384 | Il file è criptato. NON IMPLEMENTATO. |
| DeleteOnClose | 67108864 | Il file dovrebbe essere eliminato automaticamente quando non è più in uso. |
| SequentialScan | 134217728 | Il file dovrebbe essere accessibile in modo sequenziale. |
| RandomAccess | 268435456 | Il file è accessibile in modo casuale. |
| Asynchronous | 1073741824 | Il file può essere utilizzato per operazioni I/O asincrone. |
| WriteThrough | n/a | Tutte le scritture dovrebbero andare direttamente al disco bypassando qualsiasi cache intermedia. |

## Vedi anche

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
