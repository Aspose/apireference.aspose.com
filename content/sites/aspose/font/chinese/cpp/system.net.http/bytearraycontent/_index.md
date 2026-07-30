---
title: "System::Net::Http::ByteArrayContent 类"
linktitle: "ByteArrayContent"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::ByteArrayContent 类。表示 HTTP 内容为字节数组。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 100
url: /zh/cpp/system.net.http/bytearraycontent/
---
## ByteArrayContent class


表示 HTTP 内容为字节数组。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class ByteArrayContent : public System::Net::Http::HttpContent
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [ByteArrayContent](./bytearraycontent/)(System::ArrayPtr\<uint8_t\>) | RTTI 信息。 |
| [ByteArrayContent](./bytearraycontent/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) | 构造一个新实例。 |
| [TryComputeLength](./trycomputelength/)(int64_t\&) override | 尝试计算字节数组的长度。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [DefaultStringEncoding](../httpcontent/defaultstringencoding/) | 默认编码。 |
| static [MaxBufferSize](../httpcontent/maxbuffersize/) | 最大字节数。 |
## 另见

* Class [HttpContent](../httpcontent/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
