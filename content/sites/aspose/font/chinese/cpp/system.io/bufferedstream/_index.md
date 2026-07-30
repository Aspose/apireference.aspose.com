---
title: "System::IO::BufferedStream 类"
linktitle: "BufferedStream"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::BufferedStream 类。在另一个流之上添加缓冲层。该类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1000
url: /zh/cpp/system.io/bufferedstream/
---
## BufferedStream class


在另一个流之上添加缓冲层。该类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class BufferedStream : public System::IO::Stream
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [BufferedStream](./bufferedstream/)(const SharedPtr\<Stream\>\&) | 构造一个包装指定流并使用 4096 字节长缓冲区的 [BufferedStream](./) 对象。 |
| [BufferedStream](./bufferedstream/)(const SharedPtr\<Stream\>\&, int) | 构造一个包装指定流并使用指定大小缓冲区的 [BufferedStream](./) 对象。 |
| [Flush](./flush/)() override | 将缓冲区的内容写入底层流。 |
| [get_CanRead](./get_canread/)() const override | 确定流是否可读取。 |
| [get_CanSeek](./get_canseek/)() const override | 确定流是否支持定位。 |
| [get_CanWrite](./get_canwrite/)() const override | 确定流是否可写。 |
| [get_Length](./get_length/)() const override | 返回流的长度。 |
| [get_Position](./get_position/)() const override | 返回流的当前位置。 |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 从底层流读取指定数量的字节并将其写入指定的字节数组。 |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 从底层流读取指定数量的字节并将其写入指定的字节数组。 |
| [ReadByte](./readbyte/)() override | 从底层流读取单个字节并返回一个等同于读取字节值的 32 位整数。 |
| [Seek](./seek/)(int64_t, SeekOrigin) override | 设置当前对象所表示的流的位置。 |
| [set_Position](./set_position/)(int64_t) override | 将缓冲区刷新到底层流，然后设置流的位置。 |
| [SetLength](./setlength/)(int64_t) override | 设置当前对象所表示的流的长度。 |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 将指定字节数组中指定子范围的字节写入底层流。 |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 将指定字节数组中指定子范围的字节写入底层流。 |
| [WriteByte](./writebyte/)(uint8_t) override | 将指定的无符号 8 位整数值写入底层流。 |
| virtual [~BufferedStream](./~bufferedstream/)() | 析构函数。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Null](../stream/null/) | 一个没有底层存储的流。 |
## 另见

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
