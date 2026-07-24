---
title: "System::IO::Stream::BeginWrite メソッド"
linktitle: "BeginWrite"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::Stream::BeginWrite メソッド。C++ で非同期書き込み操作を開始します。"
type: docs
weight: 200
url: /ja/cpp/system.io/stream/beginwrite/
---
## Stream::BeginWrite method


非同期書き込み操作を開始します。

```cpp
virtual System::SharedPtr<System::IAsyncResult> System::IO::Stream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int offset, int count, System::AsyncCallback callback, System::SharedPtr<System::Object> state)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::ArrayPtr\<uint8_t\> | 書き込むデータを含むバッファ |
| offset | int | **buffer** 内の 0 ベースのオフセットで、書き込みデータが開始する位置を示します |
| count | int | 書き込むバイト数 |
| コールバック | System::AsyncCallback | 操作が完了したときに呼び出されるコールバック |
| 状態 | System::SharedPtr\<System::Object\> | 各非同期書き込み操作を一意に識別するためにユーザーが提供するデータ |

### ReturnValue

開始された非同期書き込み操作を表す [IAsyncResult](../../../system/iasyncresult/) オブジェクト

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
