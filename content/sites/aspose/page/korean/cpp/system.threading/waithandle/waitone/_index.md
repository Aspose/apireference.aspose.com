---
title: "System::Threading::WaitHandle::WaitOne 메서드"
linktitle: "WaitOne"
second_title: "C++용 Aspose.Page"
description: "System::Threading::WaitHandle::WaitOne 메서드. C++에서 핸들이 무제한 기간 동안 발생할 때까지 대기합니다."
type: docs
weight: 600
url: /ko/cpp/system.threading/waithandle/waitone/
---
## WaitHandle::WaitOne() method


핸들이 무한 기간 동안 발생하기를 기다립니다.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne()
```


### ReturnValue

시간 초과가 발생하지 않으므로 항상 true를 반환합니다.

## 또 보기

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(int) method


핸들이 발생하기를 기다립니다.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) 대기 시간(밀리초); -1은 무한 대기, 0은 확인 후 반환, 양수 값은 제한 시간입니다. |

### ReturnValue

핸들이 발생했으면 True, 제한 시간이 초과했으면 false.

## 또 보기

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(int, bool) method


핸들이 발생하기를 기다립니다.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout, bool exitContext)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) 대기 시간(밀리초); -1은 무한 대기, 0은 확인 후 반환, 양수 값은 제한 시간입니다. |
| exitContext | bool | true인 경우, 대기하기 전에 핸들에 대한 잠금을 해제해야 합니다. |

### ReturnValue

핸들이 발생했으면 True, 제한 시간이 초과했으면 false.

## 또 보기

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(TimeSpan) method


핸들이 발생하기를 기다립니다.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(TimeSpan timeout)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| timeout | TimeSpan | 대기할 밀리초 수를 나타내는 [System::TimeSpan](../../../system/timespan/) 또는 무한히 대기하기 위해 -1밀리초를 나타내는 [System::TimeSpan](../../../system/timespan/) 입니다. |

### ReturnValue

핸들이 발생했으면 True, 제한 시간이 초과했으면 false.

## 또 보기

* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
