---
title: "System::Net::Sockets::UdpClient::Send 方法"
linktitle: "发送"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Sockets::UdpClient::Send 方法。向远程主机发送 UDP 数据报（在 C++ 中）。"
type: docs
weight: 700
url: /zh/cpp/system.net.sockets/udpclient/send/
---
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t) method


向远程主机发送 UDP 数据报。

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | 一个用于发送的 [Byte](../../../system/byte/) 类型数组。 |
| 字节 | int32_t | 数据报中的字节数。 |

### ReturnValue

已发送的字节数。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t, String, int32_t) method


向指定远程主机的指定端口发送 UDP 数据报。

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes, String hostname, int32_t port)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | 用于发送的 [Byte](../../../system/byte/) 类型数组 |
| 字节 | int32_t | 数据报中的字节数。 |
| hostname | String | 远程主机的名称。 |
| port | int32_t | 远程端口号。 |

### ReturnValue

已发送的字节数。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t, System::SharedPtr\<IPEndPoint\>) method


向远程端点的主机发送 UDP 数据报。

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes, System::SharedPtr<IPEndPoint> endPoint)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | 用于发送的 [Byte](../../../system/byte/) 类型数组 |
| 字节 | int32_t | 数据报中的字节数。 |
| endPoint | System::SharedPtr\<IPEndPoint\> | 表示要发送数据报的主机和端口的 [IPEndPoint](../../../system.net/ipendpoint/)。 |

### ReturnValue

已发送的字节数。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
