---
title: "System::String::IndexOfAny 方法"
linktitle: "IndexOfAny"
second_title: "Aspose.Font 适用于 C++"
description: "System::String::IndexOfAny 方法。字符在 C++ 中的前向查找。"
type: docs
weight: 1600
url: /zh/cpp/system/string/indexofany/
---
## String::IndexOfAny(char_t, int) const method


字符向前查找。

```cpp
int System::String::IndexOfAny(char_t c, int startIndex=0) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| c | char_t | 要查找的字符。 |
| startIndex | int | 开始查找的索引。 |

### ReturnValue

自 startIndex 起的第一个字符位置索引，如果未找到则为 -1。

## 另见

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&) const method


在整个字符串中查找传入的任意字符。将字符串的第一个字符与 anyOf 中的所有字符比较，然后比较第二个字符，依此类推。返回第一个匹配任意目标字符的索引。

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) 要查找的字符数组。顺序不影响。 |

### ReturnValue

第一个匹配字符的索引，如果未找到则为 -1。

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


在子串中查找传入的任意字符。将字符串的第一个字符与 anyOf 中的所有字符比较，然后比较第二个字符，依此类推。返回第一个匹配任意目标字符的索引。

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) 要查找的字符数组。顺序不影响。 |
| startindex | int32_t | 用于开始查找的索引。 |

### ReturnValue

第一个匹配字符的索引，如果未找到则为 -1。

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


在子串中查找传入的任意字符。将字符串的第一个字符与 anyOf 中的所有字符比较，然后比较第二个字符，依此类推。返回第一个匹配任意目标字符的索引。

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) 要查找的字符数组。顺序不影响。 |
| startindex | int32_t | 用于开始查找的索引。 |
| count | int32_t | 要遍历的字符数。 |

### ReturnValue

第一个匹配字符的索引，如果未找到则为 -1。

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOfAny(const String\&, int) const method


因此在此字符串中查找 str 的所有字符。如果找到第一个字符，则返回其位置，否则继续查找第二个字符，以此类推。

```cpp
int System::String::IndexOfAny(const String &str, int startIndex=0) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | const String\& | [String](../) 要查找的字符。字符顺序很重要。 |
| startIndex | int | 开始查找的位置。 |

### ReturnValue

第一个找到的字符的索引，如果未找到则为 -1。

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
