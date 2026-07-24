---
title: "System::Array::Sort methode"
linktitle: "Sorteren"
second_title: "Aspose.Page voor C++"
description: "System::Array::Sort methode. Sorteert twee arrays, één met sleutels en de andere met overeenkomstige items, op basis van de waarden van de array met sleutels, waarvan de elementen worden vergeleken met operator< in C++."
type: docs
weight: 5800
url: /nl/cpp/system/array/sort/
---
## Array::Sort(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&) method


Sorteert twee arrays, één met sleutels en de andere - overeenkomstige items, gebaseerd op de waarden van de array met sleutels, waarvan de elementen worden vergeleken met behulp van operator<.

```cpp
template<typename TKey,typename TValue> static void System::Array<T>::Sort(const ArrayPtr<TKey> &keys, const ArrayPtr<TValue> &items)
```


| Parameter | Beschrijving |
| --- | --- |
| TKey | Het type van de elementen in de **keys** array |
| TValue | het type van de elementen in de **items** array |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| keys | const ArrayPtr\<TKey\>\& | [Array](../) die sleutelwaarden bevat |
| items | const ArrayPtr\<TValue\>\& | [Array](../) die items bevat die zijn gekoppeld aan de sleutelwaarden in de **keys** array |

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&, int, int) method


Sorteert twee arrays, één met sleutels en de andere - overeenkomstige items, gebaseerd op de waarden van de array met sleutels, waarvan de elementen worden vergeleken met behulp van de standaardvergelijker.

```cpp
template<typename TKey,typename TValue> static void System::Array<T>::Sort(const ArrayPtr<TKey> &keys, const ArrayPtr<TValue> &items, int index, int length)
```


| Parameter | Beschrijving |
| --- | --- |
| TKey | Het type van de elementen in de **keys** array |
| TValue | het type van de elementen in de **items** array |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| keys | const ArrayPtr\<TKey\>\& | [Array](../) die sleutelwaarden bevat |
| items | const ArrayPtr\<TValue\>\& | [Array](../) die items bevat die zijn gekoppeld aan de sleutelwaarden in de **keys** array |
| index | int | De index die het begin van het te sorteren bereik aangeeft |
| lengte | int | Het aantal elementen in het te sorteren bereik |

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&) method


Sorteert elementen in de opgegeven array met behulp van de standaardvergelijker.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | Doelarray |

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


Sorteert elementen in de opgegeven array met behulp van de opgegeven vergelijker.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparator)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | Doelarray |
| vergelijker | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | IComparer<T> object gebruikt om elementen van de array te vergelijken |

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<Y\>\>\&) method


NOG NIET GEÏMPLENTEERD.

```cpp
template<typename Type,typename Y> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, const SharedPtr<System::Collections::Generic::IComparer<Y>> &comparator)
```


## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, int, int) method


Sorteert een bereik van elementen in de opgegeven array met behulp van de standaardvergelijker.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, int startIndex, int count)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | Doelarray |
| startIndex | int | De index die het begin van het bereik van elementen aangeeft die moeten worden gesorteerd |
| count | int | De grootte van het bereik van elementen die moeten worden gesorteerd |

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
