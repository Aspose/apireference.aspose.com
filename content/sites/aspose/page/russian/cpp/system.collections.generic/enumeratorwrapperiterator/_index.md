---
title: "System::Collections::Generic::EnumeratorWrapperIterator класс"
linktitle: "EnumeratorWrapperIterator"
second_title: "Aspose.Page для C++"
description: "System::Collections::Generic::EnumeratorWrapperIterator класс. Итератор, который оборачивает заранее созданный перечислитель и перенаправляет все вызовы к нему в C++."
type: docs
weight: 1500
url: /ru/cpp/system.collections.generic/enumeratorwrapperiterator/
---
## EnumeratorWrapperIterator class


Итератор, оборачивающий заранее созданный перечислитель и перенаправляющий все вызовы к нему.

```cpp
template<typename Element>class EnumeratorWrapperIterator : public System::Details::VirtualizedIteratorBase<Element>
```


| Параметр | Описание |
| --- | --- |
| Element | Тип элемента. |
## Методы

| Метод | Описание |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Клонирует текущий итератор. |
| [EnumeratorWrapperIterator](./enumeratorwrapperiterator/)(const SharedPtr\<IEnumerator\<Element\>\>\&) |  |
| [IncrementIterator](./incrementiterator/)() override | Перемещает итератор на шаг вперёд. Необходимо обновить m_is_end и m_pointer. |
| [IteratorEquals](./iteratorequals/)(System::Details::VirtualizedIteratorBase\<Element\> *) const override | Проверяет, указывают ли два итератора на один и тот же элемент. |
| virtual [~EnumeratorWrapperIterator](./~enumeratorwrapperiterator/)() | Деструктор. |

## См. также

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
