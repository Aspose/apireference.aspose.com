---
title: "System::Net::Dns::EndResolve メソッド"
linktitle: "EndResolve"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Dns::EndResolve メソッド。指定された非同期操作が新しい IPHostEntry クラスのインスタンスを作成するまで待機します（C++）。"
type: docs
weight: 800
url: /ja/cpp/system.net/dns/endresolve/
---
## Dns::EndResolve method


指定された新しい IPHostEntry-class インスタンスを作成する非同期操作が完了するまで待機します。

```cpp
static System::SharedPtr<IPHostEntry> System::Net::Dns::EndResolve(System::SharedPtr<IAsyncResult> asyncResult)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 非同期操作を表す [IAsyncResult](../../../system/iasyncresult/) オブジェクトです。 |

### ReturnValue

新しく作成された IPHostEntry-class インスタンスです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPHostEntry](../../iphostentry/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
