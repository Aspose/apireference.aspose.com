---
title: "System::IO::StringReader class"
linktitle: "StringReader"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::StringReader class。表示一个从字符串读取字符的读取器。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 2400
url: /zh/cpp/system.io/stringreader/
---
## StringReader class


表示一个从字符串读取字符的读取器。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class StringReader : public System::IO::TextReader
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Close](./close/)() override | 关闭流。 |
| [Dispose](./dispose/)() override | 不执行任何操作。 |
| [Dispose](./dispose/)(bool) override | 不执行任何操作。 |
| [Peek](./peek/)() override | 从流中读取单个字符而不更改流的位置。 |
| [Read](./read/)() override | 从流中读取单个字符。 |
| [Read](./read/)(ArrayPtr\<char_t\>, int, int) override | 从流中读取指定数量的字符到指定的字符数组中，起始位置为指定的索引。 |
| [ReadLine](./readline/)() override | 从流中读取字符，直到当前行结束。 |
| [ReadToEnd](./readtoend/)() override | 从流中读取字符，直到流结束。 |
| [StringReader](./stringreader/)(const String\&) | 构造一个新的 [StringReader](./) 类实例，该实例从指定的字符串读取字符。 |
## 另见

* Class [TextReader](../textreader/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
