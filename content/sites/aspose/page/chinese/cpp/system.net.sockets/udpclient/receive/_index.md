---
title: "System::Net::Sockets::UdpClient::Receive method"
linktitle: "接收"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::Sockets::UdpClient::Receive method. 在 C++ 中返回服务器发送的数据报。"
type: docs
weight: 600
url: /zh/cpp/system.net.sockets/udpclient/receive/
---
## UdpClient::Receive method


返回服务器发送的数据报。

```cpp
System::ArrayPtr<uint8_t> System::Net::Sockets::UdpClient::Receive(System::SharedPtr<IPEndPoint> &remoteEP)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| remoteEP | System::SharedPtr\<IPEndPoint\>\& | 一个 [IPEndPoint](../../../system.net/ipendpoint/)，表示发送数据的远程主机。 |

### ReturnValue

一个字节数组，用于接收数据。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
