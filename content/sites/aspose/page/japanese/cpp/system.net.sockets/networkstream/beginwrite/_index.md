---
title: "System::Net::Sockets::NetworkStream::BeginWrite method"
linktitle: "BeginWrite"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::NetworkStream::BeginWrite method. C++ で非同期書き込み操作を開始します。"
type: docs
weight: 400
url: /ja/cpp/system.net.sockets/networkstream/beginwrite/
---
## NetworkStream::BeginWrite method


非同期書き込み操作を開始します。

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::NetworkStream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, AsyncCallback callback, System::SharedPtr<Object> state) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::ArrayPtr\<uint8_t\> | 書き込むデータを含むバッファ |
| offset | int32_t | 指定された配列内のバイト単位のオフセットです。 |
| size | int32_t | 書き込むバイト数 |
| コールバック | AsyncCallback | 操作が完了したときに呼び出されるコールバックです。 |
| 状態 | System::SharedPtr\<Object\> | 各非同期書き込み操作を一意に識別するためにユーザーが提供するデータ |

### ReturnValue

開始された非同期書き込み操作を表す [IAsyncResult](../../../system/iasyncresult/) オブジェクト

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
