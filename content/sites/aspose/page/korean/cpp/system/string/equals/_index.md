---
title: "System::String::Equals 메서드"
linktitle: "같음"
second_title: "C++용 Aspose.Page"
description: "System::String::Equals 메서드. 문자열 동등성 비교. C++에서 System::StringComparison::Ordinal 비교 모드를 사용합니다."
type: docs
weight: 1100
url: /ko/cpp/system/string/equals/
---
## String::Equals(const String\&) const method


[String](../) equality comparison. Uses [System::StringComparison::Ordinal](../../stringcomparison/) comparison mode.

```cpp
bool System::String::Equals(const String &str) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const String\& | 현재 문자열과 비교할 [String](../). |

### ReturnValue

문자열이 일치하면 true, 그렇지 않으면 false.

## 또 보기

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Equals(const String\&, System::StringComparison) const method


[String](../) equality comparison. Several modes provided by [StringComparison](../../stringcomparison/) enumeration are supported.

```cpp
bool System::String::Equals(const String &str, System::StringComparison comparison_type) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const String\& | 현재 문자열과 비교할 [String](../). |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) 모드 (자세한 내용은 [System::StringComparison](../../stringcomparison/)을 참조하십시오). |

### ReturnValue

선택한 비교 유형을 사용하여 문자열이 일치하면 true, 그렇지 않으면 false.

## 또 보기

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Equals(const String\&, const String\&) method


Equal-연산자로 Ordial 비교 모드를 사용하여 두 문자열을 비교합니다.

```cpp
static bool System::String::Equals(const String &strA, const String &strB)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| strA | const String\& | 비교할 첫 번째 문자열. |
| strB | const String\& | 비교할 두 번째 문자열. |

### ReturnValue

문자열이 일치하면 true, 그렇지 않으면 false.

## 또 보기

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Equals(const String\&, const String\&, System::StringComparison) method


Equal-연산자로 두 문자열을 비교합니다.

```cpp
static bool System::String::Equals(const String &strA, const String &strB, System::StringComparison comparison_type)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| strA | const String\& | 비교할 첫 번째 문자열. |
| strB | const String\& | 비교할 두 번째 문자열. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) 모드. |

### ReturnValue

문자열이 일치하면 true, 그렇지 않으면 false.

## 또 보기

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
