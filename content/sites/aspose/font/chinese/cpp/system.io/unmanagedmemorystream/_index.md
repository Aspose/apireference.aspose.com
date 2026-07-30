---
title: "System::IO::UnmanagedMemoryStream 类"
linktitle: "UnmanagedMemoryStream"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::UnmanagedMemoryStream 类。提供对非托管内存的访问。此类的对象只能使用 System::MakeObject() 函数进行分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 2800
url: /zh/cpp/system.io/unmanagedmemorystream/
---
## UnmanagedMemoryStream class


提供对非托管内存的访问。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数进行分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class UnmanagedMemoryStream : public System::IO::Stream
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Flush](./flush/)() override | 不执行任何操作。 |
| [get_CanRead](./get_canread/)() const override | 确定流是否可读取。 |
| [get_CanSeek](./get_canseek/)() const override | 确定流是否支持定位。 |
| [get_CanWrite](./get_canwrite/)() const override | 确定流是否可写。 |
| virtual [get_Capacity](./get_capacity/)() const | 返回底层内存缓冲区的当前容量。 |
| [get_Length](./get_length/)() const override | 返回流的字节长度。 |
| [get_Position](./get_position/)() const override | 返回流的当前位置。 |
| [get_PositionPointer](./get_positionpointer/)() | 未实现。 |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 从流中读取指定数量的字节并将其写入指定的字节数组。 |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 从流中读取指定数量的字节并将其写入指定的字节数组。 |
| [Seek](./seek/)(int64_t, SeekOrigin) override | 设置当前对象所表示的流的位置。 |
| [set_Position](./set_position/)(int64_t) override | 设置流的位置。 |
| [set_PositionPointer](./set_positionpointer/)(uint8_t *) | 未实现。 |
| [SetLength](./setlength/)(int64_t) override | 未实现。 |
| [UnmanagedMemoryStream](./unmanagedmemorystream/)(uint8_t *, int64_t) | 构造一个新的 [UnmanagedMemoryStream](./) 实例。 |
| [UnmanagedMemoryStream](./unmanagedmemorystream/)(uint8_t *, int64_t, int64_t, FileAccess) | 构造一个新的 [UnmanagedMemoryStream](./) 实例。 |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 未实现。 |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 未实现。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Null](../stream/null/) | 一个没有底层存储的流。 |
## 另见

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
