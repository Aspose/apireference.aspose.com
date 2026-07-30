---
title: "System::Threading::ManualResetEvent 类"
linktitle: "ManualResetEvent"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::ManualResetEvent 类。事件用于通知等待的线程不会自动重置。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 700
url: /zh/cpp/system.threading/manualresetevent/
---
## ManualResetEvent class


[Event](../../system/event/) to notify waiting thread that does not reset automatically. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ManualResetEvent : public System::Threading::EventWaitHandle
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [ManualResetEvent](./manualresetevent/)(bool) | RTTI 信息。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | 特殊值由函数返回；否则返回数组中已发信号对象的索引，如果超时且没有任何信号。 |
## 另见

* Class [EventWaitHandle](../eventwaithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
