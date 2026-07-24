---
title: "System::Array::TrueForAll 方法"
linktitle: "TrueForAll"
second_title: "Aspose.Page 适用于 C++"
description: "System::Array::TrueForAll 方法。确定指定数组中的所有元素是否满足 C++ 中指定谓词定义的条件。"
type: docs
weight: 5900
url: /zh/cpp/system/array/trueforall/
---
## Array::TrueForAll method


确定指定数组中的所有元素是否满足由指定谓词定义的条件。

```cpp
static bool System::Array<T>::TrueForAll(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | [Array](../) 元素，用于与条件匹配 |
| 匹配 | System::Predicate\<T\> | 用于定义匹配数组元素条件的谓词 |

### ReturnValue

如果数组 arr 的所有元素满足谓词 match 定义的条件，则为 true；否则为 false

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
