---
title: "System::Text::RegularExpressions::Regex::Matches 메서드"
linktitle: "Matches"
second_title: "C++용 Aspose.Page"
description: "System::Text::RegularExpressions::Regex::Matches 메서드. C++에서 반복적으로 매칭하여 주어진 문자열에서 정규식의 모든 매치를 가져옵니다."
type: docs
weight: 700
url: /ko/cpp/system.text.regularexpressions/regex/matches/
---
## Regex::Matches(const String\&, int) method


주어진 문자열에서 정규식을 반복 매칭하여 모든 매치를 가져옵니다.

```cpp
MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, int startat=0)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const String\& | 입력 문자열. |
| startat | int | 매칭을 시작할 인덱스. |

### ReturnValue

찾은 모든 매치의 컬렉션.

## 또 보기

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Matches(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


문자열과 패턴 사이의 모든 매치를 가져옵니다.

```cpp
static MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
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

반복 매칭으로 찾은 모든 매치.

## 또 보기

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
