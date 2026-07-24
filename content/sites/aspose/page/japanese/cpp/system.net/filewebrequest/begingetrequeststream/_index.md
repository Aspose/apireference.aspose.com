---
title: "System::Net::FileWebRequest::BeginGetRequestStream method"
linktitle: "BeginGetRequestStream"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::FileWebRequest::BeginGetRequestStream メソッド。C++ でリソースにデータを書き込むためのストリームを取得する非同期操作を開始します。"
type: docs
weight: 300
url: /ja/cpp/system.net/filewebrequest/begingetrequeststream/
---
## FileWebRequest::BeginGetRequestStream method


リソースにデータを書き込むためのストリームを取得する非同期操作を開始します。

```cpp
System::SharedPtr<IAsyncResult> System::Net::FileWebRequest::BeginGetRequestStream(AsyncCallback callback, System::SharedPtr<Object> state) override
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
* Class [FileWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
