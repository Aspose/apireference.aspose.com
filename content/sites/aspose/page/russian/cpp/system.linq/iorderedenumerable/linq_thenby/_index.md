---
title: "Метод System::Linq::IOrderedEnumerable::LINQ_ThenBy"
linktitle: "LINQ_ThenBy"
second_title: "Aspose.Page для C++"
description: "Как использовать метод LINQ_ThenBy класса System::Linq::IOrderedEnumerable в C++."
type: docs
weight: 300
url: /ru/cpp/system.linq/iorderedenumerable/linq_thenby/
---
## IOrderedEnumerable::LINQ_ThenBy(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<IOrderedEnumerable<Source>> System::Linq::IOrderedEnumerable<T>::LINQ_ThenBy(const Func<Source, Key> &keySelector)
```

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IOrderedEnumerable](../)
* Namespace [System::Linq](../../)
* Library [Aspose.Page for C++](../../../)
## IOrderedEnumerable::LINQ_ThenBy(const Func\<T, Key\>\&) method


Выполняет последующую сортировку элементов последовательности по возрастанию согласно ключу.

```cpp
template<typename Key> SharedPtr<IOrderedEnumerable<T>> System::Linq::IOrderedEnumerable<T>::LINQ_ThenBy(const Func<T, Key> &keySelector)
```


| Параметр | Описание |
| --- | --- |
| Ключ | Тип ключа, возвращаемого keySelector. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| keySelector | const Func\<T, Key\>\& | Функция для извлечения ключа из каждого элемента. |

### ReturnValue

[System::Linq::IOrderedEnumerable](../) whose elements are sorted according to a key.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IOrderedEnumerable](../)
* Namespace [System::Linq](../../)
* Library [Aspose.Page for C++](../../../)
