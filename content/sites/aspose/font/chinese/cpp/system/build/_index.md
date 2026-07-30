---
title: "System::Build 方法"
linktitle: "Build"
second_title: "Aspose.Font 适用于 C++"
description: "System::Build 方法。 在 C++ 中构建具有直接所有权的对象。"
type: docs
weight: 15100
url: /zh/cpp/system/build/
---
## System::Build method


构建具有直接所有权的对象。

```cpp
template<typename T,typename...> Details::ObjectBuilder<T> System::Build(Args &&... args)
```


| 参数 | 描述 |
| --- | --- |
| T | 要构建的对象类型 |
| 参数 | 对象构造的参数类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| args | Args\\&&... | 转发给对象构造函数的参数 |

### ReturnValue

ObjectBuilder 配置为直接对象构造
## 备注



[Object](../object/) construction must be finished with [Get()](../get/) call 

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
