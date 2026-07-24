---
title: "System::Net::Sockets::Socket::BeginSend メソッド"
linktitle: "BeginSend"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::Socket::BeginSend メソッド。C++ で非同期送信操作を開始します。"
type: docs
weight: 900
url: /ja/cpp/system.net.sockets/socket/beginsend/
---
## Socket::BeginSend method


非同期の送信操作を開始します。

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginSend(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, AsyncCallback callback, System::SharedPtr<Object> state)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::ArrayPtr\<uint8_t\> | データを読み取るためのバッファ。 |
| offset | int32_t | 指定された配列内のバイト単位のオフセットです。 |
| size | int32_t | 指定された配列の 'offset' パラメータから開始するバイト数。 |
| socketFlags | SocketFlags | 送信の動作。 |
| コールバック | AsyncCallback | 操作が完了したときに呼び出されるコールバック。 |
| 状態 | System::SharedPtr\<Object\> | 各非同期送信操作を一意に識別するためにユーザーが提供するデータ。 |

### ReturnValue

開始された非同期送信操作を表す [IAsyncResult](../../../system/iasyncresult/) オブジェクト。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
