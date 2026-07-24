---
title: "System::TypeInfo::GetMember メソッド"
linktitle: "GetMember"
second_title: "C++ 用 Aspose.Page"
description: "System::TypeInfo::GetMember メソッド。指定された名前を持つメンバーの一覧を C++ で取得します。"
type: docs
weight: 3800
url: /ja/cpp/system/typeinfo/getmember/
---
## TypeInfo::GetMember method


指定された名前を持つメンバーのリストを取得します。

```cpp
ArrayPtr<SharedPtr<System::Reflection::MemberInfo>> System::TypeInfo::GetMember(const String &name) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | const String\& | 取得するメンバーの名前。 |

### ReturnValue

[Array](../../array/) of member descriptors (empty if no member is found).

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [MemberInfo](../../../system.reflection/memberinfo/)
* Class [String](../../string/)
* Class [TypeInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
