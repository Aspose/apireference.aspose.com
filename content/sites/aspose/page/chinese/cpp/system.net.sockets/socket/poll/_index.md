---
title: "System::Net::Sockets::Socket::Poll 方法"
linktitle: "Poll"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::Sockets::Socket::Poll 方法。根据指定的轮询模式返回套接字的状态（在 C++ 中）。"
type: docs
weight: 4200
url: /zh/cpp/system.net.sockets/socket/poll/
---
## Socket::Poll method


根据指定的轮询模式返回套接字的状态。

```cpp
bool System::Net::Sockets::Socket::Poll(int32_t microSeconds, SelectMode mode)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| microSeconds | int32_t | 等待响应的时间量（以毫秒为单位）。 |
| mode | SelectMode | 轮询模式。 |

### ReturnValue

基于指定轮询模式的套接字状态。

## 另见

* Enum [SelectMode](../../selectmode/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
