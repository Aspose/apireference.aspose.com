---
title: "System::Net::Sockets::TcpClient 类"
linktitle: "TcpClient"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Sockets::TcpClient 类。表示用于 TCP 网络服务的客户端。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 500
url: /zh/cpp/system.net.sockets/tcpclient/
---
## TcpClient class


表示用于 TCP 网络服务的客户端。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class TcpClient : public System::IDisposable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [BeginConnect](./beginconnect/)(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | 发起异步连接操作。 |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | 发起异步连接操作。 |
| [BeginConnect](./beginconnect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | 发起异步连接操作。 |
| [Close](./close/)() | 关闭连接并释放当前实例。 |
| [Connect](./connect/)(String, int32_t) | 建立到指定远程主机的连接。 |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | 建立到指定远程主机的连接。 |
| [Connect](./connect/)(System::SharedPtr\<IPEndPoint\>) | 建立到指定远程主机的连接。 |
| [Connect](./connect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t) | 建立到指定远程主机的连接。 |
| [EndConnect](./endconnect/)(System::SharedPtr\<IAsyncResult\>) | 等待指定的异步连接操作完成。 |
| [get_Available](./get_available/)() | 返回已接收且准备读取的字节数。 |
| [get_Client](./get_client/)() | RTTI 信息。 |
| [get_Connected](./get_connected/)() | 返回指示套接字是否已连接到远程主机的值。 |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | 获取一个值，指示当前实例是否只允许一个客户端使用端口。 |
| [get_LingerState](./get_lingerstate/)() | 获取指示套接字是否会延迟关闭以尝试发送所有挂起数据的值。 |
| [get_NoDelay](./get_nodelay/)() | 获取一个值，指示当前实例是否使用 Nagle 算法。 |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | 获取用于接收数据的缓冲区大小。 |
| [get_ReceiveTimeout](./get_receivetimeout/)() | 获取一个值，指示在此时间段后数据接收将超时。 |
| [get_SendBufferSize](./get_sendbuffersize/)() | 获取用于发送数据的缓冲区大小。 |
| [get_SendTimeout](./get_sendtimeout/)() | 获取一个值，该值指示在此时间之后数据发送将超时。 |
| [GetStream](./getstream/)() | 返回用于发送和接收数据的流。 |
| [set_Client](./set_client/)(System::SharedPtr\<Socket\>) | 设置套接字。 |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | 设置一个值，指示当前实例是否只允许一个客户端使用端口。 |
| [set_LingerState](./set_lingerstate/)(System::SharedPtr\<LingerOption\>) | 设置一个值，指示套接字是否会延迟关闭以尝试发送所有未完成的数据。 |
| [set_NoDelay](./set_nodelay/)(bool) | 设置一个值，以指示当前实例是否使用 Nagle 算法。 |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | 设置用于接收数据的缓冲区大小。 |
| [set_ReceiveTimeout](./set_receivetimeout/)(int32_t) | 设置一个值，该值指示在此时间之后数据接收将超时。 |
| [set_SendBufferSize](./set_sendbuffersize/)(int32_t) | 设置用于发送数据的缓冲区大小。 |
| [set_SendTimeout](./set_sendtimeout/)(int32_t) | 设置一个值，该值指示在此时间之后数据发送将超时。 |
| [TcpClient](./tcpclient/)(System::SharedPtr\<IPEndPoint\>) | 构造一个新实例。 |
| [TcpClient](./tcpclient/)() | 构造一个新实例。 |
| [TcpClient](./tcpclient/)(AddressFamily) | 构造一个新实例。 |
| [TcpClient](./tcpclient/)(String, int32_t) | 构造一个新实例。 |
| virtual [~TcpClient](./~tcpclient/)() | 销毁当前实例。 |
## 另见

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
