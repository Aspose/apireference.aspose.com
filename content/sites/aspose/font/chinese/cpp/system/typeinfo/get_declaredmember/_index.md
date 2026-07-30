---
title: "System::TypeInfo::get_DeclaredMember 方法"
linktitle: "get_DeclaredMember"
second_title: "Aspose.Font 适用于 C++"
description: "System::TypeInfo::get_DeclaredMember 方法。获取 C++ 中具有指定名称的成员列表。"
type: docs
weight: 1300
url: /zh/cpp/system/typeinfo/get_declaredmember/
---
## TypeInfo::get_DeclaredMember method


获取具有指定名称的成员列表。

```cpp
ArrayPtr<SharedPtr<System::Reflection::MemberInfo>> System::TypeInfo::get_DeclaredMember(const String &name) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | const String\& | 要获取的成员名称。 |

### ReturnValue

[Array](../../array/) of member descriptors (empty if no member is found).

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [MemberInfo](../../../system.reflection/memberinfo/)
* Class [String](../../string/)
* Class [TypeInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
