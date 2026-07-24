---
title: "System::Threading::Tasks::ResultTask::GetAwaiter 메서드"
linktitle: "GetAwaiter"
second_title: "C++용 Aspose.Page"
description: "System::Threading::Tasks::ResultTask::GetAwaiter 메서드. C++에서 Await와 함께 사용하기 위해 이 결과 작업에 대한 awaiter를 가져옵니다."
type: docs
weight: 500
url: /ko/cpp/system.threading.tasks/resulttask/getawaiter/
---
## ResultTask::GetAwaiter method


Await와 함께 사용하기 위해 이 결과 작업에 대한 awaiter를 가져옵니다.

```cpp
Runtime::CompilerServices::ResultTaskAwaiter<T> System::Threading::Tasks::ResultTask<T>::GetAwaiter() const
```


### ReturnValue

[Runtime::CompilerServices::ResultTaskAwaiter<T>](../../../system.runtime.compilerservices/resulttaskawaiter/) An awaiter instance that returns the result
## 비고



await될 때, 코루틴은 결과 값이 사용 가능하도록 재개됩니다.

## 또 보기

* Class [ResultTaskAwaiter](../../../system.runtime.compilerservices/resulttaskawaiter/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
