---
title: "System::Net::FileWebRequest::BeginGetResponse method"
linktitle: "BeginGetResponse"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::FileWebRequest::BeginGetResponse メソッド。C++ でリソースに対する非同期リクエストを開始します。"
type: docs
weight: 400
url: /ja/cpp/system.net/filewebrequest/begingetresponse/
---
## FileWebRequest::BeginGetResponse method


リソースに対する非同期リクエストを開始します。

```cpp
System::SharedPtr<IAsyncResult> System::Net::FileWebRequest::BeginGetResponse(AsyncCallback callback, System::SharedPtr<Object> state) override
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
