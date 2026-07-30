---
title: "System::Array::Sort-Methode"
linktitle: "Sortieren"
second_title: "Aspose.Font für C++"
description: "System::Array::Sort-Methode. Sortiert zwei Arrays, eines mit Schlüsseln und das andere mit den zugehörigen Elementen, basierend auf den Werten des Schlüssel-Arrays, dessen Elemente in C++ mit operator< verglichen werden."
type: docs
weight: 5800
url: /de/cpp/system/array/sort/
---
## Array::Sort(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&) method


Sortiert zwei Arrays, eines mit Schlüsseln und das andere - zugehörige Elemente, basierend auf den Werten des Schlüssel‑Arrays, dessen Elemente mit operator< verglichen werden.

```cpp
template<typename TKey,typename TValue> static void System::Array<T>::Sort(const ArrayPtr<TKey> &keys, const ArrayPtr<TValue> &items)
```


| Parameter | Beschreibung |
| --- | --- |
| TKey | Der Typ der Elemente im **keys**-Array |
| TValue | der Typ der Elemente im **items**-Array |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| keys | const ArrayPtr\<TKey\>\& | [Array](../), das Schlüsselwerte enthält |
| items | const ArrayPtr\<TValue\>\& | [Array](../), das Elemente enthält, die den Schlüsselwerten im **keys**-Array zugeordnet sind |

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Sort(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&, int, int) method


Sortiert zwei Arrays, eines mit Schlüsseln und das andere - zugehörige Elemente, basierend auf den Werten des Schlüssel‑Arrays, dessen Elemente mit dem Standardvergleich verglichen werden.

```cpp
template<typename TKey,typename TValue> static void System::Array<T>::Sort(const ArrayPtr<TKey> &keys, const ArrayPtr<TValue> &items, int index, int length)
```


| Parameter | Beschreibung |
| --- | --- |
| TKey | Der Typ der Elemente im **keys**-Array |
| TValue | der Typ der Elemente im **items**-Array |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| keys | const ArrayPtr\<TKey\>\& | [Array](../), das Schlüsselwerte enthält |
| items | const ArrayPtr\<TValue\>\& | [Array](../), das Elemente enthält, die den Schlüsselwerten im **keys**-Array zugeordnet sind |
| Index | int | Der Index, der den Beginn des zu sortierenden Bereichs bezeichnet |
| Länge | int | Die Anzahl der Elemente im zu sortierenden Bereich |

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&) method


Sortiert die Elemente im angegebenen Array mit dem Standardvergleich.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | Ziel-Array |

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


Sortiert die Elemente im angegebenen Array mit dem angegebenen Vergleich.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparator)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | Ziel-Array |
| Vergleichsfunktion | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | IComparer<T>-Objekt, das zum Vergleichen der Elemente des Arrays verwendet wird |

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<Y\>\>\&) method


NICHT IMPLEMENTIERT.

```cpp
template<typename Type,typename Y> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, const SharedPtr<System::Collections::Generic::IComparer<Y>> &comparator)
```


## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, int, int) method


Sortiert einen Bereich von Elementen im angegebenen Array mit dem Standardvergleich.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, int startIndex, int count)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | Ziel-Array |
| startIndex | int | Der Index, der den Beginn des zu sortierenden Elementbereichs bezeichnet |
| count | int | Die Größe des zu sortierenden Elementbereichs |

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
