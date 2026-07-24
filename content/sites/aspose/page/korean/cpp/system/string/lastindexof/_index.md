---
title: "System::String::LastIndexOf 메서드"
linktitle: "LastIndexOf"
second_title: "C++용 Aspose.Page"
description: "System::String::LastIndexOf 메서드. C++에서 문자를 역방향으로 찾습니다."
type: docs
weight: 2400
url: /ko/cpp/system/string/lastindexof/
---
## String::LastIndexOf(char_t) const method


문자 뒤쪽 조회.

```cpp
int System::String::LastIndexOf(char_t value) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | char_t | 찾을 문자. |

### ReturnValue

마지막 문자 위치의 인덱스이며, 찾지 못하면 -1을 반환합니다.

## 또 보기

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(char_t, int32_t) const method


문자 뒤쪽 조회.

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | char_t | 찾을 문자. |
| startIndex | int32_t | 검색을 시작할 인덱스. |

### ReturnValue

startIndex 이후 마지막 문자 위치의 인덱스이며, 찾지 못하면 -1을 반환합니다.

## 또 보기

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(char_t, int32_t, int32_t) const method


문자 뒤쪽 조회.

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex, int32_t count) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | char_t | 찾을 문자. |
| startIndex | int32_t | 검색을 시작할 인덱스. |
| count | int32_t | 검색할 문자 수 |

### ReturnValue

startIndex 이후 마지막 문자 위치의 인덱스이며, 찾지 못하면 -1을 반환합니다.

## 또 보기

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int, System::StringComparison) const method


부분 문자열 뒤쪽 조회.

```cpp
int System::String::LastIndexOf(const String &str, int startIndex, System::StringComparison comparison_type) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const String\& | 검색할 부분 문자열. |
| startIndex | int | 원본 문자열에서 검색을 시작할 위치. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) 모드. |

### ReturnValue

마지막으로 찾은 부분 문자열의 인덱스이며, 찾지 못하면 -1을 반환합니다. 검색 문자열이 비어 있으면 항상 문자열 길이를 반환합니다.

## 또 보기

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int) const method


부분 문자열 뒤쪽 조회.

```cpp
int System::String::LastIndexOf(const String &str, int startIndex=INT32_MAX) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const String\& | 검색할 부분 문자열. |
| startIndex | int | 원본 문자열에서 검색을 시작할 위치. |

### ReturnValue

마지막으로 찾은 부분 문자열의 인덱스이며, 찾지 못하면 -1을 반환합니다. 검색 문자열이 비어 있으면 항상 문자열 길이를 반환합니다.

## 또 보기

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, System::StringComparison) const method


부분 문자열 뒤쪽 조회.

```cpp
int System::String::LastIndexOf(const String &str, System::StringComparison comparison_type) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const String\& | 검색할 부분 문자열. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) 모드. |

### ReturnValue

마지막으로 찾은 부분 문자열의 인덱스이며, 찾지 못하면 -1을 반환합니다. 검색 문자열이 비어 있으면 항상 문자열 길이를 반환합니다.

## 또 보기

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int, int, StringComparison) const method


부분 문자열 뒤쪽 조회.

```cpp
int System::String::LastIndexOf(const String &value, int startIndex, int count, StringComparison comparisonType) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const String\& | 검색할 부분 문자열. |
| startIndex | int | 원본 문자열에서 검색을 시작할 위치. |
| count | int | 검색할 문자 수. |
| comparisonType | StringComparison | [Comparison](../../comparison/) 모드. |

### ReturnValue

마지막으로 찾은 부분 문자열의 인덱스이며, 찾지 못하면 -1을 반환합니다. 검색 문자열이 비어 있으면 항상 startIndex+count를 반환합니다.

## 또 보기

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
