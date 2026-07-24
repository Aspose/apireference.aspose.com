---
title: "System::Net::Sockets::UdpClient::Connect 方法"
linktitle: "Connect"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::Sockets::UdpClient::Connect 方法。在 C++ 中建立到指定主机上指定端口的连接。"
type: docs
weight: 300
url: /zh/cpp/system.net.sockets/udpclient/connect/
---
## UdpClient::Connect(String, int32_t) method


在指定主机上建立到指定端口的连接。

```cpp
void System::Net::Sockets::UdpClient::Connect(String hostname, int32_t port)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 主机名 | 字符串 | 您打算连接的远程 DNS 主机的名称。 |
| port | int32_t | 您打算进行通信的本地端口号。 |

## 另见

* Class [String](../../../system/string/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Connect(System::SharedPtr\<IPAddress\>, int32_t) method


在指定端口上与指定地址的主机建立连接。

```cpp
void System::Net::Sockets::UdpClient::Connect(System::SharedPtr<IPAddress> addr, int32_t port)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| addr | System::SharedPtr\<IPAddress\> | 要发送数据的远程主机的 [IPAddress](../../../system.net/ipaddress/)。 |
| port | int32_t | 您打算进行通信的本地端口号。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Connect(System::SharedPtr\<IPEndPoint\>) method


与远程端点建立连接。

```cpp
void System::Net::Sockets::UdpClient::Connect(System::SharedPtr<IPEndPoint> endPoint)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 端点 | System::SharedPtr\<IPEndPoint\> | 您绑定 UDP 连接的端点。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
