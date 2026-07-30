---
title: "System::Collections::Generic::Dictionary класс"
linktitle: "Dictionary"
second_title: "Aspose.Font для C++"
description: "System::Collections::Generic::Dictionary класс. Предварительное объявление класса Dictionary в C++."
type: docs
weight: 1100
url: /ru/cpp/system.collections.generic/dictionary/
---
## Dictionary class


Предварительное объявление класса [Dictionary](./).

```cpp
template<typename TKey,typename TValue>class Dictionary : public System::Collections::Generic::BaseDictionary<std::unordered_map<TKey, TValue, EqualityComparerHashAdapter<TKey>, EqualityComparerAdapter<TKey>, ASPOSE_MAP_ALLOCATOR_TYPE(TKey, TValue)>>
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
| [Dictionary](./dictionary/)() | Создаёт пустой словарь. |
| [Dictionary](./dictionary/)(const map_t\&) | Копирует данные из карты. |
| [Dictionary](./dictionary/)(int) | Перегрузка, соответствующая созданию предварительно выделенного словаря; фактически не выполняет выделение. |
| [Dictionary](./dictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | Конструктор копирования. |
| [Dictionary](./dictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | Конструктор копирования. |
| [Dictionary](./dictionary/)(const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | Создаёт пустой словарь. |
| [Dictionary](./dictionary/)(int, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | Создаёт пустой словарь. |
| [GetEnumerator](./getenumerator/)() override | Создаёт объект перечислителя. |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | Указатель на интерфейс перечисления. |
| [IEnumeratorPtr](./ienumeratorptr/) | Указатель на перечислитель. |
| [KeyCollection](./keycollection/) | Информация RTTI. |
| [KVPair](./kvpair/) | Тип пары «ключ‑значение». |
| [map_t](./map_t/) | Базовый тип данных. |
| [Ptr](./ptr/) | Тип указателя. |
| [ValueCollection](./valuecollection/) | Коллекция значений для извлечения. |
## Примечания


[Dictionary](./) that maps values to keys. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/dictionary.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // Создать экземпляр класса Dictionary-class.
  auto dictionary = MakeObject<Dictionary<int, String>>();

  // Заполнить словарь.
  dictionary->Add(0, u"Foo");
  dictionary->Add(1, u"Bar");
  dictionary->Add(2, u"Baz");

  // Вывести элементы словаря.
  for (const auto &pair: dictionary)
  {
    std::cout << pair.get_Key() << " - " << pair.get_Value() << std::endl;
  }

  return 0;
}
/*
This code example produces the following output:
0 - Foo
1 - Bar
2 - Baz
*/
```

## См. также

* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
