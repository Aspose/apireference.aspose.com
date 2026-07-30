---
title: "System::Net::Dns::GetHostEntry 方法"
linktitle: "GetHostEntry"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Dns::GetHostEntry 方法。使用包含主机名或 IP 地址的指定字符串在 C++ 中创建一个新的 IPHostEntry-class 实例。"
type: docs
weight: 1200
url: /zh/cpp/system.net/dns/gethostentry/
---
## Dns::GetHostEntry(String) method


使用包含主机名或 IP 地址的指定字符串，创建新的 IPHostEntry-class 实例。

```cpp
static System::SharedPtr<IPHostEntry> System::Net::Dns::GetHostEntry(String hostNameOrAddress)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| hostNameOrAddress | String | 一个包含主机名或 IP 地址的字符串。 |

### ReturnValue

一个新创建的 IPHostEntry-class 实例。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPHostEntry](../../iphostentry/)
* Class [String](../../../system/string/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
## Dns::GetHostEntry(System::SharedPtr\<IPAddress\>) method


使用指定的 IP 地址，创建新的 IPHostEntry-class 实例。

```cpp
static System::SharedPtr<IPHostEntry> System::Net::Dns::GetHostEntry(System::SharedPtr<IPAddress> address)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 地址 | System::SharedPtr\<IPAddress\> | IP 地址。 |

### ReturnValue

一个新创建的 IPHostEntry-class 实例。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPHostEntry](../../iphostentry/)
* Class [IPAddress](../../ipaddress/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
