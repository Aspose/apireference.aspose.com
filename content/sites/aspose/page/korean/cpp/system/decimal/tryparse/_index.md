---
title: "System::Decimal::TryParse 메서드"
linktitle: "TryParse"
second_title: "C++용 Aspose.Page"
description: "System::Decimal::TryParse 메서드. 숫자의 문자열 표현을 포함하는 지정된 문자열을 C++에서 동등한 Decimal 값으로 변환합니다."
type: docs
weight: 5800
url: /ko/cpp/system/decimal/tryparse/
---
## Decimal::TryParse(const String\&, Decimal\&) method


숫자의 문자열 표현을 포함하는 지정된 문자열을 동등한 [Decimal](../) 값으로 변환합니다.

```cpp
static bool System::Decimal::TryParse(const String &value, Decimal &result)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const String\& | 변환할 문자열 |
| result | Decimal\& | 변환 결과가 저장되는 [Decimal](../) 변수에 대한 참조 |

### ReturnValue

변환이 성공하면 true, 그렇지 않으면 false

## 또 보기

* Class [String](../../string/)
* Class [Decimal](../)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Decimal::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, Decimal\&) method


제공된 형식 정보와 숫자 스타일을 사용하여 숫자의 문자열 표현을 포함하는 지정된 문자열을 동등한 [Decimal](../) 값으로 변환합니다.

```cpp
static bool System::Decimal::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, Decimal &result)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const String\& | 변환할 문자열 |
| styles | Globalization::NumberStyles | 숫자의 문자열 표현에 허용되는 스타일을 지정하는 NumberStyles 열거형 값들의 비트별 조합 |
| 제공자 | const SharedPtr\<IFormatProvider\>\& | 문자열 형식 정보를 포함하는 객체에 대한 포인터 |
| result | Decimal\\& | 출력 인수; 변환 결과를 포함합니다 |

### ReturnValue

변환이 성공하면 true, 그렇지 않으면 false

## 또 보기

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Decimal](../)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
