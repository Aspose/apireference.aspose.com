---
title: "System::Threading::Mutex::WaitOne 方法"
linktitle: "WaitOne"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Mutex::WaitOne 方法。锁定互斥体。如果需要，在 C++ 中执行无限等待。"
type: docs
weight: 500
url: /zh/cpp/system.threading/mutex/waitone/
---
## Mutex::WaitOne() method


锁定互斥体。如有必要，执行无限等待。

```cpp
virtual bool System::Threading::Mutex::WaitOne() override
```


### ReturnValue

始终返回 true，因为在互斥体被锁定之前不会返回。

## 另见

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Mutex::WaitOne(int) method


锁定互斥体。如有必要，执行等待。

```cpp
virtual bool System::Threading::Mutex::WaitOne(int millisecondsTimeout) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| millisecondsTimeout | int | 以毫秒为单位的等待超时。 |

### ReturnValue

如果互斥体已被锁定则返回 true，超时则返回 false。

## 另见

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Mutex::WaitOne(TimeSpan) method


锁定互斥体。如有必要，执行等待。

```cpp
virtual bool System::Threading::Mutex::WaitOne(TimeSpan timeout) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| timeout | TimeSpan | 一个 [System::TimeSpan](../../../system/timespan/)，表示要等待的毫秒数，或一个 [System::TimeSpan](../../../system/timespan/)，表示 -1 毫秒以无限期等待。 |

### ReturnValue

如果互斥体已被锁定则返回 true，超时则返回 false。

## 另见

* Class [TimeSpan](../../../system/timespan/)
* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
