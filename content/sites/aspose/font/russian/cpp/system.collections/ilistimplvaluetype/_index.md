---
title: "Класс System::Collections::IListImplValueType"
linktitle: "IListImplValueType"
second_title: "Aspose.Font для C++"
description: "Класс System::Collections::IListImplValueType. Заглушка, реализующая интерфейс System::Collections::IList на объекте System::Collections::Generic::List. Реализация для типовых значений в C++."
type: docs
weight: 1200
url: /ru/cpp/system.collections/ilistimplvaluetype/
---
## IListImplValueType class


Заглушка, реализующая интерфейс [System::Collections::IList](../ilist/) на объекте [System::Collections::Generic::List](../../system.collections.generic/list/). Реализация для типовых значений.

```cpp
template<typename T>class IListImplValueType : public virtual System::Collections::IList
```

## Методы

| Метод | Описание |
| --- | --- |
| [Add](./add/)(SharedPtr\<System::Object\>) override | Добавляет элемент в конец списка. |
| [Clear](./clear/)() override | Удаляет все элементы. |
| [Contains](./contains/)(SharedPtr\<System::Object\>) const override | Проверяет, присутствует ли элемент в списке. |
| [get_Count](./get_count/)() const override | [ICollection.get_Count()](../icollection/get_count/) реализация методов Возвращает количество элементов в коллекции. |
| [GetEnumerator](./getenumerator/)() override | [IEnumerable.GetEnumerator()](../ienumerable/getenumerator/) реализация Возвращает перечислитель, который перебирает элементы коллекции. |
| [idx_get](./idx_get/)(int, int) const override | Получает элемент по указанному индексу. |
| [IListImplValueType](./ilistimplvaluetype/)(System::SharedPtr\<System::Collections::Generic::IList\<T\>\>) | Создаёт новый экземпляр объекта. |
| [IndexOf](./indexof/)(System::SharedPtr\<System::Object\>) const override | Получает индекс первого появления элемента в контейнере. |
| [Insert](./insert/)(int, System::SharedPtr\<System::Object\>) override | Вставляет элемент в указанную позицию, сдвигая остальные элементы. |
| [Remove](./remove/)(SharedPtr\<System::Object\>) override | Удаляет первое вхождение конкретного элемента из списка. |
| [RemoveAt](./removeat/)(int) override | Удаляет элемент в указанной позиции. |
## См. также

* Class [IList](../ilist/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
