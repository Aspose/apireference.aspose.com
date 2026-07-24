---
title: "System::String::Compare 메서드"
linktitle: "Compare"
second_title: "C++용 Aspose.Page"
description: "System::String::Compare 메서드. C++에서 두 문자열을 작음-같음-큼 순으로 비교합니다."
type: docs
weight: 6200
url: /ko/cpp/system/string/compare/
---
## String::Compare(const String\&, const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) method


Less-equal-greater-연산자로 두 문자열을 비교합니다.

```cpp
static int System::String::Compare(const String &strA, const String &strB, bool ignoreCase, const SharedPtr<System::Globalization::CultureInfo> &ci)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| strA | const String\& | 비교할 첫 번째 문자열. |
| strB | const String\& | 비교할 두 번째 문자열. |
| ignoreCase | bool | 비교가 대소문자를 구분하지 않는지 여부를 지정합니다. |
| ci | const SharedPtr\<System::Globalization::CultureInfo\>\& | 비교에 사용할 문화권. |

### ReturnValue

첫 번째 부분 문자열이 두 번째보다 작으면 음수, 일치하면 0, 그 외에는 양수 값을 반환합니다.

## 또 보기

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, const String\&, bool) method


Less-equal-greater-연산자로 두 문자열을 비교합니다.

```cpp
static int System::String::Compare(const String &strA, const String &strB, bool ignoreCase=false)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| strA | const String\& | 비교할 첫 번째 문자열. |
| strB | const String\& | 비교할 두 번째 문자열. |
| ignoreCase | bool | 비교가 대소문자를 구분하지 않는지 여부를 지정합니다. |

### ReturnValue

첫 번째 부분 문자열이 두 번째보다 작으면 음수, 일치하면 0, 그 외에는 양수 값을 반환합니다.

## 또 보기

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, const String\&, System::StringComparison) method


Less-equal-greater-연산자로 두 문자열을 비교합니다.

```cpp
static int System::String::Compare(const String &strA, const String &strB, System::StringComparison comparison_type)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| strA | const String\& | 비교할 첫 번째 문자열. |
| strB | const String\& | 비교할 두 번째 문자열. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) 모드. |

### ReturnValue

첫 번째 부분 문자열이 두 번째보다 작으면 음수, 일치하면 0, 그 외에는 양수 값을 반환합니다.

## 또 보기

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) method


Less-equal-greater-연산자로 두 서브스트링을 비교합니다.

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, bool ignoreCase, const SharedPtr<System::Globalization::CultureInfo> &ci)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| strA | const String\& | 비교할 첫 번째 문자열. |
| indexA | int | 첫 번째 문자열 부분 문자열의 시작. |
| strB | const String\& | 비교할 두 번째 문자열. |
| indexB | int | 두 번째 문자열 부분 문자열의 시작. |
| 길이 | int | 비교할 문자 수. |
| ignoreCase | bool | 비교가 대소문자를 구분하지 않는지 여부를 지정합니다. |
| ci | const SharedPtr\<System::Globalization::CultureInfo\>\& | 비교에 사용할 문화권. |

### ReturnValue

첫 번째 부분 문자열이 두 번째보다 작으면 음수, 일치하면 0, 그 외에는 양수 값을 반환합니다.

## 또 보기

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, bool) method


Less-equal-greater-연산자로 두 서브스트링을 비교합니다.

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, bool ignoreCase=false)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| strA | const String\& | 비교할 첫 번째 문자열. |
| indexA | int | 첫 번째 문자열 부분 문자열의 시작. |
| strB | const String\& | 비교할 두 번째 문자열. |
| indexB | int | 두 번째 문자열 부분 문자열의 시작. |
| 길이 | int | 비교할 문자 수. |
| ignoreCase | bool | 비교가 대소문자를 구분하지 않는지 여부를 지정합니다. |

### ReturnValue

첫 번째 부분 문자열이 두 번째보다 작으면 음수, 일치하면 0, 그 외에는 양수 값을 반환합니다.

## 또 보기

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, System::StringComparison) method


Less-equal-greater-연산자로 두 문자열을 비교합니다.

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, System::StringComparison comparison_type)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| strA | const String\& | 비교할 첫 번째 문자열. |
| indexA | int | 첫 번째 문자열 부분 문자열의 시작. |
| strB | const String\& | 비교할 두 번째 문자열. |
| indexB | int | 두 번째 문자열 부분 문자열의 시작. |
| 길이 | int | 비교할 문자 수. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) 모드. |

### ReturnValue

첫 번째 부분 문자열이 두 번째보다 작으면 음수, 일치하면 0, 그 외에는 양수 값을 반환합니다.

## 또 보기

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
