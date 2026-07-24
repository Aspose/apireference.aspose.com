---
title: "System::Array::LastIndexOf 方法"
linktitle: "LastIndexOf"
second_title: "Aspose.Page 适用于 C++"
description: "System::Array::LastIndexOf 方法。确定在 C++ 中由起始索引和范围内元素数量指定的数组区间中，指定项最后一次出现的索引。"
type: docs
weight: 5500
url: /zh/cpp/system/array/lastindexof/
---
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) method


确定由起始索引和范围内元素数量指定的数组范围中指定项最后一次出现的索引。

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex, int count)
```


| Parameter | 描述 |
| --- | --- |
| ArrayType | 目标数组中元素的类型 |
| ValueType | 数组中要搜索的项的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | [Array](../) 用于在其中搜索指定的项 |
| value | const ValueType\& | 要确定的项索引 |
| startIndex | int | 搜索开始的索引 |
| count | int | 要搜索的范围内的元素数量 |

### ReturnValue

如果找到指定项，则返回其最后一次出现的索引；否则返回 -1

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&) method


确定数组中指定项最后一次出现的索引。

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &items, const ValueType &value)
```


| Parameter | 描述 |
| --- | --- |
| ArrayType | 目标数组中元素的类型 |
| ValueType | 数组中要搜索的项的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| items | const ArrayPtr\<ArrayType\>\& | [Array](../) 用于在其中搜索指定的项 |
| value | const ValueType\& | 要确定的项索引 |

### ReturnValue

如果找到指定项，则返回其最后一次出现的索引；否则返回 -1

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::LastIndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) method


确定从指定索引开始的数组中指定项最后一次出现的索引。

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::LastIndexOf(const ArrayPtr<ArrayType> &items, const ValueType &value, int startIndex)
```


| Parameter | 描述 |
| --- | --- |
| ArrayType | 目标数组中元素的类型 |
| ValueType | 数组中要搜索的项的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| items | const ArrayPtr\<ArrayType\>\& | [Array](../) 用于在其中搜索指定的项 |
| value | const ValueType\& | 要确定的项索引 |
| startIndex | int | 搜索开始的索引 |

### ReturnValue

如果找到指定项，则返回其最后一次出现的索引；否则返回 -1

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
