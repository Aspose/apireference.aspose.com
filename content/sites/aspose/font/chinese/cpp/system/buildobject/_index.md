---
title: "System::BuildObject 方法"
linktitle: "BuildObject"
second_title: "Aspose.Font 适用于 C++"
description: "System::BuildObject 方法。在 C++ 中构建具有共享所有权的对象。"
type: docs
weight: 15300
url: /zh/cpp/system/buildobject/
---
## System::BuildObject method


构建具有共享所有权的对象。

```cpp
template<typename T,typename...> Details::ObjectBuilder<T, SharedPtr<T>> System::BuildObject(Args &&... args)
```


| 参数 | 描述 |
| --- | --- |
| T | 要构建的对象类型 |
| 参数 | 对象构造的参数类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| args | Args\\&&... | 转发给对象构造函数的参数 |

### ReturnValue

为共享指针构造配置的 ObjectBuilder
## 备注



创建一个 [SharedPtr<T>](../sharedptr/) 并返回其构建器
[Object](../object/) construction must be finished with [Get()](../get/) call 

## 另见

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
