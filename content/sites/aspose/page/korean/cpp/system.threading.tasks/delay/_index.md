---
title: "System::Threading::Tasks::Delay 메서드"
linktitle: "지연"
second_title: "C++용 Aspose.Page"
description: "System::Threading::Tasks::Delay 메서드. C++에서 일정 시간 지연 후에 완료되는 작업을 생성합니다."
type: docs
weight: 700
url: /ko/cpp/system.threading.tasks/delay/
---
## System::Threading::Tasks::Delay(int32_t) method


시간 지연 후에 완료되는 작업을 생성합니다.

```cpp
TaskPtr System::Threading::Tasks::Delay(int32_t millisecondsDelay)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| millisecondsDelay | int32_t | 반환된 작업이 완료되기 전에 대기할 밀리초 수이며, -1은 무한히 대기함을 의미합니다. |

### ReturnValue

시간 지연을 나타내는 작업.

## 또 보기

* Typedef [TaskPtr](../../system/taskptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
## System::Threading::Tasks::Delay(int32_t, const CancellationToken\&) method




```cpp
TaskPtr System::Threading::Tasks::Delay(int32_t millisecondsDelay, const CancellationToken &cancellationToken)
```

## 또 보기

* Typedef [TaskPtr](../../system/taskptr/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
