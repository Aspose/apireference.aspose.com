---
title: "System::Threading::Thread::Join 메서드"
linktitle: "Join"
second_title: "C++용 Aspose.Page"
description: "System::Threading::Thread::Join 메서드. 관리되는 스레드를 조인합니다. 필요에 따라 C++에서 무제한 대기를 수행합니다."
type: docs
weight: 1400
url: /ko/cpp/system.threading/thread/join/
---
## Thread::Join() method


관리되는 스레드에 조인합니다. 필요에 따라 무제한 대기를 수행합니다.

```cpp
void System::Threading::Thread::Join()
```

## 또 보기

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Thread::Join(int) method


관리되는 스레드에 조인합니다. 제한된 대기를 수행합니다.

```cpp
bool System::Threading::Thread::Join(int millisecondsTimeout)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| millisecondsTimeout | int | 밀리초 단위의 대기 제한 시간. |

### ReturnValue

스레드가 성공적으로 조인된 경우 true, 제한 시간이 초과된 경우 false.

## 또 보기

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Thread::Join(TimeSpan) method


관리되는 스레드에 조인합니다. 제한된 대기를 수행합니다.

```cpp
bool System::Threading::Thread::Join(TimeSpan timeout)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| timeout | TimeSpan | 스레드가 종료될 때까지 대기할 시간량을 설정한 [TimeSpan](../../../system/timespan/)입니다. |

### ReturnValue

스레드가 성공적으로 조인된 경우 true, 제한 시간이 초과된 경우 false.

## 또 보기

* Class [TimeSpan](../../../system/timespan/)
* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
