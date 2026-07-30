---
title: "System::Collections::Generic::SortedList класс"
linktitle: "SortedList"
second_title: "Aspose.Font для C++"
description: "System::Collections::Generic::SortedList класс. Отсортированный список, оборачивающий структуру FlatMap. Объекты этого класса должны выделяться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 4200
url: /ru/cpp/system.collections.generic/sortedlist/
---
## SortedList class


Отсортированный список, оборачивающий структуру FlatMap. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
template<typename TKey,typename TValue>class SortedList : public System::Collections::Generic::SortedListHelper<TKey, TValue>,
                                                          public System::Collections::Generic::BaseDictionary<Detail::FlatMap<TKey, TValue, ComparerAdapter<TKey>>>
```


| Параметр | Описание |
| --- | --- |
| TKey | Тип ключа. |
| TValue | Тип значения. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Методы

| Метод | Описание |
| --- | --- |
| [crbegin](./crbegin/)() const | Получает обратный итератор к последнему элементу коллекции с const‑квалификатором (первый в обратном порядке). |
| [crend](./crend/)() const | Получает обратный итератор для несуществующего элемента с const‑квалификатором перед началом коллекции. |
| [get_Capacity](./get_capacity/)() const | Получает текущую ёмкость списка. |
| virtual [get_Keys](./get_keys/)() const | Получает доступ к коллекции ключей. |
| virtual [get_Values](./get_values/)() const | Получает доступ к коллекции значений. |
| [GetEnumerator](./getenumerator/)() override | Получает перечислитель, проходящий по текущему списку. |
| [IndexOfKey](./indexofkey/)(TKey) const | Ищет конкретный ключ. |
| [IndexOfValue](./indexofvalue/)(TValue) const | Ищет конкретное значение. |
| [rbegin](./rbegin/)() | Получает обратный итератор к последнему элементу коллекции (первый в обратном порядке). |
| [rbegin](./rbegin/)() const | Получает обратный итератор к последнему элементу const‑квалифицированной коллекции (первый в обратном порядке). |
| [RemoveAt](./removeat/)(int) | Удаляет элемент в указанной позиции. |
| [rend](./rend/)() | Получает обратный итератор для несуществующего элемента перед началом коллекции. |
| [rend](./rend/)() const | Получает обратный итератор для несуществующего элемента перед началом const‑квалифицированной коллекции. |
| [set_Capacity](./set_capacity/)(int) | Устанавливает текущую ёмкость списка. |
| [SortedList](./sortedlist/)() | Создаёт пустой список. |
| [SortedList](./sortedlist/)(const SharedPtr\<IComparer\<TKey\>\>\&) | Создаёт пустой список. |
| [SortedList](./sortedlist/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | Конструктор копирования. |
| [SortedList](./sortedlist/)(const map_t\&) | Конструктор копирования. |
| [SortedList](./sortedlist/)(int) | Создаёт пустой список. |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [const_iterator](./const_iterator/) | Тип константного итератора. |
| [const_reverse_iterator](./const_reverse_iterator/) | Тип константного обратного итератора. |
| [IEnumerablePtr](./ienumerableptr/) | Коллекция пар одинакового типа. |
| [IEnumeratorPtr](./ienumeratorptr/) | Тип [Enumerator](./enumerator/). |
| [iterator](./iterator/) | Тип итератора. |
| [KeyCollection](./keycollection/) | Тип коллекции ключей. |
| [KVPair](./kvpair/) | Тип пары ключ‑значение. |
| [map_t](./map_t/) | Базовый тип данных. |
| [Ptr](./ptr/) | Тип указателя. |
| [reverse_iterator](./reverse_iterator/) | Тип обратного итератора. |
| [this_t](./this_t/) | Этот тип. |
| [ValueCollection](./valuecollection/) | Тип коллекции значений. |

## См. также

* Class [SortedListHelper](../sortedlisthelper/)
* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
