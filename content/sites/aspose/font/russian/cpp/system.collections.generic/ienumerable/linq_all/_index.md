---
title: "System::Collections::Generic::IEnumerable::LINQ_All method"
linktitle: "LINQ_All"
second_title: "Aspose.Font для C++"
description: "System::Collections::Generic::IEnumerable::LINQ_All method. Определяет, удовлетворяют ли все элементы последовательности условию в C++."
type: docs
weight: 700
url: /ru/cpp/system.collections.generic/ienumerable/linq_all/
---
## IEnumerable::LINQ_All method


Определяет, удовлетворяют ли все элементы последовательности условию.

```cpp
bool System::Collections::Generic::IEnumerable<T>::LINQ_All(std::function<bool(T)> predicate)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| предикат | std::function\\<bool(T)> | Функция для проверки каждого элемента на соответствие условию. |

### ReturnValue

true, если каждый элемент исходной последовательности проходит проверку в указанном предикате, или если последовательность пуста; иначе — false.

## См. также

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
