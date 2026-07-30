---
title: "Класс System::Linq::IOrderedEnumerable"
linktitle: "IOrderedEnumerable"
second_title: "Aspose.Font для C++"
description: "Класс System::Linq::IOrderedEnumerable. Представляет отсортированную последовательность в C++."
type: docs
weight: 300
url: /ru/cpp/system.linq/iorderedenumerable/
---
## IOrderedEnumerable class


Представляет отсортированную последовательность.

```cpp
template<typename T>class IOrderedEnumerable : public System::Collections::Generic::IEnumerable<T>
```


| Параметр | Описание |
| --- | --- |
| T | Тип элементов последовательности. |
## Методы

| Метод | Описание |
| --- | --- |
| [GetEnumerator](./getenumerator/)() override | Получает перечислитель. |
| [IOrderedEnumerable](./iorderedenumerable/)(const System::SharedPtr\<System::Collections::Generic::IEnumerable\<T\>\>\&, const Comparator\&) |  |
| [LINQ_ThenBy](./linq_thenby/)(const Func\<T, Key\>\&) | Выполняет последующую сортировку элементов последовательности по возрастанию в соответствии с ключом. |
| [LINQ_ThenBy](./linq_thenby/)(const Func\<Source, Key\>\&) |  |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [Comparator](./comparator/) | Информация RTTI. |

## См. также

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Linq](../)
* Library [Aspose.Font for C++](../../)
