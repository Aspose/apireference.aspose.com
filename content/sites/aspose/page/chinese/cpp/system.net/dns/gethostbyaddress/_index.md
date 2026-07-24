---
title: "System::Net::Dns::GetHostByAddress 方法"
linktitle: "GetHostByAddress"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::Dns::GetHostByAddress 方法。使用指定的 IP 地址字符串表示在 C++ 中创建一个新的 IPHostEntry 类实例。"
type: docs
weight: 1000
url: /zh/cpp/system.net/dns/gethostbyaddress/
---
## Dns::GetHostByAddress(String) method


使用指定的 IP 地址字符串表示创建新的 IPHostEntry 类实例。

```cpp
static System::SharedPtr<IPHostEntry> System::Net::Dns::GetHostByAddress(String address)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 地址 | 字符串 | IP 地址的字符串表示形式。 |

### ReturnValue

新创建的 IPHostEntry-class 实例。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPHostEntry](../../iphostentry/)
* Class [String](../../../system/string/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## Dns::GetHostByAddress(System::SharedPtr\<IPAddress\>) method


使用指定的 IP 地址创建新的 IPHostEntry 类实例。

```cpp
static System::SharedPtr<IPHostEntry> System::Net::Dns::GetHostByAddress(System::SharedPtr<IPAddress> address)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 地址 | System::SharedPtr\<IPAddress\> | IP 地址。 |

### ReturnValue

新创建的 IPHostEntry-class 实例。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPHostEntry](../../iphostentry/)
* Class [IPAddress](../../ipaddress/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
