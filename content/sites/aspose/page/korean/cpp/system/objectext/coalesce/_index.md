---
title: "System::ObjectExt::Coalesce 메서드"
linktitle: "Coalesce"
second_title: "C++용 Aspose.Page"
description: "System::ObjectExt::Coalesce 메서드. C++에서 nullable 타입에 대한 ''??'' 연산자 번역 구현."
type: docs
weight: 500
url: /ko/cpp/system/objectext/coalesce/
---
## ObjectExt::Coalesce(System::Nullable\<T0\>, T1) method


null 허용 타입에 대한 '??' 연산자 변환 구현입니다.

```cpp
template<typename T0,typename T1> static T0 System::ObjectExt::Coalesce(System::Nullable<T0> value, T1 func)
```


| 매개변수 | 설명 |
| --- | --- |
| T0 | 좌변(LHS) 값 타입. |
| T1 | 우변(RHS) 표현식을 캡슐화하는 람다의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | System::Nullable\<T0\> | LHS 값. |
| func | T1 | RHS 식. |

### ReturnValue

LHS 값이 null이 아니면 LHS를 반환하고, 그렇지 않으면 RHS 식을 계산하여 결과를 반환합니다.

## 또 보기

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Coalesce(T0, T1) method


null이 아닌 타입에 대한 '??' 연산자 변환 구현입니다.

```cpp
template<typename T0,typename T1> static auto System::ObjectExt::Coalesce(T0 value, T1 func)
```


| 매개변수 | 설명 |
| --- | --- |
| T0 | 좌변(LHS) 값 타입. |
| T1 | 우변(RHS) 표현식을 캡슐화하는 람다의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | T0 | LHS 값. |
| func | T1 | RHS 식. |

### ReturnValue

LHS 값이 null이 아니면 LHS를 반환하고, 그렇지 않으면 RHS 식을 계산하여 결과를 반환합니다.

## 또 보기

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
