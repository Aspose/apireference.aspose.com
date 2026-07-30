---
title: "System::Net::Sockets::TcpListener 类"
linktitle: "TcpListener"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Sockets::TcpListener 类。表示 TCP 网络服务的监听器。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 600
url: /zh/cpp/system.net.sockets/tcplistener/
---
## TcpListener class


表示 TCP 网络服务的监听器。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class TcpListener : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AcceptSocket](./acceptsocket/)() | 接受挂起的连接请求并返回用于发送和接收数据的套接字。 |
| [AcceptTcpClient](./accepttcpclient/)() | 接受挂起的连接请求并返回用于发送和接收数据的 TcpClient 类实例。 |
| [AllowNatTraversal](./allownattraversal/)(bool) | 启用或禁用 NAT 穿透。 |
| [BeginAcceptSocket](./beginacceptsocket/)(AsyncCallback, System::SharedPtr\<Object\>) | 启动异步接受操作。 |
| [BeginAcceptTcpClient](./beginaccepttcpclient/)(AsyncCallback, System::SharedPtr\<Object\>) | 启动异步接受操作。 |
| static [Create](./create/)(int32_t) | 使用指定的端口号创建一个新实例。 |
| [EndAcceptSocket](./endacceptsocket/)(System::SharedPtr\<IAsyncResult\>) | 等待直到指定的异步接受操作完成。 |
| [EndAcceptTcpClient](./endaccepttcpclient/)(System::SharedPtr\<IAsyncResult\>) | 等待直到指定的异步接受操作完成。 |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | 获取一个值，指示当前实例是否只允许一个客户端使用端口。 |
| [get_LocalEndpoint](./get_localendpoint/)() | 返回底层端点。 |
| [get_Server](./get_server/)() | RTTI 信息。 |
| [Pending](./pending/)() | 返回一个值，指示是否有挂起的连接请求。 |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | 设置一个值，指示当前实例是否只允许一个客户端使用端口。 |
| [Start](./start/)() | 开始监听传入的连接。 |
| [Start](./start/)(int32_t) | 开始监听传入的连接。 |
| [Stop](./stop/)() | 停止监听传入的连接。 |
| [TcpListener](./tcplistener/)(System::SharedPtr\<IPEndPoint\>) | 构造一个新实例。 |
| [TcpListener](./tcplistener/)(System::SharedPtr\<IPAddress\>, int32_t) | 构造一个新实例。 |
| [TcpListener](./tcplistener/)(int32_t) | 构造一个新实例。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
