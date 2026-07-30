---
title: "System::Security::Cryptography::CryptoStream 类"
linktitle: "CryptoStream"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::CryptoStream 类。将现有流包装为加密函数的流实现。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 500
url: /zh/cpp/system.security.cryptography/cryptostream/
---
## CryptoStream class


将现有流包装为加密函数的流实现。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class CryptoStream : public System::IO::Stream
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Close](./close/)() override | 关闭连接。 |
| [CryptoStream](./cryptostream/)(const SharedPtr\<System::IO::Stream\>\&, const SharedPtr\<ICryptoTransform\>\&, CryptoStreamMode) | 构造函数。 |
| [Flush](./flush/)() override | 将缓冲区清空到包装的流中。由于转换算法可能仍在等待更多数据，什么也不做。 |
| [FlushFinalBlock](./flushfinalblock/)() | 将缓冲区中仍然存在的数据写入流。 |
| [get_CanRead](./get_canread/)() const override | 检查流是否可读。 |
| [get_CanSeek](./get_canseek/)() const override | 检查流是否可定位。 |
| [get_CanWrite](./get_canwrite/)() const override | 检查流是否可写。 |
| [get_Length](./get_length/)() const override | 获取流的长度。不受支持。 |
| [get_Position](./get_position/)() const override | 获取流中的当前位置。不受支持。 |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 从流中读取数据。 |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 从流中读取数据。 |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | 在流中定位位置。不受支持。 |
| [set_Position](./set_position/)(int64_t) override | 在流中定位位置。不受支持。 |
| [SetLength](./setlength/)(int64_t) override | 在流中定位大小。不受支持。 |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 将数据写入流。 |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 将数据写入流。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Null](../../system.io/stream/null/) | 一个没有底层存储的流。 |
## 另见

* Class [Stream](../../system.io/stream/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
