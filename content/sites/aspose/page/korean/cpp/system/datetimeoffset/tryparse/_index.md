---
title: "System::DateTimeOffset::TryParse 메서드"
linktitle: "TryParse"
second_title: "C++용 Aspose.Page"
description: "System::DateTimeOffset::TryParse 메서드. 지정된 문자열을 지정된 형식 제공자와 형식 스타일을 사용하여 C++에서 DateTimeOffset 객체로 변환하려고 시도합니다."
type: docs
weight: 5700
url: /ko/cpp/system/datetimeoffset/tryparse/
---
## DateTimeOffset::TryParse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


지정된 문자열을 지정된 형식 제공자와 형식 스타일을 사용하여 [DateTimeOffset](../) 객체로 변환하려고 시도합니다.

```cpp
static bool System::DateTimeOffset::TryParse(const String &input, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| input | const String\& | [String](../../string/) 변환용. |
| 제공자 | const SharedPtr\<IFormatProvider\>\& | 형식 제공자. |
| styles | Globalization::DateTimeStyles | 날짜 및 시간 형식 스타일입니다. |
| result | DateTimeOffset\& | [DateTimeOffset](../) 은 **input** 와 동일합니다. |

### ReturnValue

**input** 이(가) 성공적으로 변환되면 true, 그렇지 않으면 false.

## 또 보기

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::TryParse(const String\&, DateTimeOffset\&) method


지정된 문자열을 [DateTimeOffset](../) 객체로 변환하려고 시도합니다.

```cpp
static bool System::DateTimeOffset::TryParse(const String &input, DateTimeOffset &result)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| input | const String\& | [String](../../string/) 변환용. |
| result | DateTimeOffset\& | [DateTimeOffset](../) 은 **input** 와 동일합니다. |

### ReturnValue

**input** 이(가) 성공적으로 변환되면 true, 그렇지 않으면 false.

## 또 보기

* Class [String](../../string/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
