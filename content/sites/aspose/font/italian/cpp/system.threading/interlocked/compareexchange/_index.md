---
title: "Metodo System::Threading::Interlocked::CompareExchange"
linktitle: "CompareExchange"
second_title: "Aspose.Font per C++"
description: "Metodo System::Threading::Interlocked::CompareExchange. Confronta e scambia il valore sulla variabile: verifica se la variabile è uguale a un valore specifico e memorizza il nuovo valore solo se il valore memorizzato corrisponde a quello atteso in C++."
type: docs
weight: 200
url: /it/cpp/system.threading/interlocked/compareexchange/
---
## Interlocked::CompareExchange(int32_t\&, int32_t, int32_t, bool\&) method


Compare-exchanges valore su variabile: verifica se la variabile è uguale a un valore specifico e memorizza il nuovo valore solo se il valore memorizzato corrisponde a quello previsto.

```cpp
static int32_t System::Threading::Interlocked::CompareExchange(int32_t &location1, int32_t value, int32_t comparand, bool &succeeded)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| location1 | int32_t\& | Riferimento variabile da modificare. |
| valore | int32_t | Valore da memorizzare. |
| comparand | int32_t | Valore con cui confrontare il valore della variabile prima dello scambio. |
| riuscito | bool\& | Riferimento alla variabile impostata a true se lo scambio è avvenuto e a false altrimenti. |

### ReturnValue

Valore della variabile all'inizio dell'operazione, indipendentemente dal fatto che sia stato modificato o meno.

## Vedi anche

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


Compare-exchanges valore su variabile: verifica se la variabile è uguale a un valore specifico e memorizza il nuovo valore solo se il valore memorizzato corrisponde a quello previsto.

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo variabile. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| location1 | T\& | Riferimento variabile da modificare. |
| valore | T | Valore da memorizzare. |
| comparand | T | Valore con cui confrontare il valore della variabile prima dello scambio. |

### ReturnValue

Valore della variabile all'inizio dell'operazione, indipendentemente dal fatto che sia stato modificato o meno.

## Vedi anche

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


Compare-exchanges valore su variabile: verifica se la variabile è uguale a un valore specifico e memorizza il nuovo valore solo se il valore memorizzato corrisponde a quello previsto. Non implementato.

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo variabile. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| location1 | T\& | Riferimento variabile da modificare. |
| valore | T | Valore da memorizzare. |
| comparand | T | Valore con cui confrontare il valore della variabile prima dello scambio. |

### ReturnValue

Valore della variabile all'inizio dell'operazione, indipendentemente dal fatto che sia stato modificato o meno.

## Vedi anche

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
