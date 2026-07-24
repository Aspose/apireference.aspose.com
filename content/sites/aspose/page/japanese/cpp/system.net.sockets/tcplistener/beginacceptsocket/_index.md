---
title: "System::Net::Sockets::TcpListener::BeginAcceptSocket メソッド"
linktitle: "BeginAcceptSocket"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::TcpListener::BeginAcceptSocket メソッド。C++ で非同期受け入れ操作を開始します。"
type: docs
weight: 500
url: /ja/cpp/system.net.sockets/tcplistener/beginacceptsocket/
---
## TcpListener::BeginAcceptSocket method


非同期の accept 操作を開始します。

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpListener::BeginAcceptSocket(AsyncCallback callback, System::SharedPtr<Object> state)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| コールバック | AsyncCallback | 操作が完了したときに呼び出されるコールバック。 |
| 状態 | System::SharedPtr\<Object\> | 各非同期接続操作を一意に識別するためにユーザーが提供するデータ。 |

### ReturnValue

開始された非同期受け入れ操作を表す [IAsyncResult](../../../system/iasyncresult/) オブジェクト。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpListener](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
