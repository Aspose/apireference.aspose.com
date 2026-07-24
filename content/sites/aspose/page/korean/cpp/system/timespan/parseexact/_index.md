---
title: "System::TimeSpan::ParseExact 메서드"
linktitle: "ParseExact"
second_title: "C++용 Aspose.Page"
description: "C++에서 System::TimeSpan 클래스의 ParseExact 메서드를 사용하는 방법."
type: docs
weight: 4300
url: /ko/cpp/system/timespan/parseexact/
---
## TimeSpan::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles) method




```cpp
static TimeSpan System::TimeSpan::ParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::TimeSpanStyles styles=Globalization::TimeSpanStyles::None)
```

## 또 보기

* Class [TimeSpan](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [TimeSpanStyles](../../../system.globalization/timespanstyles/)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TimeSpan::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles) method




```cpp
static TimeSpan System::TimeSpan::ParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::TimeSpanStyles styles=Globalization::TimeSpanStyles::None)
```

## 또 보기

* Class [TimeSpan](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [TimeSpanStyles](../../../system.globalization/timespanstyles/)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TimeSpan::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles) method


지정된 형식, 형식 제공자 및 스타일을 사용하여 문자열을 동등한 [TimeSpan](../) 객체로 변환합니다.

```cpp
static TimeSpan System::TimeSpan::ParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::TimeSpanStyles styles=Globalization::TimeSpanStyles::None)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const String\& | 입력 문자열. |
| formats | const ArrayPtr\<String\>\& | 형식 문자열의 [Array](../../array/)입니다. |
| 제공자 | const SharedPtr\<IFormatProvider\>\& | 문화별 형식 정보를 제공하는 형식 제공자. |
| styles | Globalization::TimeSpanStyles | 입력 문자열에 존재할 수 있는 요소들을 정의합니다. |

### ReturnValue

문자열에 해당하는 시간 간격.

## 또 보기

* Class [TimeSpan](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [TimeSpanStyles](../../../system.globalization/timespanstyles/)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TimeSpan::ParseExact(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::TimeSpanStyles) method




```cpp
static TimeSpan System::TimeSpan::ParseExact(const String &input, const ArrayPtr<String> &formats, std::nullptr_t, Globalization::TimeSpanStyles styles=Globalization::TimeSpanStyles::None)
```

## 또 보기

* Class [TimeSpan](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Enum [TimeSpanStyles](../../../system.globalization/timespanstyles/)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TimeSpan::ParseExact(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles) method




```cpp
static TimeSpan System::TimeSpan::ParseExact(const String &input, const String &format, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::TimeSpanStyles styles=Globalization::TimeSpanStyles::None)
```

## 또 보기

* Class [TimeSpan](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [TimeSpanStyles](../../../system.globalization/timespanstyles/)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TimeSpan::ParseExact(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles) method




```cpp
static TimeSpan System::TimeSpan::ParseExact(const String &input, const String &format, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::TimeSpanStyles styles=Globalization::TimeSpanStyles::None)
```

## 또 보기

* Class [TimeSpan](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [TimeSpanStyles](../../../system.globalization/timespanstyles/)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TimeSpan::ParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles) method


지정된 형식, 형식 제공자 및 스타일을 사용하여 문자열을 동등한 [TimeSpan](../) 객체로 변환합니다.

```cpp
static TimeSpan System::TimeSpan::ParseExact(const String &input, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::TimeSpanStyles styles=Globalization::TimeSpanStyles::None)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const String\& | 입력 문자열. |
| 형식 | const String\& | 표준 또는 사용자 지정 형식 문자열. |
| 제공자 | const SharedPtr\<IFormatProvider\>\& | 문화별 형식 정보를 제공하는 형식 제공자. |
| styles | Globalization::TimeSpanStyles | 입력 문자열에 존재할 수 있는 요소들을 정의합니다. |

### ReturnValue

문자열에 해당하는 시간 간격.

## 또 보기

* Class [TimeSpan](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [TimeSpanStyles](../../../system.globalization/timespanstyles/)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TimeSpan::ParseExact(const String\&, const String\&, std::nullptr_t, Globalization::TimeSpanStyles) method




```cpp
static TimeSpan System::TimeSpan::ParseExact(const String &input, const String &format, std::nullptr_t, Globalization::TimeSpanStyles styles=Globalization::TimeSpanStyles::None)
```

## 또 보기

* Class [TimeSpan](../)
* Class [String](../../string/)
* Enum [TimeSpanStyles](../../../system.globalization/timespanstyles/)
* Class [TimeSpan](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
