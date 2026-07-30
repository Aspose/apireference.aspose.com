---
title: "System::MakeArray metodo"
linktitle: "MakeArray"
second_title: "Aspose.Font per C++"
description: "System::MakeArray metodo. Una funzione factory che costruisce un nuovo oggetto Array passando gli argomenti specificati al suo costruttore in C++."
type: docs
weight: 24100
url: /it/cpp/system/makearray/
---
## System::MakeArray(Args\&&...) method


Una funzione factory che costruisce un nuovo oggetto [Array](../array/) passando gli argomenti specificati al suo costruttore.

```cpp
template<class T,class...> ArrayPtr<T> System::MakeArray(Args &&... args)
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo degli elementi dell'oggetto [Array](../array/) che la funzione costruisce |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| args | Args\&&... | Gli argomenti che vengono passati al costruttore dell'oggetto [Array](../array/) in fase di costruzione |

### ReturnValue

Un puntatore smart che punta all'oggetto [Array](../array/) costruito

## Vedi anche

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::MakeArray(Integral, Args\&&...) method


Una funzione factory che costruisce un nuovo oggetto [Array](../array/) passando gli argomenti specificati al suo costruttore.

```cpp
template<class T,class Integral,class...> std::enable_if<std::is_integral<Integral>::value, ArrayPtr<T>>::type System::MakeArray(Integral size, Args &&... args)
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo degli elementi dell'oggetto [Array](../array/) che la funzione costruisce |
| Integral | Tipo della dimensione dell'array. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| size | Integral | Dimensione dell'array in fase di creazione. |
| args | Args\&&... | Gli argomenti che vengono passati al costruttore dell'oggetto [Array](../array/) in fase di costruzione |

### ReturnValue

Un puntatore smart che punta all'oggetto [Array](../array/) costruito

## Vedi anche

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::MakeArray(std::initializer_list\<T\>) method


Una funzione factory che costruisce un nuovo oggetto [Array](../array/), lo riempie con gli elementi della lista di inizializzazione specificata e restituisce un puntatore smart che punta all'oggetto [Array](../array/).

```cpp
template<typename T> ArrayPtr<T> System::MakeArray(std::initializer_list<T> init)
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo degli elementi dell'oggetto [Array](../array/) che la funzione costruisce |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| init | std::initializer_list\<T\> | La lista di inizializzazione contenente gli elementi con cui riempire l'array |

### ReturnValue

Un puntatore smart che punta all'oggetto [Array](../array/) costruito

## Vedi anche

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
