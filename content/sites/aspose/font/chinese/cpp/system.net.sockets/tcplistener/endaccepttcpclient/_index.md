---
title: "System::Net::Sockets::TcpListener::EndAcceptTcpClient 方法"
linktitle: "EndAcceptTcpClient"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Sockets::TcpListener::EndAcceptTcpClient 方法。等待指定的异步接受操作在 C++ 中完成。"
type: docs
weight: 800
url: /zh/cpp/system.net.sockets/tcplistener/endaccepttcpclient/
---
## TcpListener::EndAcceptTcpClient method


等待直到指定的异步接受操作完成。

```cpp
System::SharedPtr<TcpClient> System::Net::Sockets::TcpListener::EndAcceptTcpClient(System::SharedPtr<IAsyncResult> asyncResult)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 一个表示异步接受操作的 [IAsyncResult](../../../system/iasyncresult/) 对象。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TcpClient](../../tcpclient/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [TcpListener](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
