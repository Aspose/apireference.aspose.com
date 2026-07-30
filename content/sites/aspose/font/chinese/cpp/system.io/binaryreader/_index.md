---
title: "System::IO::BinaryReader 类"
linktitle: "BinaryReader"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::BinaryReader 类。表示一种读取器，可将原始数据类型以特定编码的二进制数据读取。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 800
url: /zh/cpp/system.io/binaryreader/
---
## BinaryReader class


表示一种读取器，可将原始数据类型以特定编码的二进制数据读取。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class BinaryReader : public System::IDisposable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&) | 构造一个 [BinaryReader](./) 类的实例，该实例使用 UTF-8 编码从指定的流读取数据。 |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&) | 构造一个 [BinaryReader](./) 类的实例，该实例使用指定的编码从指定的流读取数据。 |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&, bool) | 构造一个 [BinaryReader](./) 类的实例，该实例使用指定的编码从指定的流读取数据。 |
| virtual [Close](./close/)() | 关闭当前的 [BinaryReader](./) 对象及其底层输入流。 |
| [Dispose](./dispose/)() override | 释放当前对象使用的所有资源并关闭底层流。 |
| virtual [get_BaseStream](./get_basestream/)() | 返回输入流。 |
| virtual [PeekChar](./peekchar/)() | 从输入流读取单个字符且不移动流的读取光标。 |
| virtual [Read](./read/)() | 从输入流读取单个字符。 |
| virtual [Read](./read/)(ArrayPtr\<uint8_t\>, int, int) | 从输入流读取指定数量的字节并将其写入指定的字节数组。 |
| virtual [Read](./read/)(ArrayPtr\<char_t\>, int, int) | 从输入流读取指定数量的字符，将其转换为 UTF-16 编码，并将生成的 UTF-16 字符写入指定字符数组的指定位置开始处。 |
| virtual [ReadBoolean](./readboolean/)() | 从输入流读取单个字节并返回其布尔表示。 |
| virtual [ReadByte](./readbyte/)() | 从输入流读取单个字节。 |
| virtual [ReadBytes](./readbytes/)(int) | 从输入流读取指定数量的字节。 |
| virtual [ReadChar](./readchar/)() | 从输入流读取单个字符。 |
| virtual [ReadChars](./readchars/)(int) | 从输入流读取指定数量的字符并以 UTF-16 编码返回它们。 |
| virtual [ReadDecimal](./readdecimal/)() | 未实现。 |
| virtual [ReadDouble](./readdouble/)() | 从输入流读取 8 字节并将其作为双精度浮点值返回。 |
| virtual [ReadInt16](./readint16/)() | 从输入流读取 2 字节并将其作为 16 位整数值返回。 |
| virtual [ReadInt32](./readint32/)() | 从输入流读取 4 字节并将其作为 32 位整数值返回。 |
| virtual [ReadInt64](./readint64/)() | 从输入流读取 8 字节并将其作为 64 位整数值返回。 |
| virtual [ReadSByte](./readsbyte/)() | 从输入流读取单个字节并将其作为有符号 8 位整数值返回。 |
| virtual [ReadSingle](./readsingle/)() | 从输入流读取 4 字节并将其作为单精度浮点值返回。 |
| virtual [ReadString](./readstring/)() | 从当前流读取一个字符串。该字符串前缀为长度，以每次七位的整数方式编码。 |
| virtual [ReadUInt16](./readuint16/)() | 从输入流读取 2 字节，并将其作为无符号 16 位整数值返回。 |
| virtual [ReadUInt32](./readuint32/)() | 从输入流读取 4 字节，并将其作为无符号 32 位整数值返回。 |
| virtual [ReadUInt64](./readuint64/)() | 从输入流读取 8 字节，并将其作为无符号 64 位整数值返回。 |
| virtual [~BinaryReader](./~binaryreader/)() | 析构函数。 |
## 另见

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
