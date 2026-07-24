---
title: "System::String::LastIndexOf 方法"
linktitle: "LastIndexOf"
second_title: "Aspose.Page 适用于 C++"
description: "System::String::LastIndexOf 方法。C++ 中的字符向后查找。"
type: docs
weight: 2400
url: /zh/cpp/system/string/lastindexof/
---
## String::LastIndexOf(char_t) const method


字符后向查找。

```cpp
int System::String::LastIndexOf(char_t value) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | char_t | 要查找的字符。 |

### ReturnValue

最后字符位置的索引，若未找到则为 -1。

## 另见

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(char_t, int32_t) const method


字符后向查找。

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | char_t | 要查找的字符。 |
| startIndex | int32_t | 开始查找的索引。 |

### ReturnValue

自 startIndex 起的最后字符位置的索引，若未找到则为 -1。

## 另见

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(char_t, int32_t, int32_t) const method


字符后向查找。

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex, int32_t count) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | char_t | 要查找的字符。 |
| startIndex | int32_t | 开始查找的索引。 |
| count | int32_t | 要遍历的字符数 |

### ReturnValue

自 startIndex 起的最后字符位置的索引，若未找到则为 -1。

## 另见

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int, System::StringComparison) const method


子串后向查找。

```cpp
int System::String::LastIndexOf(const String &str, int startIndex, System::StringComparison comparison_type) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| str | const String\& | 要查找的子字符串。 |
| startIndex | int | 在源字符串中开始查找的位置。 |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) 模式。 |

### ReturnValue

最后找到的子字符串的索引，若未找到则为 -1。对于空的查找字符串，总是返回字符串长度。

## 另见

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int) const method


子串后向查找。

```cpp
int System::String::LastIndexOf(const String &str, int startIndex=INT32_MAX) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| str | const String\& | 要查找的子字符串。 |
| startIndex | int | 在源字符串中开始查找的位置。 |

### ReturnValue

最后找到的子字符串的索引，若未找到则为 -1。对于空的查找字符串，总是返回字符串长度。

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, System::StringComparison) const method


子串后向查找。

```cpp
int System::String::LastIndexOf(const String &str, System::StringComparison comparison_type) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| str | const String\& | 要查找的子字符串。 |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) 模式。 |

### ReturnValue

最后找到的子字符串的索引，若未找到则为 -1。对于空的查找字符串，总是返回字符串长度。

## 另见

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int, int, StringComparison) const method


子串后向查找。

```cpp
int System::String::LastIndexOf(const String &value, int startIndex, int count, StringComparison comparisonType) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| value | const String\& | 要查找的子字符串。 |
| startIndex | int | 在源字符串中开始查找的位置。 |
| count | int | 要遍历的字符数。 |
| comparisonType | StringComparison | [Comparison](../../comparison/) 模式。 |

### ReturnValue

最后找到的子字符串的索引，若未找到则为 -1。对于空的查找字符串，总是返回 startIndex+count。

## 另见

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
