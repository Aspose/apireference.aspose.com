---
title: "طريقة System::Diagnostics::Process::Start"
linktitle: "ابدأ"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Diagnostics::Process::Start. يبدأ العملية بمعلمات مسبقة التعريف في C++."
type: docs
weight: 1200
url: /ar/cpp/system.diagnostics/process/start/
---
## Process::Start() method


يبدأ العملية بمعلمات مُحددة مسبقًا.

```cpp
bool System::Diagnostics::Process::Start()
```

## انظر أيضًا

* Class [Process](../)
* Namespace [System::Diagnostics](../../)
* Library [Aspose.Font for C++](../../../)
## Process::Start(const SharedPtr\<ProcessStartInfo\>\&) method


يبدأ العملية بالمسار المحدد والوسائط.

```cpp
static SharedPtr<Process> System::Diagnostics::Process::Start(const SharedPtr<ProcessStartInfo> &start_info)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| start_info | const SharedPtr\<ProcessStartInfo\>\& | معلومات حول العملية التي سيتم بدءها. |

### ReturnValue

[Object](../../../system/object/) attached to newly started process.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Process](../)
* Class [ProcessStartInfo](../../processstartinfo/)
* Class [Process](../)
* Namespace [System::Diagnostics](../../)
* Library [Aspose.Font for C++](../../../)
## Process::Start(const String\&, const String\&) method


يبدأ العملية بالمسار المحدد والوسائط.

```cpp
static SharedPtr<Process> System::Diagnostics::Process::Start(const String &filename, const String &arguments=String::Empty)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| filename | const String\& | [Process](../) المسار. |
| arguments | const String\& | [Process](../) المعلمات. |

### ReturnValue

[Object](../../../system/object/) attached to newly started process.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Process](../)
* Class [String](../../../system/string/)
* Class [Process](../)
* Namespace [System::Diagnostics](../../)
* Library [Aspose.Font for C++](../../../)
