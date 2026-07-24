---
title: "System::Net::HttpWebRequest::BeginGetRequestStream メソッド"
linktitle: "BeginGetRequestStream"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::HttpWebRequest::BeginGetRequestStream メソッド。C++ でリソースにデータを書き込むためのストリームを取得する非同期操作を開始します。"
type: docs
weight: 400
url: /ja/cpp/system.net/httpwebrequest/begingetrequeststream/
---
## HttpWebRequest::BeginGetRequestStream method


リソースにデータを書き込むためのストリームを取得する非同期操作を開始します。

```cpp
System::SharedPtr<IAsyncResult> System::Net::HttpWebRequest::BeginGetRequestStream(AsyncCallback callback, System::SharedPtr<Object> state) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| コールバック | AsyncCallback | 操作が完了したときに呼び出されるコールバックです。 |
| 状態 | System::SharedPtr\<Object\> | 各非同期操作を一意に識別するためにユーザーが提供するデータです。 |

### ReturnValue

開始された非同期操作を表す [IAsyncResult](../../../system/iasyncresult/) オブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
