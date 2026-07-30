---
title: "Класс System::Collections::Generic::DictionaryPtr"
linktitle: "DictionaryPtr"
second_title: "Aspose.Font для C++"
description: "Класс System::Collections::Generic::DictionaryPtr. Класс указателя словаря с перегрузками операторов. Этот тип представляет собой указатель для управления удалением другого объекта. Его следует выделять в стеке и передавать в функции либо по значению, либо по константной ссылке в C++."
type: docs
weight: 1300
url: /ru/cpp/system.collections.generic/dictionaryptr/
---
## DictionaryPtr class


[Dictionary](../dictionary/) pointer class with operator overloads. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T,typename V>class DictionaryPtr : public System::SmartPtr<T0>
```


| Параметр | Описание |
| --- | --- |
| T | Тип ключа. |
| V | Тип значения. |
## Методы

| Метод | Описание |
| --- | --- |
| [DictionaryPtr](./dictionaryptr/)() | Инициализирует нулевой указатель. |
| [DictionaryPtr](./dictionaryptr/)(const SharedPtr\<Dictionary\<T, V\>\>\&) | Преобразует тип указателя. |
| [operator[]](./operator[]/)(const X\&) const | Оператор доступа для работы с преобразованием типа ключа. |
| [operator[]](./operator[]/)(const T\&) const | Оператор доступа. |

## См. также

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
