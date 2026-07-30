---
title: "Класс System::DynamicWeakPtr"
linktitle: "DynamicWeakPtr"
second_title: "Aspose.Font для C++"
description: "Класс System::DynamicWeakPtr. Класс умного указателя, который отслеживает режимы указателей шаблонных аргументов хранимого объекта и обновляет их после каждого присваивания. Этот тип является указателем для управления удалением другого объекта. Его следует размещать в стеке и передавать в функции либо по значению, либо по константной ссылке в C++."
type: docs
weight: 2200
url: /ru/cpp/system/dynamicweakptr/
---
## DynamicWeakPtr class


Класс умного указателя, который отслеживает режимы указателей шаблонных аргументов хранимого объекта и обновляет их после каждого присваивания. Этот тип является указателем для управления удалением другого объекта. Он должен выделяться в стеке и передаваться в функции либо по значению, либо по константной ссылке.

```cpp
template<typename T,SmartPtrMode,unsigned int ...>class DynamicWeakPtr : public System::SmartPtr<T>
```


| Параметр | Описание |
| --- | --- |
| Pointee | тип. |
| trunkMode | Режим самого smart pointer, shared или weak. |
| weakLeafs | Индексы шаблонных аргументов хранимого типа, которые должны быть установлены в режим weak pointer. |
## Nested classes

* Class [Reference](./reference/)
## Методы

| Метод | Описание |
| --- | --- |
| [DynamicWeakPtr](./dynamicweakptr/)(std::nullptr_t) | Создает null smart pointer. |
| [DynamicWeakPtr](./dynamicweakptr/)(Pointee_ *) | Создает smart pointer, указывающий на заданный объект. |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr_\&) | Копирующе-конструирует smart pointer. |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr\<Q\>\&) | Копирующе-конструирует smart pointer. |
| [DynamicWeakPtr](./dynamicweakptr/)(const DynamicWeakPtr_\&) | Копирующе-конструирует smart pointer. |
| [DynamicWeakPtr](./dynamicweakptr/)(SmartPtr_\&&) | Перемещающе-конструирует smart pointer. |
| [operator=](./operator=/)(SmartPtr_\&&) | Перемещающе присваивает smart pointer. |
| [operator=](./operator=/)(const SmartPtr_\&) | Копирующе присваивает smart pointer. |
| [operator=](./operator=/)(const SmartPtr\<Q\>\&) | Копирующе присваивает smart pointer. |
| [operator=](./operator=/)(typename SmartPtr_::Pointee_ *) | Присваивает smart pointer. |
| [operator=](./operator=/)(std::nullptr_t) | Устанавливает smart pointer в null. |
| [operator==](./operator==/)(std::nullptr_t) const | Проверяет, является ли умный указатель null. |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [DynamicWeakPtr_](./dynamicweakptr_/) | Псевдоним собственного типа. |
| [Pointee_](./pointee_/) | Тип, на который указывает. |
| [SmartPtr_](./smartptr_/) | [SmartPtr](../smartptr/) псевдоним базового класса. |

## См. также

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
