---
title: "System::Collections::Generic::IEnumerable::LINQ_OrderBy method"
linktitle: "LINQ_OrderBy"
second_title: "Aspose.Font для C++"
description: "Как использовать метод LINQ_OrderBy класса System::Collections::Generic::IEnumerable в C++."
type: docs
weight: 2300
url: /ru/cpp/system.collections.generic/ienumerable/linq_orderby/
---
## IEnumerable::LINQ_OrderBy(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<Source>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderBy(const Func<Source, Key> &keySelector)
```

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_OrderBy(const Func\<T, Key\>\&) method


Сортирует элементы последовательности по возрастанию в соответствии с ключевыми значениями, выбранными с помощью keySelector.

```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<T>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderBy(const Func<T, Key> &keySelector)
```


| Параметр | Описание |
| --- | --- |
| keySelector | Функция для извлечения ключа из элемента. |

### ReturnValue

IOrderedEnumerable, элементы которого отсортированы по ключу

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
