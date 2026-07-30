---
title: "System::Net::Dns::EndGetHostAddresses 方法"
linktitle: "EndGetHostAddresses"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Dns::EndGetHostAddresses 方法。等待在 C++ 中创建新 IPHostEntry-class 实例的指定异步操作完成。"
type: docs
weight: 500
url: /zh/cpp/system.net/dns/endgethostaddresses/
---
## Dns::EndGetHostAddresses method


等待指定的创建新 IPHostEntry-class 实例的异步操作完成。

```cpp
static System::ArrayPtr<System::SharedPtr<IPAddress>> System::Net::Dns::EndGetHostAddresses(System::SharedPtr<IAsyncResult> asyncResult)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 一个表示异步操作的 [IAsyncResult](../../../system/iasyncresult/) 对象。 |

### ReturnValue

一个新创建的 IPHostEntry-class 实例。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../ipaddress/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
