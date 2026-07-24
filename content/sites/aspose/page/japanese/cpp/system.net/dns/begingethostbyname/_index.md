---
title: "System::Net::Dns::BeginGetHostByName メソッド"
linktitle: "BeginGetHostByName"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Dns::BeginGetHostByName メソッド。C++ で指定されたホスト名を使用して新しい IPHostEntry-class インスタンスを作成する非同期操作を開始します。"
type: docs
weight: 200
url: /ja/cpp/system.net/dns/begingethostbyname/
---
## Dns::BeginGetHostByName method


指定されたホスト名を使用して、新しい IPHostEntry-class インスタンスを作成する非同期操作を開始します。

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostByName(String hostName, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| hostName | String | ホスト名です。 |
| requestCallback | AsyncCallback | 操作が完了したときに呼び出されるコールバックです。 |
| stateObject | System::SharedPtr\<Object\> | 各非同期操作を一意に識別するためにユーザーが提供するデータです。 |

### ReturnValue

開始された非同期操作を表す [IAsyncResult](../../../system/iasyncresult/) オブジェクトです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [String](../../../system/string/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
