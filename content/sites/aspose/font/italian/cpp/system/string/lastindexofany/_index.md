---
title: "Metodo System::String::LastIndexOfAny"
linktitle: "LastIndexOfAny"
second_title: "Aspose.Font per C++"
description: "Metodo System::String::LastIndexOfAny. Cerca qualsiasi dei caratteri forniti in tutta la stringa in senso inverso. Confronta l'ultimo carattere della stringa con tutti i caratteri in anyOf, poi confronta quello precedente e così via. Restituisce l'indice della prima corrispondenza trovata in C++."
type: docs
weight: 2500
url: /it/cpp/system/string/lastindexofany/
---
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&) const method


Cerca uno qualsiasi dei caratteri passati nell'intera stringa all'indietro. Confronta l'ultimo carattere della stringa con tutti i caratteri in anyOf, poi confronta il precedente e così via. Restituisce l'indice della prima corrispondenza trovata.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) di caratteri da cercare. L'ordine non importa. |

### ReturnValue

Indice dell'ultimo carattere corrispondente o -1 se non trovato.

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


Cerca uno qualsiasi dei caratteri passati nella sottostringa all'indietro. Confronta l'ultimo carattere della stringa con tutti i caratteri in anyOf, poi confronta il precedente e così via. Restituisce l'indice della prima corrispondenza trovata.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) di caratteri da cercare. L'ordine non importa. |
| startindex | int32_t | Indice da cui iniziare la ricerca. |

### ReturnValue

Indice dell'ultimo carattere corrispondente o -1 se non trovato.

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


Cerca uno qualsiasi dei caratteri passati nella sottostringa all'indietro. Confronta l'ultimo carattere della stringa con tutti i caratteri in anyOf, poi confronta il precedente e così via. Restituisce l'indice della prima corrispondenza trovata.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) di caratteri da cercare. L'ordine non importa. |
| startindex | int32_t | Indice da cui iniziare la ricerca. |
| count | int32_t | Numero di caratteri da esaminare. |

### ReturnValue

Indice dell'ultimo carattere corrispondente o -1 se non trovato.

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
