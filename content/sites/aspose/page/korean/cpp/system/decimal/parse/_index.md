---
title: "System::Decimal::Parse 메서드"
linktitle: "Parse"
second_title: "C++용 Aspose.Page"
description: "System::Decimal::Parse 메서드. 10진수 숫자의 문자열 표현을 C++에서 동등한 Decimal 클래스 인스턴스로 변환합니다."
type: docs
weight: 4200
url: /ko/cpp/system/decimal/parse/
---
## Decimal::Parse(const String\&) method


10진수 숫자의 문자열 표현을 [Decimal](../) 클래스의 동등한 인스턴스로 변환합니다.

```cpp
static Decimal System::Decimal::Parse(const String &s)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| s | const String\& | 숫자의 문자열 표현 |

### ReturnValue

지정된 문자열이 나타내는 값과 동등한 값을 나타내는 [Decimal](../) 클래스의 새 인스턴스.

## 또 보기

* Class [Decimal](../)
* Class [String](../../string/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Decimal::Parse(const String\&, const SharedPtr\<IFormatProvider\>\&) method


지정된 형식 제공자를 사용하여 10진수 숫자의 문자열 표현을 [Decimal](../) 클래스의 동등한 인스턴스로 변환합니다.

```cpp
static Decimal System::Decimal::Parse(const String &s, const SharedPtr<IFormatProvider> &provider)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| s | const String\& | 변환할 10진수 값의 문자열 표현 |
| 제공자 | const SharedPtr\<IFormatProvider\>\& | 형식 제공자 |

### ReturnValue

지정된 문자열이 나타내는 값과 동등한 값을 나타내는 [Decimal](../) 클래스의 새 인스턴스

## 또 보기

* Class [Decimal](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Decimal::Parse(const String\&, Globalization::NumberStyles) method


지정된 스타일을 사용하여 10진수의 문자열 표현을 [Decimal](../) 클래스의 동등한 인스턴스로 변환합니다.

```cpp
static Decimal System::Decimal::Parse(const String &s, Globalization::NumberStyles styles)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| s | const String\& | 변환할 10진수 값의 문자열 표현 |
| styles | Globalization::NumberStyles | 열거형 값들의 비트별 조합으로, **s**에 대한 추가 정보, **s**에 존재할 수 있는 스타일 요소에 대한 정보, 또는 **s**를 [Decimal](../) 객체로 변환하는 것에 대한 정보를 제공합니다. |

### ReturnValue

지정된 문자열이 나타내는 값과 동등한 값을 나타내는 [Decimal](../) 클래스의 새 인스턴스

## 또 보기

* Class [Decimal](../)
* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Decimal::Parse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) method


지정된 스타일 및 형식 제공자를 사용하여 10진수의 문자열 표현을 [Decimal](../) 클래스의 동등한 인스턴스로 변환합니다.

```cpp
static Decimal System::Decimal::Parse(const String &s, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| s | const String\& | 변환할 10진수 값의 문자열 표현 |
| styles | Globalization::NumberStyles | 열거형 값들의 비트별 조합으로, **s**에 대한 추가 정보, **s**에 존재할 수 있는 스타일 요소에 대한 정보, 또는 **s**를 [Decimal](../) 객체로 변환하는 것에 대한 정보를 제공합니다. |
| 제공자 | const SharedPtr\<IFormatProvider\>\& | 형식 제공자 |

### ReturnValue

지정된 문자열이 나타내는 값과 동등한 값을 나타내는 [Decimal](../) 클래스의 새 인스턴스

## 또 보기

* Class [Decimal](../)
* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
