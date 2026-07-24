---
title: "System::Array::Find 方法"
linktitle: "查找"
second_title: "Aspose.Page 适用于 C++"
description: "System::Array::Find 方法。搜索指定数组中满足指定谓词条件的第一个元素（在 C++ 中）。"
type: docs
weight: 5100
url: /zh/cpp/system/array/find/
---
## Array::Find method


在指定的数组中搜索满足指定谓词条件的第一个元素。

```cpp
static T System::Array<T>::Find(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | [Array](../) 用于搜索元素的数组 |
| 匹配 | System::Predicate\<T\> | 用于定义匹配数组元素条件的谓词 |

### ReturnValue

返回数组中满足谓词定义条件的第一个元素的副本；如果不存在，则返回类型 T 的默认值

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
