---
title: "System::Threading::Mutex::WaitOne 메서드"
linktitle: "WaitOne"
second_title: "C++용 Aspose.Page"
description: "System::Threading::Mutex::WaitOne 메서드. 뮤텍스를 잠급니다. 필요에 따라 C++에서 무제한 대기합니다."
type: docs
weight: 500
url: /ko/cpp/system.threading/mutex/waitone/
---
## Mutex::WaitOne() method


뮤텍스를 잠급니다. 필요시 무제한 대기를 수행합니다.

```cpp
virtual bool System::Threading::Mutex::WaitOne() override
```


### ReturnValue

뮤텍스가 잠길 때까지 반환되지 않으므로 항상 true를 반환합니다.

## 또 보기

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Mutex::WaitOne(int) method


뮤텍스를 잠급니다. 필요시 대기를 수행합니다.

```cpp
virtual bool System::Threading::Mutex::WaitOne(int millisecondsTimeout) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| millisecondsTimeout | int | 밀리초 단위의 대기 제한 시간. |

### ReturnValue

뮤텍스가 잠겼으면 true를, 제한 시간이 초과했으면 false를 반환합니다.

## 또 보기

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Mutex::WaitOne(TimeSpan) method


뮤텍스를 잠급니다. 필요시 대기를 수행합니다.

```cpp
virtual bool System::Threading::Mutex::WaitOne(TimeSpan timeout) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| timeout | TimeSpan | 대기할 밀리초 수를 나타내는 [System::TimeSpan](../../../system/timespan/) 또는 무한히 대기하기 위해 -1밀리초를 나타내는 [System::TimeSpan](../../../system/timespan/) 입니다. |

### ReturnValue

뮤텍스가 잠겼으면 true를, 제한 시간이 초과했으면 false를 반환합니다.

## 또 보기

* Class [TimeSpan](../../../system/timespan/)
* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
