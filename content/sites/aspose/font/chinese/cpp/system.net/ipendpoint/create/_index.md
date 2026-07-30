---
title: "System::Net::IPEndPoint::Create 方法"
linktitle: "Create"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::IPEndPoint::Create 方法。使用指定的 socket 地址在 C++ 中创建 EndPoint 类的新实例。"
type: docs
weight: 200
url: /zh/cpp/system.net/ipendpoint/create/
---
## IPEndPoint::Create method


使用指定的 socket 地址创建 [EndPoint](../../endpoint/) 类的新实例。

```cpp
System::SharedPtr<EndPoint> System::Net::IPEndPoint::Create(System::SharedPtr<SocketAddress> socketAddress) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| socketAddress | System::SharedPtr\<SocketAddress\> | 将用于初始化新实例的 socket 地址。 |

### ReturnValue

新创建的 EndPoint 类实例。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../endpoint/)
* Class [SocketAddress](../../socketaddress/)
* Class [IPEndPoint](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
