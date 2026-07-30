---
title: "System::Net::Sockets::Socket 类"
linktitle: "Socket"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Sockets::Socket 类。Socket 类在 C++ 中实现了 Berkeley 套接字接口。"
type: docs
weight: 400
url: /zh/cpp/system.net.sockets/socket/
---
## Socket class


该 [Socket](./) 类实现了 Berkeley 套接字接口。

```cpp
class Socket : public System::IDisposable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Accept](./accept/)() | 为新创建的连接创建一个新的套接字。 |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<EndPoint\>, AsyncCallback, System::SharedPtr\<Object\>) | 发起异步连接操作。 |
| [BeginConnect](./beginconnect/)(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | 发起异步连接操作。 |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | 发起异步连接操作。 |
| [BeginConnect](./beginconnect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | 发起异步连接操作。 |
| [BeginReceive](./beginreceive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, AsyncCallback, System::SharedPtr\<Object\>) | 发起异步写入操作。 |
| [BeginSend](./beginsend/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, AsyncCallback, System::SharedPtr\<Object\>) | 发起异步发送操作。 |
| [Bind](./bind/)(System::SharedPtr\<EndPoint\>) | 将套接字绑定到指定的本地端点。 |
| [Close](./close/)() | 关闭套接字连接。 |
| [Close](./close/)(int) | 在指定的超时时间内关闭套接字连接，以允许发送排队的数据。 |
| [Connect](./connect/)(System::SharedPtr\<EndPoint\>) | 建立到指定远程端点的连接。 |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | 建立到指定远程端点的连接。 |
| [Connect](./connect/)(String, int32_t) | 建立到指定远程端点的连接。 |
| [Connect](./connect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t) | 建立到指定远程端点的连接。 |
| [Dispose](./dispose/)() override | 不执行任何操作。 |
| [EndConnect](./endconnect/)(System::SharedPtr\<IAsyncResult\>) | 等待指定的异步连接操作完成。 |
| [EndReceive](./endreceive/)(System::SharedPtr\<IAsyncResult\>) | 等待指定的异步接收操作完成。 |
| [EndReceive](./endreceive/)(System::SharedPtr\<IAsyncResult\>, SocketError\&) | 等待指定的异步接收操作完成。 |
| [EndSend](./endsend/)(System::SharedPtr\<IAsyncResult\>) | 等待指定的异步发送操作完成。 |
| [EndSend](./endsend/)(System::SharedPtr\<IAsyncResult\>, SocketError\&) | 等待指定的异步发送操作完成。 |
| [get_AddressFamily](./get_addressfamily/)() | 返回地址族。 |
| [get_Available](./get_available/)() | 获取从网络接收的字节数以及可供读取的字节数。 |
| [get_Blocking](./get_blocking/)() | 获取指示套接字是否处于阻塞模式的值。 |
| [get_Connected](./get_connected/)() | 返回指示套接字是否已连接到远程主机的值。 |
| [get_DontFragment](./get_dontfragment/)() | 获取指示套接字是否允许 IP 数据报分片的值。 |
| [get_DualMode](./get_dualmode/)() | 获取指示套接字是否处于双模式的值。 |
| [get_EnableBroadcast](./get_enablebroadcast/)() | 获取指示套接字是否允许广播数据包的值。 |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | 获取指示是否只能有一个进程将套接字绑定到端口的值。 |
| [get_IsBound](./get_isbound/)() | 返回指示套接字是否绑定到特定本地端口的值。 |
| [get_LingerState](./get_lingerstate/)() | 获取指示套接字是否会延迟关闭以尝试发送所有挂起数据的值。 |
| [get_LocalEndPoint](./get_localendpoint/)() | 返回本地端点。 |
| [get_MulticastLoopback](./get_multicastloopback/)() | 获取指示套接字是否接收外发多播数据包的值。 |
| [get_NoDelay](./get_nodelay/)() | 获取一个指示套接字是否使用 Nagle 算法的值。 |
| static [get_OSSupportsIPv4](./get_ossupportsipv4/)() | 返回一个指示操作系统和网络适配器是否支持 IPv4 的值。 |
| static [get_OSSupportsIPv6](./get_ossupportsipv6/)() | 返回一个指示操作系统和网络适配器是否支持 IPv6 的值。 |
| [get_ProtocolType](./get_protocoltype/)() | 返回协议类型。 |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | 获取接收缓冲区大小。 |
| [get_ReceiveTimeout](./get_receivetimeout/)() | 获取一个时间段，在此之后 'Receive' 调用将超时。 |
| [get_RemoteEndPoint](./get_remoteendpoint/)() | 返回远程端点。 |
| [get_SendBufferSize](./get_sendbuffersize/)() | 获取发送缓冲区大小。 |
| [get_SendTimeout](./get_sendtimeout/)() | 获取一个时间段，在此之后 'Send' 调用将超时。 |
| [get_SocketType](./get_sockettype/)() | 返回套接字类型。 |
| static [get_SupportsIPv4](./get_supportsipv4/)() | RTTI 信息。 |
| [get_Ttl](./get_ttl/)() | 获取 TTL 值。 |
| [GetImpl](./getimpl/)() const | 返回指向实现的指针。 |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName) | 返回与指定选项名称对应的值。 |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) | 获取与指定选项名称对应的值。 |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName, int32_t) | 返回与指定选项名称对应的值。 |
| [IOControl](./iocontrol/)(int32_t, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | 设置套接字的低级操作模式。 |
| [IOControl](./iocontrol/)(IOControlCode, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | 设置套接字的低级操作模式。 |
| [Listen](./listen/)(int32_t) | 将套接字状态更改为 'listen'。 |
| [Poll](./poll/)(int32_t, SelectMode) | 根据指定的轮询模式返回套接字的状态。 |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) | 从套接字接收数据并写入指定的字节数组。 |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) | 从套接字接收数据并写入指定的字节数组。 |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) | 从套接字接收数据并写入指定的字节数组。 |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, SocketFlags) | 从套接字接收数据并写入指定的字节数组。 |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, SocketFlags) | 从套接字接收数据并写入指定的字节数组。 |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) | 从套接字接收数据并写入指定的字节数组。 |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>) | 从套接字接收数据并写入指定的字节数组。 |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>) | 从套接字接收数据并写入指定的字节数组。 |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&) | 从套接字接收数据并写入指定的字节数组。 |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) | 从套接字接收数据并写入指定的字节数组。 |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) | 从套接字接收数据并写入指定的字节数组。 |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) | 从套接字接收数据并写入指定的字节数组。 |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | 从套接字接收数据并写入指定的字节数组。 |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | 从套接字接收数据并写入指定的字节数组。 |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) | 从套接字接收数据并写入指定的字节数组。 |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) | 从套接字接收数据并写入指定的字节数组集合。 |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) | 从套接字接收数据并写入指定的字节数组集合。 |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) | 从套接字接收数据并写入指定的字节数组集合。 |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | 从指定的端点接收数据并写入指定的字节数组。 |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | 从指定的端点接收数据并写入指定的字节数组。 |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | 从指定的端点接收数据并写入指定的字节数组。 |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | 从指定的端点接收数据并写入指定的字节数组。 |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | 从指定的端点接收数据并写入指定的字节数组。 |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | 从指定的端点接收数据并写入指定的字节数组。 |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | 从指定的端点接收数据并写入指定的字节数组。 |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | 从指定的端点接收数据并写入指定的字节数组。 |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | 从指定的端点接收数据并写入指定的字节数组。 |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) | 从指定的端点接收数据并写入指定的字节数组。 |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) | 从指定的端点接收数据并写入指定的字节数组。 |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>\&) | 从指定的端点接收数据并写入指定的字节数组。 |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | 从指定的端点接收数据并写入指定的字节数组。 |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | 从指定的端点接收数据并写入指定的字节数组。 |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | 从指定的端点接收数据并写入指定的字节数组。 |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) | 将指定的数据发送到套接字。 |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) | 将指定的数据发送到套接字。 |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) | 将指定的数据发送到套接字。 |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, SocketFlags) | 将指定的数据发送到套接字。 |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, SocketFlags) | 将指定的数据发送到套接字。 |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) | 将指定的数据发送到套接字。 |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>) | 将指定的数据发送到套接字。 |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>) | 将指定的数据发送到套接字。 |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&) | 将指定的数据发送到套接字。 |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) | 将指定的数据发送到套接字。 |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) | 将指定的数据发送到套接字。 |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) | 将指定的数据发送到套接字。 |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) | 将指定的数据发送到套接字。 |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) | 将指定的数据发送到套接字。 |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) | 将指定的数据发送到套接字。 |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | 将指定的数据发送到套接字。 |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | 将指定的数据发送到套接字。 |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) | 将指定的数据发送到套接字。 |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | 将指定的数据发送到指定的端点。 |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | 将指定的数据发送到指定的端点。 |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | 将指定的数据发送到指定的端点。 |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | 将指定的数据发送到指定的端点。 |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | 将指定的数据发送到指定的端点。 |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | 将指定的数据发送到指定的端点。 |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) | 将指定的数据发送到指定的端点。 |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) | 将指定的数据发送到指定的端点。 |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags, System::SharedPtr\<EndPoint\>) | 将指定的数据发送到指定的端点。 |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>) | 将指定的数据发送到指定的端点。 |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>) | 将指定的数据发送到指定的端点。 |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>) | 将指定的数据发送到指定的端点。 |
| [set_Blocking](./set_blocking/)(bool) | 设置一个指示套接字是否处于阻塞模式的值。 |
| [set_ConnectionTimeout](./set_connectiontimeout/)(int32_t) | 设置连接超时。 |
| [set_DontFragment](./set_dontfragment/)(bool) | 设置一个指示套接字是否允许 IP 数据报被分片的值。 |
| [set_DualMode](./set_dualmode/)(bool) | 设置一个值，指示套接字是否处于双模式。 |
| [set_EnableBroadcast](./set_enablebroadcast/)(bool) | 设置一个值，指示套接字是否允许广播数据包。 |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | 设置一个值，指示是否只能有一个进程将套接字绑定到端口。 |
| [set_LingerState](./set_lingerstate/)(System::SharedPtr\<LingerOption\>) | 设置一个值，指示套接字是否会延迟关闭以尝试发送所有未完成的数据。 |
| [set_MulticastLoopback](./set_multicastloopback/)(bool) | 设置一个值，指示套接字是否接收外发的多播数据包。 |
| [set_NoDelay](./set_nodelay/)(bool) | 设置一个值，指示套接字是否使用 Nagle 算法。 |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | 设置接收缓冲区大小。 |
| [set_ReceiveTimeout](./set_receivetimeout/)(int32_t) | 设置一个时间段，在此之后 'Receive' 调用将超时。 |
| [set_SendBufferSize](./set_sendbuffersize/)(int32_t) | 设置发送缓冲区大小。 |
| [set_SendTimeout](./set_sendtimeout/)(int32_t) | 设置一个时间段，在此之后 'Send' 调用将超时。 |
| [set_Ttl](./set_ttl/)(int16_t) | 设置 TTL 值。 |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, int32_t) | 将指定的套接字选项设置为指定的值。 |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) | 将指定的套接字选项设置为指定的值。 |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, bool) | 将指定的套接字选项设置为指定的值。 |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, System::SharedPtr\<Object\>) | 将指定的套接字选项设置为指定的值。 |
| [Shutdown](./shutdown/)(SocketShutdown) | 禁用套接字的发送和接收操作。 |
| [Socket](./socket/)(System::Net::Sockets::SocketType, System::Net::Sockets::ProtocolType) | 构造一个新实例。 |
| [Socket](./socket/)(System::Net::Sockets::AddressFamily, System::Net::Sockets::SocketType, System::Net::Sockets::ProtocolType) | 构造一个新实例。 |
| virtual [~Socket](./~socket/)() | 销毁当前实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [ImplPtr](./implptr/) | 套接字实现。 |
## 另见

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
