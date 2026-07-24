---
title: "System::Decimal::Round 메서드"
linktitle: "반올림"
second_title: "C++용 Aspose.Page"
description: "System::Decimal::Round 메서드. 지정된 값을 지정된 소수 자리수 수를 가진 가장 가까운 값으로 반올림합니다. 매개변수는 지정된 값이 두 가장 가까운 숫자에 동일하게 가까운 경우 함수의 동작을 지정합니다 (C++)."
type: docs
weight: 4400
url: /ko/cpp/system/decimal/round/
---
## Decimal::Round(const Decimal\&, int, MidpointRounding) method


지정된 소수 자릿수로 지정된 값을 가장 가까운 값으로 반올림합니다. 지정된 값이 두 가장 가까운 수와 동일하게 가까운 경우 함수의 동작을 지정하는 매개변수가 있습니다.

```cpp
static Decimal System::Decimal::Round(const Decimal &d, int digits, MidpointRounding mode=MidpointRounding::ToEven)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| d | const Decimal\& | 반올림할 값 |
| 자리수 | int | 반올림된 값의 소수 자리수 |
| mode | MidpointRounding | 두 가장 가까운 숫자에 **value**가 동일하게 가까운 경우 반올림을 수행하는 방법을 지정합니다. |

### ReturnValue

지정된 자리수를 가진, **value**에 가장 가까운 숫자

## 또 보기

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Decimal::Round(const Decimal\&, MidpointRounding) method


지정된 값을 가장 가까운 정수로 반올림합니다. 지정된 값이 두 가장 가까운 수와 동일하게 가까운 경우 함수의 동작을 지정하는 매개변수가 있습니다.

```cpp
static Decimal System::Decimal::Round(const Decimal &d, MidpointRounding mode=MidpointRounding::ToEven)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| d | const Decimal\& | 반올림할 값 |
| mode | MidpointRounding | 두 가장 가까운 숫자에 **value**가 동일하게 가까운 경우 반올림을 수행하는 방법을 지정합니다. |

### ReturnValue

**d** rounded to the nearest integral value

## 또 보기

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
