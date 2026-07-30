---
title: "طريقة System::Text::StringBuilder::Insert"
linktitle: "إدراج"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Text::StringBuilder::Insert. يُدرج الأحرف في الموضع الثابت للـ StringBuilder في C++."
type: docs
weight: 1200
url: /ar/cpp/system.text/stringbuilder/insert/
---
## StringBuilder::Insert(int, const System::ArrayPtr\<char_t\>\&, int, int) method


يدرج أحرفًا في الموضع الثابت للمُنشئ.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int index, const System::ArrayPtr<char_t> &chars, int startIndex, int charCount)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الفهرس | int | الموضع لإدراج الأحرف فيه. |
| chars | const System::ArrayPtr\<char_t\>\& | [Array](../../../system/array/) لإدراج شريحة منها. |
| startIndex | int | [Array](../../../system/array/) فهرس بداية الشريحة. |
| charCount | int | [Array](../../../system/array/) طول الشريحة. |

### ReturnValue

هذا المؤشر.

## انظر أيضًا

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Insert(int, char_t) method


يدرج حرفًا في الموضع الثابت للمُنشئ.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int startIndex, char_t ch)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| startIndex | int | الموضع لإدراج الأحرف فيه. |
| ch | char_t | حرف للإدراج. |

### ReturnValue

هذا المؤشر.

## انظر أيضًا

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Insert(int, const String\&) method


يدرج سلسلة في الموضع الثابت للمُنشئ.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int startIndex, const String &str)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| startIndex | int | الموضع لإدراج الأحرف فيه. |
| str | const String\& | [String](../../../system/string/) للإدراج. |

### ReturnValue

هذا المؤشر.

## انظر أيضًا

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Insert(int, T) method


يدرج قيمة في الموضع الثابت للمُنشئ.

```cpp
template<typename T> std::enable_if<std::is_arithmetic<T>::value, StringBuilder *>::type System::Text::StringBuilder::Insert(int startIndex, T value)
```


| معامل | الوصف |
| --- | --- |
| معامل | النوع. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| startIndex | int | الموضع لإدراج الأحرف فيه. |
| قيمة | T | القيمة لتنسيقها وإدراجها. |

### ReturnValue

هذا المؤشر.

## انظر أيضًا

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Insert(int32_t, const String\&, int32_t) method


يدرج سلسلة مكررة في الموضع الثابت للمُنشئ.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int32_t index, const String &value, int32_t count)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الفهرس | int32_t | الموضع لإدراج الأحرف فيه. |
| value | const String\& | [String](../../../system/string/) للإدراج. |
| count | int32_t | كم مرة لتكرار سلسلة **value**. |

### ReturnValue

هذا المؤشر.

## انظر أيضًا

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
