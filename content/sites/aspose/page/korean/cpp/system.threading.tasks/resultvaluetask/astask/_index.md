---
title: "System::Threading::Tasks::ResultValueTask::AsTask 메서드"
linktitle: "AsTask"
second_title: "C++용 Aspose.Page"
description: "System::Threading::Tasks::ResultValueTask::AsTask 메서드. 이 ResultValueTask를 C++에서 ResultTask<T>에 대한 공유 포인터로 변환합니다."
type: docs
weight: 200
url: /ko/cpp/system.threading.tasks/resultvaluetask/astask/
---
## ResultValueTask::AsTask method


이 [ResultValueTask](../)를 [ResultTask<T>](../../resulttask/)에 대한 공유 포인터로 변환합니다.

```cpp
RTaskPtr<T> System::Threading::Tasks::ResultValueTask<T>::AsTask() const
```


### ReturnValue

[RTaskPtr<T>](../../../system/rtaskptr/) A shared pointer to a [ResultTask<T>](../../resulttask/) that represents this operation.
## 비고



만약 [ResultValueTask](../)에 직접 결과가 포함되어 있으면 해당 결과로 완료된 작업을 생성합니다. 작업이 포함되어 있으면 해당 작업에 대한 공유 포인터를 반환합니다.

## 또 보기

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
