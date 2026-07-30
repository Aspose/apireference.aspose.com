---
title: "System::Array::TrueForAll 方法"
linktitle: "TrueForAll"
second_title: "Aspose.Font 适用于 C++"
description: "System::Array::TrueForAll 方法。确定指定数组中的所有元素是否满足 C++ 中指定谓词定义的条件。"
type: docs
weight: 5900
url: /zh/cpp/system/array/trueforall/
---
## Array::TrueForAll method


确定指定数组中的所有元素是否满足指定谓词定义的条件。

```cpp
static bool System::Array<T>::TrueForAll(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | [Array](../) 元素，用于匹配条件 |
| 匹配 | System::Predicate\<T\> | 定义用于匹配数组元素条件的谓词 |

### ReturnValue

如果数组 arr 的所有元素满足谓词 match 定义的条件，则返回 true；否则返回 false

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
