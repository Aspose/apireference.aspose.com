---
title: "System::DateTimeOffset::ParseExact 메서드"
linktitle: "ParseExact"
second_title: "C++용 Aspose.Page"
description: "System::DateTimeOffset::ParseExact 메서드. C++에서 지정된 형식, 형식 제공자 및 서식 스타일을 사용하여 지정된 문자열을 DateTimeOffset 객체로 변환합니다."
type: docs
weight: 5600
url: /ko/cpp/system/datetimeoffset/parseexact/
---
## DateTimeOffset::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


지정된 문자열을 [DateTimeOffset](../) 객체로 변환합니다. 지정된 형식, 형식 제공자 및 서식 스타일을 사용합니다.

```cpp
static DateTimeOffset System::DateTimeOffset::ParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| input | const String\& | [String](../../string/) 변환용. |
| formats | const ArrayPtr\<String\>\& | 형식 문자열의 [Array](../../array/)입니다. |
| 제공자 | const SharedPtr\<IFormatProvider\>\& | 형식 제공자. |
| styles | Globalization::DateTimeStyles | 날짜 및 시간 형식 스타일입니다. |

### ReturnValue

[DateTimeOffset](../) that is equivalent to the **input**.

## 또 보기

* Class [DateTimeOffset](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::ParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


지정된 형식, 형식 제공자 및 서식 스타일을 사용하여 지정된 문자열을 [DateTimeOffset](../) 객체로 변환합니다.

```cpp
static DateTimeOffset System::DateTimeOffset::ParseExact(const String &input, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| input | const String\& | [String](../../string/) 변환용. |
| 형식 | const String\& | 형식 문자열. |
| 제공자 | const SharedPtr\<IFormatProvider\>\& | 형식 제공자. |
| styles | Globalization::DateTimeStyles | 날짜 및 시간 형식 스타일입니다. |

### ReturnValue

[DateTimeOffset](../) that is equivalent to the **input**.

## 또 보기

* Class [DateTimeOffset](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
