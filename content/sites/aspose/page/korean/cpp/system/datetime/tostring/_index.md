---
title: "System::DateTime::ToString 메서드"
linktitle: "ToString"
second_title: "C++용 Aspose.Page"
description: "System::DateTime::ToString 메서드. 현재 문화권에 정의된 서식 규칙을 사용하여 현재 객체가 나타내는 날짜 및 시간 값의 문자열 표현을 C++에서 반환합니다."
type: docs
weight: 5200
url: /ko/cpp/system/datetime/tostring/
---
## DateTime::ToString() const method


현재 문화에서 정의된 서식 규칙을 사용하여 현재 객체가 나타내는 날짜 및 시간 값의 문자열 표현을 반환합니다.

```cpp
String System::DateTime::ToString() const
```


### ReturnValue

현재 객체가 나타내는 값의 문자열 표현

## 또 보기

* Class [String](../../string/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ToString(const SharedPtr\<Globalization::CultureInfo\>\&) const method




```cpp
String System::DateTime::ToString(const SharedPtr<Globalization::CultureInfo> &culture) const
```

## 또 보기

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ToString(const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const method




```cpp
String System::DateTime::ToString(const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi) const
```

## 또 보기

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ToString(const SharedPtr\<IFormatProvider\>\&) const method


지정된 형식 정보를 사용하여 현재 객체가 나타내는 날짜 및 시간 값의 문자열 표현을 반환합니다.

```cpp
String System::DateTime::ToString(const SharedPtr<IFormatProvider> &provider) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 제공자 | const SharedPtr\<IFormatProvider\>\& | 서식 정보를 나타내는 객체 |

### ReturnValue

현재 객체가 나타내는 값을 **formatProvider**가 제공하는 서식 정보에 따라 포맷한 문자열 표현

## 또 보기

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ToString(const String\&) const method


현재 문화에서 정의된 서식 규칙과 지정된 형식을 사용하여 현재 객체가 나타내는 날짜 및 시간 값의 문자열 표현을 반환합니다.

```cpp
String System::DateTime::ToString(const String &format) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 형식 | const String\& | 서식 문자열 |

### ReturnValue

현재 객체가 나타내는 값을 **format**와 현재 문화권에 정의된 서식에 따라 포맷한 문자열 표현

## 또 보기

* Class [String](../../string/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ToString(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const method




```cpp
String System::DateTime::ToString(const String &format, const SharedPtr<Globalization::CultureInfo> &culture) const
```

## 또 보기

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ToString(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const method




```cpp
String System::DateTime::ToString(const String &format, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi) const
```

## 또 보기

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ToString(const String\&, const SharedPtr\<IFormatProvider\>\&) const method


지정된 형식 정보를 사용하여 현재 객체가 나타내는 날짜 및 시간 값의 문자열 표현을 반환합니다.

```cpp
String System::DateTime::ToString(const String &format, const SharedPtr<IFormatProvider> &provider) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 형식 | const String\& | 서식 문자열 |
| 제공자 | const SharedPtr\<IFormatProvider\>\& | 서식 정보를 나타내는 객체 |

### ReturnValue

현재 객체가 나타내는 값을 **provider**가 제공하는 서식 정보와 서식 문자열 **format**에 따라 포맷한 문자열 표현

## 또 보기

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ToString(const String\&, std::nullptr_t) const method




```cpp
String System::DateTime::ToString(const String &format, std::nullptr_t) const
```

## 또 보기

* Class [String](../../string/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::ToString(std::nullptr_t) const method




```cpp
String System::DateTime::ToString(std::nullptr_t) const
```

## 또 보기

* Class [String](../../string/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
