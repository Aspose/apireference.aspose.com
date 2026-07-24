---
title: "System::InitObject method"
linktitle: "初始化对象"
second_title: "Aspose.Page 适用于 C++"
description: "System::InitObject 方法。启动在 C++ 中具有共享所有权的对象的初始化。"
type: docs
weight: 21800
url: /zh/cpp/system/initobject/
---
## System::InitObject method


启动具有共享所有权的对象的初始化。

```cpp
template<typename T> Details::ObjectBuilder<T, SharedPtr<T>> System::InitObject(const SharedPtr<T> &object)
```


| Parameter | 描述 |
| --- | --- |
| T | 要初始化的对象类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| object | const SharedPtr\<T\>\& | [Object](../object/) 用于初始化 |

### ReturnValue

为共享指针构造配置的 ObjectBuilder
## 备注



[Object](../object/) initialization must be finished with [Get()](../get/) call 

## 另见

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
