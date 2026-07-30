---
title: "System::IO::BinaryWriter 类"
linktitle: "BinaryWriter"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::BinaryWriter 类。表示一个将原始类型值写入字节流的写入器。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 900
url: /zh/cpp/system.io/binarywriter/
---
## BinaryWriter class


表示一个将原始类型值写入字节流的写入器。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class BinaryWriter : public System::IDisposable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [BinaryWriter](./binarywriter/)(const StreamPtr\&, const EncodingPtr\&, bool) | 构造一个 [BinaryWriter](./) 类的实例，该实例使用指定的编码将数据写入指定的流。 |
| [Close](./close/)() | 关闭当前的 [BinaryWriter](./) 对象及其底层输出流。 |
| [Dispose](./dispose/)() override | 释放当前对象使用的所有资源并关闭底层流。 |
| [Flush](./flush/)() | 刷新输出流。 |
| [get_BaseStream](./get_basestream/)() | 返回输出流。 |
| [Seek](./seek/)(int, System::IO::SeekOrigin) | 设置当前对象所表示的流的位置。 |
| virtual [Write](./write/)(uint8_t) | 将指定的无符号 8 位整数值写入输出流。 |
| virtual [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int, int) | 将指定字节数组中指定子范围的字节写入输出流。 |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&, int, int) | 将指定字符数组中指定子范围的 UTF-16 字符写入输出流。 |
| virtual [Write](./write/)(bool) | 如果 **value** 为 'true'，则写入值为 0 的单字节；如果 **value** 为 'false'，则写入值为 1 的单字节到输出流。 |
| virtual [Write](./write/)(char16_t) | 将指定的 16 位宽字符值写入输出流。 |
| virtual [Write](./write/)(int16_t) | 将指定的 16 位整数值写入输出流。 |
| virtual [Write](./write/)(int) | 将指定的 32 位整数值写入输出流。 |
| virtual [Write](./write/)(int64_t) | 将指定的 64 位整数值写入输出流。 |
| virtual [Write](./write/)(uint16_t) | 将指定的无符号 16 位整数值写入输出流。 |
| virtual [Write](./write/)(uint32_t) | 将指定的无符号 32 位整数值写入输出流。 |
| virtual [Write](./write/)(uint64_t) | 将指定的无符号 64 位整数值写入输出流。 |
| virtual [Write](./write/)(float) | 将指定的单精度浮点值写入输出流。 |
| virtual [Write](./write/)(double) | 将指定的双精度浮点值写入输出流。 |
| virtual [Write](./write/)(const Decimal\&) | 将指定的 [Decimal](../../system/decimal/) 值的字节表示写入输出流。 |
| virtual [Write](./write/)(const String\&) | 将当前编码下的长度前缀字符串写入输出流。 |
| virtual [Write](./write/)(const char_t *) | 将当前编码下的长度前缀字符串写入输出流。 |
| [~BinaryWriter](./~binarywriter/)() | 析构函数。 |
## 另见

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
