---
title: "System::Collections::CollectionBase класс"
linktitle: "CollectionBase"
second_title: "Aspose.Page для C++"
description: "System::Collections::CollectionBase класс. Предоставляет абстрактный базовый класс для строго типизированной коллекции в C++."
type: docs
weight: 300
url: /ru/cpp/system.collections/collectionbase/
---
## CollectionBase class


Предоставляет абстрактный базовый класс для строго типизированной коллекции.

```cpp
template<typename T>class CollectionBase : public virtual System::Collections::Generic::IEnumerable<T>
```


| Параметр | Описание |
| --- | --- |
| T | Тип элементов коллекции |
## Nested classes

* Class [ListImpl](./listimpl/)
## Методы

| Метод | Описание |
| --- | --- |
| [Clear](./clear/)() | Удаляет все объекты из экземпляра коллекции. Этот метод не может быть переопределён. |
| [get_Capacity](./get_capacity/)() | Возвращает количество элементов, которое может содержать коллекция. |
| [get_Count](./get_count/)() | Возвращает количество элементов, содержащихся в экземпляре коллекции. Этот метод не может быть переопределён. |
| [GetEnumerator](./getenumerator/)() override | Возвращает перечислитель, который перебирает элементы экземпляра коллекции. |
| [RemoveAt](./removeat/)(int32_t) | Удаляет элемент по указанному индексу в экземпляре коллекции. Этот метод не переопределяется. |
| [set_Capacity](./set_capacity/)(int32_t) | Устанавливает количество элементов, которое может содержать коллекция. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Устанавливает n‑й аргумент шаблона как слабый указатель (вместо shared). Позволяет переключать указатели в контейнерах в режим weak. |
## Typedefs

| Определение типа. | Описание |
| --- | --- |
| [Ptr](./ptr/) | Псевдоним для shared pointer к экземпляру этого класса. |

## См. также

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
