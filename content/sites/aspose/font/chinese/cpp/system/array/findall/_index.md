---
title: "System::Array::FindAll method"
linktitle: "FindAll"
second_title: "Aspose.Font 适用于 C++"
description: "System::Array::FindAll method. 在 C++ 中检索所有符合指定谓词定义的条件的元素。"
type: docs
weight: 5200
url: /zh/cpp/system/array/findall/
---
## Array::FindAll method


检索所有符合指定谓词定义的条件的元素。

```cpp
static System::ArrayPtr<T> System::Array<T>::FindAll(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | 用于在 [Array](../) 中搜索元素 |
| 匹配 | System::Predicate\<T\> | 定义用于匹配数组元素条件的谓词 |

### ReturnValue

一个 [Array](../)，包含所有符合指定谓词定义的条件的元素（如果找到）；否则，为一个空的 [Array](../)。

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
