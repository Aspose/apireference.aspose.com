---
title: "System::Net::Sockets::TcpClient::Connect 方法"
linktitle: "Connect"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::Sockets::TcpClient::Connect 方法。建立到指定远程主机的连接（C++）。"
type: docs
weight: 500
url: /zh/cpp/system.net.sockets/tcpclient/connect/
---
## TcpClient::Connect(String, int32_t) method


建立到指定远程主机的连接。

```cpp
void System::Net::Sockets::TcpClient::Connect(String hostname, int32_t port)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 主机名 | 字符串 | 要连接的远程主机名。 |
| port | int32_t | 要连接的远程主机端口。 |

## 另见

* Class [String](../../../system/string/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## TcpClient::Connect(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t) method


建立到指定远程主机的连接。

```cpp
void System::Net::Sockets::TcpClient::Connect(System::ArrayPtr<System::SharedPtr<IPAddress>> ipAddresses, int32_t port)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| ipAddresses | System::ArrayPtr\<System::SharedPtr\<IPAddress\>\> | 远程主机的 IP 地址。 |
| port | int32_t | 要连接的远程主机端口。 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## TcpClient::Connect(System::SharedPtr\<IPAddress\>, int32_t) method


建立到指定远程主机的连接。

```cpp
void System::Net::Sockets::TcpClient::Connect(System::SharedPtr<IPAddress> address, int32_t port)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 地址 | System::SharedPtr\<IPAddress\> | 远程主机的 IP 地址。 |
| port | int32_t | 要连接的远程主机端口。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## TcpClient::Connect(System::SharedPtr\<IPEndPoint\>) method


建立到指定远程主机的连接。

```cpp
void System::Net::Sockets::TcpClient::Connect(System::SharedPtr<IPEndPoint> remoteEP)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| remoteEP | System::SharedPtr\<IPEndPoint\> | 要连接的远程主机。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
