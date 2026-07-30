---
title: "Metodo System::Array::Sort"
linktitle: "Ordina"
second_title: "Aspose.Font per C++"
description: "Metodo System::Array::Sort. Ordina due array, uno contenente le chiavi e l'altro gli elementi corrispondenti, in base ai valori dell'array contenente le chiavi, i cui elementi sono confrontati usando l'operatore< in C++."
type: docs
weight: 5800
url: /it/cpp/system/array/sort/
---
## Array::Sort(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&) method


Ordina due array, uno contenente le chiavi e l'altro gli elementi corrispondenti, in base ai valori dell'array contenente le chiavi, i cui elementi sono confrontati usando operator<.

```cpp
template<typename TKey,typename TValue> static void System::Array<T>::Sort(const ArrayPtr<TKey> &keys, const ArrayPtr<TValue> &items)
```


| Parametro | Descrizione |
| --- | --- |
| TKey | Il tipo degli elementi nell'array **keys** |
| TValue | il tipo degli elementi nell'array **items** |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| keys | const ArrayPtr\<TKey\>\& | [Array](../) che contiene i valori delle chiavi |
| items | const ArrayPtr\<TValue\>\& | [Array](../) che contiene gli elementi mappati ai valori delle chiavi nell'array **keys** |

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Sort(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&, int, int) method


Ordina due array, uno contenente le chiavi e l'altro gli elementi corrispondenti, in base ai valori dell'array contenente le chiavi, i cui elementi sono confrontati usando il comparatore predefinito.

```cpp
template<typename TKey,typename TValue> static void System::Array<T>::Sort(const ArrayPtr<TKey> &keys, const ArrayPtr<TValue> &items, int index, int length)
```


| Parametro | Descrizione |
| --- | --- |
| TKey | Il tipo degli elementi nell'array **keys** |
| TValue | il tipo degli elementi nell'array **items** |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| keys | const ArrayPtr\<TKey\>\& | [Array](../) che contiene i valori delle chiavi |
| items | const ArrayPtr\<TValue\>\& | [Array](../) che contiene gli elementi mappati ai valori delle chiavi nell'array **keys** |
| indice | int | L'indice che designa l'inizio dell'intervallo da ordinare |
| lunghezza | int | Il numero di elementi nell'intervallo da ordinare |

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&) method


Ordina gli elementi nell'array specificato usando il comparatore predefinito.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | Array di destinazione |

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


Ordina gli elementi nell'array specificato usando il comparatore specificato.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparator)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | Array di destinazione |
| comparatore | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | Oggetto IComparer<T> utilizzato per confrontare gli elementi dell'array |

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<Y\>\>\&) method


NON IMPLEMENTATO.

```cpp
template<typename Type,typename Y> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, const SharedPtr<System::Collections::Generic::IComparer<Y>> &comparator)
```


## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, int, int) method


Ordina un intervallo di elementi nell'array specificato usando il comparatore predefinito.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, int startIndex, int count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | Array di destinazione |
| startIndex | int | L'indice che indica l'inizio dell'intervallo di elementi da ordinare |
| count | int | La dimensione dell'intervallo di elementi da ordinare |

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
