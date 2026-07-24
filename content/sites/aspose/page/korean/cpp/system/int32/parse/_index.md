---
title: "System::Int32::Parse 메서드"
linktitle: "Parse"
second_title: "C++용 Aspose.Page"
description: "C++에서 System::Int32 클래스의 Parse 메서드를 사용하는 방법."
type: docs
weight: 100
url: /ko/cpp/system/int32/parse/
---
## Int32::Parse(const ReadOnlySpan\<char16_t\>\&) method




```cpp
static int32_t System::Int32::Parse(const ReadOnlySpan<char16_t> &span)
```

## 또 보기

* Class [ReadOnlySpan](../../readonlyspan/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::Parse(const ReadOnlySpan\<char16_t\>\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) method




```cpp
static int32_t System::Int32::Parse(const ReadOnlySpan<char16_t> &span, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider)
```

## 또 보기

* Class [ReadOnlySpan](../../readonlyspan/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::Parse(const ReadOnlySpan\<char16_t\>\&, std::nullptr_t) method




```cpp
static int32_t System::Int32::Parse(const ReadOnlySpan<char16_t> &span, std::nullptr_t)
```

## 또 보기

* Class [ReadOnlySpan](../../readonlyspan/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::Parse(const String\&) method


지정된 문자열(숫자의 문자열 표현을 포함)을 해당 32비트 부호 있는 정수로 변환합니다.

```cpp
static int32_t System::Int32::Parse(const String &value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const String\& | 변환할 문자열. |

### ReturnValue

지정된 문자열이 나타내는 숫자와 같은 32비트 부호 있는 정수.

## 또 보기

* Class [String](../../string/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::Parse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) method




```cpp
static int32_t System::Int32::Parse(const String &value, const SharedPtr<Globalization::CultureInfo> &culture)
```

## 또 보기

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::Parse(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) method




```cpp
static int32_t System::Int32::Parse(const String &value, const SharedPtr<Globalization::NumberFormatInfo> &nfi)
```

## 또 보기

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::Parse(const String\&, const SharedPtr\<IFormatProvider\>\&) method


제공된 서식 정보를 사용하여 지정된 문자열(숫자의 문자열 표현을 포함)을 해당 32비트 부호 있는 정수로 변환합니다.

```cpp
static int32_t System::Int32::Parse(const String &value, const SharedPtr<IFormatProvider> &provider)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const String\& | 변환할 문자열. |
| 제공자 | const SharedPtr\<IFormatProvider\>\& | 문자열 형식 정보를 포함하는 객체에 대한 포인터입니다. |

### ReturnValue

지정된 문자열이 나타내는 숫자와 같은 32비트 부호 있는 정수.

## 또 보기

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::Parse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&) method




```cpp
static int32_t System::Int32::Parse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture)
```

## 또 보기

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::Parse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&) method




```cpp
static int32_t System::Int32::Parse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi)
```

## 또 보기

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::Parse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) method


제공된 서식 정보와 숫자 스타일을 사용하여 지정된 문자열(숫자의 문자열 표현을 포함)을 해당 32비트 부호 있는 정수로 변환합니다.

```cpp
static int32_t System::Int32::Parse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const String\& | 변환할 문자열. |
| styles | Globalization::NumberStyles | 숫자의 문자열 표현에 허용되는 스타일을 지정하는 NumberStyles 열거형 값들의 비트별 조합입니다. |
| 제공자 | const SharedPtr\<IFormatProvider\>\& | 문자열 형식 정보를 포함하는 객체에 대한 포인터입니다. |

### ReturnValue

지정된 문자열이 나타내는 숫자와 같은 32비트 부호 있는 정수.

## 또 보기

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::Parse(const String\&, Globalization::NumberStyles, std::nullptr_t) method




```cpp
static int32_t System::Int32::Parse(const String &value, Globalization::NumberStyles styles, std::nullptr_t=nullptr)
```

## 또 보기

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::Parse(const String\&, std::nullptr_t) method




```cpp
static int32_t System::Int32::Parse(const String &value, std::nullptr_t)
```

## 또 보기

* Class [String](../../string/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
