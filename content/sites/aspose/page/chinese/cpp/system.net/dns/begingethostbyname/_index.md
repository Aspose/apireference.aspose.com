---
title: "System::Net::Dns::BeginGetHostByName 方法"
linktitle: "BeginGetHostByName"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::Dns::BeginGetHostByName 方法。启动在 C++ 中使用指定主机名创建新 IPHostEntry-class 实例的异步操作。"
type: docs
weight: 200
url: /zh/cpp/system.net/dns/begingethostbyname/
---
## Dns::BeginGetHostByName method


启动一个异步操作，以使用指定的主机名创建新的 IPHostEntry 类实例。

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostByName(String hostName, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| hostName | 字符串 | 主机名。 |
| requestCallback | AsyncCallback | 操作完成时将被调用的回调函数。 |
| stateObject | System::SharedPtr\<Object\> | 用户提供的数据，用于唯一标识每个异步操作。 |

### ReturnValue

表示已启动异步操作的 [IAsyncResult](../../../system/iasyncresult/) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [String](../../../system/string/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
