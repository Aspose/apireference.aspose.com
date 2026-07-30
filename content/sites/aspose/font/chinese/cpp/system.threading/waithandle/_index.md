---
title: "System::Threading::WaitHandle 类"
linktitle: "WaitHandle"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::WaitHandle 类。等待原语基类。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 1700
url: /zh/cpp/system.threading/waithandle/
---
## WaitHandle class


等待原语基类。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class WaitHandle : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Close](./close/)() | 释放与句柄关联的任何资源。 |
| [get_Handle](./get_handle/)() | 获取句柄。 |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) | RTTI 信息。 |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) | 等待所有句柄触发。 |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) | 等待所有句柄触发。 |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) | 等待任意一个句柄触发。 |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) | 等待任意一个句柄触发。 |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) | 等待任意一个句柄触发。 |
| virtual [WaitOne](./waitone/)() | 等待句柄在无限时间内触发。 |
| virtual [WaitOne](./waitone/)(int) | 等待句柄触发。 |
| virtual [WaitOne](./waitone/)(TimeSpan) | 等待句柄触发。 |
| virtual [WaitOne](./waitone/)(int, bool) | 等待句柄触发。 |
| virtual [~WaitHandle](./~waithandle/)() | 析构函数。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [WaitTimeout](./waittimeout/) | 特殊值由函数返回；否则返回数组中已发信号对象的索引，如果超时且没有任何信号。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
