---
title: "System::DateTime::SpecifyKind 메서드"
linktitle: "SpecifyKind"
second_title: "C++용 Aspose.Page"
description: "System::DateTime::SpecifyKind 메서드. 지정된 DateTime 객체와 동일한 틱 수를 나타내며, 인수 kind에 따라 로컬 시간, UTC 시간 또는 둘 다 아님을 나타내는 새로운 DateTime 객체를 생성합니다 (C++)."
type: docs
weight: 6800
url: /ko/cpp/system/datetime/specifykind/
---
## DateTime::SpecifyKind method


새로운 [DateTime](../) 객체를 생성합니다. 이 객체는 지정된 [DateTime](../) 객체와 동일한 틱 수를 나타내며, 인수 **kind**에 따라 로컬 시간, UTC 시간 또는 둘 다 아님을 나타냅니다.

```cpp
static DateTime System::DateTime::SpecifyKind(DateTime value, DateTimeKind kind)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | DateTime | [DateTime](../) 객체에서 틱 수를 복사할 대상 |
| 종류 | DateTimeKind | 새 객체가 로컬 시간, UTC 시간 또는 둘 다 아님을 나타낼지 지정합니다. |

### ReturnValue

새로운 [DateTime](../) 객체는 **value**와 동일한 틱 수를 나타내며, [DateTimeKind](../../datetimekind/) 값은 **kind**에 의해 지정됩니다.

## 또 보기

* Class [DateTime](../)
* Enum [DateTimeKind](../../datetimekind/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
