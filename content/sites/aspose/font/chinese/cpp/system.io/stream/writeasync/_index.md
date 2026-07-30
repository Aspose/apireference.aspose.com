---
title: "System::IO::Stream::WriteAsync 方法"
linktitle: "WriteAsync"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::Stream::WriteAsync 方法。以异步方式将字节序列写入当前流，按写入的字节数前移此流中的当前位置，并在 C++ 中监视取消请求。"
type: docs
weight: 2700
url: /zh/cpp/system.io/stream/writeasync/
---
## Stream::WriteAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


异步将一系列字节写入当前流，按写入的字节数前进此流中的当前位置，并监视取消请求。

```cpp
TaskPtr System::IO::Stream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | 包含要写入字节的数组。 |
| offset | int32_t | 在 **buffer** 中子范围写入开始处的 0 基索引。 |
| count | int32_t | 要写入的子范围中元素的数量。 |

### ReturnValue

表示异步写入操作的任务。

## 另见

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::WriteAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) method


异步将一系列字节写入当前流，按写入的字节数前进此流中的当前位置，并监视取消请求。

```cpp
virtual TaskPtr System::IO::Stream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | 包含要写入字节的数组。 |
| offset | int32_t | 在 **buffer** 中子范围写入开始处的 0 基索引。 |
| count | int32_t | 要写入的子范围中元素的数量。 |
| cancellationToken | const Threading::CancellationToken\& | 用于监视取消请求的令牌。 |

### ReturnValue

表示异步写入操作的任务。

## 另见

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
