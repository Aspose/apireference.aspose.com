---
title: "System::ComponentModel::BackgroundWorker 类"
linktitle: "BackgroundWorker"
second_title: "Aspose.Font 适用于 C++"
description: "System::ComponentModel::BackgroundWorker 类。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 200
url: /zh/cpp/system.componentmodel/backgroundworker/
---
## BackgroundWorker class


此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数调用时作为参数传递。

```cpp
class BackgroundWorker : public System::ComponentModel::Component
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [BackgroundWorker](./backgroundworker/)() | RTTI 信息。 |
| [get_WorkerReportsProgress](./get_workerreportsprogress/)() const | 获取一个值，指示 [System::ComponentModel::BackgroundWorker](./) 是否可以报告进度更新。 |
| [ReportProgress](./reportprogress/)(int) | 引发 **System::ComponentModel::BackgroundWorker::ProgressChanged** 事件。 |
| [ReportProgress](./reportprogress/)(int, const System::SharedPtr\<System::Object\>\&) | 使用 userState 对象引发 **System::ComponentModel::BackgroundWorker::ProgressChanged** 事件。 |
| [RunWorkerAsync](./runworkerasync/)() | 启动后台操作的执行。 |
| [RunWorkerAsync](./runworkerasync/)(const System::SharedPtr\<System::Object\>\&) | 启动后台操作的执行。 |
| [set_WorkerReportsProgress](./set_workerreportsprogress/)(bool) | 设置一个值，指示 [System::ComponentModel::BackgroundWorker](./) 是否可以报告进度更新。 |
| [~BackgroundWorker](./~backgroundworker/)() | 析构函数。 |
## 另见

* Class [Component](../component/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
