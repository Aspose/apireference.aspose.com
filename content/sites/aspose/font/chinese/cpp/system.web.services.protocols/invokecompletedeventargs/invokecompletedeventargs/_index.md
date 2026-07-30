---
title: "System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs 构造函数"
linktitle: "InvokeCompletedEventArgs"
second_title: "Aspose.Font 适用于 C++"
description: "System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs 构造函数。 在 C++ 中构造一个新实例。"
type: docs
weight: 100
url: /zh/cpp/system.web.services.protocols/invokecompletedeventargs/invokecompletedeventargs/
---
## InvokeCompletedEventArgs::InvokeCompletedEventArgs constructor


构造一个新实例。

```cpp
System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs(Exception error, bool cancelled, System::SharedPtr<Object> userState, System::ArrayPtr<System::SharedPtr<Object>> results)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 错误 | Exception | 在异步操作期间发生的任何错误。 |
| 已取消 | bool | 指示异步操作是否已取消的值。 |
| userState | System::SharedPtr\<Object\> | 可选的用户提供的状态对象，传递给 [System.ComponentModel.BackgroundWorker.RunWorkerAsync](../../../system.componentmodel/backgroundworker/runworkerasync/)([System.Object](../../../system/object/)) 方法。 |
| 结果 | System::ArrayPtr\<System::SharedPtr\<Object\>\> | 异步操作结果的集合。 |

## 另见

* Typedef [Exception](../../../system/exception/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [InvokeCompletedEventArgs](../)
* Namespace [System::Web::Services::Protocols](../../)
* Library [Aspose.Font for C++](../../../)
