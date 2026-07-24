---
title: "Метод System::Diagnostics::Process::Start"
linktitle: "Запуск"
second_title: "Aspose.Page для C++"
description: "Метод System::Diagnostics::Process::Start. Запускает процесс с предопределёнными параметрами в C++."
type: docs
weight: 1200
url: /ru/cpp/system.diagnostics/process/start/
---
## Process::Start() method


Запускает процесс с предопределёнными параметрами.

```cpp
bool System::Diagnostics::Process::Start()
```

## См. также

* Class [Process](../)
* Namespace [System::Diagnostics](../../)
* Library [Aspose.Page for C++](../../../)
## Process::Start(const SharedPtr\<ProcessStartInfo\>\&) method


Запускает процесс с указанным путём и аргументами.

```cpp
static SharedPtr<Process> System::Diagnostics::Process::Start(const SharedPtr<ProcessStartInfo> &start_info)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| start_info | const SharedPtr\<ProcessStartInfo\>\& | Информация о процессе, который нужно запустить. |

### ReturnValue

[Object](../../../system/object/) attached to newly started process.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Process](../)
* Class [ProcessStartInfo](../../processstartinfo/)
* Class [Process](../)
* Namespace [System::Diagnostics](../../)
* Library [Aspose.Page for C++](../../../)
## Process::Start(const String\&, const String\&) method


Запускает процесс с указанным путём и аргументами.

```cpp
static SharedPtr<Process> System::Diagnostics::Process::Start(const String &filename, const String &arguments=String::Empty)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| filename | const String\& | [Process](../) путь. |
| arguments | const String\& | [Process](../) параметры. |

### ReturnValue

[Object](../../../system/object/) attached to newly started process.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Process](../)
* Class [String](../../../system/string/)
* Class [Process](../)
* Namespace [System::Diagnostics](../../)
* Library [Aspose.Page for C++](../../../)
