---
title: "System::Threading::EventWaitHandle 类"
linktitle: "EventWaitHandle"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::EventWaitHandle 类。可以发送给等待线程的事件。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 500
url: /zh/cpp/system.threading/eventwaithandle/
---
## EventWaitHandle class


[Event](../../system/event/) that can be sent to waiting thread. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EventWaitHandle : public System::Threading::WaitHandle
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [EventWaitHandle](./eventwaithandle/)(bool, EventResetMode) | RTTI 信息。 |
| virtual [Reset](./reset/)() | 将事件设置为非信号状态。 |
| virtual [Set](./set/)() | 将事件设置为信号状态。 |
| [~EventWaitHandle](./~eventwaithandle/)() | 析构函数。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | 特殊值由函数返回；否则返回数组中已发信号对象的索引，如果超时且没有任何信号。 |
## 另见

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
