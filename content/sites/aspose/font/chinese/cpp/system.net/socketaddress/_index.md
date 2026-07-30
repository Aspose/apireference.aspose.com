---
title: "System::Net::SocketAddress class"
linktitle: "SocketAddress"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::SocketAddress 类。用于存储关于 EndPoint 类实例的序列化信息。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 3300
url: /zh/cpp/system.net/socketaddress/
---
## SocketAddress class


用于存储关于 [EndPoint](../endpoint/) 类实例的序列化信息。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数中作为参数传递。

```cpp
class SocketAddress : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | 使用 C# [Object.Equals](../../system/object/equals/) 语义比较对象。 |
| [get_Family](./get_family/)() | RTTI 信息。 |
| [get_Size](./get_size/)() | 返回底层缓冲区大小。 |
| [GetHashCode](./gethashcode/)() const override | 相当于 C# [Object.GetHashCode()](../../system/object/gethashcode/) 方法。启用自定义对象的哈希计算。 |
| [idx_get](./idx_get/)(int32_t) | 获取底层缓冲区在指定索引处的值。 |
| [idx_set](./idx_set/)(int32_t, uint8_t) | 设置底层缓冲区在指定索引处的值。 |
| [SocketAddress](./socketaddress/)(Sockets::AddressFamily) | 构造一个新实例。 |
| [SocketAddress](./socketaddress/)(Sockets::AddressFamily, int32_t) | 构造一个新实例。 |
| [ToString](./tostring/)() const override | 相当于 C# 的 [Object.ToString()](../../system/object/tostring/) 方法。用于将自定义对象转换为字符串。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
