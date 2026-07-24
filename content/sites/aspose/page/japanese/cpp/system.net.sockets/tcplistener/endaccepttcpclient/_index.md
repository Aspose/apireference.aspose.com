---
title: "System::Net::Sockets::TcpListener::EndAcceptTcpClient メソッド"
linktitle: "EndAcceptTcpClient"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::TcpListener::EndAcceptTcpClient メソッド。指定された非同期受け入れ操作が完了するまで C++ で待機します。"
type: docs
weight: 800
url: /ja/cpp/system.net.sockets/tcplistener/endaccepttcpclient/
---
## TcpListener::EndAcceptTcpClient method


指定された非同期 accept 操作が完了するまで待機します。

```cpp
System::SharedPtr<TcpClient> System::Net::Sockets::TcpListener::EndAcceptTcpClient(System::SharedPtr<IAsyncResult> asyncResult)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 非同期受け入れ操作を表す [IAsyncResult](../../../system/iasyncresult/) オブジェクトです。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TcpClient](../../tcpclient/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [TcpListener](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
