---
title: "System::ComponentModel::RunWorkerCompletedEventArgs class"
linktitle: "RunWorkerCompletedEventArgs"
second_title: "Aspose.Font 适用于 C++"
description: "System::ComponentModel::RunWorkerCompletedEventArgs class。此类的实例作为参数传递给 RunWorkerCompletedEventHandler 委托。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 1300
url: /zh/cpp/system.componentmodel/runworkercompletedeventargs/
---
## RunWorkerCompletedEventArgs class


此类的实例作为参数传递给 RunWorkerCompletedEventHandler 委托。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class RunWorkerCompletedEventArgs : public System::ComponentModel::AsyncCompletedEventArgs
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Result](./get_result/)() const | 获取表示异步操作结果的值。 |
| [RunWorkerCompletedEventArgs](./runworkercompletedeventargs/)(const System::SharedPtr\<System::Object\>\&, const System::Exception\&, bool) | RTTI 信息。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | 一个静态成员，表示一个 "empty" [EventArgs](../../system/eventargs/) 共享指针（空指针）。 |
## 另见

* Class [AsyncCompletedEventArgs](../asynccompletedeventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
