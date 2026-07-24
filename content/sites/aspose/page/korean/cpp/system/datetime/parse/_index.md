---
title: "System::DateTime::Parse 메서드"
linktitle: "Parse"
second_title: "C++용 Aspose.Page"
description: "System::DateTime::Parse 메서드. 지정된 날짜 및 시간 값의 문자열 표현을 동등한 DateTime 객체로 변환합니다(C++에서)."
type: docs
weight: 6600
url: /ko/cpp/system/datetime/parse/
---
## DateTime::Parse(const String\&) method


지정된 날짜 및 시간 값의 문자열 표현을 동등한 [DateTime](../) 객체로 변환합니다.

```cpp
static DateTime System::DateTime::Parse(const String &s)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| s | const String\& | 변환할 날짜와 시간 값의 문자열 표현. |

### ReturnValue

[DateTime](../) 클래스의 새 인스턴스로, 지정된 문자열이 나타내는 날짜 및 시간 값과 동일한 값을 나타냅니다.

## 또 보기

* Class [DateTime](../)
* Class [String](../../string/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## 또 보기

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## 또 보기

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


지정된 날짜 및 시간 값의 문자열 표현을 문화별 형식 정보를 사용하여 동등한 [DateTime](../) 객체로 변환합니다.

```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| s | const String\& | 변환할 날짜와 시간 값의 문자열 표현. |
| provider | const SharedPtr\<IFormatProvider\>\& | 문화별 형식 정보를 제공하는 [IFormatProvider](../../iformatprovider/) 객체. |
| styles | Globalization::DateTimeStyles | 열거형 값들의 비트 연산 조합으로 **s**에 대한 추가 정보, **s**에 존재할 수 있는 스타일 요소, 또는 **s**를 [DateTime](../) 객체로 변환하는 것에 대한 정보를 제공합니다. |

### ReturnValue

[DateTime](../) 클래스의 새 인스턴스로, 지정된 문자열이 나타내는 날짜 및 시간 값과 동일한 값을 나타냅니다.

## 또 보기

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::Parse(const String\&, std::nullptr_t, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, std::nullptr_t, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## 또 보기

* Class [DateTime](../)
* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
