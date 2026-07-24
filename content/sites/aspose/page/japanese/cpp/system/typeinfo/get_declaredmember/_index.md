---
title: "System::TypeInfo::get_DeclaredMember メソッド"
linktitle: "get_DeclaredMember"
second_title: "C++ 用 Aspose.Page"
description: "System::TypeInfo::get_DeclaredMember メソッド。C++ で指定された名前を持つメンバーの一覧を取得します。"
type: docs
weight: 1300
url: /ja/cpp/system/typeinfo/get_declaredmember/
---
## TypeInfo::get_DeclaredMember method


指定された名前を持つメンバーのリストを取得します。

```cpp
ArrayPtr<SharedPtr<System::Reflection::MemberInfo>> System::TypeInfo::get_DeclaredMember(const String &name) const
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
