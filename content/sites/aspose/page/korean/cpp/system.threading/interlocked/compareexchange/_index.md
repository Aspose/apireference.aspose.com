---
title: "System::Threading::Interlocked::CompareExchange 메서드"
linktitle: "CompareExchange"
second_title: "C++용 Aspose.Page"
description: "System::Threading::Interlocked::CompareExchange 메서드. 변수의 값을 비교 교환합니다: 변수가 특정 값과 같은지 확인하고, 저장된 값이 예상값과 일치할 경우에만 새 값을 저장합니다 (C++)."
type: docs
weight: 200
url: /ko/cpp/system.threading/interlocked/compareexchange/
---
## Interlocked::CompareExchange(int32_t\&, int32_t, int32_t, bool\&) method


Compare-exchanges 변수의 값: 변수가 특정 값과 같은지 확인하고, 저장된 값이 예상값과 일치할 경우에만 새 값을 저장합니다.

```cpp
static int32_t System::Threading::Interlocked::CompareExchange(int32_t &location1, int32_t value, int32_t comparand, bool &succeeded)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| location1 | int32_t\& | 변경할 변수 참조. |
| value | int32_t | 저장할 값. |
| comparand | int32_t | 교환하기 전에 변수 값을 비교할 값. |
| 성공 | bool\& | 교환이 발생하면 true, 그렇지 않으면 false가 설정되는 변수에 대한 참조. |

### ReturnValue

작업 시작 시 변수의 값, 변경 여부와 관계없이.

## 또 보기

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


Compare-exchanges 변수의 값: 변수가 특정 값과 같은지 확인하고, 저장된 값이 예상값과 일치할 경우에만 새 값을 저장합니다.

```cpp
template<typename T> static std::enable_if<IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 변수 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| location1 | T\& | 변경할 변수 참조. |
| value | T | 저장할 값. |
| comparand | T | 교환하기 전에 변수 값을 비교할 값. |

### ReturnValue

작업 시작 시 변수의 값, 변경 여부와 관계없이.

## 또 보기

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Interlocked::CompareExchange(T\&, T, T) method


Compare-exchanges 변수의 값: 변수가 특정 값과 같은지 확인하고, 저장된 값이 예상값과 일치할 경우에만 새 값을 저장합니다. 구현되지 않음.

```cpp
template<typename T> static std::enable_if<!IsSupportedInt<T>, T>::type System::Threading::Interlocked::CompareExchange(T &location1, T value, T comparand)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 변수 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| location1 | T\& | 변경할 변수 참조. |
| value | T | 저장할 값. |
| comparand | T | 교환하기 전에 변수 값을 비교할 값. |

### ReturnValue

작업 시작 시 변수의 값, 변경 여부와 관계없이.

## 또 보기

* Class [Interlocked](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
