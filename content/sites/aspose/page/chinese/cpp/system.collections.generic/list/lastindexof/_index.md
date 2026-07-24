---
title: "System::Collections::Generic::List::LastIndexOf 方法"
linktitle: "LastIndexOf"
second_title: "Aspose.Page 适用于 C++"
description: "System::Collections::Generic::List::LastIndexOf 方法。搜索指定对象并返回其在整个列表中最后一次出现的零基索引（在 C++ 中）。"
type: docs
weight: 3400
url: /zh/cpp/system.collections.generic/list/lastindexof/
---
## List::LastIndexOf(const T\&) const method


搜索指定对象并返回其在整个列表中最后一次出现的零基索引。

```cpp
int32_t System::Collections::Generic::List<T>::LastIndexOf(const T &item) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| item | const T\& | 要在列表中定位的对象 |

### ReturnValue

如果找到，则返回整个 [List](../) 中项最后一次出现的零基索引；否则为 -1。

## 另见

* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## List::LastIndexOf(const T\&, int32_t) const method


搜索指定对象并返回从第一个元素到指定索引范围内的元素中，该对象最后一次出现的零基索引。

```cpp
int32_t System::Collections::Generic::List<T>::LastIndexOf(const T &item, int32_t index) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| item | const T\& | 要在列表中定位的对象 |
| 索引 | int32_t | 向后搜索的零基起始索引。 |

### ReturnValue

如果找到，则返回从第一个元素到 index 范围内的 [List](../) 中项最后一次出现的零基索引；否则为 -1。

## 另见

* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## List::LastIndexOf(const T\&, int32_t, int32_t) const method


搜索指定对象并返回在包含指定数量元素且以指定索引结束的 [List](../) 范围内，该对象最后一次出现的零基索引。

```cpp
int32_t System::Collections::Generic::List<T>::LastIndexOf(const T &item, int32_t index, int32_t count) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| item | const T\& | 要在 [List](../) 中定位的对象 |
| 索引 | int32_t | 向后搜索的零基起始索引。 |
| count | int32_t | 要搜索的区段中的元素数量。 |

### ReturnValue

如果找到，则返回在包含 count 个元素且以 index 结束的 [List](../) 范围内项最后一次出现的零基索引；否则为 -1。

## 另见

* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
