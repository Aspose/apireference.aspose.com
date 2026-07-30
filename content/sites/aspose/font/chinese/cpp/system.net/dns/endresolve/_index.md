---
title: "System::Net::Dns::EndResolve 方法"
linktitle: "EndResolve"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Dns::EndResolve 方法。等待在 C++ 中指定的创建新 IPHostEntry 类实例的异步操作完成。"
type: docs
weight: 800
url: /zh/cpp/system.net/dns/endresolve/
---
## Dns::EndResolve method


等待指定的创建新 IPHostEntry-class 实例的异步操作完成。

```cpp
static System::SharedPtr<IPHostEntry> System::Net::Dns::EndResolve(System::SharedPtr<IAsyncResult> asyncResult)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 一个表示异步操作的 [IAsyncResult](../../../system/iasyncresult/) 对象。 |

### ReturnValue

一个新创建的 IPHostEntry-class 实例。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPHostEntry](../../iphostentry/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
