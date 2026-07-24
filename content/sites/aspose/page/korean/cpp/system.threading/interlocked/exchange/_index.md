---
title: "System::Threading::Interlocked::Exchange 메서드"
linktitle: "교환"
second_title: "C++용 Aspose.Page"
description: "System::Threading::Interlocked::Exchange 메서드. 변수의 값을 교환합니다: 새 값을 저장하고 저장하기 직전 변수에 있던 값을 반환합니다 (C++)."
type: docs
weight: 400
url: /ko/cpp/system.threading/interlocked/exchange/
---
## Interlocked::Exchange(T\&, T) method


Exchanges 변수의 값: 새 값을 저장하고 저장하기 직전 변수에 있던 값을 반환합니다.

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 변수 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| location1 | T\& | 변경할 변수 참조. |
| value | T | 저장할 값. |

### ReturnValue

변경되기 직전 변수의 값.

## 또 보기

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::Exchange(T\&, T) method


Exchanges 변수의 값: 새 값을 저장하고 저장하기 직전 변수에 있던 값을 반환합니다. 구현되지 않음.

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::Exchange(T &location1, T value)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 변수 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| location1 | T\& | 변경할 변수 참조. |
| value | T | 저장할 값. |

### ReturnValue

변경되기 직전 변수의 값.

## 또 보기

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
