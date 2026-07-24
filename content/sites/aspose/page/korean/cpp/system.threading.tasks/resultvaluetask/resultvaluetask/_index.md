---
title: "System::Threading::Tasks::ResultValueTask::ResultValueTask 생성자"
linktitle: "ResultValueTask"
second_title: "C++용 Aspose.Page"
description: "System::Threading::Tasks::ResultValueTask::ResultValueTask 생성자. C++에서 비어 있고 초기화되지 않은 ResultValueTask를 생성합니다."
type: docs
weight: 100
url: /ko/cpp/system.threading.tasks/resultvaluetask/resultvaluetask/
---
## ResultValueTask::ResultValueTask() constructor


비어 있고 초기화되지 않은 [ResultValueTask](../)을 생성합니다.

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask()
```

## 비고



작업이 완료되지 않았으며 결과가 없습니다. 결과를 가져오려고 하면 예외가 발생합니다.

## 또 보기

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ResultValueTask::ResultValueTask(const RTaskPtr\<T\>\&) constructor


공유 포인터를 사용하여 [ResultTask<T>](../../resulttask/)에서 [ResultValueTask](../)을 생성합니다.

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask(const RTaskPtr<T> &task)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 작업 | const RTaskPtr\<T\>\& | 감싸는 작업입니다. 빈 작업의 경우 null일 수 있습니다. |
## 비고



[ResultValueTask](../)은 제공된 작업의 상태와 결과를 나타냅니다.

## 또 보기

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ResultValueTask::ResultValueTask(const T\&) constructor


지정된 결과와 함께 완료된 [ResultValueTask](../)을 생성합니다.

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask(const T &result)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| result | const T\& | 완료된 작업에 래핑할 결과 값입니다. |
## 비고



이것은 값을 즉시 반환하는 성공적으로 완료된 작업을 생성합니다.

## 또 보기

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
