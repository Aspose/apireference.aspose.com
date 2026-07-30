---
title: "Класс System::Collections::IListImplRefType"
linktitle: "IListImplRefType"
second_title: "Aspose.Font для C++"
description: "Класс System::Collections::IListImplRefType. Заглушка, реализующая интерфейс System::Collections::IList для объекта System::Collections::Generic::List. Реализация для ссылочных типов в C++."
type: docs
weight: 1100
url: /ru/cpp/system.collections/ilistimplreftype/
---
## IListImplRefType class


Заглушка, реализующая интерфейс [System::Collections::IList](../ilist/) для объекта [System::Collections::Generic::List](../../system.collections.generic/list/). Реализация для ссылочных типов.

```cpp
template<typename T>class IListImplRefType : public virtual System::Collections::IList
```

## Методы

| Метод | Описание |
| --- | --- |
| [Add](./add/)(SharedPtr\<System::Object\>) override | Добавляет элемент в конец списка. |
| static [BoxValue](./boxvalue/)(System::SharedPtr\<T\>) | Преобразование ссылки типа в значение объекта. |
| [Clear](./clear/)() override | Удаляет все элементы. |
| [Contains](./contains/)(SharedPtr\<System::Object\>) const override | Проверяет, присутствует ли элемент в списке. |
| [get_Count](./get_count/)() const override | [ICollection.get_Count()](../icollection/get_count/) реализация методов Возвращает количество элементов в коллекции. |
| [GetEnumerator](./getenumerator/)() override | [IEnumerable.GetEnumerator()](../ienumerable/getenumerator/) реализация Возвращает перечислитель, который перебирает элементы коллекции. |
| [idx_get](./idx_get/)(int, int) const override | Получает элемент по указанному индексу. |
| [IListImplRefType](./ilistimplreftype/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<T\>\>\>) | Создаёт новый экземпляр объекта. |
| [IndexOf](./indexof/)(System::SharedPtr\<System::Object\>) const override | Получает индекс первого появления элемента в контейнере. |
| [Insert](./insert/)(int, System::SharedPtr\<System::Object\>) override | Вставляет элемент в указанную позицию, сдвигая остальные элементы. |
| [Remove](./remove/)(SharedPtr\<System::Object\>) override | Удаляет первое вхождение конкретного элемента из списка. |
| [RemoveAt](./removeat/)(int) override | Удаляет элемент в указанной позиции. |
| static [UnboxValue](./unboxvalue/)(System::SharedPtr\<System::Object\>) | Преобразование значения объекта в конкретную ссылку типа. |
## См. также

* Class [IList](../ilist/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
