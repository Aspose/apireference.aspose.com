---
title: "System::Collections::Generic::_net_binnary_search metodo"
linktitle: "_net_binnary_search"
second_title: "Aspose.Font per C++"
description: "System::Collections::Generic::_net_binnary_search metodo. Implementa la ricerca binaria in un contenitore ad accesso casuale. Specializzazione per puntatori intelligenti. Utilizza il metodo System::Object::CompareTo in C++."
type: docs
weight: 4900
url: /it/cpp/system.collections.generic/_net_binnary_search/
---
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


Implementa la ricerca binaria in un contenitore ad accesso casuale. Specializzazione per puntatori intelligenti. Utilizza il metodo System::Object::CompareTo.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<IsSmartPtr<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Parametro | Descrizione |
| --- | --- |
| containerT | Tipo di modello di contenitore in stile STL con due argomenti di modello: tipo elemento e tipo allocatore. |
| T | Tipo di elemento. |
| Allocator | Tipo allocatore. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| contenitore | const containterT\<T, Allocator\>\& | Contenitore in cui cercare. |
| indice | int | Indice di inizio dell'intervallo di ricerca. |
| count | int | Lunghezza dell'intervallo di ricerca. |
| valore | T | Valore da cercare. |

### ReturnValue

Se trovato, indice dell'elemento successivo; altrimenti, complemento dell'indice in cui la ricerca si è interrotta.

## Vedi anche

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


Implementa la ricerca binaria in un contenitore ad accesso casuale. Specializzazione per tipi valore. Utilizza il metodo CompareTo.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Parametro | Descrizione |
| --- | --- |
| containerT | Tipo di modello di contenitore in stile STL con due argomenti di modello: tipo elemento e tipo allocatore. |
| T | Tipo di elemento. |
| Allocator | Tipo allocatore. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| contenitore | const containterT\<T, Allocator\>\& | Contenitore in cui cercare. |
| indice | int | Indice di inizio dell'intervallo di ricerca. |
| count | int | Lunghezza dell'intervallo di ricerca. |
| valore | T | Valore da cercare. |

### ReturnValue

Se trovato, indice dell'elemento successivo; altrimenti, complemento dell'indice in cui la ricerca si è interrotta.

## Vedi anche

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


Implementa la ricerca binaria in un contenitore ad accesso casuale. Specializzazione per tipi scalari. Confronta gli elementi usando gli operatori maggiore e minore.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<std::is_scalar<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Parametro | Descrizione |
| --- | --- |
| containerT | Tipo di modello di contenitore in stile STL con due argomenti di modello: tipo elemento e tipo allocatore. |
| T | Tipo di elemento. |
| Allocator | Tipo allocatore. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| contenitore | const containterT\<T, Allocator\>\& | Contenitore in cui cercare. |
| indice | int | Indice di inizio dell'intervallo di ricerca. |
| count | int | Lunghezza dell'intervallo di ricerca. |
| valore | T | Valore da cercare. |

### ReturnValue

Se trovato, indice dell'elemento successivo; altrimenti, complemento dell'indice in cui la ricerca si è interrotta.

## Vedi anche

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


Implementa la ricerca binaria in un contenitore ad accesso casuale.

```cpp
template<template< typename, typename > class,class T,class Allocator> int System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparer)
```


| Parametro | Descrizione |
| --- | --- |
| containerT | Tipo di modello di contenitore in stile STL con due argomenti di modello: tipo elemento e tipo allocatore. |
| T | Tipo di elemento. |
| Allocator | Tipo allocatore. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| contenitore | const containterT\<T, Allocator\>\& | Contenitore in cui cercare. |
| indice | int | Indice di inizio dell'intervallo di ricerca. |
| count | int | Lunghezza dell'intervallo di ricerca. |
| valore | T | Valore da cercare. |
| comparer | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | oggetto [Comparer](../comparer/). |

### ReturnValue

Se trovato, indice dell'elemento successivo; altrimenti, complemento dell'indice in cui la ricerca si è interrotta.

## Vedi anche

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IComparer](../icomparer/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
