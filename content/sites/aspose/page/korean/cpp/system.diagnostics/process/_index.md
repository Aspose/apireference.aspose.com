---
title: "System::Diagnostics::Process 클래스"
linktitle: "Process"
second_title: "C++용 Aspose.Page"
description: "System::Diagnostics::Process 클래스. 프로세스 정보와 조작을 캡슐화합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여만 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고, C++에서 함수 인자로 전달할 때 해당 포인터를 사용하십시오."
type: docs
weight: 300
url: /ko/cpp/system.diagnostics/process/
---
## Process class


프로세스 정보와 조작을 캡슐화합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여만 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고, 해당 포인터를 사용하여 함수에 인자로 전달하십시오.

```cpp
class Process : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_EnableRaisingEvents](./get_enableraisingevents/)() const | 프로세스가 종료될 때 Exited 이벤트를 발생시킬지 여부를 가져옵니다. |
| [get_ExitCode](./get_exitcode/)() const | 프로세스 종료 코드를 가져옵니다. |
| [get_PrivateMemorySize64](./get_privatememorysize64/)() const | 프로세스 전용 메모리 집합 크기를 가져옵니다. |
| [get_ProcessName](./get_processname/)() const | 프로세스 이름을 가져옵니다. |
| [get_StandardError](./get_standarderror/)() const | 프로세스 오류 출력에서 읽을 수 있는 리더를 제공합니다. 구현되지 않음. |
| [get_StandardOutput](./get_standardoutput/)() const | 프로세스 표준 출력에서 읽을 수 있는 리더를 제공합니다. 구현되지 않음. |
| [get_StartInfo](./get_startinfo/)() const | 프로세스 시작 정보를 가져옵니다. |
| [get_WorkingSet64](./get_workingset64/)() const | 프로세스 메모리 작업 집합 크기를 가져옵니다. |
| static [GetCurrentProcess](./getcurrentprocess/)() | 현재 프로세스에 대한 정보를 가져옵니다. [Windows](../../system.windows/) 전용. |
| [GetOutputText](./getoutputtext/)() const | 프로세스 출력 텍스트를 가져옵니다. |
| [set_EnableRaisingEvents](./set_enableraisingevents/)(bool) | 프로세스가 종료될 때 이벤트 Exited가 발생하도록 설정합니다. |
| [Start](./start/)() | 미리 정의된 매개변수로 프로세스를 시작합니다. |
| static [Start](./start/)(const String\&, const String\&) | 지정된 경로와 인수로 프로세스를 시작합니다. |
| static [Start](./start/)(const SharedPtr\<ProcessStartInfo\>\&) | 지정된 경로와 인수로 프로세스를 시작합니다. |
| [WaitForExit](./waitforexit/)(int) | 프로세스가 종료될 때까지 대기합니다. 구현되지 않음. |
| [WaitForExit](./waitforexit/)() | 프로세스가 종료될 때까지 대기하며, 종료될 때까지 반환되지 않습니다. |
| virtual [~Process](./~process/)() | 소멸자. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
