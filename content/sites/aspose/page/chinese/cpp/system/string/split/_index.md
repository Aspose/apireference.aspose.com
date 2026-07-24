---
title: "System::String::Split 方法"
linktitle: "拆分"
second_title: "Aspose.Page 适用于 C++"
description: "System::String::Split 方法。按字符在 C++ 中拆分字符串。"
type: docs
weight: 4300
url: /zh/cpp/system/string/split/
---
## String::Split(char_t, int32_t, StringSplitOptions) const method


按字符拆分字符串。

```cpp
ArrayPtr<String> System::String::Split(char_t separator, int32_t count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 分隔符 | char_t | 用于拆分字符串的字符。 |
| count | int32_t | 返回的子字符串的最大数量。 |
| opt | StringSplitOptions | 拆分选项。 |

### ReturnValue

[Array](../../array/) of substrings.

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(char_t, StringSplitOptions) const method


按字符拆分字符串。

```cpp
ArrayPtr<String> System::String::Split(char_t separator=u' ', StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 分隔符 | char_t | 用于拆分字符串的字符。 |
| opt | StringSplitOptions | 拆分选项。 |

### ReturnValue

[Array](../../array/) of substrings.

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(char_t, char_t, StringSplitOptions) const method


按两种字符之一拆分字符串。

```cpp
ArrayPtr<String> System::String::Split(char_t separatorA, char_t separatorB, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| separatorA | char_t | 用于拆分字符串的第一个字符。 |
| separatorB | char_t | 用于拆分字符串的第二个字符。 |
| opt | StringSplitOptions | 拆分选项。 |

### ReturnValue

[Array](../../array/) of substrings.

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<char_t\>\&, int32_t, StringSplitOptions) const method


按指定的其中一个字符拆分字符串。

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<char_t> &separators, int32_t count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| separators | const ArrayPtr\<char_t\>\& | [Array](../../array/) 分隔字符。如果为空，则任何空白字符都视为分隔符。 |
| count | int32_t | 返回的子字符串的最大数量。 |
| opt | StringSplitOptions | 拆分选项。 |

### ReturnValue

[Array](../../array/) of substrings.

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<char_t\>\&, StringSplitOptions) const method


按指定的其中一个字符拆分字符串。

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<char_t> &separators, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| separators | const ArrayPtr\<char_t\>\& | [Array](../../array/) 分隔字符。如果为空，则任何空白字符都视为分隔符。 |
| opt | StringSplitOptions | 拆分选项。 |

### ReturnValue

[Array](../../array/) of substrings.

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<String\>\&, int, StringSplitOptions) const method


按子字符串拆分字符串。目前，仅支持零或一个元素的分隔符数组。

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<String> &separators, int count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| separators | const ArrayPtr\<String\>\& | [Array](../../array/) 分隔字符串。如果为空，则不进行拆分。 |
| count | int | 拆分数组中的最大元素数量。 |
| opt | StringSplitOptions | 拆分选项。 |

### ReturnValue

[Array](../../array/) of substrings.

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<String\>\&, StringSplitOptions) const method


按子字符串拆分字符串。

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<String> &separators, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| separators | const ArrayPtr\<String\>\& | [Array](../../array/) 分隔字符串。如果为空，则不进行拆分。 |
| opt | StringSplitOptions | 拆分选项。 |

### ReturnValue

[Array](../../array/) of substrings.

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const String\&, int, StringSplitOptions) const method


按子字符串拆分字符串。

```cpp
ArrayPtr<String> System::String::Split(const String &separator, int count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 分隔符 | const String\& | 用作分隔符的子字符串。如果为空，空白字符将作为分隔符。 |
| count | int | 拆分数组中的最大元素数量。 |
| opt | StringSplitOptions | 拆分选项。 |

### ReturnValue

[Array](../../array/) of substrings.

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const String\&, StringSplitOptions) const method


按子字符串拆分字符串。

```cpp
ArrayPtr<String> System::String::Split(const String &separator, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 分隔符 | const String\& | 用作分隔符的子字符串。如果为空，空白字符将作为分隔符。 |
| opt | StringSplitOptions | 拆分选项。 |

### ReturnValue

[Array](../../array/) of substrings.

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
