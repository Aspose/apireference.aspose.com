---
title: "System::ComponentModel::ProgressChangedEventArgs 类"
linktitle: "ProgressChangedEventArgs"
second_title: "Aspose.Font 适用于 C++"
description: "System::ComponentModel::ProgressChangedEventArgs 类。此类的实例作为参数传递给 ProgressChangedEventHandler 委托。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给函数（C++）。"
type: docs
weight: 1100
url: /zh/cpp/system.componentmodel/progresschangedeventargs/
---
## ProgressChangedEventArgs class


此类的实例作为参数传递给 ProgressChangedEventHandler 委托。对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class ProgressChangedEventArgs : public System::EventArgs
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_ProgressPercentage](./get_progresspercentage/)() const | 获取异步任务的进度百分比。 |
| [get_UserState](./get_userstate/)() const | 获取唯一的用户状态。 |
| [ProgressChangedEventArgs](./progresschangedeventargs/)(int, System::SharedPtr\<System::Object\>) | 构造函数。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | 一个静态成员，表示一个 "empty" [EventArgs](../../system/eventargs/) 共享指针（空指针）。 |
## 另见

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
