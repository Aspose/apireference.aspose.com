---
title: "System::Array::IndexOf 方法"
linktitle: "IndexOf"
second_title: "Aspose.Font 适用于 C++"
description: "System::Array::IndexOf 方法。确定指定项在数组中首次出现的索引（在 C++ 中）。"
type: docs
weight: 2900
url: /zh/cpp/system/array/indexof/
---
## Array::IndexOf(const T\&) const method


确定数组中指定项首次出现的索引。

```cpp
virtual int System::Array<T>::IndexOf(const T &item) const override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 项 | const T\& | 要确定的项索引 |

### ReturnValue

如果找到该项，则返回指定项首次出现的索引；否则返回 -1

## 另见

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&) method


确定数组中指定项首次出现的索引。

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value)
```


| 参数 | 描述 |
| --- | --- |
| ArrayType | 目标数组中元素的类型 |
| ValueType | 要在数组中搜索的项的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | [Array](../) 用于搜索指定的项 |
| 值 | const ValueType\& | 要确定的项索引 |

### ReturnValue

如果找到该项，则返回指定项首次出现的索引；否则返回 -1

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) method


确定数组中指定项首次出现的索引，搜索起始于指定的索引。

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex)
```


| 参数 | 描述 |
| --- | --- |
| ArrayType | 目标数组中元素的类型 |
| ValueType | 要在数组中搜索的项的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | [Array](../) 用于搜索指定的项 |
| 值 | const ValueType\& | 要确定的项索引 |
| startIndex | int | 搜索开始的索引 |

### ReturnValue

如果找到该项，则返回指定项首次出现的索引；否则返回 -1

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) method


确定在由起始索引和范围内元素数量指定的数组项范围中，指定项首次出现的索引。

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex, int count)
```


| 参数 | 描述 |
| --- | --- |
| ArrayType | 目标数组中元素的类型 |
| ValueType | 要在数组中搜索的项的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | [Array](../) 用于搜索指定的项 |
| 值 | const ValueType\& | 要确定的项索引 |
| startIndex | int | 搜索开始的索引 |
| count | int | 要搜索的范围内的元素数量 |

### ReturnValue

如果找到该项，则返回指定项首次出现的索引；否则返回 -1

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
