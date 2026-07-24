---
title: "System::Threading::Tasks::ValueTask::ConfigureAwait 메서드"
linktitle: "ConfigureAwait"
second_title: "C++용 Aspose.Page"
description: "System::Threading::Tasks::ValueTask::ConfigureAwait 메서드. C++에서 이 작업에 대한 awaiter를 구성합니다."
type: docs
weight: 300
url: /ko/cpp/system.threading.tasks/valuetask/configureawait/
---
## ValueTask::ConfigureAwait method


이 작업에 대한 awaiter를 구성합니다.

```cpp
Runtime::CompilerServices::ConfiguredValueTaskAwaitable System::Threading::Tasks::ValueTask::ConfigureAwait(bool continueOnCapturedContext) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| continueOnCapturedContext | bool | true를 지정하면 캡처된 원래 컨텍스트로 계속 실행을 마샬링하려 시도하고; 그렇지 않으면 false. |

### ReturnValue

ConfiguredValueTaskAwaitable 이 작업에 대한 awaiter의 동작 방식을 구성하는 객체.

## 또 보기

* Class [ConfiguredValueTaskAwaitable](../../../system.runtime.compilerservices/configuredvaluetaskawaitable/)
* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
