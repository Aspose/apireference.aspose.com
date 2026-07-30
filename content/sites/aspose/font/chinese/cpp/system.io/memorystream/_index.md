---
title: "System::IO::MemoryStream 类"
linktitle: "MemoryStream"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::MemoryStream 类。表示一个从内存读取并写入内存的流。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给函数（C++）。"
type: docs
weight: 1800
url: /zh/cpp/system.io/memorystream/
---
## MemoryStream class


表示一个从内存读取并写入内存的流。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class MemoryStream : public System::IO::Stream
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Close](./close/)() override | 关闭流。 |
| [Flush](./flush/)() override | 不执行任何操作。 |
| [get_CanRead](./get_canread/)() const override | 确定流是否可读取。 |
| [get_CanSeek](./get_canseek/)() const override | 确定流是否支持定位。 |
| [get_CanWrite](./get_canwrite/)() const override | 确定流是否可写。 |
| [get_Capacity](./get_capacity/)() | 返回底层内存缓冲区的当前容量。 |
| [get_Length](./get_length/)() const override | 返回流的字节长度。 |
| [get_Position](./get_position/)() const override | 返回流的当前位置。 |
| virtual [GetBuffer](./getbuffer/)() | 返回指向底层缓冲区的指针。 |
| [MemoryStream](./memorystream/)() | 构造一个新的 [MemoryStream](./) 类实例，初始容量为 0。 |
| [MemoryStream](./memorystream/)(int) | 构造一个新的 [MemoryStream](./) 类实例，该实例表示基于指定大小的内存缓冲区的流。 |
| [MemoryStream](./memorystream/)(const ArrayPtr\<uint8_t\>\&, bool) | 构造一个新的 [MemoryStream](./) 类实例，该实例表示连接到指定内存缓冲区的内存流。参数用于指定流是否可写。 |
| [MemoryStream](./memorystream/)(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) | 构造一个新的 [MemoryStream](./) 类实例，该实例表示一个内存流，连接到从指定索引开始并包含指定数量元素的指定内存缓冲区的片段。参数 指定流是否可写以及是否可以调用 GetBytes() 方法。 |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 从流中读取指定数量的字节并将其写入指定的字节数组。 |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 从流中读取指定数量的字节并将其写入指定的字节数组。 |
| [ReadByte](./readbyte/)() override | 从流中读取单个字节并返回等同于读取字节值的 32 位整数。 |
| [Seek](./seek/)(int64_t, SeekOrigin) override | 设置当前对象所表示的流的位置。 |
| [set_Capacity](./set_capacity/)(int) | 设置底层内存缓冲区的容量。 |
| [set_Position](./set_position/)(int64_t) override | 设置流的位置。 |
| [SetLength](./setlength/)(int64_t) override | 设置当前对象所表示的流的长度。 |
| virtual [ToArray](./toarray/)() | 返回底层内存缓冲区的副本，作为字节数组。 |
| [TryGetBuffer](./trygetbuffer/)(ArraySegment\<uint8_t\>\&) | 返回用于创建此流的无符号字节数组。 |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 将指定字节数组中的指定子范围字节写入流。 |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 将指定字节数组中的指定子范围字节写入流。 |
| [WriteByte](./writebyte/)(uint8_t) override | 将指定的无符号 8 位整数值写入流。 |
| virtual [WriteTo](./writeto/)(SharedPtr\<Stream\>) | 将底层缓冲区的内容写入指定的流。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Null](../stream/null/) | 一个没有底层存储的流。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 一个指向自身的共享指针的别名。 |
## 另见

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
