---
title: "System::Net::Sockets::UdpClient 类"
linktitle: "UdpClient"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::Sockets::UdpClient 类。提供用户数据报协议（UDP）网络服务。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 700
url: /zh/cpp/system.net.sockets/udpclient/
---
## UdpClient class


提供用户数据报协议（UDP）网络服务。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数中作为参数传递。

```cpp
class UdpClient : public System::IDisposable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Close](./close/)() | 关闭 UDP 连接。 |
| [Connect](./connect/)(String, int32_t) | 在指定主机上建立到指定端口的连接。 |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | 在指定端口上与指定地址的主机建立连接。 |
| [Connect](./connect/)(System::SharedPtr\<IPEndPoint\>) | 与远程端点建立连接。 |
| [Dispose](./dispose/)() override | 释放 [UdpClient](./) 使用的托管和非托管资源。 |
| [get_Client](./get_client/)() | RTTI 信息。 |
| [Receive](./receive/)(System::SharedPtr\<IPEndPoint\>\&) | 返回服务器发送的数据报。 |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, System::SharedPtr\<IPEndPoint\>) | 向远程端点的主机发送 UDP 数据报。 |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, String, int32_t) | 向指定远程主机的指定端口发送 UDP 数据报。 |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t) | 向远程主机发送 UDP 数据报。 |
| [set_Client](./set_client/)(System::SharedPtr\<Socket\>) | 用于提供底层网络套接字。 |
| [UdpClient](./udpclient/)() | 初始化 [UdpClient](./) 类的新实例。 |
| [UdpClient](./udpclient/)(AddressFamily) | 初始化 [UdpClient](./) 类的新实例。 |
| [UdpClient](./udpclient/)(int32_t) | 初始化 [UdpClient](./) 类的新实例。 |
| [UdpClient](./udpclient/)(int32_t, AddressFamily) | 初始化 [UdpClient](./) 类的新实例。 |
| [UdpClient](./udpclient/)(System::SharedPtr\<IPEndPoint\>) | 初始化 [UdpClient](./) 类的新实例。参数 local EP 本地端点，您将其绑定到 UDP 连接。 |
| [UdpClient](./udpclient/)(String, int32_t) | 创建 [UdpClient](./) 类的新实例，并连接到指定端口上的指定远程主机。 |
## 另见

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
