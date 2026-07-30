---
title: "System::String::LastIndexOfAny 方法"
linktitle: "LastIndexOfAny"
second_title: "Aspose.Font 适用于 C++"
description: "System::String::LastIndexOfAny 方法。向后遍历整个字符串，查找任意传入的字符。将字符串的最后一个字符与 anyOf 中的所有字符比较，然后比较前一个字符，依此类推。返回在 C++ 中找到的第一个匹配的索引。"
type: docs
weight: 2500
url: /zh/cpp/system/string/lastindexofany/
---
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&) const method


在整个字符串中向后查找传入的任意字符。将字符串的最后一个字符与 anyOf 中的所有字符比较，然后比较前一个字符，依此类推。返回找到的第一个匹配的索引。

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) 要查找的字符数组。顺序不影响。 |

### ReturnValue

最后匹配字符的索引，如果未找到则为 -1。

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


在子串中向后查找传入的任意字符。将字符串的最后一个字符与 anyOf 中的所有字符比较，然后比较前一个字符，依此类推。返回找到的第一个匹配的索引。

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) 要查找的字符数组。顺序不影响。 |
| startindex | int32_t | 用于开始查找的索引。 |

### ReturnValue

最后匹配字符的索引，如果未找到则为 -1。

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


在子串中向后查找传入的任意字符。将字符串的最后一个字符与 anyOf 中的所有字符比较，然后比较前一个字符，依此类推。返回找到的第一个匹配的索引。

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) 要查找的字符数组。顺序不影响。 |
| startindex | int32_t | 用于开始查找的索引。 |
| count | int32_t | 要遍历的字符数。 |

### ReturnValue

最后匹配字符的索引，如果未找到则为 -1。

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
