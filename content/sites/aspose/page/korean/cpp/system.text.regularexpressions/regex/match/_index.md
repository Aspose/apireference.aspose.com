---
title: "System::Text::RegularExpressions::Regex::Match method"
linktitle: "Match"
second_title: "C++용 Aspose.Page"
description: "System::Text::RegularExpressions::Regex::Match method. C++에서 정규식을 문자열에 매칭합니다."
type: docs
weight: 600
url: /ko/cpp/system.text.regularexpressions/regex/match/
---
## Regex::Match(const String\&) method


정규식을 문자열에 매치합니다.

```cpp
MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const String\& | 대상 문자열. |

### ReturnValue

[Match](../../match/) value containing match status and submatches.

## 또 보기

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Match(const String\&, int, int) method


정규식을 문자열에 매치합니다.

```cpp
MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input, int startat, int length=0)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const String\& | 대상 문자열. |
| startat | int | 시작 인덱스. |
| 길이 | int | 탐색할 문자 수 (전체 문자열을 탐색하려면 0). |

### ReturnValue

[Match](../../match/) value containing match status and submatches.

## 또 보기

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Match(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


문자열과 패턴을 매치합니다.

```cpp
static MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const String\& | 입력 문자열. |
| 패턴 | const String\& | 정규식 패턴. |
| 옵션 | RegexOptions | 매칭 옵션. |
| matchTimeout | TimeSpan | 시간 제한. |
| startat | int | [Match](../../match/) 시작 위치. |
| 길이 | int | 검색할 문자 수 (0이면 제한 없음). |

### ReturnValue

첫 번째 일치 항목.

## 또 보기

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
