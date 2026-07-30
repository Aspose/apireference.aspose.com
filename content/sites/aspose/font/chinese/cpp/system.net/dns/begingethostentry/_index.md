---
title: "System::Net::Dns::BeginGetHostEntry 方法"
linktitle: "BeginGetHostEntry"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Dns::BeginGetHostEntry 方法。使用包含主机名或 IP 地址的指定字符串在 C++ 中启动异步操作以创建新的 IPHostEntry 类实例。"
type: docs
weight: 300
url: /zh/cpp/system.net/dns/begingethostentry/
---
## Dns::BeginGetHostEntry(String, AsyncCallback, System::SharedPtr\<Object\>) method


使用包含主机名或 IP 地址的指定字符串，启动异步操作以创建新的 IPHostEntry-class 实例。

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostEntry(String hostNameOrAddress, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| hostNameOrAddress | String | 包含主机名或 IP 地址的字符串。 |
| requestCallback | AsyncCallback | 操作完成时调用的回调函数。 |
| stateObject | System::SharedPtr\<Object\> | 用户提供的数据，用于唯一标识每个异步操作。 |

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
## Dns::BeginGetHostEntry(System::SharedPtr\<IPAddress\>, AsyncCallback, System::SharedPtr\<Object\>) method


使用指定的 IP 地址，启动异步操作以创建新的 IPHostEntry-class 实例。

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostEntry(System::SharedPtr<IPAddress> address, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 地址 | System::SharedPtr\<IPAddress\> | IP 地址。 |
| requestCallback | AsyncCallback | 操作完成时调用的回调函数。 |
| stateObject | System::SharedPtr\<Object\> | 用户提供的数据，用于唯一标识每个异步操作。 |

### ReturnValue

一个表示已启动异步操作的 [IAsyncResult](../../../system/iasyncresult/) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [IPAddress](../../ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
