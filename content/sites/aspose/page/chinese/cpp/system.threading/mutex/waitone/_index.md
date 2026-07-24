---
title: "System::Threading::Mutex::WaitOne 方法"
linktitle: "WaitOne"
second_title: "Aspose.Page 适用于 C++"
description: "System::Threading::Mutex::WaitOne 方法。锁定互斥体。如果在 C++ 中有必要，执行无限等待。"
type: docs
weight: 500
url: /zh/cpp/system.threading/mutex/waitone/
---
## Mutex::WaitOne() method


锁定互斥体。如果需要，执行无限等待。

```cpp
virtual bool System::Threading::Mutex::WaitOne() override
```


### ReturnValue

始终返回 true，因为它在互斥体被锁定之前不会返回。

## 另见

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Mutex::WaitOne(int) method


锁定互斥体。如果需要，执行等待。

```cpp
virtual bool System::Threading::Mutex::WaitOne(int millisecondsTimeout) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| millisecondsTimeout | int | 以毫秒为单位的等待超时时间。 |

### ReturnValue

如果互斥体已被锁定则返回 true，超时则返回 false。

## 另见

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Mutex::WaitOne(TimeSpan) method


锁定互斥体。如果需要，执行等待。

```cpp
virtual bool System::Threading::Mutex::WaitOne(TimeSpan timeout) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| timeout | TimeSpan | 一个表示等待毫秒数的 [System::TimeSpan](../../../system/timespan/)，或者一个表示 -1 毫秒（无限等待）的 [System::TimeSpan](../../../system/timespan/)。 |

### ReturnValue

如果互斥体已被锁定则返回 true，超时则返回 false。

## 另见

* Class [TimeSpan](../../../system/timespan/)
* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
