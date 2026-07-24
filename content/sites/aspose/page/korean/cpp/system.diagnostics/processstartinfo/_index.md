---
title: "System::Diagnostics::ProcessStartInfo class"
linktitle: "ProcessStartInfo"
second_title: "C++용 Aspose.Page"
description: "System::Diagnostics::ProcessStartInfo 클래스. 프로세스 시작 매개변수를 설명합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 400
url: /ko/cpp/system.diagnostics/processstartinfo/
---
## ProcessStartInfo class


프로세스 시작 매개변수를 설명합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class ProcessStartInfo : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Arguments](./get_arguments/)() const | 프로세스 인수를 가져옵니다. |
| [get_CreateNoWindow](./get_createnowindow/)() const | NoWindow 속성을 가져옵니다. |
| [get_EnvironmentVariables](./get_environmentvariables/)() const | 프로세스 환경 변수를 가져옵니다. |
| [get_FileName](./get_filename/)() const | 프로세스 파일 이름을 가져옵니다. |
| [get_RedirectStandardError](./get_redirectstandarderror/)() const | RedirectStandardError 속성을 가져옵니다. |
| [get_RedirectStandardInput](./get_redirectstandardinput/)() const | RedirectStandardInput 속성을 가져옵니다. |
| [get_RedirectStandardOutput](./get_redirectstandardoutput/)() const | RedirectStandardOutput 속성을 가져옵니다. |
| [get_UseShellExecute](./get_useshellexecute/)() const | UseShellExecute 속성을 가져옵니다. |
| [get_WindowStyle](./get_windowstyle/)() const | 창 스타일을 가져옵니다. |
| [get_WorkingDirectory](./get_workingdirectory/)() const | 프로세스의 작업 디렉터리를 가져옵니다. |
| [ProcessStartInfo](./processstartinfo/)() | 빈 시작 정보 객체를 생성합니다. |
| [ProcessStartInfo](./processstartinfo/)(const String\&) | 시작 정보 객체를 생성합니다. |
| [ProcessStartInfo](./processstartinfo/)(const String\&, const String\&) | 시작 정보 객체를 생성합니다. |
| [set_Arguments](./set_arguments/)(const String\&) | 프로세스 인수를 설정합니다. |
| [set_CreateNoWindow](./set_createnowindow/)(bool) | NoWindow 속성을 설정합니다. |
| [set_FileName](./set_filename/)(const String\&) | 프로세스 파일 이름을 설정합니다. |
| [set_RedirectStandardError](./set_redirectstandarderror/)(bool) | RedirectStandardError 속성을 설정합니다. |
| [set_RedirectStandardInput](./set_redirectstandardinput/)(bool) | RedirectStandardInput 속성을 설정합니다. |
| [set_RedirectStandardOutput](./set_redirectstandardoutput/)(bool) | RedirectStandardOutput 속성을 설정합니다. |
| [set_UseShellExecute](./set_useshellexecute/)(bool) | UseShellExecute 속성을 설정합니다. |
| [set_WindowStyle](./set_windowstyle/)(ProcessWindowStyle) | 창 스타일을 설정합니다. |
| [set_WorkingDirectory](./set_workingdirectory/)(const String\&) | 프로세스의 작업 디렉터리를 설정합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
