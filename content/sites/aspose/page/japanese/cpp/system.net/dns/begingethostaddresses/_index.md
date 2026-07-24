---
title: "System::Net::Dns::BeginGetHostAddresses メソッド"
linktitle: "BeginGetHostAddresses"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Dns::BeginGetHostAddresses メソッド。ホスト名または IP アドレスを含む指定された文字列を使用して、新しい IPHostEntry クラスのインスタンスを作成する非同期操作を C++ で開始します。"
type: docs
weight: 100
url: /ja/cpp/system.net/dns/begingethostaddresses/
---
## Dns::BeginGetHostAddresses method


指定されたホスト名またはIPアドレスを含む文字列を使用して、新しい IPHostEntry-class インスタンスを作成する非同期操作を開始します。

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostAddresses(String hostNameOrAddress, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| hostNameOrAddress | String | ホスト名またはIPアドレスを含む文字列です。 |
| requestCallback | AsyncCallback | 操作が完了したときに呼び出されるコールバックです。 |
| 状態 | System::SharedPtr\<Object\> | 各非同期操作を一意に識別するためにユーザーが提供するデータです。 |

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
