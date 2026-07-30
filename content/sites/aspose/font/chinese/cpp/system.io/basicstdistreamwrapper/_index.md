---
title: "System::IO::BasicSTDIStreamWrapper 类"
linktitle: "BasicSTDIStreamWrapper"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::BasicSTDIStreamWrapper 类。表示一个类似 System.IO.Stream 的包装器，用于 std::basic_istream 及其派生对象。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 200
url: /zh/cpp/system.io/basicstdistreamwrapper/
---
## BasicSTDIStreamWrapper class


表示一个类似 [System.IO.Stream](../stream/) 的包装器，用于 std::basic_istream 及其派生对象。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
template<typename T,typename>class BasicSTDIStreamWrapper : public virtual System::IO::STDIOStreamWrapperBase<T>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [BasicSTDIStreamWrapper](./basicstdistreamwrapper/)(std::basic_istream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) | 构造一个新的 [BasicSTDIStreamWrapper](./) 实例。 |
| [BasicSTDIStreamWrapper](./basicstdistreamwrapper/)(const BasicSTDIStreamWrapper\&) | 拷贝构造函数。已删除。 |
| [Flush](./flush/)() override | 清除此流的缓冲区并将所有缓冲数据写入底层存储。不支持！ |
| [operator=](./operator=/)(const BasicSTDIStreamWrapper\&) | 拷贝赋值运算符。已删除。 |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 如果包装模式是二进制，则从流中读取指定数量的字节；否则读取指定数量的字符并将其转换为 uint8_t 类型。将读取的结果写入指定的字节数组。 |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 从流中读取指定数量的字节并将其写入指定的字节数组。 |
| [ReadByte](./readbyte/)() override | 如果包装模式是二进制，则从上一次解码的字符存储中读取单个字节；否则从流中读取单个字符并将其转换为 uint8_t 类型。 |
| [SetLength](./setlength/)(int64_t) override | 设置当前对象所表示的流的长度。不支持！ |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 如果包装模式是二进制，则将指定字节数组中指定的字节子范围写入流；否则将指定字节数组中指定的字节子范围转换为 [char_type](./char_type/) 类型，然后将结果写入流。不支持！ |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 将指定字节数组中的指定子范围字节写入流。 |
| [WriteByte](./writebyte/)(uint8_t) override | 如果包装模式是二进制，则将指定的无符号 8 位整数值写入流；否则将其转换为 [char_type](./char_type/) 类型，然后将结果写入流。不支持！ |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Null](../stream/null/) | 一个没有底层存储的流。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | RTTI 信息。 |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## 另见

* Class [STDIOStreamWrapperBase](../stdiostreamwrapperbase/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
