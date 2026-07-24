---
title: "System::Net::Security::SslStream::BeginWrite メソッド"
linktitle: "BeginWrite"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Security::SslStream::BeginWrite メソッド。C++ で非同期書き込み操作を開始します。"
type: docs
weight: 400
url: /ja/cpp/system.net.security/sslstream/beginwrite/
---
## SslStream::BeginWrite method


非同期書き込み操作を開始します。

```cpp
System::SharedPtr<IAsyncResult> System::Net::Security::SslStream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t count, AsyncCallback asyncCallback, System::SharedPtr<Object> asyncState) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | System::ArrayPtr\<uint8_t\> | データを書き込むバイト配列。 |
| offset | int32_t | 指定された配列内のバイト単位のオフセットです。 |
| count | int32_t | 書き込むバイト数 |
| asyncCallback | AsyncCallback | 操作が完了したときに呼び出されるコールバックです。 |
| asyncState | System::SharedPtr\<Object\> | 各非同期書き込み操作を一意に識別するためにユーザーが提供するデータ |

### ReturnValue

開始された非同期書き込み操作を表す [IAsyncResult](../../../system/iasyncresult/) オブジェクト

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
