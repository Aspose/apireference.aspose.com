---
title: "System::Net::CookieCollection::InternalAdd 方法"
linktitle: "InternalAdd"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::CookieCollection::InternalAdd 方法。 在 C++ 中向集合添加指定的 cookie。"
type: docs
weight: 1000
url: /zh/cpp/system.net/cookiecollection/internaladd/
---
## CookieCollection::InternalAdd method


将指定的 cookie 添加到集合中。

```cpp
int32_t System::Net::CookieCollection::InternalAdd(System::SharedPtr<Cookie> cookie, bool isStrict)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| Cookie | System::SharedPtr\<Cookie\> | 要添加的 Cookie。 |
| isStrict | bool | 当指定的 cookie 必须替换旧的时为 True，否则为 false。 |

### ReturnValue

当指定的 cookie 替换了旧的时为 0，否则为 1。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Cookie](../../cookie/)
* Class [CookieCollection](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
