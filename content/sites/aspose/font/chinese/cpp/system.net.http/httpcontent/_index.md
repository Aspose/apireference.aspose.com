---
title: "System::Net::Http::HttpContent 类"
linktitle: "HttpContent"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::HttpContent 类。表示 HTTP 实体的内容。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 400
url: /zh/cpp/system.net.http/httpcontent/
---
## HttpContent class


表示 HTTP 实体的内容。此类的 [Object](../../system/object/) 应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class HttpContent : public System::IDisposable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Dispose](./dispose/)() override | 释放当前实例。此方法还会释放由 'ReadAsStream' 返回的流以及如果已创建的内存缓冲区。 |
| [get_Headers](./get_headers/)() | 返回 HTTP 内容头。 |
| [LoadIntoBuffer](./loadintobuffer/)() | 将内容序列化到内存缓冲区。 |
| [LoadIntoBuffer](./loadintobuffer/)(int64_t) | 将内容序列化到内存缓冲区。 |
| [ReadAsByteArray](./readasbytearray/)() | 将内容序列化并返回字节数组。 |
| [ReadAsStream](./readasstream/)() | 将内容序列化并返回流。 |
| [ReadAsString](./readasstring/)() | 将内容序列化并返回字符串。 |
| virtual [TryComputeLength](./trycomputelength/)(int64_t\&) | 尝试计算内容大小。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [DefaultStringEncoding](./defaultstringencoding/) | 默认编码。 |
| static [MaxBufferSize](./maxbuffersize/) | 最大字节数。 |
## 另见

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
