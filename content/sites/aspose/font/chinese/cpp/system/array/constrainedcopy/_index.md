---
title: "System::Array::ConstrainedCopy 方法"
linktitle: "ConstrainedCopy"
second_title: "Aspose.Font 适用于 C++"
description: "System::Array::ConstrainedCopy 方法。复制一段元素，从指定的源位置的 System.Array 开始，使用 C++。"
type: docs
weight: 4700
url: /zh/cpp/system/array/constrainedcopy/
---
## Array::ConstrainedCopy method


复制一段元素，从指定源位置的 [System.Array](../) 开始。

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::ConstrainedCopy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| 参数 | 描述 |
| --- | --- |
| SrcType | 源数组中元素的类型 |
| DstType | 目标数组中元素的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | 源数组 |
| srcIndex | int64_t | 源数组中的索引，指示要复制的项目范围的起始位置 |
| dstArray | const ArrayPtr\<DstType\>\& | 目标数组 |
| dstIndex | int64_t | 目标数组中的索引，指示开始插入复制项目的位置 |
| count | int64_t | 要复制的元素数量 |
## 备注


临时原始实现，未完成任何工作！
## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
