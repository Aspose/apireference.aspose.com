---
title: "System::Net::Sockets::TcpListener::BeginAcceptTcpClient 方法"
linktitle: "BeginAcceptTcpClient"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::Sockets::TcpListener::BeginAcceptTcpClient 方法。启动一个异步接受操作（C++）。"
type: docs
weight: 600
url: /zh/cpp/system.net.sockets/tcplistener/beginaccepttcpclient/
---
## TcpListener::BeginAcceptTcpClient method


启动异步接受操作。

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpListener::BeginAcceptTcpClient(AsyncCallback callback, System::SharedPtr<Object> state)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 回调 | AsyncCallback | 操作完成时将被调用的回调。 |
| 状态 | System::SharedPtr\<Object\> | 用户提供的数据，用于唯一标识每个异步连接操作。 |

### ReturnValue

一个表示已启动的异步接受操作的[IAsyncResult](../../../system/iasyncresult/)对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpListener](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
