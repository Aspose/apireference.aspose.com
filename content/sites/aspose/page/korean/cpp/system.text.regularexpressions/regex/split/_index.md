---
title: "System::Text::RegularExpressions::Regex::Split 메서드"
linktitle: "Split"
second_title: "C++용 Aspose.Page"
description: "System::Text::RegularExpressions::Regex::Split 메서드. C++에서 정규식 매치를 기준으로 문자열을 분할합니다."
type: docs
weight: 900
url: /ko/cpp/system.text.regularexpressions/regex/split/
---
## Regex::Split(const String\&) method


정규식 일치를 기준으로 문자열을 분할합니다.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/)을(를) 분할할 문자열. |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, int) method


정규식 일치를 기준으로 문자열을 분할합니다.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/)을(를) 분할할 문자열. |
| count | int | 하위 문자열 제한 수. |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, int, int) method


입력 문자열을 [Regex](../) 생성자에 지정된 정규식으로 정의된 위치에서 지정된 최대 횟수만큼 하위 문자열 배열로 분할합니다. 정규식 패턴 검색은 입력 문자열의 지정된 문자 위치에서 시작합니다.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count, int startat)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const String\& | 분할할 문자열. |
| count | int | 분할이 발생할 수 있는 최대 횟수. |
| startat | int | 검색이 시작될 입력 문자열의 문자 위치. |

### ReturnValue

문자열 배열.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, const String\&, int, RegexOptions, TimeSpan) method


정규식으로 문자열을 분할합니다.

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, int count, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const String\& | 입력 문자열. |
| 패턴 | const String\& | 정규식 패턴. |
| count | int | [Match](../../match/) 수 제한. |
| 옵션 | RegexOptions | 매칭 옵션. |
| matchTimeout | TimeSpan | 시간 제한. |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, const String\&, RegexOptions, TimeSpan) method


정규식으로 문자열을 분할합니다.

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const String\& | 입력 문자열. |
| 패턴 | const String\& | 정규식 패턴. |
| 옵션 | RegexOptions | 매칭 옵션. |
| matchTimeout | TimeSpan | 시간 제한. |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
