---
title: "System::Threading::WaitHandle::WaitAny 方法"
linktitle: "WaitAny"
second_title: "Aspose.Page 适用于 C++"
description: "System::Threading::WaitHandle::WaitAny 方法。等待任意一个句柄在 C++ 中触发。"
type: docs
weight: 200
url: /zh/cpp/system.threading/waithandle/waitany/
---
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) method


等待任意句柄触发。

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | 要等待的句柄。 |

### ReturnValue

当 waitHandles 中的每个元素都已收到信号时为 True；否则该方法永不返回。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) method


等待任意句柄触发。

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, int millisecondsTimeout)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | 要等待的句柄。 |
| millisecondsTimeout | int | [Timeout](../../timeout/) 要等待的时间，以毫秒为单位；-1 表示无限等待，0 表示检查后返回，正值表示超时。 |

### ReturnValue

如果有句柄触发则为 true，超时则为 false。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) method


等待任意句柄触发。

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, TimeSpan timeout)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | 要等待的句柄。 |
| timeout | TimeSpan | 一个表示等待毫秒数的 [System::TimeSpan](../../../system/timespan/)，或者一个表示 -1 毫秒（无限等待）的 [System::TimeSpan](../../../system/timespan/)。 |

### ReturnValue

如果有句柄触发则为 true，超时则为 false。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
