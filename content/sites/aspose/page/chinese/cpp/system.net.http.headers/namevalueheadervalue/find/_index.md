---
title: "System::Net::Http::Headers::NameValueHeaderValue::Find 方法"
linktitle: "查找"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::Http::Headers::NameValueHeaderValue::Find 方法。在 C++ 中通过指定的名称在集合中查找 NameValueHeaderValue-class 实例。"
type: docs
weight: 800
url: /zh/cpp/system.net.http.headers/namevalueheadervalue/find/
---
## NameValueHeaderValue::Find method


在集合中按指定名称查找 NameValueHeaderValue 类的实例。

```cpp
static System::SharedPtr<NameValueHeaderValue> System::Net::Http::Headers::NameValueHeaderValue::Find(System::SharedPtr<ObjectCollection<System::SharedPtr<NameValueHeaderValue>>> values, String name)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 值 | System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\> | NameValueHeaderValue-class 实例的集合。 |
| name | 字符串 | 要查找的名称。 |

### ReturnValue

找到时返回 NameValueHeaderValue-class 实例，否则返回 nullptr。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NameValueHeaderValue](../)
* Class [ObjectCollection](../../objectcollection/)
* Class [String](../../../system/string/)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
