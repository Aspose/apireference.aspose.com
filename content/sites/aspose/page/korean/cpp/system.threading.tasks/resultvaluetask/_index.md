---
title: "System::Threading::Tasks::ResultValueTask 클래스"
linktitle: "ResultValueTask"
second_title: "C++용 Aspose.Page"
description: "System::Threading::Tasks::ResultValueTask 클래스. C++에서 직접 결과 값이나 ResultTask<T> 중 하나를 래핑할 수 있는 하이브리드 작업 유사 타입을 나타냅니다."
type: docs
weight: 200
url: /ko/cpp/system.threading.tasks/resultvaluetask/
---
## ResultValueTask class


직접 결과 값이나 [ResultTask<T>](../resulttask/) 중 하나를 래핑할 수 있는 하이브리드 작업 유사 타입을 나타냅니다.

```cpp
template<typename T>class ResultValueTask : public System::IEquatable<ResultValueTask<T>>,
                                            public System::Details::BoxableObjectBase
```


| 매개변수 | 설명 |
| --- | --- |
| T | 작업에서 생성된 결과의 유형입니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AsTask](./astask/)() const | 이 [ResultValueTask](./)을(를) [ResultTask<T>](../resulttask/)에 대한 공유 포인터로 변환합니다. |
| [ConfigureAwait](./configureawait/)(bool) const | 이 작업에 대한 awaiter를 구성합니다. |
| [Equals](./equals/)(ResultValueTask) override | 이 인스턴스가 다른 [ResultValueTask](./) 인스턴스와 같은지 여부를 결정합니다. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | 이 인스턴스가 다른 객체와 같은지 여부를 결정합니다. |
| [get_IsCanceled](./get_iscanceled/)() const | 작업이 취소되어 완료되었는지 여부를 나타내는 값을 가져옵니다. |
| [get_IsCompleted](./get_iscompleted/)() const | 작업이 완료되었는지 여부를 나타내는 값을 가져옵니다. |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | 작업이 성공적으로 완료되었는지 여부를 나타내는 값을 가져옵니다. |
| [get_IsFaulted](./get_isfaulted/)() const | 작업이 처리되지 않은 예외로 인해 완료되었는지 여부를 나타내는 값을 가져옵니다. |
| [get_Result](./get_result/)() const | 완료된 작업의 결과를 가져옵니다. |
| [GetAwaiter](./getawaiter/)() const | await 식을 지원하기 위해 이 작업에 대한 awaiter를 가져옵니다. |
| [operator!=](./operator!=/)(const ResultValueTask\&) const | [ResultValueTask](./)에 대한 부등 연산자입니다. |
| [operator==](./operator==/)(const ResultValueTask\&) const | [ResultValueTask](./)에 대한 동등 연산자입니다. |
| [ResultValueTask](./resultvaluetask/)() | 빈, 초기화되지 않은 [ResultValueTask](./)을(를) 생성합니다. |
| [ResultValueTask](./resultvaluetask/)(const T\&) | 지정된 결과와 함께 완료된 [ResultValueTask](./)을(를) 생성합니다. |
| [ResultValueTask](./resultvaluetask/)(const RTaskPtr\<T\>\&) | 공유 포인터를 사용하여 [ResultTask<T>](../resulttask/)에서 [ResultValueTask](./)을(를) 생성합니다. |
## 비고


[ResultValueTask](./) combines the benefits of [ValueTask](../valuetask/) (reduced allocations for synchronous results) with the ability to wrap existing [ResultTask<T>](../resulttask/) objects. It provides awaitable interface and various task status inspection methods. 
## 또 보기

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
