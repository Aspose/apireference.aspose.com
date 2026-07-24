---
title: "System::Net::FileWebRequest::EndGetResponse method"
linktitle: "EndGetResponse"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::FileWebRequest::EndGetResponse メソッド。C++ で指定されたリソースへの非同期リクエストが完了するまで待機します。"
type: docs
weight: 600
url: /ja/cpp/system.net/filewebrequest/endgetresponse/
---
## FileWebRequest::EndGetResponse method


指定されたリソースへの非同期リクエストが完了するまで待機します。

```cpp
virtual System::SharedPtr<WebResponse> System::Net::FileWebRequest::EndGetResponse(System::SharedPtr<IAsyncResult> asyncResult) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | リソースに対する非同期リクエストを表す [IAsyncResult](../../../system/iasyncresult/) オブジェクト。 |

### ReturnValue

Web 応答。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WebResponse](../../webresponse/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [FileWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
