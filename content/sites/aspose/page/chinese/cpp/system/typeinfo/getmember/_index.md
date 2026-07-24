---
title: "System::TypeInfo::GetMember 方法"
linktitle: "GetMember"
second_title: "Aspose.Page 适用于 C++"
description: "System::TypeInfo::GetMember 方法。获取具有指定名称的成员列表（在 C++ 中）。"
type: docs
weight: 3800
url: /zh/cpp/system/typeinfo/getmember/
---
## TypeInfo::GetMember method


获取具有指定名称的成员列表。

```cpp
ArrayPtr<SharedPtr<System::Reflection::MemberInfo>> System::TypeInfo::GetMember(const String &name) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| name | const String\& | 要获取的成员名称。 |

### ReturnValue

[Array](../../array/) of member descriptors (empty if no member is found).

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [MemberInfo](../../../system.reflection/memberinfo/)
* Class [String](../../string/)
* Class [TypeInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
