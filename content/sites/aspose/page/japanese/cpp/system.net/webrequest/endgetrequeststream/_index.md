---
title: "System::Net::WebRequest::EndGetRequestStream メソッド"
linktitle: "EndGetRequestStream"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::WebRequest::EndGetRequestStream メソッド。C++ でストリーム取得のための指定された非同期操作が完了するまで待機します。"
type: docs
weight: 1200
url: /ja/cpp/system.net/webrequest/endgetrequeststream/
---
## WebRequest::EndGetRequestStream method


指定されたストリーム取得の非同期操作が完了するまで待機します。

```cpp
virtual System::SharedPtr<IO::Stream> System::Net::WebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | ストリーム取得の非同期操作を表す [IAsyncResult](../../../system/iasyncresult/) オブジェクト。 |

### ReturnValue

リソースにデータを書き込むためのストリーム。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
