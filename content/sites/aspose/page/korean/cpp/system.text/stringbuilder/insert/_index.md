---
title: "System::Text::StringBuilder::Insert 메서드"
linktitle: "삽입"
second_title: "C++용 Aspose.Page"
description: "System::Text::StringBuilder::Insert 메서드. C++에서 빌더의 고정 위치에 문자를 삽입합니다."
type: docs
weight: 1200
url: /ko/cpp/system.text/stringbuilder/insert/
---
## StringBuilder::Insert(int, const System::ArrayPtr\<char_t\>\&, int, int) method


문자들을 빌더의 고정 위치에 삽입합니다.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int index, const System::ArrayPtr<char_t> &chars, int startIndex, int charCount)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| index | int | 문자를 삽입할 위치. |
| chars | const System::ArrayPtr\<char_t\>\& | [Array](../../../system/array/)에서 삽입할 슬라이스. |
| startIndex | int | [Array](../../../system/array/) 슬라이스 시작 인덱스. |
| charCount | int | [Array](../../../system/array/) 슬라이스 길이. |

### ReturnValue

이 포인터.

## 또 보기

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Insert(int, char_t) method


문자를 빌더의 고정 위치에 삽입합니다.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int startIndex, char_t ch)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| startIndex | int | 문자를 삽입할 위치. |
| ch | char_t | 삽입할 문자. |

### ReturnValue

이 포인터.

## 또 보기

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Insert(int, const String\&) method


문자열을 빌더의 고정 위치에 삽입합니다.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int startIndex, const String &str)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| startIndex | int | 문자를 삽입할 위치. |
| str | const String\& | [String](../../../system/string/) 삽입할. |

### ReturnValue

이 포인터.

## 또 보기

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Insert(int, T) method


값을 빌더의 고정 위치에 삽입합니다.

```cpp
template<typename T> std::enable_if<std::is_arithmetic<T>::value, StringBuilder *>::type System::Text::StringBuilder::Insert(int startIndex, T value)
```


| 매개변수 | 설명 |
| --- | --- |
| 매개변수 | 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| startIndex | int | 문자를 삽입할 위치. |
| value | T | 형식 지정하고 삽입할 값. |

### ReturnValue

이 포인터.

## 또 보기

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Insert(int32_t, const String\&, int32_t) method


반복 문자열을 빌더의 고정 위치에 삽입합니다.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int32_t index, const String &value, int32_t count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| index | int32_t | 문자를 삽입할 위치. |
| value | const String\& | [String](../../../system/string/) 삽입할. |
| count | int32_t | 몇 번 **value** 문자열을 반복할지. |

### ReturnValue

이 포인터.

## 또 보기

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
