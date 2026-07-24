---
title: "System::DateTime::TryParse 메서드"
linktitle: "TryParse"
second_title: "C++용 Aspose.Page"
description: "C++에서 System::DateTime 클래스의 TryParse 메서드를 사용하는 방법."
type: docs
weight: 6900
url: /ko/cpp/system/datetime/tryparse/
---
## DateTime::TryParse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles, DateTime &result)
```

## 또 보기

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParse(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles, DateTime &result)
```

## 또 보기

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) method


지정된 문화권별 형식 정보와 스타일을 사용하여 날짜 및 시간 값의 문자열 표현을 동등한 [DateTime](../) 객체로 변환합니다.

```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTime &result)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| s | const String\& | 변환할 날짜와 시간 값의 문자열 표현. |
| provider | const SharedPtr\<IFormatProvider\>\& | 문화별 형식 정보를 제공하는 [IFormatProvider](../../iformatprovider/) 객체. |
| styles | Globalization::DateTimeStyles | 열거형 값들의 비트 연산 조합으로 **s**에 대한 추가 정보, **s**에 존재할 수 있는 스타일 요소, 또는 **s**를 [DateTime](../) 객체로 변환하는 것에 대한 정보를 제공합니다. |
| result | DateTime\& | 변환이 성공하면 변환 결과를 포함하는 출력 인수입니다. |

### ReturnValue

변환이 성공하면 true, 그렇지 않으면 false.

## 또 보기

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParse(const String\&, DateTime\&) method


지정된 날짜 및 시간 값의 문자열 표현을 동등한 [DateTime](../) 객체로 변환합니다.

```cpp
static bool System::DateTime::TryParse(const String &s, DateTime &result)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| s | const String\& | 변환할 날짜와 시간 값의 문자열 표현. |
| result | DateTime\& | 변환이 성공하면 변환 결과를 포함하는 출력 인수입니다. |

### ReturnValue

변환이 성공하면 true, 그렇지 않으면 false.

## 또 보기

* Class [String](../../string/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::TryParse(const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, std::nullptr_t, Globalization::DateTimeStyles styles, DateTime &result)
```

## 또 보기

* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
