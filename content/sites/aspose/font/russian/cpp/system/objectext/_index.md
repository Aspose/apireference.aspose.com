---
title: "Класс System::ObjectExt"
linktitle: "ObjectExt"
second_title: "Aspose.Font для C++"
description: "Класс System::ObjectExt. Предоставляет статические методы, имитирующие методы C# Object, вызываемые для не-Object типов C++ (строки, числа и т.д.). Это статический тип без сервисов экземпляра. Вы никогда не должны создавать его экземпляры каким-либо способом в C++."
type: docs
weight: 4900
url: /ru/cpp/system/objectext/
---
## ObjectExt class


Предоставляет статические методы, имитирующие методы C# [Object](../object/), вызываемые для не-Object типов C++ (строки, числа и т.д.). Это статический тип без сервисов экземпляра. Вы никогда не должны создавать его экземпляры каким-либо способом.

```cpp
class ObjectExt : public System::ObjectType
```

## Методы

| Метод | Описание |
| --- | --- |
| static [ArrayInitializerCast](./arrayinitializercast/)(From ...) | Преобразует фундаментальные значения массивов (что C# делает неявно, но C++ очевидно не делает). |
| static [Box](./box/)(const T\&) | Упаковывает типы-значения для преобразования в [Object](../object/). Реализация для перечислений. |
| static [Box](./box/)(const T\&) | Упаковывает типы-значения для преобразования в [Object](../object/). Реализация для не перечислений. |
| static [Box](./box/)(const T\&) | Упаковывает типы [Nullable](../nullable/) для преобразования в [Object](../object/). |
| static [Box](./box/)(const String\&) | Упаковывает строковые значения. |
| static [BoxEnum](./boxenum/)(T) | Упаковывает типы перечислений для передачи как [Object](../object/). |
| static [CastToIList](./casttoilist/)(const SmartPtr\<Object\>\&) |  |
| static [Coalesce](./coalesce/)(T0, T1) | Реализация трансляции оператора '??' для не-nullable типов. |
| static [Coalesce](./coalesce/)(System::Nullable\<T0\>, T1) | Реализация трансляции оператора '??' для nullable типов. |
| static [CoalesceAssign](./coalesceassign/)(T0\&, T1) | Реализация трансляции оператора '??='. |
| static [CoalesceInternal](./coalesceinternal/)(RT1, F) | Реализация трансляции оператора '??' для не-nullable типов. Перегрузка для случая, когда RT2 преобразуем к RT1. |
| static [Equals](./equals/)(const T\&, const T2\&) |  |
| static [Equals](./equals/)(const T\&, const T2\&) | Замена вызовов C# [Object.Equals](../object/equals/) работающих для любого типа в C++. Перегрузка для типов умных указателей. |
| static [Equals](./equals/)(T, const T2\&) | Замена вызовов C# [Object.Equals](../object/equals/) работающих для любого типа в C++. Перегрузка для структурных типов. |
| static [Equals](./equals/)(const T\&, const T2\&) | Замена вызовов C# [Object.Equals](../object/equals/) работающих для любого типа в C++. Перегрузка для скалярных типов. |
| static [Equals](./equals/)(const char_t(&), String) | Замена вызовов C# [Object.Equals](../object/equals/) работающих для любого типа в C++. Перегрузка для строковых литералов со строковым сравнением. |
| static [Equals](./equals/)(const float\&, const float\&) | Эмулирует сравнение чисел с плавающей точкой в стиле C#, где два NaN считаются равными, хотя согласно IEC 60559:1989 NaN не равен ни одному значению, включая NaN. |
| static [Equals](./equals/)(const double\&, const double\&) | Эмулирует сравнение чисел с плавающей точкой в стиле C#, где два NaN считаются равными, хотя согласно IEC 60559:1989 NaN не равен ни одному значению, включая NaN. |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [GetHashCode](./gethashcode/)(const T\&) | Реализует вызовы [GetHashCode()](./gethashcode/); работает как с подклассами [Object](../object/), так и с несвязанными типами. |
| static [Is](./is/)(const T\&) | Реализует трансляцию оператора 'is'. Специализация для упаковываемых (значимых) типов, что именно они есть. |
| static [Is](./is/)(const U\&) | Реализует трансляцию оператора 'is'. Специализация для указательных типов, оптимизированных для классов 'final'. |
| static [Is](./is/)(const U\&) | Реализует трансляцию оператора 'is'. Специализация для указательных типов. |
| static [Is](./is/)(const Object\&) | Реализует трансляцию оператора 'is'. Специализация для значимых типов. |
| static [Is](./is/)(const Object\&) | Реализует трансляцию оператора 'is'. Специализация для непреобразуемых типов. |
| static [Is](./is/)(const SmartPtr\<U\>\&) | Реализует трансляцию оператора 'is'. Специализация для указательных типов. |
| static [Is](./is/)(const ExceptionWrapper\<U\>\&) | Реализует трансляцию оператора 'is'. Специализация для типов-обёрток исключений. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | Реализует перевод оператора 'is'. Специализация для nullable типов. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | Реализует перевод оператора 'is'. Специализация для boxable типов с определённым оператором ==. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | Реализует перевод оператора 'is'. Специализация для boxable типов без определённого оператора ==. |
| static [Is](./is/)(const SmartPtr\<V\>\&) | Реализует перевод оператора 'is'. Специализация value типов, упакованных в интерфейсы. |
| static [Is](./is/)(const SmartPtr\<U\>\&) | Реализует перевод оператора 'is'. Специализация для enum типов. |
| static [Is](./is/)(const WeakPtr\<U\>\&) | Реализует перевод оператора 'is'. Специализация для enum типов против weak указателей. |
| static [Is](./is/)(const Nullable\<U\>\&) | Реализует перевод оператора 'is'. Специализация для типа [Nullable](../nullable/). |
| static [Is](./is/)(const char16_t *) | Реализует перевод оператора 'is'. Специализация для строкового литерала. |
| static [Is](./is/)(int32_t) | Реализует перевод оператора 'is'. Специализация для целочисленного литерала. |
| static [IsBoxedValue](./isboxedvalue/)(const SmartPtr\<Object\>\&) | Проверяет, является ли объект упакованным значением. |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | Преобразует [Object](../object/) в неизвестный тип, обрабатывая как тип умного указателя, так и упакованное значение. |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | Преобразует [Object](../object/) в неизвестный тип, обрабатывая как тип умного указателя, так и упакованное значение. |
| static [ToString](./tostring/)(const char_t *) | Замена метода C# ToString для работы с любым типом C++. |
| static [ToString](./tostring/)(const Nullable\<T\>\&) | Замена метода C# ToString для работы с любым типом C++. |
| static [ToString](./tostring/)(const T\&) | Замена метода C# ToString для работы с любым типом C++. |
| static [ToString](./tostring/)(const T\&) | Замена метода C# ToString для работы с любым типом C++. |
| static [ToString](./tostring/)(T\&) | Замена метода C# ToString для работы с любым типом C++. |
| static [ToString](./tostring/)(T\&) | Замена метода C# ToString для работы с любым типом C++. |
| static [ToString](./tostring/)(T\&&) | Замена метода C# ToString для работы с любым типом C++. |
| static [ToString](./tostring/)(T\&) | Замена метода C# ToString для работы с любым типом C++. |
| static [ToString](./tostring/)(const T\&) | Замена метода C# ToString для работы с любым типом C++. |
| static [ToString](./tostring/)(T\&&) | Замена метода C# ToString для работы с любым типом C++. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Разупаковывает value типы после преобразования в [Object](../object/). Реализация для enum типов. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Разупаковывает value типы после преобразования в [Object](../object/). Реализация для типов, не являющихся enum и не nullable. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Разупаковывает value типы после преобразования в [Object](../object/). Реализация для типов, не являющихся enum и не nullable. |
| static [Unbox](./unbox/)(E) | Разупаковывает enum типы в целое число. |
| static [Unbox](./unbox/)(E) | Преобразует enum типы. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Разупаковывает строковые значения. |
| static [UnboxStringSafe](./unboxstringsafe/)(const SmartPtr\<Object\>\&) | Разупаковывает строку из упакованного значения. |
| static [UnboxToNullable](./unboxtonullable/)(const SmartPtr\<Object\>\&, bool) | Разупаковывает объект в nullable тип. |
| static [UnknownIsNull](./unknownisnull/)(T) | Проверяет, является ли объект неизвестного типа nullptr. Перегрузка для не скалярных типов. |
| static [UnknownIsNull](./unknownisnull/)(T) | Проверяет, является ли объект неизвестного типа nullptr. Перегрузка для скалярных типов. |
| static [UnknownToObject](./unknowntoobject/)(T) | Преобразует неизвестный тип в [Object](../object/), обрабатывая как тип умного указателя, так и тип значения. |
| static [UnknownToObject](./unknowntoobject/)(const T\&) | Преобразует неизвестный тип в [Object](../object/), обрабатывая как тип умного указателя, так и тип значения. |
## См. также

* Class [ObjectType](../objecttype/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
