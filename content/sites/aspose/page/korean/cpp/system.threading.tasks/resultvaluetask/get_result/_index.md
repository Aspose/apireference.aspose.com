---
title: "System::Threading::Tasks::ResultValueTask::get_Result 메서드"
linktitle: "get_Result"
second_title: "C++용 Aspose.Page"
description: "System::Threading::Tasks::ResultValueTask::get_Result 메서드. C++에서 완료된 작업의 결과를 가져옵니다."
type: docs
weight: 900
url: /ko/cpp/system.threading.tasks/resultvaluetask/get_result/
---
## ResultValueTask::get_Result method


완료된 작업의 결과를 가져옵니다.

```cpp
T System::Threading::Tasks::ResultValueTask<T>::get_Result() const
```


### ReturnValue

T 결과 값입니다.
## 비고



작업이 [ResultTask<T>](../../resulttask/)에 의해 지원되는 경우, 이 메서드는 결과를 await하고 캐시합니다. 이후 호출은 await 없이 캐시된 값을 반환합니다.

## 또 보기

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
