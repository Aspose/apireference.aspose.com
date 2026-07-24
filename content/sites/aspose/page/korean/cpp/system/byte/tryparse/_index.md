---
title: "System::Byte::TryParse 메서드"
linktitle: "TryParse"
second_title: "C++용 Aspose.Page"
description: "C++에서 System::Byte 클래스의 TryParse 메서드를 사용하는 방법입니다."
type: docs
weight: 200
url: /ko/cpp/system/byte/tryparse/
---
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, uint8_t &result)
```

## 또 보기

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, uint8_t &result)
```

## 또 보기

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, uint8_t\&) method


제공된 서식 정보와 숫자 스타일을 사용하여 숫자의 문자열 표현을 포함하는 지정된 문자열을 동등한 8비트 부호 없는 정수로 변환합니다.

```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, uint8_t &result)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const String\& | 변환할 문자열. |
| styles | Globalization::NumberStyles | 숫자의 문자열 표현에 허용되는 스타일을 지정하는 NumberStyles 열거형 값들의 비트별 조합입니다. |
| 제공자 | const SharedPtr\<IFormatProvider\>\& | 문자열 형식 정보를 포함하는 객체에 대한 포인터입니다. |
| result | uint8_t\& | 변환 결과가 저장되는 8비트 부호 없는 정수 변수에 대한 참조입니다. |

### ReturnValue

변환이 성공하면 true, 그렇지 않으면 false입니다.

## 또 보기

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, uint8_t &result)
```

## 또 보기

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Byte::TryParse(const String\&, uint8_t\&) method


숫자의 문자열 표현을 포함하는 지정된 문자열을 동등한 8비트 부호 없는 정수로 변환합니다.

```cpp
static bool System::Byte::TryParse(const String &value, uint8_t &result)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const String\& | 변환할 문자열. |
| result | uint8_t\& | 변환 결과가 저장되는 8비트 부호 없는 정수 변수에 대한 참조입니다. |

### ReturnValue

변환이 성공하면 true, 그렇지 않으면 false입니다.

## 또 보기

* Class [String](../../string/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
