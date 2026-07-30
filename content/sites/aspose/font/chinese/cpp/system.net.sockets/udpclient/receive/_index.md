---
title: "System::Net::Sockets::UdpClient::Receive 方法"
linktitle: "接收"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Sockets::UdpClient::Receive 方法。返回服务器发送的数据报（在 C++ 中）。"
type: docs
weight: 600
url: /zh/cpp/system.net.sockets/udpclient/receive/
---
## UdpClient::Receive method


返回服务器发送的数据报。

```cpp
System::ArrayPtr<uint8_t> System::Net::Sockets::UdpClient::Receive(System::SharedPtr<IPEndPoint> &remoteEP)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| remoteEP | System::SharedPtr\<IPEndPoint\>\& | 一个表示发送数据的远程主机的 [IPEndPoint](../../../system.net/ipendpoint/)。 |

### ReturnValue

一个字节数组，用于接收数据的赋值。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
