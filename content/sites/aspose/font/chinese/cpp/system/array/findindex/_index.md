---
title: "System::Array::FindIndex 方法"
linktitle: "FindIndex"
second_title: "Aspose.Font 适用于 C++"
description: "System::Array::FindIndex 方法。在 C++ 中搜索指定数组中满足指定谓词条件的第一个元素。"
type: docs
weight: 5300
url: /zh/cpp/system/array/findindex/
---
## Array::FindIndex method


在指定的数组中搜索满足指定谓词条件的第一个元素。

```cpp
static int System::Array<T>::FindIndex(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | [Array](../) 用于搜索元素的数组 |
| 匹配 | System::Predicate\<T\> | 定义用于匹配数组元素条件的谓词 |

### ReturnValue

满足谓词定义的条件的数组中第一个元素的索引；如果不存在则返回 -1

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
