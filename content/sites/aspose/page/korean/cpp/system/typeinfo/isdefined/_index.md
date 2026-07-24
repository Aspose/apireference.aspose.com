---
title: "System::TypeInfo::IsDefined 메서드"
linktitle: "IsDefined"
second_title: "C++용 Aspose.Page"
description: "System::TypeInfo::IsDefined 메서드. 구현되지 않음. 지정된 유형 또는 해당 파생 유형의 하나 이상의 특성이 이 멤버에 적용되었는지 여부를 C++에서 나타냅니다."
type: docs
weight: 4400
url: /ko/cpp/system/typeinfo/isdefined/
---
## TypeInfo::IsDefined method


구현되지 않음. 지정된 유형 또는 해당 파생 유형의 하나 이상의 특성이 이 멤버에 적용되는지 여부를 나타냅니다.

```cpp
bool System::TypeInfo::IsDefined(const TypeInfo &attributeType, bool inherit) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| attributeType | const TypeInfo\& | 검색할 사용자 정의 특성의 유형입니다. 검색에는 파생 유형도 포함됩니다. |
| inherit | bool | 특성을 찾기 위해 이 멤버의 상속 체인을 검색하려면 true, 그렇지 않으면 false. 이 매개변수는 속성 및 이벤트에 대해 무시됩니다. |

### ReturnValue

attributeType 또는 그 파생 유형의 하나 이상의 인스턴스가 이 멤버에 적용된 경우 true, 그렇지 않으면 false.

## 또 보기

* Class [TypeInfo](../)
* Class [TypeInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
