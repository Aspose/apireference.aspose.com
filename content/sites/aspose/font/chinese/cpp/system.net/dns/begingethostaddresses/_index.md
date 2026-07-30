---
title: "System::Net::Dns::BeginGetHostAddresses 方法"
linktitle: "BeginGetHostAddresses"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Dns::BeginGetHostAddresses 方法。启动一个异步操作，使用在 C++ 中包含主机名或 IP 地址的指定字符串创建一个新的 IPHostEntry-class 实例。"
type: docs
weight: 100
url: /zh/cpp/system.net/dns/begingethostaddresses/
---
## Dns::BeginGetHostAddresses method


使用包含主机名或 IP 地址的指定字符串，启动异步操作以创建新的 IPHostEntry-class 实例。

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostAddresses(String hostNameOrAddress, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| hostNameOrAddress | String | 一个包含主机名或 IP 地址的字符串。 |
| requestCallback | AsyncCallback | 操作完成时调用的回调函数。 |
| state | System::SharedPtr\<Object\> | 用户提供的数据，用于唯一标识每个异步操作。 |

### ReturnValue

一个表示已启动异步操作的 [IAsyncResult](../../../system/iasyncresult/) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [String](../../../system/string/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
