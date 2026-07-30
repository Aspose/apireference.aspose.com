---
title: "Класс System::Reflection::MemberInfo"
linktitle: "MemberInfo"
second_title: "Aspose.Font для C++"
description: "Класс System::Reflection::MemberInfo. Предоставляет информацию рефлексии о членах. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 700
url: /ru/cpp/system.reflection/memberinfo/
---
## MemberInfo class


Предоставляет информацию рефлексии о членах. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class MemberInfo : public System::Object
```

## Nested classes

* Class [TypeInternal](./typeinternal/)
## Методы

| Метод | Описание |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | Добавляет атрибут в коллекцию. |
| [get_DeclaringType](./get_declaringtype/)() const | Возвращает объявляющий тип. |
| [get_FullName](./get_fullname/)() const | Получает полное имя члена. Может отличаться в вручную реализованных частях. |
| virtual [get_MemberType](./get_membertype/)() const | Получает значение [System::Reflection::MemberTypes](../membertypes/), указывающее тип члена — метод, конструктор, событие и т.д. |
| [get_Name](./get_name/)() const | Получает имя члена. |
| [get_ReflectedType](./get_reflectedtype/)() const | Получает тип отражённого типа. |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | Возвращает массив, содержащий объекты, представляющие все пользовательские атрибуты, применённые к типу, представленному текущим объектом. |
| [GetCustomAttributes](./getcustomattributes/)(bool) const | Возвращает массив, содержащий объекты, представляющие все пользовательские атрибуты, применённые к типу, представленному текущим объектом. |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [ObjectPtr](./objectptr/) | Псевдоним для умного указателя на [Object](../../system/object/). |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
