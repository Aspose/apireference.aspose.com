---
title: "System::ConsoleOutput 类"
linktitle: "ConsoleOutput"
second_title: "Aspose.Page 适用于 C++"
description: "System::ConsoleOutput 类。表示标准输出流。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 1500
url: /zh/cpp/system/consoleoutput/
---
## ConsoleOutput class


表示标准输出流。此类的对象应仅使用 [System::MakeObject()](../makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class ConsoleOutput : public System::IO::TextWriter
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | 始终返回 ASCII 编码。 |
| [Write](./write/)(bool) override | 将指定 bool 值的字符串表示输出到当前对象表示的输出流。 |
| [Write](./write/)(const SharedPtr\<Object\>\&) override | 将指定对象的字符串表示输出到当前对象表示的输出流。 |
| [Write](./write/)(char_t) override | 将指定字符值输出到当前对象表示的输出流。 |
| [Write](./write/)(Decimal) override | 将 [Decimal](../decimal/) 值的字符串表示输出到当前对象表示的输出流。 |
| [Write](./write/)(double) override | 将双精度浮点值的字符串表示输出到当前对象表示的输出流。 |
| [Write](./write/)(int32_t) override | 将 32 位整数值的字符串表示输出到当前对象表示的输出流。 |
| [Write](./write/)(int64_t) override | 将 64 位整数值的字符串表示输出到当前对象表示的输出流。 |
| [Write](./write/)(float) override | 将单精度浮点值的字符串表示输出到当前对象表示的输出流。 |
| [Write](./write/)(const String\&) override | 将指定的字符串对象输出到当前对象表示的输出流。 |
| [Write](./write/)(uint32_t) override | 将无符号 32 位整数值的字符串表示输出到当前对象表示的输出流。 |
| [Write](./write/)(uint64_t) override | 将无符号 64 位整数值的字符串表示输出到当前对象表示的输出流。 |
| [Write](./write/)(const ArrayPtr\<char_t\>\&) override | 将指定字符数组的字符串表示输出到当前对象表示的输出流。 |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | 将指定字符数组的一段值的字符串表示输出到当前对象表示的输出流。 |
| [Write](./write/)(const char_t *) override | 将指定的 C 字符串输出到当前对象表示的输出流。 |
| [Write](./write/)(const TypeInfo\&) override | 将指定的 [TypeInfo](../typeinfo/) 对象的字符串表示输出到当前对象表示的输出流。 |
| [Write](./write/)(const char *) |  |
| [WriteLine](./writeline/)() override | 将当前行终止符输出到当前对象表示的输出流。 |
| [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) override | 将指定对象的字符串表示后跟当前行终止符输出到当前对象表示的输出流。 |
| [WriteLine](./writeline/)(bool) override | 将指定 bool 值的字符串表示后跟当前行终止符输出到当前对象表示的输出流。 |
| [WriteLine](./writeline/)(char_t) override | 将指定字符值后跟当前行终止符输出到当前对象表示的输出流。 |
| [WriteLine](./writeline/)(Decimal) override | 将 [Decimal](../decimal/) 值的字符串表示后跟当前行终止符输出到当前对象表示的输出流。 |
| [WriteLine](./writeline/)(double) override | 将双精度浮点值的字符串表示后跟当前行终止符输出到当前对象表示的输出流。 |
| [WriteLine](./writeline/)(int) override | 将 32 位整数值的字符串表示后跟当前行终止符输出到当前对象表示的输出流。 |
| [WriteLine](./writeline/)(int64_t) override | 将 64 位整数值的字符串表示后跟当前行终止符输出到当前对象表示的输出流。 |
| [WriteLine](./writeline/)(float) override | 输出单精度浮点值的字符串表示形式，后跟当前行终止符，写入由当前对象表示的输出流。 |
| [WriteLine](./writeline/)(const String\&) override | 输出指定的字符串对象，后跟当前行终止符，写入由当前对象表示的输出流。 |
| [WriteLine](./writeline/)(uint32_t) override | 输出无符号 32 位整数值的字符串表示形式，后跟当前行终止符，写入由当前对象表示的输出流。 |
| [WriteLine](./writeline/)(uint64_t) override | 输出无符号 64 位整数值的字符串表示形式，后跟当前行终止符，写入由当前对象表示的输出流。 |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) override | 输出指定字符数组的字符串表示形式，后跟当前行终止符，写入由当前对象表示的输出流。 |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | 输出指定字符数组的一段值的字符串表示形式，后跟当前行终止符，写入由当前对象表示的输出流。 |
| [WriteLine](./writeline/)(const char_t *) override | 输出指定的 C 字符串，后跟当前行终止符，写入由当前对象表示的输出流。 |
| [WriteLine](./writeline/)(const TypeInfo\&) override | 输出指定的 [TypeInfo](../typeinfo/) 对象的字符串表示形式，后跟当前行终止符，写入由当前对象表示的输出流。 |
| [WriteLine](./writeline/)(const char *) |  |
## 另见

* Class [TextWriter](../../system.io/textwriter/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
