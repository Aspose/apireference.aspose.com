---
title: "System::Diagnostics::Process 类"
linktitle: "Process"
second_title: "Aspose.Font 适用于 C++"
description: "System::Diagnostics::Process 类。封装进程信息和操作。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并在 C++ 中使用该指针将其作为参数传递给函数。"
type: docs
weight: 300
url: /zh/cpp/system.diagnostics/process/
---
## Process class


封装进程信息和操作。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class Process : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_EnableRaisingEvents](./get_enableraisingevents/)() const | 获取在进程终止时是否应触发 Exited 事件。 |
| [get_ExitCode](./get_exitcode/)() const | 获取进程退出代码。 |
| [get_PrivateMemorySize64](./get_privatememorysize64/)() const | 获取进程私有内存集大小。 |
| [get_ProcessName](./get_processname/)() const | 获取进程名称。 |
| [get_StandardError](./get_standarderror/)() const | 提供读取进程错误输出的读取器。未实现。 |
| [get_StandardOutput](./get_standardoutput/)() const | 提供读取进程标准输出的读取器。未实现。 |
| [get_StartInfo](./get_startinfo/)() const | 获取进程启动信息。 |
| [get_WorkingSet64](./get_workingset64/)() const | 获取进程内存工作集大小。 |
| static [GetCurrentProcess](./getcurrentprocess/)() | 获取当前进程的信息。仅限[Windows](../../system.windows/)。 |
| [GetOutputText](./getoutputtext/)() const | 获取进程输出文本。 |
| [set_EnableRaisingEvents](./set_enableraisingevents/)(bool) | 设置进程终止时是否应触发 Exited 事件。 |
| [Start](./start/)() | 使用预定义参数启动进程。 |
| static [Start](./start/)(const String\&, const String\&) | 使用指定的路径和参数启动进程。 |
| static [Start](./start/)(const SharedPtr\<ProcessStartInfo\>\&) | 使用指定的路径和参数启动进程。 |
| [WaitForExit](./waitforexit/)(int) | 等待进程退出。未实现。 |
| [WaitForExit](./waitforexit/)() | 等待进程退出，直到结束才返回。 |
| virtual [~Process](./~process/)() | 析构函数。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
