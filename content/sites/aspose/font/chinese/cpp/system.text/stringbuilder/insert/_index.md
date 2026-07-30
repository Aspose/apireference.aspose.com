---
title: "System::Text::StringBuilder::Insert 方法"
linktitle: "插入"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::StringBuilder::Insert 方法。将在 C++ 中将字符插入到 builder 的固定位置。"
type: docs
weight: 1200
url: /zh/cpp/system.text/stringbuilder/insert/
---
## StringBuilder::Insert(int, const System::ArrayPtr\<char_t\>\&, int, int) method


在构建器的固定位置插入字符序列。

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int index, const System::ArrayPtr<char_t> &chars, int startIndex, int charCount)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 索引 | int | 要插入字符的位置。 |
| chars | const System::ArrayPtr\<char_t\>\& | [Array](../../../system/array/) 要插入切片的来源。 |
| startIndex | int | [Array](../../../system/array/) 切片起始索引。 |
| charCount | int | [Array](../../../system/array/) 切片长度。 |

### ReturnValue

此指针。

## 另见

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Insert(int, char_t) method


在构建器的固定位置插入字符。

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int startIndex, char_t ch)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| startIndex | int | 要插入字符的位置。 |
| ch | char_t | 要插入的字符。 |

### ReturnValue

此指针。

## 另见

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Insert(int, const String\&) method


在构建器的固定位置插入字符串。

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int startIndex, const String &str)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| startIndex | int | 要插入字符的位置。 |
| str | const String\& | 要插入的[String](../../../system/string/)。 |

### ReturnValue

此指针。

## 另见

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Insert(int, T) method


在构建器的固定位置插入值。

```cpp
template<typename T> std::enable_if<std::is_arithmetic<T>::value, StringBuilder *>::type System::Text::StringBuilder::Insert(int startIndex, T value)
```


| 参数 | 描述 |
| --- | --- |
| 参数 | 类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| startIndex | int | 要插入字符的位置。 |
| 值 | T | 要格式化并插入的值。 |

### ReturnValue

此指针。

## 另见

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Insert(int32_t, const String\&, int32_t) method


在构建器的固定位置插入重复字符串。

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int32_t index, const String &value, int32_t count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 索引 | int32_t | 要插入字符的位置。 |
| value | const String\& | 要插入的[String](../../../system/string/)。 |
| count | int32_t | 要重复 **value** 字符串的次数。 |

### ReturnValue

此指针。

## 另见

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
