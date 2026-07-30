---
title: "System::Console 类"
linktitle: "Console"
second_title: "Aspose.Font 适用于 C++"
description: "System::Console 类。提供向标准输出流输出数据的方法。这是一个没有实例服务的静态类型。 在 C++ 中不应以任何方式创建其实例。"
type: docs
weight: 1400
url: /zh/cpp/system/console/
---
## Console class


提供向标准输出流输出数据的方法。这是一个没有实例服务的静态类型。任何情况下都不应创建其实例。

```cpp
class Console
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [Beep](./beep/)() | 未实现。 |
| static [get_Error](./get_error/)() | 返回指向表示标准错误流的对象的共享指针。 |
| static [get_In](./get_in/)() | 返回指向表示标准输入流的对象的共享指针。 |
| static [get_Out](./get_out/)() | 返回指向表示标准输出流的对象的共享指针。 |
| static [Mute](./mute/)(bool) | 静音或取消静音标准输出流。 |
| static [ReadKey](./readkey/)() | 未实现。 |
| static [SetError](./seterror/)(const SharedPtr\<System::IO::TextWriter\>\&) | 将指定对象分配给类的 Error 属性。 |
| static [SetIn](./setin/)(const SharedPtr\<System::IO::TextReader\>\&) | 将 In 属性设置为指定的 TextReader 对象。 |
| static [SetOut](./setout/)(const SharedPtr\<System::IO::TextWriter\>\&) | 将指定对象分配给类的 Out 属性。 |
| static [Write](./write/)(const SharedPtr\<T\>\&) | 将指定对象的字符串表示输出到标准输出流。 |
| static [Write](./write/)(bool) | 将 bool 值的字符串表示输出到标准输出流。 |
| static [Write](./write/)(char_t) | 将指定的字符值输出到标准输出流。 |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&) | 将指定字符数组的字符串表示形式输出到标准输出流。 |
| static [Write](./write/)(const Decimal\&) | 将 [Decimal](../decimal/) 值的字符串表示形式输出到标准输出流。 |
| static [Write](./write/)(double) | 将双精度浮点值的字符串表示形式输出到标准输出流。 |
| static [Write](./write/)(float) | 将单精度浮点值的字符串表示形式输出到标准输出流。 |
| static [Write](./write/)(int32_t) | 将 32 位整数值的字符串表示形式输出到标准输出流。 |
| static [Write](./write/)(int64_t) | 将 64 位整数值的字符串表示形式输出到标准输出流。 |
| static [Write](./write/)(const String\&) | 将指定的字符串对象输出到标准输出流。 |
| static [Write](./write/)(const char_t *) | 将指定的 C 字符串输出到标准输出流。 |
| static [Write](./write/)(const TypeInfo\&) | 将 [TypeInfo](../typeinfo/) 值的字符串表示形式输出到标准输出流。 |
| static [Write](./write/)(uint32_t) | 将无符号 32 位整数值的字符串表示形式输出到标准输出流。 |
| static [Write](./write/)(uint64_t) | 将无符号 64 位整数值的字符串表示形式输出到标准输出流。 |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | 将指定字符数组的指定范围的字符串表示形式输出到标准输出流。 |
| static [Write](./write/)(const String\&, Args\&&...) | 将指定参数按指定格式格式化后的字符串表示形式输出到标准输出流。 |
| static [Write](./write/)(const char *) |  |
| static [WriteLine](./writeline/)() | 将当前行终止符输出到标准输出流。 |
| static [WriteLine](./writeline/)(const SharedPtr\<T\>\&) | 将指定对象的字符串表示形式后跟当前行终止符输出到标准输出流。 |
| static [WriteLine](./writeline/)(bool) | 将布尔值的字符串表示形式后跟当前行终止符输出到标准输出流。 |
| static [WriteLine](./writeline/)(char_t) | 将指定的字符值后跟当前行终止符输出到标准输出流。 |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) | 将指定字符数组的字符串表示形式后跟当前行终止符输出到标准输出流。 |
| static [WriteLine](./writeline/)(const Decimal\&) | 将 [Decimal](../decimal/) 值的字符串表示形式后跟当前行终止符输出到标准输出流。 |
| static [WriteLine](./writeline/)(double) | 将双精度浮点值的字符串表示形式后跟当前行终止符输出到标准输出流。 |
| static [WriteLine](./writeline/)(float) | 将单精度浮点值的字符串表示形式后跟当前行终止符输出到标准输出流。 |
| static [WriteLine](./writeline/)(int32_t) | 将 32 位整数值的字符串表示形式后跟当前行终止符输出到标准输出流。 |
| static [WriteLine](./writeline/)(int64_t) | 将 64 位整数值的字符串表示形式后跟当前行终止符输出到标准输出流。 |
| static [WriteLine](./writeline/)(const String\&) | 将指定的字符串对象后跟当前行终止符输出到标准输出流。 |
| static [WriteLine](./writeline/)(const char_t *) | 将指定的 c-string 输出到标准输出流，并在其后附加当前的行终止符。 |
| static [WriteLine](./writeline/)(const TypeInfo\&) | 将 [TypeInfo](../typeinfo/) 值的字符串表示输出到标准输出流，并在其后附加当前的行终止符。 |
| static [WriteLine](./writeline/)(uint32_t) | 将无符号 32 位整数值的字符串表示输出到标准输出流，并在其后附加当前的行终止符。 |
| static [WriteLine](./writeline/)(uint64_t) | 将无符号 64 位整数值的字符串表示输出到标准输出流，并在其后附加当前的行终止符。 |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int, int) | 将指定字符数组的指定范围的字符串表示输出到标准输出流，并在其后附加当前的行终止符。 |
| static [WriteLine](./writeline/)(const Exception\&) | 将指定的 [Exception](../exception/) 对象的字符串表示输出到标准输出流，并在其后附加当前的行终止符。 |
| static [WriteLine](./writeline/)(const String\&, Args\&&...) | 将指定参数按照指定格式格式化后的字符串表示输出到标准输出流，并在其后附加当前的行终止符。 |
| static [WriteLine](./writeline/)(const char *) |  |
## 备注



```cpp
#include "system/console.h"
#include <array>

int main()
{
  using namespace System;

  // 打印 hello 消息。
  Console::WriteLine(u"Hello, world!");

  // 创建 'std::array' 类的实例。
  std::array<int, 5> arr = {1, 2, 3, 4, 5};

  // 打印数组的元素。
  for (auto el: arr)
  {
    Console::Write(u"{0} ", el);
  }
  Console::WriteLine();

  return 0;
}
/*
This code example produces the following output:
Hello, world!
1 2 3 4 5
*/
```

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
