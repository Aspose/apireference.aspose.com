---
title: "System::Net::IPAddress 类"
linktitle: "IPAddress"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::IPAddress 类。表示 IP 地址。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 2400
url: /zh/cpp/system.net/ipaddress/
---
## IPAddress class


表示 IP 地址。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class IPAddress : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | 使用 C# [Object.Equals](../../system/object/equals/) 语义比较对象。 |
| [get_AddressFamily](./get_addressfamily/)() | 返回地址族。 |
| [get_IsIPv4MappedToIPv6](./get_isipv4mappedtoipv6/)() | 返回一个值，以指示该地址是否为 IPv4 地址且已映射到 IPv6 地址。 |
| [get_IsIPv6LinkLocal](./get_isipv6linklocal/)() | 返回一个值，以指示该地址是否为 IPv6 链路本地地址。 |
| [get_IsIPv6Multicast](./get_isipv6multicast/)() | 返回一个值，以指示该地址是否为全局 IPv6 多播地址。 |
| [get_IsIPv6SiteLocal](./get_isipv6sitelocal/)() | 返回一个值，以指示该地址是否为 IPv6 站点本地地址。 |
| [get_IsIPv6Teredo](./get_isipv6teredo/)() | 返回一个值，以指示该地址是否为 IPv6 Teredo 地址。 |
| [get_ScopeId](./get_scopeid/)() | 获取 IPv6 地址的作用域标识符。 |
| [GetAddressBytes](./getaddressbytes/)() | 返回 IP 地址的字节数组。 |
| [GetHashCode](./gethashcode/)() const override | 相当于 C# [Object.GetHashCode()](../../system/object/gethashcode/) 方法。启用自定义对象的哈希计算。 |
| [GetImpl](./getimpl/)() const | 返回指向实现的指针。 |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int64_t) | 将指定的主机字节序转换为相应的网络字节序。 |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int32_t) | 将指定的主机字节序转换为相应的网络字节序。 |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int16_t) | 将指定的主机字节序转换为相应的网络字节序。 |
| [IPAddress](./ipaddress/)(int64_t) | 构造一个新实例。 |
| [IPAddress](./ipaddress/)(System::ArrayPtr\<uint8_t\>, int64_t) | 构造一个新实例。 |
| [IPAddress](./ipaddress/)(System::ArrayPtr\<uint8_t\>) | 构造一个新实例。 |
| [IPAddress](./ipaddress/)() | 构造一个新实例。 |
| static [IsLoopback](./isloopback/)(System::SharedPtr\<IPAddress\>) | 返回一个值，以指示指定的地址是否为环回地址。 |
| [MapToIPv4](./maptoipv4/)() | 将该地址映射为 IPv4 地址。 |
| [MapToIPv6](./maptoipv6/)() | 将地址映射到 IPv6 地址。 |
| static [NetworkToHostOrder](./networktohostorder/)(int64_t) | 将指定的网络字节序转换为相应的主机字节序。 |
| static [NetworkToHostOrder](./networktohostorder/)(int32_t) | 将指定的网络字节序转换为相应的主机字节序。 |
| static [NetworkToHostOrder](./networktohostorder/)(int16_t) | 将指定的网络字节序转换为相应的主机字节序。 |
| static [Parse](./parse/)(String) | 将传入的字符串转换为 [IPAddress](./) 类的实例。 |
| [set_ScopeId](./set_scopeid/)(int64_t) | 设置 IPv6 地址的作用域标识符。 |
| [SetImpl](./setimpl/)(ImplPtr) | 设置指向实现的指针。 |
| [ToString](./tostring/)() const override | 相当于 C# 的 [Object.ToString()](../../system/object/tostring/) 方法。用于将自定义对象转换为字符串。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<IPAddress\>\&) | 尝试将传入的字符串转换为 [IPAddress](./) 类的实例。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Any](./any/) | RTTI 信息。 |
| static [Broadcast](./broadcast/) | IPv4 广播地址。 |
| static [IPv6Any](./ipv6any/) | 指示服务器必须监听所有网络接口的 IPv6 地址。 |
| static [IPv6Loopback](./ipv6loopback/) | IPv6 回环地址。 |
| static [IPv6None](./ipv6none/) | 指示服务器不应监听任何网络接口的 IPv6 地址。 |
| static [Loopback](./loopback/) | IPv4 回环地址。 |
| static [None](./none/) | 指示服务器不应监听任何网络接口的 IPv4 地址。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [ImplPtr](./implptr/) | 指向实现类型的指针。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
