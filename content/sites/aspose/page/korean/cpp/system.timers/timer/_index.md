---
title: "System::Timers::Timer 클래스"
linktitle: "Timer"
second_title: "C++용 Aspose.Page"
description: "System::Timers::Timer 클래스. C++에서 대리자를 루프 내에서 호출하는 타이머."
type: docs
weight: 200
url: /ko/cpp/system.timers/timer/
---
## Timer class


[Timer](./) that calls delegate in a loop.

```cpp
class Timer : public System::ComponentModel::Component
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Close](./close/)() | 타이머를 중지하고 할당된 리소스를 해제합니다. |
| [Dispose](./dispose/)() | 타이머를 중지하고 할당된 리소스를 해제합니다. |
| [get_AutoReset](./get_autoreset/)() const | 타이머가 자동 재설정 모드인지 확인합니다. |
| [get_Enabled](./get_enabled/)() const | 타이머가 활성 상태인지 확인합니다. |
| [get_Interval](./get_interval/)() const | 타이머 간격을 가져옵니다. |
| [get_IsStopped](./get_isstopped/)() const | 타이머가 중지되었는지 확인합니다. |
| [set_AutoReset](./set_autoreset/)(bool) | 타이머를 자동 재설정 모드로 설정하거나 해제합니다. |
| [set_Enabled](./set_enabled/)(bool) | 타이머를 시작하거나 중지합니다. 타이머가 이미 실행 중이면 시작해도 시간 카운트를 재시작하지 않습니다. |
| [set_Interval](./set_interval/)(double) | 타이머 간격을 설정합니다. |
| [Start](./start/)() | 타이머를 시작합니다. 타이머가 이미 실행 중이면 시간 카운트를 재시작하지 않습니다. |
| [Stop](./stop/)() | 타이머를 중지합니다. |
| [Timer](./timer/)() | RTTI 정보. |
| [Timer](./timer/)(double) | 지정된 간격으로 중지된 타이머를 생성합니다. |
## 또 보기

* Class [Component](../../system.componentmodel/component/)
* Namespace [System::Timers](../)
* Library [Aspose.Page for C++](../../)
