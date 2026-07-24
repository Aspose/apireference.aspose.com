---
title: "System::DateTimeOffset::Parse 메서드"
linktitle: "Parse"
second_title: "C++용 Aspose.Page"
description: "System::DateTimeOffset::Parse 메서드. 지정된 문자열을 C++에서 DateTimeOffset에 해당하는 형태로 변환합니다."
type: docs
weight: 5500
url: /ko/cpp/system/datetimeoffset/parse/
---
## DateTimeOffset::Parse(const String\&) method


지정된 문자열을 [DateTimeOffset](../) 등가 형태로 변환합니다.

```cpp
static DateTimeOffset System::DateTimeOffset::Parse(const String &input)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| input | const String\& | [String](../../string/) 변환용. |

### ReturnValue

[DateTimeOffset](../) that is equivalent to the **input**.

## 또 보기

* Class [DateTimeOffset](../)
* Class [String](../../string/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::Parse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


지정된 문자열을 지정된 형식 제공자와 형식 스타일을 사용하여 [DateTimeOffset](../) 객체로 변환합니다.

```cpp
static DateTimeOffset System::DateTimeOffset::Parse(const String &input, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| input | const String\& | [String](../../string/) 변환용. |
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
