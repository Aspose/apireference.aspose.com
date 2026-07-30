---
title: "System::IO::FileStream 类"
linktitle: "FileStream"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::FileStream 类。表示支持同步和异步读写操作的文件流。该类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1500
url: /zh/cpp/system.io/filestream/
---
## FileStream class


表示支持同步和异步读写操作的文件流。该类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class FileStream : public System::IO::Stream
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Close](./close/)() override | 关闭当前的 [FileStream](./) 对象。 |
| [FileStream](./filestream/)(const String\&, FileMode) | 构造一个新的 [FileStream](./) 类实例，并使用指定的参数进行初始化。 |
| [FileStream](./filestream/)(const String\&, FileMode, FileAccess, FileShare, int32_t, FileOptions) | 构造一个新的 [FileStream](./) 类实例，并使用指定的参数进行初始化。 |
| [FileStream](./filestream/)(const String\&, FileMode, FileAccess, FileShare, int32_t, bool) | 构造一个新的 [FileStream](./) 类实例，并使用指定的参数进行初始化。 |
| [FileStream](./filestream/)(const FileStream\&) |  |
| [Flush](./flush/)() override | 清除此流的缓冲区并将所有缓冲数据写入底层文件。 |
| [Flush](./flush/)(bool) | 清除此流的缓冲区并将所有缓冲数据写入底层文件。是方法 [Flush()](./flush/) 的同义词。 |
| [FlushAsync](./flushasync/)(const Threading::CancellationToken\&) override | 异步清除此流的所有缓冲区，使任何缓冲的数据写入底层设备，并监视取消请求。 |
| [get_CanRead](./get_canread/)() const override | 确定流是否可读取。 |
| [get_CanSeek](./get_canseek/)() const override | 确定流是否支持定位。 |
| [get_CanWrite](./get_canwrite/)() const override | 确定流是否可写。 |
| [get_Length](./get_length/)() const override | 返回流的字节长度。 |
| [get_Name](./get_name/)() const | 返回当前 [FileStream](./) 对象封装的文件名。 |
| [get_Position](./get_position/)() const override | 返回流的当前位置。 |
| [operator=](./operator=/)(const FileStream\&) |  |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 从流中读取指定数量的字节并将其写入指定的字节数组。 |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 从流中读取指定数量的字节并将其写入指定的字节数组。 |
| [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) override | 异步从当前流读取一系列字节，按读取的字节数前进流中的位置，并监视取消请求。 |
| [ReadByte](./readbyte/)() override | 从流中读取单个字节并返回等同于读取字节值的 32 位整数。 |
| [Seek](./seek/)(int64_t, SeekOrigin) override | 设置当前对象所表示的流的位置。 |
| [set_Position](./set_position/)(int64_t) override | 刷新流，然后设置流的位置。 |
| [SetLength](./setlength/)(int64_t) override | 设置当前对象所表示的流的长度。 |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 将指定字节数组中的指定子范围字节写入流。 |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 将指定字节数组中的指定子范围字节写入流。 |
| [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) override | 异步将一系列字节写入当前流，按写入的字节数前进此流中的当前位置，并监视取消请求。 |
| [WriteByte](./writebyte/)(uint8_t) override | 将指定的无符号 8 位整数值写入流。 |
| [~FileStream](./~filestream/)() | 析构函数。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static constexpr [DefaultBufferSize](./defaultbuffersize/) | 读取和写入操作期间缓冲的字节数的默认值。 |
| static [Null](../stream/null/) | 一个没有底层存储的流。 |
## 另见

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
