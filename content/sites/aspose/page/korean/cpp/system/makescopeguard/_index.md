---
title: "System::MakeScopeGuard 메서드"
linktitle: "MakeScopeGuard"
second_title: "C++용 Aspose.Page"
description: "System::MakeScopeGuard 메서드. C++에서 ScopedGuard 클래스의 인스턴스를 생성하는 팩터리 함수입니다."
type: docs
weight: 24700
url: /ko/cpp/system/makescopeguard/
---
## System::MakeScopeGuard method


ScopedGuard 클래스의 인스턴스를 생성하는 팩터리 함수.

```cpp
template<typename F> ScopeGuard<F> System::MakeScopeGuard(F f)
```


| 매개변수 | 설명 |
| --- | --- |
| 그 | 구성된 ScopedGuard 객체에 의해 호출될 함수 객체의 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| f | F | ScopedGuard 클래스의 생성자에 전달할 함수 객체. |

### ReturnValue

ScopedGuard 클래스의 새 인스턴스

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
