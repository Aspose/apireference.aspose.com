---
title: "System::Threading::Tasks::ValueTask 클래스"
linktitle: "ValueTask"
second_title: "C++용 Aspose.Page"
description: "System::Threading::Tasks::ValueTask 클래스. C++에서 비동기 작업의 대기 가능한 결과를 제공합니다."
type: docs
weight: 500
url: /ko/cpp/system.threading.tasks/valuetask/
---
## ValueTask class


비동기 작업의 대기 가능한 결과를 제공합니다.

```cpp
class ValueTask : public System::IEquatable<ValueTask>,
                  public System::Details::BoxableObjectBase
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AsTask](./astask/)() const | 이 [ValueTask](./)을 [Task](../task/)에 대한 공유 포인터로 변환합니다. |
| [ConfigureAwait](./configureawait/)(bool) const | 이 작업에 대한 awaiter를 구성합니다. |
| [Equals](./equals/)(ValueTask) override | 이 인스턴스가 다른 [ValueTask](./) 인스턴스와 같은지 여부를 결정합니다. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | 이 인스턴스가 다른 객체와 같은지 여부를 결정합니다. |
| [get_IsCanceled](./get_iscanceled/)() const | 작업이 취소되어 완료되었는지 여부를 나타내는 값을 가져옵니다. |
| [get_IsCompleted](./get_iscompleted/)() const | 작업이 완료되었는지 여부를 나타내는 값을 가져옵니다. |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | 작업이 성공적으로 완료되었는지 여부를 나타내는 값을 가져옵니다. |
| [get_IsFaulted](./get_isfaulted/)() const | 작업이 처리되지 않은 예외로 인해 완료되었는지 여부를 나타내는 값을 가져옵니다. |
| [GetAwaiter](./getawaiter/)() const | await 식을 지원하기 위해 이 작업에 대한 awaiter를 가져옵니다. |
| [operator!=](./operator!=/)(const ValueTask\&) const | [ValueTask](./)에 대한 부등 연산자. |
| [operator==](./operator==/)(const ValueTask\&) const | [ValueTask](./)에 대한 동등 연산자. |
| [ValueTask](./valuetask/)() | 빈, 초기화되지 않은 [ValueTask](./)을 생성합니다. |
| [ValueTask](./valuetask/)(const TaskPtr\&) | 공유 포인터인 [Task](../task/)에서 [ValueTask](./)을 생성합니다. |
## 또 보기

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
