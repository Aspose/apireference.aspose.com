---
title: "System::Diagnostics::Process::Start 메서드"
linktitle: "시작"
second_title: "C++용 Aspose.Page"
description: "System::Diagnostics::Process::Start 메서드. C++에서 미리 정의된 매개변수로 프로세스를 시작합니다."
type: docs
weight: 1200
url: /ko/cpp/system.diagnostics/process/start/
---
## Process::Start() method


미리 정의된 매개변수로 프로세스를 시작합니다.

```cpp
bool System::Diagnostics::Process::Start()
```

## 또 보기

* Class [Process](../)
* Namespace [System::Diagnostics](../../)
* Library [Aspose.Page for C++](../../../)
## Process::Start(const SharedPtr\<ProcessStartInfo\>\&) method


지정된 경로와 인수로 프로세스를 시작합니다.

```cpp
static SharedPtr<Process> System::Diagnostics::Process::Start(const SharedPtr<ProcessStartInfo> &start_info)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| start_info | const SharedPtr\<ProcessStartInfo\>\& | 시작할 프로세스에 대한 정보. |

### ReturnValue

[Object](../../../system/object/) attached to newly started process.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Process](../)
* Class [ProcessStartInfo](../../processstartinfo/)
* Class [Process](../)
* Namespace [System::Diagnostics](../../)
* Library [Aspose.Page for C++](../../../)
## Process::Start(const String\&, const String\&) method


지정된 경로와 인수로 프로세스를 시작합니다.

```cpp
static SharedPtr<Process> System::Diagnostics::Process::Start(const String &filename, const String &arguments=String::Empty)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| filename | const String\& | [Process](../) 경로. |
| arguments | const String\& | [Process](../) 매개변수. |

### ReturnValue

[Object](../../../system/object/) attached to newly started process.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Process](../)
* Class [String](../../../system/string/)
* Class [Process](../)
* Namespace [System::Diagnostics](../../)
* Library [Aspose.Page for C++](../../../)
