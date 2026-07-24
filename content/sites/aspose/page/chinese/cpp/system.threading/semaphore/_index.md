---
title: "System::Threading::Semaphore 类"
linktitle: "信号量"
second_title: "Aspose.Page 适用于 C++"
description: "System::Threading::Semaphore 类。信号量实现。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 1000
url: /zh/cpp/system.threading/semaphore/
---
## Semaphore class


[Semaphore](./) implementation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Semaphore : public System::Threading::WaitHandle
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Release](./release/)() | 释放信号量的锁。 |
| [Release](./release/)(int) | 释放信号量的多个锁。 |
| virtual [Reset](./reset/)() | 将信号量设置为非信号状态。不受支持。 |
| [Semaphore](./semaphore/)(int, int) | RTTI 信息。 |
| [Semaphore](./semaphore/)(int, int, const String\&) | 创建命名信号量。 |
| [Semaphore](./semaphore/)(int, int, const String\&, bool\&) | 创建命名信号量。 |
| virtual [Set](./set/)() | 将信号量设置为信号状态。不受支持。 |
| [WaitOne](./waitone/)() override | 锁定信号量。如果必要，执行无限等待。 |
| [WaitOne](./waitone/)(int) override | 锁定信号量。如果必要，执行等待。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | 特殊值，由函数返回；否则返回数组中已发信号对象的索引，如果超时且没有任何信号。 |
## 另见

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
