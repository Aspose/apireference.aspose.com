---
title: "System::Net::Dns::EndGetHostAddresses メソッド"
linktitle: "EndGetHostAddresses"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Dns::EndGetHostAddresses メソッド。C++ で新しい IPHostEntry-class インスタンスを作成するための指定された非同期操作が完了するまで待機します。"
type: docs
weight: 500
url: /ja/cpp/system.net/dns/endgethostaddresses/
---
## Dns::EndGetHostAddresses method


指定された新しい IPHostEntry-class インスタンスを作成する非同期操作が完了するまで待機します。

```cpp
static System::ArrayPtr<System::SharedPtr<IPAddress>> System::Net::Dns::EndGetHostAddresses(System::SharedPtr<IAsyncResult> asyncResult)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 非同期操作を表す [IAsyncResult](../../../system/iasyncresult/) オブジェクトです。 |

### ReturnValue

新しく作成された IPHostEntry-class インスタンスです。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../ipaddress/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
