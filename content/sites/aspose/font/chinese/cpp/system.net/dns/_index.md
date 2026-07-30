---
title: "System::Net::Dns 类"
linktitle: "Dns"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Dns 类。提供在 C++ 中使用 DNS 的方法。"
type: docs
weight: 700
url: /zh/cpp/system.net/dns/
---
## Dns class


提供用于处理 DNS 的方法。

```cpp
class Dns : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [BeginGetHostAddresses](./begingethostaddresses/)(String, AsyncCallback, System::SharedPtr\<Object\>) | 使用包含主机名或 IP 地址的指定字符串，启动异步操作以创建新的 IPHostEntry-class 实例。 |
| static [BeginGetHostByName](./begingethostbyname/)(String, AsyncCallback, System::SharedPtr\<Object\>) | 使用指定的主机名，启动异步操作以创建新的 IPHostEntry-class 实例。 |
| static [BeginGetHostEntry](./begingethostentry/)(String, AsyncCallback, System::SharedPtr\<Object\>) | 使用包含主机名或 IP 地址的指定字符串，启动异步操作以创建新的 IPHostEntry-class 实例。 |
| static [BeginGetHostEntry](./begingethostentry/)(System::SharedPtr\<IPAddress\>, AsyncCallback, System::SharedPtr\<Object\>) | 使用指定的 IP 地址，启动异步操作以创建新的 IPHostEntry-class 实例。 |
| static [BeginResolve](./beginresolve/)(String, AsyncCallback, System::SharedPtr\<Object\>) | 使用指定的主机名，启动异步操作以创建新的 IPHostEntry-class 实例。 |
| [Dns](./dns/)() | 已删除的默认构造函数。 |
| static [EndGetHostAddresses](./endgethostaddresses/)(System::SharedPtr\<IAsyncResult\>) | 等待指定的创建新 IPHostEntry-class 实例的异步操作完成。 |
| static [EndGetHostByName](./endgethostbyname/)(System::SharedPtr\<IAsyncResult\>) | 等待指定的创建新 IPHostEntry-class 实例的异步操作完成。 |
| static [EndGetHostEntry](./endgethostentry/)(System::SharedPtr\<IAsyncResult\>) | 等待指定的创建新 IPHostEntry-class 实例的异步操作完成。 |
| static [EndResolve](./endresolve/)(System::SharedPtr\<IAsyncResult\>) | 等待指定的创建新 IPHostEntry-class 实例的异步操作完成。 |
| static [GetHostAddresses](./gethostaddresses/)(String) | 返回指定主机名或 IP 地址的 IP 地址集合。 |
| static [GetHostByAddress](./gethostbyaddress/)(String) | 使用指定的 IP 地址字符串表示，创建新的 IPHostEntry-class 实例。 |
| static [GetHostByAddress](./gethostbyaddress/)(System::SharedPtr\<IPAddress\>) | 使用指定的 IP 地址，创建新的 IPHostEntry-class 实例。 |
| static [GetHostByName](./gethostbyname/)(String) | RTTI 信息。 |
| static [GetHostEntry](./gethostentry/)(String) | 使用包含主机名或 IP 地址的指定字符串，创建新的 IPHostEntry-class 实例。 |
| static [GetHostEntry](./gethostentry/)(System::SharedPtr\<IPAddress\>) | 使用指定的 IP 地址，创建新的 IPHostEntry-class 实例。 |
| static [GetHostName](./gethostname/)() | 返回本地机器的主机名。 |
| static [Resolve](./resolve/)(String) | 使用指定的主机名创建一个新的 IPHostEntry-class 实例。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
