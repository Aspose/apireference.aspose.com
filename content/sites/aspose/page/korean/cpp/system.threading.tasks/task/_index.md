---
title: "System::Threading::Tasks::Task class"
linktitle: "Task"
second_title: "C++용 Aspose.Page"
description: "System::Threading::Tasks::Task class. 비동기 작업을 나타내며, C++에서 await 할 수 있고 다른 작업과 결합할 수 있습니다."
type: docs
weight: 300
url: /ko/cpp/system.threading.tasks/task/
---
## Task class


대기할 수 있고 다른 작업과 결합할 수 있는 비동기 작업을 나타냅니다.

```cpp
class Task : public System::IDisposable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Activate](./activate/)(TaskScheduler *) | 스케줄러에서 작업을 실행하도록 활성화합니다. |
| [AddContinuation](./addcontinuation/)(const Action<>\&) | 완료 시 실행될 연속 작업을 추가합니다. |
| [Complete](./complete/)() | 작업을 완료된 상태로 표시하고 작업을 종료합니다. |
| [ConfigureAwait](./configureawait/)(bool) const | 이 작업에 대한 await가 컨텍스트 캡처와 관련하여 어떻게 동작할지 구성합니다. |
| [ContinueWith](./continuewith/)(const Action\<TaskPtr\>\&) | 작업이 완료될 때 실행되는 연속 작업을 생성합니다. |
| [Dispose](./dispose/)() override | 작업과 연관된 리소스를 해제합니다. |
| [Execute](./execute/)() | 작업의 함수를 실행합니다. |
| [get_AsyncState](./get_asyncstate/)() const | 작업과 연관된 사용자 정의 상태 객체를 가져옵니다. |
| static [get_CompletedTask](./get_completedtask/)() | 완료된 작업(싱글톤)을 가져옵니다. |
| static [get_CurrentId](./get_currentid/)() |  |
| [get_Id](./get_id/)() const | 작업의 ID를 가져옵니다. |
| [get_IsCanceled](./get_iscanceled/)() const | 작업이 취소로 인해 완료되었는지 여부를 가져옵니다. |
| [get_IsCompleted](./get_iscompleted/)() const | 작업이 완료되었는지 여부를 가져옵니다. |
| [get_IsFaulted](./get_isfaulted/)() const | 작업이 처리되지 않은 예외로 인해 완료되었는지 여부를 가져옵니다. |
| [get_Scheduler](./get_scheduler/)() const | 이 작업과 연관된 스케줄러를 가져옵니다. |
| [get_Status](./get_status/)() const | 작업의 현재 상태를 가져옵니다. |
| [GetAwaiter](./getawaiter/)() const | Await와 함께 사용하기 위한 이 작업의 awaiter를 가져옵니다. |
| [RunSynchronously](./runsynchronously/)() | 현재 스레드에서 작업을 동기식으로 실행합니다. |
| [RunSynchronously](./runsynchronously/)(const SharedPtr\<TaskScheduler\>\&) | 지정된 스케줄러를 사용하여 작업을 동기식으로 실행합니다. |
| [set_Function](./set_function/)(const FunctionT\&) | 내부 함수를 실행하도록 설정합니다. |
| [set_Scheduler](./set_scheduler/)(TaskScheduler *) | 이 작업과 연결된 스케줄러를 설정합니다. |
| [set_Status](./set_status/)(TaskStatus) | 작업 상태를 설정합니다. |
| [Start](./start/)() | 기본 스케줄러를 사용하여 작업 실행을 시작합니다. |
| [Start](./start/)(const SharedPtr\<TaskScheduler\>\&) | 지정된 스케줄러를 사용하여 작업 실행을 시작합니다. |
| [Task](./task/)(const Action<>\&) | 실행할 작업을 가진 [Task](./)을 생성합니다. |
| [Task](./task/)(const Action<>\&, const CancellationToken\&) | 작업과 취소 토큰을 가진 [Task](./)을 생성합니다. |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) | 상태를 보유한 작업과 상태 객체를 가진 [Task](./)을 생성합니다. |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) | 상태를 보유한 작업, 상태 및 취소 토큰을 가진 [Task](./)을 생성합니다. |
| [Task](./task/)() | 초기화되지 않은 작업을 만들기 위한 내부 생성자입니다. |
| [Wait](./wait/)(const CancellationToken\&) const | 취소 지원과 함께 작업이 완료될 때까지 대기합니다. |
| [Wait](./wait/)() const | 작업이 완료될 때까지 대기합니다. |
| [~Task](./~task/)() | 소멸자. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [FunctionT](./functiont/) | 내부 구현입니다. 사용자 코드용이 아닙니다. |
## 비고


C++에서 .NET의 [System.Threading.Tasks.Task](./)과 유사한 구현을 제공하며, 취소, 연속 작업 및 async/await 패턴을 지원합니다.
## 또 보기

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
