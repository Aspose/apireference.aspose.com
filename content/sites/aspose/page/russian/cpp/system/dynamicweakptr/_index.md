---
title: "Класс System::DynamicWeakPtr"
linktitle: "DynamicWeakPtr"
second_title: "Aspose.Page для C++"
description: "Класс System::DynamicWeakPtr. Класс умного указателя, который отслеживает режимы указателей шаблонных аргументов хранимого объекта и обновляет их после каждого присваивания. Этот тип является указателем для управления удалением другого объекта. Его следует выделять в стеке и передавать в функции либо по значению, либо по константной ссылке в C++."
type: docs
weight: 2200
url: /ru/cpp/system/dynamicweakptr/
---
## DynamicWeakPtr class


Класс умного указателя, отслеживающий режимы указателей шаблонных аргументов хранимого объекта и обновляющий их после каждого присваивания. Этот тип является указателем для управления удалением другого объекта. Он должен выделяться в стеке и передаваться в функции либо по значению, либо по константной ссылке.

```cpp
template<typename T,SmartPtrMode,unsigned int ...>class DynamicWeakPtr : public System::SmartPtr<T>
```


| Параметр | Описание |
| --- | --- |
| Pointee | тип. |
| trunkMode | Режим самого умного указателя, shared или weak. |
| weakLeafs | Индексы шаблонных аргументов хранимого типа, которые должны быть установлены в режим weak‑указателя. |
## Nested classes

* Class [Reference](./reference/)
## Методы

| Метод | Описание |
| --- | --- |
| [DynamicWeakPtr](./dynamicweakptr/)(std::nullptr_t) | Создаёт нулевой умный указатель. |
| [DynamicWeakPtr](./dynamicweakptr/)(Pointee_ *) | Создаёт умный указатель, указывающий на заданный объект. |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr_\&) | Копирующе‑конструирует умный указатель. |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr\<Q\>\&) | Копирующе‑конструирует умный указатель. |
| [DynamicWeakPtr](./dynamicweakptr/)(const DynamicWeakPtr_\&) | Копирующе‑конструирует умный указатель. |
| [DynamicWeakPtr](./dynamicweakptr/)(SmartPtr_\&&) | Перемещающе‑конструирует умный указатель. |
| [operator=](./operator=/)(SmartPtr_\&&) | Перемещающе‑присваивает умный указатель. |
| [operator=](./operator=/)(const SmartPtr_\&) | Копирующе‑присваивает умный указатель. |
| [operator=](./operator=/)(const SmartPtr\<Q\>\&) | Копирующе‑присваивает умный указатель. |
| [operator=](./operator=/)(typename SmartPtr_::Pointee_ *) | Присваивает умный указатель. |
| [operator=](./operator=/)(std::nullptr_t) | Устанавливает умный указатель в null. |
| [operator==](./operator==/)(std::nullptr_t) const | Проверяет, является ли умный указатель null. |
## Typedefs

| Определение типа. | Описание |
| --- | --- |
| [DynamicWeakPtr_](./dynamicweakptr_/) | Псевдоним собственного типа. |
| [Pointee_](./pointee_/) | Тип указуемого. |
| [SmartPtr_](./smartptr_/) | [SmartPtr](../smartptr/) псевдоним базового класса. |

## См. также

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
