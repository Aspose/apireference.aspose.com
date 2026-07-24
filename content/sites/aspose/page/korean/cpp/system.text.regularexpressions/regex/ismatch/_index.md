---
title: "System::Text::RegularExpressions::Regex::IsMatch 메서드"
linktitle: "IsMatch"
second_title: "C++용 Aspose.Page"
description: "System::Text::RegularExpressions::Regex::IsMatch 메서드. C++에서 정규식을 문자열에 매치합니다."
type: docs
weight: 500
url: /ko/cpp/system.text.regularexpressions/regex/ismatch/
---
## Regex::IsMatch(const String\&, int) method


정규식을 문자열에 매치합니다.

```cpp
bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, int startat=0)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const String\& | 대상 문자열. |
| startat | int | 시작 인덱스. |

### ReturnValue

문자열이 정규식과 일치하면 true, 그렇지 않으면 false.

## 또 보기

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::IsMatch(const String\&, const String\&, RegexOptions, TimeSpan, int) method


문자열이 패턴과 일치하는지 확인합니다.

```cpp
static bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const String\& | 입력 문자열. |
| 패턴 | const String\& | 정규식 패턴. |
| 옵션 | RegexOptions | 매칭 옵션. |
| matchTimeout | TimeSpan | 시간 제한. |
| startat | int | [Match](../../match/) 시작 위치. |

### ReturnValue

매치가 발견되면 true, 그렇지 않으면 false.

## 또 보기

* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
