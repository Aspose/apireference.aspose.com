---
title: "System::String::Join 메서드"
linktitle: "Join"
second_title: "C++용 Aspose.Page"
description: "System::String::Join 메서드. C++에서 문자열을 구분자로 사용하여 배열을 결합합니다."
type: docs
weight: 7300
url: /ko/cpp/system/string/join/
---
## String::Join(const String\&, const ArrayPtr\<SharedPtr\<Object\>\>\&) method


문자열을 구분자로 사용하여 배열을 결합합니다.

```cpp
static String System::String::Join(const String &separator, const ArrayPtr<SharedPtr<Object>> &parts)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| separator | const String\& | [String](../)을 배열 요소 사이에 넣어 결합할 때 사용합니다. |
| parts | const ArrayPtr\<SharedPtr\<Object\>\>\& | [Array](../../array/)을(를) 결합할 부분들의 배열. |

### ReturnValue

[String](../) representing joint elements.

## 또 보기

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Join(const String\&, const ArrayPtr\<String\>\&, int, int) method


문자열을 구분자로 사용하여 배열을 결합합니다.

```cpp
static String System::String::Join(const String &separator, const ArrayPtr<String> &parts, int startIndex=0, int count=-1)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| separator | const String\& | [String](../)을 배열 요소 사이에 넣어 결합할 때 사용합니다. |
| parts | const ArrayPtr\<String\>\& | [Array](../../array/)을(를) 결합할 부분들의 배열. |
| startIndex | int | 결합을 시작할 배열의 첫 번째 인덱스. |
| count | int | 결합할 배열 요소의 개수. -1은 '배열 끝까지'를 의미합니다. |

### ReturnValue

[String](../) representing joint array elements.

## 또 보기

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Join(const String\&, const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\&) method


문자열을 구분자로 사용하여 배열을 결합합니다.

```cpp
static String System::String::Join(const String &separator, const SharedPtr<System::Collections::Generic::IEnumerable<String>> &parts)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| separator | const String\& | [String](../)을 배열 요소 사이에 넣어 결합할 때 사용합니다. |
| parts | const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\& | - parts 열거 가능한 객체 |

### ReturnValue

[String](../) representing joint elements.

## 또 보기

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Join(const String\&, const System::Details::ArrayView\<String\>\&, int, int) method


문자열을 구분자로 사용하여 배열을 결합합니다.

```cpp
static String System::String::Join(const String &separator, const System::Details::ArrayView<String> &parts, int startIndex=0, int count=-1)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| separator | const String\& | [String](../)을 배열 요소 사이에 넣어 결합할 때 사용합니다. |
| parts | const System::Details::ArrayView\<String\>\& | parts를 결합하기 위한 ArrayView. |
| startIndex | int | 결합을 시작할 배열의 첫 번째 인덱스. |
| count | int | 결합할 배열 요소의 개수. -1은 '배열 끝까지'를 의미합니다. |

### ReturnValue

[String](../) representing joint array elements.

## 또 보기

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
