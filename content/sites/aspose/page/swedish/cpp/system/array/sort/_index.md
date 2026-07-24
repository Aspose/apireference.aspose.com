---
title: "System::Array::Sort metod"
linktitle: "Sortera"
second_title: "Aspose.Page för C++"
description: "System::Array::Sort metod. Sorterar två arrayer, en som innehåller nycklar och den andra – motsvarande objekt, baserat på värdena i arrayen som innehåller nycklar, vars element jämförs med operator< i C++."
type: docs
weight: 5800
url: /sv/cpp/system/array/sort/
---
## Array::Sort(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&) method


Sorterar två arrayer, en som innehåller nycklar och den andra - motsvarande objekt, baserat på värdena i arrayen som innehåller nycklar, vars element jämförs med operator<.

```cpp
template<typename TKey,typename TValue> static void System::Array<T>::Sort(const ArrayPtr<TKey> &keys, const ArrayPtr<TValue> &items)
```


| Parameter | Beskrivning |
| --- | --- |
| TKey | Typen på elementen i **keys**‑arrayen |
| TValue | typen på elementen i **items**‑arrayen |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| keys | const ArrayPtr\<TKey\>\& | [Array](../) som innehåller nyckelvärden |
| items | const ArrayPtr\<TValue\>\& | [Array](../) som innehåller objekt som är mappade till nyckelvärdena i **keys**‑arrayen |

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&, int, int) method


Sorterar två arrayer, en som innehåller nycklar och den andra - motsvarande objekt, baserat på värdena i arrayen som innehåller nycklar, vars element jämförs med standardjämförare.

```cpp
template<typename TKey,typename TValue> static void System::Array<T>::Sort(const ArrayPtr<TKey> &keys, const ArrayPtr<TValue> &items, int index, int length)
```


| Parameter | Beskrivning |
| --- | --- |
| TKey | Typen på elementen i **keys**‑arrayen |
| TValue | typen på elementen i **items**‑arrayen |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| keys | const ArrayPtr\<TKey\>\& | [Array](../) som innehåller nyckelvärden |
| items | const ArrayPtr\<TValue\>\& | [Array](../) som innehåller objekt som är mappade till nyckelvärdena i **keys**‑arrayen |
| index | int | Indexet som anger början av intervallet att sortera |
| längd | int | Antalet element i intervallet att sortera |

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&) method


Sorterar element i den angivna arrayen med standardjämförare.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | Målararray |

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


Sorterar element i den angivna arrayen med angiven jämförare.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparator)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | Målararray |
| komparator | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | IComparer<T>-objekt som används för att jämföra element i arrayen |

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<Y\>\>\&) method


INTE IMPLEMENTERAT.

```cpp
template<typename Type,typename Y> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, const SharedPtr<System::Collections::Generic::IComparer<Y>> &comparator)
```


## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, int, int) method


Sorterar ett intervall av element i den angivna arrayen med standardjämförare.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, int startIndex, int count)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | Målararray |
| startIndex | int | Indexet som anger början av intervallet av element att sortera |
| count | int | Storleken på intervallet av element att sortera |

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
