---
title: "System::Array::Resize 方法"
linktitle: "Resize"
second_title: "Aspose.Font 适用于 C++"
description: "System::Array::Resize 方法。更改指定数组的大小为给定值，或在 C++ 中使用指定大小创建新数组。"
type: docs
weight: 5600
url: /zh/cpp/system/array/resize/
---
## Array::Resize method


将指定数组的大小更改为指定值，或创建具有指定大小的新数组。

```cpp
template<typename Type> static void System::Array<T>::Resize(ArrayPtr<Type> &arr, int new_size)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arr | ArrayPtr\<Type\>\& | [Array](../) 用于调整大小。如果 **arr** 为空指针，将创建新数组。 |
| new_size | int | 数组的新大小，或者当 **arr** 为 null 时新数组的大小。 |

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
