---
title: "System::Diagnostics::ProcessStartInfo 类"
linktitle: "ProcessStartInfo"
second_title: "Aspose.Font 适用于 C++"
description: "System::Diagnostics::ProcessStartInfo 类。描述进程启动参数。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 400
url: /zh/cpp/system.diagnostics/processstartinfo/
---
## ProcessStartInfo class


描述进程启动参数。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class ProcessStartInfo : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Arguments](./get_arguments/)() const | 获取进程参数。 |
| [get_CreateNoWindow](./get_createnowindow/)() const | 获取 NoWindow 属性。 |
| [get_EnvironmentVariables](./get_environmentvariables/)() const | 获取进程环境变量。 |
| [get_FileName](./get_filename/)() const | 获取进程文件名。 |
| [get_RedirectStandardError](./get_redirectstandarderror/)() const | 获取 RedirectStandardError 属性。 |
| [get_RedirectStandardInput](./get_redirectstandardinput/)() const | 获取 RedirectStandardInput 属性。 |
| [get_RedirectStandardOutput](./get_redirectstandardoutput/)() const | 获取 RedirectStandardOutput 属性。 |
| [get_UseShellExecute](./get_useshellexecute/)() const | 获取 UseShellExecute 属性。 |
| [get_WindowStyle](./get_windowstyle/)() const | 获取窗口样式。 |
| [get_WorkingDirectory](./get_workingdirectory/)() const | 获取进程的工作目录。 |
| [ProcessStartInfo](./processstartinfo/)() | 创建空的启动信息对象。 |
| [ProcessStartInfo](./processstartinfo/)(const String\&) | 创建启动信息对象。 |
| [ProcessStartInfo](./processstartinfo/)(const String\&, const String\&) | 创建启动信息对象。 |
| [set_Arguments](./set_arguments/)(const String\&) | 设置进程参数。 |
| [set_CreateNoWindow](./set_createnowindow/)(bool) | 设置 NoWindow 属性。 |
| [set_FileName](./set_filename/)(const String\&) | 设置进程文件名。 |
| [set_RedirectStandardError](./set_redirectstandarderror/)(bool) | 设置 RedirectStandardError 属性。 |
| [set_RedirectStandardInput](./set_redirectstandardinput/)(bool) | 设置 RedirectStandardInput 属性。 |
| [set_RedirectStandardOutput](./set_redirectstandardoutput/)(bool) | 设置 RedirectStandardOutput 属性。 |
| [set_UseShellExecute](./set_useshellexecute/)(bool) | 设置 UseShellExecute 属性。 |
| [set_WindowStyle](./set_windowstyle/)(ProcessWindowStyle) | 设置窗口样式。 |
| [set_WorkingDirectory](./set_workingdirectory/)(const String\&) | 设置进程的工作目录。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
