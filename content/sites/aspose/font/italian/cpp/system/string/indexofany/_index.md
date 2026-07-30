---
title: "Metodo System::String::IndexOfAny"
linktitle: "IndexOfAny"
second_title: "Aspose.Font per C++"
description: "Metodo System::String::IndexOfAny. Ricerca in avanti del carattere in C++."
type: docs
weight: 1600
url: /it/cpp/system/string/indexofany/
---
## String::IndexOfAny(char_t, int) const method


Ricerca in avanti del carattere.

```cpp
int System::String::IndexOfAny(char_t c, int startIndex=0) const
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| c | char_t | Carattere da cercare. |
| startIndex | int | Indice da cui iniziare la ricerca. |

### ReturnValue

Indice della prima posizione del carattere a partire da startIndex o -1 se non trovato.

## Vedi anche

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&) const method


Cerca uno qualsiasi dei caratteri passati nell'intera stringa. Confronta il primo carattere della stringa con tutti i caratteri in anyOf, poi confronta il secondo e così via. Restituisce l'indice del primo che corrisponde a uno dei caratteri target.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) di caratteri da cercare. L'ordine non importa. |

### ReturnValue

Indice del primo carattere corrispondente o -1 se non trovato.

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


Cerca uno qualsiasi dei caratteri passati nella sottostringa. Confronta il primo carattere della stringa con tutti i caratteri in anyOf, poi confronta il secondo e così via. Restituisce l'indice del primo che corrisponde a uno dei caratteri target.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) di caratteri da cercare. L'ordine non importa. |
| startindex | int32_t | Indice da cui iniziare la ricerca. |

### ReturnValue

Indice del primo carattere corrispondente o -1 se non trovato.

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


Cerca uno qualsiasi dei caratteri passati nella sottostringa. Confronta il primo carattere della stringa con tutti i caratteri in anyOf, poi confronta il secondo e così via. Restituisce l'indice del primo che corrisponde a uno dei caratteri target.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) di caratteri da cercare. L'ordine non importa. |
| startindex | int32_t | Indice da cui iniziare la ricerca. |
| count | int32_t | Numero di caratteri da esaminare. |

### ReturnValue

Indice del primo carattere corrispondente o -1 se non trovato.

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOfAny(const String\&, int) const method


Di conseguenza cerca tutti i caratteri di str in questo. Se il primo carattere è trovato, viene restituita la sua posizione, altrimenti cerca il secondo e così via.

```cpp
int System::String::IndexOfAny(const String &str, int startIndex=0) const
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| str | const String\& | [String](../) di caratteri da cercare. L'ordine dei caratteri è importante. |
| startIndex | int | Posizione da cui iniziare la ricerca. |

### ReturnValue

Indice del primo carattere trovato o -1 se non ne è stato trovato alcuno.

## Vedi anche

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
