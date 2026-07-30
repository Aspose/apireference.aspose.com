---
title: "System::InitObject 方法"
linktitle: "初始化对象"
second_title: "Aspose.Font 适用于 C++"
description: "System::InitObject 方法。开始在 C++ 中以共享所有权初始化对象。"
type: docs
weight: 21900
url: /zh/cpp/system/initobject/
---
## System::InitObject method


开始以共享所有权初始化对象。

```cpp
template<typename T> Details::ObjectBuilder<T, SharedPtr<T>> System::InitObject(const SharedPtr<T> &object)
```


| 参数 | 描述 |
| --- | --- |
| T | 要初始化的对象类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| object | const SharedPtr\<T\>\& | 要初始化的 [Object](../object/) |

### ReturnValue

为共享指针构造配置的 ObjectBuilder
## 备注



[Object](../object/) initialization must be finished with [Get()](../get/) call 

## 另见

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
