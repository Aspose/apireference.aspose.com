---
title: "Metodo System::Threading::Interlocked::Exchange"
linktitle: "Exchange"
second_title: "Aspose.Page per C++"
description: "Metodo System::Threading::Interlocked::Exchange. Scambia il valore della variabile: memorizza il nuovo valore e restituisce il valore che la variabile aveva immediatamente prima della memorizzazione in C++."
type: docs
weight: 400
url: /it/cpp/system.threading/interlocked/exchange/
---
## Interlocked::Exchange(T\&, T) method


Scambia il valore su una variabile: memorizza il nuovo valore e restituisce il valore che la variabile aveva immediatamente prima della memorizzazione.

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di variabile. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| location1 | T\& | Riferimento variabile da modificare. |
| value | T | Valore da memorizzare. |

### ReturnValue

Valore della variabile subito prima che fosse modificata.

## Vedi anche

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::Exchange(T\&, T) method


Scambia il valore su una variabile: memorizza il nuovo valore e restituisce il valore che la variabile aveva immediatamente prima della memorizzazione. Non implementato.

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di variabile. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| location1 | T\& | Riferimento variabile da modificare. |
| value | T | Valore da memorizzare. |

### ReturnValue

Valore della variabile subito prima che fosse modificata.

## Vedi anche

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
