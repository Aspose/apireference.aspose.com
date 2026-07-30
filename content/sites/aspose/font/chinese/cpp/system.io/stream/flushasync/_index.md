---
title: "System::IO::Stream::FlushAsync 方法"
linktitle: "FlushAsync"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::Stream::FlushAsync 方法。异步清除此流的所有缓冲区，使任何缓冲数据写入底层设备，并监视 C++ 中的取消请求。"
type: docs
weight: 900
url: /zh/cpp/system.io/stream/flushasync/
---
## Stream::FlushAsync() method


异步清除此流的所有缓冲区，使任何缓冲的数据写入底层设备，并监视取消请求。

```cpp
TaskPtr System::IO::Stream::FlushAsync()
```


### ReturnValue

表示异步刷新操作的任务。

## 另见

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::FlushAsync(const Threading::CancellationToken\&) method


异步清除此流的所有缓冲区，使任何缓冲的数据写入底层设备，并监视取消请求。

```cpp
virtual TaskPtr System::IO::Stream::FlushAsync(const Threading::CancellationToken &cancellationToken)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\& | 用于监视取消请求的令牌。 |

### ReturnValue

表示异步刷新操作的任务。

## 另见

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
