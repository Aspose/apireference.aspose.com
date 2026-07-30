---
title: "metodo System::Uri::HexUnescape"
linktitle: "HexUnescape"
second_title: "Aspose.Font per C++"
description: "metodo System::Uri::HexUnescape. Converte la rappresentazione esadecimale specificata di un carattere in un carattere in C++."
type: docs
weight: 4000
url: /it/cpp/system/uri/hexunescape/
---
## Uri::HexUnescape method


Converte la rappresentazione esadecimale specificata di un carattere in un carattere.

```cpp
static char16_t System::Uri::HexUnescape(const String &pattern, int32_t &index)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| pattern | const String\& | Una stringa contenente la rappresentazione esadecimale di un carattere |
| indice | int32_t\& | La posizione in **pattern** dove inizia la rappresentazione esadecimale di un carattere |

### ReturnValue

Il carattere rappresentato dalla codifica esadecimale alla posizione **index**. Se il carattere in **index** non è codificato esadecimale, viene restituito il carattere in **index**. Il valore di **index** viene incrementato per puntare al carattere successivo a quello restituito.

## Vedi anche

* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
