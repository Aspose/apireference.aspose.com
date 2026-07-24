---
title: "System::Threading::WaitHandle::WaitAny 메서드"
linktitle: "WaitAny"
second_title: "C++용 Aspose.Page"
description: "System::Threading::WaitHandle::WaitAny 메서드. C++에서 핸들 중 하나가 발생할 때까지 대기합니다."
type: docs
weight: 200
url: /ko/cpp/system.threading/waithandle/waitany/
---
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) method


핸들 중 하나가 발생할 때까지 대기합니다.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | 대기할 핸들들. |

### ReturnValue

waitHandles의 모든 요소가 신호를 받았을 때 True; 그렇지 않으면 메서드는 절대 반환되지 않습니다.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) method


핸들 중 하나가 발생할 때까지 대기합니다.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, int millisecondsTimeout)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | 대기할 핸들들. |
| millisecondsTimeout | int | [Timeout](../../timeout/) 대기 시간(밀리초); -1은 무한 대기, 0은 확인 후 반환, 양수 값은 제한 시간입니다. |

### ReturnValue

핸들 중 하나가 발생하면 true, 제한 시간이 초과하면 false.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) method


핸들 중 하나가 발생할 때까지 대기합니다.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, TimeSpan timeout)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | 대기할 핸들들. |
| timeout | TimeSpan | 대기할 밀리초 수를 나타내는 [System::TimeSpan](../../../system/timespan/) 또는 무한히 대기하기 위해 -1밀리초를 나타내는 [System::TimeSpan](../../../system/timespan/) 입니다. |

### ReturnValue

핸들 중 하나가 발생하면 true, 제한 시간이 초과하면 false.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
