---
title: "System::Threading::Tasks::ResultTask 클래스"
linktitle: "ResultTask"
second_title: "C++용 Aspose.Page"
description: "System::Threading::Tasks::ResultTask 클래스. C++에서 완료 시 결과 값을 반환하는 Task 특수화입니다."
type: docs
weight: 100
url: /ko/cpp/system.threading.tasks/resulttask/
---
## ResultTask class


완료 시 결과 값을 반환하는 [Task](../task/) 특수화.

```cpp
template<typename T>class ResultTask : public System::Threading::Tasks::Task
```


| 매개변수 | 설명 |
| --- | --- |
| T | 작업이 반환하는 결과 값의 유형 |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [ConfigureAwait](./configureawait/)(bool) const | 이 결과 작업에 대한 await가 컨텍스트 캡처와 관련하여 어떻게 동작해야 하는지 구성합니다. |
| [ContinueWith](./continuewith/)(const Action\<RTaskPtr\<T\>\>\&) | 결과 작업이 완료될 때 실행되는 연속 작업을 생성합니다. |
| [get_Result](./get_result/)() const | 비동기 작업의 결과를 가져옵니다. |
| [GetAwaiter](./getawaiter/)() const | Await와 함께 사용하기 위해 이 결과 작업에 대한 awaiter를 가져옵니다. |
| [ResultTask](./resulttask/)(const Func\<T\>\&) | 값을 반환하는 함수로 [ResultTask](./)을 구성합니다. |
| [ResultTask](./resulttask/)() | 내부 구현입니다. 사용자 코드용이 아닙니다. |
| [ResultTask](./resulttask/)(const T\&) | 지정된 결과로 결과 작업을 생성하기 위한 내부 생성자입니다. |
| [set_Result](./set_result/)(const T\&) | 작업의 결과 값을 설정합니다. |
## 비고



결과를 생성하는 비동기 작업을 나타내며, .NET의 [System.Threading.Tasks.Task<TResult>](../task/)와 유사합니다.
## 또 보기

* Class [Task](../task/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
