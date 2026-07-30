---
title: "System::BoxedEnum class"
linktitle: "BoxedEnum"
second_title: "Aspose.Font для C++"
description: "System::BoxedEnum class. Представляет упакованное значение перечисления. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 700
url: /ru/cpp/system/boxedenum/
---
## BoxedEnum class


Представляет упакованное значение перечисления. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
template<typename E,typename UT>class BoxedEnum : public System::BoxedValue<typename std::underlying_type<E>::type>
```


| Параметр | Описание |
| --- | --- |
| E | Тип значения перечисления |
| UT | Базовый тип перечисления **E** |
## Методы

| Метод | Описание |
| --- | --- |
| [BoxedEnum](./boxedenum/)(E) | Создаёт экземпляр, представляющий указанное значение перечисления. |
| [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const override | Преобразует значение упакованной константы перечисления в 64‑битное целое значение. |
| [IsBoxedEnum](./isboxedenum/)() override | Определяет, представляет ли текущий объект упакованное значение типа enum. |
| [ToString](./tostring/)() const override | Преобразует упакованное значение, представленное текущим объектом, в строку. |

## См. также

* Class [BoxedValue](../boxedvalue/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
