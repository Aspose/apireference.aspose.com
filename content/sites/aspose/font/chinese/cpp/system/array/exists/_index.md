---
title: "System::Array::Exists 方法"
linktitle: "Exists"
second_title: "Aspose.Font 适用于 C++"
description: "System::Array::Exists 方法。确定在 C++ 中指定的 Array 对象是否包含满足指定谓词要求的元素。"
type: docs
weight: 5000
url: /zh/cpp/system/array/exists/
---
## Array::Exists method


确定指定的 [Array](../) 对象是否包含满足指定谓词要求的元素。

```cpp
static bool System::Array<T>::Exists(ArrayPtr<T> arr, std::function<bool(T)> match)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arr | ArrayPtr\\<T\\> | 要在其中查找元素的数组 |
| 匹配 | std::function\<bool(T)> | 定义要求并检查元素是否满足这些要求的函数对象 |

### ReturnValue

如果 **arr** 包含满足 **match** 定义的要求的元素，则为 true

## 另见

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
