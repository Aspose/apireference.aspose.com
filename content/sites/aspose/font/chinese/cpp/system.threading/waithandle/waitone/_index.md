---
title: "System::Threading::WaitHandle::WaitOne method"
linktitle: "WaitOne"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::WaitHandle::WaitOne method. 在 C++ 中等待句柄触发，等待时间无限。"
type: docs
weight: 600
url: /zh/cpp/system.threading/waithandle/waitone/
---
## WaitHandle::WaitOne() method


等待句柄在无限时间内触发。

```cpp
virtual bool System::Threading::WaitHandle::WaitOne()
```


### ReturnValue

始终返回 true，因为不会发生超时。

## 另见

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitOne(int) method


等待句柄触发。

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) 用于等待的时间，以毫秒为单位；-1 表示无限等待，0 表示检查后返回，正值表示超时。 |

### ReturnValue

如果句柄已触发则为 True，超时则为 false。

## 另见

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitOne(int, bool) method


等待句柄触发。

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout, bool exitContext)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) 用于等待的时间，以毫秒为单位；-1 表示无限等待，0 表示检查后返回，正值表示超时。 |
| exitContext | bool | 如果为 true，等待时应在等待之前释放句柄上的锁。 |

### ReturnValue

如果句柄已触发则为 True，超时则为 false。

## 另见

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitOne(TimeSpan) method


等待句柄触发。

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(TimeSpan timeout)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| timeout | TimeSpan | 一个 [System::TimeSpan](../../../system/timespan/)，表示要等待的毫秒数，或一个 [System::TimeSpan](../../../system/timespan/)，表示 -1 毫秒以无限期等待。 |

### ReturnValue

如果句柄已触发则为 True，超时则为 false。

## 另见

* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
