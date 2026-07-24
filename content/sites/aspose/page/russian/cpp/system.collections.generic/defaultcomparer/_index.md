---
title: "Класс System::Collections::Generic::DefaultComparer"
linktitle: "DefaultComparer"
second_title: "Aspose.Page для C++"
description: "Класс System::Collections::Generic::DefaultComparer. Класс сравнения по умолчанию. Использует оператор < и оператор == для сравнения значений. Объекты этого класса должны выделяться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 1000
url: /ru/cpp/system.collections.generic/defaultcomparer/
---
## DefaultComparer class


Класс сравнения по умолчанию. Использует оператор < и оператор == для сравнения значений. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
template<class T>class DefaultComparer : public System::Collections::Generic::IComparer<T>
```


| Параметр | Описание |
| --- | --- |
| T | Тип, который сравнивается. |
## Методы

| Метод | Описание |
| --- | --- |
| [Compare](./compare/)(typename ThisType::args_type, typename ThisType::args_type) const override | Информация RTTI. |
## Typedefs

| Определение типа. | Описание |
| --- | --- |
| [BaseType](./basetype/) | Реализованный интерфейс. |
| [ThisType](./thistype/) | Текущий тип. |

## См. также

* Class [IComparer](../icomparer/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
