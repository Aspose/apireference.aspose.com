---
title: "System::Threading::Tasks::ResultTask::ConfigureAwait 메서드"
linktitle: "ConfigureAwait"
second_title: "C++용 Aspose.Page"
description: "System::Threading::Tasks::ResultTask::ConfigureAwait 메서드. C++에서 이 결과 작업에 대한 await가 컨텍스트 캡처와 관련하여 어떻게 동작해야 하는지 구성합니다."
type: docs
weight: 200
url: /ko/cpp/system.threading.tasks/resulttask/configureawait/
---
## ResultTask::ConfigureAwait method


이 결과 작업에 대한 await가 컨텍스트 캡처와 관련하여 어떻게 동작해야 하는지 구성합니다.

```cpp
Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T> System::Threading::Tasks::ResultTask<T>::ConfigureAwait(bool continueOnCapturedContext) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| continueOnCapturedContext | bool | 캡처된 컨텍스트에서 계속할지 여부 |

### ReturnValue

[Runtime::CompilerServices::ConfiguredResultTaskAwaitable<T>](../../../system.runtime.compilerservices/configuredresulttaskawaitable/) A configured awaitable for the result
## 비고



이는 async/await 패턴에 대한 컨텍스트 흐름을 세밀하게 제어할 수 있게 합니다.

## 또 보기

* Class [ConfiguredResultTaskAwaitable](../../../system.runtime.compilerservices/configuredresulttaskawaitable/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
