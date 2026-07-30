---
title: "System::IO::TextReader 类"
linktitle: "TextReader"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::TextReader 类。一个用于表示从不同来源读取字符序列的读取器的基类。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 2600
url: /zh/cpp/system.io/textreader/
---
## TextReader class


用于表示从不同来源读取字符序列的读取器的基类。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class TextReader : public System::IDisposable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Close](./close/)() | 关闭流并释放获取的资源。 |
| [Dispose](./dispose/)() override | 释放当前对象使用的所有资源并关闭底层流。 |
| virtual [Peek](./peek/)() | 从流中读取单个字符且不更改流的读取指针。 |
| virtual [Read](./read/)() | 从流中读取单个字符。 |
| virtual [Read](./read/)(ArrayPtr\<char_t\>, int, int) | 从流中读取指定数量的字符，并将它们写入指定字符数组，从指定位置开始。 |
| virtual [ReadBlock](./readblock/)(ArrayPtr\<char_t\>, int, int) | 从当前文本读取器读取指定的最大字符数，并将数据写入缓冲区，从指定索引开始。 |
| virtual [ReadLine](./readline/)() | 从流中读取字符，直到当前行结束。 |
| virtual [ReadToEnd](./readtoend/)() | 从流中读取字符，直到流结束。 |
## 另见

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
