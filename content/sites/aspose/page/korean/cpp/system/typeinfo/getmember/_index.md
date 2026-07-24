---
title: "System::TypeInfo::GetMember 메서드"
linktitle: "GetMember"
second_title: "C++용 Aspose.Page"
description: "System::TypeInfo::GetMember 메서드. 지정된 이름을 가진 멤버들의 목록을 C++에서 가져옵니다."
type: docs
weight: 3800
url: /ko/cpp/system/typeinfo/getmember/
---
## TypeInfo::GetMember method


지정된 이름을 가진 멤버 목록을 가져옵니다.

```cpp
ArrayPtr<SharedPtr<System::Reflection::MemberInfo>> System::TypeInfo::GetMember(const String &name) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | const String\& | 가져올 멤버의 이름. |

### ReturnValue

[Array](../../array/) of member descriptors (empty if no member is found).

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [MemberInfo](../../../system.reflection/memberinfo/)
* Class [String](../../string/)
* Class [TypeInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
