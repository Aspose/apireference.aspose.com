---
title: "System::Threading::Tasks::ResultValueTask::operator== 메서드"
linktitle: "operator=="
second_title: "C++용 Aspose.Page"
description: "System::Threading::Tasks::ResultValueTask::operator== 메서드. C++에서 ResultValueTask에 대한 동등 연산자입니다."
type: docs
weight: 1200
url: /ko/cpp/system.threading.tasks/resultvaluetask/operator==/
---
## ResultValueTask::operator== method


[ResultValueTask](../)에 대한 동등 연산자입니다.

```cpp
bool System::Threading::Tasks::ResultValueTask<T>::operator==(const ResultValueTask &other) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| other | const ResultValueTask\& | 이 인스턴스와 비교하기 위한 다른 [ResultValueTask](../)입니다. |

### ReturnValue

bool 두 작업이 동일한 결과 값을 가지고 있거나 동일한 기본 작업을 참조하면 true; 그렇지 않으면 false.
## 비고



어느 한 인스턴스에 직접 결과 값이 포함되어 있으면 결과를 직접 비교합니다. 그렇지 않으면 기본 작업 포인터를 비교합니다.
## 또 보기

* Class [ResultValueTask](../)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
