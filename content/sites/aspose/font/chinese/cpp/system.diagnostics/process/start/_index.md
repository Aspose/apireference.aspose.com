---
title: "System::Diagnostics::Process::Start 方法"
linktitle: "Start"
second_title: "Aspose.Font 适用于 C++"
description: "System::Diagnostics::Process::Start 方法。使用预定义参数在 C++ 中启动进程。"
type: docs
weight: 1200
url: /zh/cpp/system.diagnostics/process/start/
---
## Process::Start() method


使用预定义参数启动进程。

```cpp
bool System::Diagnostics::Process::Start()
```

## 另见

* Class [Process](../)
* Namespace [System::Diagnostics](../../)
* Library [Aspose.Font for C++](../../../)
## Process::Start(const SharedPtr\<ProcessStartInfo\>\&) method


使用指定的路径和参数启动进程。

```cpp
static SharedPtr<Process> System::Diagnostics::Process::Start(const SharedPtr<ProcessStartInfo> &start_info)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| start_info | const SharedPtr\<ProcessStartInfo\>\& | 要启动的进程信息。 |

### ReturnValue

[Object](../../../system/object/) attached to newly started process.

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Process](../)
* Class [ProcessStartInfo](../../processstartinfo/)
* Class [Process](../)
* Namespace [System::Diagnostics](../../)
* Library [Aspose.Font for C++](../../../)
## Process::Start(const String\&, const String\&) method


使用指定的路径和参数启动进程。

```cpp
static SharedPtr<Process> System::Diagnostics::Process::Start(const String &filename, const String &arguments=String::Empty)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| filename | const String\& | [Process](../) 路径。 |
| arguments | const String\& | [Process](../) 参数。 |

### ReturnValue

[Object](../../../system/object/) attached to newly started process.

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Process](../)
* Class [String](../../../system/string/)
* Class [Process](../)
* Namespace [System::Diagnostics](../../)
* Library [Aspose.Font for C++](../../../)
