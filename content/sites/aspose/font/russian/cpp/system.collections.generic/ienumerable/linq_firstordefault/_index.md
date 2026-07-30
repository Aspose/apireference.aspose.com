---
title: "Метод System::Collections::Generic::IEnumerable::LINQ_FirstOrDefault"
linktitle: "LINQ_FirstOrDefault"
second_title: "Aspose.Font для C++"
description: "Метод System::Collections::Generic::IEnumerable::LINQ_FirstOrDefault. Возвращает первый элемент последовательности или значение по умолчанию, если последовательность пуста в C++."
type: docs
weight: 1600
url: /ru/cpp/system.collections.generic/ienumerable/linq_firstordefault/
---
## IEnumerable::LINQ_FirstOrDefault() method


Возвращает первый элемент последовательности или значение по умолчанию, если последовательность пуста.

```cpp
T System::Collections::Generic::IEnumerable<T>::LINQ_FirstOrDefault()
```


### ReturnValue

Первый элемент последовательности или значение, созданное по умолчанию, если последовательность пуста.

## См. также

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_FirstOrDefault(std::function\<bool(T)>) method


Возвращает первый элемент последовательности, который удовлетворяет условию, или значение по умолчанию, если такой элемент не найден.

```cpp
T System::Collections::Generic::IEnumerable<T>::LINQ_FirstOrDefault(std::function<bool(T)> predicate)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| предикат | std::function\\<bool(T)> | Функция для проверки каждого элемента на соответствие условию. |

### ReturnValue

default(T), если источник пуст или ни один элемент не проходит проверку, указанную предикатом; в противном случае — первый элемент в источнике, проходящий проверку, указанную предикатом.

## См. также

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
