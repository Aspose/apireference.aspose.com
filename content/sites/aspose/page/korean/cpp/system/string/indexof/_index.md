---
title: "System::String::IndexOf method"
linktitle: "IndexOf"
second_title: "C++용 Aspose.Page"
description: "System::String::IndexOf 메서드. C++에서 부분 문자열 내 문자 순방향 검색을 수행합니다."
type: docs
weight: 1500
url: /ko/cpp/system/string/indexof/
---
## String::IndexOf(char_t, int, int) const method


부분 문자열 내 문자 앞쪽 조회.

```cpp
int System::String::IndexOf(char_t c, int startIndex, int count) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| c | char_t | 찾을 문자. |
| startIndex | int | 검색을 시작할 인덱스. |
| count | int | 검색할 문자 수. |

### ReturnValue

startIndex 이후 첫 문자 위치 인덱스, 찾지 못하면 -1.

## 또 보기

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOf(char_t, int) const method


문자 앞쪽 조회.

```cpp
int System::String::IndexOf(char_t c, int startIndex=0) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| c | char_t | 찾을 문자. |
| startIndex | int | 검색을 시작할 인덱스. |

### ReturnValue

startIndex 이후 첫 문자 위치 인덱스, 찾지 못하면 -1.

## 또 보기

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOf(const String\&, int, int) const method


부분 문자열 앞쪽 조회.

```cpp
int System::String::IndexOf(const String &str, int startIndex, int count) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const String\& | 검색할 부분 문자열. |
| startIndex | int | 원본 문자열에서 검색을 시작할 위치. |
| count | int | 검색할 문자 수. |

### ReturnValue

찾은 첫 번째 부분 문자열의 인덱스 또는 찾지 못하면 -1을 반환합니다. 검색 문자열이 비어 있으면 항상 startIndex를 반환합니다.

## 또 보기

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOf(const String\&, int, System::StringComparison) const method


부분 문자열 앞쪽 조회.

```cpp
int System::String::IndexOf(const String &str, int startIndex, System::StringComparison comparison_type) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const String\& | 검색할 부분 문자열. |
| startIndex | int | 원본 문자열에서 검색을 시작할 위치. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) 모드. |

### ReturnValue

찾은 첫 번째 부분 문자열의 인덱스 또는 찾지 못하면 -1을 반환합니다. 검색 문자열이 비어 있으면 항상 startIndex를 반환합니다.

## 또 보기

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOf(const String\&, int) const method


부분 문자열 앞쪽 조회.

```cpp
int System::String::IndexOf(const String &str, int startIndex=0) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const String\& | 검색할 부분 문자열. |
| startIndex | int | 원본 문자열에서 검색을 시작할 위치. |

### ReturnValue

찾은 첫 번째 부분 문자열의 인덱스 또는 찾지 못하면 -1을 반환합니다. 검색 문자열이 비어 있으면 항상 startIndex를 반환합니다.

## 또 보기

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOf(const String\&, System::StringComparison) const method


부분 문자열 앞쪽 조회.

```cpp
int System::String::IndexOf(const String &str, System::StringComparison comparison_type) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const String\& | 검색할 부분 문자열. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) 모드. |

### ReturnValue

찾은 첫 번째 부분 문자열의 인덱스 또는 찾지 못하면 -1을 반환합니다. 검색 문자열이 비어 있으면 항상 0을 반환합니다.

## 또 보기

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOf(const String\&, int, int, System::StringComparison) const method


부분 문자열 앞쪽 조회.

```cpp
int System::String::IndexOf(const String &value, int startIndex, int count, System::StringComparison comparisonType) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const String\& | 검색할 부분 문자열. |
| startIndex | int | 원본 문자열에서 검색을 시작할 위치. |
| count | int | 검색할 문자 수. |
| comparisonType | System::StringComparison | [Comparison](../../comparison/) 모드. |

### ReturnValue

찾은 첫 번째 부분 문자열의 인덱스 또는 찾지 못하면 -1을 반환합니다. 검색 문자열이 비어 있으면 항상 startIndex를 반환합니다.

## 또 보기

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
