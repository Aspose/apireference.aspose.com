---
title: "System::Net::Sockets::Socket::BeginReceive メソッド"
linktitle: "BeginReceive"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::Socket::BeginReceive メソッド。非同期書き込み操作を開始します（C++）。"
type: docs
weight: 800
url: /ja/cpp/system.net.sockets/socket/beginreceive/
---
## Socket::BeginReceive method


非同期書き込み操作を開始します。

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginReceive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, AsyncCallback callback, System::SharedPtr<Object> state)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::ArrayPtr\<uint8_t\> | 受信データが代入されるバッファ。 |
| offset | int32_t | 指定された配列内のバイト単位のオフセットです。 |
| size | int32_t | 指定された配列の 'offset' パラメータから開始するバイト数。 |
| socketFlags | SocketFlags | 受信の振る舞い。 |
| コールバック | AsyncCallback | 操作が完了したときに呼び出されるコールバック。 |
| 状態 | System::SharedPtr\<Object\> | 各非同期受信操作を一意に識別するためにユーザーが提供するデータ。 |

### ReturnValue

開始された非同期受信操作を表す [IAsyncResult](../../../system/iasyncresult/) オブジェクトです。

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
