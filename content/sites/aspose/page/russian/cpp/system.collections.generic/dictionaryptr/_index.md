---
title: "System::Collections::Generic::DictionaryPtr класс"
linktitle: "DictionaryPtr"
second_title: "Aspose.Page для C++"
description: "System::Collections::Generic::DictionaryPtr класс. Класс указателя словаря с перегрузками операторов. Этот тип представляет собой указатель для управления удалением других объектов''. Его следует выделять в стеке и передавать функциям либо по значению, либо по константной ссылке в C++."
type: docs
weight: 1300
url: /ru/cpp/system.collections.generic/dictionaryptr/
---
## DictionaryPtr class


[Dictionary](../dictionary/) pointer class with operator overloads. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T,typename V>class DictionaryPtr : public System::SmartPtr<Dictionary<T, V>>
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
* Library [Aspose.Page for C++](../../)
