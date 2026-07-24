---
title: "System::Is 메서드"
linktitle: "인가"
second_title: "C++용 Aspose.Page"
description: "System::Is 메서드. 최상위 매칭 함수. C++에서 값에 패턴을 적용합니다."
type: docs
weight: 21900
url: /ko/cpp/system/is/
---
## System::Is(const E\&, const A\&) method


최상위 매칭 함수. 값에 패턴을 적용합니다.

```cpp
template<typename A,typename E> std::enable_if_t<std::is_base_of<Details::Pattern, A>::value, bool> System::Is(const E &e, const A &a)
```


| 매개변수 | 설명 |
| --- | --- |
| A | 패턴 유형 (Details::Pattern에서 상속해야 함). |
| E | 매칭할 값의 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| e | const E\& | 매칭할 대상 값. |
| a | const A\& | 적용할 패턴. |

### ReturnValue

패턴이 값과 일치하면 true.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Is(const ExpressionT\&, const ConstantT\&) method


'is' 상수 패턴 변환을 구현합니다.

```cpp
template<class ExpressionT,class ConstantT> std::enable_if_t<!std::is_base_of<Details::Pattern, ConstantT>::value, bool> System::Is(const ExpressionT &left, const ConstantT &constant)
```


| 매개변수 | 설명 |
| --- | --- |
| ExpressionT | 왼쪽 표현식 타입. |
| ConstantT | 상수 표현식의 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 왼쪽 | const ExpressionT\& | 검사될 표현식. |
| 상수 | const ConstantT\& | 왼쪽과 비교될 표현식. |

### ReturnValue

형식 검사가 성공하면 true, 그렇지 않으면 false.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Is(const ExpressionT\&, ResultT\&) method


'is' 선언 패턴 변환을 구현합니다.

```cpp
template<class PatternT,class ExpressionT,class ResultT> bool System::Is(const ExpressionT &left, ResultT &result)
```


| 매개변수 | 설명 |
| --- | --- |
| PatternT | 확인할 유형. |
| ExpressionT | 왼쪽 표현식 타입. |
| ResultT | 결과 식의 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 왼쪽 | const ExpressionT\& | 검사될 표현식. |
| result | ResultT\& | 검사된 유형에 할당될 변수. |

### ReturnValue

형식 검사가 성공하면 true, 그렇지 않으면 false.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
