---
title: "System::String::Split 메서드"
linktitle: "Split"
second_title: "C++용 Aspose.Page"
description: "System::String::Split 메서드. C++에서 문자를 기준으로 문자열을 분할합니다."
type: docs
weight: 4300
url: /ko/cpp/system/string/split/
---
## String::Split(char_t, int32_t, StringSplitOptions) const method


문자를 기준으로 문자열을 분할합니다.

```cpp
ArrayPtr<String> System::String::Split(char_t separator, int32_t count, StringSplitOptions opt=StringSplitOptions::None) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 구분자 | char_t | 문자열을 분할할 문자. |
| count | int32_t | 반환할 최대 부분 문자열 수. |
| opt | StringSplitOptions | 분할 옵션. |

### ReturnValue

[Array](../../array/) of substrings.

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(char_t, StringSplitOptions) const method


문자를 기준으로 문자열을 분할합니다.

```cpp
ArrayPtr<String> System::String::Split(char_t separator=u' ', StringSplitOptions opt=StringSplitOptions::None) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 구분자 | char_t | 문자열을 분할할 문자. |
| opt | StringSplitOptions | 분할 옵션. |

### ReturnValue

[Array](../../array/) of substrings.

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(char_t, char_t, StringSplitOptions) const method


두 문자 중 하나를 기준으로 문자열을 분할합니다.

```cpp
ArrayPtr<String> System::String::Split(char_t separatorA, char_t separatorB, StringSplitOptions opt=StringSplitOptions::None) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| separatorA | char_t | 문자열을 분할할 첫 번째 문자. |
| separatorB | char_t | 문자열을 분할할 두 번째 문자. |
| opt | StringSplitOptions | 분할 옵션. |

### ReturnValue

[Array](../../array/) of substrings.

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<char_t\>\&, int32_t, StringSplitOptions) const method


지정된 문자 중 하나로 문자열을 분할합니다.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<char_t> &separators, int32_t count, StringSplitOptions opt=StringSplitOptions::None) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| separators | const ArrayPtr\<char_t\>\& | [Array](../../array/) 구분 문자 배열. 비어 있으면 모든 공백 문자가 구분자로 간주됩니다. |
| count | int32_t | 반환할 최대 부분 문자열 수. |
| opt | StringSplitOptions | 분할 옵션. |

### ReturnValue

[Array](../../array/) of substrings.

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<char_t\>\&, StringSplitOptions) const method


지정된 문자 중 하나로 문자열을 분할합니다.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<char_t> &separators, StringSplitOptions opt=StringSplitOptions::None) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| separators | const ArrayPtr\<char_t\>\& | [Array](../../array/) 구분 문자 배열. 비어 있으면 모든 공백 문자가 구분자로 간주됩니다. |
| opt | StringSplitOptions | 분할 옵션. |

### ReturnValue

[Array](../../array/) of substrings.

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<String\>\&, int, StringSplitOptions) const method


문자열을 하위 문자열로 분할합니다. 현재는 0개 또는 1개의 요소를 가진 구분자 배열만 지원합니다.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<String> &separators, int count, StringSplitOptions opt=StringSplitOptions::None) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| separators | const ArrayPtr\<String\>\& | [Array](../../array/) 구분 문자열 배열. 비어 있으면 분할이 수행되지 않습니다. |
| count | int | 분할 배열의 최대 요소 수. |
| opt | StringSplitOptions | 분할 옵션. |

### ReturnValue

[Array](../../array/) of substrings.

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<String\>\&, StringSplitOptions) const method


문자열을 하위 문자열로 분할합니다.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<String> &separators, StringSplitOptions opt=StringSplitOptions::None) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| separators | const ArrayPtr\<String\>\& | [Array](../../array/) 구분 문자열 배열. 비어 있으면 분할이 수행되지 않습니다. |
| opt | StringSplitOptions | 분할 옵션. |

### ReturnValue

[Array](../../array/) of substrings.

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const String\&, int, StringSplitOptions) const method


문자열을 하위 문자열로 분할합니다.

```cpp
ArrayPtr<String> System::String::Split(const String &separator, int count, StringSplitOptions opt=StringSplitOptions::None) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 구분자 | const String\& | 구분자로 작용하는 부분 문자열. 비어 있으면 공백 문자가 구분자로 작용합니다. |
| count | int | 분할 배열의 최대 요소 수. |
| opt | StringSplitOptions | 분할 옵션. |

### ReturnValue

[Array](../../array/) of substrings.

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const String\&, StringSplitOptions) const method


문자열을 하위 문자열로 분할합니다.

```cpp
ArrayPtr<String> System::String::Split(const String &separator, StringSplitOptions opt=StringSplitOptions::None) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 구분자 | const String\& | 구분자로 작용하는 부분 문자열. 비어 있으면 공백 문자가 구분자로 작용합니다. |
| opt | StringSplitOptions | 분할 옵션. |

### ReturnValue

[Array](../../array/) of substrings.

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
