---
title: "System::Threading::WaitHandle::WaitAny method"
linktitle: "WaitAny"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::WaitHandle::WaitAny method. 在 C++ 中等待任意一个句柄触发。"
type: docs
weight: 200
url: /zh/cpp/system.threading/waithandle/waitany/
---
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) method


等待任意一个句柄触发。

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | 要等待的句柄。 |

### ReturnValue

当 waitHandles 中的每个元素都收到信号时返回 True；否则该方法永不返回。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) method


等待任意一个句柄触发。

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, int millisecondsTimeout)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | 要等待的句柄。 |
| millisecondsTimeout | int | [Timeout](../../timeout/) 用于等待的时间，以毫秒为单位；-1 表示无限等待，0 表示检查后返回，正值表示超时。 |

### ReturnValue

如果任意句柄已触发则为 True，超时则为 false。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) method


等待任意一个句柄触发。

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, TimeSpan timeout)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | 要等待的句柄。 |
| timeout | TimeSpan | 一个 [System::TimeSpan](../../../system/timespan/)，表示要等待的毫秒数，或一个 [System::TimeSpan](../../../system/timespan/)，表示 -1 毫秒以无限期等待。 |

### ReturnValue

如果任意句柄已触发则为 True，超时则为 false。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
