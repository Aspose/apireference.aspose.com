---
title: "System::Net::CookieCollection::idx_get 方法"
linktitle: "idx_get"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::CookieCollection::idx_get 方法。返回 C++ 中 cookie 集合中指定索引处的 cookie。"
type: docs
weight: 800
url: /zh/cpp/system.net/cookiecollection/idx_get/
---
## CookieCollection::idx_get(int32_t) method


返回位于指定索引的 cookie 集合中的 cookie。

```cpp
System::SharedPtr<Cookie> System::Net::CookieCollection::idx_get(int32_t index)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 索引 | int32_t | 必须返回的 cookie 的索引。 |

### ReturnValue

指定索引处的 cookie。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Cookie](../../cookie/)
* Class [CookieCollection](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
## CookieCollection::idx_get(String) method


根据指定名称返回 cookie 集合中的 cookie。

```cpp
System::SharedPtr<Cookie> System::Net::CookieCollection::idx_get(String name)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | String | 必须返回的 cookie 的名称。 |

### ReturnValue

从 cookie 集合中按指定名称获取的 cookie（如果找到），否则为 nullptr。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Cookie](../../cookie/)
* Class [String](../../../system/string/)
* Class [CookieCollection](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
