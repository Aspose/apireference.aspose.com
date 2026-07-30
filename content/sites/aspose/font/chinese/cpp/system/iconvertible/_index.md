---
title: "System::IConvertible 类"
linktitle: "IConvertible"
second_title: "Aspose.Font 适用于 C++"
description: "System::IConvertible 类。定义将实现的引用或值类型的值转换为具有等效值的公共语言运行时类型的方法。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 3400
url: /zh/cpp/system/iconvertible/
---
## IConvertible class


定义将实现的引用或值类型的值转换为具有等效值的公共语言运行时类型的方法。此类的对象只能使用 [System::MakeObject()](../makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class IConvertible : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [GetTypeCode](./gettypecode/)() | 返回此实例的类型代码。 |
| virtual [ToBoolean](./toboolean/)(System::SharedPtr\<System::IFormatProvider\>) | 使用指定的特定文化格式信息，将此实例的值转换为等效的 [Boolean](../boolean/) 值。 |
| virtual [ToByte](./tobyte/)(System::SharedPtr\<System::IFormatProvider\>) | 使用指定的特定文化格式信息，将此实例的值转换为等效的 8 位 uint32_teger。 |
| virtual [ToChar](./tochar/)(System::SharedPtr\<System::IFormatProvider\>) | 使用指定的特定文化格式信息，将此实例的值转换为等效的 Unicode 字符。 |
| virtual [ToDateTime](./todatetime/)(System::SharedPtr\<System::IFormatProvider\>) | 使用指定的特定文化格式信息，将此实例的值转换为等效的 [System::DateTime](../datetime/)。 |
| virtual [ToDecimal](./todecimal/)(System::SharedPtr\<System::IFormatProvider\>) | 使用指定的特定文化格式信息，将此实例的值转换为等效的 [System::Decimal](../decimal/) 数字。 |
| virtual [ToDouble](./todouble/)(System::SharedPtr\<System::IFormatProvider\>) | 使用指定的特定文化格式信息，将此实例的值转换为等效的双精度浮点数。 |
| virtual [ToInt16](./toint16/)(System::SharedPtr\<System::IFormatProvider\>) | 使用指定的特定文化格式信息，将此实例的值转换为等效的 16 位有符号整数。 |
| virtual [ToInt32](./toint32/)(System::SharedPtr\<System::IFormatProvider\>) | 使用指定的特定文化格式信息，将此实例的值转换为等效的 32 位有符号整数。 |
| virtual [ToInt64](./toint64/)(System::SharedPtr\<System::IFormatProvider\>) | 使用指定的特定文化格式信息，将此实例的值转换为等效的 64 位有符号整数。 |
| virtual [ToSByte](./tosbyte/)(System::SharedPtr\<System::IFormatProvider\>) | 使用指定的特定文化格式信息，将此实例的值转换为等效的 8 位有符号整数。 |
| virtual [ToSingle](./tosingle/)(System::SharedPtr\<System::IFormatProvider\>) | 使用指定的特定文化格式信息，将此实例的值转换为等效的单精度浮点数。 |
| virtual [ToString](./tostring/)(System::SharedPtr\<System::IFormatProvider\>) | 使用指定的特定文化格式信息，将此实例的值转换为等效的 [System::String](../string/)。 |
| virtual [ToString](./tostring/)() const | C# [Object.ToString()](../object/tostring/) 方法的类似实现。支持将自定义对象转换为字符串。 |
| virtual [ToType](./totype/)(const TypeInfo\&, System::SharedPtr\<System::IFormatProvider\>) | 使用指定的特定文化格式信息，将此实例的值转换为指定 System::Type 的等效值的 [System::Object](../object/)。 |
| virtual [ToUInt16](./touint16/)(System::SharedPtr\<System::IFormatProvider\>) | 使用指定的区域特定格式信息，将此实例的值转换为等效的 16 位 uint32_teger。 |
| virtual [ToUInt32](./touint32/)(System::SharedPtr\<System::IFormatProvider\>) | 使用指定的区域特定格式信息，将此实例的值转换为等效的 32 位 uint32_teger。 |
| virtual [ToUInt64](./touint64/)(System::SharedPtr\<System::IFormatProvider\>) | 使用指定的区域特定格式信息，将此实例的值转换为等效的 64 位 uint32_teger。 |
## 另见

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
