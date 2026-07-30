---
title: "Класс System::Collections::Generic::IComparer"
linktitle: "IComparer"
second_title: "Aspose.Font для C++"
description: "Класс System::Collections::Generic::IComparer. Интерфейс, сравнивающий два объекта по признаку больше‑равно‑меньше. Объекты этого класса должны выделяться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 2000
url: /ru/cpp/system.collections.generic/icomparer/
---
## IComparer class


Интерфейс, сравнивающий два объекта по признаку больше‑равно‑меньше. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
template<typename T>class IComparer : public virtual System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [Compare](./compare/)(args_type, args_type) const | [Comparison](../../system/comparison/) функция. |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [args_type](./args_type/) | Информация RTTI. |

## См. также

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
