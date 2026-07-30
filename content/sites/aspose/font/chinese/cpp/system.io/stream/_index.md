---
title: "System::IO::Stream 类"
linktitle: "流"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::Stream 类。是各种流实现的基类。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 2100
url: /zh/cpp/system.io/stream/
---
## Stream class


是各种流实现的基类。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class Stream : public System::IDisposable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int, int, System::AsyncCallback, System::SharedPtr\<System::Object\>) | 发起异步读取操作。 |
| virtual [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int, int, System::AsyncCallback, System::SharedPtr\<System::Object\>) | 发起异步写入操作。 |
| virtual [Close](./close/)() | 关闭流。 |
| [CopyTo](./copyto/)(const SharedPtr\<Stream\>\&) | 将字节复制到指定的流。 |
| [CopyTo](./copyto/)(const SharedPtr\<Stream\>\&, int32_t) | 将字节复制到指定的流，使用指定的缓冲区大小。 |
| [Dispose](./dispose/)() override | 释放当前对象使用的所有资源并关闭流。 |
| virtual [EndRead](./endread/)(System::SharedPtr\<System::IAsyncResult\>) | 等待指定的异步读取操作完成。 |
| virtual [EndWrite](./endwrite/)(System::SharedPtr\<System::IAsyncResult\>) | 结束异步写入操作。等待指定的异步写入操作完成。 |
| virtual [Flush](./flush/)() | 清除此流的缓冲区并将所有缓冲的数据写入底层存储。 |
| virtual [FlushAsync](./flushasync/)(const Threading::CancellationToken\&) | 异步清除此流的所有缓冲区，使任何缓冲的数据写入底层设备，并监视取消请求。 |
| [FlushAsync](./flushasync/)() | 异步清除此流的所有缓冲区，使任何缓冲的数据写入底层设备，并监视取消请求。 |
| virtual [get_CanRead](./get_canread/)() const | 确定流是否可读取。 |
| virtual [get_CanSeek](./get_canseek/)() const | 确定流是否支持定位。 |
| virtual [get_CanTimeout](./get_cantimeout/)() const | 获取一个值，用于确定当前流是否可以超时。 |
| virtual [get_CanWrite](./get_canwrite/)() const | 确定流是否可写。 |
| virtual [get_Length](./get_length/)() const | 返回流的字节长度。 |
| virtual [get_Position](./get_position/)() const | 返回流的当前位置。 |
| virtual [get_ReadTimeout](./get_readtimeout/)() const | 获取一个以毫秒为单位的值，用于确定流在超时前尝试读取的持续时间。 |
| virtual [get_WriteTimeout](./get_writetimeout/)() const | 获取一个以毫秒为单位的值，用于确定流在超时前尝试写入的持续时间。 |
| virtual [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | 从流中读取指定数量的字节并将其写入指定的字节数组。 |
| virtual [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) | 从流中读取指定数量的字节并将其写入指定的字节数组。 |
| [Read](./read/)(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) | 从流中读取指定数量的字节并将其写入指定的字节数组。 |
| virtual [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) | 异步从当前流读取一系列字节，按读取的字节数前进流中的位置，并监视取消请求。 |
| [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | 异步从当前流读取一系列字节，按读取的字节数前进流中的位置，并监视取消请求。 |
| virtual [ReadByte](./readbyte/)() | 从流中读取单个字节并返回等同于读取字节值的 32 位整数。 |
| virtual [Seek](./seek/)(int64_t, SeekOrigin) | 设置当前对象所表示的流的位置。 |
| virtual [set_Position](./set_position/)(int64_t) | 设置流的位置。 |
| virtual [set_ReadTimeout](./set_readtimeout/)(int) | 设置一个值，用于确定当前流是否可以超时。 |
| virtual [set_WriteTimeout](./set_writetimeout/)(int) | 设置一个以毫秒为单位的值，用于确定流在超时前尝试读取的持续时间。 |
| virtual [SetLength](./setlength/)(int64_t) | 设置当前对象所表示的流的长度。 |
| virtual [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | 将指定字节数组中的指定子范围字节写入流。 |
| virtual [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) | 将指定字节数组中的指定子范围字节写入流。 |
| [Write](./write/)(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) | 将指定字节数组中的指定子范围字节写入流。 |
| virtual [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) | 异步将一系列字节写入当前流，按写入的字节数前进此流中的当前位置，并监视取消请求。 |
| [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | 异步将一系列字节写入当前流，按写入的字节数前进此流中的当前位置，并监视取消请求。 |
| virtual [WriteByte](./writebyte/)(uint8_t) | 将指定的无符号 8 位整数值写入流。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Null](./null/) | 一个没有底层存储的流。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类的共享指针别名。 |
## 另见

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
