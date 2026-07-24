---
title: "System::String::LastIndexOfAny method"
linktitle: "LastIndexOfAny"
second_title: "C++용 Aspose.Page"
description: "System::String::LastIndexOfAny 메서드. 전달된 문자 중 어느 것이든 문자열 전체를 뒤에서부터 검색합니다. 마지막 문자열 문자를 anyOf의 모든 문자와 비교하고, 이전 문자와 계속 비교합니다. C++에서 첫 번째 일치 항목의 인덱스를 반환합니다."
type: docs
weight: 2500
url: /ko/cpp/system/string/lastindexofany/
---
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&) const method


전체 문자열을 뒤에서부터 전달된 문자 중 하나를 찾습니다. 마지막 문자열 문자를 anyOf의 모든 문자와 비교하고, 이전 문자와 계속 비교합니다. 찾은 첫 번째 일치 항목의 인덱스를 반환합니다.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) 찾을 문자 배열. 순서는 중요하지 않습니다. |

### ReturnValue

마지막으로 일치하는 문자의 인덱스, 찾지 못하면 -1.

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


부분 문자열을 뒤에서부터 전달된 문자 중 하나를 찾습니다. 마지막 문자열 문자를 anyOf의 모든 문자와 비교하고, 이전 문자와 계속 비교합니다. 찾은 첫 번째 일치 항목의 인덱스를 반환합니다.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) 찾을 문자 배열. 순서는 중요하지 않습니다. |
| startindex | int32_t | 검색을 시작할 인덱스. |

### ReturnValue

마지막으로 일치하는 문자의 인덱스, 찾지 못하면 -1.

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


부분 문자열을 뒤에서부터 전달된 문자 중 하나를 찾습니다. 마지막 문자열 문자를 anyOf의 모든 문자와 비교하고, 이전 문자와 계속 비교합니다. 찾은 첫 번째 일치 항목의 인덱스를 반환합니다.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) 찾을 문자 배열. 순서는 중요하지 않습니다. |
| startindex | int32_t | 검색을 시작할 인덱스. |
| count | int32_t | 검색할 문자 수. |

### ReturnValue

마지막으로 일치하는 문자의 인덱스, 찾지 못하면 -1.

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
