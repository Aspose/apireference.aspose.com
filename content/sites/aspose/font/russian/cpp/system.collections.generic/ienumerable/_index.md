---
title: "System::Collections::Generic::IEnumerable класс"
linktitle: "IEnumerable"
second_title: "Aspose.Font для C++"
description: "System::Collections::Generic::IEnumerable класс. Интерфейс объекта, предоставляющего перечислитель над содержащимися элементами в C++."
type: docs
weight: 2200
url: /ru/cpp/system.collections.generic/ienumerable/
---
## IEnumerable class


Интерфейс объекта, предоставляющего перечислитель по содержащимся элементам.

```cpp
template<typename T>class IEnumerable : public virtual System::Object
```


| Параметр | Описание |
| --- | --- |
| T | Тип элемента. |
## Методы

| Метод | Описание |
| --- | --- |
| [begin](./begin/)() | Получает итератор, указывающий на первый элемент (если он есть) коллекции. Этот итератор нельзя использовать для изменения ссылочного объекта, потому что [GetEnumerator()](./getenumerator/) возвращает копию объекта T. |
| [begin](./begin/)() const | Получает итератор, указывающий на первый элемент (если он есть) константно-квалифицированного экземпляра коллекции. |
| [cbegin](./cbegin/)() const | Получает итератор, указывающий на первый константно-квалифицированный элемент (если он есть) коллекции. |
| [cend](./cend/)() const | Получает итератор, указывающий сразу после последнего константно-квалифицированного элемента (если он есть) коллекции. |
| [end](./end/)() | Получает итератор, указывающий сразу после последнего элемента (если он есть) коллекции. Этот итератор нельзя использовать для изменения ссылочного объекта, потому что [GetEnumerator()](./getenumerator/) возвращает копию объекта T. |
| [end](./end/)() const | Получает итератор, указывающий сразу после последнего элемента (если он есть) константно-квалифицированного экземпляра коллекции. |
| virtual [GetEnumerator](./getenumerator/)() | Получает перечислитель. |
| [LINQ_Aggregate](./linq_aggregate/)(const Func\<T, T, T\>\&) | Применяет функцию-аккумулятор к последовательности. |
| [LINQ_All](./linq_all/)(std::function\<bool(T)>) | Определяет, удовлетворяют ли все элементы последовательности условию. |
| [LINQ_Any](./linq_any/)() | Определяет, содержит ли последовательность какие-либо элементы. |
| [LINQ_Any](./linq_any/)(std::function\<bool(T)>) | Определяет, существует ли любой элемент последовательности или удовлетворяет условию. |
| [LINQ_Cast](./linq_cast/)() | Преобразует элементы к указанному типу. |
| [LINQ_Cast](./linq_cast/)() |  |
| [LINQ_Concat](./linq_concat/)(SharedPtr\<IEnumerable\<T\>\>) | Объединяет две последовательности. |
| [LINQ_Contains](./linq_contains/)(T) | Определяет, содержит ли последовательность указанное значение. |
| [LINQ_Count](./linq_count/)() | Возвращает количество элементов в последовательности (вычисленное прямым подсчётом). |
| [LINQ_Count](./linq_count/)(const Func\<T, bool\>\&) | Возвращает количество элементов в последовательности, которые удовлетворяют указанному условию. |
| [LINQ_ElementAt](./linq_elementat/)(int) | Возвращает элемент по указанному индексу в последовательности. |
| [LINQ_ElementAtOrDefault](./linq_elementatordefault/)(int) | Возвращает элемент по указанному индексу в последовательности. |
| [LINQ_First](./linq_first/)() | Возвращает первый элемент последовательности. |
| [LINQ_First](./linq_first/)(const Func\<T, bool\>\&) | Возвращает первый элемент последовательности, который удовлетворяет указанному условию. |
| [LINQ_FirstOrDefault](./linq_firstordefault/)() | Возвращает первый элемент последовательности или значение по умолчанию, если последовательность пуста. |
| [LINQ_FirstOrDefault](./linq_firstordefault/)(std::function\<bool(T)>) | Возвращает первый элемент последовательности, который удовлетворяет условию, или значение по умолчанию, если такой элемент не найден. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<T, Key\>) | Группирует элементы последовательности. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<T, Key\>, System::Func\<T, Element\>) | Группирует элементы последовательности. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<Source, Key\>) |  |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<Source, Key\>, System::Func\<Source, Element\>) |  |
| [LINQ_Last](./linq_last/)() | Возвращает последний элемент последовательности. |
| [LINQ_LastOrDefault](./linq_lastordefault/)() | Возвращает последний элемент последовательности или значение по умолчанию, если последовательность пуста. |
| [LINQ_Max](./linq_max/)(const Func\<T, ResultType\>\&) | Вызывает функцию преобразования для каждого элемента обобщённой последовательности и возвращает максимальное полученное значение. |
| [LINQ_Max](./linq_max/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_Min](./linq_min/)(const Func\<T, ResultType\>\&) | Вызывает функцию преобразования для каждого элемента обобщённой последовательности и возвращает минимальное полученное значение. |
| [LINQ_Min](./linq_min/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_OfType](./linq_oftype/)() | Фильтрует элементы последовательности по указанному типу. |
| [LINQ_OfType](./linq_oftype/)() |  |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<T, Key\>\&) | Сортирует элементы последовательности по возрастанию в соответствии с ключевыми значениями, выбранными с помощью keySelector. |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<Source, Key\>\&) |  |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<T, Key\>\&) | Сортирует элементы последовательности по убыванию в соответствии с ключевыми значениями, выбранными с помощью keySelector. |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<Source, Key\>\&) |  |
| [LINQ_Reverse](./linq_reverse/)() | Инвертирует порядок элементов в последовательности. |
| [LINQ_Select](./linq_select/)(const Func\<T, ResultType\>\&) | Преобразует элементы последовательности. |
| [LINQ_Select](./linq_select/)(const Func\<T, int32_t, ResultType\>\&) | Преобразует каждый элемент последовательности в новую форму, учитывая индекс элемента. |
| [LINQ_Select](./linq_select/)(const Func\<Source, Result\>\&) |  |
| [LINQ_Select](./linq_select/)(const Func\<Source, int32_t, Result\>\&) |  |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\&) | Проецирует каждый элемент последовательности и объединяет полученные последовательности в одну. |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<Source, SharedPtr\<IEnumerable\<Result\>\>\>\&) |  |
| [LINQ_Take](./linq_take/)(int32_t) | Возвращает указанное количество последовательных элементов с начала последовательности. |
| [LINQ_ToArray](./linq_toarray/)() | Создаёт массив из последовательности. |
| [LINQ_ToList](./linq_tolist/)() | Создаёт [List<T>](../list/) из последовательности. |
| [LINQ_Where](./linq_where/)(std::function\<bool(T)>) | Фильтрует последовательность на основе указанного предиката. |
| virtual [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const | Получает реализацию константного итератора begin для текущего контейнера. |
| virtual [virtualizeBeginIterator](./virtualizebeginiterator/)() | Получает реализацию итератора begin для текущего контейнера. |
| virtual [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const | Получает реализацию константного итератора end для текущего контейнера. |
| virtual [virtualizeEndIterator](./virtualizeenditerator/)() | Получает реализацию итератора end для текущего контейнера. |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [const_iterator](./const_iterator/) | Тип константного итератора. |
| [IEnumeratorType](./ienumeratortype/) | Информация RTTI. |
| [iterator](./iterator/) | Тип итератора. |
| [ValueType](./valuetype/) |  |
| [virtualized_iterator](./virtualized_iterator/) | Базовый тип внутреннего итератора. |
| [virtualized_iterator_element](./virtualized_iterator_element/) | Тип элемента внутреннего итератора. |

## См. также

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
