---
title: "System::IO::StreamReader 类"
linktitle: "StreamReader"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::StreamReader 类。表示一个从字节流读取字符的读取器。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 2200
url: /zh/cpp/system.io/streamreader/
---
## StreamReader class


表示一个从字节流读取字符的读取器。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class StreamReader : public System::IO::TextReader
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Close](./close/)() override | 关闭当前流和底层流。 |
| [Dispose](./dispose/)() override | 释放当前对象使用的所有资源并关闭底层流。 |
| [get_BaseStream](./get_basestream/)() const | 返回一个共享指针，指向表示底层流的对象。 |
| [get_CurrentEncoding](./get_currentencoding/)() | 返回当前使用的编码。 |
| [get_EndOfStream](./get_endofstream/)() | 返回一个值，指示是否已到达流的末尾。 |
| [Peek](./peek/)() override | 从流中读取单个字符且不更改流的读取指针。 |
| [Read](./read/)() override | 从流中读取单个字符。 |
| [Read](./read/)(ArrayPtr\<char_t\>, int, int) override | 从流中读取指定数量的字符，将其转换为 UTF-16 编码，并将生成的 UTF-16 字符写入指定字符数组，从指定位置开始。 |
| [ReadLine](./readline/)() override | 从流中读取字符，直到当前行结束。 |
| [ReadToEnd](./readtoend/)() override | 从流中读取字符，直到流结束。 |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&) | 构造一个 [StreamReader](./) 实例，该对象使用 UTF-8 编码并使用默认大小为 1024 字节的缓冲区，从指定的底层流读取字符。 |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, bool) | 构造一个 [StreamReader](./) 实例，该对象使用 UTF-8 编码并使用默认大小为 1024 字节的缓冲区，从指定的底层流读取字符。一个参数指定是否应启用字节顺序标记检测。 |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&) | 构造一个 [StreamReader](./) 实例，该对象使用指定的编码并使用默认大小为 1024 字节的缓冲区，从指定的底层流读取字符。 |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool) | 构造一个 [StreamReader](./) 实例，该对象使用指定的编码并使用默认大小为 1024 字节的缓冲区，从指定的底层流读取字符。一个参数指定是否应启用字节顺序标记检测。 |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool, int) | 构造一个 [StreamReader](./) 实例，该对象使用指定的编码并使用指定大小的缓冲区，从指定的底层流读取字符。一个参数指定是否应启用字节顺序标记检测。 |
| [StreamReader](./streamreader/)(const System::String\&) | 构造一个 [StreamReader](./) 实例，该对象使用 UTF-8 编码并使用默认大小为 4096 字节的缓冲区，从指定的文件读取字符。 |
| [StreamReader](./streamreader/)(const System::String\&, bool) | 构造一个 [StreamReader](./) 实例，该对象使用 UTF-8 编码并使用默认大小为 4096 字节的缓冲区，从指定的文件读取字符。一个参数指定是否应启用字节顺序标记检测。 |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&) | 构造一个 [StreamReader](./) 实例，该对象使用指定的编码并使用默认大小为 4096 字节的缓冲区，从指定的文件读取字符。 |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&, bool) | 构造一个 [StreamReader](./) 实例，该对象使用指定的编码并使用默认大小为 4096 字节的缓冲区，从指定的底层流读取字符。一个参数指定是否应启用字节顺序标记检测。 |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&, bool, int) | 构造一个 [StreamReader](./) 实例，该对象使用指定的编码并使用指定大小的缓冲区，从指定的文件读取字符。一个参数指定是否应启用字节顺序标记检测。 |
| [~StreamReader](./~streamreader/)() | 析构函数。 |
## 另见

* Class [TextReader](../textreader/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
