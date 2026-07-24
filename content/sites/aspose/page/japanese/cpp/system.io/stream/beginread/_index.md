---
title: "System::IO::Stream::BeginRead メソッド"
linktitle: "BeginRead"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::Stream::BeginRead メソッド。C++ で非同期読み取り操作を開始します。"
type: docs
weight: 100
url: /ja/cpp/system.io/stream/beginread/
---
## Stream::BeginRead method


非同期読み取り操作を開始します。

```cpp
virtual System::SharedPtr<System::IAsyncResult> System::IO::Stream::BeginRead(System::ArrayPtr<uint8_t> buffer, int offset, int count, System::AsyncCallback callback, System::SharedPtr<System::Object> state)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::ArrayPtr\<uint8_t\> | 読み取り先のバッファ |
| offset | int | **buffer** 内の 0 ベースオフセットで、読み取ったデータの書き込み開始位置を示します。 |
| count | int | 読み取るバイト数 |
| コールバック | System::AsyncCallback | 操作が完了したときに呼び出されるコールバック |
| 状態 | System::SharedPtr\<System::Object\> | 各非同期読み取り操作を一意に識別するためにユーザーが提供するデータ |

### ReturnValue

開始された非同期読み取り操作を表す[IAsyncResult](../../../system/iasyncresult/)オブジェクト

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
