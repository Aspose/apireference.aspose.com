---
title: "System::Array::ConstrainedCopy 方法"
linktitle: "ConstrainedCopy"
second_title: "Aspose.Page 适用于 C++"
description: "System::Array::ConstrainedCopy 方法。复制一系列元素，从 C++ 中指定的源起始的 System.Array。"
type: docs
weight: 4700
url: /zh/cpp/system/array/constrainedcopy/
---
## Array::ConstrainedCopy method


从 [System.Array](../) 复制一系列元素，起始于指定的源。

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::ConstrainedCopy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | 描述 |
| --- | --- |
| SrcType | 源数组中元素的类型 |
| DstType | 目标数组中元素的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | 源数组 |
| srcIndex | int64_t | 源数组中的索引，指定要复制的项目范围的起始位置 |
| dstArray | const ArrayPtr\<DstType\>\& | 目标数组 |
| dstIndex | int64_t | 目标数组中的索引，指定插入复制项目的起始位置 |
| count | int64_t | 要复制的元素数量 |
## 备注


临时原始实现，未完成任何工作！
## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
