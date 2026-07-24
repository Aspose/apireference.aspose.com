---
title: "System::DateTime::ParseExact 메서드"
linktitle: "ParseExact"
second_title: "C++용 Aspose.Page"
description: "C++에서 System::DateTime 클래스의 ParseExact 메서드를 사용하는 방법."
type: docs
weight: 6700
url: /ko/cpp/system/datetime/parseexact/
---
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles)
```

## 또 보기

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles)
```

## 또 보기

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


지정된 형식, 문화별 형식 정보 및 스타일을 사용하여 날짜와 시간 값의 지정된 문자열 표현을 동등한 [DateTime](../) 객체로 변환합니다. 문자열 표현의 형식은 지정된 형식 중 하나와 정확히 일치해야 합니다. 변환에 실패하면 예외를 발생시킵니다.

```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| s | const String\& | 변환할 날짜와 시간 값의 문자열 표현. |
| 형식 | const ArrayPtr\<String\>\& | 문자열 형식 배열. |
| provider | const SharedPtr\<IFormatProvider\>\& | 문화별 형식 정보를 제공하는 [IFormatProvider](../../iformatprovider/) 객체. |
| styles | Globalization::DateTimeStyles | 열거형 값들의 비트 연산 조합으로 **s**에 대한 추가 정보, **s**에 존재할 수 있는 스타일 요소, 또는 **s**를 [DateTime](../) 객체로 변환하는 것에 대한 정보를 제공합니다. |

### ReturnValue

[DateTime](../) 클래스의 새 인스턴스로, 지정된 문자열이 나타내는 날짜 및 시간 값과 동일한 값을 나타냅니다.

## 또 보기

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, std::nullptr_t, Globalization::DateTimeStyles styles)
```

## 또 보기

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ParseExact(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
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
## DateTime::ParseExact(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
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
## DateTime::ParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


지정된 형식과 문화별 형식 정보를 사용하여 날짜 및 시간 값의 문자열 표현을 동등한 [DateTime](../) 객체로 변환합니다. 문자열 표현의 형식은 지정된 형식과 정확히 일치해야 합니다. 변환이 실패하면 예외를 발생시킵니다.

```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| s | const String\& | 변환할 날짜와 시간 값의 문자열 표현. |
| 형식 | const String\& | 문자열 형식. |
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
## DateTime::ParseExact(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, std::nullptr_t, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## 또 보기

* Class [DateTime](../)
* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
