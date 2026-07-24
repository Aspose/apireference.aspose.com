---
title: "System::Threading::Semaphore::WaitOne 메서드"
linktitle: "WaitOne"
second_title: "C++용 Aspose.Page"
description: "System::Threading::Semaphore::WaitOne 메서드. 세마포어를 잠급니다. 필요에 따라 C++에서 무제한 대기를 수행합니다."
type: docs
weight: 500
url: /ko/cpp/system.threading/semaphore/waitone/
---
## Semaphore::WaitOne() method


세마포어를 잠급니다. 필요시 무제한 대기를 수행합니다.

```cpp
virtual bool System::Threading::Semaphore::WaitOne() override
```


### ReturnValue

세마포어가 잠길 때까지 반환되지 않으므로 항상 true를 반환합니다.

## 또 보기

* Class [Semaphore](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Semaphore::WaitOne(int) method


세마포어를 잠급니다. 필요시 대기를 수행합니다.

```cpp
virtual bool System::Threading::Semaphore::WaitOne(int millisecondsTimeout) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| millisecondsTimeout | int | 밀리초 단위의 대기 제한 시간. |

### ReturnValue

세마포어가 잠겼으면 true를, 제한 시간을 초과했으면 false를 반환합니다.

## 또 보기

* Class [Semaphore](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
