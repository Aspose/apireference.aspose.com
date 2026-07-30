---
title: "System::Collections::Generic::_KeyCollection класс"
linktitle: "_KeyCollection"
second_title: "Aspose.Font для C++"
description: "System::Collections::Generic::_KeyCollection класс. Коллекция ключей Dictionary. Ссылается на коллекцию, ничего не копирует. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 100
url: /ru/cpp/system.collections.generic/_keycollection/
---
## _KeyCollection class


Коллекция ключей [Dictionary](../dictionary/). Ссылается на коллекцию, ничего не копирует. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
template<typename Dict>class _KeyCollection : public System::Collections::Generic::BaseKVCollection<Dict, Dict::map_t::key_type>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Методы

| Метод | Описание |
| --- | --- |
| [_KeyCollection](./_keycollection/)(const typename Dict::Ptr\&) | Инициализирует коллекцию, ссылающуюся на указанный словарь. |
| [Contains](./contains/)(const TKey\&) const override | Проверяет, присутствует ли элемент в контейнере. |
| [GetEnumerator](./getenumerator/)() override | Получает перечислитель, проходящий по ключам. |
| [idx_get](./idx_get/)(int) const override | Реализует метод [IList](../ilist/). Не поддерживается. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Получает реализацию константного итератора begin для текущего контейнера. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Получает реализацию итератора begin для текущего контейнера. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Получает реализацию константного итератора end для текущего контейнера. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Получает реализацию итератора end для текущего контейнера. |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [TKey](./tkey/) | Тип ключа. |

## См. также

* Class [BaseKVCollection](../basekvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
