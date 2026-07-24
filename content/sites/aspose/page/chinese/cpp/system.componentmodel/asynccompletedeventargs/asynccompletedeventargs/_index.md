---
title: "System::ComponentModel::AsyncCompletedEventArgs::AsyncCompletedEventArgs 构造函数"
linktitle: "AsyncCompletedEventArgs"
second_title: "Aspose.Page 适用于 C++"
description: "System::ComponentModel::AsyncCompletedEventArgs::AsyncCompletedEventArgs 构造函数。C++ 中的构造函数。"
type: docs
weight: 100
url: /zh/cpp/system.componentmodel/asynccompletedeventargs/asynccompletedeventargs/
---
## AsyncCompletedEventArgs::AsyncCompletedEventArgs() constructor


构造函数。

```cpp
System::ComponentModel::AsyncCompletedEventArgs::AsyncCompletedEventArgs()
```

## 另见

* Class [AsyncCompletedEventArgs](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
## AsyncCompletedEventArgs::AsyncCompletedEventArgs(const System::Exception\&, bool, const System::SharedPtr\<System::Object\>\&) constructor


初始化一个新的 [System.ComponentModel.AsyncCompletedEventArgs](../) 类实例。

```cpp
System::ComponentModel::AsyncCompletedEventArgs::AsyncCompletedEventArgs(const System::Exception &error, bool canceled, const System::SharedPtr<System::Object> &userState)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 错误 | const System::Exception\& | 在异步操作期间发生的任何错误。 |
| 已取消 | bool | 指示异步操作是否已取消的值。 |
| userState | const System::SharedPtr\<System::Object\>\& | 可选的用户提供的状态对象，传递给 [System.ComponentModel.BackgroundWorker.RunWorkerAsync](../../backgroundworker/runworkerasync/)([System.Object](../../../system/object/)) 方法。 |

## 另见

* Typedef [Exception](../../../system/exception/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [AsyncCompletedEventArgs](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
