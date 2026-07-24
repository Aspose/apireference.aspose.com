---
title: "System::ObjectExt::CoalesceInternal 메서드"
linktitle: "CoalesceInternal"
second_title: "C++용 Aspose.Page"
description: "System::ObjectExt::CoalesceInternal 메서드. 널이 아닌 타입에 대한 ''??'' 연산자 변환 구현. C++에서 RT2가 RT1로 변환 가능한 경우에 대한 오버로드."
type: docs
weight: 600
url: /ko/cpp/system/objectext/coalesceinternal/
---
## ObjectExt::CoalesceInternal method


null이 아닌 타입에 대한 '??' 연산자 변환 구현입니다. RT2가 RT1으로 변환 가능한 경우에 대한 오버로드입니다.

```cpp
template<typename RT1,typename RT2,typename F> static std::conditional<std::is_convertible<RT2, RT1>::value, RT1, RT2>::type System::ObjectExt::CoalesceInternal(RT1 value, F func)
```


| 매개변수 | 설명 |
| --- | --- |
| T0 | 좌변(LHS) 값 타입. |
| T1 | 우변(RHS) 표현식을 캡슐화하는 람다의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | RT1 | LHS 값. |
| func | F | RHS 식. |

### ReturnValue

LHS 값이 null이 아니면 LHS를 반환하고, 그렇지 않으면 RHS 식을 계산하여 결과를 반환합니다.

## 또 보기

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
