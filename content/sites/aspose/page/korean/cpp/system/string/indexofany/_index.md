---
title: "System::String::IndexOfAny 메서드"
linktitle: "IndexOfAny"
second_title: "C++용 Aspose.Page"
description: "System::String::IndexOfAny 메서드. C++에서 문자 순방향 검색."
type: docs
weight: 1600
url: /ko/cpp/system/string/indexofany/
---
## String::IndexOfAny(char_t, int) const method


문자 앞쪽 조회.

```cpp
int System::String::IndexOfAny(char_t c, int startIndex=0) const
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
## String::IndexOfAny(const ArrayPtr\<char_t\>\&) const method


전체 문자열을 통해 전달된 문자 중 하나를 찾습니다. 첫 번째 문자열 문자를 anyOf의 모든 문자와 비교하고, 두 번째 문자와 계속 비교합니다. 대상 문자 중 하나와 일치하는 첫 번째 문자의 인덱스를 반환합니다.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) 찾을 문자 배열. 순서는 중요하지 않습니다. |

### ReturnValue

첫 일치 문자 인덱스, 찾지 못하면 -1.

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


부분 문자열을 통해 전달된 문자 중 하나를 찾습니다. 첫 번째 문자열 문자를 anyOf의 모든 문자와 비교하고, 두 번째 문자와 계속 비교합니다. 대상 문자 중 하나와 일치하는 첫 번째 문자의 인덱스를 반환합니다.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) 찾을 문자 배열. 순서는 중요하지 않습니다. |
| startindex | int32_t | 검색을 시작할 인덱스. |

### ReturnValue

첫 일치 문자 인덱스, 찾지 못하면 -1.

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


부분 문자열을 통해 전달된 문자 중 하나를 찾습니다. 첫 번째 문자열 문자를 anyOf의 모든 문자와 비교하고, 두 번째 문자와 계속 비교합니다. 대상 문자 중 하나와 일치하는 첫 번째 문자의 인덱스를 반환합니다.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) 찾을 문자 배열. 순서는 중요하지 않습니다. |
| startindex | int32_t | 검색을 시작할 인덱스. |
| count | int32_t | 검색할 문자 수. |

### ReturnValue

첫 일치 문자 인덱스, 찾지 못하면 -1.

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const String\&, int) const method


따라서 이 문자열에서 str의 모든 문자를 찾습니다. 첫 번째 문자를 찾으면 해당 위치를 반환하고, 그렇지 않으면 두 번째 문자를 찾아 계속 진행합니다.

```cpp
int System::String::IndexOfAny(const String &str, int startIndex=0) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const String\& | [String](../) 찾을 문자들의 문자열. 문자 순서가 중요합니다. |
| startIndex | int | 조회 시작 위치. |

### ReturnValue

첫 번째 발견된 문자의 인덱스, 없으면 -1.

## 또 보기

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
