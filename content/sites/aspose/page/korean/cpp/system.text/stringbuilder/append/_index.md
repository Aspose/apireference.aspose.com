---
title: "System::Text::StringBuilder::Append 메서드"
linktitle: "추가"
second_title: "C++용 Aspose.Page"
description: "System::Text::StringBuilder::Append 메서드. C++에서 문자를 빌더에 추가합니다."
type: docs
weight: 300
url: /ko/cpp/system.text/stringbuilder/append/
---
## StringBuilder::Append(char_t) method


문자를 빌더에 추가합니다.

```cpp
StringBuilder * System::Text::StringBuilder::Append(char_t c)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| c | char_t | 문자 값. |

### ReturnValue

이 포인터.

## 또 보기

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(char_t, int) method


문자들을 빌더에 추가합니다.

```cpp
StringBuilder * System::Text::StringBuilder::Append(char_t c, int count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| c | char_t | 문자 값. |
| count | int | 삽입할 문자를 몇 번 반복할지. |

### ReturnValue

이 포인터.

## 또 보기

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const ArrayPtr\<char_t\>\&) method


문자 배열을 빌더에 추가합니다.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const ArrayPtr<char_t> &arr)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| arr | const ArrayPtr\<char_t\>\& | 추가할 문자들. |

### ReturnValue

이 포인터.

## 또 보기

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const ArrayPtr\<char_t\>\&, int, int) method


문자 배열 슬라이스를 빌더에 추가합니다.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const ArrayPtr<char_t> &arr, int startIndex, int charCount)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| arr | const ArrayPtr\<char_t\>\& | 추가할 문자들. |
| startIndex | int | 슬라이스 시작 인덱스. |
| charCount | int | 슬라이스 길이. |

### ReturnValue

이 포인터.

## 또 보기

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const SharedPtr\<StringBuilder\>\&) method


빌더의 내용을 빌더에 추가합니다.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const SharedPtr<StringBuilder> &builder)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 빌더 | const SharedPtr\<StringBuilder\>\& | 내용을 추가할 빌더. |

### ReturnValue

이 포인터.

## 또 보기

* Class [StringBuilder](../)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const SharedPtr\<T\>\&) method


객체의 문자열 표현을 빌더에 추가합니다.

```cpp
template<class T> StringBuilder * System::Text::StringBuilder::Append(const SharedPtr<T> &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | [Object](../../../system/object/) 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const SharedPtr\<T\>\& | [Object](../../../system/object/) 직렬화하고 추가할. |

### ReturnValue

이 포인터.

## 또 보기

* Class [StringBuilder](../)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const String\&) method


문자열을 빌더에 추가합니다.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const String &str)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const String\& | [String](../../../system/string/) 추가할 문자열. |

### ReturnValue

이 포인터.

## 또 보기

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const String\&, int, int) method


문자열 슬라이스를 빌더에 추가합니다.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const String &str, int startIndex, int charCount)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const String\& | [String](../../../system/string/) 추가할 문자열. |
| startIndex | int | 슬라이스 시작 인덱스. |
| charCount | int | 슬라이스 길이. |

### ReturnValue

이 포인터.

## 또 보기

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(double) method


부동 소수점 값을 빌더에 추가합니다.

```cpp
StringBuilder * System::Text::StringBuilder::Append(double df)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| df | double | 직렬화하고 추가할 값. |

### ReturnValue

이 포인터.

## 또 보기

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(E) method


빌더에 열거형 값 문자열 표현을 추가합니다.

```cpp
template<class E> std::enable_if<std::is_enum<E>::value, StringBuilder *>::type System::Text::StringBuilder::Append(E e)
```


| 매개변수 | 설명 |
| --- | --- |
| E | [Enum](../../../system/enum/) 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| e | E | 직렬화하고 추가할 값. |

### ReturnValue

이 포인터.

## 또 보기

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(float) method


부동 소수점 값을 빌더에 추가합니다.

```cpp
StringBuilder * System::Text::StringBuilder::Append(float f)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| f | float | 직렬화하고 추가할 값. |

### ReturnValue

이 포인터.

## 또 보기

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(int) method


정수 값을 빌더에 추가합니다.

```cpp
StringBuilder * System::Text::StringBuilder::Append(int i)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| i | int | 직렬화하고 추가할 값. |

### ReturnValue

이 포인터.

## 또 보기

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(T) method


산술 값을 빌더에 추가합니다.

```cpp
template<typename T> std::enable_if<std::is_arithmetic<T>::value, StringBuilder *>::type System::Text::StringBuilder::Append(T value)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 산술 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | T | 직렬화하고 추가할 값. |

### ReturnValue

이 포인터.

## 또 보기

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
