---
title: "System::Net::IPEndPoint 类"
linktitle: "IPEndPoint"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::IPEndPoint 类。表示包含 IP 地址和端口的网络端点。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并在 C++ 中使用该指针将其作为参数传递给函数。"
type: docs
weight: 2500
url: /zh/cpp/system.net/ipendpoint/
---
## IPEndPoint class


表示包含 IP 地址和端口的网络端点。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class IPEndPoint : public System::Net::EndPoint
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Create](./create/)(System::SharedPtr\<SocketAddress\>) override | 使用指定的套接字地址创建 [EndPoint](../endpoint/) 类的新实例。 |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | 使用 C# [Object.Equals](../../system/object/equals/) 语义比较对象。 |
| [get_Address](./get_address/)() | 获取端点地址。 |
| [get_AddressFamily](./get_addressfamily/)() override | RTTI 信息。 |
| [get_Port](./get_port/)() | 获取端口号。 |
| [GetHashCode](./gethashcode/)() const override | 相当于 C# [Object.GetHashCode()](../../system/object/gethashcode/) 方法。启用自定义对象的哈希计算。 |
| [GetImpl](./getimpl/)() const override | 返回指向实现的指针。 |
| [IPEndPoint](./ipendpoint/)(int64_t, int32_t) | 构造一个新实例。 |
| [IPEndPoint](./ipendpoint/)(System::SharedPtr\<IPAddress\>, int32_t) | 构造一个新实例。 |
| [set_Address](./set_address/)(System::SharedPtr\<IPAddress\>) | 设置端点地址。 |
| [set_Port](./set_port/)(int32_t) | 设置端口号。 |
| [ToString](./tostring/)() const override | 相当于 C# 的 [Object.ToString()](../../system/object/tostring/) 方法。用于将自定义对象转换为字符串。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Any](./any/) | 适用于任何 IPv4 地址和任何端口的端点。 |
| static [AnyPort](./anyport/) | 指示是否可以使用任意端口的值。 |
| static [IPv6Any](./ipv6any/) | 适用于任何 IPv6 地址和任何端口的端点。 |
| static [MaxPort](./maxport/) | 最大端口号。 |
| static [MinPort](./minport/) | RTTI 信息。 |
## 另见

* Class [EndPoint](../endpoint/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
