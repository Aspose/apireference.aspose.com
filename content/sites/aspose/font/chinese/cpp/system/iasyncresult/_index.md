---
title: "System::IAsyncResult 类"
linktitle: "IAsyncResult"
second_title: "Aspose.Font 适用于 C++"
description: "System::IAsyncResult 类。表示异步操作的状态。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 3100
url: /zh/cpp/system/iasyncresult/
---
## IAsyncResult class


表示异步操作的状态。此类的对象只能使用 [System::MakeObject()](../makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class IAsyncResult : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [get_AsyncState](./get_asyncstate/)() | 返回一个包含关于异步操作信息的对象。 |
| virtual [get_AsyncWaitHandle](./get_asyncwaithandle/)() | 返回一个 WaitHandle 实例，可用于等待异步操作的完成。 |
| virtual [get_CompletedSynchronously](./get_completedsynchronously/)() | 返回一个值，指示异步操作是否同步完成。 |
| virtual [get_IsCompleted](./get_iscompleted/)() | 返回一个值，指示异步操作是否已完成。 |
| virtual [~IAsyncResult](./~iasyncresult/)() | 析构函数。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [smart_ptr](./smart_ptr/) | 指向 [IAsyncResult](./) 的共享指针。 |
## 另见

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
