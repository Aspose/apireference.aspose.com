---
title: "System::Net::Sockets::Socket::Connect 方法"
linktitle: "Connect"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::Sockets::Socket::Connect 方法。建立到指定远程端点的连接（在 C++ 中）。"
type: docs
weight: 1200
url: /zh/cpp/system.net.sockets/socket/connect/
---
## Socket::Connect(String, int32_t) method


建立到指定远程端点的连接。

```cpp
void System::Net::Sockets::Socket::Connect(String host, int32_t port)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| host | 字符串 | 远程主机名。 |
| port | int32_t | 远程主机的端口号。 |

## 另见

* Class [String](../../../system/string/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Connect(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t) method


建立到指定远程端点的连接。

```cpp
void System::Net::Sockets::Socket::Connect(System::ArrayPtr<System::SharedPtr<IPAddress>> addresses, int32_t port)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| addresses | System::ArrayPtr\<System::SharedPtr\<IPAddress\>\> | 远程主机的 IP 地址集合。 |
| port | int32_t | 远程主机的端口号。 |

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Connect(System::SharedPtr\<EndPoint\>) method


建立到指定远程端点的连接。

```cpp
void System::Net::Sockets::Socket::Connect(System::SharedPtr<EndPoint> remoteEP)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| remoteEP | System::SharedPtr\<EndPoint\> | 远程端点。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Connect(System::SharedPtr\<IPAddress\>, int32_t) method


建立到指定远程端点的连接。

```cpp
void System::Net::Sockets::Socket::Connect(System::SharedPtr<IPAddress> address, int32_t port)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 地址 | System::SharedPtr\<IPAddress\> | 远程主机的 IP 地址。 |
| port | int32_t | 远程主机的端口号。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
