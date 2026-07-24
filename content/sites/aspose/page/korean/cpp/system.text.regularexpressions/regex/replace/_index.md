---
title: "System::Text::RegularExpressions::Regex::Replace method"
linktitle: "바꾸기"
second_title: "C++용 Aspose.Page"
description: "System::Text::RegularExpressions::Regex::Replace method. C++에서 문자열의 정규식 모든 일치를 교체 문자열로 바꿉니다."
type: docs
weight: 800
url: /ko/cpp/system.text.regularexpressions/regex/replace/
---
## Regex::Replace(const String\&, const char_t *) method


문자열에서 정규식의 모든 매치를 교체 문자열로 바꿉니다.

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const char_t *replacement)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const String\& | 입력 문자열. |
| 교체 문자열 | const char_t * | 교체 문자열. |

### ReturnValue

교체 문자열로 모든 정규식 일치 항목이 교체된 입력 문자열.

## 또 보기

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const MatchEvaluator\&) method


문자열의 모든 일치를 대리자에서 생성된 교체 문자열로 바꿉니다.

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const MatchEvaluator &evaluator)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const String\& | 입력 문자열. |
| 평가자 | const MatchEvaluator\& | 일치 항목을 기반으로 교체 문자열을 생성하는 대리자. |

### ReturnValue

모든 일치 항목이 교체된 입력 문자열.

## 또 보기

* Class [String](../../../system/string/)
* Typedef [MatchEvaluator](../../matchevaluator/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const MatchEvaluator\&, int) method


문자열의 모든 일치를 대리자에서 생성된 교체 문자열로 바꿉니다.

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const MatchEvaluator &evaluator, int count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const String\& | 입력 문자열. |
| 평가자 | const MatchEvaluator\& | 일치 항목을 기반으로 교체 문자열을 생성하는 대리자. |
| count | int | 교체 횟수 제한. |

### ReturnValue

모든 일치 항목이 교체된 입력 문자열.

## 또 보기

* Class [String](../../../system/string/)
* Typedef [MatchEvaluator](../../matchevaluator/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const MatchEvaluator\&, int, int) method


문자열의 모든 일치를 대리자에서 생성된 교체 문자열로 바꿉니다.

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const MatchEvaluator &evaluator, int count, int startat)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const String\& | 입력 문자열. |
| 평가자 | const MatchEvaluator\& | 일치 항목을 기반으로 교체 문자열을 생성하는 대리자. |
| count | int | 교체 횟수 제한. |
| startat | int | 교체를 시작할 입력 문자열의 인덱스. |

### ReturnValue

모든 일치 항목이 교체된 입력 문자열.

## 또 보기

* Class [String](../../../system/string/)
* Typedef [MatchEvaluator](../../matchevaluator/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&) method


문자열에서 정규식의 모든 매치를 교체 문자열로 바꿉니다.

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &replacement)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const String\& | 입력 문자열. |
| 교체 문자열 | const String\& | 교체 문자열. |

### ReturnValue

교체 문자열로 모든 정규식 일치 항목이 교체된 입력 문자열.

## 또 보기

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, int) method


문자열의 하위 문자열을 교체합니다. 구현되지 않음.

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &replacement, int count)
```

## 또 보기

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, int, int) method


문자열의 하위 문자열을 교체합니다. 구현되지 않음.

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &replacement, int count, int startat)
```

## 또 보기

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const char_t *, const char_t *) method


문자열에서 정규식의 모든 매치를 교체 문자열로 바꿉니다.

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const char_t *pattern, const char_t *replacement)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const String\& | 입력 문자열. |
| pattern | const char_t * | [Regex](../) 패턴. |
| 교체 문자열 | const char_t * | 교체 문자열. |

### ReturnValue

교체 문자열로 모든 정규식 일치 항목이 교체된 입력 문자열.

## 또 보기

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, const char_t *) method


문자열에서 정규식의 모든 매치를 교체 문자열로 바꿉니다.

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &pattern, const char_t *replacement)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const String\& | 입력 문자열. |
| pattern | const String\& | [Regex](../) 패턴. |
| 교체 문자열 | const char_t * | 교체 문자열. |

### ReturnValue

교체 문자열로 모든 정규식 일치 항목이 교체된 입력 문자열.

## 또 보기

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, const MatchEvaluator\&) method


정규식 일치를 교체합니다.

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &pattern, const MatchEvaluator &evaluator)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const String\& | 입력 문자열. |
| 패턴 | const String\& | 정규식 패턴. |
| 평가자 | const MatchEvaluator\& | 각 매치에 대한 교체 문자열을 생성하는 대리자. |

### ReturnValue

[String](../../../system/string/) with all matches replaced.

## 또 보기

* Class [String](../../../system/string/)
* Typedef [MatchEvaluator](../../matchevaluator/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, const MatchEvaluator\&, RegexOptions) method


문자열의 모든 일치를 대리자에서 생성된 교체 문자열로 바꿉니다 (정적 함수).

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &pattern, const MatchEvaluator &evaluator, RegexOptions options)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const String\& | 입력 문자열. |
| pattern | const String\& | [Regex](../) 패턴. |
| 평가자 | const MatchEvaluator\& | 일치 항목을 기반으로 교체 문자열을 생성하는 대리자. |
| options | RegexOptions | [Regex](../) 옵션. |

### ReturnValue

모든 일치 항목이 교체된 입력 문자열.

## 또 보기

* Class [String](../../../system/string/)
* Typedef [MatchEvaluator](../../matchevaluator/)
* Enum [RegexOptions](../../regexoptions/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, const String\&) method


정규식 일치를 교체합니다.

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &pattern, const String &replacement)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const String\& | 입력 문자열. |
| 패턴 | const String\& | 정규식 패턴. |
| 교체 문자열 | const String\& | 교체 문자열. |

### ReturnValue

[String](../../../system/string/) with all matches replaced.

## 또 보기

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, const String\&, RegexOptions) method


문자열에서 정규식의 모든 매치를 교체 문자열로 바꿉니다.

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &pattern, const String &replacement, RegexOptions options)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 입력 | const String\& | 입력 문자열. |
| pattern | const String\& | [Regex](../) 패턴. |
| 교체 문자열 | const String\& | 교체 문자열. |
| options | RegexOptions | [Regex](../) 옵션. |

### ReturnValue

교체 문자열로 모든 정규식 일치 항목이 교체된 입력 문자열.

## 또 보기

* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
