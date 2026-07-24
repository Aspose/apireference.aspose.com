---
title: "System::Net::CookieCollection::InternalAdd method"
linktitle: "InternalAdd"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::CookieCollection::InternalAdd method. 在 C++ 中将指定的 cookie 添加到集合中。"
type: docs
weight: 1000
url: /zh/cpp/system.net/cookiecollection/internaladd/
---
## CookieCollection::InternalAdd method


将指定的 cookie 添加到集合中。

```cpp
int32_t System::Net::CookieCollection::InternalAdd(System::SharedPtr<Cookie> cookie, bool isStrict)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| cookie | System::SharedPtr\<Cookie\> | 要添加的 cookie。 |
| isStrict | bool | 当指定的 cookie 必须替换旧的时为 true，否则为 false。 |

### ReturnValue

当指定的 cookie 替换了旧的时为 0，否则为 1。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Cookie](../../cookie/)
* Class [CookieCollection](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
