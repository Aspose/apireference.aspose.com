---
title: "System::EventHandler 类型定义"
linktitle: "EventHandler"
second_title: "Aspose.Font 适用于 C++"
description: "System::EventHandler 类型定义。表示一个响应并处理事件的方法。此类型应在栈上分配，并通过值或引用传递给函数。切勿在 C++ 中使用 System::SmartPtr 类来管理此类型的对象。"
type: docs
weight: 11500
url: /zh/cpp/system/eventhandler/
---
## EventHandler typedef


表示一个响应并处理事件的方法。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](../smartptr/) 类来管理此类型的对象。

```cpp
using System::EventHandler =  MulticastDelegate<void(System::SharedPtr<Object>, TEventArgs)>
```


## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
