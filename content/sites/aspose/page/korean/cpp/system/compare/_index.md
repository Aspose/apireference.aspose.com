---
title: "System::Compare method"
linktitle: "Compare"
second_title: "C++용 Aspose.Page"
description: "System::Compare 메서드. C++에서 두 값을 비교합니다."
type: docs
weight: 15800
url: /ko/cpp/system/compare/
---
## System::Compare(const TA\&, const TB\&) method


두 값을 비교합니다.

```cpp
template<typename TA,typename TB> std::enable_if_t<!std::is_floating_point<TA>::value &&!std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| 매개변수 | 설명 |
| --- | --- |
| TA | 첫 번째 비교 대상의 타입 |
| TB | 두 번째 비교 대상의 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| a | const TA\& | 첫 번째 비교값 |
| b | const TB\& | 두 번째 비교값 |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Compare(const TA\&, const TB\&) method


두 개의 부동 소수점 값을 비교합니다.

```cpp
template<typename TA,typename TB> std::enable_if_t<std::is_floating_point<TA>::value &&std::is_floating_point<TB>::value, int> System::Compare(const TA &a, const TB &b)
```


| 매개변수 | 설명 |
| --- | --- |
| TA | 첫 번째 비교 대상의 타입 |
| TB | 두 번째 비교 대상의 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| a | const TA\& | 첫 번째 비교값 |
| b | const TB\& | 두 번째 비교값 |

### ReturnValue

-1 if **a** compares less than **b**; 0 if the values are equal; 1 if **a** compares greater than **b**

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
