---
title: "System::Net::Sockets::NetworkStream class"
linktitle: "NetworkStream"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Sockets::NetworkStream 类。提供网络访问的数据底层流。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 300
url: /zh/cpp/system.net.sockets/networkstream/
---
## NetworkStream class


提供网络访问的数据底层流。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数参数中传递。

```cpp
class NetworkStream : public System::IO::Stream
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | 发起异步读取操作。 |
| [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | 发起异步写入操作。 |
| [Close](./close/)(int) | 在指定时间到期后关闭当前实例。 |
| [EndRead](./endread/)(System::SharedPtr\<IAsyncResult\>) override | 等待指定的异步读取操作完成。 |
| [EndWrite](./endwrite/)(System::SharedPtr\<IAsyncResult\>) override | 结束异步写入操作。等待指定的异步写入操作完成。 |
| [Flush](./flush/)() override | 清除此流的缓冲区并将所有缓冲的数据写入底层存储。 |
| [get_CanRead](./get_canread/)() const override | RTTI 信息。 |
| [get_CanSeek](./get_canseek/)() const override | 确定流是否支持定位。 |
| [get_CanTimeout](./get_cantimeout/)() const override | 获取一个值，用于确定当前流是否可以超时。 |
| [get_CanWrite](./get_canwrite/)() const override | 确定流是否可写。 |
| [get_DataAvailable](./get_dataavailable/)() const | 返回一个值，指示是否有可读取的数据。 |
| [get_Length](./get_length/)() const override | 返回流的字节长度。 |
| [get_Position](./get_position/)() const override | 返回流的当前位置。 |
| [get_ReadTimeout](./get_readtimeout/)() const override | 获取一个以毫秒为单位的值，用于确定流在超时前尝试读取的持续时间。 |
| [get_Socket](./get_socket/)() | 获取底层的[Socket](../socket/)。 |
| [get_WriteTimeout](./get_writetimeout/)() const override | 获取一个以毫秒为单位的值，用于确定流在超时前尝试写入的持续时间。 |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>) | 构造一个新实例。 |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>, System::IO::FileAccess, bool) | 构造一个新实例。 |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>, bool) | 构造一个新实例。 |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 从流中读取指定数量的字节并将其写入指定的字节数组。 |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 从流中读取指定数量的字节并将其写入指定的字节数组。 |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | 设置当前对象所表示的流的位置。 |
| [set_Position](./set_position/)(int64_t) override | 设置流的位置。 |
| [set_ReadTimeout](./set_readtimeout/)(int32_t) override | 设置一个值，用于确定当前流是否可以超时。 |
| [set_WriteTimeout](./set_writetimeout/)(int32_t) override | 设置一个以毫秒为单位的值，用于确定流在超时前尝试读取的持续时间。 |
| [SetLength](./setlength/)(int64_t) override | 设置当前对象所表示的流的长度。 |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 将指定字节数组中的指定子范围字节写入流。 |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 将指定字节数组中的指定子范围字节写入流。 |
| virtual [~NetworkStream](./~networkstream/)() | 销毁当前实例。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Null](../../system.io/stream/null/) | 一个没有底层存储的流。 |
## 另见

* Class [Stream](../../system.io/stream/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
