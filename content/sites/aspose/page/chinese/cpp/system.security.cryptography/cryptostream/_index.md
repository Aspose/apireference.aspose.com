---
title: "System::Security::Cryptography::CryptoStream 类"
linktitle: "CryptoStream"
second_title: "Aspose.Page 适用于 C++"
description: "System::Security::Cryptography::CryptoStream 类。流实现，使用加密函数包装现有流。此类的对象只能通过 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 500
url: /zh/cpp/system.security.cryptography/cryptostream/
---
## CryptoStream class


流实现，使用加密函数包装现有流。此类的对象只能通过 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class CryptoStream : public System::IO::Stream
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Close](./close/)() override | 关闭连接。 |
| [CryptoStream](./cryptostream/)(const SharedPtr\<System::IO::Stream\>\&, const SharedPtr\<ICryptoTransform\>\&, CryptoStreamMode) | 构造函数。 |
| [Flush](./flush/)() override | 将缓冲区内容写入包装的流。若转换算法仍在等待更多数据，则不执行任何操作。 |
| [FlushFinalBlock](./flushfinalblock/)() | 将缓冲区中仍未写入的数据写入流。 |
| [get_CanRead](./get_canread/)() const override | 检查流是否可读。 |
| [get_CanSeek](./get_canseek/)() const override | 检查流是否可定位。 |
| [get_CanWrite](./get_canwrite/)() const override | 检查流是否可写。 |
| [get_Length](./get_length/)() const override | 获取流的长度。不支持。 |
| [get_Position](./get_position/)() const override | 获取流中的当前位置。不支持。 |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 从流中读取数据。 |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 从流中读取数据。 |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | 在流中定位位置。不支持。 |
| [set_Position](./set_position/)(int64_t) override | 在流中定位位置。不支持。 |
| [SetLength](./setlength/)(int64_t) override | 在流中定位大小。不支持。 |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 向流写入数据。 |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 向流写入数据。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Null](../../system.io/stream/null/) | 没有底层存储的流。 |
## 另见

* Class [Stream](../../system.io/stream/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
