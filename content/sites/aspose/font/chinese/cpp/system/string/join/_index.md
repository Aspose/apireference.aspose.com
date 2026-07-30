---
title: "System::String::Join 方法"
linktitle: "Join"
second_title: "Aspose.Font 适用于 C++"
description: "System::String::Join 方法。使用字符串作为分隔符在 C++ 中连接数组。"
type: docs
weight: 7300
url: /zh/cpp/system/string/join/
---
## String::Join(const String\&, const ArrayPtr\<SharedPtr\<Object\>\>\&) method


使用字符串作为分隔符连接数组。

```cpp
static String System::String::Join(const String &separator, const ArrayPtr<SharedPtr<Object>> &parts)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| separator | const String\& | [String](../) 用于在连接时放置在数组元素之间。 |
| parts | const ArrayPtr\<SharedPtr\<Object\>\>\& | [Array](../../array/) 要连接的部分数组。 |

### ReturnValue

[String](../) representing joint elements.

## 另见

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Join(const String\&, const ArrayPtr\<String\>\&, int, int) method


使用字符串作为分隔符连接数组。

```cpp
static String System::String::Join(const String &separator, const ArrayPtr<String> &parts, int startIndex=0, int count=-1)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| separator | const String\& | [String](../) 用于在连接时放置在数组元素之间。 |
| parts | const ArrayPtr\<String\>\& | [Array](../../array/) 要连接的部分数组。 |
| startIndex | int | 数组中开始连接的起始索引。 |
| count | int | 要连接的数组元素数量。-1 表示“直到数组结束”。 |

### ReturnValue

[String](../) representing joint array elements.

## 另见

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Join(const String\&, const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\&) method


使用字符串作为分隔符连接数组。

```cpp
static String System::String::Join(const String &separator, const SharedPtr<System::Collections::Generic::IEnumerable<String>> &parts)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| separator | const String\& | [String](../) 用于在连接时放置在数组元素之间。 |
| 部分 | const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\& | - 部分 可枚举对象 |

### ReturnValue

[String](../) representing joint elements.

## 另见

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Join(const String\&, const System::Details::ArrayView\<String\>\&, int, int) method


使用字符串作为分隔符连接数组。

```cpp
static String System::String::Join(const String &separator, const System::Details::ArrayView<String> &parts, int startIndex=0, int count=-1)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| separator | const String\& | [String](../) 用于在连接时放置在数组元素之间。 |
| 部分 | const System::Details::ArrayView\<String\>\& | 要连接的部分的 ArrayView。 |
| startIndex | int | 数组中开始连接的起始索引。 |
| count | int | 要连接的数组元素数量。-1 表示“直到数组结束”。 |

### ReturnValue

[String](../) representing joint array elements.

## 另见

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
