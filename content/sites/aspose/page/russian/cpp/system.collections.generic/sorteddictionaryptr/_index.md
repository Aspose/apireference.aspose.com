---
title: "System::Collections::Generic::SortedDictionaryPtr class"
linktitle: "SortedDictionaryPtr"
second_title: "Aspose.Page для C++"
description: "System::Collections::Generic::SortedDictionaryPtr class. Указатель на отсортированный словарь с операторами доступа. Этот тип является указателем для управления удалением других объектов. Его следует выделять в стеке и передавать в функции либо по значению, либо по константной ссылке в C++."
type: docs
weight: 4100
url: /ru/cpp/system.collections.generic/sorteddictionaryptr/
---
## SortedDictionaryPtr class


Указатель отсортированного словаря с операторами доступа. Этот тип является указателем для управления удалением другого объекта. Он должен выделяться в стеке и передаваться в функции либо по значению, либо по константной ссылке.

```cpp
template<typename T,typename V>class SortedDictionaryPtr : public System::SmartPtr<SortedDictionary<T, V>>
```

## Методы

| Метод | Описание |
| --- | --- |
| [operator[]](./operator[]/)(const T\&) const | Функция доступа. |
| [SortedDictionaryPtr](./sorteddictionaryptr/)() | Создаёт нулевой указатель. |
| [SortedDictionaryPtr](./sorteddictionaryptr/)(const SharedPtr\<SortedDictionary\<T, V\>\>\&) | Создаёт указатель на указанный отсортированный словарь. |
## См. также

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
