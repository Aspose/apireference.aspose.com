---
title: "System::Net::Sockets::Socket::BeginReceive 方法"
linktitle: "BeginReceive"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::Sockets::Socket::BeginReceive 方法。启动一个异步写操作（在 C++ 中）。"
type: docs
weight: 800
url: /zh/cpp/system.net.sockets/socket/beginreceive/
---
## Socket::BeginReceive method


启动异步写入操作。

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginReceive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, AsyncCallback callback, System::SharedPtr<Object> state)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 缓冲区 | System::ArrayPtr\<uint8_t\> | 一个用于接收数据的缓冲区。 |
| offset | int32_t | 指定数组中的字节偏移量。 |
| size | int32_t | 从 'offset' 参数开始的指定数组中的字节数。 |
| socketFlags | SocketFlags | 接收行为。 |
| 回调 | AsyncCallback | 操作完成时将被调用的回调。 |
| 状态 | System::SharedPtr\<Object\> | 用户提供的数据，用于唯一标识每个异步接收操作。 |

### ReturnValue

一个表示已启动的异步接收操作的 [IAsyncResult](../../../system/iasyncresult/) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
