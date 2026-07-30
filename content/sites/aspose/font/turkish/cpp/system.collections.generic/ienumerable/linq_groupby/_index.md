---
title: "System::Collections::Generic::IEnumerable::LINQ_GroupBy yöntemi"
linktitle: "LINQ_GroupBy"
second_title: "Aspose.Font için C++"
description: "C++'ta System::Collections::Generic::IEnumerable sınıfının LINQ_GroupBy yöntemini nasıl kullanılır."
type: docs
weight: 1700
url: /tr/cpp/system.collections.generic/ienumerable/linq_groupby/
---
## IEnumerable::LINQ_GroupBy(System::Func\<Source, Key\>) method




```cpp
template<typename Key> SharedPtr<IEnumerable<SharedPtr<System::Linq::IGrouping<Key, Source>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<Source, Key> keyPredicate)
```

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_GroupBy(System::Func\<Source, Key\>, System::Func\<Source, Element\>) method




```cpp
template<typename Key,typename Element> SharedPtr<IEnumerable<SharedPtr<System::Linq::IGrouping<Key, Element>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<Source, Key> keyPredicate, System::Func<Source, Element> elementSelector)
```

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_GroupBy(System::Func\<T, Key\>) method


Bir dizinin öğelerini gruplar.

```cpp
template<typename Key> System::SharedPtr<IEnumerable<System::SharedPtr<System::Linq::IGrouping<Key, T>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<T, Key> keyPredicate)
```


| Parametre | Açıklama |
| --- | --- |
| Anahtar | keyPredicate tarafından döndürülen anahtarın türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| keyPredicate | System::Func\<T, Key\> | Her öğe için anahtarı çıkartan bir işlev. |

### ReturnValue

Bir [IEnumerable](../) nesnesi, nesneler dizisi ve bir anahtar içerir

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_GroupBy(System::Func\<T, Key\>, System::Func\<T, Element\>) method


Bir dizinin öğelerini gruplar.

```cpp
template<typename Key,typename Element> System::SharedPtr<IEnumerable<System::SharedPtr<System::Linq::IGrouping<Key, Element>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<T, Key> keyPredicate, System::Func<T, Element> elementSelector)
```


| Parametre | Açıklama |
| --- | --- |
| Anahtar | keyPredicate tarafından döndürülen anahtarın türü |
| Element | elementSelector tarafından döndürülen öğenin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| keyPredicate | System::Func\<T, Key\> | Her öğe için anahtarı çıkartan bir işlev. |
| elementSelector | System::Func\<T, Element\> | Her öğe için değer anahtarını çıkartan bir işlev. |

### ReturnValue

Bir [IEnumerable](../) nesnesi, nesneler dizisi ve bir anahtar içerir

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
