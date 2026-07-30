---
title: "System::IO::TextWriter 类"
linktitle: "TextWriter"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::TextWriter 类。一个用于表示将字符序列写入不同目标的写入器的基类。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 2700
url: /zh/cpp/system.io/textwriter/
---
## TextWriter class


一个用于表示将字符序列写入不同目标的写入器的基类。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class TextWriter : public System::IDisposable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Close](./close/)() | 关闭流并释放获取的资源。 |
| [Dispose](./dispose/)() override | 释放当前对象使用的所有资源并关闭底层流。 |
| virtual [Flush](./flush/)() | 将缓冲区的内容刷新到底层流。 |
| virtual [get_Encoding](./get_encoding/)() | 返回当前使用的编码。 |
| virtual [get_FormatProvider](./get_formatprovider/)() const | 返回当前使用的 [IFormatProvider](../../system/iformatprovider/) 对象。 |
| [get_FormatProvider](./get_formatprovider/)() | 返回当前使用的 [IFormatProvider](../../system/iformatprovider/) 对象。 |
| virtual [get_NewLine](./get_newline/)() const | 返回行终止符字符串。 |
| [get_NewLine](./get_newline/)() | 返回行终止符字符串。 |
| virtual [set_NewLine](./set_newline/)(const System::String\&) | 设置行终止符字符串。 |
| virtual [Write](./write/)(const SharedPtr\<Object\>\&) | 将指定对象的字符串表示写入流。 |
| virtual [Write](./write/)(bool) | 将指定布尔值的字符串表示写入流。 |
| virtual [Write](./write/)(char_t) | 将指定字符写入流。 |
| virtual [Write](./write/)(Decimal) | 将指定的 [Decimal](../../system/decimal/) 对象的字符串表示写入流。 |
| virtual [Write](./write/)(double) | 将指定的双精度浮点值的字符串表示写入流。 |
| virtual [Write](./write/)(int) | 将指定的 32 位整数值的字符串表示写入流。 |
| virtual [Write](./write/)(int64_t) | 将指定的 64 位整数值的字符串表示写入流。 |
| virtual [Write](./write/)(float) | 将指定的单精度浮点值的字符串表示写入流。 |
| virtual [Write](./write/)(const String\&) | 将指定的字符串写入流。 |
| virtual [Write](./write/)(uint32_t) | 将指定的无符号 32 位整数值的字符串表示写入流。 |
| virtual [Write](./write/)(uint64_t) | 将指定的无符号 64 位整数值的字符串表示写入流。 |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&) | 将指定数组中的所有字符写入流。 |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | 将指定字符数组中指定的 UTF-16 子范围字符写入流。 |
| virtual [Write](./write/)(const char_t *) | 将指定的 C 字符串写入流。 |
| virtual [Write](./write/)(const TypeInfo\&) | 将指定的 [TypeInfo](../../system/typeinfo/) 对象的字符串表示写入流。 |
| [Write](./write/)(const String\&, const TArgs\&...) | 将指定的值按照指定的格式化后写入流。 |
| virtual [WriteLine](./writeline/)() | 将换行终止符写入流。 |
| virtual [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) | 将指定对象的字符串表示以及换行终止符写入流。 |
| virtual [WriteLine](./writeline/)(bool) | 将指定布尔值的字符串表示以及换行终止符写入流。 |
| virtual [WriteLine](./writeline/)(char_t) | 将指定字符以及换行终止符写入流。 |
| virtual [WriteLine](./writeline/)(Decimal) | 将指定的 [Decimal](../../system/decimal/) 对象的字符串表示以及换行终止符写入流。 |
| virtual [WriteLine](./writeline/)(double) | 将指定的双精度浮点值的字符串表示以及换行终止符写入流。 |
| virtual [WriteLine](./writeline/)(int) | 将指定的 32 位整数值的字符串表示以及换行终止符写入流。 |
| virtual [WriteLine](./writeline/)(int64_t) | 将指定的 64 位整数值的字符串表示以及换行终止符写入流。 |
| virtual [WriteLine](./writeline/)(float) | 将指定的单精度浮点值的字符串表示以及换行终止符写入流。 |
| virtual [WriteLine](./writeline/)(const String\&) | 将指定的字符串以及换行终止符写入流。 |
| virtual [WriteLine](./writeline/)(uint32_t) | 将指定的无符号 32 位整数值的字符串表示以及换行终止符写入流。 |
| virtual [WriteLine](./writeline/)(uint64_t) | 将指定的无符号 64 位整数值的字符串表示以及换行终止符写入流。 |
| virtual [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) | 将指定数组中的所有字符写入流，并在其后附加换行终止字符。 |
| virtual [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | 将指定字符数组中指定的 UTF-16 子范围字符写入流，并在其后附加换行终止字符。 |
| virtual [WriteLine](./writeline/)(const char_t *) | 将指定的 C 字符串写入流，并在其后附加换行终止字符。 |
| virtual [WriteLine](./writeline/)(const TypeInfo\&) | 将指定的 [TypeInfo](../../system/typeinfo/) 对象的字符串表示写入流，并在其后附加换行终止字符。 |
| [WriteLine](./writeline/)(const String\&, const TArgs\&...) | 将指定的值按指定格式格式化后写入流，并在其后附加字符。 |
| virtual [~TextWriter](./~textwriter/)() | 析构函数。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类的共享指针别名。 |
## 另见

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
