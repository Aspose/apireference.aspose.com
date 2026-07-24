---
title: "System::Net::Dns::BeginResolve メソッド"
linktitle: "BeginResolve"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Dns::BeginResolve メソッド。指定されたホスト名を使用して新しい IPHostEntry クラスのインスタンスを作成する非同期操作を開始します（C++）。"
type: docs
weight: 400
url: /ja/cpp/system.net/dns/beginresolve/
---
## Dns::BeginResolve method


指定されたホスト名を使用して、新しい IPHostEntry-class インスタンスを作成する非同期操作を開始します。

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginResolve(String hostName, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| hostName | String | 新しい [IPHostEntry](../../iphostentry/) クラスのインスタンスを作成するために使用されるホスト名です。 |
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
