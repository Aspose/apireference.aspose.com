---
title: "System::Net::Sockets::UdpClient::Connect 方法"
linktitle: "Connect"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Sockets::UdpClient::Connect 方法。建立与指定主机上指定端口的连接（C++）。"
type: docs
weight: 300
url: /zh/cpp/system.net.sockets/udpclient/connect/
---
## UdpClient::Connect(String, int32_t) method


在指定的主机上建立到指定端口的连接。

```cpp
void System::Net::Sockets::UdpClient::Connect(String hostname, int32_t port)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| hostname | String | 您打算连接的远程 DNS 主机的名称。 |
| port | int32_t | 您打算通信的本地端口号。 |

## 另见

* Class [String](../../../system/string/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## UdpClient::Connect(System::SharedPtr\<IPAddress\>, int32_t) method


在指定端口上与位于指定地址的主机建立连接。

```cpp
void System::Net::Sockets::UdpClient::Connect(System::SharedPtr<IPAddress> addr, int32_t port)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| addr | System::SharedPtr\<IPAddress\> | 用于发送数据的远程主机的 [IPAddress](../../../system.net/ipaddress/)。 |
| port | int32_t | 您打算通信的本地端口号。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## UdpClient::Connect(System::SharedPtr\<IPEndPoint\>) method


建立到远程端点的连接。

```cpp
void System::Net::Sockets::UdpClient::Connect(System::SharedPtr<IPEndPoint> endPoint)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| endPoint | System::SharedPtr\<IPEndPoint\> | 您绑定 UDP 连接的端点。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
