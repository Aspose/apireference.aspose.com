---
title: "System::Net::Sockets::IOControlCode 枚举"
linktitle: "IOControlCode"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::Sockets::IOControlCode 枚举。枚举 C++ 中的 IO 控制代码。"
type: docs
weight: 900
url: /zh/cpp/system.net.sockets/iocontrolcode/
---
## IOControlCode enum


枚举 [IO](../../system.io/) 控制代码。

```cpp
enum class IOControlCode : int64_t
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| AsyncIO | -2147195267 | 启用或禁用套接字的异步 I/O 模式。 |
| NonBlockingIO | -2147195266 | 将套接字标记为非阻塞。 |
| DataToRead | 1074030207 | 返回可供读取的字节数。 |
| OobDataRead | 1074033415 | 返回关于等待接收的带外数据的信息。 |
| AssociateHandle | -2013265919 | 将此套接字与伴随接口的指定句柄关联。 |
| EnableCircularQueuing | 671088642 | 当传入消息队列已满时，用传入的数据报替换最早排队的数据报。 |
| Flush | 671088644 | 丢弃与此套接字关联的发送队列的当前内容。 |
| GetBroadcastAddress | 1207959557 | 返回一个 SOCKADDR 结构，其中包含当前套接字的地址族的广播地址。 |
| GetExtensionFunctionPointer | -939524090 | 检索指向关联服务提供程序支持的指定扩展函数的指针。 |
| GetQos | -939524089 | 检索与套接字关联的 QOS 结构。 |
| GetGroupQos | -939524088 | 返回套接字组的 QOS 属性。 |
| MultipointLoopback | -2013265911 | 控制本地计算机上应用程序在多播会话中发送的数据（不一定由同一套接字发送）是否会被加入回环接口的多播目标组的套接字接收。 |
| MulticastScope | -2013265910 | 控制路由器转发多播数据包的次数，也称为 TTL（生存时间）或跳数。 |
| SetQos | -2013265909 | 设置套接字的 QOS 属性。 |
| SetGroupQos | -2013265908 | 设置套接字组的 QOS 属性。 |
| TranslateHandle | -939524083 | 返回在伴随接口上下文中有效的套接字句柄。 |
| RoutingInterfaceQuery | -939524076 | 返回可用于连接到指定远程地址的接口地址。 |
| RoutingInterfaceChange | -2013265899 | 启用在用于访问远程端点的本地接口发生更改时接收通知。 |
| AddressListQuery | 1207959574 | 返回套接字可以绑定的本地接口列表。 |
| AddressListChange | 671088663 | 当套接字协议族的本地接口列表发生变化时，启用接收通知。 |
| QueryTargetPnpHandle | 1207959576 | 检索底层提供程序的 SOCKET 句柄。 |
| NamespaceChange | -2013265895 | 控制套接字在命名空间查询失效时是否接收通知。 |
| AddressListSort | -939524071 | 对 IPv6 和 IPv4 目标地址列表进行排序，以确定用于建立连接的最佳可用地址。 |
| ReceiveAll | -1744830463 | 启用接收网络上的所有 IPv4 数据包。 |
| ReceiveAllMulticast | -1744830462 | 启用接收网络上的所有多播 IPv4 数据包。 |
| ReceiveAllIgmpMulticast | -1744830461 | 启用接收网络上的所有 IGMP 数据包。 |
| KeepAliveValues | -1744830460 | 控制发送 TCP 保活数据包以及发送间隔。 |
| AbsorbRouterAlert | -1744830459 | 此值等于 Winsock 2 'SIO_ABSORB_RTRALERT' 常量。 |
| UnicastInterface | -1744830458 | 设置用于发送单播数据包的接口。 |
| LimitBroadcasts | -1744830457 | 此值等于 Winsock 2 'SIO_LIMIT_BROADCASTS' 常量。 |
| BindToInterface | -1744830456 | 将套接字绑定到指定的接口索引。 |
| MulticastInterface | -1744830455 | 设置用于发送多播数据包的接口。 |
| AddMulticastGroupOnInterface | -1744830454 | 使用通过索引标识的接口加入多播组。 |
| DeleteMulticastGroupFromInterface | -1744830453 | 将套接字从多播组中移除。 |

## 另见

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
