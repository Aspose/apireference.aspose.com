---
title: "System::IO::StreamWriter 类"
linktitle: "StreamWriter"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::StreamWriter 类。表示一个将字符写入字节流的写入器。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 2300
url: /zh/cpp/system.io/streamwriter/
---
## StreamWriter class


表示一个将字符写入字节流的写入器。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class StreamWriter : public System::IO::TextWriter
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Close](./close/)() override | 关闭流并释放获取的资源。 |
| [Dispose](./dispose/)() override | 释放当前对象使用的所有资源并关闭底层流。 |
| [Flush](./flush/)() override | 将缓冲区的内容刷新到底层流，然后刷新底层流。 |
| [get_AutoFlush](./get_autoflush/)() const | 返回一个值，指示每次调用方法 [StreamWriter::Write](./write/) 时，[StreamWriter](./) 是否会将数据刷新到底层流。 |
| [get_BaseStream](./get_basestream/)() const | 返回一个共享指针，指向表示底层流的对象。 |
| [get_Encoding](./get_encoding/)() override | 返回当前使用的编码。 |
| [set_AutoFlush](./set_autoflush/)(bool) | 返回一个值，指定每次调用方法 [StreamWriter::Write](./write/) 时，是否应由 [StreamWriter](./) 将数据刷新到底层流。 |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&) | 构造一个 [StreamWriter](./) 实例，该实例使用 UTF-8 编码并使用默认大小为 1024 字节的缓冲区，将字符写入指定的底层流。 |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&) | 构造一个 [StreamWriter](./) 实例，该实例使用指定的编码并使用默认大小为 1024 字节的缓冲区，将字符写入指定的底层流。 |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) | 构造一个 [StreamWriter](./) 实例，该实例使用指定的编码和指定大小的缓冲区，将字符写入指定的底层流。一个参数指定在处置 [StreamWriter](./) 对象时是否应关闭底层流。 |
| [StreamWriter](./streamwriter/)(const String\&) | 构造一个 [StreamWriter](./) 实例，该实例使用 UTF-8 编码并使用默认大小为 1024 字节的缓冲区，将字符写入指定的文件。 |
| [StreamWriter](./streamwriter/)(const String\&, bool, const EncodingPtr\&) | 构造一个 [StreamWriter](./) 实例，该实例使用指定的编码并使用默认大小为 1024 字节的缓冲区，将字符写入指定的文件。一个参数指定是将数据追加到文件还是覆盖文件。 |
| [StreamWriter](./streamwriter/)(const String\&, bool, const EncodingPtr\&, int) | 构造一个 [StreamWriter](./) 实例，该实例使用指定的编码和缓冲区大小，将字符写入指定的文件。一个参数指定是将数据追加到文件还是覆盖文件。 |
| [Write](./write/)(char_t) override | 将指定字符写入流。 |
| [Write](./write/)(const String\&) override | 将指定的字符串写入流。 |
| [Write](./write/)(const SharedPtr\<Object\>\&) override | 将指定对象的字符串表示写入流。 |
| [Write](./write/)(const ArrayPtr\<char_t\>\&) override | 将指定数组中的所有字符写入流。 |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | 将指定字符数组中指定的 UTF-16 子范围字符写入流。 |
| [Write](./write/)(const char_t *) override | 将指定的 C 字符串写入流。 |
| [Write](./write/)(const System::SharedPtr\<T\>\&) | 将指定对象的字符串表示写入流。 |
| [WriteLine](./writeline/)() override | 将换行终止符写入流。 |
| [WriteLine](./writeline/)(const String\&) override | 将指定的字符串以及换行终止符写入流。 |
| [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) override | 将指定对象的字符串表示以及换行终止符写入流。 |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) override | 将指定数组中的所有字符写入流，并在其后附加换行终止字符。 |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | 将指定字符数组中指定的 UTF-16 子范围字符写入流，并在其后附加换行终止字符。 |
| [WriteLine](./writeline/)(const char_t *) override | 将指定的 C 字符串写入流，并在其后附加换行终止字符。 |
| [WriteLine](./writeline/)(const System::SharedPtr\<T\>\&) | 将指定对象的字符串表示以及换行终止符写入流。 |
| [~StreamWriter](./~streamwriter/)() | 析构函数。 |
## 另见

* Class [TextWriter](../textwriter/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
