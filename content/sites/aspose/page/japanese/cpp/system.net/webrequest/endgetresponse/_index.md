---
title: "System::Net::WebRequest::EndGetResponse メソッド"
linktitle: "EndGetResponse"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::WebRequest::EndGetResponse メソッド。C++ で指定されたリソースの非同期リクエストが完了するまで待機します。"
type: docs
weight: 1300
url: /ja/cpp/system.net/webrequest/endgetresponse/
---
## WebRequest::EndGetResponse method


指定されたリソースへの非同期リクエストが完了するまで待機します。

```cpp
virtual System::SharedPtr<WebResponse> System::Net::WebRequest::EndGetResponse(System::SharedPtr<IAsyncResult> asyncResult)=0
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
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
