---
title: "System::BuildArray 方法"
linktitle: "BuildArray"
second_title: "Aspose.Font 适用于 C++"
description: "System::BuildArray 方法。在 C++ 中构建数组。"
type: docs
weight: 15200
url: /zh/cpp/system/buildarray/
---
## System::BuildArray method


构建数组。

```cpp
template<typename T> Details::ObjectBuilder<Details::ArrayStorage<T>> System::BuildArray()
```


| 参数 | 描述 |
| --- | --- |
| T | 要构建的数组的元素类型 |

### ReturnValue

为数组构造配置的 ObjectBuilder
## 备注



创建一个 [ArrayPtr<T>](../arrayptr/) 并返回其构建器
[Object](../object/) construction must be finished with [Get()](../get/) call 

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
