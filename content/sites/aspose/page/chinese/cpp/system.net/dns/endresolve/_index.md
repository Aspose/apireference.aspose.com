---
title: "System::Net::Dns::EndResolve 方法"
linktitle: "EndResolve"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::Dns::EndResolve 方法。等待在 C++ 中指定的异步操作完成，以创建新的 IPHostEntry 类实例。"
type: docs
weight: 800
url: /zh/cpp/system.net/dns/endresolve/
---
## Dns::EndResolve method


等待指定的创建新的 IPHostEntry 类实例的异步操作完成。

```cpp
static System::SharedPtr<IPHostEntry> System::Net::Dns::EndResolve(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 表示异步操作的 [IAsyncResult](../../../system/iasyncresult/) 对象。 |

### ReturnValue

新创建的 IPHostEntry-class 实例。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPHostEntry](../../iphostentry/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
