---
title: "System::IO::Stream::ReadAsync 方法"
linktitle: "ReadAsync"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::Stream::ReadAsync 方法。以异步方式从当前流读取字节序列，按读取的字节数前移流中的位置，并在 C++ 中监视取消请求。"
type: docs
weight: 1900
url: /zh/cpp/system.io/stream/readasync/
---
## Stream::ReadAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


异步从当前流读取一系列字节，按读取的字节数前进流中的位置，并监视取消请求。

```cpp
RTaskPtr<int32_t> System::IO::Stream::ReadAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 缓冲区 | const ArrayPtr\<uint8_t\>\& | 用于写入读取字节的字节数组。 |
| offset | int32_t | 在 **buffer** 中的基于 0 的起始写入位置。 |
| count | int32_t | 要读取的字节数。 |

### ReturnValue

表示异步读取操作的任务。TResult 参数的值包含读取到缓冲区的字节总数。如果当前可用的字节数少于请求的字节数，则结果值可能小于请求的字节数；如果已到达流的末尾，则结果值可能为 0（零）。

## 另见

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::ReadAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) method


异步从当前流读取一系列字节，按读取的字节数前进流中的位置，并监视取消请求。

```cpp
virtual RTaskPtr<int32_t> System::IO::Stream::ReadAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 缓冲区 | const ArrayPtr\<uint8_t\>\& | 用于写入读取字节的字节数组。 |
| offset | int32_t | 在 **buffer** 中的基于 0 的起始写入位置。 |
| count | int32_t | 要读取的字节数。 |
| cancellationToken | const Threading::CancellationToken\& | 用于监视取消请求的令牌。 |

### ReturnValue

表示异步读取操作的任务。TResult 参数的值包含读取到缓冲区的字节总数。如果当前可用的字节数少于请求的字节数，则结果值可能小于请求的字节数；如果已到达流的末尾，则结果值可能为 0（零）。

## 另见

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
