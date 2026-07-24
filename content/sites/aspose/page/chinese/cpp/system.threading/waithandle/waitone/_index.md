---
title: "System::Threading::WaitHandle::WaitOne method"
linktitle: "WaitOne"
second_title: "Aspose.Page 适用于 C++"
description: "System::Threading::WaitHandle::WaitOne method. 在 C++ 中等待句柄无限期触发。"
type: docs
weight: 600
url: /zh/cpp/system.threading/waithandle/waitone/
---
## WaitHandle::WaitOne() method


等待句柄触发，期限无限。

```cpp
virtual bool System::Threading::WaitHandle::WaitOne()
```


### ReturnValue

始终返回 true，因为没有超时发生。

## 另见

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(int) method


等待句柄触发。

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) 要等待的时间，以毫秒为单位；-1 表示无限等待，0 表示检查后返回，正值表示超时。 |

### ReturnValue

句柄触发时为 True，超时则为 false。

## 另见

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(int, bool) method


等待句柄触发。

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout, bool exitContext)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) 要等待的时间，以毫秒为单位；-1 表示无限等待，0 表示检查后返回，正值表示超时。 |
| exitContext | bool | 如果为 true，等待时应在等待句柄之前释放对句柄的锁。 |

### ReturnValue

句柄触发时为 True，超时则为 false。

## 另见

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(TimeSpan) method


等待句柄触发。

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(TimeSpan timeout)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| timeout | TimeSpan | 一个表示等待毫秒数的 [System::TimeSpan](../../../system/timespan/)，或者一个表示 -1 毫秒（无限等待）的 [System::TimeSpan](../../../system/timespan/)。 |

### ReturnValue

句柄触发时为 True，超时则为 false。

## 另见

* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
