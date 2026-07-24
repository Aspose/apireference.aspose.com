---
title: "System::Collections::Generic::_net_binnary_search metod"
linktitle: "_net_binnary_search"
second_title: "Aspose.Page för C++"
description: "System::Collections::Generic::_net_binnary_search metod. Implementerar binärsökning i en slumpåtkomstbehållare. Specialisering för smarta pekare. Använder System::Object::CompareTo metoden i C++."
type: docs
weight: 4900
url: /sv/cpp/system.collections.generic/_net_binnary_search/
---
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


Implementerar binärsökning i en slumpåtkomstbehållare. Specialisering för smarta pekare. Använder System::Object::CompareTo metoden.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<IsSmartPtr<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Parameter | Beskrivning |
| --- | --- |
| containerT | STL‑stilad behållarmalltyp med två mallargument: elementtyp och allokerartyp. |
| T | Elementtyp. |
| Allocator | Allokerartyp. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| behållare | const containterT\<T, Allocator\>\& | Behållare att söka i. |
| index | int | Startindex för sökområde. |
| count | int | Längd för sökområde. |
| value | T | Värde att leta efter. |

### ReturnValue

Om hittad, index för nästa element; annars komplementet till index där sökningen stoppades.

## Se även

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


Implementerar binärsökning i en slumpmässig åtkomstbehållare. Specialisering för värdetyper. Använder CompareTo-metoden.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Parameter | Beskrivning |
| --- | --- |
| containerT | STL‑stilad behållarmalltyp med två mallargument: elementtyp och allokerartyp. |
| T | Elementtyp. |
| Allocator | Allokerartyp. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| behållare | const containterT\<T, Allocator\>\& | Behållare att söka i. |
| index | int | Startindex för sökområde. |
| count | int | Längd för sökområde. |
| value | T | Värde att leta efter. |

### ReturnValue

Om hittad, index för nästa element; annars komplementet till index där sökningen stoppades.

## Se även

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


Implementerar binärsökning i en slumpmässig åtkomstbehållare. Specialisering för skalära typer. Jämför element med större- och mindreoperatorer.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<std::is_scalar<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Parameter | Beskrivning |
| --- | --- |
| containerT | STL‑stilad behållarmalltyp med två mallargument: elementtyp och allokerartyp. |
| T | Elementtyp. |
| Allocator | Allokerartyp. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| behållare | const containterT\<T, Allocator\>\& | Behållare att söka i. |
| index | int | Startindex för sökområde. |
| count | int | Längd för sökområde. |
| value | T | Värde att leta efter. |

### ReturnValue

Om hittad, index för nästa element; annars komplementet till index där sökningen stoppades.

## Se även

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


Implementerar binärsökning i en slumpmässig åtkomstbehållare.

```cpp
template<template< typename, typename > class,class T,class Allocator> int System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparer)
```


| Parameter | Beskrivning |
| --- | --- |
| containerT | STL‑stilad behållarmalltyp med två mallargument: elementtyp och allokerartyp. |
| T | Elementtyp. |
| Allocator | Allokerartyp. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| behållare | const containterT\<T, Allocator\>\& | Behållare att söka i. |
| index | int | Startindex för sökområde. |
| count | int | Längd för sökområde. |
| value | T | Värde att leta efter. |
| comparer | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | [Comparer](../comparer/) objekt. |

### ReturnValue

Om hittad, index för nästa element; annars komplementet till index där sökningen stoppades.

## Se även

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IComparer](../icomparer/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
