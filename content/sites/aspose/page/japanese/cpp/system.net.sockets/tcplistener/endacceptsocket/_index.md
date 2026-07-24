---
title: "System::Net::Sockets::TcpListener::EndAcceptSocket メソッド"
linktitle: "EndAcceptSocket"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::TcpListener::EndAcceptSocket メソッド。指定された非同期受け入れ操作が C++ で完了するまで待機します。"
type: docs
weight: 700
url: /ja/cpp/system.net.sockets/tcplistener/endacceptsocket/
---
## TcpListener::EndAcceptSocket method


指定された非同期 accept 操作が完了するまで待機します。

```cpp
System::SharedPtr<Socket> System::Net::Sockets::TcpListener::EndAcceptSocket(System::SharedPtr<IAsyncResult> asyncResult)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 非同期受け入れ操作を表す [IAsyncResult](../../../system/iasyncresult/) オブジェクトです。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Socket](../../socket/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [TcpListener](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
