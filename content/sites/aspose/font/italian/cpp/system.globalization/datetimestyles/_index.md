---
title: "System::Globalization::DateTimeStyles enum"
linktitle: "DateTimeStyles"
second_title: "Aspose.Font per C++"
description: "System::Globalization::DateTimeStyles enum. Definisce le opzioni di formattazione di data e ora. Flag a bit in C++."
type: docs
weight: 3500
url: /it/cpp/system.globalization/datetimestyles/
---
## DateTimeStyles enum


Definisce le opzioni di formattazione di data e ora. Flag di bit.

```cpp
enum class DateTimeStyles : int32_t
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| None | 0 | Predefinito. |
| AllowLeadingWhite | 1 | Ignora gli spazi bianchi iniziali. |
| AllowTrailingWhite | 2 | Ignora gli spazi bianchi finali. |
| AllowInnerWhite | 4 | Ignora gli spazi bianchi interni. |
| AllowWhiteSpaces | n/a | Ignora tutti gli spazi bianchi. |
| NoCurrentDateDefault | 8 | Durante l'analisi di una stringa data/ora, se anno/mese/giorno sono tutti mancanti, imposta la data predefinita a 0001/1/1, invece dell'anno/mese/giorno corrente. |
| AdjustToUniversal | 16 | Durante l'analisi di una stringa data/ora, se è presente uno specificatore di fuso orario ("GMT","Z","+xxxx", "-xxxx"), regoleremo il tempo analizzato in base a GMT. |
| AssumeLocal | 32 | Se non viene fornito alcun fuso orario, usa il fuso orario locale. |
| AssumeUniversal | 64 | Se non viene fornito alcun fuso orario, usa UTC. |
| RoundtripKind | 128 | Cerca di preservare se l'input è non specificato, locale o UTC. |

## Vedi anche

* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
