---
title: "System::SafeInvoke method"
linktitle: "SafeInvoke"
second_title: "C++용 Aspose.Page"
description: "System::SafeInvoke method. C++에서 ''?.'' 연산자 변환의 구현."
type: docs
weight: 36900
url: /ko/cpp/system/safeinvoke/
---
## System::SafeInvoke method


'?.' 연산자 변환 구현.

```cpp
template<typename T0,typename T1> static auto System::SafeInvoke(T0 expr, T1 func)
```


| 매개변수 | 설명 |
| --- | --- |
| T0 | 표현식 유형. |
| T1 | 'WhenTrue' 식을 캡슐화하는 람다 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| expr | T0 | 식 값. |
| func | T1 | 'WhenTrue' 식이 functor에 바인딩됩니다. |

### ReturnValue

expr 값이 null이 아니면, 그 값을 첫 번째 인수로 하여 호출된 func를 반환하고, 그렇지 않으면 null을 반환합니다.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
