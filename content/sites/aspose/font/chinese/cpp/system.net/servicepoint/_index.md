---
title: "System::Net::ServicePoint 类"
linktitle: "ServicePoint"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::ServicePoint 类。提供 HTTP 连接管理。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 3100
url: /zh/cpp/system.net/servicepoint/
---
## ServicePoint class


提供 HTTP 连接管理。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数调用时作为参数传递。

```cpp
class ServicePoint : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CloseConnectionGroup](./closeconnectiongroup/)(String) | 关闭并移除属于指定连接组的连接。 |
| [get_Address](./get_address/)() | 返回当前实例所连接的服务器 URI。 |
| [get_BindIPEndPointDelegate](./get_bindipendpointdelegate/)() | RTTI 信息。 |
| [get_Certificate](./get_certificate/)() | 返回当前实例使用的证书。 |
| [get_ClientCertificate](./get_clientcertificate/)() | 返回最后一个客户端证书。 |
| [get_ConnectionLeaseTimeout](./get_connectionleasetimeout/)() | 获取以毫秒为单位的超时时间，超时后活动的 [ServicePoint](./) 将被关闭。 |
| [get_ConnectionLimit](./get_connectionlimit/)() | 获取当前实例允许的最大连接数。 |
| [get_ConnectionName](./get_connectionname/)() | 返回连接名称。 |
| [get_CurrentConnections](./get_currentconnections/)() | 返回已打开的连接数。 |
| [get_Expect100Continue](./get_expect100continue/)() | 获取指示是否使用 100-Continue 行为的值。 |
| [get_IdleSince](./get_idlesince/)() | 返回最近一次连接到主机的日期和时间。 |
| [get_MaxIdleTime](./get_maxidletime/)() | 获取以毫秒为单位的时间量，超过该时间空闲连接将被关闭。 |
| virtual [get_ProtocolVersion](./get_protocolversion/)() | 返回 HTTP 版本。 |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | 获取接收缓冲区的大小。 |
| [get_SupportsPipelining](./get_supportspipelining/)() | 返回指示当前实例是否支持管道连接的值。 |
| [get_UseNagleAlgorithm](./get_usenaglealgorithm/)() | 获取指示当前实例管理的连接是否使用 Nagle 算法的值。 |
| [set_BindIPEndPointDelegate](./set_bindipendpointdelegate/)(BindIPEndPoint) | 设置用于将本地 [IPEndPoint](../ipendpoint/) 与当前实例关联的委托。 |
| [set_ConnectionLeaseTimeout](./set_connectionleasetimeout/)(int32_t) | 设置以毫秒为单位的超时时间，超时后活动的 [ServicePoint](./) 将被关闭。 |
| [set_ConnectionLimit](./set_connectionlimit/)(int32_t) | 设置当前实例允许的最大连接数。 |
| [set_Expect100Continue](./set_expect100continue/)(bool) | 设置指示是否使用 100-Continue 行为的值。 |
| [set_MaxIdleTime](./set_maxidletime/)(int32_t) | 设置以毫秒为单位的时间量，超过该时间空闲连接将被关闭。 |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | 设置接收缓冲区的大小。 |
| [set_UseNagleAlgorithm](./set_usenaglealgorithm/)(bool) | 设置指示当前实例管理的连接是否使用 Nagle 算法的值。 |
| [SetTcpKeepAlive](./settcpkeepalive/)(bool, int32_t, int32_t) | 设置指示是否启用 'Keep-Alive' 选项的值。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
