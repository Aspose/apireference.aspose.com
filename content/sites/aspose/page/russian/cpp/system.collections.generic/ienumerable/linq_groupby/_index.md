---
title: "System::Collections::Generic::IEnumerable::LINQ_GroupBy метод"
linktitle: "LINQ_GroupBy"
second_title: "Aspose.Page для C++"
description: "Как использовать метод LINQ_GroupBy класса System::Collections::Generic::IEnumerable в C++."
type: docs
weight: 1700
url: /ru/cpp/system.collections.generic/ienumerable/linq_groupby/
---
## IEnumerable::LINQ_GroupBy(System::Func\<Source, Key\>) method




```cpp
template<typename Key> SharedPtr<IEnumerable<SharedPtr<System::Linq::IGrouping<Key, Source>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<Source, Key> keyPredicate)
```

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_GroupBy(System::Func\<T, Key\>) method


Группирует элементы последовательности.

```cpp
template<typename Key> System::SharedPtr<IEnumerable<System::SharedPtr<System::Linq::IGrouping<Key, T>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<T, Key> keyPredicate)
```


| Параметр | Описание |
| --- | --- |
| Ключ | Тип ключа, возвращаемого функцией keyPredicate |

| Параметр | Тип | Описание |
| --- | --- | --- |
| keyPredicate | System::Func\<T, Key\> | Функция для извлечения ключа из каждого элемента. |

### ReturnValue

Объект [IEnumerable](../), содержащий последовательность объектов и ключ.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
