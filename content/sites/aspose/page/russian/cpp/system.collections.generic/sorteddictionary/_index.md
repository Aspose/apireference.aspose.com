---
title: "System::Collections::Generic::SortedDictionary класс"
linktitle: "SortedDictionary"
second_title: "Aspose.Page для C++"
description: "System::Collections::Generic::SortedDictionary класс. Предварительное объявление типа отсортированного словаря в C++."
type: docs
weight: 4000
url: /ru/cpp/system.collections.generic/sorteddictionary/
---
## SortedDictionary class


Предварительное объявление типа отсортированного словаря.

```cpp
template<typename TKey,typename TValue>class SortedDictionary : public System::Collections::Generic::BaseDictionary<std::map<TKey, TValue, ComparerAdapter<BasePointerType<TKey>::type>, ASPOSE_MAP_ALLOCATOR_TYPE(TKey, TValue)>>
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
| [get_Comparer](./get_comparer/)() const | Возвращает [IComparer<TKey>](../icomparer/), используемый для упорядочения элементов SortedDictionary<TKey,TValue>. |
| static [GetDefaultKeyComparer](./getdefaultkeycomparer/)() | Функция доступа к синглтону. |
| [GetEnumerator](./getenumerator/)() override | Возвращает перечислитель для итерации по текущему словарю. |
| [rbegin](./rbegin/)() | Получает обратный итератор к последнему элементу коллекции (первому в обратном порядке). |
| [rbegin](./rbegin/)() const | Получает обратный итератор к последнему элементу константной коллекции (первому в обратном порядке). |
| [rend](./rend/)() | Получает обратный итератор для несуществующего элемента перед началом коллекции. |
| [rend](./rend/)() const | Получает обратный итератор для несуществующего элемента перед началом константной коллекции. |
| [SortedDictionary](./sorteddictionary/)() | Создаёт пустой словарь. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | Создаёт пустой словарь. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | Конструктор копирования. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | Конструктор копирования. |
## Typedefs

| Определение типа. | Описание |
| --- | --- |
| [const_iterator](./const_iterator/) | Тип константного итератора. |
| [const_reverse_iterator](./const_reverse_iterator/) | Тип константного обратного итератора. |
| [IEnumerablePtr](./ienumerableptr/) | Коллекция одинаковых элементов. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) тип. |
| [iterator](./iterator/) | Тип итератора. |
| [KeyCollection](./keycollection/) | Тип коллекции ключей. |
| [KVPair](./kvpair/) | Тип пары ключ-значение. |
| [map_t](./map_t/) | Базовый тип данных. |
| [Ptr](./ptr/) | Тип указателя. |
| [reverse_iterator](./reverse_iterator/) | Тип обратного итератора. |
| [this_t](./this_t/) | Тип самого себя. |
| [ValueCollection](./valuecollection/) | Тип коллекции значений. |
## Примечания


Класс отсортированного словаря, оборачивающий STL map. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

## См. также

* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
