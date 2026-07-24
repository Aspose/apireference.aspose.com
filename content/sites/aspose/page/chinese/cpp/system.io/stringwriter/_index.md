---
title: "System::IO::StringWriter 类"
linktitle: "StringWriter"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::StringWriter 类。实现一个将信息写入字符串的 TextWriter。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 2500
url: /zh/cpp/system.io/stringwriter/
---
## StringWriter class


实现一个 [TextWriter](../textwriter/)，将信息写入字符串。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class StringWriter : public System::IO::TextWriter
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | 返回当前使用的编码。 |
| virtual [GetStringBuilder](./getstringbuilder/)() | 返回当前使用的 StringBuilder。 |
| [StringWriter](./stringwriter/)(const System::SharedPtr\<Text::StringBuilder\>\&, const IFormatProviderPtr\&) | 使用指定的 StringBuilder 和 [IFormatProvider](../../system/iformatprovider/) 构造一个新的 [StringWriter](./) 实例。 |
| [StringWriter](./stringwriter/)(const System::SharedPtr\<Text::StringBuilder\>\&) | 使用指定的 StringBuilder 和来自当前区域性设置的 [IFormatProvider](../../system/iformatprovider/) 构造一个新的 [StringWriter](./) 实例。 |
| [StringWriter](./stringwriter/)(const IFormatProviderPtr\&) | 使用指定的 [IFormatProvider](../../system/iformatprovider/) 构造一个新的 [StringWriter](./) 实例。 |
| [StringWriter](./stringwriter/)() | 使用来自当前区域性设置的 [IFormatProvider](../../system/iformatprovider/) 构造一个新的 [StringWriter](./) 实例。 |
| [ToString](./tostring/)() const override | 返回底层字符串。 |
| [Write](./write/)(char_t) override | 将指定字符写入流。 |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | 将指定字符数组中指定子范围的字符写入流。 |
| [Write](./write/)(const String\&) override | 将指定字符串写入流。 |
## 另见

* Class [TextWriter](../textwriter/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
