---
title: "System::Globalization::CompareOptions enum"
linktitle: "CompareOptions"
second_title: "Aspose.Font per C++"
description: "System::Globalization::CompareOptions enum. Opzioni di confronto delle stringhe in C++."
type: docs
weight: 3300
url: /it/cpp/system.globalization/compareoptions/
---
## CompareOptions enum


[String](../../system/string/) comparison options.

```cpp
enum class CompareOptions : int32_t
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| None | 0 | Nessuna opzione speciale. |
| IgnoreCase | 1 | Ignora maiuscole/minuscole. |
| IgnoreNonSpace | 2 | Ignora i caratteri di combinazione non spazianti, ad es. i diacritici. |
| IgnoreSymbols | 4 | Include spazi bianchi, segni di punteggiatura e così via. |
| IgnoreKanaType | 8 | Ignora il tipo kana (giapponese). |
| IgnoreWidth | 16 | Ignora la larghezza dei caratteri durante il confronto delle stringhe. |
| OrdinalIgnoreCase | 268435456 | Confronto ordinal con differenza di maiuscole/minuscole ignorata. |
| StringSort | 536870912 | Utilizza l'algoritmo di ordinamento delle stringhe per confrontare i caratteri. |
| Ordinal | 1073741824 | Confronta direttamente i codici UTF per il primo confronto. |

## Vedi anche

* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
