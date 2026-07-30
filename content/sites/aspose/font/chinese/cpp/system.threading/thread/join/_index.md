---
title: "System::Threading::Thread::Join 方法"
linktitle: "Join"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Thread::Join 方法。加入受管理的线程。如果需要，在 C++ 中执行无限等待。"
type: docs
weight: 1400
url: /zh/cpp/system.threading/thread/join/
---
## Thread::Join() method


加入受管线程。如有需要，执行无限等待。

```cpp
void System::Threading::Thread::Join()
```

## 另见

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Thread::Join(int) method


加入受管线程。执行有限等待。

```cpp
bool System::Threading::Thread::Join(int millisecondsTimeout)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| millisecondsTimeout | int | 以毫秒为单位的等待超时。 |

### ReturnValue

如果线程成功加入则为 true；如果超时则为 false。

## 另见

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Thread::Join(TimeSpan) method


加入受管线程。执行有限等待。

```cpp
bool System::Threading::Thread::Join(TimeSpan timeout)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| timeout | TimeSpan | 一个 [TimeSpan](../../../system/timespan/)，设置为等待线程终止的时间量。 |

### ReturnValue

如果线程成功加入则为 true；如果超时则为 false。

## 另见

* Class [TimeSpan](../../../system/timespan/)
* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
