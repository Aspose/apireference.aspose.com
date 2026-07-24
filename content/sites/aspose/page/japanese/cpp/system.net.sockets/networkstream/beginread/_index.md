---
title: "System::Net::Sockets::NetworkStream::BeginRead メソッド"
linktitle: "BeginRead"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::NetworkStream::BeginRead メソッド。非同期読み取り操作を開始します（C++）。"
type: docs
weight: 300
url: /ja/cpp/system.net.sockets/networkstream/beginread/
---
## NetworkStream::BeginRead method


非同期読み取り操作を開始します。

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::NetworkStream::BeginRead(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, AsyncCallback callback, System::SharedPtr<Object> state) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::ArrayPtr\<uint8_t\> | 読み取ったバイトが書き込まれるバイト配列です。 |
| offset | int32_t | 指定された配列内のバイト単位のオフセットです。 |
| size | int32_t | 読み取るバイト数です。 |
| コールバック | AsyncCallback | 操作が完了したときに呼び出されるコールバックです。 |
| 状態 | System::SharedPtr\<Object\> | 各非同期読み取り操作を一意に識別するためにユーザーが提供するデータです。 |

### ReturnValue

開始された非同期読み取り操作を表す [IAsyncResult](../../../system/iasyncresult/) オブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
